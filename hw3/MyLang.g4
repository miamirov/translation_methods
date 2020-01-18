grammar MyLang;
//tokens
WS: [ \t\n\r\b]+ -> skip;
EQ: '==';
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
L_BRACK: '[';
SEMICOLON: ';';
COLON: ':';
ID: [a-zA-Z_]+;
NUM: [0-9]+;
COMMA: ',';
FOR: 'for';
WHILE: 'while';
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
    |STRING
    |DOUBLE
    |FLOAT
    |CHAR
    |BOOL;


exp: '*';
returned_type: '*';