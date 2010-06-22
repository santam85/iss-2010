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
    public static final int Tokens=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:13:5: ( 'serviceInterface' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:13:7: 'serviceInterface'
            {
            match("serviceInterface"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:14:5: ( 'op' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:14:7: 'op'
            {
            match("op"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:15:5: ( 'return' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:15:7: 'return'
            {
            match("return"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:16:5: ( 'inputType' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:16:7: 'inputType'
            {
            match("inputType"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:17:5: ( ';' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:17:7: ';'
            {
            match(';'); 

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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:18:5: ( 'Service' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:18:7: 'Service'
            {
            match("Service"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:19:5: ( 'implements' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:19:7: 'implements'
            {
            match("implements"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:20:5: ( 'Activity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:20:7: 'Activity'
            {
            match("Activity"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:21:5: ( 'action' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:21:7: 'action'
            {
            match("action"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:22:5: ( 'callActivity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:22:7: 'callActivity'
            {
            match("callActivity"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:23:5: ( 'forActiom' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:23:7: 'forActiom'
            {
            match("forActiom"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:24:5: ( 'useService' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:24:7: 'useService'
            {
            match("useService"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:25:5: ( 'forOp' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:25:7: 'forOp'
            {
            match("forOp"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:26:5: ( 'arg=' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:26:7: 'arg='
            {
            match("arg="); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:27:5: ( 'launchService' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:27:7: 'launchService'
            {
            match("launchService"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:28:5: ( 'execAction' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:28:7: 'execAction'
            {
            match("execAction"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:29:5: ( 'data' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:29:7: 'data'
            {
            match("data"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:30:5: ( 'category' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:30:7: 'category'
            {
            match("category"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:31:5: ( 'scheme' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:31:7: 'scheme'
            {
            match("scheme"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:32:5: ( 'host' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:32:7: 'host'
            {
            match("host"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:33:5: ( 'port' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:33:7: 'port'
            {
            match("port"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:34:5: ( 'path' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:34:7: 'path'
            {
            match("path"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:35:5: ( 'Application' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:35:7: 'Application'
            {
            match("Application"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:36:5: ( 'avd' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:36:7: 'avd'
            {
            match("avd"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:37:5: ( 'package' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:37:7: 'package'
            {
            match("package"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:38:5: ( 'entryActiviy' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:38:7: 'entryActiviy'
            {
            match("entryActiviy"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:39:5: ( 'target' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:39:7: 'target'
            {
            match("target"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:40:5: ( 'workdir' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:40:7: 'workdir'
            {
            match("workdir"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:41:5: ( '.' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:41:7: '.'
            {
            match('.'); 

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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:42:5: ( 'launchable' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:42:7: 'launchable'
            {
            match("launchable"); 


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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:43:5: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:43:7: 'button'
            {
            match("button"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4181:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4181:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4181:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4181:11: '^'
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

            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4181:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4183:10: ( ( '0' .. '9' )+ )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4183:12: ( '0' .. '9' )+
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4183:12: ( '0' .. '9' )+
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
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4183:13: '0' .. '9'
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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("4185:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4187:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4187:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4187:24: ( options {greedy=false; } : . )*
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
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4187:52: .
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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4189:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4189:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4189:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4189:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4189:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4189:41: ( '\\r' )? '\\n'
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4189:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4189:41: '\\r'
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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4191:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4191:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4191:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4193:16: ( . )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4193:18: .
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
        // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=41;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='S') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='r') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='i') ) {
                        int LA12_94 = input.LA(5);

                        if ( (LA12_94=='n') ) {
                            int LA12_124 = input.LA(6);

                            if ( (LA12_124=='g') ) {
                                int LA12_151 = input.LA(7);

                                if ( ((LA12_151>='0' && LA12_151<='9')||(LA12_151>='A' && LA12_151<='Z')||LA12_151=='_'||(LA12_151>='a' && LA12_151<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=1;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            case 'e':
                {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='r') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='v') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='i') ) {
                            int LA12_125 = input.LA(6);

                            if ( (LA12_125=='c') ) {
                                int LA12_152 = input.LA(7);

                                if ( (LA12_152=='e') ) {
                                    int LA12_175 = input.LA(8);

                                    if ( ((LA12_175>='0' && LA12_175<='9')||(LA12_175>='A' && LA12_175<='Z')||LA12_175=='_'||(LA12_175>='a' && LA12_175<='z')) ) {
                                        alt12=35;
                                    }
                                    else {
                                        alt12=9;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='u') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='t') ) {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='T') ) {
                                int LA12_153 = input.LA(7);

                                if ( (LA12_153=='y') ) {
                                    int LA12_176 = input.LA(8);

                                    if ( (LA12_176=='p') ) {
                                        int LA12_198 = input.LA(9);

                                        if ( (LA12_198=='e') ) {
                                            int LA12_213 = input.LA(10);

                                            if ( ((LA12_213>='0' && LA12_213<='9')||(LA12_213>='A' && LA12_213<='Z')||LA12_213=='_'||(LA12_213>='a' && LA12_213<='z')) ) {
                                                alt12=35;
                                            }
                                            else {
                                                alt12=7;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                    }
                    break;
                case 't':
                    {
                    int LA12_67 = input.LA(4);

                    if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                        alt12=35;
                    }
                    else {
                        alt12=2;}
                    }
                    break;
                default:
                    alt12=35;}

                }
                break;
            case 'm':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='p') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='l') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='e') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='m') ) {
                                int LA12_154 = input.LA(7);

                                if ( (LA12_154=='e') ) {
                                    int LA12_177 = input.LA(8);

                                    if ( (LA12_177=='n') ) {
                                        int LA12_199 = input.LA(9);

                                        if ( (LA12_199=='t') ) {
                                            int LA12_214 = input.LA(10);

                                            if ( (LA12_214=='s') ) {
                                                int LA12_227 = input.LA(11);

                                                if ( ((LA12_227>='0' && LA12_227<='9')||(LA12_227>='A' && LA12_227<='Z')||LA12_227=='_'||(LA12_227>='a' && LA12_227<='z')) ) {
                                                    alt12=35;
                                                }
                                                else {
                                                    alt12=10;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

        }
        else if ( (LA12_0=='d') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='t') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='a') ) {
                        int LA12_99 = input.LA(5);

                        if ( ((LA12_99>='0' && LA12_99<='9')||(LA12_99>='A' && LA12_99<='Z')||LA12_99=='_'||(LA12_99>='a' && LA12_99<='z')) ) {
                            alt12=35;
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            case 'o':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='u') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='b') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='l') ) {
                            int LA12_129 = input.LA(6);

                            if ( (LA12_129=='e') ) {
                                int LA12_155 = input.LA(7);

                                if ( ((LA12_155>='0' && LA12_155<='9')||(LA12_155>='A' && LA12_155<='Z')||LA12_155=='_'||(LA12_155>='a' && LA12_155<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=3;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

        }
        else if ( (LA12_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='r') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='v') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='i') ) {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='c') ) {
                                int LA12_156 = input.LA(7);

                                if ( (LA12_156=='e') ) {
                                    int LA12_179 = input.LA(8);

                                    if ( (LA12_179=='I') ) {
                                        int LA12_200 = input.LA(9);

                                        if ( (LA12_200=='n') ) {
                                            int LA12_215 = input.LA(10);

                                            if ( (LA12_215=='t') ) {
                                                int LA12_228 = input.LA(11);

                                                if ( (LA12_228=='e') ) {
                                                    int LA12_238 = input.LA(12);

                                                    if ( (LA12_238=='r') ) {
                                                        int LA12_246 = input.LA(13);

                                                        if ( (LA12_246=='f') ) {
                                                            int LA12_251 = input.LA(14);

                                                            if ( (LA12_251=='a') ) {
                                                                int LA12_255 = input.LA(15);

                                                                if ( (LA12_255=='c') ) {
                                                                    int LA12_257 = input.LA(16);

                                                                    if ( (LA12_257=='e') ) {
                                                                        int LA12_258 = input.LA(17);

                                                                        if ( ((LA12_258>='0' && LA12_258<='9')||(LA12_258>='A' && LA12_258<='Z')||LA12_258=='_'||(LA12_258>='a' && LA12_258<='z')) ) {
                                                                            alt12=35;
                                                                        }
                                                                        else {
                                                                            alt12=4;}
                                                                    }
                                                                    else {
                                                                        alt12=35;}
                                                                }
                                                                else {
                                                                    alt12=35;}
                                                            }
                                                            else {
                                                                alt12=35;}
                                                        }
                                                        else {
                                                            alt12=35;}
                                                    }
                                                    else {
                                                        alt12=35;}
                                                }
                                                else {
                                                    alt12=35;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            case 'c':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='h') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='e') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='m') ) {
                            int LA12_131 = input.LA(6);

                            if ( (LA12_131=='e') ) {
                                int LA12_157 = input.LA(7);

                                if ( ((LA12_157>='0' && LA12_157<='9')||(LA12_157>='A' && LA12_157<='Z')||LA12_157=='_'||(LA12_157>='a' && LA12_157<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=22;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

        }
        else if ( (LA12_0=='o') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='p') ) {
                int LA12_38 = input.LA(3);

                if ( ((LA12_38>='0' && LA12_38<='9')||(LA12_38>='A' && LA12_38<='Z')||LA12_38=='_'||(LA12_38>='a' && LA12_38<='z')) ) {
                    alt12=35;
                }
                else {
                    alt12=5;}
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='e') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='t') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='u') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='r') ) {
                            int LA12_132 = input.LA(6);

                            if ( (LA12_132=='n') ) {
                                int LA12_158 = input.LA(7);

                                if ( ((LA12_158>='0' && LA12_158<='9')||(LA12_158>='A' && LA12_158<='Z')||LA12_158=='_'||(LA12_158>='a' && LA12_158<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=6;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0==';') ) {
            alt12=8;
        }
        else if ( (LA12_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'p':
                {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='p') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='l') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='i') ) {
                            int LA12_133 = input.LA(6);

                            if ( (LA12_133=='c') ) {
                                int LA12_159 = input.LA(7);

                                if ( (LA12_159=='a') ) {
                                    int LA12_182 = input.LA(8);

                                    if ( (LA12_182=='t') ) {
                                        int LA12_201 = input.LA(9);

                                        if ( (LA12_201=='i') ) {
                                            int LA12_216 = input.LA(10);

                                            if ( (LA12_216=='o') ) {
                                                int LA12_229 = input.LA(11);

                                                if ( (LA12_229=='n') ) {
                                                    int LA12_239 = input.LA(12);

                                                    if ( ((LA12_239>='0' && LA12_239<='9')||(LA12_239>='A' && LA12_239<='Z')||LA12_239=='_'||(LA12_239>='a' && LA12_239<='z')) ) {
                                                        alt12=35;
                                                    }
                                                    else {
                                                        alt12=26;}
                                                }
                                                else {
                                                    alt12=35;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            case 'c':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='t') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='i') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='v') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='i') ) {
                                int LA12_160 = input.LA(7);

                                if ( (LA12_160=='t') ) {
                                    int LA12_183 = input.LA(8);

                                    if ( (LA12_183=='y') ) {
                                        int LA12_202 = input.LA(9);

                                        if ( ((LA12_202>='0' && LA12_202<='9')||(LA12_202>='A' && LA12_202<='Z')||LA12_202=='_'||(LA12_202>='a' && LA12_202<='z')) ) {
                                            alt12=35;
                                        }
                                        else {
                                            alt12=11;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

        }
        else if ( (LA12_0=='a') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='g') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='=') ) {
                        alt12=17;
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            case 'v':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='d') ) {
                    int LA12_78 = input.LA(4);

                    if ( ((LA12_78>='0' && LA12_78<='9')||(LA12_78>='A' && LA12_78<='Z')||LA12_78=='_'||(LA12_78>='a' && LA12_78<='z')) ) {
                        alt12=35;
                    }
                    else {
                        alt12=27;}
                }
                else {
                    alt12=35;}
                }
                break;
            case 'c':
                {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='t') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='i') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='o') ) {
                            int LA12_135 = input.LA(6);

                            if ( (LA12_135=='n') ) {
                                int LA12_161 = input.LA(7);

                                if ( ((LA12_161>='0' && LA12_161<='9')||(LA12_161>='A' && LA12_161<='Z')||LA12_161=='_'||(LA12_161>='a' && LA12_161<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

        }
        else if ( (LA12_0=='c') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='a') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='e') ) {
                        int LA12_109 = input.LA(5);

                        if ( (LA12_109=='g') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='o') ) {
                                int LA12_162 = input.LA(7);

                                if ( (LA12_162=='r') ) {
                                    int LA12_185 = input.LA(8);

                                    if ( (LA12_185=='y') ) {
                                        int LA12_203 = input.LA(9);

                                        if ( ((LA12_203>='0' && LA12_203<='9')||(LA12_203>='A' && LA12_203<='Z')||LA12_203=='_'||(LA12_203>='a' && LA12_203<='z')) ) {
                                            alt12=35;
                                        }
                                        else {
                                            alt12=21;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                    }
                    break;
                case 'l':
                    {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='l') ) {
                        int LA12_110 = input.LA(5);

                        if ( (LA12_110=='A') ) {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='c') ) {
                                int LA12_163 = input.LA(7);

                                if ( (LA12_163=='t') ) {
                                    int LA12_186 = input.LA(8);

                                    if ( (LA12_186=='i') ) {
                                        int LA12_204 = input.LA(9);

                                        if ( (LA12_204=='v') ) {
                                            int LA12_219 = input.LA(10);

                                            if ( (LA12_219=='i') ) {
                                                int LA12_230 = input.LA(11);

                                                if ( (LA12_230=='t') ) {
                                                    int LA12_240 = input.LA(12);

                                                    if ( (LA12_240=='y') ) {
                                                        int LA12_248 = input.LA(13);

                                                        if ( ((LA12_248>='0' && LA12_248<='9')||(LA12_248>='A' && LA12_248<='Z')||LA12_248=='_'||(LA12_248>='a' && LA12_248<='z')) ) {
                                                            alt12=35;
                                                        }
                                                        else {
                                                            alt12=13;}
                                                    }
                                                    else {
                                                        alt12=35;}
                                                }
                                                else {
                                                    alt12=35;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                    }
                    break;
                default:
                    alt12=35;}

            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='f') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='o') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='r') ) {
                    switch ( input.LA(4) ) {
                    case 'O':
                        {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='p') ) {
                            int LA12_138 = input.LA(6);

                            if ( ((LA12_138>='0' && LA12_138<='9')||(LA12_138>='A' && LA12_138<='Z')||LA12_138=='_'||(LA12_138>='a' && LA12_138<='z')) ) {
                                alt12=35;
                            }
                            else {
                                alt12=16;}
                        }
                        else {
                            alt12=35;}
                        }
                        break;
                    case 'A':
                        {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='c') ) {
                            int LA12_139 = input.LA(6);

                            if ( (LA12_139=='t') ) {
                                int LA12_165 = input.LA(7);

                                if ( (LA12_165=='i') ) {
                                    int LA12_187 = input.LA(8);

                                    if ( (LA12_187=='o') ) {
                                        int LA12_205 = input.LA(9);

                                        if ( (LA12_205=='m') ) {
                                            int LA12_220 = input.LA(10);

                                            if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                                alt12=35;
                                            }
                                            else {
                                                alt12=14;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                        }
                        break;
                    default:
                        alt12=35;}

                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='s') ) {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='e') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='S') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='e') ) {
                            int LA12_140 = input.LA(6);

                            if ( (LA12_140=='r') ) {
                                int LA12_166 = input.LA(7);

                                if ( (LA12_166=='v') ) {
                                    int LA12_188 = input.LA(8);

                                    if ( (LA12_188=='i') ) {
                                        int LA12_206 = input.LA(9);

                                        if ( (LA12_206=='c') ) {
                                            int LA12_221 = input.LA(10);

                                            if ( (LA12_221=='e') ) {
                                                int LA12_232 = input.LA(11);

                                                if ( ((LA12_232>='0' && LA12_232<='9')||(LA12_232>='A' && LA12_232<='Z')||LA12_232=='_'||(LA12_232>='a' && LA12_232<='z')) ) {
                                                    alt12=35;
                                                }
                                                else {
                                                    alt12=15;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='l') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='a') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='u') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='n') ) {
                        int LA12_114 = input.LA(5);

                        if ( (LA12_114=='c') ) {
                            int LA12_141 = input.LA(6);

                            if ( (LA12_141=='h') ) {
                                switch ( input.LA(7) ) {
                                case 'a':
                                    {
                                    int LA12_189 = input.LA(8);

                                    if ( (LA12_189=='b') ) {
                                        int LA12_207 = input.LA(9);

                                        if ( (LA12_207=='l') ) {
                                            int LA12_222 = input.LA(10);

                                            if ( (LA12_222=='e') ) {
                                                int LA12_233 = input.LA(11);

                                                if ( ((LA12_233>='0' && LA12_233<='9')||(LA12_233>='A' && LA12_233<='Z')||LA12_233=='_'||(LA12_233>='a' && LA12_233<='z')) ) {
                                                    alt12=35;
                                                }
                                                else {
                                                    alt12=33;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                    }
                                    break;
                                case 'S':
                                    {
                                    int LA12_190 = input.LA(8);

                                    if ( (LA12_190=='e') ) {
                                        int LA12_208 = input.LA(9);

                                        if ( (LA12_208=='r') ) {
                                            int LA12_223 = input.LA(10);

                                            if ( (LA12_223=='v') ) {
                                                int LA12_234 = input.LA(11);

                                                if ( (LA12_234=='i') ) {
                                                    int LA12_243 = input.LA(12);

                                                    if ( (LA12_243=='c') ) {
                                                        int LA12_249 = input.LA(13);

                                                        if ( (LA12_249=='e') ) {
                                                            int LA12_253 = input.LA(14);

                                                            if ( ((LA12_253>='0' && LA12_253<='9')||(LA12_253>='A' && LA12_253<='Z')||LA12_253=='_'||(LA12_253>='a' && LA12_253<='z')) ) {
                                                                alt12=35;
                                                            }
                                                            else {
                                                                alt12=18;}
                                                        }
                                                        else {
                                                            alt12=35;}
                                                    }
                                                    else {
                                                        alt12=35;}
                                                }
                                                else {
                                                    alt12=35;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                    }
                                    break;
                                default:
                                    alt12=35;}

                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='e') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='c') ) {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='A') ) {
                            int LA12_142 = input.LA(6);

                            if ( (LA12_142=='c') ) {
                                int LA12_168 = input.LA(7);

                                if ( (LA12_168=='t') ) {
                                    int LA12_191 = input.LA(8);

                                    if ( (LA12_191=='i') ) {
                                        int LA12_209 = input.LA(9);

                                        if ( (LA12_209=='o') ) {
                                            int LA12_224 = input.LA(10);

                                            if ( (LA12_224=='n') ) {
                                                int LA12_235 = input.LA(11);

                                                if ( ((LA12_235>='0' && LA12_235<='9')||(LA12_235>='A' && LA12_235<='Z')||LA12_235=='_'||(LA12_235>='a' && LA12_235<='z')) ) {
                                                    alt12=35;
                                                }
                                                else {
                                                    alt12=19;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            case 'n':
                {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='t') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='r') ) {
                        int LA12_116 = input.LA(5);

                        if ( (LA12_116=='y') ) {
                            int LA12_143 = input.LA(6);

                            if ( (LA12_143=='A') ) {
                                int LA12_169 = input.LA(7);

                                if ( (LA12_169=='c') ) {
                                    int LA12_192 = input.LA(8);

                                    if ( (LA12_192=='t') ) {
                                        int LA12_210 = input.LA(9);

                                        if ( (LA12_210=='i') ) {
                                            int LA12_225 = input.LA(10);

                                            if ( (LA12_225=='v') ) {
                                                int LA12_236 = input.LA(11);

                                                if ( (LA12_236=='i') ) {
                                                    int LA12_245 = input.LA(12);

                                                    if ( (LA12_245=='y') ) {
                                                        int LA12_250 = input.LA(13);

                                                        if ( ((LA12_250>='0' && LA12_250<='9')||(LA12_250>='A' && LA12_250<='Z')||LA12_250=='_'||(LA12_250>='a' && LA12_250<='z')) ) {
                                                            alt12=35;
                                                        }
                                                        else {
                                                            alt12=29;}
                                                    }
                                                    else {
                                                        alt12=35;}
                                                }
                                                else {
                                                    alt12=35;}
                                            }
                                            else {
                                                alt12=35;}
                                        }
                                        else {
                                            alt12=35;}
                                    }
                                    else {
                                        alt12=35;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

        }
        else if ( (LA12_0=='h') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='o') ) {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='s') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='t') ) {
                        int LA12_117 = input.LA(5);

                        if ( ((LA12_117>='0' && LA12_117<='9')||(LA12_117>='A' && LA12_117<='Z')||LA12_117=='_'||(LA12_117>='a' && LA12_117<='z')) ) {
                            alt12=35;
                        }
                        else {
                            alt12=23;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='k') ) {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='a') ) {
                            int LA12_145 = input.LA(6);

                            if ( (LA12_145=='g') ) {
                                int LA12_170 = input.LA(7);

                                if ( (LA12_170=='e') ) {
                                    int LA12_193 = input.LA(8);

                                    if ( ((LA12_193>='0' && LA12_193<='9')||(LA12_193>='A' && LA12_193<='Z')||LA12_193=='_'||(LA12_193>='a' && LA12_193<='z')) ) {
                                        alt12=35;
                                    }
                                    else {
                                        alt12=28;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                    }
                    break;
                case 't':
                    {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='h') ) {
                        int LA12_119 = input.LA(5);

                        if ( ((LA12_119>='0' && LA12_119<='9')||(LA12_119>='A' && LA12_119<='Z')||LA12_119=='_'||(LA12_119>='a' && LA12_119<='z')) ) {
                            alt12=35;
                        }
                        else {
                            alt12=25;}
                    }
                    else {
                        alt12=35;}
                    }
                    break;
                default:
                    alt12=35;}

                }
                break;
            case 'o':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='r') ) {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='t') ) {
                        int LA12_120 = input.LA(5);

                        if ( ((LA12_120>='0' && LA12_120<='9')||(LA12_120>='A' && LA12_120<='Z')||LA12_120=='_'||(LA12_120>='a' && LA12_120<='z')) ) {
                            alt12=35;
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
                }
                break;
            default:
                alt12=35;}

        }
        else if ( (LA12_0=='t') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='a') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='r') ) {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='g') ) {
                        int LA12_121 = input.LA(5);

                        if ( (LA12_121=='e') ) {
                            int LA12_148 = input.LA(6);

                            if ( (LA12_148=='t') ) {
                                int LA12_171 = input.LA(7);

                                if ( ((LA12_171>='0' && LA12_171<='9')||(LA12_171>='A' && LA12_171<='Z')||LA12_171=='_'||(LA12_171>='a' && LA12_171<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=30;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='w') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='o') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='r') ) {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='k') ) {
                        int LA12_122 = input.LA(5);

                        if ( (LA12_122=='d') ) {
                            int LA12_149 = input.LA(6);

                            if ( (LA12_149=='i') ) {
                                int LA12_172 = input.LA(7);

                                if ( (LA12_172=='r') ) {
                                    int LA12_195 = input.LA(8);

                                    if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                        alt12=35;
                                    }
                                    else {
                                        alt12=31;}
                                }
                                else {
                                    alt12=35;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=32;
        }
        else if ( (LA12_0=='b') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='u') ) {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='t') ) {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='t') ) {
                        int LA12_123 = input.LA(5);

                        if ( (LA12_123=='o') ) {
                            int LA12_150 = input.LA(6);

                            if ( (LA12_150=='n') ) {
                                int LA12_173 = input.LA(7);

                                if ( ((LA12_173>='0' && LA12_173<='9')||(LA12_173>='A' && LA12_173<='Z')||LA12_173=='_'||(LA12_173>='a' && LA12_173<='z')) ) {
                                    alt12=35;
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=35;}
                    }
                    else {
                        alt12=35;}
                }
                else {
                    alt12=35;}
            }
            else {
                alt12=35;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_21 = input.LA(2);

            if ( ((LA12_21>='A' && LA12_21<='Z')||LA12_21=='_'||(LA12_21>='a' && LA12_21<='z')) ) {
                alt12=35;
            }
            else {
                alt12=41;}
        }
        else if ( ((LA12_0>='B' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='m' && LA12_0<='n')||LA12_0=='q'||LA12_0=='v'||(LA12_0>='x' && LA12_0<='z')) ) {
            alt12=35;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=36;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_24 = input.LA(2);

            if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFE')) ) {
                alt12=37;
            }
            else {
                alt12=41;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_25 = input.LA(2);

            if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFE')) ) {
                alt12=37;
            }
            else {
                alt12=41;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=38;
                }
                break;
            case '/':
                {
                alt12=39;
                }
                break;
            default:
                alt12=41;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=40;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=41;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

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
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:146: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:154: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:163: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:175: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:191: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:207: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1:215: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}