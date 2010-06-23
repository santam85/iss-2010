lexer grammar InternalAndroidL;
@header {
package it.unibo.madz.mobile.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'String' ;
T12 : 'int' ;
T13 : 'double' ;
T14 : 'serviceInterface' ;
T15 : 'op' ;
T16 : 'return' ;
T17 : 'inputType' ;
T18 : ';' ;
T19 : 'Service' ;
T20 : 'implements' ;
T21 : 'Activity' ;
T22 : 'action' ;
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
T38 : 'package' ;
T39 : 'entryActiviy' ;
T40 : 'target' ;
T41 : 'workdir' ;
T42 : '.' ;
T43 : 'launchable' ;
T44 : 'button' ;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4181
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4183
RULE_INT : ('0'..'9')+;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4185
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4187
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4189
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4191
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4193
RULE_ANY_OTHER : .;


