lexer grammar InternalAndroidL;
@header {
package it.unibo.madz.mobile.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'AndroidSystem' ;
T12 : 'serviceInterface' ;
T13 : 'op' ;
T14 : 'return' ;
T15 : 'inputType' ;
T16 : ';' ;
T17 : 'Service' ;
T18 : 'implements' ;
T19 : 'Activity' ;
T20 : 'launchable' ;
T21 : 'action' ;
T22 : 'button' ;
T23 : 'callActivity' ;
T24 : 'forActiom' ;
T25 : 'useService' ;
T26 : 'forOp' ;
T27 : 'arg=' ;
T28 : 'launchService' ;
T29 : 'execAction' ;
T30 : 'data' ;
T31 : 'category' ;
T32 : 'scheme' ;
T33 : 'host' ;
T34 : 'port' ;
T35 : 'path' ;
T36 : 'Application' ;
T37 : 'avd' ;
T38 : 'workdir' ;
T39 : 'package' ;
T40 : 'entryActiviy' ;
T41 : 'target' ;
T42 : '.' ;
T43 : 'String' ;
T44 : 'int' ;
T45 : 'double' ;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1732
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1734
RULE_INT : ('0'..'9')+;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1736
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1738
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1740
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1742
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g" 1744
RULE_ANY_OTHER : .;


