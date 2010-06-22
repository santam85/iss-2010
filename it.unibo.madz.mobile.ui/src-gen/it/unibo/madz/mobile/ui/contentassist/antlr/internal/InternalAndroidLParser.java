package it.unibo.madz.mobile.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import it.unibo.madz.mobile.services.AndroidLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ServiceInterface'", "'Service'", "'implements'", "'Activity'", "'action'", "'callActivity'", "'forActiom'", "'execAction'", "'data'", "'category'", "'scheme'", "'host'", "'port'", "'path'", "'Application'", "'avd'", "'package'", "'entryActiviy'", "'target'", "'workdir'", "'.'", "'launchable'", "'button'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalAndroidLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g"; }


     
     	private AndroidLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AndroidLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleAndroidSystem
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:61:1: entryRuleAndroidSystem : ruleAndroidSystem EOF ;
    public final void entryRuleAndroidSystem() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:62:1: ( ruleAndroidSystem EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:63:1: ruleAndroidSystem EOF
            {
             before(grammarAccess.getAndroidSystemRule()); 
            pushFollow(FOLLOW_ruleAndroidSystem_in_entryRuleAndroidSystem61);
            ruleAndroidSystem();
            _fsp--;

             after(grammarAccess.getAndroidSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidSystem68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAndroidSystem


    // $ANTLR start ruleAndroidSystem
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:70:1: ruleAndroidSystem : ( ( rule__AndroidSystem__Group__0 ) ) ;
    public final void ruleAndroidSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:74:2: ( ( ( rule__AndroidSystem__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:75:1: ( ( rule__AndroidSystem__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:75:1: ( ( rule__AndroidSystem__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:76:1: ( rule__AndroidSystem__Group__0 )
            {
             before(grammarAccess.getAndroidSystemAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:77:1: ( rule__AndroidSystem__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:77:2: rule__AndroidSystem__Group__0
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__0_in_ruleAndroidSystem94);
            rule__AndroidSystem__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAndroidSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAndroidSystem


    // $ANTLR start entryRuleComponent
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:89:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:90:1: ( ruleComponent EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:91:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent121);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleComponent


    // $ANTLR start ruleComponent
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:98:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:102:2: ( ( ( rule__Component__Alternatives ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:103:1: ( ( rule__Component__Alternatives ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:103:1: ( ( rule__Component__Alternatives ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:104:1: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:105:1: ( rule__Component__Alternatives )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:105:2: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_rule__Component__Alternatives_in_ruleComponent154);
            rule__Component__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleComponent


    // $ANTLR start entryRuleServiceInterface
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:117:1: entryRuleServiceInterface : ruleServiceInterface EOF ;
    public final void entryRuleServiceInterface() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:118:1: ( ruleServiceInterface EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:119:1: ruleServiceInterface EOF
            {
             before(grammarAccess.getServiceInterfaceRule()); 
            pushFollow(FOLLOW_ruleServiceInterface_in_entryRuleServiceInterface181);
            ruleServiceInterface();
            _fsp--;

             after(grammarAccess.getServiceInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceInterface188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleServiceInterface


    // $ANTLR start ruleServiceInterface
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:126:1: ruleServiceInterface : ( ( rule__ServiceInterface__Group__0 ) ) ;
    public final void ruleServiceInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:130:2: ( ( ( rule__ServiceInterface__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:131:1: ( ( rule__ServiceInterface__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:131:1: ( ( rule__ServiceInterface__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:132:1: ( rule__ServiceInterface__Group__0 )
            {
             before(grammarAccess.getServiceInterfaceAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:133:1: ( rule__ServiceInterface__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:133:2: rule__ServiceInterface__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceInterface__Group__0_in_ruleServiceInterface214);
            rule__ServiceInterface__Group__0();
            _fsp--;


            }

             after(grammarAccess.getServiceInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleServiceInterface


    // $ANTLR start entryRuleService
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:145:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:146:1: ( ruleService EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:147:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService241);
            ruleService();
            _fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleService


    // $ANTLR start ruleService
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:154:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:158:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:159:1: ( ( rule__Service__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:159:1: ( ( rule__Service__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:160:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:161:1: ( rule__Service__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:161:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService274);
            rule__Service__Group__0();
            _fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleService


    // $ANTLR start entryRuleActivity
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:173:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:174:1: ( ruleActivity EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:175:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity301);
            ruleActivity();
            _fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleActivity


    // $ANTLR start ruleActivity
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:182:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:186:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:187:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:187:1: ( ( rule__Activity__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:188:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:189:1: ( rule__Activity__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:189:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity334);
            rule__Activity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleActivity


    // $ANTLR start entryRuleLocalAction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:201:1: entryRuleLocalAction : ruleLocalAction EOF ;
    public final void entryRuleLocalAction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:202:1: ( ruleLocalAction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:203:1: ruleLocalAction EOF
            {
             before(grammarAccess.getLocalActionRule()); 
            pushFollow(FOLLOW_ruleLocalAction_in_entryRuleLocalAction361);
            ruleLocalAction();
            _fsp--;

             after(grammarAccess.getLocalActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAction368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLocalAction


    // $ANTLR start ruleLocalAction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:210:1: ruleLocalAction : ( ( rule__LocalAction__Group__0 ) ) ;
    public final void ruleLocalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:214:2: ( ( ( rule__LocalAction__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:215:1: ( ( rule__LocalAction__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:215:1: ( ( rule__LocalAction__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:216:1: ( rule__LocalAction__Group__0 )
            {
             before(grammarAccess.getLocalActionAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:217:1: ( rule__LocalAction__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:217:2: rule__LocalAction__Group__0
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__0_in_ruleLocalAction394);
            rule__LocalAction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLocalActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLocalAction


    // $ANTLR start entryRuleInterAction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:229:1: entryRuleInterAction : ruleInterAction EOF ;
    public final void entryRuleInterAction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:230:1: ( ruleInterAction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:231:1: ruleInterAction EOF
            {
             before(grammarAccess.getInterActionRule()); 
            pushFollow(FOLLOW_ruleInterAction_in_entryRuleInterAction421);
            ruleInterAction();
            _fsp--;

             after(grammarAccess.getInterActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterAction428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleInterAction


    // $ANTLR start ruleInterAction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:238:1: ruleInterAction : ( ( rule__InterAction__Alternatives ) ) ;
    public final void ruleInterAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:242:2: ( ( ( rule__InterAction__Alternatives ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:243:1: ( ( rule__InterAction__Alternatives ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:243:1: ( ( rule__InterAction__Alternatives ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:244:1: ( rule__InterAction__Alternatives )
            {
             before(grammarAccess.getInterActionAccess().getAlternatives()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:245:1: ( rule__InterAction__Alternatives )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:245:2: rule__InterAction__Alternatives
            {
            pushFollow(FOLLOW_rule__InterAction__Alternatives_in_ruleInterAction454);
            rule__InterAction__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getInterActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleInterAction


    // $ANTLR start entryRuleExplicitInteraction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:257:1: entryRuleExplicitInteraction : ruleExplicitInteraction EOF ;
    public final void entryRuleExplicitInteraction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:258:1: ( ruleExplicitInteraction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:259:1: ruleExplicitInteraction EOF
            {
             before(grammarAccess.getExplicitInteractionRule()); 
            pushFollow(FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction481);
            ruleExplicitInteraction();
            _fsp--;

             after(grammarAccess.getExplicitInteractionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteraction488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExplicitInteraction


    // $ANTLR start ruleExplicitInteraction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:266:1: ruleExplicitInteraction : ( ruleExplicitInteractionActivity ) ;
    public final void ruleExplicitInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:270:2: ( ( ruleExplicitInteractionActivity ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:271:1: ( ruleExplicitInteractionActivity )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:271:1: ( ruleExplicitInteractionActivity )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:272:1: ruleExplicitInteractionActivity
            {
             before(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionActivityParserRuleCall()); 
            pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_ruleExplicitInteraction514);
            ruleExplicitInteractionActivity();
            _fsp--;

             after(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionActivityParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExplicitInteraction


    // $ANTLR start entryRuleExplicitInteractionActivity
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:285:1: entryRuleExplicitInteractionActivity : ruleExplicitInteractionActivity EOF ;
    public final void entryRuleExplicitInteractionActivity() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:286:1: ( ruleExplicitInteractionActivity EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:287:1: ruleExplicitInteractionActivity EOF
            {
             before(grammarAccess.getExplicitInteractionActivityRule()); 
            pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity540);
            ruleExplicitInteractionActivity();
            _fsp--;

             after(grammarAccess.getExplicitInteractionActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteractionActivity547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExplicitInteractionActivity


    // $ANTLR start ruleExplicitInteractionActivity
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:294:1: ruleExplicitInteractionActivity : ( ( rule__ExplicitInteractionActivity__Group__0 ) ) ;
    public final void ruleExplicitInteractionActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:298:2: ( ( ( rule__ExplicitInteractionActivity__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:299:1: ( ( rule__ExplicitInteractionActivity__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:299:1: ( ( rule__ExplicitInteractionActivity__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:300:1: ( rule__ExplicitInteractionActivity__Group__0 )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:301:1: ( rule__ExplicitInteractionActivity__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:301:2: rule__ExplicitInteractionActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__0_in_ruleExplicitInteractionActivity573);
            rule__ExplicitInteractionActivity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExplicitInteractionActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExplicitInteractionActivity


    // $ANTLR start entryRuleActionOnlyInteraction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:313:1: entryRuleActionOnlyInteraction : ruleActionOnlyInteraction EOF ;
    public final void entryRuleActionOnlyInteraction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:314:1: ( ruleActionOnlyInteraction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:315:1: ruleActionOnlyInteraction EOF
            {
             before(grammarAccess.getActionOnlyInteractionRule()); 
            pushFollow(FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction600);
            ruleActionOnlyInteraction();
            _fsp--;

             after(grammarAccess.getActionOnlyInteractionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionOnlyInteraction607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleActionOnlyInteraction


    // $ANTLR start ruleActionOnlyInteraction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:322:1: ruleActionOnlyInteraction : ( ( rule__ActionOnlyInteraction__Group__0 ) ) ;
    public final void ruleActionOnlyInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:326:2: ( ( ( rule__ActionOnlyInteraction__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:327:1: ( ( rule__ActionOnlyInteraction__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:327:1: ( ( rule__ActionOnlyInteraction__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:328:1: ( rule__ActionOnlyInteraction__Group__0 )
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:329:1: ( rule__ActionOnlyInteraction__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:329:2: rule__ActionOnlyInteraction__Group__0
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__0_in_ruleActionOnlyInteraction633);
            rule__ActionOnlyInteraction__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActionOnlyInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleActionOnlyInteraction


    // $ANTLR start entryRuleAction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:341:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:342:1: ( ruleAction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:343:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction660);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:350:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:354:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:355:1: ( ( rule__Action__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:355:1: ( ( rule__Action__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:356:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:357:1: ( rule__Action__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:357:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction693);
            rule__Action__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleData
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:369:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:370:1: ( ruleData EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:371:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData720);
            ruleData();
            _fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleData


    // $ANTLR start ruleData
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:378:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:382:2: ( ( ( rule__Data__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:383:1: ( ( rule__Data__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:383:1: ( ( rule__Data__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:384:1: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:385:1: ( rule__Data__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:385:2: rule__Data__Group__0
            {
            pushFollow(FOLLOW_rule__Data__Group__0_in_ruleData753);
            rule__Data__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleData


    // $ANTLR start entryRuleApplication
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:397:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:398:1: ( ruleApplication EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:399:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication780);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:406:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:410:2: ( ( ( rule__Application__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:411:1: ( ( rule__Application__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:411:1: ( ( rule__Application__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:412:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:413:1: ( rule__Application__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:413:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication813);
            rule__Application__Group__0();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleURI
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:425:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:426:1: ( ruleURI EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:427:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI840);
            ruleURI();
            _fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleURI


    // $ANTLR start ruleURI
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:434:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:438:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:439:1: ( ( rule__URI__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:439:1: ( ( rule__URI__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:440:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:441:1: ( rule__URI__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:441:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI873);
            rule__URI__Group__0();
            _fsp--;


            }

             after(grammarAccess.getURIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleURI


    // $ANTLR start entryRuleRestUri
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:453:1: entryRuleRestUri : ruleRestUri EOF ;
    public final void entryRuleRestUri() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:454:1: ( ruleRestUri EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:455:1: ruleRestUri EOF
            {
             before(grammarAccess.getRestUriRule()); 
            pushFollow(FOLLOW_ruleRestUri_in_entryRuleRestUri900);
            ruleRestUri();
            _fsp--;

             after(grammarAccess.getRestUriRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestUri907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRestUri


    // $ANTLR start ruleRestUri
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:462:1: ruleRestUri : ( ( rule__RestUri__Alternatives ) ) ;
    public final void ruleRestUri() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:466:2: ( ( ( rule__RestUri__Alternatives ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:467:1: ( ( rule__RestUri__Alternatives ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:467:1: ( ( rule__RestUri__Alternatives ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:468:1: ( rule__RestUri__Alternatives )
            {
             before(grammarAccess.getRestUriAccess().getAlternatives()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:469:1: ( rule__RestUri__Alternatives )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:469:2: rule__RestUri__Alternatives
            {
            pushFollow(FOLLOW_rule__RestUri__Alternatives_in_ruleRestUri933);
            rule__RestUri__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getRestUriAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRestUri


    // $ANTLR start rule__Component__Alternatives
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:481:1: rule__Component__Alternatives : ( ( ruleActivity ) | ( ruleService ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:485:1: ( ( ruleActivity ) | ( ruleService ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("481:1: rule__Component__Alternatives : ( ( ruleActivity ) | ( ruleService ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:486:1: ( ruleActivity )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:486:1: ( ruleActivity )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:487:1: ruleActivity
                    {
                     before(grammarAccess.getComponentAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActivity_in_rule__Component__Alternatives969);
                    ruleActivity();
                    _fsp--;

                     after(grammarAccess.getComponentAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:492:6: ( ruleService )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:492:6: ( ruleService )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:493:1: ruleService
                    {
                     before(grammarAccess.getComponentAccess().getServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleService_in_rule__Component__Alternatives986);
                    ruleService();
                    _fsp--;

                     after(grammarAccess.getComponentAccess().getServiceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Component__Alternatives


    // $ANTLR start rule__InterAction__Alternatives
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:503:1: rule__InterAction__Alternatives : ( ( ( rule__InterAction__Group_0__0 ) ) | ( ( rule__InterAction__Group_1__0 ) ) );
    public final void rule__InterAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:507:1: ( ( ( rule__InterAction__Group_0__0 ) ) | ( ( rule__InterAction__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("503:1: rule__InterAction__Alternatives : ( ( ( rule__InterAction__Group_0__0 ) ) | ( ( rule__InterAction__Group_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:508:1: ( ( rule__InterAction__Group_0__0 ) )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:508:1: ( ( rule__InterAction__Group_0__0 ) )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:509:1: ( rule__InterAction__Group_0__0 )
                    {
                     before(grammarAccess.getInterActionAccess().getGroup_0()); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:510:1: ( rule__InterAction__Group_0__0 )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:510:2: rule__InterAction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InterAction__Group_0__0_in_rule__InterAction__Alternatives1018);
                    rule__InterAction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getInterActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:514:6: ( ( rule__InterAction__Group_1__0 ) )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:514:6: ( ( rule__InterAction__Group_1__0 ) )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:515:1: ( rule__InterAction__Group_1__0 )
                    {
                     before(grammarAccess.getInterActionAccess().getGroup_1()); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:516:1: ( rule__InterAction__Group_1__0 )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:516:2: rule__InterAction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InterAction__Group_1__0_in_rule__InterAction__Alternatives1036);
                    rule__InterAction__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getInterActionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__Alternatives


    // $ANTLR start rule__RestUri__Alternatives
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:525:1: rule__RestUri__Alternatives : ( ( RULE_ID ) | ( ruleURI ) );
    public final void rule__RestUri__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:529:1: ( ( RULE_ID ) | ( ruleURI ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==28) ) {
                    alt3=1;
                }
                else if ( (LA3_1==31) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("525:1: rule__RestUri__Alternatives : ( ( RULE_ID ) | ( ruleURI ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("525:1: rule__RestUri__Alternatives : ( ( RULE_ID ) | ( ruleURI ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:530:1: ( RULE_ID )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:530:1: ( RULE_ID )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:531:1: RULE_ID
                    {
                     before(grammarAccess.getRestUriAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RestUri__Alternatives1069); 
                     after(grammarAccess.getRestUriAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:536:6: ( ruleURI )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:536:6: ( ruleURI )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:537:1: ruleURI
                    {
                     before(grammarAccess.getRestUriAccess().getURIParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleURI_in_rule__RestUri__Alternatives1086);
                    ruleURI();
                    _fsp--;

                     after(grammarAccess.getRestUriAccess().getURIParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__RestUri__Alternatives


    // $ANTLR start rule__AndroidSystem__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:549:1: rule__AndroidSystem__Group__0 : rule__AndroidSystem__Group__0__Impl rule__AndroidSystem__Group__1 ;
    public final void rule__AndroidSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:553:1: ( rule__AndroidSystem__Group__0__Impl rule__AndroidSystem__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:554:2: rule__AndroidSystem__Group__0__Impl rule__AndroidSystem__Group__1
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__0__Impl_in_rule__AndroidSystem__Group__01116);
            rule__AndroidSystem__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__1_in_rule__AndroidSystem__Group__01119);
            rule__AndroidSystem__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__0


    // $ANTLR start rule__AndroidSystem__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:561:1: rule__AndroidSystem__Group__0__Impl : ( ( rule__AndroidSystem__DataAssignment_0 )* ) ;
    public final void rule__AndroidSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:565:1: ( ( ( rule__AndroidSystem__DataAssignment_0 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:566:1: ( ( rule__AndroidSystem__DataAssignment_0 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:566:1: ( ( rule__AndroidSystem__DataAssignment_0 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:567:1: ( rule__AndroidSystem__DataAssignment_0 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getDataAssignment_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:568:1: ( rule__AndroidSystem__DataAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:568:2: rule__AndroidSystem__DataAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__DataAssignment_0_in_rule__AndroidSystem__Group__0__Impl1146);
            	    rule__AndroidSystem__DataAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAndroidSystemAccess().getDataAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__0__Impl


    // $ANTLR start rule__AndroidSystem__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:578:1: rule__AndroidSystem__Group__1 : rule__AndroidSystem__Group__1__Impl rule__AndroidSystem__Group__2 ;
    public final void rule__AndroidSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:582:1: ( rule__AndroidSystem__Group__1__Impl rule__AndroidSystem__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:583:2: rule__AndroidSystem__Group__1__Impl rule__AndroidSystem__Group__2
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__1__Impl_in_rule__AndroidSystem__Group__11177);
            rule__AndroidSystem__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__2_in_rule__AndroidSystem__Group__11180);
            rule__AndroidSystem__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__1


    // $ANTLR start rule__AndroidSystem__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:590:1: rule__AndroidSystem__Group__1__Impl : ( ( rule__AndroidSystem__ActionAssignment_1 )* ) ;
    public final void rule__AndroidSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:594:1: ( ( ( rule__AndroidSystem__ActionAssignment_1 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:595:1: ( ( rule__AndroidSystem__ActionAssignment_1 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:595:1: ( ( rule__AndroidSystem__ActionAssignment_1 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:596:1: ( rule__AndroidSystem__ActionAssignment_1 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getActionAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:597:1: ( rule__AndroidSystem__ActionAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:597:2: rule__AndroidSystem__ActionAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__ActionAssignment_1_in_rule__AndroidSystem__Group__1__Impl1207);
            	    rule__AndroidSystem__ActionAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAndroidSystemAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__1__Impl


    // $ANTLR start rule__AndroidSystem__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:607:1: rule__AndroidSystem__Group__2 : rule__AndroidSystem__Group__2__Impl rule__AndroidSystem__Group__3 ;
    public final void rule__AndroidSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:611:1: ( rule__AndroidSystem__Group__2__Impl rule__AndroidSystem__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:612:2: rule__AndroidSystem__Group__2__Impl rule__AndroidSystem__Group__3
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__2__Impl_in_rule__AndroidSystem__Group__21238);
            rule__AndroidSystem__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__3_in_rule__AndroidSystem__Group__21241);
            rule__AndroidSystem__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__2


    // $ANTLR start rule__AndroidSystem__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:619:1: rule__AndroidSystem__Group__2__Impl : ( ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )* ) ;
    public final void rule__AndroidSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:623:1: ( ( ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:624:1: ( ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:624:1: ( ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:625:1: ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getServiceInterfaceAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:626:1: ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:626:2: rule__AndroidSystem__ServiceInterfaceAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__ServiceInterfaceAssignment_2_in_rule__AndroidSystem__Group__2__Impl1268);
            	    rule__AndroidSystem__ServiceInterfaceAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAndroidSystemAccess().getServiceInterfaceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__2__Impl


    // $ANTLR start rule__AndroidSystem__Group__3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:636:1: rule__AndroidSystem__Group__3 : rule__AndroidSystem__Group__3__Impl rule__AndroidSystem__Group__4 ;
    public final void rule__AndroidSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:640:1: ( rule__AndroidSystem__Group__3__Impl rule__AndroidSystem__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:641:2: rule__AndroidSystem__Group__3__Impl rule__AndroidSystem__Group__4
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__3__Impl_in_rule__AndroidSystem__Group__31299);
            rule__AndroidSystem__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__4_in_rule__AndroidSystem__Group__31302);
            rule__AndroidSystem__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__3


    // $ANTLR start rule__AndroidSystem__Group__3__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:648:1: rule__AndroidSystem__Group__3__Impl : ( ( rule__AndroidSystem__ComponentAssignment_3 )* ) ;
    public final void rule__AndroidSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:652:1: ( ( ( rule__AndroidSystem__ComponentAssignment_3 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:653:1: ( ( rule__AndroidSystem__ComponentAssignment_3 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:653:1: ( ( rule__AndroidSystem__ComponentAssignment_3 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:654:1: ( rule__AndroidSystem__ComponentAssignment_3 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getComponentAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:655:1: ( rule__AndroidSystem__ComponentAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12||LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:655:2: rule__AndroidSystem__ComponentAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__ComponentAssignment_3_in_rule__AndroidSystem__Group__3__Impl1329);
            	    rule__AndroidSystem__ComponentAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAndroidSystemAccess().getComponentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__3__Impl


    // $ANTLR start rule__AndroidSystem__Group__4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:665:1: rule__AndroidSystem__Group__4 : rule__AndroidSystem__Group__4__Impl ;
    public final void rule__AndroidSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:669:1: ( rule__AndroidSystem__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:670:2: rule__AndroidSystem__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__4__Impl_in_rule__AndroidSystem__Group__41360);
            rule__AndroidSystem__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__4


    // $ANTLR start rule__AndroidSystem__Group__4__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:676:1: rule__AndroidSystem__Group__4__Impl : ( ( rule__AndroidSystem__ApplicationAssignment_4 ) ) ;
    public final void rule__AndroidSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:680:1: ( ( ( rule__AndroidSystem__ApplicationAssignment_4 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:681:1: ( ( rule__AndroidSystem__ApplicationAssignment_4 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:681:1: ( ( rule__AndroidSystem__ApplicationAssignment_4 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:682:1: ( rule__AndroidSystem__ApplicationAssignment_4 )
            {
             before(grammarAccess.getAndroidSystemAccess().getApplicationAssignment_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:683:1: ( rule__AndroidSystem__ApplicationAssignment_4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:683:2: rule__AndroidSystem__ApplicationAssignment_4
            {
            pushFollow(FOLLOW_rule__AndroidSystem__ApplicationAssignment_4_in_rule__AndroidSystem__Group__4__Impl1387);
            rule__AndroidSystem__ApplicationAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAndroidSystemAccess().getApplicationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__4__Impl


    // $ANTLR start rule__ServiceInterface__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:703:1: rule__ServiceInterface__Group__0 : rule__ServiceInterface__Group__0__Impl rule__ServiceInterface__Group__1 ;
    public final void rule__ServiceInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:707:1: ( rule__ServiceInterface__Group__0__Impl rule__ServiceInterface__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:708:2: rule__ServiceInterface__Group__0__Impl rule__ServiceInterface__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceInterface__Group__0__Impl_in_rule__ServiceInterface__Group__01427);
            rule__ServiceInterface__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ServiceInterface__Group__1_in_rule__ServiceInterface__Group__01430);
            rule__ServiceInterface__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceInterface__Group__0


    // $ANTLR start rule__ServiceInterface__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:715:1: rule__ServiceInterface__Group__0__Impl : ( 'ServiceInterface' ) ;
    public final void rule__ServiceInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:719:1: ( ( 'ServiceInterface' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:720:1: ( 'ServiceInterface' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:720:1: ( 'ServiceInterface' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:721:1: 'ServiceInterface'
            {
             before(grammarAccess.getServiceInterfaceAccess().getServiceInterfaceKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__ServiceInterface__Group__0__Impl1458); 
             after(grammarAccess.getServiceInterfaceAccess().getServiceInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceInterface__Group__0__Impl


    // $ANTLR start rule__ServiceInterface__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:734:1: rule__ServiceInterface__Group__1 : rule__ServiceInterface__Group__1__Impl ;
    public final void rule__ServiceInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:738:1: ( rule__ServiceInterface__Group__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:739:2: rule__ServiceInterface__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ServiceInterface__Group__1__Impl_in_rule__ServiceInterface__Group__11489);
            rule__ServiceInterface__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceInterface__Group__1


    // $ANTLR start rule__ServiceInterface__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:745:1: rule__ServiceInterface__Group__1__Impl : ( ( rule__ServiceInterface__NameAssignment_1 ) ) ;
    public final void rule__ServiceInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:749:1: ( ( ( rule__ServiceInterface__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:750:1: ( ( rule__ServiceInterface__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:750:1: ( ( rule__ServiceInterface__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:751:1: ( rule__ServiceInterface__NameAssignment_1 )
            {
             before(grammarAccess.getServiceInterfaceAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:752:1: ( rule__ServiceInterface__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:752:2: rule__ServiceInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceInterface__NameAssignment_1_in_rule__ServiceInterface__Group__1__Impl1516);
            rule__ServiceInterface__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getServiceInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceInterface__Group__1__Impl


    // $ANTLR start rule__Service__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:766:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:770:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:771:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__01550);
            rule__Service__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__01553);
            rule__Service__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__0


    // $ANTLR start rule__Service__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:778:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:782:1: ( ( 'Service' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:783:1: ( 'Service' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:783:1: ( 'Service' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:784:1: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Service__Group__0__Impl1581); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__0__Impl


    // $ANTLR start rule__Service__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:797:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:801:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:802:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__11612);
            rule__Service__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__11615);
            rule__Service__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__1


    // $ANTLR start rule__Service__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:809:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:813:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:814:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:814:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:815:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:816:1: ( rule__Service__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:816:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl1642);
            rule__Service__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__1__Impl


    // $ANTLR start rule__Service__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:826:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:830:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:831:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__21672);
            rule__Service__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__21675);
            rule__Service__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__2


    // $ANTLR start rule__Service__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:838:1: rule__Service__Group__2__Impl : ( 'implements' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:842:1: ( ( 'implements' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:843:1: ( 'implements' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:843:1: ( 'implements' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:844:1: 'implements'
            {
             before(grammarAccess.getServiceAccess().getImplementsKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Service__Group__2__Impl1703); 
             after(grammarAccess.getServiceAccess().getImplementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__2__Impl


    // $ANTLR start rule__Service__Group__3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:857:1: rule__Service__Group__3 : rule__Service__Group__3__Impl ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:861:1: ( rule__Service__Group__3__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:862:2: rule__Service__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__31734);
            rule__Service__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__3


    // $ANTLR start rule__Service__Group__3__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:868:1: rule__Service__Group__3__Impl : ( ( rule__Service__InterfaceAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:872:1: ( ( ( rule__Service__InterfaceAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:873:1: ( ( rule__Service__InterfaceAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:873:1: ( ( rule__Service__InterfaceAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:874:1: ( rule__Service__InterfaceAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getInterfaceAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:875:1: ( rule__Service__InterfaceAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:875:2: rule__Service__InterfaceAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__InterfaceAssignment_3_in_rule__Service__Group__3__Impl1761);
            rule__Service__InterfaceAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getServiceAccess().getInterfaceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__Group__3__Impl


    // $ANTLR start rule__Activity__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:893:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:897:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:898:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__01799);
            rule__Activity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__01802);
            rule__Activity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__0


    // $ANTLR start rule__Activity__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:905:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:909:1: ( ( 'Activity' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:910:1: ( 'Activity' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:910:1: ( 'Activity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:911:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Activity__Group__0__Impl1830); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__0__Impl


    // $ANTLR start rule__Activity__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:924:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:928:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:929:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__11861);
            rule__Activity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__11864);
            rule__Activity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__1


    // $ANTLR start rule__Activity__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:936:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:940:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:941:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:941:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:942:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:943:1: ( rule__Activity__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:943:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl1891);
            rule__Activity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__1__Impl


    // $ANTLR start rule__Activity__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:953:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:957:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:958:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__21921);
            rule__Activity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__21924);
            rule__Activity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__2


    // $ANTLR start rule__Activity__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:965:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__LaunchableAssignment_2 )? ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:969:1: ( ( ( rule__Activity__LaunchableAssignment_2 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:970:1: ( ( rule__Activity__LaunchableAssignment_2 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:970:1: ( ( rule__Activity__LaunchableAssignment_2 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:971:1: ( rule__Activity__LaunchableAssignment_2 )?
            {
             before(grammarAccess.getActivityAccess().getLaunchableAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:972:1: ( rule__Activity__LaunchableAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:972:2: rule__Activity__LaunchableAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Activity__LaunchableAssignment_2_in_rule__Activity__Group__2__Impl1951);
                    rule__Activity__LaunchableAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getLaunchableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__2__Impl


    // $ANTLR start rule__Activity__Group__3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:982:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:986:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:987:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__31982);
            rule__Activity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__31985);
            rule__Activity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__3


    // $ANTLR start rule__Activity__Group__3__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:994:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__ActionsAssignment_3 )* ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:998:1: ( ( ( rule__Activity__ActionsAssignment_3 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:999:1: ( ( rule__Activity__ActionsAssignment_3 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:999:1: ( ( rule__Activity__ActionsAssignment_3 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1000:1: ( rule__Activity__ActionsAssignment_3 )*
            {
             before(grammarAccess.getActivityAccess().getActionsAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1001:1: ( rule__Activity__ActionsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1001:2: rule__Activity__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Activity__ActionsAssignment_3_in_rule__Activity__Group__3__Impl2012);
            	    rule__Activity__ActionsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__3__Impl


    // $ANTLR start rule__Activity__Group__4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1011:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1015:1: ( rule__Activity__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1016:2: rule__Activity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42043);
            rule__Activity__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__4


    // $ANTLR start rule__Activity__Group__4__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1022:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__InteractionsAssignment_4 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1026:1: ( ( ( rule__Activity__InteractionsAssignment_4 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1027:1: ( ( rule__Activity__InteractionsAssignment_4 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1027:1: ( ( rule__Activity__InteractionsAssignment_4 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1028:1: ( rule__Activity__InteractionsAssignment_4 )*
            {
             before(grammarAccess.getActivityAccess().getInteractionsAssignment_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1029:1: ( rule__Activity__InteractionsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16||LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1029:2: rule__Activity__InteractionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Activity__InteractionsAssignment_4_in_rule__Activity__Group__4__Impl2070);
            	    rule__Activity__InteractionsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getInteractionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__4__Impl


    // $ANTLR start rule__LocalAction__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1049:1: rule__LocalAction__Group__0 : rule__LocalAction__Group__0__Impl rule__LocalAction__Group__1 ;
    public final void rule__LocalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1053:1: ( rule__LocalAction__Group__0__Impl rule__LocalAction__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1054:2: rule__LocalAction__Group__0__Impl rule__LocalAction__Group__1
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__0__Impl_in_rule__LocalAction__Group__02111);
            rule__LocalAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalAction__Group__1_in_rule__LocalAction__Group__02114);
            rule__LocalAction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LocalAction__Group__0


    // $ANTLR start rule__LocalAction__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1061:1: rule__LocalAction__Group__0__Impl : ( 'action' ) ;
    public final void rule__LocalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1065:1: ( ( 'action' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1066:1: ( 'action' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1066:1: ( 'action' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1067:1: 'action'
            {
             before(grammarAccess.getLocalActionAccess().getActionKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__LocalAction__Group__0__Impl2142); 
             after(grammarAccess.getLocalActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LocalAction__Group__0__Impl


    // $ANTLR start rule__LocalAction__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1080:1: rule__LocalAction__Group__1 : rule__LocalAction__Group__1__Impl rule__LocalAction__Group__2 ;
    public final void rule__LocalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1084:1: ( rule__LocalAction__Group__1__Impl rule__LocalAction__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1085:2: rule__LocalAction__Group__1__Impl rule__LocalAction__Group__2
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__1__Impl_in_rule__LocalAction__Group__12173);
            rule__LocalAction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalAction__Group__2_in_rule__LocalAction__Group__12176);
            rule__LocalAction__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LocalAction__Group__1


    // $ANTLR start rule__LocalAction__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1092:1: rule__LocalAction__Group__1__Impl : ( ( rule__LocalAction__ActionAssignment_1 ) ) ;
    public final void rule__LocalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1096:1: ( ( ( rule__LocalAction__ActionAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1097:1: ( ( rule__LocalAction__ActionAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1097:1: ( ( rule__LocalAction__ActionAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1098:1: ( rule__LocalAction__ActionAssignment_1 )
            {
             before(grammarAccess.getLocalActionAccess().getActionAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1099:1: ( rule__LocalAction__ActionAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1099:2: rule__LocalAction__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__LocalAction__ActionAssignment_1_in_rule__LocalAction__Group__1__Impl2203);
            rule__LocalAction__ActionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLocalActionAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LocalAction__Group__1__Impl


    // $ANTLR start rule__LocalAction__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1109:1: rule__LocalAction__Group__2 : rule__LocalAction__Group__2__Impl ;
    public final void rule__LocalAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1113:1: ( rule__LocalAction__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1114:2: rule__LocalAction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__2__Impl_in_rule__LocalAction__Group__22233);
            rule__LocalAction__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LocalAction__Group__2


    // $ANTLR start rule__LocalAction__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1120:1: rule__LocalAction__Group__2__Impl : ( ( rule__LocalAction__ButtonAssignment_2 )? ) ;
    public final void rule__LocalAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1124:1: ( ( ( rule__LocalAction__ButtonAssignment_2 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1125:1: ( ( rule__LocalAction__ButtonAssignment_2 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1125:1: ( ( rule__LocalAction__ButtonAssignment_2 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1126:1: ( rule__LocalAction__ButtonAssignment_2 )?
            {
             before(grammarAccess.getLocalActionAccess().getButtonAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1127:1: ( rule__LocalAction__ButtonAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1127:2: rule__LocalAction__ButtonAssignment_2
                    {
                    pushFollow(FOLLOW_rule__LocalAction__ButtonAssignment_2_in_rule__LocalAction__Group__2__Impl2260);
                    rule__LocalAction__ButtonAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalActionAccess().getButtonAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LocalAction__Group__2__Impl


    // $ANTLR start rule__InterAction__Group_0__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1143:1: rule__InterAction__Group_0__0 : rule__InterAction__Group_0__0__Impl rule__InterAction__Group_0__1 ;
    public final void rule__InterAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1147:1: ( rule__InterAction__Group_0__0__Impl rule__InterAction__Group_0__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1148:2: rule__InterAction__Group_0__0__Impl rule__InterAction__Group_0__1
            {
            pushFollow(FOLLOW_rule__InterAction__Group_0__0__Impl_in_rule__InterAction__Group_0__02297);
            rule__InterAction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InterAction__Group_0__1_in_rule__InterAction__Group_0__02300);
            rule__InterAction__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__Group_0__0


    // $ANTLR start rule__InterAction__Group_0__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1155:1: rule__InterAction__Group_0__0__Impl : ( ruleExplicitInteraction ) ;
    public final void rule__InterAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1159:1: ( ( ruleExplicitInteraction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1160:1: ( ruleExplicitInteraction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1160:1: ( ruleExplicitInteraction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1161:1: ruleExplicitInteraction
            {
             before(grammarAccess.getInterActionAccess().getExplicitInteractionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExplicitInteraction_in_rule__InterAction__Group_0__0__Impl2327);
            ruleExplicitInteraction();
            _fsp--;

             after(grammarAccess.getInterActionAccess().getExplicitInteractionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__Group_0__0__Impl


    // $ANTLR start rule__InterAction__Group_0__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1172:1: rule__InterAction__Group_0__1 : rule__InterAction__Group_0__1__Impl ;
    public final void rule__InterAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1176:1: ( rule__InterAction__Group_0__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1177:2: rule__InterAction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__InterAction__Group_0__1__Impl_in_rule__InterAction__Group_0__12356);
            rule__InterAction__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__Group_0__1


    // $ANTLR start rule__InterAction__Group_0__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1183:1: rule__InterAction__Group_0__1__Impl : ( ( rule__InterAction__ButtonAssignment_0_1 )? ) ;
    public final void rule__InterAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1187:1: ( ( ( rule__InterAction__ButtonAssignment_0_1 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1188:1: ( ( rule__InterAction__ButtonAssignment_0_1 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1188:1: ( ( rule__InterAction__ButtonAssignment_0_1 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1189:1: ( rule__InterAction__ButtonAssignment_0_1 )?
            {
             before(grammarAccess.getInterActionAccess().getButtonAssignment_0_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1190:1: ( rule__InterAction__ButtonAssignment_0_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1190:2: rule__InterAction__ButtonAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__InterAction__ButtonAssignment_0_1_in_rule__InterAction__Group_0__1__Impl2383);
                    rule__InterAction__ButtonAssignment_0_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterActionAccess().getButtonAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__Group_0__1__Impl


    // $ANTLR start rule__InterAction__Group_1__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1204:1: rule__InterAction__Group_1__0 : rule__InterAction__Group_1__0__Impl rule__InterAction__Group_1__1 ;
    public final void rule__InterAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1208:1: ( rule__InterAction__Group_1__0__Impl rule__InterAction__Group_1__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1209:2: rule__InterAction__Group_1__0__Impl rule__InterAction__Group_1__1
            {
            pushFollow(FOLLOW_rule__InterAction__Group_1__0__Impl_in_rule__InterAction__Group_1__02418);
            rule__InterAction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InterAction__Group_1__1_in_rule__InterAction__Group_1__02421);
            rule__InterAction__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__Group_1__0


    // $ANTLR start rule__InterAction__Group_1__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1216:1: rule__InterAction__Group_1__0__Impl : ( ruleActionOnlyInteraction ) ;
    public final void rule__InterAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1220:1: ( ( ruleActionOnlyInteraction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1221:1: ( ruleActionOnlyInteraction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1221:1: ( ruleActionOnlyInteraction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1222:1: ruleActionOnlyInteraction
            {
             before(grammarAccess.getInterActionAccess().getActionOnlyInteractionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleActionOnlyInteraction_in_rule__InterAction__Group_1__0__Impl2448);
            ruleActionOnlyInteraction();
            _fsp--;

             after(grammarAccess.getInterActionAccess().getActionOnlyInteractionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__Group_1__0__Impl


    // $ANTLR start rule__InterAction__Group_1__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1233:1: rule__InterAction__Group_1__1 : rule__InterAction__Group_1__1__Impl ;
    public final void rule__InterAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1237:1: ( rule__InterAction__Group_1__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1238:2: rule__InterAction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InterAction__Group_1__1__Impl_in_rule__InterAction__Group_1__12477);
            rule__InterAction__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__Group_1__1


    // $ANTLR start rule__InterAction__Group_1__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1244:1: rule__InterAction__Group_1__1__Impl : ( ( rule__InterAction__ButtonAssignment_1_1 )? ) ;
    public final void rule__InterAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1248:1: ( ( ( rule__InterAction__ButtonAssignment_1_1 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1249:1: ( ( rule__InterAction__ButtonAssignment_1_1 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1249:1: ( ( rule__InterAction__ButtonAssignment_1_1 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1250:1: ( rule__InterAction__ButtonAssignment_1_1 )?
            {
             before(grammarAccess.getInterActionAccess().getButtonAssignment_1_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1251:1: ( rule__InterAction__ButtonAssignment_1_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1251:2: rule__InterAction__ButtonAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__InterAction__ButtonAssignment_1_1_in_rule__InterAction__Group_1__1__Impl2504);
                    rule__InterAction__ButtonAssignment_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterActionAccess().getButtonAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__Group_1__1__Impl


    // $ANTLR start rule__ExplicitInteractionActivity__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1265:1: rule__ExplicitInteractionActivity__Group__0 : rule__ExplicitInteractionActivity__Group__0__Impl rule__ExplicitInteractionActivity__Group__1 ;
    public final void rule__ExplicitInteractionActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1269:1: ( rule__ExplicitInteractionActivity__Group__0__Impl rule__ExplicitInteractionActivity__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1270:2: rule__ExplicitInteractionActivity__Group__0__Impl rule__ExplicitInteractionActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__0__Impl_in_rule__ExplicitInteractionActivity__Group__02539);
            rule__ExplicitInteractionActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__1_in_rule__ExplicitInteractionActivity__Group__02542);
            rule__ExplicitInteractionActivity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group__0


    // $ANTLR start rule__ExplicitInteractionActivity__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1277:1: rule__ExplicitInteractionActivity__Group__0__Impl : ( 'callActivity' ) ;
    public final void rule__ExplicitInteractionActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1281:1: ( ( 'callActivity' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1282:1: ( 'callActivity' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1282:1: ( 'callActivity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1283:1: 'callActivity'
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getCallActivityKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__ExplicitInteractionActivity__Group__0__Impl2570); 
             after(grammarAccess.getExplicitInteractionActivityAccess().getCallActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group__0__Impl


    // $ANTLR start rule__ExplicitInteractionActivity__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1296:1: rule__ExplicitInteractionActivity__Group__1 : rule__ExplicitInteractionActivity__Group__1__Impl rule__ExplicitInteractionActivity__Group__2 ;
    public final void rule__ExplicitInteractionActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1300:1: ( rule__ExplicitInteractionActivity__Group__1__Impl rule__ExplicitInteractionActivity__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1301:2: rule__ExplicitInteractionActivity__Group__1__Impl rule__ExplicitInteractionActivity__Group__2
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__1__Impl_in_rule__ExplicitInteractionActivity__Group__12601);
            rule__ExplicitInteractionActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__2_in_rule__ExplicitInteractionActivity__Group__12604);
            rule__ExplicitInteractionActivity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group__1


    // $ANTLR start rule__ExplicitInteractionActivity__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1308:1: rule__ExplicitInteractionActivity__Group__1__Impl : ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) ) ;
    public final void rule__ExplicitInteractionActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1312:1: ( ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1313:1: ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1313:1: ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1314:1: ( rule__ExplicitInteractionActivity__DestAssignment_1 )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getDestAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1315:1: ( rule__ExplicitInteractionActivity__DestAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1315:2: rule__ExplicitInteractionActivity__DestAssignment_1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__DestAssignment_1_in_rule__ExplicitInteractionActivity__Group__1__Impl2631);
            rule__ExplicitInteractionActivity__DestAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExplicitInteractionActivityAccess().getDestAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group__1__Impl


    // $ANTLR start rule__ExplicitInteractionActivity__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1325:1: rule__ExplicitInteractionActivity__Group__2 : rule__ExplicitInteractionActivity__Group__2__Impl ;
    public final void rule__ExplicitInteractionActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1329:1: ( rule__ExplicitInteractionActivity__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1330:2: rule__ExplicitInteractionActivity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__2__Impl_in_rule__ExplicitInteractionActivity__Group__22661);
            rule__ExplicitInteractionActivity__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group__2


    // $ANTLR start rule__ExplicitInteractionActivity__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1336:1: rule__ExplicitInteractionActivity__Group__2__Impl : ( ( rule__ExplicitInteractionActivity__Group_2__0 )? ) ;
    public final void rule__ExplicitInteractionActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1340:1: ( ( ( rule__ExplicitInteractionActivity__Group_2__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1341:1: ( ( rule__ExplicitInteractionActivity__Group_2__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1341:1: ( ( rule__ExplicitInteractionActivity__Group_2__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1342:1: ( rule__ExplicitInteractionActivity__Group_2__0 )?
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getGroup_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1343:1: ( rule__ExplicitInteractionActivity__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1343:2: rule__ExplicitInteractionActivity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__0_in_rule__ExplicitInteractionActivity__Group__2__Impl2688);
                    rule__ExplicitInteractionActivity__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExplicitInteractionActivityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group__2__Impl


    // $ANTLR start rule__ExplicitInteractionActivity__Group_2__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1359:1: rule__ExplicitInteractionActivity__Group_2__0 : rule__ExplicitInteractionActivity__Group_2__0__Impl rule__ExplicitInteractionActivity__Group_2__1 ;
    public final void rule__ExplicitInteractionActivity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1363:1: ( rule__ExplicitInteractionActivity__Group_2__0__Impl rule__ExplicitInteractionActivity__Group_2__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1364:2: rule__ExplicitInteractionActivity__Group_2__0__Impl rule__ExplicitInteractionActivity__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__0__Impl_in_rule__ExplicitInteractionActivity__Group_2__02725);
            rule__ExplicitInteractionActivity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__1_in_rule__ExplicitInteractionActivity__Group_2__02728);
            rule__ExplicitInteractionActivity__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group_2__0


    // $ANTLR start rule__ExplicitInteractionActivity__Group_2__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1371:1: rule__ExplicitInteractionActivity__Group_2__0__Impl : ( 'forActiom' ) ;
    public final void rule__ExplicitInteractionActivity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1375:1: ( ( 'forActiom' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1376:1: ( 'forActiom' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1376:1: ( 'forActiom' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1377:1: 'forActiom'
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getForActiomKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__ExplicitInteractionActivity__Group_2__0__Impl2756); 
             after(grammarAccess.getExplicitInteractionActivityAccess().getForActiomKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group_2__0__Impl


    // $ANTLR start rule__ExplicitInteractionActivity__Group_2__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1390:1: rule__ExplicitInteractionActivity__Group_2__1 : rule__ExplicitInteractionActivity__Group_2__1__Impl ;
    public final void rule__ExplicitInteractionActivity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1394:1: ( rule__ExplicitInteractionActivity__Group_2__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1395:2: rule__ExplicitInteractionActivity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__1__Impl_in_rule__ExplicitInteractionActivity__Group_2__12787);
            rule__ExplicitInteractionActivity__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group_2__1


    // $ANTLR start rule__ExplicitInteractionActivity__Group_2__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1401:1: rule__ExplicitInteractionActivity__Group_2__1__Impl : ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) ) ;
    public final void rule__ExplicitInteractionActivity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1405:1: ( ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1406:1: ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1406:1: ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1407:1: ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getActionAssignment_2_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1408:1: ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1408:2: rule__ExplicitInteractionActivity__ActionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__ActionAssignment_2_1_in_rule__ExplicitInteractionActivity__Group_2__1__Impl2814);
            rule__ExplicitInteractionActivity__ActionAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getExplicitInteractionActivityAccess().getActionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__Group_2__1__Impl


    // $ANTLR start rule__ActionOnlyInteraction__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1422:1: rule__ActionOnlyInteraction__Group__0 : rule__ActionOnlyInteraction__Group__0__Impl rule__ActionOnlyInteraction__Group__1 ;
    public final void rule__ActionOnlyInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1426:1: ( rule__ActionOnlyInteraction__Group__0__Impl rule__ActionOnlyInteraction__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1427:2: rule__ActionOnlyInteraction__Group__0__Impl rule__ActionOnlyInteraction__Group__1
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__0__Impl_in_rule__ActionOnlyInteraction__Group__02848);
            rule__ActionOnlyInteraction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__1_in_rule__ActionOnlyInteraction__Group__02851);
            rule__ActionOnlyInteraction__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionOnlyInteraction__Group__0


    // $ANTLR start rule__ActionOnlyInteraction__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1434:1: rule__ActionOnlyInteraction__Group__0__Impl : ( 'execAction' ) ;
    public final void rule__ActionOnlyInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1438:1: ( ( 'execAction' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1439:1: ( 'execAction' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1439:1: ( 'execAction' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1440:1: 'execAction'
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getExecActionKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__ActionOnlyInteraction__Group__0__Impl2879); 
             after(grammarAccess.getActionOnlyInteractionAccess().getExecActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionOnlyInteraction__Group__0__Impl


    // $ANTLR start rule__ActionOnlyInteraction__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1453:1: rule__ActionOnlyInteraction__Group__1 : rule__ActionOnlyInteraction__Group__1__Impl ;
    public final void rule__ActionOnlyInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1457:1: ( rule__ActionOnlyInteraction__Group__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1458:2: rule__ActionOnlyInteraction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__1__Impl_in_rule__ActionOnlyInteraction__Group__12910);
            rule__ActionOnlyInteraction__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionOnlyInteraction__Group__1


    // $ANTLR start rule__ActionOnlyInteraction__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1464:1: rule__ActionOnlyInteraction__Group__1__Impl : ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) ) ;
    public final void rule__ActionOnlyInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1468:1: ( ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1469:1: ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1469:1: ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1470:1: ( rule__ActionOnlyInteraction__ActionAssignment_1 )
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getActionAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1471:1: ( rule__ActionOnlyInteraction__ActionAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1471:2: rule__ActionOnlyInteraction__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__ActionAssignment_1_in_rule__ActionOnlyInteraction__Group__1__Impl2937);
            rule__ActionOnlyInteraction__ActionAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActionOnlyInteractionAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionOnlyInteraction__Group__1__Impl


    // $ANTLR start rule__Action__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1485:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1489:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1490:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__02971);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__02974);
            rule__Action__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__0


    // $ANTLR start rule__Action__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1497:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1501:1: ( ( 'action' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1502:1: ( 'action' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1502:1: ( 'action' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1503:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Action__Group__0__Impl3002); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__0__Impl


    // $ANTLR start rule__Action__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1516:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1520:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1521:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13033);
            rule__Action__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13036);
            rule__Action__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__1


    // $ANTLR start rule__Action__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1528:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1532:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1533:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1533:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1534:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1535:1: ( rule__Action__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1535:2: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl3063);
            rule__Action__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__1__Impl


    // $ANTLR start rule__Action__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1545:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1549:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1550:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23093);
            rule__Action__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23096);
            rule__Action__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__2


    // $ANTLR start rule__Action__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1557:1: rule__Action__Group__2__Impl : ( 'data' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1561:1: ( ( 'data' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1562:1: ( 'data' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1562:1: ( 'data' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1563:1: 'data'
            {
             before(grammarAccess.getActionAccess().getDataKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Action__Group__2__Impl3124); 
             after(grammarAccess.getActionAccess().getDataKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__2__Impl


    // $ANTLR start rule__Action__Group__3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1576:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1580:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1581:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33155);
            rule__Action__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__33158);
            rule__Action__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__3


    // $ANTLR start rule__Action__Group__3__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1588:1: rule__Action__Group__3__Impl : ( ( rule__Action__DataAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1592:1: ( ( ( rule__Action__DataAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1593:1: ( ( rule__Action__DataAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1593:1: ( ( rule__Action__DataAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1594:1: ( rule__Action__DataAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getDataAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1595:1: ( rule__Action__DataAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1595:2: rule__Action__DataAssignment_3
            {
            pushFollow(FOLLOW_rule__Action__DataAssignment_3_in_rule__Action__Group__3__Impl3185);
            rule__Action__DataAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getDataAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__3__Impl


    // $ANTLR start rule__Action__Group__4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1605:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1609:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1610:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__43215);
            rule__Action__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__5_in_rule__Action__Group__43218);
            rule__Action__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__4


    // $ANTLR start rule__Action__Group__4__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1617:1: rule__Action__Group__4__Impl : ( 'category' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1621:1: ( ( 'category' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1622:1: ( 'category' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1622:1: ( 'category' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1623:1: 'category'
            {
             before(grammarAccess.getActionAccess().getCategoryKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Action__Group__4__Impl3246); 
             after(grammarAccess.getActionAccess().getCategoryKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__4__Impl


    // $ANTLR start rule__Action__Group__5
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1636:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1640:1: ( rule__Action__Group__5__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1641:2: rule__Action__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__53277);
            rule__Action__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__5


    // $ANTLR start rule__Action__Group__5__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1647:1: rule__Action__Group__5__Impl : ( ( rule__Action__CategoryAssignment_5 ) ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1651:1: ( ( ( rule__Action__CategoryAssignment_5 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1652:1: ( ( rule__Action__CategoryAssignment_5 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1652:1: ( ( rule__Action__CategoryAssignment_5 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1653:1: ( rule__Action__CategoryAssignment_5 )
            {
             before(grammarAccess.getActionAccess().getCategoryAssignment_5()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1654:1: ( rule__Action__CategoryAssignment_5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1654:2: rule__Action__CategoryAssignment_5
            {
            pushFollow(FOLLOW_rule__Action__CategoryAssignment_5_in_rule__Action__Group__5__Impl3304);
            rule__Action__CategoryAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getCategoryAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__5__Impl


    // $ANTLR start rule__Data__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1676:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1680:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1681:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__03346);
            rule__Data__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__1_in_rule__Data__Group__03349);
            rule__Data__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__0


    // $ANTLR start rule__Data__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1688:1: rule__Data__Group__0__Impl : ( 'data' ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1692:1: ( ( 'data' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1693:1: ( 'data' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1693:1: ( 'data' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1694:1: 'data'
            {
             before(grammarAccess.getDataAccess().getDataKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Data__Group__0__Impl3377); 
             after(grammarAccess.getDataAccess().getDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__0__Impl


    // $ANTLR start rule__Data__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1707:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1711:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1712:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__13408);
            rule__Data__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__2_in_rule__Data__Group__13411);
            rule__Data__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__1


    // $ANTLR start rule__Data__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1719:1: rule__Data__Group__1__Impl : ( ( rule__Data__NameAssignment_1 ) ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1723:1: ( ( ( rule__Data__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1724:1: ( ( rule__Data__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1724:1: ( ( rule__Data__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1725:1: ( rule__Data__NameAssignment_1 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1726:1: ( rule__Data__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1726:2: rule__Data__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Data__NameAssignment_1_in_rule__Data__Group__1__Impl3438);
            rule__Data__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDataAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__1__Impl


    // $ANTLR start rule__Data__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1736:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1740:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1741:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_rule__Data__Group__2__Impl_in_rule__Data__Group__23468);
            rule__Data__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__3_in_rule__Data__Group__23471);
            rule__Data__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__2


    // $ANTLR start rule__Data__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1748:1: rule__Data__Group__2__Impl : ( 'scheme' ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1752:1: ( ( 'scheme' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1753:1: ( 'scheme' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1753:1: ( 'scheme' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1754:1: 'scheme'
            {
             before(grammarAccess.getDataAccess().getSchemeKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Data__Group__2__Impl3499); 
             after(grammarAccess.getDataAccess().getSchemeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__2__Impl


    // $ANTLR start rule__Data__Group__3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1767:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1771:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1772:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_rule__Data__Group__3__Impl_in_rule__Data__Group__33530);
            rule__Data__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__4_in_rule__Data__Group__33533);
            rule__Data__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__3


    // $ANTLR start rule__Data__Group__3__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1779:1: rule__Data__Group__3__Impl : ( ( rule__Data__SchemeAssignment_3 ) ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1783:1: ( ( ( rule__Data__SchemeAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1784:1: ( ( rule__Data__SchemeAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1784:1: ( ( rule__Data__SchemeAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1785:1: ( rule__Data__SchemeAssignment_3 )
            {
             before(grammarAccess.getDataAccess().getSchemeAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1786:1: ( rule__Data__SchemeAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1786:2: rule__Data__SchemeAssignment_3
            {
            pushFollow(FOLLOW_rule__Data__SchemeAssignment_3_in_rule__Data__Group__3__Impl3560);
            rule__Data__SchemeAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDataAccess().getSchemeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__3__Impl


    // $ANTLR start rule__Data__Group__4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1796:1: rule__Data__Group__4 : rule__Data__Group__4__Impl rule__Data__Group__5 ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1800:1: ( rule__Data__Group__4__Impl rule__Data__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1801:2: rule__Data__Group__4__Impl rule__Data__Group__5
            {
            pushFollow(FOLLOW_rule__Data__Group__4__Impl_in_rule__Data__Group__43590);
            rule__Data__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__5_in_rule__Data__Group__43593);
            rule__Data__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__4


    // $ANTLR start rule__Data__Group__4__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1808:1: rule__Data__Group__4__Impl : ( ( rule__Data__Group_4__0 )? ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1812:1: ( ( ( rule__Data__Group_4__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1813:1: ( ( rule__Data__Group_4__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1813:1: ( ( rule__Data__Group_4__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1814:1: ( rule__Data__Group_4__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1815:1: ( rule__Data__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1815:2: rule__Data__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_4__0_in_rule__Data__Group__4__Impl3620);
                    rule__Data__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__4__Impl


    // $ANTLR start rule__Data__Group__5
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1825:1: rule__Data__Group__5 : rule__Data__Group__5__Impl rule__Data__Group__6 ;
    public final void rule__Data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1829:1: ( rule__Data__Group__5__Impl rule__Data__Group__6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1830:2: rule__Data__Group__5__Impl rule__Data__Group__6
            {
            pushFollow(FOLLOW_rule__Data__Group__5__Impl_in_rule__Data__Group__53651);
            rule__Data__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__6_in_rule__Data__Group__53654);
            rule__Data__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__5


    // $ANTLR start rule__Data__Group__5__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1837:1: rule__Data__Group__5__Impl : ( ( rule__Data__Group_5__0 )? ) ;
    public final void rule__Data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1841:1: ( ( ( rule__Data__Group_5__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1842:1: ( ( rule__Data__Group_5__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1842:1: ( ( rule__Data__Group_5__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1843:1: ( rule__Data__Group_5__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_5()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1844:1: ( rule__Data__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1844:2: rule__Data__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_5__0_in_rule__Data__Group__5__Impl3681);
                    rule__Data__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__5__Impl


    // $ANTLR start rule__Data__Group__6
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1854:1: rule__Data__Group__6 : rule__Data__Group__6__Impl ;
    public final void rule__Data__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1858:1: ( rule__Data__Group__6__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1859:2: rule__Data__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group__6__Impl_in_rule__Data__Group__63712);
            rule__Data__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__6


    // $ANTLR start rule__Data__Group__6__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1865:1: rule__Data__Group__6__Impl : ( ( rule__Data__Group_6__0 )? ) ;
    public final void rule__Data__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1869:1: ( ( ( rule__Data__Group_6__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1870:1: ( ( rule__Data__Group_6__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1870:1: ( ( rule__Data__Group_6__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1871:1: ( rule__Data__Group_6__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_6()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1872:1: ( rule__Data__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1872:2: rule__Data__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_6__0_in_rule__Data__Group__6__Impl3739);
                    rule__Data__Group_6__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group__6__Impl


    // $ANTLR start rule__Data__Group_4__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1896:1: rule__Data__Group_4__0 : rule__Data__Group_4__0__Impl rule__Data__Group_4__1 ;
    public final void rule__Data__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1900:1: ( rule__Data__Group_4__0__Impl rule__Data__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1901:2: rule__Data__Group_4__0__Impl rule__Data__Group_4__1
            {
            pushFollow(FOLLOW_rule__Data__Group_4__0__Impl_in_rule__Data__Group_4__03784);
            rule__Data__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group_4__1_in_rule__Data__Group_4__03787);
            rule__Data__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_4__0


    // $ANTLR start rule__Data__Group_4__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1908:1: rule__Data__Group_4__0__Impl : ( 'host' ) ;
    public final void rule__Data__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1912:1: ( ( 'host' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1913:1: ( 'host' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1913:1: ( 'host' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1914:1: 'host'
            {
             before(grammarAccess.getDataAccess().getHostKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__Data__Group_4__0__Impl3815); 
             after(grammarAccess.getDataAccess().getHostKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_4__0__Impl


    // $ANTLR start rule__Data__Group_4__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1927:1: rule__Data__Group_4__1 : rule__Data__Group_4__1__Impl ;
    public final void rule__Data__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1931:1: ( rule__Data__Group_4__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1932:2: rule__Data__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_4__1__Impl_in_rule__Data__Group_4__13846);
            rule__Data__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_4__1


    // $ANTLR start rule__Data__Group_4__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1938:1: rule__Data__Group_4__1__Impl : ( ( rule__Data__HostAssignment_4_1 ) ) ;
    public final void rule__Data__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1942:1: ( ( ( rule__Data__HostAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1943:1: ( ( rule__Data__HostAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1943:1: ( ( rule__Data__HostAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1944:1: ( rule__Data__HostAssignment_4_1 )
            {
             before(grammarAccess.getDataAccess().getHostAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1945:1: ( rule__Data__HostAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1945:2: rule__Data__HostAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Data__HostAssignment_4_1_in_rule__Data__Group_4__1__Impl3873);
            rule__Data__HostAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getDataAccess().getHostAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_4__1__Impl


    // $ANTLR start rule__Data__Group_5__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1959:1: rule__Data__Group_5__0 : rule__Data__Group_5__0__Impl rule__Data__Group_5__1 ;
    public final void rule__Data__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1963:1: ( rule__Data__Group_5__0__Impl rule__Data__Group_5__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1964:2: rule__Data__Group_5__0__Impl rule__Data__Group_5__1
            {
            pushFollow(FOLLOW_rule__Data__Group_5__0__Impl_in_rule__Data__Group_5__03907);
            rule__Data__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group_5__1_in_rule__Data__Group_5__03910);
            rule__Data__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_5__0


    // $ANTLR start rule__Data__Group_5__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1971:1: rule__Data__Group_5__0__Impl : ( 'port' ) ;
    public final void rule__Data__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1975:1: ( ( 'port' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1976:1: ( 'port' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1976:1: ( 'port' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1977:1: 'port'
            {
             before(grammarAccess.getDataAccess().getPortKeyword_5_0()); 
            match(input,23,FOLLOW_23_in_rule__Data__Group_5__0__Impl3938); 
             after(grammarAccess.getDataAccess().getPortKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_5__0__Impl


    // $ANTLR start rule__Data__Group_5__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1990:1: rule__Data__Group_5__1 : rule__Data__Group_5__1__Impl ;
    public final void rule__Data__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1994:1: ( rule__Data__Group_5__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1995:2: rule__Data__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_5__1__Impl_in_rule__Data__Group_5__13969);
            rule__Data__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_5__1


    // $ANTLR start rule__Data__Group_5__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2001:1: rule__Data__Group_5__1__Impl : ( ( rule__Data__PortAssignment_5_1 ) ) ;
    public final void rule__Data__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2005:1: ( ( ( rule__Data__PortAssignment_5_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2006:1: ( ( rule__Data__PortAssignment_5_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2006:1: ( ( rule__Data__PortAssignment_5_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2007:1: ( rule__Data__PortAssignment_5_1 )
            {
             before(grammarAccess.getDataAccess().getPortAssignment_5_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2008:1: ( rule__Data__PortAssignment_5_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2008:2: rule__Data__PortAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Data__PortAssignment_5_1_in_rule__Data__Group_5__1__Impl3996);
            rule__Data__PortAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getDataAccess().getPortAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_5__1__Impl


    // $ANTLR start rule__Data__Group_6__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2022:1: rule__Data__Group_6__0 : rule__Data__Group_6__0__Impl rule__Data__Group_6__1 ;
    public final void rule__Data__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2026:1: ( rule__Data__Group_6__0__Impl rule__Data__Group_6__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2027:2: rule__Data__Group_6__0__Impl rule__Data__Group_6__1
            {
            pushFollow(FOLLOW_rule__Data__Group_6__0__Impl_in_rule__Data__Group_6__04030);
            rule__Data__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group_6__1_in_rule__Data__Group_6__04033);
            rule__Data__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_6__0


    // $ANTLR start rule__Data__Group_6__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2034:1: rule__Data__Group_6__0__Impl : ( 'path' ) ;
    public final void rule__Data__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2038:1: ( ( 'path' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2039:1: ( 'path' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2039:1: ( 'path' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2040:1: 'path'
            {
             before(grammarAccess.getDataAccess().getPathKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__Data__Group_6__0__Impl4061); 
             after(grammarAccess.getDataAccess().getPathKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_6__0__Impl


    // $ANTLR start rule__Data__Group_6__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2053:1: rule__Data__Group_6__1 : rule__Data__Group_6__1__Impl ;
    public final void rule__Data__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2057:1: ( rule__Data__Group_6__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2058:2: rule__Data__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_6__1__Impl_in_rule__Data__Group_6__14092);
            rule__Data__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_6__1


    // $ANTLR start rule__Data__Group_6__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2064:1: rule__Data__Group_6__1__Impl : ( ( rule__Data__PathAssignment_6_1 ) ) ;
    public final void rule__Data__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2068:1: ( ( ( rule__Data__PathAssignment_6_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2069:1: ( ( rule__Data__PathAssignment_6_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2069:1: ( ( rule__Data__PathAssignment_6_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2070:1: ( rule__Data__PathAssignment_6_1 )
            {
             before(grammarAccess.getDataAccess().getPathAssignment_6_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2071:1: ( rule__Data__PathAssignment_6_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2071:2: rule__Data__PathAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Data__PathAssignment_6_1_in_rule__Data__Group_6__1__Impl4119);
            rule__Data__PathAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getDataAccess().getPathAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__Group_6__1__Impl


    // $ANTLR start rule__Application__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2085:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2089:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2090:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__04153);
            rule__Application__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__04156);
            rule__Application__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__0


    // $ANTLR start rule__Application__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2097:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2101:1: ( ( 'Application' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2102:1: ( 'Application' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2102:1: ( 'Application' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2103:1: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Application__Group__0__Impl4184); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__0__Impl


    // $ANTLR start rule__Application__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2116:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2120:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2121:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__14215);
            rule__Application__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__14218);
            rule__Application__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__1


    // $ANTLR start rule__Application__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2128:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2132:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2133:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2133:1: ( ( rule__Application__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2134:1: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2135:1: ( rule__Application__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2135:2: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl4245);
            rule__Application__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__1__Impl


    // $ANTLR start rule__Application__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2145:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2149:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2150:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__24275);
            rule__Application__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__24278);
            rule__Application__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__2


    // $ANTLR start rule__Application__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2157:1: rule__Application__Group__2__Impl : ( 'avd' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2161:1: ( ( 'avd' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2162:1: ( 'avd' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2162:1: ( 'avd' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2163:1: 'avd'
            {
             before(grammarAccess.getApplicationAccess().getAvdKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Application__Group__2__Impl4306); 
             after(grammarAccess.getApplicationAccess().getAvdKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__2__Impl


    // $ANTLR start rule__Application__Group__3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2176:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2180:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2181:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__34337);
            rule__Application__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__34340);
            rule__Application__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__3


    // $ANTLR start rule__Application__Group__3__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2188:1: rule__Application__Group__3__Impl : ( ( rule__Application__AvdAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2192:1: ( ( ( rule__Application__AvdAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2193:1: ( ( rule__Application__AvdAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2193:1: ( ( rule__Application__AvdAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2194:1: ( rule__Application__AvdAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getAvdAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2195:1: ( rule__Application__AvdAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2195:2: rule__Application__AvdAssignment_3
            {
            pushFollow(FOLLOW_rule__Application__AvdAssignment_3_in_rule__Application__Group__3__Impl4367);
            rule__Application__AvdAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getAvdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__3__Impl


    // $ANTLR start rule__Application__Group__4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2205:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2209:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2210:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__44397);
            rule__Application__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__44400);
            rule__Application__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__4


    // $ANTLR start rule__Application__Group__4__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2217:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2221:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2222:1: ( ( rule__Application__Group_4__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2222:1: ( ( rule__Application__Group_4__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2223:1: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2224:1: ( rule__Application__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2224:2: rule__Application__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl4427);
                    rule__Application__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__4__Impl


    // $ANTLR start rule__Application__Group__5
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2234:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2238:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2239:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__54458);
            rule__Application__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__6_in_rule__Application__Group__54461);
            rule__Application__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__5


    // $ANTLR start rule__Application__Group__5__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2246:1: rule__Application__Group__5__Impl : ( 'package' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2250:1: ( ( 'package' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2251:1: ( 'package' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2251:1: ( 'package' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2252:1: 'package'
            {
             before(grammarAccess.getApplicationAccess().getPackageKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Application__Group__5__Impl4489); 
             after(grammarAccess.getApplicationAccess().getPackageKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__5__Impl


    // $ANTLR start rule__Application__Group__6
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2265:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2269:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2270:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__64520);
            rule__Application__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__7_in_rule__Application__Group__64523);
            rule__Application__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__6


    // $ANTLR start rule__Application__Group__6__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2277:1: rule__Application__Group__6__Impl : ( ( rule__Application__PackageNameAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2281:1: ( ( ( rule__Application__PackageNameAssignment_6 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2282:1: ( ( rule__Application__PackageNameAssignment_6 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2282:1: ( ( rule__Application__PackageNameAssignment_6 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2283:1: ( rule__Application__PackageNameAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_6()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2284:1: ( rule__Application__PackageNameAssignment_6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2284:2: rule__Application__PackageNameAssignment_6
            {
            pushFollow(FOLLOW_rule__Application__PackageNameAssignment_6_in_rule__Application__Group__6__Impl4550);
            rule__Application__PackageNameAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPackageNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__6__Impl


    // $ANTLR start rule__Application__Group__7
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2294:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2298:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2299:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__74580);
            rule__Application__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__8_in_rule__Application__Group__74583);
            rule__Application__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__7


    // $ANTLR start rule__Application__Group__7__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2306:1: rule__Application__Group__7__Impl : ( 'entryActiviy' ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2310:1: ( ( 'entryActiviy' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2311:1: ( 'entryActiviy' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2311:1: ( 'entryActiviy' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2312:1: 'entryActiviy'
            {
             before(grammarAccess.getApplicationAccess().getEntryActiviyKeyword_7()); 
            match(input,28,FOLLOW_28_in_rule__Application__Group__7__Impl4611); 
             after(grammarAccess.getApplicationAccess().getEntryActiviyKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__7__Impl


    // $ANTLR start rule__Application__Group__8
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2325:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2329:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2330:2: rule__Application__Group__8__Impl rule__Application__Group__9
            {
            pushFollow(FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__84642);
            rule__Application__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__9_in_rule__Application__Group__84645);
            rule__Application__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__8


    // $ANTLR start rule__Application__Group__8__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2337:1: rule__Application__Group__8__Impl : ( ( rule__Application__MainActivityAssignment_8 ) ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2341:1: ( ( ( rule__Application__MainActivityAssignment_8 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2342:1: ( ( rule__Application__MainActivityAssignment_8 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2342:1: ( ( rule__Application__MainActivityAssignment_8 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2343:1: ( rule__Application__MainActivityAssignment_8 )
            {
             before(grammarAccess.getApplicationAccess().getMainActivityAssignment_8()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2344:1: ( rule__Application__MainActivityAssignment_8 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2344:2: rule__Application__MainActivityAssignment_8
            {
            pushFollow(FOLLOW_rule__Application__MainActivityAssignment_8_in_rule__Application__Group__8__Impl4672);
            rule__Application__MainActivityAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getMainActivityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__8__Impl


    // $ANTLR start rule__Application__Group__9
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2354:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2358:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2359:2: rule__Application__Group__9__Impl rule__Application__Group__10
            {
            pushFollow(FOLLOW_rule__Application__Group__9__Impl_in_rule__Application__Group__94702);
            rule__Application__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__10_in_rule__Application__Group__94705);
            rule__Application__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__9


    // $ANTLR start rule__Application__Group__9__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2366:1: rule__Application__Group__9__Impl : ( 'target' ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2370:1: ( ( 'target' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2371:1: ( 'target' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2371:1: ( 'target' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2372:1: 'target'
            {
             before(grammarAccess.getApplicationAccess().getTargetKeyword_9()); 
            match(input,29,FOLLOW_29_in_rule__Application__Group__9__Impl4733); 
             after(grammarAccess.getApplicationAccess().getTargetKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__9__Impl


    // $ANTLR start rule__Application__Group__10
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2385:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2389:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2390:2: rule__Application__Group__10__Impl rule__Application__Group__11
            {
            pushFollow(FOLLOW_rule__Application__Group__10__Impl_in_rule__Application__Group__104764);
            rule__Application__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__11_in_rule__Application__Group__104767);
            rule__Application__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__10


    // $ANTLR start rule__Application__Group__10__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2397:1: rule__Application__Group__10__Impl : ( ( rule__Application__TargetAssignment_10 ) ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2401:1: ( ( ( rule__Application__TargetAssignment_10 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2402:1: ( ( rule__Application__TargetAssignment_10 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2402:1: ( ( rule__Application__TargetAssignment_10 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2403:1: ( rule__Application__TargetAssignment_10 )
            {
             before(grammarAccess.getApplicationAccess().getTargetAssignment_10()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2404:1: ( rule__Application__TargetAssignment_10 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2404:2: rule__Application__TargetAssignment_10
            {
            pushFollow(FOLLOW_rule__Application__TargetAssignment_10_in_rule__Application__Group__10__Impl4794);
            rule__Application__TargetAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getTargetAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__10__Impl


    // $ANTLR start rule__Application__Group__11
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2414:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2418:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2419:2: rule__Application__Group__11__Impl rule__Application__Group__12
            {
            pushFollow(FOLLOW_rule__Application__Group__11__Impl_in_rule__Application__Group__114824);
            rule__Application__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__12_in_rule__Application__Group__114827);
            rule__Application__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__11


    // $ANTLR start rule__Application__Group__11__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2426:1: rule__Application__Group__11__Impl : ( 'path' ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2430:1: ( ( 'path' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2431:1: ( 'path' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2431:1: ( 'path' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2432:1: 'path'
            {
             before(grammarAccess.getApplicationAccess().getPathKeyword_11()); 
            match(input,24,FOLLOW_24_in_rule__Application__Group__11__Impl4855); 
             after(grammarAccess.getApplicationAccess().getPathKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__11__Impl


    // $ANTLR start rule__Application__Group__12
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2445:1: rule__Application__Group__12 : rule__Application__Group__12__Impl ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2449:1: ( rule__Application__Group__12__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2450:2: rule__Application__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__12__Impl_in_rule__Application__Group__124886);
            rule__Application__Group__12__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__12


    // $ANTLR start rule__Application__Group__12__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2456:1: rule__Application__Group__12__Impl : ( ( rule__Application__PathAssignment_12 ) ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2460:1: ( ( ( rule__Application__PathAssignment_12 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2461:1: ( ( rule__Application__PathAssignment_12 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2461:1: ( ( rule__Application__PathAssignment_12 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2462:1: ( rule__Application__PathAssignment_12 )
            {
             before(grammarAccess.getApplicationAccess().getPathAssignment_12()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2463:1: ( rule__Application__PathAssignment_12 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2463:2: rule__Application__PathAssignment_12
            {
            pushFollow(FOLLOW_rule__Application__PathAssignment_12_in_rule__Application__Group__12__Impl4913);
            rule__Application__PathAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getPathAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group__12__Impl


    // $ANTLR start rule__Application__Group_4__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2499:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2503:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2504:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__04969);
            rule__Application__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__04972);
            rule__Application__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_4__0


    // $ANTLR start rule__Application__Group_4__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2511:1: rule__Application__Group_4__0__Impl : ( 'workdir' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2515:1: ( ( 'workdir' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2516:1: ( 'workdir' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2516:1: ( 'workdir' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2517:1: 'workdir'
            {
             before(grammarAccess.getApplicationAccess().getWorkdirKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__Application__Group_4__0__Impl5000); 
             after(grammarAccess.getApplicationAccess().getWorkdirKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_4__0__Impl


    // $ANTLR start rule__Application__Group_4__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2530:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2534:1: ( rule__Application__Group_4__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2535:2: rule__Application__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__15031);
            rule__Application__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_4__1


    // $ANTLR start rule__Application__Group_4__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2541:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__WorkDirAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2545:1: ( ( ( rule__Application__WorkDirAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2546:1: ( ( rule__Application__WorkDirAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2546:1: ( ( rule__Application__WorkDirAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2547:1: ( rule__Application__WorkDirAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getWorkDirAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2548:1: ( rule__Application__WorkDirAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2548:2: rule__Application__WorkDirAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Application__WorkDirAssignment_4_1_in_rule__Application__Group_4__1__Impl5058);
            rule__Application__WorkDirAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getApplicationAccess().getWorkDirAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__Group_4__1__Impl


    // $ANTLR start rule__URI__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2562:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2566:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2567:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__05092);
            rule__URI__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__05095);
            rule__URI__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URI__Group__0


    // $ANTLR start rule__URI__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2574:1: rule__URI__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2578:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2579:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2579:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2580:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__Group__0__Impl5122); 
             after(grammarAccess.getURIAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URI__Group__0__Impl


    // $ANTLR start rule__URI__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2591:1: rule__URI__Group__1 : rule__URI__Group__1__Impl rule__URI__Group__2 ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2595:1: ( rule__URI__Group__1__Impl rule__URI__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2596:2: rule__URI__Group__1__Impl rule__URI__Group__2
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__15151);
            rule__URI__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URI__Group__2_in_rule__URI__Group__15154);
            rule__URI__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URI__Group__1


    // $ANTLR start rule__URI__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2603:1: rule__URI__Group__1__Impl : ( '.' ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2607:1: ( ( '.' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2608:1: ( '.' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2608:1: ( '.' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2609:1: '.'
            {
             before(grammarAccess.getURIAccess().getFullStopKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__URI__Group__1__Impl5182); 
             after(grammarAccess.getURIAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URI__Group__1__Impl


    // $ANTLR start rule__URI__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2622:1: rule__URI__Group__2 : rule__URI__Group__2__Impl ;
    public final void rule__URI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2626:1: ( rule__URI__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2627:2: rule__URI__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__25213);
            rule__URI__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URI__Group__2


    // $ANTLR start rule__URI__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2633:1: rule__URI__Group__2__Impl : ( ruleRestUri ) ;
    public final void rule__URI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2637:1: ( ( ruleRestUri ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2638:1: ( ruleRestUri )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2638:1: ( ruleRestUri )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2639:1: ruleRestUri
            {
             before(grammarAccess.getURIAccess().getRestUriParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleRestUri_in_rule__URI__Group__2__Impl5240);
            ruleRestUri();
            _fsp--;

             after(grammarAccess.getURIAccess().getRestUriParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__URI__Group__2__Impl


    // $ANTLR start rule__AndroidSystem__DataAssignment_0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2657:1: rule__AndroidSystem__DataAssignment_0 : ( ruleData ) ;
    public final void rule__AndroidSystem__DataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2661:1: ( ( ruleData ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2662:1: ( ruleData )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2662:1: ( ruleData )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2663:1: ruleData
            {
             before(grammarAccess.getAndroidSystemAccess().getDataDataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__AndroidSystem__DataAssignment_05280);
            ruleData();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getDataDataParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__DataAssignment_0


    // $ANTLR start rule__AndroidSystem__ActionAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2672:1: rule__AndroidSystem__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__AndroidSystem__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2676:1: ( ( ruleAction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2677:1: ( ruleAction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2677:1: ( ruleAction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2678:1: ruleAction
            {
             before(grammarAccess.getAndroidSystemAccess().getActionActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__AndroidSystem__ActionAssignment_15311);
            ruleAction();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getActionActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__ActionAssignment_1


    // $ANTLR start rule__AndroidSystem__ServiceInterfaceAssignment_2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2687:1: rule__AndroidSystem__ServiceInterfaceAssignment_2 : ( ruleServiceInterface ) ;
    public final void rule__AndroidSystem__ServiceInterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2691:1: ( ( ruleServiceInterface ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2692:1: ( ruleServiceInterface )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2692:1: ( ruleServiceInterface )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2693:1: ruleServiceInterface
            {
             before(grammarAccess.getAndroidSystemAccess().getServiceInterfaceServiceInterfaceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleServiceInterface_in_rule__AndroidSystem__ServiceInterfaceAssignment_25342);
            ruleServiceInterface();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getServiceInterfaceServiceInterfaceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__ServiceInterfaceAssignment_2


    // $ANTLR start rule__AndroidSystem__ComponentAssignment_3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2702:1: rule__AndroidSystem__ComponentAssignment_3 : ( ruleComponent ) ;
    public final void rule__AndroidSystem__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2706:1: ( ( ruleComponent ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2707:1: ( ruleComponent )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2707:1: ( ruleComponent )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2708:1: ruleComponent
            {
             before(grammarAccess.getAndroidSystemAccess().getComponentComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__AndroidSystem__ComponentAssignment_35373);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getComponentComponentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__ComponentAssignment_3


    // $ANTLR start rule__AndroidSystem__ApplicationAssignment_4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2717:1: rule__AndroidSystem__ApplicationAssignment_4 : ( ruleApplication ) ;
    public final void rule__AndroidSystem__ApplicationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2721:1: ( ( ruleApplication ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2722:1: ( ruleApplication )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2722:1: ( ruleApplication )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2723:1: ruleApplication
            {
             before(grammarAccess.getAndroidSystemAccess().getApplicationApplicationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidSystem__ApplicationAssignment_45404);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getApplicationApplicationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__ApplicationAssignment_4


    // $ANTLR start rule__ServiceInterface__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2732:1: rule__ServiceInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2736:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2737:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2737:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2738:1: RULE_ID
            {
             before(grammarAccess.getServiceInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceInterface__NameAssignment_15435); 
             after(grammarAccess.getServiceInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceInterface__NameAssignment_1


    // $ANTLR start rule__Service__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2747:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2751:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2752:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2752:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2753:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_15466); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__NameAssignment_1


    // $ANTLR start rule__Service__InterfaceAssignment_3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2762:1: rule__Service__InterfaceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Service__InterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2766:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2767:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2767:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2768:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceCrossReference_3_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2769:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2770:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__InterfaceAssignment_35501); 
             after(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Service__InterfaceAssignment_3


    // $ANTLR start rule__Activity__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2781:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2785:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2786:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2786:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2787:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_15536); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__NameAssignment_1


    // $ANTLR start rule__Activity__LaunchableAssignment_2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2796:1: rule__Activity__LaunchableAssignment_2 : ( ( 'launchable' ) ) ;
    public final void rule__Activity__LaunchableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2800:1: ( ( ( 'launchable' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2801:1: ( ( 'launchable' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2801:1: ( ( 'launchable' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2802:1: ( 'launchable' )
            {
             before(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2803:1: ( 'launchable' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2804:1: 'launchable'
            {
             before(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__Activity__LaunchableAssignment_25572); 
             after(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0()); 

            }

             after(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__LaunchableAssignment_2


    // $ANTLR start rule__Activity__ActionsAssignment_3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2819:1: rule__Activity__ActionsAssignment_3 : ( ruleLocalAction ) ;
    public final void rule__Activity__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2823:1: ( ( ruleLocalAction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2824:1: ( ruleLocalAction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2824:1: ( ruleLocalAction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2825:1: ruleLocalAction
            {
             before(grammarAccess.getActivityAccess().getActionsLocalActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocalAction_in_rule__Activity__ActionsAssignment_35611);
            ruleLocalAction();
            _fsp--;

             after(grammarAccess.getActivityAccess().getActionsLocalActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__ActionsAssignment_3


    // $ANTLR start rule__Activity__InteractionsAssignment_4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2834:1: rule__Activity__InteractionsAssignment_4 : ( ruleInterAction ) ;
    public final void rule__Activity__InteractionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2838:1: ( ( ruleInterAction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2839:1: ( ruleInterAction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2839:1: ( ruleInterAction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2840:1: ruleInterAction
            {
             before(grammarAccess.getActivityAccess().getInteractionsInterActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterAction_in_rule__Activity__InteractionsAssignment_45642);
            ruleInterAction();
            _fsp--;

             after(grammarAccess.getActivityAccess().getInteractionsInterActionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__InteractionsAssignment_4


    // $ANTLR start rule__LocalAction__ActionAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2849:1: rule__LocalAction__ActionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalAction__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2853:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2854:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2854:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2855:1: ( RULE_ID )
            {
             before(grammarAccess.getLocalActionAccess().getActionActionCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2856:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2857:1: RULE_ID
            {
             before(grammarAccess.getLocalActionAccess().getActionActionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAction__ActionAssignment_15677); 
             after(grammarAccess.getLocalActionAccess().getActionActionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLocalActionAccess().getActionActionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LocalAction__ActionAssignment_1


    // $ANTLR start rule__LocalAction__ButtonAssignment_2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2868:1: rule__LocalAction__ButtonAssignment_2 : ( ( 'button' ) ) ;
    public final void rule__LocalAction__ButtonAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2872:1: ( ( ( 'button' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2873:1: ( ( 'button' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2873:1: ( ( 'button' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2874:1: ( 'button' )
            {
             before(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2875:1: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2876:1: 'button'
            {
             before(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__LocalAction__ButtonAssignment_25717); 
             after(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0()); 

            }

             after(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LocalAction__ButtonAssignment_2


    // $ANTLR start rule__InterAction__ButtonAssignment_0_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2891:1: rule__InterAction__ButtonAssignment_0_1 : ( ( 'button' ) ) ;
    public final void rule__InterAction__ButtonAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2895:1: ( ( ( 'button' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2896:1: ( ( 'button' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2896:1: ( ( 'button' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2897:1: ( 'button' )
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2898:1: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2899:1: 'button'
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0()); 
            match(input,33,FOLLOW_33_in_rule__InterAction__ButtonAssignment_0_15761); 
             after(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0()); 

            }

             after(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__ButtonAssignment_0_1


    // $ANTLR start rule__InterAction__ButtonAssignment_1_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2914:1: rule__InterAction__ButtonAssignment_1_1 : ( ( 'button' ) ) ;
    public final void rule__InterAction__ButtonAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2918:1: ( ( ( 'button' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2919:1: ( ( 'button' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2919:1: ( ( 'button' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2920:1: ( 'button' )
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2921:1: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2922:1: 'button'
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0()); 
            match(input,33,FOLLOW_33_in_rule__InterAction__ButtonAssignment_1_15805); 
             after(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0()); 

            }

             after(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__InterAction__ButtonAssignment_1_1


    // $ANTLR start rule__ExplicitInteractionActivity__DestAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2937:1: rule__ExplicitInteractionActivity__DestAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExplicitInteractionActivity__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2941:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2942:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2942:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2943:1: ( RULE_ID )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2944:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2945:1: RULE_ID
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__DestAssignment_15848); 
             after(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__DestAssignment_1


    // $ANTLR start rule__ExplicitInteractionActivity__ActionAssignment_2_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2956:1: rule__ExplicitInteractionActivity__ActionAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExplicitInteractionActivity__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2960:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2961:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2961:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2962:1: ( RULE_ID )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getActionActionCrossReference_2_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2963:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2964:1: RULE_ID
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getActionActionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__ActionAssignment_2_15887); 
             after(grammarAccess.getExplicitInteractionActivityAccess().getActionActionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getExplicitInteractionActivityAccess().getActionActionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ExplicitInteractionActivity__ActionAssignment_2_1


    // $ANTLR start rule__ActionOnlyInteraction__ActionAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2975:1: rule__ActionOnlyInteraction__ActionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActionOnlyInteraction__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2979:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2980:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2980:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2981:1: ( RULE_ID )
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getActionActionCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2982:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2983:1: RULE_ID
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getActionActionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionOnlyInteraction__ActionAssignment_15926); 
             after(grammarAccess.getActionOnlyInteractionAccess().getActionActionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActionOnlyInteractionAccess().getActionActionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ActionOnlyInteraction__ActionAssignment_1


    // $ANTLR start rule__Action__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2994:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2998:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2999:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2999:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3000:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_15961); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__NameAssignment_1


    // $ANTLR start rule__Action__DataAssignment_3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3009:1: rule__Action__DataAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Action__DataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3013:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3014:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3014:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3015:1: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getDataDataCrossReference_3_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3016:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3017:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getDataDataIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__DataAssignment_35996); 
             after(grammarAccess.getActionAccess().getDataDataIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getActionAccess().getDataDataCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__DataAssignment_3


    // $ANTLR start rule__Action__CategoryAssignment_5
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3028:1: rule__Action__CategoryAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Action__CategoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3032:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3033:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3033:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3034:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getCategorySTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__CategoryAssignment_56031); 
             after(grammarAccess.getActionAccess().getCategorySTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__CategoryAssignment_5


    // $ANTLR start rule__Data__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3043:1: rule__Data__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3047:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3048:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3048:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3049:1: RULE_ID
            {
             before(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Data__NameAssignment_16062); 
             after(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__NameAssignment_1


    // $ANTLR start rule__Data__SchemeAssignment_3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3058:1: rule__Data__SchemeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Data__SchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3062:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3063:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3063:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3064:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getSchemeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__SchemeAssignment_36093); 
             after(grammarAccess.getDataAccess().getSchemeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__SchemeAssignment_3


    // $ANTLR start rule__Data__HostAssignment_4_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3073:1: rule__Data__HostAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Data__HostAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3077:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3078:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3078:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3079:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getHostSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__HostAssignment_4_16124); 
             after(grammarAccess.getDataAccess().getHostSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__HostAssignment_4_1


    // $ANTLR start rule__Data__PortAssignment_5_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3088:1: rule__Data__PortAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Data__PortAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3092:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3093:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3093:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3094:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getPortSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__PortAssignment_5_16155); 
             after(grammarAccess.getDataAccess().getPortSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__PortAssignment_5_1


    // $ANTLR start rule__Data__PathAssignment_6_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3103:1: rule__Data__PathAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Data__PathAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3107:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3108:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3108:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3109:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__PathAssignment_6_16186); 
             after(grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Data__PathAssignment_6_1


    // $ANTLR start rule__Application__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3118:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3122:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3123:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3123:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3124:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__NameAssignment_16217); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__NameAssignment_1


    // $ANTLR start rule__Application__AvdAssignment_3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3133:1: rule__Application__AvdAssignment_3 : ( RULE_INT ) ;
    public final void rule__Application__AvdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3137:1: ( ( RULE_INT ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3138:1: ( RULE_INT )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3138:1: ( RULE_INT )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3139:1: RULE_INT
            {
             before(grammarAccess.getApplicationAccess().getAvdINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Application__AvdAssignment_36248); 
             after(grammarAccess.getApplicationAccess().getAvdINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__AvdAssignment_3


    // $ANTLR start rule__Application__WorkDirAssignment_4_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3148:1: rule__Application__WorkDirAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Application__WorkDirAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3152:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3153:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3153:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3154:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getWorkDirIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__WorkDirAssignment_4_16279); 
             after(grammarAccess.getApplicationAccess().getWorkDirIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__WorkDirAssignment_4_1


    // $ANTLR start rule__Application__PackageNameAssignment_6
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3163:1: rule__Application__PackageNameAssignment_6 : ( ruleURI ) ;
    public final void rule__Application__PackageNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3167:1: ( ( ruleURI ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3168:1: ( ruleURI )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3168:1: ( ruleURI )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3169:1: ruleURI
            {
             before(grammarAccess.getApplicationAccess().getPackageNameURIParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__Application__PackageNameAssignment_66310);
            ruleURI();
            _fsp--;

             after(grammarAccess.getApplicationAccess().getPackageNameURIParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__PackageNameAssignment_6


    // $ANTLR start rule__Application__MainActivityAssignment_8
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3178:1: rule__Application__MainActivityAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Application__MainActivityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3182:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3183:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3183:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3184:1: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getMainActivityActivityCrossReference_8_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3185:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3186:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getMainActivityActivityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__MainActivityAssignment_86345); 
             after(grammarAccess.getApplicationAccess().getMainActivityActivityIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getApplicationAccess().getMainActivityActivityCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__MainActivityAssignment_8


    // $ANTLR start rule__Application__TargetAssignment_10
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3197:1: rule__Application__TargetAssignment_10 : ( RULE_INT ) ;
    public final void rule__Application__TargetAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3201:1: ( ( RULE_INT ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3202:1: ( RULE_INT )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3202:1: ( RULE_INT )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3203:1: RULE_INT
            {
             before(grammarAccess.getApplicationAccess().getTargetINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Application__TargetAssignment_106380); 
             after(grammarAccess.getApplicationAccess().getTargetINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__TargetAssignment_10


    // $ANTLR start rule__Application__PathAssignment_12
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3212:1: rule__Application__PathAssignment_12 : ( RULE_ID ) ;
    public final void rule__Application__PathAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3216:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3217:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3217:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3218:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getPathIDTerminalRuleCall_12_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__PathAssignment_126411); 
             after(grammarAccess.getApplicationAccess().getPathIDTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Application__PathAssignment_12


 

    public static final BitSet FOLLOW_ruleAndroidSystem_in_entryRuleAndroidSystem61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidSystem68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__0_in_ruleAndroidSystem94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Alternatives_in_ruleComponent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_entryRuleServiceInterface181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceInterface188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__0_in_ruleServiceInterface214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_entryRuleLocalAction361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAction368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__0_in_ruleLocalAction394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterAction_in_entryRuleInterAction421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterAction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Alternatives_in_ruleInterAction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteraction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_ruleExplicitInteraction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteractionActivity547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__0_in_ruleExplicitInteractionActivity573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionOnlyInteraction607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__0_in_ruleActionOnlyInteraction633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__0_in_ruleData753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestUri_in_entryRuleRestUri900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestUri907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestUri__Alternatives_in_ruleRestUri933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Component__Alternatives969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Component__Alternatives986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__0_in_rule__InterAction__Alternatives1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__0_in_rule__InterAction__Alternatives1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RestUri__Alternatives1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__RestUri__Alternatives1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__0__Impl_in_rule__AndroidSystem__Group__01116 = new BitSet(new long[]{0x000000000200D800L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__1_in_rule__AndroidSystem__Group__01119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__DataAssignment_0_in_rule__AndroidSystem__Group__0__Impl1146 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__1__Impl_in_rule__AndroidSystem__Group__11177 = new BitSet(new long[]{0x0000000002005800L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__2_in_rule__AndroidSystem__Group__11180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ActionAssignment_1_in_rule__AndroidSystem__Group__1__Impl1207 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__2__Impl_in_rule__AndroidSystem__Group__21238 = new BitSet(new long[]{0x0000000002005000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__3_in_rule__AndroidSystem__Group__21241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ServiceInterfaceAssignment_2_in_rule__AndroidSystem__Group__2__Impl1268 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__3__Impl_in_rule__AndroidSystem__Group__31299 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__4_in_rule__AndroidSystem__Group__31302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ComponentAssignment_3_in_rule__AndroidSystem__Group__3__Impl1329 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__4__Impl_in_rule__AndroidSystem__Group__41360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ApplicationAssignment_4_in_rule__AndroidSystem__Group__4__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__0__Impl_in_rule__ServiceInterface__Group__01427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__1_in_rule__ServiceInterface__Group__01430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ServiceInterface__Group__0__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__1__Impl_in_rule__ServiceInterface__Group__11489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__NameAssignment_1_in_rule__ServiceInterface__Group__1__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__01550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__01553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Service__Group__0__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__11612 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__11615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__21672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__21675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Service__Group__2__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__31734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__InterfaceAssignment_3_in_rule__Service__Group__3__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__01799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__01802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Activity__Group__0__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__11861 = new BitSet(new long[]{0x0000000100058002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__21921 = new BitSet(new long[]{0x0000000000058002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__21924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__LaunchableAssignment_2_in_rule__Activity__Group__2__Impl1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__31982 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__31985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ActionsAssignment_3_in_rule__Activity__Group__3__Impl2012 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InteractionsAssignment_4_in_rule__Activity__Group__4__Impl2070 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__0__Impl_in_rule__LocalAction__Group__02111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__1_in_rule__LocalAction__Group__02114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LocalAction__Group__0__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__1__Impl_in_rule__LocalAction__Group__12173 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__2_in_rule__LocalAction__Group__12176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__ActionAssignment_1_in_rule__LocalAction__Group__1__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__2__Impl_in_rule__LocalAction__Group__22233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__ButtonAssignment_2_in_rule__LocalAction__Group__2__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__0__Impl_in_rule__InterAction__Group_0__02297 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__1_in_rule__InterAction__Group_0__02300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_rule__InterAction__Group_0__0__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__1__Impl_in_rule__InterAction__Group_0__12356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__ButtonAssignment_0_1_in_rule__InterAction__Group_0__1__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__0__Impl_in_rule__InterAction__Group_1__02418 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__1_in_rule__InterAction__Group_1__02421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_rule__InterAction__Group_1__0__Impl2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__1__Impl_in_rule__InterAction__Group_1__12477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__ButtonAssignment_1_1_in_rule__InterAction__Group_1__1__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__0__Impl_in_rule__ExplicitInteractionActivity__Group__02539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__1_in_rule__ExplicitInteractionActivity__Group__02542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExplicitInteractionActivity__Group__0__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__1__Impl_in_rule__ExplicitInteractionActivity__Group__12601 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__2_in_rule__ExplicitInteractionActivity__Group__12604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__DestAssignment_1_in_rule__ExplicitInteractionActivity__Group__1__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__2__Impl_in_rule__ExplicitInteractionActivity__Group__22661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__0_in_rule__ExplicitInteractionActivity__Group__2__Impl2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__0__Impl_in_rule__ExplicitInteractionActivity__Group_2__02725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__1_in_rule__ExplicitInteractionActivity__Group_2__02728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExplicitInteractionActivity__Group_2__0__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__1__Impl_in_rule__ExplicitInteractionActivity__Group_2__12787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__ActionAssignment_2_1_in_rule__ExplicitInteractionActivity__Group_2__1__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__0__Impl_in_rule__ActionOnlyInteraction__Group__02848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__1_in_rule__ActionOnlyInteraction__Group__02851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ActionOnlyInteraction__Group__0__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__1__Impl_in_rule__ActionOnlyInteraction__Group__12910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__ActionAssignment_1_in_rule__ActionOnlyInteraction__Group__1__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__02971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__02974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Action__Group__0__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13033 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__23096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Action__Group__2__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__33155 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__33158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DataAssignment_3_in_rule__Action__Group__3__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__43215 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__43218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Action__Group__4__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__53277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__CategoryAssignment_5_in_rule__Action__Group__5__Impl3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__03346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Data__Group__1_in_rule__Data__Group__03349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Data__Group__0__Impl3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__13408 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Data__Group__2_in_rule__Data__Group__13411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__NameAssignment_1_in_rule__Data__Group__1__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__2__Impl_in_rule__Data__Group__23468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group__3_in_rule__Data__Group__23471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Data__Group__2__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__3__Impl_in_rule__Data__Group__33530 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_rule__Data__Group__4_in_rule__Data__Group__33533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__SchemeAssignment_3_in_rule__Data__Group__3__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__4__Impl_in_rule__Data__Group__43590 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rule__Data__Group__5_in_rule__Data__Group__43593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_4__0_in_rule__Data__Group__4__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__5__Impl_in_rule__Data__Group__53651 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Data__Group__6_in_rule__Data__Group__53654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_5__0_in_rule__Data__Group__5__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__6__Impl_in_rule__Data__Group__63712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__0_in_rule__Data__Group__6__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_4__0__Impl_in_rule__Data__Group_4__03784 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group_4__1_in_rule__Data__Group_4__03787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Data__Group_4__0__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_4__1__Impl_in_rule__Data__Group_4__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__HostAssignment_4_1_in_rule__Data__Group_4__1__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_5__0__Impl_in_rule__Data__Group_5__03907 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group_5__1_in_rule__Data__Group_5__03910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Data__Group_5__0__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_5__1__Impl_in_rule__Data__Group_5__13969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__PortAssignment_5_1_in_rule__Data__Group_5__1__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__0__Impl_in_rule__Data__Group_6__04030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group_6__1_in_rule__Data__Group_6__04033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Data__Group_6__0__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__1__Impl_in_rule__Data__Group_6__14092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__PathAssignment_6_1_in_rule__Data__Group_6__1__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__04153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__04156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Application__Group__0__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__14215 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__14218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__24275 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__24278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Application__Group__2__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__34337 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__34340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AvdAssignment_3_in_rule__Application__Group__3__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__44397 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__44400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__54458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__6_in_rule__Application__Group__54461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Application__Group__5__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__64520 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Application__Group__7_in_rule__Application__Group__64523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__PackageNameAssignment_6_in_rule__Application__Group__6__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__74580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__8_in_rule__Application__Group__74583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Application__Group__7__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__84642 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Application__Group__9_in_rule__Application__Group__84645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__MainActivityAssignment_8_in_rule__Application__Group__8__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__9__Impl_in_rule__Application__Group__94702 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Application__Group__10_in_rule__Application__Group__94705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Application__Group__9__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__10__Impl_in_rule__Application__Group__104764 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Application__Group__11_in_rule__Application__Group__104767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__TargetAssignment_10_in_rule__Application__Group__10__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__11__Impl_in_rule__Application__Group__114824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__12_in_rule__Application__Group__114827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Application__Group__11__Impl4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__12__Impl_in_rule__Application__Group__124886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__PathAssignment_12_in_rule__Application__Group__12__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__04969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__04972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Application__Group_4__0__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__15031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__WorkDirAssignment_4_1_in_rule__Application__Group_4__1__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__05092 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__05095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__Group__0__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__15151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group__2_in_rule__URI__Group__15154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__URI__Group__1__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__25213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestUri_in_rule__URI__Group__2__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__AndroidSystem__DataAssignment_05280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__AndroidSystem__ActionAssignment_15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_rule__AndroidSystem__ServiceInterfaceAssignment_25342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__AndroidSystem__ComponentAssignment_35373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidSystem__ApplicationAssignment_45404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceInterface__NameAssignment_15435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_15466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__InterfaceAssignment_35501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_15536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Activity__LaunchableAssignment_25572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_rule__Activity__ActionsAssignment_35611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterAction_in_rule__Activity__InteractionsAssignment_45642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAction__ActionAssignment_15677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LocalAction__ButtonAssignment_25717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InterAction__ButtonAssignment_0_15761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InterAction__ButtonAssignment_1_15805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__DestAssignment_15848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__ActionAssignment_2_15887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionOnlyInteraction__ActionAssignment_15926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_15961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__DataAssignment_35996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__CategoryAssignment_56031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Data__NameAssignment_16062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__SchemeAssignment_36093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__HostAssignment_4_16124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__PortAssignment_5_16155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__PathAssignment_6_16186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__NameAssignment_16217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Application__AvdAssignment_36248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__WorkDirAssignment_4_16279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__Application__PackageNameAssignment_66310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__MainActivityAssignment_86345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Application__TargetAssignment_106380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__PathAssignment_126411 = new BitSet(new long[]{0x0000000000000002L});

}