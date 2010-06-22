lexer grammar InternalAndroidL;
@header {
package it.unibo.madz.mobile.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'ServiceInterface' ;
T12 : 'Service' ;
T13 : 'implements' ;
T14 : 'Activity' ;
T15 : 'launchable' ;
T16 : 'action' ;
T17 : 'button' ;
T18 : 'callActivity' ;
T19 : 'forActiom' ;
T20 : 'execAction' ;
T21 : 'data' ;
T22 : 'category' ;
T23 : 'scheme' ;
T24 : 'host' ;
T25 : 'port' ;
T26 : 'path' ;
T27 : 'Application' ;
T28 : 'avd' ;
T29 : 'workdir' ;
T30 : 'package' ;
T31 : 'entryActiviy' ;
T32 : 'target' ;
T33 : '.' ;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1337
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1339
RULE_INT : ('0'..'9')+;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1341
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1343
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1345
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1347
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1349
RULE_ANY_OTHER : .;


