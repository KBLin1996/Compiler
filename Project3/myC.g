grammar myC;

@header {
    // import packages here.
    import java.util.HashMap;
}

@members {
    boolean TRACEON = false;
    HashMap<String,Integer> symtab = new HashMap<String,Integer>();

    /*
       public enum TypeInfo {
       Integer,
       Float,
       char,
       double,
       long,
       short,
       void,
       No_Exist,
       Error
       }
     */

    /* 
attr_type:
1 => integer,
2 => float,
3 => char,
4 => double,
5 => long,
6 => short,
7 => void,
-1 => do not exist,
-2 => error
     */
}

start: (INCLUDE WS* (OWN_FILE | LIB_FILE) NEWLINE)* {if (TRACEON) System.out.println("start: #include <>");};

program: type WS* MAIN SL_BRACKET SR_BRACKET NEWLINE* BL_PARENTHESES WS* declarations statements RETURN WS* (INT_NUM | FLOAT_NUM) SEMICOLON NEWLINE* BR_PARENTHESES WS*
{if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");};

declarations:type WS* ID WS* GIVEN_OP WS* primaryExpr SEMICOLON WS* declarations
{if (TRACEON) System.out.println("declarations: type Identifier : declarations");}
{
    if(symtab.containsKey($ID.text))
    {
        System.out.println("Type Error: " + $ID.getLine() + ": Redeclared identifier.");
    }

    else
    {
        /* Add ID and its attr_type into the symbol table. */
        symtab.put($ID.text, $type.attr_type);	   
    }
}

| { if (TRACEON) System.out.println("declarations: ");};

type returns [int attr_type]:
INT { if (TRACEON) System.out.println("type: INT"); }
{$attr_type = 1;}
| FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
{$attr_type = 2;}
| CHAR {if (TRACEON) System.out.println("type: CHAR");}
{$attr_type = 3;}
| LONG {if (TRACEON) System.out.println("type: LONG");}
{$attr_type = 5;}
| SHORT {if (TRACEON) System.out.println("type: SHORT");}
{$attr_type = 6;}
| DOUBLE {if (TRACEON) System.out.println("type: DOUBLE");}
{$attr_type = 4;}
| VOID {if (TRACEON) System.out.println("type: VOID");}
{$attr_type = 7;};


statements:statement WS* statements
|;

arith_expression returns [int attr_type]:
a = multExpr {$attr_type = $a.attr_type;}

(PLUS_OP WS* b = multExpr
{ 
    if($a.attr_type != $b.attr_type)
    {
        System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator + in an expression.");
        $attr_type = -2;
    }

    else
    {
        $attr_type = $a.attr_type;
    }
}

 | SUB_OP WS* c = multExpr
 {
    if($a.attr_type != $c.attr_type)
    {
        System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator - in an expression.");
        $attr_type = -2;
    }

    else
    {
        $attr_type = $a.attr_type;
    }
 })*;

multExpr returns [int attr_type]:
a = signExpr {$attr_type = $a.attr_type;} WS*

( MUL_OP WS* b = signExpr
{
    if($a.attr_type != $b.attr_type)
    {
        System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator * in an expression.");
        $attr_type = -2;
    }

    else
    {
        $attr_type = $a.attr_type;
    }
}

  | DIV_OP WS* c = signExpr
  {
    if($a.attr_type != $c.attr_type)
    {
        System.out.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator / in an expression.");
        $attr_type = -2;
    }

    else
    {
        $attr_type = $a.attr_type;
    }

  })*;

signExpr returns [int attr_type]:
primaryExpr {$attr_type = $primaryExpr.attr_type;}
| SUB_OP b = primaryExpr {$attr_type = $primaryExpr.attr_type;}
;

primaryExpr returns [int attr_type]:
INT_NUM
{
    $attr_type = 1;
}
| FLOAT_NUM
{
    $attr_type = 2;
}
|ID  {if (TRACEON) System.out.println("primaryExpr: ID");}
{
    if(symtab.containsKey($ID.text))
    {
        $attr_type = symtab.get($ID.text);
    }

    else
    {
        /* Add codes to report and handle this error */
        System.out.println("Type Error: " + $primaryExpr.start.getLine() + ": Variable must be declared before it is used.");
        $attr_type = -1;
    }
}

| SL_BRACKET arith_expression SR_BRACKET  {if (TRACEON) System.out.println("primaryExpr: ( arith_expression )");}
{
    $attr_type = $arith_expression.attr_type;
}
;

statement returns [int attr_type]:
ID WS* GIVEN_OP WS* arith_expression SEMICOLON {if (TRACEON) System.out.println("statement: id = arith_expression;");}
{
    if(symtab.containsKey($ID.text))
    {
        $attr_type = symtab.get($ID.text);
    }

    else
    {
        /* Add codes to report and handle this error */
        System.out.println("Type Error: " + $arith_expression.start.getLine() + ": Variable must be declared before it is used.");
        $attr_type = -1;
    }

    if($attr_type != $arith_expression.attr_type)
    {
        System.out.println("Type Error: " + $arith_expression.start.getLine() + ": Type mismatch for the two silde operands in an assignment statement.");
        $attr_type = -2;
    }
}

| IF SL_BRACKET WS* primaryExpr WS* comparison WS* SR_BRACKET WS* if_then_statements
| COMMENT2 {if (TRACEON) System.out.println("statement: COMMENT2 (Ex: /* COMMENT HERE */ )");}
| COMMENT3 {if (TRACEON) System.out.println("statement: COMMENT3 (Ex: // COMMENT HERE )");}
| PRINTF SL_BRACKET COMMENT1 parameter SR_BRACKET SEMICOLON{if (TRACEON) System.out.println("statement: printf( OUTPUT )");}
| FOR SL_BRACKET limit SR_BRACKET WS* loop {if (TRACEON) System.out.println("statement: for(limit) loop");}
| WHILE SL_BRACKET primaryExpr comparison SR_BRACKET WS* loop{if (TRACEON) System.out.println("statement: while(comparison) loop");}
;

parameter: (COMMA ID)+
| ;

limit: ID WS* GIVEN_OP WS* primaryExpr WS* SEMICOLON WS* primaryExpr WS* comparison WS* SEMICOLON WS* increment {if (TRACEON) System.out.println("limit: Ex: a=0;a<5;a++");};

comparison: BIGGER_OP WS* primaryExpr {if (TRACEON) System.out.println("comparison: operand > operand");}
| SMALLER_OP WS* primaryExpr {if (TRACEON) System.out.println("comparison: operand < operand");}
| EQ_OP WS* primaryExpr {if (TRACEON) System.out.println("comparison: operand == operand");}
| NE_OP WS* primaryExpr {if (TRACEON) System.out.println("comparison: operand != operand");}
| LE_OP WS* primaryExpr {if (TRACEON) System.out.println("comparison: operand <= operand");}
| GE_OP WS* primaryExpr {if (TRACEON) System.out.println("comparison: operand >= operand");}
;

loop: statement {if (TRACEON) System.out.println("loop: statement");}
| BL_PARENTHESES WS* statements BR_PARENTHESES {if (TRACEON) System.out.println("loop: {statements}");}
;

increment: ID PLUSONE_OP{if (TRACEON) System.out.println("increment: ID++");}
| ID SUBONE_OP{if (TRACEON) System.out.println("increment: ID--");}
;

if_then_statements: BL_PARENTHESES WS* statements BR_PARENTHESES {if (TRACEON) System.out.println("if_state: if{statements}");} (WS* ELIF SL_BRACKET WS* primaryExpr WS* comparison WS* SR_BRACKET WS* BL_PARENTHESES WS* statements BR_PARENTHESES)* {if (TRACEON) System.out.println("elif_state: if{statements}");} (WS* ELSE WS* BL_PARENTHESES WS* statements BR_PARENTHESES)*
{if (TRACEON) System.out.println("else_state: else{statements}");}; 

/* description of the tokens */

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/


INT            : 'int';
CHAR           : 'char';
VOID           : 'void';
FLOAT          : 'float';
LONG           : 'long';
SHORT          : 'short';
DOUBLE         : 'double';
MAIN           : 'main';
PRINTF         : 'printf';
WHILE          : 'while';
FOR            : 'for';
IF             : 'if';
ELIF		   : 'else if';
ELSE           : 'else';
BREAK          : 'break';
CONTINUE       : 'continue';
RETURN         : 'return';
INCLUDE        : '#include' (' ' | '\t')+;
OWN_FILE       : '"' ID+ '.h"';
LIB_FILE       : '<' ID+ '.h>';
DEFINE         : '#define';
SL_BRACKET     : '(';
SR_BRACKET     : ')';
BL_PARENTHESES : '{';
BR_PARENTHESES : '}';
SEMICOLON      : ';';
COMMA          : ',';
COLON          : ':';
QUESTION       : '?';
POINTER        : '*' (ID+ | '*');
NEWLINE		   : '\n';

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

/*----------------------*/
/*     Id && NUMBER     */
/*----------------------*/

INT_NUM : ('0' | ('1'..'9')(DIGIT)*);
ID : (LETTER)(LETTER | DIGIT)*;
FLOAT_NUM: (FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3);

fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;

/*----------------------*/
/*       Comments       */
/*----------------------*/

COMMENT1 : '"' (~('"'))* '"';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/' {$channel=HIDDEN;};
COMMENT3 : '//' (.)* '\n';
NEW_LINE : ('\r' ? '\n');

fragment LETTER : ('a'..'z' | 'A'..'Z' | '_');
fragment DIGIT  : '0'..'9';

WS  : (' ' | '\r' | '\t' | '\n')+;
