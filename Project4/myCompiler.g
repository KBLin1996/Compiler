grammar myCompiler;

options {
    language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    boolean TRACEON = false;
    HashMap<String,Integer> symbolTable = new HashMap<String,Integer>();
    HashMap<Integer,String> reg_map = new HashMap<Integer,String>();

    /*
    public enum typeInfo{
        Short,
        Integer,
        Long,
        Float,
        Double,
        Char,
        Void,
        Error
    }
    */

    int attr_type;

    /*
    attr_type:
        2   =>  integer,
        4   =>  float,
        7   =>  char,
        8   =>  void,
        -1  =>  do not exist,
        -2  =>  error
     */

    int labelCount = 0;

    List<String> DataCode = new ArrayList<String>();
    List<String> TextCode = new ArrayList<String>();

    public static register reg = new register(0, 9);

    /*
     * Output prologue.
     */
    void prologue(String id)
    {
       TextCode.add("\n\n/* Text section */");
       TextCode.add("\t.section .text");
       TextCode.add("\t.global " + id);
       TextCode.add("\t.type " + id + ",@function");
       TextCode.add(id + ":");

       /* Follow x86 calling convention */
       TextCode.add("\t pushq \%rbp");
       TextCode.add("\t movq \%rsp,\%rbp");
       TextCode.add("\t pushq \%rbx"); //callee saved registers.
       TextCode.add("\t pushq \%r12"); //callee saved registers.
       TextCode.add("\t pushq \%r13"); //callee saved registers.
       TextCode.add("\t pushq \%r14"); //callee saved registers.
       TextCode.add("\t pushq \%r15"); //callee saved registers.
       TextCode.add("\t subq $8,\%rsp\n"); // aligned 16-byte boundary.
    }

    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */

       /* Follow x86 calling convention */
       TextCode.add("\n\t addq $8,\%rsp");
       TextCode.add("\t popq \%r15");
       TextCode.add("\t popq \%r14");
       TextCode.add("\t popq \%r13");
       TextCode.add("\t popq \%r12");
       TextCode.add("\t popq \%rbx");
       TextCode.add("\t popq \%rbp");
       TextCode.add("\t ret");
    }

    /* Generate a new label */
    String newLabel()
    {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    }


    public List<String> getDataCode()
    {
       return DataCode;
    }

    public List<String> getTextCode()
    {
       return TextCode;
    }
}


program:
    {
        reg_map.put(0,"r14d");
        reg_map.put(1,"ebx");
        reg_map.put(2,"ecx");
        reg_map.put(3,"r15d");
        reg_map.put(4,"r8d");
        reg_map.put(5,"r9d");
        reg_map.put(6,"r10d");
        reg_map.put(7,"r11d");
        reg_map.put(8,"r12d");
        reg_map.put(9,"r13d");
    }
     declarations functions
    ;


functions
    : function functions
    |
    ;

function
    :   type ID '(' SR_BRACKET
        BL_PARENTHESES
            {
                /* output function prologue */
                prologue($ID.text);
            }
            l_declarations statements
        BR_PARENTHESES

            {
                /* output function epilogue */
                epilogue();
            }
	;


/* global declaraction */
declarations
    : type ID SEMICOLON declarations
      {
		/* code generation */

        switch($type.attr_type)
        {
		    case 1:
                /* Type: short, size=> 2 bytes, alignment=> 2 byte boundary. */
		        DataCode.add("\t .common " + $ID.text + ",2,2");
				break;
            case 2:
                /* Type: ineteger, size=> 4 bytes, alignment=> 4 byte boundary. */
		        DataCode.add("\t .common " + $ID.text + ",4,4");
				break;
            case 3:
                /* Type: long long, size=> 8 bytes, alignment=> 8 byte boundary. */
		        DataCode.add("\t .common " + $ID.text + ",8,8");
				break;

            case 4:
                /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
		        DataCode.add("\t .common " + $ID.text + ",4,4");
				break;
		    default:
		}
	  }
    |
    ;


l_declarations
    :
    type ID ';' l_declarations
    {
        /* Not implement local variable*/
    }
    |
    ;


type returns [int attr_type]
    :   SHORT_TYPE      { if (TRACEON) System.out.println("type: SHORT") ; $attr_type = 1;}
    |   INT_TYPE        { if (TRACEON) System.out.println("type: INT") ; $attr_type = 2;}
    |   LONG_TYPE       { if (TRACEON) System.out.println("type: LONG") ; $attr_type = 3;}
    |   FLOAT_TYPE      { if (TRACEON) System.out.println("type: FLOAT") ; $attr_type = 4;}
    |   DOUBLE_TYPE     { if (TRACEON) System.out.println("type: DOUBLE") ; $attr_type = 5;}
    |   LONGLONG_TYPE   { if (TRACEON) System.out.println("type: LONGLONG") ; $attr_type = 6;}
    |   CHAR_TYPE       { if (TRACEON) System.out.println("type: CHAR") ; $attr_type = 7;}
    |   VOID_TYPE       { if (TRACEON) System.out.println("type: VOID") ; $attr_type = 8;}
;

statements: statement statements
    |
    ;

statement returns [int attr_type]
    :   ID GIVEN_OP a = expr SEMICOLON
        {
            TextCode.add("\t movl " + "\%" + reg_map.get($a.reg_num) + "," + $ID.text + "(\%rip)");
        }
    |   IF SL_BRACKET WS* b = primaryExpr WS* d = comparison WS* c = primaryExpr WS* SR_BRACKET
        {
            String label = newLabel();
            TextCode.add("\t cmpl " + "\%" + reg_map.get($b.reg_num) + ", \%" + reg_map.get($c.reg_num));
            
            if($d.symbol == 1)
			{
				TextCode.add("\t jg " + label);
			}
			if($d.symbol == 2)
			{
				TextCode.add("\t jl " + label);
			}
			if($d.symbol == 3)
			{
				TextCode.add("\t je " + label);
			}
        }
        ifthenstat
        {
            TextCode.add(label + ":");
        }
    |   output
    ;

expr returns [int attr_type, int reg_num, String str]
	:   a = multiply
        {
            $attr_type = $a.attr_type;
            $reg_num = $a.reg_num;
            $str = $a.str;
        }
        (
            PLUS_OP b = multiply
            {   TextCode.add("\t addl " + "\%" + reg_map.get($b.reg_num) + ", \%" + reg_map.get($reg_num));     }
    |       SUB_OP c = multiply
            {   TextCode.add("\t subl " + "\%" + reg_map.get($c.reg_num) + ", \%" + reg_map.get($reg_num));     }
	    )*
	;


multiply returns [int attr_type, int reg_num, String str]
    :   a = signed
        {
            $attr_type = $a.attr_type;
            $reg_num = $a.reg_num;
            $str = $a.str;
        }
        (
            MUL_OP b = signed
            {
                TextCode.add("\t imul " + "\%" + reg_map.get($b.reg_num) + ", \%" + reg_map.get($a.reg_num));
            }
    |       DIV_OP c = signed
            {
                TextCode.add("\t movl " + "\%" + reg_map.get($a.reg_num) + ", \%eax");
                TextCode.add("\t movl " + "$0" + ", \%edx");
                TextCode.add("\t idivl " + "\%" + reg_map.get($c.reg_num));
                TextCode.add("\t movl "  + "\%eax" + ", \%" + reg_map.get($a.reg_num));
            }
	    )*
	;


signed returns [int attr_type, int reg_num, String str]
	:   primaryExpr
        {
            $attr_type = $primaryExpr.attr_type;
            $reg_num = $primaryExpr.reg_num;
            $str = $primaryExpr.str;
        }
	|   SUB_OP primaryExpr
	    {
            TextCode.add("\t negl " + "\%" + reg_map.get($primaryExpr.reg_num));
            $attr_type = $primaryExpr.attr_type;
            $reg_num = $primaryExpr.reg_num;
            $str = $primaryExpr.str;
	    }
	;


primaryExpr returns [int attr_type, int reg_num, String str]
    :
        DEC_NUM
        {
            $attr_type = 2;
            $str = null;
            $reg_num = reg.get();  /* get an register */
            TextCode.add("\t movl " + "\$" + $DEC_NUM.text + ", \%" + reg_map.get($reg_num));
        }
    |   FLOAT_NUM
        {
            $attr_type = 4;
            $str = null;
            $reg_num = reg.get();
            TextCode.add("\t movl " + "\$" + $FLOAT_NUM.text + ", \%" + reg_map.get($reg_num));
        }
    |   STRING { $attr_type = 9; $str = $STRING.text; }
    |   ID
        {
            if(symbolTable.containsKey($ID.text))
            {
                $attr_type = symbolTable.get($ID.text);
            }
            else
            {
                //System.out.println("Type Error on Line : " + $ID.getLine() + " : Unknown Idenifier " + $ID.text + ".");
                $attr_type = -1;
            }
            $str = null;
            $reg_num = reg.get(); /* get an register */
            TextCode.add("\t movl " + $ID.text + "(\%rip), \%" + reg_map.get($reg_num));
        }
	  | '(' expr ')' { $attr_type = $expr.attr_type; }
    ;


ifthenstat
	:   statement
	|   '{' statements '}'
	;

output
    :
 	PRINT SL_BRACKET a=STRING ',' b=ID ',' c=ID ',' d=ID SR_BRACKET ';'
    {
        String label = newLabel();
        DataCode.add(label + ":");
        DataCode.add("\t .string " + $a.text);
        TextCode.add("\t movl " + $b.text + "(\%rip), " + "\%esi");
        TextCode.add("\t movl " + $c.text + "(\%rip), " + "\%edx");
        TextCode.add("\t movl " + $d.text + "(\%rip), " + "\%ecx");
        TextCode.add("\t movl " + "$" + label + ", " + "\%edi");
        TextCode.add("\t call printf");
    }
    | PRINT SL_BRACKET a=STRING ',' b=ID ',' c=ID SR_BRACKET ';'
    {
        String label = newLabel();
        DataCode.add(label + ":");
        DataCode.add("\t .string " + $a.text);
        TextCode.add("\t movl " + $b.text + "(\%rip), " + "\%esi");
        TextCode.add("\t movl " + $c.text + "(\%rip), " + "\%edx");
        TextCode.add("\t movl " + "$" + label + ", " + "\%edi");
        TextCode.add("\t call printf");
    }
	| PRINT SL_BRACKET a=STRING ',' ID SR_BRACKET ';'
    {
        String label = newLabel();
        DataCode.add(label + ":");
        DataCode.add("\t .string " + $a.text);
        TextCode.add("\t movl " + $ID.text + "(\%rip), " + "\%esi");
        TextCode.add("\t movl " + "$" + label + ", " + "\%edi");
        TextCode.add("\t call printf");
    }
    | PRINT SL_BRACKET b=STRING SR_BRACKET ';'
    {
        String label = newLabel();
        DataCode.add(label + ":");
        DataCode.add("\t .string " + $b.text);
        TextCode.add("\t movl " + "$" + label + ", " + "\%edi");
        TextCode.add("\t call printf");
    }
    ;

comparison returns [int symbol]: BIGGER_OP {$symbol = 1;if (TRACEON) System.out.println("comparison: operand > operand");}
        | SMALLER_OP {$symbol = 2;if (TRACEON) System.out.println("comparison: operand < operand");}
        | EQ_OP {$symbol = 3;if (TRACEON) System.out.println("comparison: operand == operand");}
        ;
/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

GIVEN_OP   : '=';
BIGGER_OP  : '>';
SMALLER_OP : '<';
EQ_OP      : '==';
PE_OP      : '+=';
SE_OP      : '-=';
ME_OP      : '*=';
DE_OP      : '/=';
LE_OP      : '<=';
GE_OP      : '>=';
NE_OP      : '!=';
PLUS_OP    : '+';
SUB_OP     : '-';
DIV_OP     : '/';
MUL_OP     : '*';
PLUSONE_OP : '++';
SUBONE_OP  : '--';
RSHIFT_OP  : '<<';
LSHIFT_OP  : '>>';

/*----------------------------------------------*/
/*       special characters / punctuations      */
/*----------------------------------------------*/

SL_BRACKET : '(';
SR_BRACKET : ')';
L_BRACKET : '[';
R_BRACKET : ']';
BL_PARENTHESES : '{';
BR_PARENTHESES : '}';
COMMA : ',';
SEMICOLON : ';';
COLON : ':';
SHORT_TYPE      :   'short';
INT_TYPE        :   'int';
LONG_TYPE       :   'long';
FLOAT_TYPE      :   'float';
DOUBLE_TYPE     :   'double';
LONGLONG_TYPE   :   'long long';
CHAR_TYPE       :   'char';
VOID_TYPE       :   'void';
WHILE      :   'while';
FOR        :   'for';
IF         :   'if';
ELSE       :   'else';
RETURN     :   'return';
BREAK      :   'break';
CONTINUE   :   'continue';
INCLUDE     :   '#include';
DEFINE      :   '#define';
PRINT       :   'printf';

/*----------------------*/
/*     Id && NUMBER     */
/*----------------------*/

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


/*-------------------*/
/*      Function     */
/*-------------------*/
FUNCTION_CALL : (ID)(SL_BRACKET);

/*------------------*/
/*      Array       */
/*------------------*/
ARRAY : (ID)(L_BRACKET);


/*-----------------------------*/
/*      Characters & String    */
/*-----------------------------*/
CHAR    : '\''(LETTER)'\'';
STRING
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

/*-------------------*/
/*      Comments     */
/*-------------------*/
COMMENT1 : '//'(.)*'\n' {$channel=HIDDEN;};
COMMENT2 : '/*'(.)*'*/' {$channel=HIDDEN;};

WS  : (' ' | '\r' | '\t' | '\n')+ {$channel=HIDDEN;}
    ;

PREPROCESSOR : '#'(.)*'\n'{$channel=HIDDEN;};
