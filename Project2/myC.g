grammar myC;

@header {
// import packages here.
}

@members {
boolean TRACEON = false;
}

start: (INCLUDE WS* (OWN_FILE | LIB_FILE) NEWLINE)*;

program: type WS* MAIN SL_BRACKET SR_BRACKET NEWLINE* BL_PARENTHESES WS* declarations statements RETURN WS* (INT_NUM | FLOAT_NUM) SEMICOLON NEWLINE* BR_PARENTHESES WS*
        {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");};

declarations:type WS* ID WS* GIVEN_OP WS* primaryExpr SEMICOLON WS* declarations
             { if (TRACEON) System.out.println("declarations: type Identifier : declarations");}
	       | { if (TRACEON) System.out.println("declarations: ");};

type:INT { if (TRACEON) System.out.println("type: INT"); }
    | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
    | CHAR {if (TRACEON) System.out.println("type: CHAR");}
    | LONG {if (TRACEON) System.out.println("type: LONG");}
    | SHORT {if (TRACEON) System.out.println("type: SHORT");}
    | DOUBLE {if (TRACEON) System.out.println("type: DOUBLE");}
    | VOID {if (TRACEON) System.out.println("type: VOID");};


statements:statement WS* statements
        |;

arith_expression: multExpr
                  ( PLUS_OP WS* multExpr
				  | SUB_OP WS* multExpr
				  )*
                  ;

multExpr: signExpr WS*
          ( MUL_OP WS* signExpr
          | DIV_OP WS* signExpr
		  )*
		  ;

signExpr: primaryExpr
        | SUB_OP primaryExpr
		;

primaryExpr: INT_NUM
           | FLOAT_NUM
           | ID
		   | SL_BRACKET arith_expression SR_BRACKET
           ;

statement: ID WS* GIVEN_OP WS* arith_expression SEMICOLON
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


if_then_statements: BL_PARENTHESES WS* statements BR_PARENTHESES (WS* ELIF SL_BRACKET WS* primaryExpr WS* comparison WS* SR_BRACKET WS* BL_PARENTHESES WS* statements BR_PARENTHESES)* (WS* ELSE WS* BL_PARENTHESES WS* statements BR_PARENTHESES)*
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
