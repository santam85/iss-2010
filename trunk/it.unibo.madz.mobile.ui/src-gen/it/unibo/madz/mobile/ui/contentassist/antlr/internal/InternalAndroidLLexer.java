package it.unibo.madz.mobile.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidLLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T43=43;
    public static final int Tokens=46;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
    public static final int RULE_STRING=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalAndroidLLexer() {;} 
    public InternalAndroidLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:10:5: ( 'String' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:10:7: 'String'
            {
            match("String"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:11:5: ( 'int' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:11:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:12:5: ( 'double' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:12:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:13:5: ( 'AndroidSystem' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:13:7: 'AndroidSystem'
            {
            match("AndroidSystem"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:14:5: ( 'serviceInterface' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:14:7: 'serviceInterface'
            {
            match("serviceInterface"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:15:5: ( 'op' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:15:7: 'op'
            {
            match("op"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:16:5: ( 'return' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:16:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:17:5: ( 'inputType' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:17:7: 'inputType'
            {
            match("inputType"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:18:5: ( ';' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:18:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:19:5: ( 'Service' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:19:7: 'Service'
            {
            match("Service"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:20:5: ( 'implements' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:20:7: 'implements'
            {
            match("implements"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:21:5: ( 'Activity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:21:7: 'Activity'
            {
            match("Activity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:22:5: ( 'action' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:22:7: 'action'
            {
            match("action"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:23:5: ( 'callActivity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:23:7: 'callActivity'
            {
            match("callActivity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:24:5: ( 'forActiom' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:24:7: 'forActiom'
            {
            match("forActiom"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:25:5: ( 'useService' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:25:7: 'useService'
            {
            match("useService"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:26:5: ( 'forOp' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:26:7: 'forOp'
            {
            match("forOp"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:27:5: ( 'arg=' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:27:7: 'arg='
            {
            match("arg="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:28:5: ( 'launchService' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:28:7: 'launchService'
            {
            match("launchService"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:29:5: ( 'execAction' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:29:7: 'execAction'
            {
            match("execAction"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:30:5: ( 'data' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:30:7: 'data'
            {
            match("data"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:31:5: ( 'category' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:31:7: 'category'
            {
            match("category"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:32:5: ( 'scheme' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:32:7: 'scheme'
            {
            match("scheme"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:33:5: ( 'host' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:33:7: 'host'
            {
            match("host"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:34:5: ( 'port' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:34:7: 'port'
            {
            match("port"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:35:5: ( 'path' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:35:7: 'path'
            {
            match("path"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:36:5: ( 'Application' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:36:7: 'Application'
            {
            match("Application"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:37:5: ( 'avd' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:37:7: 'avd'
            {
            match("avd"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:38:5: ( 'package' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:38:7: 'package'
            {
            match("package"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:39:5: ( 'entryActiviy' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:39:7: 'entryActiviy'
            {
            match("entryActiviy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:40:5: ( 'target' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:40:7: 'target'
            {
            match("target"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:41:5: ( 'workdir' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:41:7: 'workdir'
            {
            match("workdir"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:42:5: ( '.' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:42:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:43:5: ( 'launchable' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:43:7: 'launchable'
            {
            match("launchable"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:44:5: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:44:7: 'button'
            {
            match("button"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4260:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4260:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4260:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4260:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4260:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4262:10: ( ( '0' .. '9' )+ )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4262:12: ( '0' .. '9' )+
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4262:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4262:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4264:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4264:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4266:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4266:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4266:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4266:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4268:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4268:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4268:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4268:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4268:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4268:41: ( '\\r' )? '\\n'
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4268:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4268:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4270:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4270:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4270:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4272:16: ( . )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4272:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=42;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='S') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='r') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='i') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='n') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='g') ) {
                                int LA12_155 = input.LA(7);

                                if ( ((LA12_155>='0' && LA12_155<='9')||(LA12_155>='A' && LA12_155<='Z')||LA12_155=='_'||(LA12_155>='a' && LA12_155<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=1;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'e':
                {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='r') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='v') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='i') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='c') ) {
                                int LA12_156 = input.LA(7);

                                if ( (LA12_156=='e') ) {
                                    int LA12_180 = input.LA(8);

                                    if ( ((LA12_180>='0' && LA12_180<='9')||(LA12_180>='A' && LA12_180<='Z')||LA12_180=='_'||(LA12_180>='a' && LA12_180<='z')) ) {
                                        alt12=36;
                                    }
                                    else {
                                        alt12=10;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_67 = input.LA(4);

                    if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                        alt12=36;
                    }
                    else {
                        alt12=2;}
                    }
                    break;
                case 'p':
                    {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='u') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='t') ) {
                            int LA12_129 = input.LA(6);

                            if ( (LA12_129=='T') ) {
                                int LA12_157 = input.LA(7);

                                if ( (LA12_157=='y') ) {
                                    int LA12_181 = input.LA(8);

                                    if ( (LA12_181=='p') ) {
                                        int LA12_204 = input.LA(9);

                                        if ( (LA12_204=='e') ) {
                                            int LA12_220 = input.LA(10);

                                            if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                                alt12=36;
                                            }
                                            else {
                                                alt12=8;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                default:
                    alt12=36;}

                }
                break;
            case 'm':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='p') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='l') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='e') ) {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='m') ) {
                                int LA12_158 = input.LA(7);

                                if ( (LA12_158=='e') ) {
                                    int LA12_182 = input.LA(8);

                                    if ( (LA12_182=='n') ) {
                                        int LA12_205 = input.LA(9);

                                        if ( (LA12_205=='t') ) {
                                            int LA12_221 = input.LA(10);

                                            if ( (LA12_221=='s') ) {
                                                int LA12_235 = input.LA(11);

                                                if ( ((LA12_235>='0' && LA12_235<='9')||(LA12_235>='A' && LA12_235<='Z')||LA12_235=='_'||(LA12_235>='a' && LA12_235<='z')) ) {
                                                    alt12=36;
                                                }
                                                else {
                                                    alt12=11;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='u') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='b') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='l') ) {
                            int LA12_131 = input.LA(6);

                            if ( (LA12_131=='e') ) {
                                int LA12_159 = input.LA(7);

                                if ( ((LA12_159>='0' && LA12_159<='9')||(LA12_159>='A' && LA12_159<='Z')||LA12_159=='_'||(LA12_159>='a' && LA12_159<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'a':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='t') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='a') ) {
                        int LA12_102 = input.LA(5);

                        if ( ((LA12_102>='0' && LA12_102<='9')||(LA12_102>='A' && LA12_102<='Z')||LA12_102=='_'||(LA12_102>='a' && LA12_102<='z')) ) {
                            alt12=36;
                        }
                        else {
                            alt12=21;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='d') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='r') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='o') ) {
                            int LA12_133 = input.LA(6);

                            if ( (LA12_133=='i') ) {
                                int LA12_160 = input.LA(7);

                                if ( (LA12_160=='d') ) {
                                    int LA12_184 = input.LA(8);

                                    if ( (LA12_184=='S') ) {
                                        int LA12_206 = input.LA(9);

                                        if ( (LA12_206=='y') ) {
                                            int LA12_222 = input.LA(10);

                                            if ( (LA12_222=='s') ) {
                                                int LA12_236 = input.LA(11);

                                                if ( (LA12_236=='t') ) {
                                                    int LA12_247 = input.LA(12);

                                                    if ( (LA12_247=='e') ) {
                                                        int LA12_256 = input.LA(13);

                                                        if ( (LA12_256=='m') ) {
                                                            int LA12_262 = input.LA(14);

                                                            if ( ((LA12_262>='0' && LA12_262<='9')||(LA12_262>='A' && LA12_262<='Z')||LA12_262=='_'||(LA12_262>='a' && LA12_262<='z')) ) {
                                                                alt12=36;
                                                            }
                                                            else {
                                                                alt12=4;}
                                                        }
                                                        else {
                                                            alt12=36;}
                                                    }
                                                    else {
                                                        alt12=36;}
                                                }
                                                else {
                                                    alt12=36;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'p':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='p') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='l') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='i') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='c') ) {
                                int LA12_161 = input.LA(7);

                                if ( (LA12_161=='a') ) {
                                    int LA12_185 = input.LA(8);

                                    if ( (LA12_185=='t') ) {
                                        int LA12_207 = input.LA(9);

                                        if ( (LA12_207=='i') ) {
                                            int LA12_223 = input.LA(10);

                                            if ( (LA12_223=='o') ) {
                                                int LA12_237 = input.LA(11);

                                                if ( (LA12_237=='n') ) {
                                                    int LA12_248 = input.LA(12);

                                                    if ( ((LA12_248>='0' && LA12_248<='9')||(LA12_248>='A' && LA12_248<='Z')||LA12_248=='_'||(LA12_248>='a' && LA12_248<='z')) ) {
                                                        alt12=36;
                                                    }
                                                    else {
                                                        alt12=27;}
                                                }
                                                else {
                                                    alt12=36;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'c':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='t') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='i') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='v') ) {
                            int LA12_135 = input.LA(6);

                            if ( (LA12_135=='i') ) {
                                int LA12_162 = input.LA(7);

                                if ( (LA12_162=='t') ) {
                                    int LA12_186 = input.LA(8);

                                    if ( (LA12_186=='y') ) {
                                        int LA12_208 = input.LA(9);

                                        if ( ((LA12_208>='0' && LA12_208<='9')||(LA12_208>='A' && LA12_208<='Z')||LA12_208=='_'||(LA12_208>='a' && LA12_208<='z')) ) {
                                            alt12=36;
                                        }
                                        else {
                                            alt12=12;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'c':
                {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='h') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='e') ) {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='m') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='e') ) {
                                int LA12_163 = input.LA(7);

                                if ( ((LA12_163>='0' && LA12_163<='9')||(LA12_163>='A' && LA12_163<='Z')||LA12_163=='_'||(LA12_163>='a' && LA12_163<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=23;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'e':
                {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='r') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='v') ) {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='i') ) {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='c') ) {
                                int LA12_164 = input.LA(7);

                                if ( (LA12_164=='e') ) {
                                    int LA12_188 = input.LA(8);

                                    if ( (LA12_188=='I') ) {
                                        int LA12_209 = input.LA(9);

                                        if ( (LA12_209=='n') ) {
                                            int LA12_225 = input.LA(10);

                                            if ( (LA12_225=='t') ) {
                                                int LA12_238 = input.LA(11);

                                                if ( (LA12_238=='e') ) {
                                                    int LA12_249 = input.LA(12);

                                                    if ( (LA12_249=='r') ) {
                                                        int LA12_258 = input.LA(13);

                                                        if ( (LA12_258=='f') ) {
                                                            int LA12_263 = input.LA(14);

                                                            if ( (LA12_263=='a') ) {
                                                                int LA12_268 = input.LA(15);

                                                                if ( (LA12_268=='c') ) {
                                                                    int LA12_270 = input.LA(16);

                                                                    if ( (LA12_270=='e') ) {
                                                                        int LA12_271 = input.LA(17);

                                                                        if ( ((LA12_271>='0' && LA12_271<='9')||(LA12_271>='A' && LA12_271<='Z')||LA12_271=='_'||(LA12_271>='a' && LA12_271<='z')) ) {
                                                                            alt12=36;
                                                                        }
                                                                        else {
                                                                            alt12=5;}
                                                                    }
                                                                    else {
                                                                        alt12=36;}
                                                                }
                                                                else {
                                                                    alt12=36;}
                                                            }
                                                            else {
                                                                alt12=36;}
                                                        }
                                                        else {
                                                            alt12=36;}
                                                    }
                                                    else {
                                                        alt12=36;}
                                                }
                                                else {
                                                    alt12=36;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='o') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='p') ) {
                int LA12_41 = input.LA(3);

                if ( ((LA12_41>='0' && LA12_41<='9')||(LA12_41>='A' && LA12_41<='Z')||LA12_41=='_'||(LA12_41>='a' && LA12_41<='z')) ) {
                    alt12=36;
                }
                else {
                    alt12=6;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='e') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='t') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='u') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='r') ) {
                            int LA12_138 = input.LA(6);

                            if ( (LA12_138=='n') ) {
                                int LA12_165 = input.LA(7);

                                if ( ((LA12_165>='0' && LA12_165<='9')||(LA12_165>='A' && LA12_165<='Z')||LA12_165=='_'||(LA12_165>='a' && LA12_165<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=7;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0==';') ) {
            alt12=9;
        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='g') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='=') ) {
                        alt12=18;
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'v':
                {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='d') ) {
                    int LA12_80 = input.LA(4);

                    if ( ((LA12_80>='0' && LA12_80<='9')||(LA12_80>='A' && LA12_80<='Z')||LA12_80=='_'||(LA12_80>='a' && LA12_80<='z')) ) {
                        alt12=36;
                    }
                    else {
                        alt12=28;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'c':
                {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='t') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='i') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='o') ) {
                            int LA12_139 = input.LA(6);

                            if ( (LA12_139=='n') ) {
                                int LA12_166 = input.LA(7);

                                if ( ((LA12_166>='0' && LA12_166<='9')||(LA12_166>='A' && LA12_166<='Z')||LA12_166=='_'||(LA12_166>='a' && LA12_166<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=13;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='c') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='a') ) {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='l') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='A') ) {
                            int LA12_140 = input.LA(6);

                            if ( (LA12_140=='c') ) {
                                int LA12_167 = input.LA(7);

                                if ( (LA12_167=='t') ) {
                                    int LA12_191 = input.LA(8);

                                    if ( (LA12_191=='i') ) {
                                        int LA12_210 = input.LA(9);

                                        if ( (LA12_210=='v') ) {
                                            int LA12_226 = input.LA(10);

                                            if ( (LA12_226=='i') ) {
                                                int LA12_239 = input.LA(11);

                                                if ( (LA12_239=='t') ) {
                                                    int LA12_250 = input.LA(12);

                                                    if ( (LA12_250=='y') ) {
                                                        int LA12_259 = input.LA(13);

                                                        if ( ((LA12_259>='0' && LA12_259<='9')||(LA12_259>='A' && LA12_259<='Z')||LA12_259=='_'||(LA12_259>='a' && LA12_259<='z')) ) {
                                                            alt12=36;
                                                        }
                                                        else {
                                                            alt12=14;}
                                                    }
                                                    else {
                                                        alt12=36;}
                                                }
                                                else {
                                                    alt12=36;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                case 't':
                    {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='e') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='g') ) {
                            int LA12_141 = input.LA(6);

                            if ( (LA12_141=='o') ) {
                                int LA12_168 = input.LA(7);

                                if ( (LA12_168=='r') ) {
                                    int LA12_192 = input.LA(8);

                                    if ( (LA12_192=='y') ) {
                                        int LA12_211 = input.LA(9);

                                        if ( ((LA12_211>='0' && LA12_211<='9')||(LA12_211>='A' && LA12_211<='Z')||LA12_211=='_'||(LA12_211>='a' && LA12_211<='z')) ) {
                                            alt12=36;
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                default:
                    alt12=36;}

            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='o') ) {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'O':
                        {
                        int LA12_114 = input.LA(5);

                        if ( (LA12_114=='p') ) {
                            int LA12_142 = input.LA(6);

                            if ( ((LA12_142>='0' && LA12_142<='9')||(LA12_142>='A' && LA12_142<='Z')||LA12_142=='_'||(LA12_142>='a' && LA12_142<='z')) ) {
                                alt12=36;
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=36;}
                        }
                        break;
                    case 'A':
                        {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='c') ) {
                            int LA12_143 = input.LA(6);

                            if ( (LA12_143=='t') ) {
                                int LA12_170 = input.LA(7);

                                if ( (LA12_170=='i') ) {
                                    int LA12_193 = input.LA(8);

                                    if ( (LA12_193=='o') ) {
                                        int LA12_212 = input.LA(9);

                                        if ( (LA12_212=='m') ) {
                                            int LA12_228 = input.LA(10);

                                            if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
                                                alt12=36;
                                            }
                                            else {
                                                alt12=15;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                        }
                        break;
                    default:
                        alt12=36;}

                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='s') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='e') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='S') ) {
                        int LA12_116 = input.LA(5);

                        if ( (LA12_116=='e') ) {
                            int LA12_144 = input.LA(6);

                            if ( (LA12_144=='r') ) {
                                int LA12_171 = input.LA(7);

                                if ( (LA12_171=='v') ) {
                                    int LA12_194 = input.LA(8);

                                    if ( (LA12_194=='i') ) {
                                        int LA12_213 = input.LA(9);

                                        if ( (LA12_213=='c') ) {
                                            int LA12_229 = input.LA(10);

                                            if ( (LA12_229=='e') ) {
                                                int LA12_241 = input.LA(11);

                                                if ( ((LA12_241>='0' && LA12_241<='9')||(LA12_241>='A' && LA12_241<='Z')||LA12_241=='_'||(LA12_241>='a' && LA12_241<='z')) ) {
                                                    alt12=36;
                                                }
                                                else {
                                                    alt12=16;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='l') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='a') ) {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='u') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='n') ) {
                        int LA12_117 = input.LA(5);

                        if ( (LA12_117=='c') ) {
                            int LA12_145 = input.LA(6);

                            if ( (LA12_145=='h') ) {
                                switch ( input.LA(7) ) {
                                case 'a':
                                    {
                                    int LA12_195 = input.LA(8);

                                    if ( (LA12_195=='b') ) {
                                        int LA12_214 = input.LA(9);

                                        if ( (LA12_214=='l') ) {
                                            int LA12_230 = input.LA(10);

                                            if ( (LA12_230=='e') ) {
                                                int LA12_242 = input.LA(11);

                                                if ( ((LA12_242>='0' && LA12_242<='9')||(LA12_242>='A' && LA12_242<='Z')||LA12_242=='_'||(LA12_242>='a' && LA12_242<='z')) ) {
                                                    alt12=36;
                                                }
                                                else {
                                                    alt12=34;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                    }
                                    break;
                                case 'S':
                                    {
                                    int LA12_196 = input.LA(8);

                                    if ( (LA12_196=='e') ) {
                                        int LA12_215 = input.LA(9);

                                        if ( (LA12_215=='r') ) {
                                            int LA12_231 = input.LA(10);

                                            if ( (LA12_231=='v') ) {
                                                int LA12_243 = input.LA(11);

                                                if ( (LA12_243=='i') ) {
                                                    int LA12_253 = input.LA(12);

                                                    if ( (LA12_253=='c') ) {
                                                        int LA12_260 = input.LA(13);

                                                        if ( (LA12_260=='e') ) {
                                                            int LA12_265 = input.LA(14);

                                                            if ( ((LA12_265>='0' && LA12_265<='9')||(LA12_265>='A' && LA12_265<='Z')||LA12_265=='_'||(LA12_265>='a' && LA12_265<='z')) ) {
                                                                alt12=36;
                                                            }
                                                            else {
                                                                alt12=19;}
                                                        }
                                                        else {
                                                            alt12=36;}
                                                    }
                                                    else {
                                                        alt12=36;}
                                                }
                                                else {
                                                    alt12=36;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                    }
                                    break;
                                default:
                                    alt12=36;}

                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='e') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='c') ) {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='A') ) {
                            int LA12_146 = input.LA(6);

                            if ( (LA12_146=='c') ) {
                                int LA12_173 = input.LA(7);

                                if ( (LA12_173=='t') ) {
                                    int LA12_197 = input.LA(8);

                                    if ( (LA12_197=='i') ) {
                                        int LA12_216 = input.LA(9);

                                        if ( (LA12_216=='o') ) {
                                            int LA12_232 = input.LA(10);

                                            if ( (LA12_232=='n') ) {
                                                int LA12_244 = input.LA(11);

                                                if ( ((LA12_244>='0' && LA12_244<='9')||(LA12_244>='A' && LA12_244<='Z')||LA12_244=='_'||(LA12_244>='a' && LA12_244<='z')) ) {
                                                    alt12=36;
                                                }
                                                else {
                                                    alt12=20;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            case 'n':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='t') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='r') ) {
                        int LA12_119 = input.LA(5);

                        if ( (LA12_119=='y') ) {
                            int LA12_147 = input.LA(6);

                            if ( (LA12_147=='A') ) {
                                int LA12_174 = input.LA(7);

                                if ( (LA12_174=='c') ) {
                                    int LA12_198 = input.LA(8);

                                    if ( (LA12_198=='t') ) {
                                        int LA12_217 = input.LA(9);

                                        if ( (LA12_217=='i') ) {
                                            int LA12_233 = input.LA(10);

                                            if ( (LA12_233=='v') ) {
                                                int LA12_245 = input.LA(11);

                                                if ( (LA12_245=='i') ) {
                                                    int LA12_255 = input.LA(12);

                                                    if ( (LA12_255=='y') ) {
                                                        int LA12_261 = input.LA(13);

                                                        if ( ((LA12_261>='0' && LA12_261<='9')||(LA12_261>='A' && LA12_261<='Z')||LA12_261=='_'||(LA12_261>='a' && LA12_261<='z')) ) {
                                                            alt12=36;
                                                        }
                                                        else {
                                                            alt12=30;}
                                                    }
                                                    else {
                                                        alt12=36;}
                                                }
                                                else {
                                                    alt12=36;}
                                            }
                                            else {
                                                alt12=36;}
                                        }
                                        else {
                                            alt12=36;}
                                    }
                                    else {
                                        alt12=36;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='h') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='o') ) {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='s') ) {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='t') ) {
                        int LA12_120 = input.LA(5);

                        if ( ((LA12_120>='0' && LA12_120<='9')||(LA12_120>='A' && LA12_120<='Z')||LA12_120=='_'||(LA12_120>='a' && LA12_120<='z')) ) {
                            alt12=36;
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='h') ) {
                        int LA12_121 = input.LA(5);

                        if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                            alt12=36;
                        }
                        else {
                            alt12=26;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                case 'c':
                    {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='k') ) {
                        int LA12_122 = input.LA(5);

                        if ( (LA12_122=='a') ) {
                            int LA12_150 = input.LA(6);

                            if ( (LA12_150=='g') ) {
                                int LA12_175 = input.LA(7);

                                if ( (LA12_175=='e') ) {
                                    int LA12_199 = input.LA(8);

                                    if ( ((LA12_199>='0' && LA12_199<='9')||(LA12_199>='A' && LA12_199<='Z')||LA12_199=='_'||(LA12_199>='a' && LA12_199<='z')) ) {
                                        alt12=36;
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                    }
                    break;
                default:
                    alt12=36;}

                }
                break;
            case 'o':
                {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='r') ) {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='t') ) {
                        int LA12_123 = input.LA(5);

                        if ( ((LA12_123>='0' && LA12_123<='9')||(LA12_123>='A' && LA12_123<='Z')||LA12_123=='_'||(LA12_123>='a' && LA12_123<='z')) ) {
                            alt12=36;
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
                }
                break;
            default:
                alt12=36;}

        }
        else if ( (LA12_0=='t') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='a') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='r') ) {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='g') ) {
                        int LA12_124 = input.LA(5);

                        if ( (LA12_124=='e') ) {
                            int LA12_152 = input.LA(6);

                            if ( (LA12_152=='t') ) {
                                int LA12_176 = input.LA(7);

                                if ( ((LA12_176>='0' && LA12_176<='9')||(LA12_176>='A' && LA12_176<='Z')||LA12_176=='_'||(LA12_176>='a' && LA12_176<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=31;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='w') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='o') ) {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='r') ) {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='k') ) {
                        int LA12_125 = input.LA(5);

                        if ( (LA12_125=='d') ) {
                            int LA12_153 = input.LA(6);

                            if ( (LA12_153=='i') ) {
                                int LA12_177 = input.LA(7);

                                if ( (LA12_177=='r') ) {
                                    int LA12_201 = input.LA(8);

                                    if ( ((LA12_201>='0' && LA12_201<='9')||(LA12_201>='A' && LA12_201<='Z')||LA12_201=='_'||(LA12_201>='a' && LA12_201<='z')) ) {
                                        alt12=36;
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=33;
        }
        else if ( (LA12_0=='b') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='u') ) {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='t') ) {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='t') ) {
                        int LA12_126 = input.LA(5);

                        if ( (LA12_126=='o') ) {
                            int LA12_154 = input.LA(6);

                            if ( (LA12_154=='n') ) {
                                int LA12_178 = input.LA(7);

                                if ( ((LA12_178>='0' && LA12_178<='9')||(LA12_178>='A' && LA12_178<='Z')||LA12_178=='_'||(LA12_178>='a' && LA12_178<='z')) ) {
                                    alt12=36;
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=36;}
                        }
                        else {
                            alt12=36;}
                    }
                    else {
                        alt12=36;}
                }
                else {
                    alt12=36;}
            }
            else {
                alt12=36;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_21 = input.LA(2);

            if ( ((LA12_21>='A' && LA12_21<='Z')||LA12_21=='_'||(LA12_21>='a' && LA12_21<='z')) ) {
                alt12=36;
            }
            else {
                alt12=42;}
        }
        else if ( ((LA12_0>='B' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='n')||LA12_0=='q'||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=36;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=37;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_24 = input.LA(2);

            if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFE')) ) {
                alt12=38;
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_25 = input.LA(2);

            if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFE')) ) {
                alt12=38;
            }
            else {
                alt12=42;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=39;
                }
                break;
            case '/':
                {
                alt12=40;
                }
                break;
            default:
                alt12=42;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=41;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=42;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:150: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:158: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:167: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:179: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:195: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:211: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:219: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}