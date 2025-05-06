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
type: ENTERO | FLOTANTE | BOOLEANO | CADENA;

assignment: ID '=' expr;

ifStmt: 'si' '(' expr ')' block ('contrario' 'si' '(' expr ')' block)* ('contrario' block)?;

// Ciclo for
forStmt: 'ciclo' '(' (variableDecl | assignment)? ';' expr? ';' (assignment | incrementStmt)? ')' block;

printStmt: 'hola' '(' expr ')' ';';

incrementStmt: ID '++' | '++' ID;

block: '{' statement* '}';

expr: expr '++'                          # PostIncrementExpr
    | '++' expr                          # PreIncrementExpr
    | expr ('*' | '/') expr              # MultiplicativeExpr
    | expr ('+' | '-') expr              # AdditiveExpr
    | expr ('<<' | '>>' | '<<=' | '>>=') expr # RelationalExpr
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
ENTERO: 'entero';
FLOTANTE: 'flotante';
BOOLEANO: 'booleano';
CADENA: 'cadena';
IF: 'si';
ELSE: 'contrario';
FOR: 'ciclo';
PRINT: 'hola';

BOOLEAN_LITERAL: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT_LITERAL: [0-9]+;
FLOAT_LITERAL: [0-9]+ '.' [0-9]* | '.' [0-9]+;
STRING_LITERAL: '"' .*? '"';

PLUSPLUS: '++';

WS: [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '$$' ~[\r\n]* -> skip;

EQ: '=';
LT: '<<';
GT: '>>';
LE: '<<=';
GE: '>>=';
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