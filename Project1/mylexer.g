lexer grammar mylexer;

options
{
      language = Java;
}

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
WHILE          : 'while';
FOR            : 'for';
IF             : 'if';
ELIF           : 'else if';
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
fragment TYPE   : ('char' | 'int' | 'short' | 'double' | 'long' | 'float' | 'void');

WS  : (' ' | '\r' | '\t')+;
