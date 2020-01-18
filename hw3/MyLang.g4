grammar MyLang;
//tokens
WS: [ \t\n\r\b]+ -> skip;
EQ: '==';
NON_EQ: '!=';
LOWER_EQ: '<=';
GREATER_EQ: '>=';
TRUE: 'true';
FALSE: 'false';
INT: 'int';
DOUBLE: 'double';
FLOAT: 'float';
STRING: 'string';
LONG: 'long';
CHAR: 'char';
BOOL: 'bool';
VOID: 'void';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
DEF: 'def';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: 'mod';
OR: 'or';
AND: 'and';
NOT: 'not';
LOWER: '<';
GREATER: '>';
ASSIGN: ':=';
R_PAR: ')';
L_PAR: '(';
L_BRACE: '{';
R_BRACE: '}';
R_BRACK: ']';
FOR: 'for';
WHILE: 'while';
L_BRACK: '[';
SEMICOLON: ';';
COLON: ':';
STRING_: '"' [a-zA-Z_0-9]+ '"';
ID: [a-zA-Z_]+;
NUM: [0-9]+;
COMMA: ',';

//rules
main: code EOF;

code
    : global_statement code
    |;

global_statement
    : var_decl SEMICOLON
    | var_def SEMICOLON
    | function
    | function_call;

var_decl: ID COLON type_;

var_def: ID COLON type_ ASSIGN exp;

function:
   DEF ID L_PAR function_args R_PAR COLON returned_type L_BRACE
   body R_BRACE;

function_args
	: ID COLON type_ function_args_
    |;

function_args_
    : COMMA ID COLON type_
    |;

body
    : local_statement body
    |;

local_statement
    : var_decl SEMICOLON
    | var_def SEMICOLON
    | if_statement
    | cycle
    | exp SEMICOLON
    | RETURN exp SEMICOLON
    | RETURN SEMICOLON;

function_call:
    ID L_PAR exp_list R_PAR;

exp_list
    : exp exp_list_
    |;

exp_list_
    : COMMA exp exp_list_
    |;

cycle
    : for_statement
    | while_statement;

for_statement:
    FOR L_PAR var_def SEMICOLON exp SEMICOLON exp R_PAR L_BRACE
    body L_BRACE;

while_statement:
    WHILE L_PAR exp R_PAR L_BRACE
    body R_BRACE;

if_statement:
    IF L_PAR exp R_PAR L_BRACE
    body R_BRACE;


type_
    : basic_type array_type
    | basic_type;

array_type
    : L_BRACK exp R_BRACK array_type
    |;


basic_type
    :INT
    |LONG
    |DOUBLE
    |FLOAT
    |CHAR
    |BOOL;

returned_type
    :basic_type
    |VOID;

assigment_statement: atom ASSIGN exp;

atom
    : ID
    | ID array_type;

exp
    :exp ASSIGN p0
    |p0;

p0
    :p0 OR p1
    |p1;


p1
    :p1 AND p2
    |p2;

p2
    : p2 EQ p3
    | p2 NON_EQ p3
    | p2 LOWER_EQ p3
    | p2 GREATER_EQ p3
    | p2 LOWER p3
    | p2 GREATER p3
    | p3;

p3
    : p3 PLUS p4
    | p3 MINUS p4
    | p4;

p4
    : p4 MUL p5
    | p4 DIV p5
    | p4 MOD p5
    | p5;

p5
   : PLUS p6
   | MINUS p6
   | NOT p6
   | p6;

p6
    : L_PAR exp R_PAR
    | ID
    | NUM
    | FALSE
    | function_call
    | ID array_type
    | STRING_;

