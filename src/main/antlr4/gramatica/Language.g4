grammar Language;

program: statement* EOF;

statement: variableDecl ';'
         | assignment ';'
         | ifStmt
         | forStmt
         | printStmt ';'
         | incrementStmt ';'
         | block
         | ';'
         ;

variableDecl: type ID ('=' expr)?;
type: INT | FLOAT | BOOLEAN | STRING;

assignment: ID '=' expr;

ifStmt: 'if' '(' expr ')' block ('else' 'if' '(' expr ')' block)* ('else' block)?;

// Ciclo for
forStmt: 'for' '(' (variableDecl | assignment)? ';' expr? ';' (assignment | incrementStmt)? ')' block;

printStmt: 'print' '(' expr ')' ';';

incrementStmt: ID '++' | '++' ID;

block: '{' statement* '}';

expr: expr '++'                          # PostIncrementExpr
    | '++' expr                          # PreIncrementExpr
    | expr ('*' | '/') expr              # MultiplicativeExpr
    | expr ('+' | '-') expr              # AdditiveExpr
    | expr ('<' | '>' | '<=' | '>=') expr # RelationalExpr
    | expr ('==' | '!=') expr            # EqualityExpr
    | '(' expr ')'                       # ParenExpr
    | ID                                 # VarExpr
    | literal                            # LiteralExpr
    ;

literal: INT_LITERAL
       | FLOAT_LITERAL
       | STRING_LITERAL
       | BOOLEAN_LITERAL
       ;

// Tokens
INT: 'int';
FLOAT: 'float';
BOOLEAN: 'boolean';
STRING: 'string';
IF: 'if';
ELSE: 'else';
FOR: 'for';
PRINT: 'print';

BOOLEAN_LITERAL: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT_LITERAL: [0-9]+;
FLOAT_LITERAL: [0-9]+ '.' [0-9]* | '.' [0-9]+;
STRING_LITERAL: '"' .*? '"';

PLUSPLUS: '++';

WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

EQ: '=';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
EQEQ: '==';
NEQ: '!=';

PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI: ';';