grammar MyLang;
//tokens
WS: [ \t\n\r\b]+ -> skip;
EQ: '==';
NON_EQ: '!=';
LOWER_EQ: '<=';
GREATER_EQ: '>=';
TRUE: 'true';
FALSE: 'false';
INT: 'Int';
DOUBLE: 'Double';
FLOAT: 'Float';
STRING: 'String';
LONG: 'Long';
CHAR: 'Char';
BOOL: 'Boolean';
VOID: 'Void';
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
ASSIGN: '=';
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
READ: 'read';
WRITE: 'write';
ID: [a-zA-Z_]+;
NUM: [0-9]+;
COMMA: ',';

//rules
main: code EOF;

code
    : global_statement code
    |;

global_statement
    : var_decl
    | var_def
    | function;

var_decl: ID COLON type_;

var_def: ID COLON type_ ASSIGN exp;

function:
   DEF ID L_PAR function_args R_PAR returned_type L_BRACE
   body R_BRACE;

function_args
	: ID COLON type_ function_args_
    |;

function_args_
    : COMMA ID COLON type_ function_args_
    |;

body
    : local_statement body
    |;

local_statement
    : var_decl
    | var_def
    | if_statement
    | cycle
    | exp
    | returned
    | while_statement
    | for_statement
    | read_
    | write_;

returned
    :RETURN exp
    |RETURN;

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
    body R_BRACE;

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
    | L_BRACK R_BRACK array_type
    |;


basic_type
    :INT
    |LONG
    |DOUBLE
    |FLOAT
    |CHAR
    |BOOL;

returned_type
    :COLON basic_type
    |;

assigment_statement: atom ASSIGN exp;

atom
    : ID
    | ID array_type;

exp
    :p;

p
    :p OR q
    |p AND q
    | p EQ q
    | p NON_EQ q
    | p LOWER_EQ q
    | p GREATER_EQ q
    | p LOWER q
    | p GREATER q
    | p PLUS q
    | p MINUS q
    | p MUL q
    | p DIV q
    | p MOD q
    | PLUS q
    | MINUS q
    | NOT q
    | q;

q
    : L_PAR exp R_PAR
    | atom
    | NUM
    | FALSE
    | TRUE
    | function_call
    | STRING_
    | assigment_statement;

read_: READ L_PAR atom COLON basic_type R_PAR;
write_: WRITE L_PAR atom COLON basic_type R_PAR;