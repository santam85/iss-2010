lexer grammar InternalAndroidL;
@header {
package it.unibo.madz.mobile.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'ServiceInterface' ;
T12 : 'Service' ;
T13 : 'implements' ;
T14 : 'Activity' ;
T15 : 'action' ;
T16 : 'callActivity' ;
T17 : 'forActiom' ;
T18 : 'execAction' ;
T19 : 'data' ;
T20 : 'category' ;
T21 : 'scheme' ;
T22 : 'host' ;
T23 : 'port' ;
T24 : 'path' ;
T25 : 'Application' ;
T26 : 'avd' ;
T27 : 'package' ;
T28 : 'entryActiviy' ;
T29 : 'target' ;
T30 : 'workdir' ;
T31 : '.' ;
T32 : 'launchable' ;
T33 : 'button' ;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 3228
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 3230
RULE_INT : ('0'..'9')+;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 3232
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 3234
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 3236
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 3238
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g" 3240
RULE_ANY_OTHER : .;


