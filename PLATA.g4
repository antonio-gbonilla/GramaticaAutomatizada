grammar PLATA;
import PlataLexer;
//------------ REGLA PRINCIPAL ------------
programa: sentencia+ EOF;

//-------------- LINEAS A PROCESAR -----------
sentencia: avanza | gira | para | asignacion | if_sentencia | bucle_while | expr_aritmeticas; //!verbos

// ----------- METODOS ------------
avanza: AVANZA '(' expr_aritmeticas ',' expr_aritmeticas ')';
gira: GIRA '(' expr_aritmeticas ')';
para: PARA;

// ---------------- SENTENCIAS ESPECIALES --------------
//asignacion
asignacion: ID '=' expr;

// if
if_sentencia: 	IF '('expr_logica')' bloque 
				(ELSE_IF '('expr_logica')' bloque)* 
				(ELSE bloque)?;


// while
bucle_while: WHILE '('expr_logica')' bloque;

// ------------------ BLOQUES ------------------
bloque: '{' sentencia+ '}';

// --- EXPRESIONES ---
expr
	: expr_aritmeticas
	| expr_relacionales
	| expr_logica
	;
expr_aritmeticas
	: MENOS expr_aritmeticas 	#MenosExprAritmetica
	| expr_aritmeticas op=(MULTIPLICACION | DIVISION | MODULO) expr_aritmeticas	# MultiplicacionExprAritmetica // Mayor precedencia 
	| expr_aritmeticas op=(SUMA | MENOS) expr_aritmeticas	# SumaExprAritmetica
	| atomico		#AtomicoExprAritmetica  //atomo 
	| '(' expr_aritmeticas ')'	# ParentesisExprAritmetica // Precedencia máxima (pero no compite, sino que agrupa)
	;

// operadores relacionales (de comparacion: <,>,>=,<=, == ,!=), operan numero operado con numero = (true o false)
expr_relacionales
	: expr_aritmeticas op=(MAYOR_IGUAL | MENOR_IGUAL | MENOR | MAYOR) expr_aritmeticas # RelacionesExprRelacionales
	| expr_aritmeticas op=(IGUAL_QUE | DISTINTO) expr_aritmeticas #IgualdadesExprRelacionales 
	| '(' expr_relacionales ')' #ParentesisExprRelacionales
	;

// operares logicos (AND , OR, NOT), estos operan logico con logico y el resultado es logico(true o false).
expr_logica
	: NOT expr_logica	#NotExpr
	| expr_logica AND expr_logica # AndExprLogica
	| expr_logica OR expr_logica	# ORExprLogica // Menor precedencia
	| expr_relacionales #LogicaExprRelacionales
	| (TRUE | FALSE) #BoolExprLogica
	| ID #IdExprLogica
	| '(' expr_logica ')' #ParentesisExprLogica
	;


atomico
	: (INT | FLOAT) #numeroAtomico 
	| (TRUE | FALSE)	#booleanAtomico
	| ID	# idAtomico //atomo
	| STRING	#stringAtomico
	;



