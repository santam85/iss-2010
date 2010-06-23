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
T14 : 'AndroidSystem' ;
T15 : 'serviceInterface' ;
T16 : 'op' ;
T17 : 'return' ;
T18 : 'inputType' ;
T19 : ';' ;
T20 : 'Service' ;
T21 : 'implements' ;
T22 : 'Activity' ;
T23 : 'action' ;
T24 : 'callActivity' ;
T25 : 'forActiom' ;
T26 : 'useService' ;
T27 : 'forOp' ;
T28 : 'arg=' ;
T29 : 'launchService' ;
T30 : 'execAction' ;
T31 : 'data' ;
T32 : 'category' ;
T33 : 'scheme' ;
T34 : 'host' ;
T35 : 'port' ;
T36 : 'path' ;
T37 : 'Application' ;
T38 : 'avd' ;
T39 : 'package' ;
T40 : 'entryActiviy' ;
T41 : 'target' ;
T42 : 'workdir' ;
T43 : '.' ;
T44 : 'launchable' ;
T45 : 'button' ;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4260
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4262
RULE_INT : ('0'..'9')+;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4264
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4266
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4268
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4270
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 4272
RULE_ANY_OTHER : .;


