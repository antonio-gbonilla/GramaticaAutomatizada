lexer grammar PlataLexer;
// ----------- LEXER / TOKENS ----------

//  PALABRAS RESERCADAS
AVANZA: [Aa] 'vanza';
GIRA: [Gg] 'ira';
PARA: [Pp] 'ara';
WHILE: [Mm] 'ientras';
ELSE_IF : 'sinosi';
ELSE    : 'sino';
IF      : 'si';
TRUE: [Vv]'erdadero';
FALSE: [Ff]'also';
NULL: [Nn]'ulo';

//OPERADORES ARITMETICOS
MENOS: '-';
MULTIPLICACION: '*';
DIVISION: '/';
MODULO: '%';
SUMA: '+';

//CONDICIONALES
MAYOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
MAYOR: '>';
MENOR: '<';
DISTINTO: '!=';
IGUAL_QUE: '==';
NOT: '!';
AND: '&&';
OR: '||';


//Atomicos
INT: DIGITO+;
FLOAT: (DIGITO)+ '.' DIGITO+; ///!Corregir el signo -
fragment DIGITO: [0-9];

//String
STRING: '"' (~["\r\n] | '""')* '"';

ID: [a-zA-Z][a-zA-Z_0-9]*;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
COMMENT : '/*' .*? '*/' -> skip ;
WS: [ \t\n\r]+ -> skip; //DESCARTA LOS ESPACIOS, SALTOS DE LINEA Y TAB.