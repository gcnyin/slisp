grammar Slisp;

program : expression+ ;

expression : '(' '+' expression+ ')' #ADD
            | '(' '-' expression+ ')' #SUBTRACT
            | '(' '*' expression+ ')' #MULTI
            | '(' '/' expression+ ')' #DIVIDE
            | '(' 'println' expression ')' #PRINT
            | '(' 'define' ID expression ')' #ASSIGN
            | '(' 'if' expression expression expression ')' #IF
            | '(' op=('=='|'!='|'>'|'<'|'>='|'<=') expression expression ')' #COMPARE
            | ID #id
            | BOOL #bool
            | STRING_LITERAL #string
            | NUMBER #number ;

BOOL : 'true' | 'false' ;

ID : [a-zA-Z]+ ;

NUMBER : [0-9]+ ;


WS : [ \n\t]+ -> skip ;

STRING_LITERAL:  '"' (~["\\\r\n] | EscapeSequence)* '"';

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;
