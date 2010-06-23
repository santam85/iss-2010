lexer grammar InternalAndroidL;
@header {
package it.unibo.madz.mobile.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'serviceInterface' ;
T12 : 'op' ;
T13 : 'return' ;
T14 : 'inputType' ;
T15 : ';' ;
T16 : 'Service' ;
T17 : 'implements' ;
T18 : 'Activity' ;
T19 : 'launchable' ;
T20 : 'action' ;
T21 : 'button' ;
T22 : 'callActivity' ;
T23 : 'forActiom' ;
T24 : 'useService' ;
T25 : 'forOp' ;
T26 : 'arg=' ;
T27 : 'launchService' ;
T28 : 'execAction' ;
T29 : 'data' ;
T30 : 'category' ;
T31 : 'scheme' ;
T32 : 'host' ;
T33 : 'port' ;
T34 : 'path' ;
T35 : 'Application' ;
T36 : 'avd' ;
T37 : 'workdir' ;
T38 : 'package' ;
T39 : 'entryActiviy' ;
T40 : 'target' ;
T41 : '.' ;
T42 : 'String' ;
T43 : 'int' ;
T44 : 'double' ;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1704
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1706
RULE_INT : ('0'..'9')+;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1708
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1710
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1712
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1714
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1716
RULE_ANY_OTHER : .;


