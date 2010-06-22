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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'int'", "'double'", "'serviceInterface'", "'op'", "'return'", "'inputType'", "';'", "'Service'", "'implements'", "'Activity'", "'action'", "'callActivity'", "'forActiom'", "'useService'", "'forOp'", "'arg='", "'launchService'", "'execAction'", "'data'", "'category'", "'scheme'", "'host'", "'port'", "'path'", "'Application'", "'avd'", "'package'", "'entryActiviy'", "'target'", "'workdir'", "'.'", "'launchable'", "'button'"
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


    // $ANTLR start entryRuleLocalOperation
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:145:1: entryRuleLocalOperation : ruleLocalOperation EOF ;
    public final void entryRuleLocalOperation() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:146:1: ( ruleLocalOperation EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:147:1: ruleLocalOperation EOF
            {
             before(grammarAccess.getLocalOperationRule()); 
            pushFollow(FOLLOW_ruleLocalOperation_in_entryRuleLocalOperation241);
            ruleLocalOperation();
            _fsp--;

             after(grammarAccess.getLocalOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalOperation248); 

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
    // $ANTLR end entryRuleLocalOperation


    // $ANTLR start ruleLocalOperation
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:154:1: ruleLocalOperation : ( ( rule__LocalOperation__Group__0 ) ) ;
    public final void ruleLocalOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:158:2: ( ( ( rule__LocalOperation__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:159:1: ( ( rule__LocalOperation__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:159:1: ( ( rule__LocalOperation__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:160:1: ( rule__LocalOperation__Group__0 )
            {
             before(grammarAccess.getLocalOperationAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:161:1: ( rule__LocalOperation__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:161:2: rule__LocalOperation__Group__0
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__0_in_ruleLocalOperation274);
            rule__LocalOperation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLocalOperationAccess().getGroup()); 

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
    // $ANTLR end ruleLocalOperation


    // $ANTLR start entryRuleService
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:173:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:174:1: ( ruleService EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:175:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService301);
            ruleService();
            _fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService308); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:182:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:186:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:187:1: ( ( rule__Service__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:187:1: ( ( rule__Service__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:188:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:189:1: ( rule__Service__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:189:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService334);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:201:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:202:1: ( ruleActivity EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:203:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity361);
            ruleActivity();
            _fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity368); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:210:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:214:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:215:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:215:1: ( ( rule__Activity__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:216:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:217:1: ( rule__Activity__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:217:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity394);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:229:1: entryRuleLocalAction : ruleLocalAction EOF ;
    public final void entryRuleLocalAction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:230:1: ( ruleLocalAction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:231:1: ruleLocalAction EOF
            {
             before(grammarAccess.getLocalActionRule()); 
            pushFollow(FOLLOW_ruleLocalAction_in_entryRuleLocalAction421);
            ruleLocalAction();
            _fsp--;

             after(grammarAccess.getLocalActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAction428); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:238:1: ruleLocalAction : ( ( rule__LocalAction__Group__0 ) ) ;
    public final void ruleLocalAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:242:2: ( ( ( rule__LocalAction__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:243:1: ( ( rule__LocalAction__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:243:1: ( ( rule__LocalAction__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:244:1: ( rule__LocalAction__Group__0 )
            {
             before(grammarAccess.getLocalActionAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:245:1: ( rule__LocalAction__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:245:2: rule__LocalAction__Group__0
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__0_in_ruleLocalAction454);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:257:1: entryRuleInterAction : ruleInterAction EOF ;
    public final void entryRuleInterAction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:258:1: ( ruleInterAction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:259:1: ruleInterAction EOF
            {
             before(grammarAccess.getInterActionRule()); 
            pushFollow(FOLLOW_ruleInterAction_in_entryRuleInterAction481);
            ruleInterAction();
            _fsp--;

             after(grammarAccess.getInterActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterAction488); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:266:1: ruleInterAction : ( ( rule__InterAction__Alternatives ) ) ;
    public final void ruleInterAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:270:2: ( ( ( rule__InterAction__Alternatives ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:271:1: ( ( rule__InterAction__Alternatives ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:271:1: ( ( rule__InterAction__Alternatives ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:272:1: ( rule__InterAction__Alternatives )
            {
             before(grammarAccess.getInterActionAccess().getAlternatives()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:273:1: ( rule__InterAction__Alternatives )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:273:2: rule__InterAction__Alternatives
            {
            pushFollow(FOLLOW_rule__InterAction__Alternatives_in_ruleInterAction514);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:285:1: entryRuleExplicitInteraction : ruleExplicitInteraction EOF ;
    public final void entryRuleExplicitInteraction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:286:1: ( ruleExplicitInteraction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:287:1: ruleExplicitInteraction EOF
            {
             before(grammarAccess.getExplicitInteractionRule()); 
            pushFollow(FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction541);
            ruleExplicitInteraction();
            _fsp--;

             after(grammarAccess.getExplicitInteractionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteraction548); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:294:1: ruleExplicitInteraction : ( ( rule__ExplicitInteraction__Alternatives ) ) ;
    public final void ruleExplicitInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:298:2: ( ( ( rule__ExplicitInteraction__Alternatives ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:299:1: ( ( rule__ExplicitInteraction__Alternatives ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:299:1: ( ( rule__ExplicitInteraction__Alternatives ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:300:1: ( rule__ExplicitInteraction__Alternatives )
            {
             before(grammarAccess.getExplicitInteractionAccess().getAlternatives()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:301:1: ( rule__ExplicitInteraction__Alternatives )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:301:2: rule__ExplicitInteraction__Alternatives
            {
            pushFollow(FOLLOW_rule__ExplicitInteraction__Alternatives_in_ruleExplicitInteraction574);
            rule__ExplicitInteraction__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExplicitInteractionAccess().getAlternatives()); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:313:1: entryRuleExplicitInteractionActivity : ruleExplicitInteractionActivity EOF ;
    public final void entryRuleExplicitInteractionActivity() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:314:1: ( ruleExplicitInteractionActivity EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:315:1: ruleExplicitInteractionActivity EOF
            {
             before(grammarAccess.getExplicitInteractionActivityRule()); 
            pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity601);
            ruleExplicitInteractionActivity();
            _fsp--;

             after(grammarAccess.getExplicitInteractionActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteractionActivity608); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:322:1: ruleExplicitInteractionActivity : ( ( rule__ExplicitInteractionActivity__Group__0 ) ) ;
    public final void ruleExplicitInteractionActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:326:2: ( ( ( rule__ExplicitInteractionActivity__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:327:1: ( ( rule__ExplicitInteractionActivity__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:327:1: ( ( rule__ExplicitInteractionActivity__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:328:1: ( rule__ExplicitInteractionActivity__Group__0 )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:329:1: ( rule__ExplicitInteractionActivity__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:329:2: rule__ExplicitInteractionActivity__Group__0
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__0_in_ruleExplicitInteractionActivity634);
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


    // $ANTLR start entryRuleExplicitInteractionService
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:341:1: entryRuleExplicitInteractionService : ruleExplicitInteractionService EOF ;
    public final void entryRuleExplicitInteractionService() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:342:1: ( ruleExplicitInteractionService EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:343:1: ruleExplicitInteractionService EOF
            {
             before(grammarAccess.getExplicitInteractionServiceRule()); 
            pushFollow(FOLLOW_ruleExplicitInteractionService_in_entryRuleExplicitInteractionService661);
            ruleExplicitInteractionService();
            _fsp--;

             after(grammarAccess.getExplicitInteractionServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteractionService668); 

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
    // $ANTLR end entryRuleExplicitInteractionService


    // $ANTLR start ruleExplicitInteractionService
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:350:1: ruleExplicitInteractionService : ( ( rule__ExplicitInteractionService__Alternatives ) ) ;
    public final void ruleExplicitInteractionService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:354:2: ( ( ( rule__ExplicitInteractionService__Alternatives ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:355:1: ( ( rule__ExplicitInteractionService__Alternatives ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:355:1: ( ( rule__ExplicitInteractionService__Alternatives ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:356:1: ( rule__ExplicitInteractionService__Alternatives )
            {
             before(grammarAccess.getExplicitInteractionServiceAccess().getAlternatives()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:357:1: ( rule__ExplicitInteractionService__Alternatives )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:357:2: rule__ExplicitInteractionService__Alternatives
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionService__Alternatives_in_ruleExplicitInteractionService694);
            rule__ExplicitInteractionService__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExplicitInteractionServiceAccess().getAlternatives()); 

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
    // $ANTLR end ruleExplicitInteractionService


    // $ANTLR start entryRuleUseService
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:369:1: entryRuleUseService : ruleUseService EOF ;
    public final void entryRuleUseService() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:370:1: ( ruleUseService EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:371:1: ruleUseService EOF
            {
             before(grammarAccess.getUseServiceRule()); 
            pushFollow(FOLLOW_ruleUseService_in_entryRuleUseService721);
            ruleUseService();
            _fsp--;

             after(grammarAccess.getUseServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseService728); 

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
    // $ANTLR end entryRuleUseService


    // $ANTLR start ruleUseService
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:378:1: ruleUseService : ( ( rule__UseService__Group__0 ) ) ;
    public final void ruleUseService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:382:2: ( ( ( rule__UseService__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:383:1: ( ( rule__UseService__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:383:1: ( ( rule__UseService__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:384:1: ( rule__UseService__Group__0 )
            {
             before(grammarAccess.getUseServiceAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:385:1: ( rule__UseService__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:385:2: rule__UseService__Group__0
            {
            pushFollow(FOLLOW_rule__UseService__Group__0_in_ruleUseService754);
            rule__UseService__Group__0();
            _fsp--;


            }

             after(grammarAccess.getUseServiceAccess().getGroup()); 

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
    // $ANTLR end ruleUseService


    // $ANTLR start entryRuleLaunchservice
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:397:1: entryRuleLaunchservice : ruleLaunchservice EOF ;
    public final void entryRuleLaunchservice() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:398:1: ( ruleLaunchservice EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:399:1: ruleLaunchservice EOF
            {
             before(grammarAccess.getLaunchserviceRule()); 
            pushFollow(FOLLOW_ruleLaunchservice_in_entryRuleLaunchservice781);
            ruleLaunchservice();
            _fsp--;

             after(grammarAccess.getLaunchserviceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLaunchservice788); 

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
    // $ANTLR end entryRuleLaunchservice


    // $ANTLR start ruleLaunchservice
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:406:1: ruleLaunchservice : ( ( rule__Launchservice__Group__0 ) ) ;
    public final void ruleLaunchservice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:410:2: ( ( ( rule__Launchservice__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:411:1: ( ( rule__Launchservice__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:411:1: ( ( rule__Launchservice__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:412:1: ( rule__Launchservice__Group__0 )
            {
             before(grammarAccess.getLaunchserviceAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:413:1: ( rule__Launchservice__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:413:2: rule__Launchservice__Group__0
            {
            pushFollow(FOLLOW_rule__Launchservice__Group__0_in_ruleLaunchservice814);
            rule__Launchservice__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLaunchserviceAccess().getGroup()); 

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
    // $ANTLR end ruleLaunchservice


    // $ANTLR start entryRuleActionOnlyInteraction
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:425:1: entryRuleActionOnlyInteraction : ruleActionOnlyInteraction EOF ;
    public final void entryRuleActionOnlyInteraction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:426:1: ( ruleActionOnlyInteraction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:427:1: ruleActionOnlyInteraction EOF
            {
             before(grammarAccess.getActionOnlyInteractionRule()); 
            pushFollow(FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction841);
            ruleActionOnlyInteraction();
            _fsp--;

             after(grammarAccess.getActionOnlyInteractionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionOnlyInteraction848); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:434:1: ruleActionOnlyInteraction : ( ( rule__ActionOnlyInteraction__Group__0 ) ) ;
    public final void ruleActionOnlyInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:438:2: ( ( ( rule__ActionOnlyInteraction__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:439:1: ( ( rule__ActionOnlyInteraction__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:439:1: ( ( rule__ActionOnlyInteraction__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:440:1: ( rule__ActionOnlyInteraction__Group__0 )
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:441:1: ( rule__ActionOnlyInteraction__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:441:2: rule__ActionOnlyInteraction__Group__0
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__0_in_ruleActionOnlyInteraction874);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:453:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:454:1: ( ruleAction EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:455:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction901);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction908); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:462:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:466:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:467:1: ( ( rule__Action__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:467:1: ( ( rule__Action__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:468:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:469:1: ( rule__Action__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:469:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction934);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:481:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:482:1: ( ruleData EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:483:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData961);
            ruleData();
            _fsp--;

             after(grammarAccess.getDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData968); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:490:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:494:2: ( ( ( rule__Data__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:495:1: ( ( rule__Data__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:495:1: ( ( rule__Data__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:496:1: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:497:1: ( rule__Data__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:497:2: rule__Data__Group__0
            {
            pushFollow(FOLLOW_rule__Data__Group__0_in_ruleData994);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:509:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:510:1: ( ruleApplication EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:511:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication1021);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication1028); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:518:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:522:2: ( ( ( rule__Application__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:523:1: ( ( rule__Application__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:523:1: ( ( rule__Application__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:524:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:525:1: ( rule__Application__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:525:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication1054);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:537:1: entryRuleURI : ruleURI EOF ;
    public final void entryRuleURI() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:538:1: ( ruleURI EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:539:1: ruleURI EOF
            {
             before(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI1081);
            ruleURI();
            _fsp--;

             after(grammarAccess.getURIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI1088); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:546:1: ruleURI : ( ( rule__URI__Group__0 ) ) ;
    public final void ruleURI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:550:2: ( ( ( rule__URI__Group__0 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:551:1: ( ( rule__URI__Group__0 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:551:1: ( ( rule__URI__Group__0 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:552:1: ( rule__URI__Group__0 )
            {
             before(grammarAccess.getURIAccess().getGroup()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:553:1: ( rule__URI__Group__0 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:553:2: rule__URI__Group__0
            {
            pushFollow(FOLLOW_rule__URI__Group__0_in_ruleURI1114);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:565:1: entryRuleRestUri : ruleRestUri EOF ;
    public final void entryRuleRestUri() throws RecognitionException {
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:566:1: ( ruleRestUri EOF )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:567:1: ruleRestUri EOF
            {
             before(grammarAccess.getRestUriRule()); 
            pushFollow(FOLLOW_ruleRestUri_in_entryRuleRestUri1141);
            ruleRestUri();
            _fsp--;

             after(grammarAccess.getRestUriRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestUri1148); 

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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:574:1: ruleRestUri : ( ( rule__RestUri__Alternatives ) ) ;
    public final void ruleRestUri() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:578:2: ( ( ( rule__RestUri__Alternatives ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:579:1: ( ( rule__RestUri__Alternatives ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:579:1: ( ( rule__RestUri__Alternatives ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:580:1: ( rule__RestUri__Alternatives )
            {
             before(grammarAccess.getRestUriAccess().getAlternatives()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:581:1: ( rule__RestUri__Alternatives )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:581:2: rule__RestUri__Alternatives
            {
            pushFollow(FOLLOW_rule__RestUri__Alternatives_in_ruleRestUri1174);
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


    // $ANTLR start ruleInputType
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:594:1: ruleInputType : ( ( rule__InputType__Alternatives ) ) ;
    public final void ruleInputType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:598:1: ( ( ( rule__InputType__Alternatives ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:599:1: ( ( rule__InputType__Alternatives ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:599:1: ( ( rule__InputType__Alternatives ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:600:1: ( rule__InputType__Alternatives )
            {
             before(grammarAccess.getInputTypeAccess().getAlternatives()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:601:1: ( rule__InputType__Alternatives )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:601:2: rule__InputType__Alternatives
            {
            pushFollow(FOLLOW_rule__InputType__Alternatives_in_ruleInputType1211);
            rule__InputType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getInputTypeAccess().getAlternatives()); 

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
    // $ANTLR end ruleInputType


    // $ANTLR start rule__Component__Alternatives
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:612:1: rule__Component__Alternatives : ( ( ruleActivity ) | ( ruleService ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:616:1: ( ( ruleActivity ) | ( ruleService ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("612:1: rule__Component__Alternatives : ( ( ruleActivity ) | ( ruleService ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:617:1: ( ruleActivity )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:617:1: ( ruleActivity )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:618:1: ruleActivity
                    {
                     before(grammarAccess.getComponentAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActivity_in_rule__Component__Alternatives1246);
                    ruleActivity();
                    _fsp--;

                     after(grammarAccess.getComponentAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:623:6: ( ruleService )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:623:6: ( ruleService )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:624:1: ruleService
                    {
                     before(grammarAccess.getComponentAccess().getServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleService_in_rule__Component__Alternatives1263);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:634:1: rule__InterAction__Alternatives : ( ( ( rule__InterAction__Group_0__0 ) ) | ( ( rule__InterAction__Group_1__0 ) ) );
    public final void rule__InterAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:638:1: ( ( ( rule__InterAction__Group_0__0 ) ) | ( ( rule__InterAction__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23||LA2_0==25||LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("634:1: rule__InterAction__Alternatives : ( ( ( rule__InterAction__Group_0__0 ) ) | ( ( rule__InterAction__Group_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:639:1: ( ( rule__InterAction__Group_0__0 ) )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:639:1: ( ( rule__InterAction__Group_0__0 ) )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:640:1: ( rule__InterAction__Group_0__0 )
                    {
                     before(grammarAccess.getInterActionAccess().getGroup_0()); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:641:1: ( rule__InterAction__Group_0__0 )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:641:2: rule__InterAction__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InterAction__Group_0__0_in_rule__InterAction__Alternatives1295);
                    rule__InterAction__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getInterActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:645:6: ( ( rule__InterAction__Group_1__0 ) )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:645:6: ( ( rule__InterAction__Group_1__0 ) )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:646:1: ( rule__InterAction__Group_1__0 )
                    {
                     before(grammarAccess.getInterActionAccess().getGroup_1()); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:647:1: ( rule__InterAction__Group_1__0 )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:647:2: rule__InterAction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InterAction__Group_1__0_in_rule__InterAction__Alternatives1313);
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


    // $ANTLR start rule__ExplicitInteraction__Alternatives
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:656:1: rule__ExplicitInteraction__Alternatives : ( ( ruleExplicitInteractionActivity ) | ( ruleExplicitInteractionService ) );
    public final void rule__ExplicitInteraction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:660:1: ( ( ruleExplicitInteractionActivity ) | ( ruleExplicitInteractionService ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==25||LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("656:1: rule__ExplicitInteraction__Alternatives : ( ( ruleExplicitInteractionActivity ) | ( ruleExplicitInteractionService ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:661:1: ( ruleExplicitInteractionActivity )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:661:1: ( ruleExplicitInteractionActivity )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:662:1: ruleExplicitInteractionActivity
                    {
                     before(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_rule__ExplicitInteraction__Alternatives1346);
                    ruleExplicitInteractionActivity();
                    _fsp--;

                     after(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:667:6: ( ruleExplicitInteractionService )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:667:6: ( ruleExplicitInteractionService )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:668:1: ruleExplicitInteractionService
                    {
                     before(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExplicitInteractionService_in_rule__ExplicitInteraction__Alternatives1363);
                    ruleExplicitInteractionService();
                    _fsp--;

                     after(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionServiceParserRuleCall_1()); 

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
    // $ANTLR end rule__ExplicitInteraction__Alternatives


    // $ANTLR start rule__ExplicitInteractionService__Alternatives
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:678:1: rule__ExplicitInteractionService__Alternatives : ( ( ruleUseService ) | ( ruleLaunchservice ) );
    public final void rule__ExplicitInteractionService__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:682:1: ( ( ruleUseService ) | ( ruleLaunchservice ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("678:1: rule__ExplicitInteractionService__Alternatives : ( ( ruleUseService ) | ( ruleLaunchservice ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:683:1: ( ruleUseService )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:683:1: ( ruleUseService )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:684:1: ruleUseService
                    {
                     before(grammarAccess.getExplicitInteractionServiceAccess().getUseServiceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUseService_in_rule__ExplicitInteractionService__Alternatives1395);
                    ruleUseService();
                    _fsp--;

                     after(grammarAccess.getExplicitInteractionServiceAccess().getUseServiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:689:6: ( ruleLaunchservice )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:689:6: ( ruleLaunchservice )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:690:1: ruleLaunchservice
                    {
                     before(grammarAccess.getExplicitInteractionServiceAccess().getLaunchserviceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLaunchservice_in_rule__ExplicitInteractionService__Alternatives1412);
                    ruleLaunchservice();
                    _fsp--;

                     after(grammarAccess.getExplicitInteractionServiceAccess().getLaunchserviceParserRuleCall_1()); 

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
    // $ANTLR end rule__ExplicitInteractionService__Alternatives


    // $ANTLR start rule__RestUri__Alternatives
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:700:1: rule__RestUri__Alternatives : ( ( RULE_ID ) | ( ruleURI ) );
    public final void rule__RestUri__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:704:1: ( ( RULE_ID ) | ( ruleURI ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==42) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==39) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("700:1: rule__RestUri__Alternatives : ( ( RULE_ID ) | ( ruleURI ) );", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("700:1: rule__RestUri__Alternatives : ( ( RULE_ID ) | ( ruleURI ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:705:1: ( RULE_ID )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:705:1: ( RULE_ID )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:706:1: RULE_ID
                    {
                     before(grammarAccess.getRestUriAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RestUri__Alternatives1444); 
                     after(grammarAccess.getRestUriAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:711:6: ( ruleURI )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:711:6: ( ruleURI )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:712:1: ruleURI
                    {
                     before(grammarAccess.getRestUriAccess().getURIParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleURI_in_rule__RestUri__Alternatives1461);
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


    // $ANTLR start rule__InputType__Alternatives
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:722:1: rule__InputType__Alternatives : ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) );
    public final void rule__InputType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:726:1: ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("722:1: rule__InputType__Alternatives : ( ( ( 'String' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:727:1: ( ( 'String' ) )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:727:1: ( ( 'String' ) )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:728:1: ( 'String' )
                    {
                     before(grammarAccess.getInputTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:729:1: ( 'String' )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:729:3: 'String'
                    {
                    match(input,11,FOLLOW_11_in_rule__InputType__Alternatives1494); 

                    }

                     after(grammarAccess.getInputTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:734:6: ( ( 'int' ) )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:734:6: ( ( 'int' ) )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:735:1: ( 'int' )
                    {
                     before(grammarAccess.getInputTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:736:1: ( 'int' )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:736:3: 'int'
                    {
                    match(input,12,FOLLOW_12_in_rule__InputType__Alternatives1515); 

                    }

                     after(grammarAccess.getInputTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:741:6: ( ( 'double' ) )
                    {
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:741:6: ( ( 'double' ) )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:742:1: ( 'double' )
                    {
                     before(grammarAccess.getInputTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:743:1: ( 'double' )
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:743:3: 'double'
                    {
                    match(input,13,FOLLOW_13_in_rule__InputType__Alternatives1536); 

                    }

                     after(grammarAccess.getInputTypeAccess().getDoubleEnumLiteralDeclaration_2()); 

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
    // $ANTLR end rule__InputType__Alternatives


    // $ANTLR start rule__AndroidSystem__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:755:1: rule__AndroidSystem__Group__0 : rule__AndroidSystem__Group__0__Impl rule__AndroidSystem__Group__1 ;
    public final void rule__AndroidSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:759:1: ( rule__AndroidSystem__Group__0__Impl rule__AndroidSystem__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:760:2: rule__AndroidSystem__Group__0__Impl rule__AndroidSystem__Group__1
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__0__Impl_in_rule__AndroidSystem__Group__01569);
            rule__AndroidSystem__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__1_in_rule__AndroidSystem__Group__01572);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:767:1: rule__AndroidSystem__Group__0__Impl : ( ( rule__AndroidSystem__DataAssignment_0 )* ) ;
    public final void rule__AndroidSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:771:1: ( ( ( rule__AndroidSystem__DataAssignment_0 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:772:1: ( ( rule__AndroidSystem__DataAssignment_0 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:772:1: ( ( rule__AndroidSystem__DataAssignment_0 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:773:1: ( rule__AndroidSystem__DataAssignment_0 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getDataAssignment_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:774:1: ( rule__AndroidSystem__DataAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:774:2: rule__AndroidSystem__DataAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__DataAssignment_0_in_rule__AndroidSystem__Group__0__Impl1599);
            	    rule__AndroidSystem__DataAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:784:1: rule__AndroidSystem__Group__1 : rule__AndroidSystem__Group__1__Impl rule__AndroidSystem__Group__2 ;
    public final void rule__AndroidSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:788:1: ( rule__AndroidSystem__Group__1__Impl rule__AndroidSystem__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:789:2: rule__AndroidSystem__Group__1__Impl rule__AndroidSystem__Group__2
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__1__Impl_in_rule__AndroidSystem__Group__11630);
            rule__AndroidSystem__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__2_in_rule__AndroidSystem__Group__11633);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:796:1: rule__AndroidSystem__Group__1__Impl : ( ( rule__AndroidSystem__ActionAssignment_1 )* ) ;
    public final void rule__AndroidSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:800:1: ( ( ( rule__AndroidSystem__ActionAssignment_1 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:801:1: ( ( rule__AndroidSystem__ActionAssignment_1 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:801:1: ( ( rule__AndroidSystem__ActionAssignment_1 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:802:1: ( rule__AndroidSystem__ActionAssignment_1 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getActionAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:803:1: ( rule__AndroidSystem__ActionAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:803:2: rule__AndroidSystem__ActionAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__ActionAssignment_1_in_rule__AndroidSystem__Group__1__Impl1660);
            	    rule__AndroidSystem__ActionAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:813:1: rule__AndroidSystem__Group__2 : rule__AndroidSystem__Group__2__Impl rule__AndroidSystem__Group__3 ;
    public final void rule__AndroidSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:817:1: ( rule__AndroidSystem__Group__2__Impl rule__AndroidSystem__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:818:2: rule__AndroidSystem__Group__2__Impl rule__AndroidSystem__Group__3
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__2__Impl_in_rule__AndroidSystem__Group__21691);
            rule__AndroidSystem__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__3_in_rule__AndroidSystem__Group__21694);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:825:1: rule__AndroidSystem__Group__2__Impl : ( ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )* ) ;
    public final void rule__AndroidSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:829:1: ( ( ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:830:1: ( ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:830:1: ( ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:831:1: ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getServiceInterfaceAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:832:1: ( rule__AndroidSystem__ServiceInterfaceAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:832:2: rule__AndroidSystem__ServiceInterfaceAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__ServiceInterfaceAssignment_2_in_rule__AndroidSystem__Group__2__Impl1721);
            	    rule__AndroidSystem__ServiceInterfaceAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:842:1: rule__AndroidSystem__Group__3 : rule__AndroidSystem__Group__3__Impl rule__AndroidSystem__Group__4 ;
    public final void rule__AndroidSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:846:1: ( rule__AndroidSystem__Group__3__Impl rule__AndroidSystem__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:847:2: rule__AndroidSystem__Group__3__Impl rule__AndroidSystem__Group__4
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__3__Impl_in_rule__AndroidSystem__Group__31752);
            rule__AndroidSystem__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__4_in_rule__AndroidSystem__Group__31755);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:854:1: rule__AndroidSystem__Group__3__Impl : ( ( rule__AndroidSystem__ComponentAssignment_3 )* ) ;
    public final void rule__AndroidSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:858:1: ( ( ( rule__AndroidSystem__ComponentAssignment_3 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:859:1: ( ( rule__AndroidSystem__ComponentAssignment_3 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:859:1: ( ( rule__AndroidSystem__ComponentAssignment_3 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:860:1: ( rule__AndroidSystem__ComponentAssignment_3 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getComponentAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:861:1: ( rule__AndroidSystem__ComponentAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19||LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:861:2: rule__AndroidSystem__ComponentAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__ComponentAssignment_3_in_rule__AndroidSystem__Group__3__Impl1782);
            	    rule__AndroidSystem__ComponentAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:871:1: rule__AndroidSystem__Group__4 : rule__AndroidSystem__Group__4__Impl ;
    public final void rule__AndroidSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:875:1: ( rule__AndroidSystem__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:876:2: rule__AndroidSystem__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__4__Impl_in_rule__AndroidSystem__Group__41813);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:882:1: rule__AndroidSystem__Group__4__Impl : ( ( rule__AndroidSystem__ApplicationAssignment_4 ) ) ;
    public final void rule__AndroidSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:886:1: ( ( ( rule__AndroidSystem__ApplicationAssignment_4 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:887:1: ( ( rule__AndroidSystem__ApplicationAssignment_4 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:887:1: ( ( rule__AndroidSystem__ApplicationAssignment_4 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:888:1: ( rule__AndroidSystem__ApplicationAssignment_4 )
            {
             before(grammarAccess.getAndroidSystemAccess().getApplicationAssignment_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:889:1: ( rule__AndroidSystem__ApplicationAssignment_4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:889:2: rule__AndroidSystem__ApplicationAssignment_4
            {
            pushFollow(FOLLOW_rule__AndroidSystem__ApplicationAssignment_4_in_rule__AndroidSystem__Group__4__Impl1840);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:909:1: rule__ServiceInterface__Group__0 : rule__ServiceInterface__Group__0__Impl rule__ServiceInterface__Group__1 ;
    public final void rule__ServiceInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:913:1: ( rule__ServiceInterface__Group__0__Impl rule__ServiceInterface__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:914:2: rule__ServiceInterface__Group__0__Impl rule__ServiceInterface__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceInterface__Group__0__Impl_in_rule__ServiceInterface__Group__01880);
            rule__ServiceInterface__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ServiceInterface__Group__1_in_rule__ServiceInterface__Group__01883);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:921:1: rule__ServiceInterface__Group__0__Impl : ( 'serviceInterface' ) ;
    public final void rule__ServiceInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:925:1: ( ( 'serviceInterface' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:926:1: ( 'serviceInterface' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:926:1: ( 'serviceInterface' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:927:1: 'serviceInterface'
            {
             before(grammarAccess.getServiceInterfaceAccess().getServiceInterfaceKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__ServiceInterface__Group__0__Impl1911); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:940:1: rule__ServiceInterface__Group__1 : rule__ServiceInterface__Group__1__Impl rule__ServiceInterface__Group__2 ;
    public final void rule__ServiceInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:944:1: ( rule__ServiceInterface__Group__1__Impl rule__ServiceInterface__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:945:2: rule__ServiceInterface__Group__1__Impl rule__ServiceInterface__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceInterface__Group__1__Impl_in_rule__ServiceInterface__Group__11942);
            rule__ServiceInterface__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ServiceInterface__Group__2_in_rule__ServiceInterface__Group__11945);
            rule__ServiceInterface__Group__2();
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:952:1: rule__ServiceInterface__Group__1__Impl : ( ( rule__ServiceInterface__NameAssignment_1 ) ) ;
    public final void rule__ServiceInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:956:1: ( ( ( rule__ServiceInterface__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:957:1: ( ( rule__ServiceInterface__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:957:1: ( ( rule__ServiceInterface__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:958:1: ( rule__ServiceInterface__NameAssignment_1 )
            {
             before(grammarAccess.getServiceInterfaceAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:959:1: ( rule__ServiceInterface__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:959:2: rule__ServiceInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceInterface__NameAssignment_1_in_rule__ServiceInterface__Group__1__Impl1972);
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


    // $ANTLR start rule__ServiceInterface__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:969:1: rule__ServiceInterface__Group__2 : rule__ServiceInterface__Group__2__Impl ;
    public final void rule__ServiceInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:973:1: ( rule__ServiceInterface__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:974:2: rule__ServiceInterface__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ServiceInterface__Group__2__Impl_in_rule__ServiceInterface__Group__22002);
            rule__ServiceInterface__Group__2__Impl();
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
    // $ANTLR end rule__ServiceInterface__Group__2


    // $ANTLR start rule__ServiceInterface__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:980:1: rule__ServiceInterface__Group__2__Impl : ( ( rule__ServiceInterface__OperationAssignment_2 )* ) ;
    public final void rule__ServiceInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:984:1: ( ( ( rule__ServiceInterface__OperationAssignment_2 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:985:1: ( ( rule__ServiceInterface__OperationAssignment_2 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:985:1: ( ( rule__ServiceInterface__OperationAssignment_2 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:986:1: ( rule__ServiceInterface__OperationAssignment_2 )*
            {
             before(grammarAccess.getServiceInterfaceAccess().getOperationAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:987:1: ( rule__ServiceInterface__OperationAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:987:2: rule__ServiceInterface__OperationAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ServiceInterface__OperationAssignment_2_in_rule__ServiceInterface__Group__2__Impl2029);
            	    rule__ServiceInterface__OperationAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getServiceInterfaceAccess().getOperationAssignment_2()); 

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
    // $ANTLR end rule__ServiceInterface__Group__2__Impl


    // $ANTLR start rule__LocalOperation__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1003:1: rule__LocalOperation__Group__0 : rule__LocalOperation__Group__0__Impl rule__LocalOperation__Group__1 ;
    public final void rule__LocalOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1007:1: ( rule__LocalOperation__Group__0__Impl rule__LocalOperation__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1008:2: rule__LocalOperation__Group__0__Impl rule__LocalOperation__Group__1
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__0__Impl_in_rule__LocalOperation__Group__02066);
            rule__LocalOperation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group__1_in_rule__LocalOperation__Group__02069);
            rule__LocalOperation__Group__1();
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
    // $ANTLR end rule__LocalOperation__Group__0


    // $ANTLR start rule__LocalOperation__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1015:1: rule__LocalOperation__Group__0__Impl : ( 'op' ) ;
    public final void rule__LocalOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1019:1: ( ( 'op' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1020:1: ( 'op' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1020:1: ( 'op' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1021:1: 'op'
            {
             before(grammarAccess.getLocalOperationAccess().getOpKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__LocalOperation__Group__0__Impl2097); 
             after(grammarAccess.getLocalOperationAccess().getOpKeyword_0()); 

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
    // $ANTLR end rule__LocalOperation__Group__0__Impl


    // $ANTLR start rule__LocalOperation__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1034:1: rule__LocalOperation__Group__1 : rule__LocalOperation__Group__1__Impl rule__LocalOperation__Group__2 ;
    public final void rule__LocalOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1038:1: ( rule__LocalOperation__Group__1__Impl rule__LocalOperation__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1039:2: rule__LocalOperation__Group__1__Impl rule__LocalOperation__Group__2
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__1__Impl_in_rule__LocalOperation__Group__12128);
            rule__LocalOperation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group__2_in_rule__LocalOperation__Group__12131);
            rule__LocalOperation__Group__2();
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
    // $ANTLR end rule__LocalOperation__Group__1


    // $ANTLR start rule__LocalOperation__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1046:1: rule__LocalOperation__Group__1__Impl : ( ( rule__LocalOperation__NameAssignment_1 ) ) ;
    public final void rule__LocalOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1050:1: ( ( ( rule__LocalOperation__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1051:1: ( ( rule__LocalOperation__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1051:1: ( ( rule__LocalOperation__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1052:1: ( rule__LocalOperation__NameAssignment_1 )
            {
             before(grammarAccess.getLocalOperationAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1053:1: ( rule__LocalOperation__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1053:2: rule__LocalOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LocalOperation__NameAssignment_1_in_rule__LocalOperation__Group__1__Impl2158);
            rule__LocalOperation__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLocalOperationAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__LocalOperation__Group__1__Impl


    // $ANTLR start rule__LocalOperation__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1063:1: rule__LocalOperation__Group__2 : rule__LocalOperation__Group__2__Impl rule__LocalOperation__Group__3 ;
    public final void rule__LocalOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1067:1: ( rule__LocalOperation__Group__2__Impl rule__LocalOperation__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1068:2: rule__LocalOperation__Group__2__Impl rule__LocalOperation__Group__3
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__2__Impl_in_rule__LocalOperation__Group__22188);
            rule__LocalOperation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group__3_in_rule__LocalOperation__Group__22191);
            rule__LocalOperation__Group__3();
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
    // $ANTLR end rule__LocalOperation__Group__2


    // $ANTLR start rule__LocalOperation__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1075:1: rule__LocalOperation__Group__2__Impl : ( 'return' ) ;
    public final void rule__LocalOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1079:1: ( ( 'return' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1080:1: ( 'return' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1080:1: ( 'return' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1081:1: 'return'
            {
             before(grammarAccess.getLocalOperationAccess().getReturnKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__LocalOperation__Group__2__Impl2219); 
             after(grammarAccess.getLocalOperationAccess().getReturnKeyword_2()); 

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
    // $ANTLR end rule__LocalOperation__Group__2__Impl


    // $ANTLR start rule__LocalOperation__Group__3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1094:1: rule__LocalOperation__Group__3 : rule__LocalOperation__Group__3__Impl rule__LocalOperation__Group__4 ;
    public final void rule__LocalOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1098:1: ( rule__LocalOperation__Group__3__Impl rule__LocalOperation__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1099:2: rule__LocalOperation__Group__3__Impl rule__LocalOperation__Group__4
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__3__Impl_in_rule__LocalOperation__Group__32250);
            rule__LocalOperation__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group__4_in_rule__LocalOperation__Group__32253);
            rule__LocalOperation__Group__4();
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
    // $ANTLR end rule__LocalOperation__Group__3


    // $ANTLR start rule__LocalOperation__Group__3__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1106:1: rule__LocalOperation__Group__3__Impl : ( ( rule__LocalOperation__ReturnAssignment_3 ) ) ;
    public final void rule__LocalOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1110:1: ( ( ( rule__LocalOperation__ReturnAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1111:1: ( ( rule__LocalOperation__ReturnAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1111:1: ( ( rule__LocalOperation__ReturnAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1112:1: ( rule__LocalOperation__ReturnAssignment_3 )
            {
             before(grammarAccess.getLocalOperationAccess().getReturnAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1113:1: ( rule__LocalOperation__ReturnAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1113:2: rule__LocalOperation__ReturnAssignment_3
            {
            pushFollow(FOLLOW_rule__LocalOperation__ReturnAssignment_3_in_rule__LocalOperation__Group__3__Impl2280);
            rule__LocalOperation__ReturnAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getLocalOperationAccess().getReturnAssignment_3()); 

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
    // $ANTLR end rule__LocalOperation__Group__3__Impl


    // $ANTLR start rule__LocalOperation__Group__4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1123:1: rule__LocalOperation__Group__4 : rule__LocalOperation__Group__4__Impl ;
    public final void rule__LocalOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1127:1: ( rule__LocalOperation__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1128:2: rule__LocalOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__4__Impl_in_rule__LocalOperation__Group__42310);
            rule__LocalOperation__Group__4__Impl();
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
    // $ANTLR end rule__LocalOperation__Group__4


    // $ANTLR start rule__LocalOperation__Group__4__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1134:1: rule__LocalOperation__Group__4__Impl : ( ( rule__LocalOperation__Group_4__0 )* ) ;
    public final void rule__LocalOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1138:1: ( ( ( rule__LocalOperation__Group_4__0 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1139:1: ( ( rule__LocalOperation__Group_4__0 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1139:1: ( ( rule__LocalOperation__Group_4__0 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1140:1: ( rule__LocalOperation__Group_4__0 )*
            {
             before(grammarAccess.getLocalOperationAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1141:1: ( rule__LocalOperation__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1141:2: rule__LocalOperation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__LocalOperation__Group_4__0_in_rule__LocalOperation__Group__4__Impl2337);
            	    rule__LocalOperation__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getLocalOperationAccess().getGroup_4()); 

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
    // $ANTLR end rule__LocalOperation__Group__4__Impl


    // $ANTLR start rule__LocalOperation__Group_4__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1161:1: rule__LocalOperation__Group_4__0 : rule__LocalOperation__Group_4__0__Impl rule__LocalOperation__Group_4__1 ;
    public final void rule__LocalOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1165:1: ( rule__LocalOperation__Group_4__0__Impl rule__LocalOperation__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1166:2: rule__LocalOperation__Group_4__0__Impl rule__LocalOperation__Group_4__1
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group_4__0__Impl_in_rule__LocalOperation__Group_4__02378);
            rule__LocalOperation__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group_4__1_in_rule__LocalOperation__Group_4__02381);
            rule__LocalOperation__Group_4__1();
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
    // $ANTLR end rule__LocalOperation__Group_4__0


    // $ANTLR start rule__LocalOperation__Group_4__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1173:1: rule__LocalOperation__Group_4__0__Impl : ( 'inputType' ) ;
    public final void rule__LocalOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1177:1: ( ( 'inputType' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1178:1: ( 'inputType' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1178:1: ( 'inputType' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1179:1: 'inputType'
            {
             before(grammarAccess.getLocalOperationAccess().getInputTypeKeyword_4_0()); 
            match(input,17,FOLLOW_17_in_rule__LocalOperation__Group_4__0__Impl2409); 
             after(grammarAccess.getLocalOperationAccess().getInputTypeKeyword_4_0()); 

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
    // $ANTLR end rule__LocalOperation__Group_4__0__Impl


    // $ANTLR start rule__LocalOperation__Group_4__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1192:1: rule__LocalOperation__Group_4__1 : rule__LocalOperation__Group_4__1__Impl rule__LocalOperation__Group_4__2 ;
    public final void rule__LocalOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1196:1: ( rule__LocalOperation__Group_4__1__Impl rule__LocalOperation__Group_4__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1197:2: rule__LocalOperation__Group_4__1__Impl rule__LocalOperation__Group_4__2
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group_4__1__Impl_in_rule__LocalOperation__Group_4__12440);
            rule__LocalOperation__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group_4__2_in_rule__LocalOperation__Group_4__12443);
            rule__LocalOperation__Group_4__2();
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
    // $ANTLR end rule__LocalOperation__Group_4__1


    // $ANTLR start rule__LocalOperation__Group_4__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1204:1: rule__LocalOperation__Group_4__1__Impl : ( ( rule__LocalOperation__InputTypeAssignment_4_1 ) ) ;
    public final void rule__LocalOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1208:1: ( ( ( rule__LocalOperation__InputTypeAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1209:1: ( ( rule__LocalOperation__InputTypeAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1209:1: ( ( rule__LocalOperation__InputTypeAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1210:1: ( rule__LocalOperation__InputTypeAssignment_4_1 )
            {
             before(grammarAccess.getLocalOperationAccess().getInputTypeAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1211:1: ( rule__LocalOperation__InputTypeAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1211:2: rule__LocalOperation__InputTypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__LocalOperation__InputTypeAssignment_4_1_in_rule__LocalOperation__Group_4__1__Impl2470);
            rule__LocalOperation__InputTypeAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getLocalOperationAccess().getInputTypeAssignment_4_1()); 

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
    // $ANTLR end rule__LocalOperation__Group_4__1__Impl


    // $ANTLR start rule__LocalOperation__Group_4__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1221:1: rule__LocalOperation__Group_4__2 : rule__LocalOperation__Group_4__2__Impl ;
    public final void rule__LocalOperation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1225:1: ( rule__LocalOperation__Group_4__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1226:2: rule__LocalOperation__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group_4__2__Impl_in_rule__LocalOperation__Group_4__22500);
            rule__LocalOperation__Group_4__2__Impl();
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
    // $ANTLR end rule__LocalOperation__Group_4__2


    // $ANTLR start rule__LocalOperation__Group_4__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1232:1: rule__LocalOperation__Group_4__2__Impl : ( ';' ) ;
    public final void rule__LocalOperation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1236:1: ( ( ';' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1237:1: ( ';' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1237:1: ( ';' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1238:1: ';'
            {
             before(grammarAccess.getLocalOperationAccess().getSemicolonKeyword_4_2()); 
            match(input,18,FOLLOW_18_in_rule__LocalOperation__Group_4__2__Impl2528); 
             after(grammarAccess.getLocalOperationAccess().getSemicolonKeyword_4_2()); 

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
    // $ANTLR end rule__LocalOperation__Group_4__2__Impl


    // $ANTLR start rule__Service__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1257:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1261:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1262:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__02565);
            rule__Service__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__02568);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1269:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1273:1: ( ( 'Service' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1274:1: ( 'Service' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1274:1: ( 'Service' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1275:1: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Service__Group__0__Impl2596); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1288:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1292:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1293:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__12627);
            rule__Service__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__12630);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1300:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1304:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1305:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1305:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1306:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1307:1: ( rule__Service__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1307:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl2657);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1317:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1321:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1322:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__22687);
            rule__Service__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__22690);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1329:1: rule__Service__Group__2__Impl : ( 'implements' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1333:1: ( ( 'implements' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1334:1: ( 'implements' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1334:1: ( 'implements' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1335:1: 'implements'
            {
             before(grammarAccess.getServiceAccess().getImplementsKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Service__Group__2__Impl2718); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1348:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1352:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1353:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__32749);
            rule__Service__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__32752);
            rule__Service__Group__4();
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1360:1: rule__Service__Group__3__Impl : ( ( rule__Service__InterfaceAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1364:1: ( ( ( rule__Service__InterfaceAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1365:1: ( ( rule__Service__InterfaceAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1365:1: ( ( rule__Service__InterfaceAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1366:1: ( rule__Service__InterfaceAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getInterfaceAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1367:1: ( rule__Service__InterfaceAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1367:2: rule__Service__InterfaceAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__InterfaceAssignment_3_in_rule__Service__Group__3__Impl2779);
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


    // $ANTLR start rule__Service__Group__4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1377:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1381:1: ( rule__Service__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1382:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__42809);
            rule__Service__Group__4__Impl();
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
    // $ANTLR end rule__Service__Group__4


    // $ANTLR start rule__Service__Group__4__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1388:1: rule__Service__Group__4__Impl : ( ( rule__Service__ServiceInteractionAssignment_4 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1392:1: ( ( ( rule__Service__ServiceInteractionAssignment_4 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1393:1: ( ( rule__Service__ServiceInteractionAssignment_4 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1393:1: ( ( rule__Service__ServiceInteractionAssignment_4 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1394:1: ( rule__Service__ServiceInteractionAssignment_4 )*
            {
             before(grammarAccess.getServiceAccess().getServiceInteractionAssignment_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1395:1: ( rule__Service__ServiceInteractionAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25||LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1395:2: rule__Service__ServiceInteractionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Service__ServiceInteractionAssignment_4_in_rule__Service__Group__4__Impl2836);
            	    rule__Service__ServiceInteractionAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getServiceInteractionAssignment_4()); 

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
    // $ANTLR end rule__Service__Group__4__Impl


    // $ANTLR start rule__Activity__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1415:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1419:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1420:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02877);
            rule__Activity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02880);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1427:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1431:1: ( ( 'Activity' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1432:1: ( 'Activity' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1432:1: ( 'Activity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1433:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group__0__Impl2908); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1446:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1450:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1451:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12939);
            rule__Activity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12942);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1458:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1462:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1463:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1463:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1464:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1465:1: ( rule__Activity__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1465:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2969);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1475:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1479:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1480:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22999);
            rule__Activity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23002);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1487:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__LaunchableAssignment_2 )? ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1491:1: ( ( ( rule__Activity__LaunchableAssignment_2 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1492:1: ( ( rule__Activity__LaunchableAssignment_2 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1492:1: ( ( rule__Activity__LaunchableAssignment_2 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1493:1: ( rule__Activity__LaunchableAssignment_2 )?
            {
             before(grammarAccess.getActivityAccess().getLaunchableAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1494:1: ( rule__Activity__LaunchableAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1494:2: rule__Activity__LaunchableAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Activity__LaunchableAssignment_2_in_rule__Activity__Group__2__Impl3029);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1504:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1508:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1509:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33060);
            rule__Activity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33063);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1516:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__ActionsAssignment_3 )* ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1520:1: ( ( ( rule__Activity__ActionsAssignment_3 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1521:1: ( ( rule__Activity__ActionsAssignment_3 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1521:1: ( ( rule__Activity__ActionsAssignment_3 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1522:1: ( rule__Activity__ActionsAssignment_3 )*
            {
             before(grammarAccess.getActivityAccess().getActionsAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1523:1: ( rule__Activity__ActionsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1523:2: rule__Activity__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Activity__ActionsAssignment_3_in_rule__Activity__Group__3__Impl3090);
            	    rule__Activity__ActionsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1533:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1537:1: ( rule__Activity__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1538:2: rule__Activity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43121);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1544:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__InteractionsAssignment_4 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1548:1: ( ( ( rule__Activity__InteractionsAssignment_4 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1549:1: ( ( rule__Activity__InteractionsAssignment_4 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1549:1: ( ( rule__Activity__InteractionsAssignment_4 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1550:1: ( rule__Activity__InteractionsAssignment_4 )*
            {
             before(grammarAccess.getActivityAccess().getInteractionsAssignment_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1551:1: ( rule__Activity__InteractionsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23||LA16_0==25||(LA16_0>=28 && LA16_0<=29)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1551:2: rule__Activity__InteractionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Activity__InteractionsAssignment_4_in_rule__Activity__Group__4__Impl3148);
            	    rule__Activity__InteractionsAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1571:1: rule__LocalAction__Group__0 : rule__LocalAction__Group__0__Impl rule__LocalAction__Group__1 ;
    public final void rule__LocalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1575:1: ( rule__LocalAction__Group__0__Impl rule__LocalAction__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1576:2: rule__LocalAction__Group__0__Impl rule__LocalAction__Group__1
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__0__Impl_in_rule__LocalAction__Group__03189);
            rule__LocalAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalAction__Group__1_in_rule__LocalAction__Group__03192);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1583:1: rule__LocalAction__Group__0__Impl : ( 'action' ) ;
    public final void rule__LocalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1587:1: ( ( 'action' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1588:1: ( 'action' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1588:1: ( 'action' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1589:1: 'action'
            {
             before(grammarAccess.getLocalActionAccess().getActionKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__LocalAction__Group__0__Impl3220); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1602:1: rule__LocalAction__Group__1 : rule__LocalAction__Group__1__Impl rule__LocalAction__Group__2 ;
    public final void rule__LocalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1606:1: ( rule__LocalAction__Group__1__Impl rule__LocalAction__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1607:2: rule__LocalAction__Group__1__Impl rule__LocalAction__Group__2
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__1__Impl_in_rule__LocalAction__Group__13251);
            rule__LocalAction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalAction__Group__2_in_rule__LocalAction__Group__13254);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1614:1: rule__LocalAction__Group__1__Impl : ( ( rule__LocalAction__ActionAssignment_1 ) ) ;
    public final void rule__LocalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1618:1: ( ( ( rule__LocalAction__ActionAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1619:1: ( ( rule__LocalAction__ActionAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1619:1: ( ( rule__LocalAction__ActionAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1620:1: ( rule__LocalAction__ActionAssignment_1 )
            {
             before(grammarAccess.getLocalActionAccess().getActionAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1621:1: ( rule__LocalAction__ActionAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1621:2: rule__LocalAction__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__LocalAction__ActionAssignment_1_in_rule__LocalAction__Group__1__Impl3281);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1631:1: rule__LocalAction__Group__2 : rule__LocalAction__Group__2__Impl ;
    public final void rule__LocalAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1635:1: ( rule__LocalAction__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1636:2: rule__LocalAction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__2__Impl_in_rule__LocalAction__Group__23311);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1642:1: rule__LocalAction__Group__2__Impl : ( ( rule__LocalAction__ButtonAssignment_2 )? ) ;
    public final void rule__LocalAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1646:1: ( ( ( rule__LocalAction__ButtonAssignment_2 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1647:1: ( ( rule__LocalAction__ButtonAssignment_2 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1647:1: ( ( rule__LocalAction__ButtonAssignment_2 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1648:1: ( rule__LocalAction__ButtonAssignment_2 )?
            {
             before(grammarAccess.getLocalActionAccess().getButtonAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1649:1: ( rule__LocalAction__ButtonAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1649:2: rule__LocalAction__ButtonAssignment_2
                    {
                    pushFollow(FOLLOW_rule__LocalAction__ButtonAssignment_2_in_rule__LocalAction__Group__2__Impl3338);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1665:1: rule__InterAction__Group_0__0 : rule__InterAction__Group_0__0__Impl rule__InterAction__Group_0__1 ;
    public final void rule__InterAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1669:1: ( rule__InterAction__Group_0__0__Impl rule__InterAction__Group_0__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1670:2: rule__InterAction__Group_0__0__Impl rule__InterAction__Group_0__1
            {
            pushFollow(FOLLOW_rule__InterAction__Group_0__0__Impl_in_rule__InterAction__Group_0__03375);
            rule__InterAction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InterAction__Group_0__1_in_rule__InterAction__Group_0__03378);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1677:1: rule__InterAction__Group_0__0__Impl : ( ruleExplicitInteraction ) ;
    public final void rule__InterAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1681:1: ( ( ruleExplicitInteraction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1682:1: ( ruleExplicitInteraction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1682:1: ( ruleExplicitInteraction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1683:1: ruleExplicitInteraction
            {
             before(grammarAccess.getInterActionAccess().getExplicitInteractionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExplicitInteraction_in_rule__InterAction__Group_0__0__Impl3405);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1694:1: rule__InterAction__Group_0__1 : rule__InterAction__Group_0__1__Impl ;
    public final void rule__InterAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1698:1: ( rule__InterAction__Group_0__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1699:2: rule__InterAction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__InterAction__Group_0__1__Impl_in_rule__InterAction__Group_0__13434);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1705:1: rule__InterAction__Group_0__1__Impl : ( ( rule__InterAction__ButtonAssignment_0_1 )? ) ;
    public final void rule__InterAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1709:1: ( ( ( rule__InterAction__ButtonAssignment_0_1 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1710:1: ( ( rule__InterAction__ButtonAssignment_0_1 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1710:1: ( ( rule__InterAction__ButtonAssignment_0_1 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1711:1: ( rule__InterAction__ButtonAssignment_0_1 )?
            {
             before(grammarAccess.getInterActionAccess().getButtonAssignment_0_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1712:1: ( rule__InterAction__ButtonAssignment_0_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1712:2: rule__InterAction__ButtonAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__InterAction__ButtonAssignment_0_1_in_rule__InterAction__Group_0__1__Impl3461);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1726:1: rule__InterAction__Group_1__0 : rule__InterAction__Group_1__0__Impl rule__InterAction__Group_1__1 ;
    public final void rule__InterAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1730:1: ( rule__InterAction__Group_1__0__Impl rule__InterAction__Group_1__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1731:2: rule__InterAction__Group_1__0__Impl rule__InterAction__Group_1__1
            {
            pushFollow(FOLLOW_rule__InterAction__Group_1__0__Impl_in_rule__InterAction__Group_1__03496);
            rule__InterAction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InterAction__Group_1__1_in_rule__InterAction__Group_1__03499);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1738:1: rule__InterAction__Group_1__0__Impl : ( ruleActionOnlyInteraction ) ;
    public final void rule__InterAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1742:1: ( ( ruleActionOnlyInteraction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1743:1: ( ruleActionOnlyInteraction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1743:1: ( ruleActionOnlyInteraction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1744:1: ruleActionOnlyInteraction
            {
             before(grammarAccess.getInterActionAccess().getActionOnlyInteractionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleActionOnlyInteraction_in_rule__InterAction__Group_1__0__Impl3526);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1755:1: rule__InterAction__Group_1__1 : rule__InterAction__Group_1__1__Impl ;
    public final void rule__InterAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1759:1: ( rule__InterAction__Group_1__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1760:2: rule__InterAction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InterAction__Group_1__1__Impl_in_rule__InterAction__Group_1__13555);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1766:1: rule__InterAction__Group_1__1__Impl : ( ( rule__InterAction__ButtonAssignment_1_1 )? ) ;
    public final void rule__InterAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1770:1: ( ( ( rule__InterAction__ButtonAssignment_1_1 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1771:1: ( ( rule__InterAction__ButtonAssignment_1_1 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1771:1: ( ( rule__InterAction__ButtonAssignment_1_1 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1772:1: ( rule__InterAction__ButtonAssignment_1_1 )?
            {
             before(grammarAccess.getInterActionAccess().getButtonAssignment_1_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1773:1: ( rule__InterAction__ButtonAssignment_1_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1773:2: rule__InterAction__ButtonAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__InterAction__ButtonAssignment_1_1_in_rule__InterAction__Group_1__1__Impl3582);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1787:1: rule__ExplicitInteractionActivity__Group__0 : rule__ExplicitInteractionActivity__Group__0__Impl rule__ExplicitInteractionActivity__Group__1 ;
    public final void rule__ExplicitInteractionActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1791:1: ( rule__ExplicitInteractionActivity__Group__0__Impl rule__ExplicitInteractionActivity__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1792:2: rule__ExplicitInteractionActivity__Group__0__Impl rule__ExplicitInteractionActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__0__Impl_in_rule__ExplicitInteractionActivity__Group__03617);
            rule__ExplicitInteractionActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__1_in_rule__ExplicitInteractionActivity__Group__03620);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1799:1: rule__ExplicitInteractionActivity__Group__0__Impl : ( 'callActivity' ) ;
    public final void rule__ExplicitInteractionActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1803:1: ( ( 'callActivity' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1804:1: ( 'callActivity' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1804:1: ( 'callActivity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1805:1: 'callActivity'
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getCallActivityKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ExplicitInteractionActivity__Group__0__Impl3648); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1818:1: rule__ExplicitInteractionActivity__Group__1 : rule__ExplicitInteractionActivity__Group__1__Impl rule__ExplicitInteractionActivity__Group__2 ;
    public final void rule__ExplicitInteractionActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1822:1: ( rule__ExplicitInteractionActivity__Group__1__Impl rule__ExplicitInteractionActivity__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1823:2: rule__ExplicitInteractionActivity__Group__1__Impl rule__ExplicitInteractionActivity__Group__2
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__1__Impl_in_rule__ExplicitInteractionActivity__Group__13679);
            rule__ExplicitInteractionActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__2_in_rule__ExplicitInteractionActivity__Group__13682);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1830:1: rule__ExplicitInteractionActivity__Group__1__Impl : ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) ) ;
    public final void rule__ExplicitInteractionActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1834:1: ( ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1835:1: ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1835:1: ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1836:1: ( rule__ExplicitInteractionActivity__DestAssignment_1 )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getDestAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1837:1: ( rule__ExplicitInteractionActivity__DestAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1837:2: rule__ExplicitInteractionActivity__DestAssignment_1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__DestAssignment_1_in_rule__ExplicitInteractionActivity__Group__1__Impl3709);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1847:1: rule__ExplicitInteractionActivity__Group__2 : rule__ExplicitInteractionActivity__Group__2__Impl ;
    public final void rule__ExplicitInteractionActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1851:1: ( rule__ExplicitInteractionActivity__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1852:2: rule__ExplicitInteractionActivity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__2__Impl_in_rule__ExplicitInteractionActivity__Group__23739);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1858:1: rule__ExplicitInteractionActivity__Group__2__Impl : ( ( rule__ExplicitInteractionActivity__Group_2__0 )? ) ;
    public final void rule__ExplicitInteractionActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1862:1: ( ( ( rule__ExplicitInteractionActivity__Group_2__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1863:1: ( ( rule__ExplicitInteractionActivity__Group_2__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1863:1: ( ( rule__ExplicitInteractionActivity__Group_2__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1864:1: ( rule__ExplicitInteractionActivity__Group_2__0 )?
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getGroup_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1865:1: ( rule__ExplicitInteractionActivity__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1865:2: rule__ExplicitInteractionActivity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__0_in_rule__ExplicitInteractionActivity__Group__2__Impl3766);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1881:1: rule__ExplicitInteractionActivity__Group_2__0 : rule__ExplicitInteractionActivity__Group_2__0__Impl rule__ExplicitInteractionActivity__Group_2__1 ;
    public final void rule__ExplicitInteractionActivity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1885:1: ( rule__ExplicitInteractionActivity__Group_2__0__Impl rule__ExplicitInteractionActivity__Group_2__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1886:2: rule__ExplicitInteractionActivity__Group_2__0__Impl rule__ExplicitInteractionActivity__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__0__Impl_in_rule__ExplicitInteractionActivity__Group_2__03803);
            rule__ExplicitInteractionActivity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__1_in_rule__ExplicitInteractionActivity__Group_2__03806);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1893:1: rule__ExplicitInteractionActivity__Group_2__0__Impl : ( 'forActiom' ) ;
    public final void rule__ExplicitInteractionActivity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1897:1: ( ( 'forActiom' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1898:1: ( 'forActiom' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1898:1: ( 'forActiom' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1899:1: 'forActiom'
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getForActiomKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__ExplicitInteractionActivity__Group_2__0__Impl3834); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1912:1: rule__ExplicitInteractionActivity__Group_2__1 : rule__ExplicitInteractionActivity__Group_2__1__Impl ;
    public final void rule__ExplicitInteractionActivity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1916:1: ( rule__ExplicitInteractionActivity__Group_2__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1917:2: rule__ExplicitInteractionActivity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__1__Impl_in_rule__ExplicitInteractionActivity__Group_2__13865);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1923:1: rule__ExplicitInteractionActivity__Group_2__1__Impl : ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) ) ;
    public final void rule__ExplicitInteractionActivity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1927:1: ( ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1928:1: ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1928:1: ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1929:1: ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getActionAssignment_2_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1930:1: ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1930:2: rule__ExplicitInteractionActivity__ActionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__ActionAssignment_2_1_in_rule__ExplicitInteractionActivity__Group_2__1__Impl3892);
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


    // $ANTLR start rule__UseService__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1944:1: rule__UseService__Group__0 : rule__UseService__Group__0__Impl rule__UseService__Group__1 ;
    public final void rule__UseService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1948:1: ( rule__UseService__Group__0__Impl rule__UseService__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1949:2: rule__UseService__Group__0__Impl rule__UseService__Group__1
            {
            pushFollow(FOLLOW_rule__UseService__Group__0__Impl_in_rule__UseService__Group__03926);
            rule__UseService__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group__1_in_rule__UseService__Group__03929);
            rule__UseService__Group__1();
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
    // $ANTLR end rule__UseService__Group__0


    // $ANTLR start rule__UseService__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1956:1: rule__UseService__Group__0__Impl : ( 'useService' ) ;
    public final void rule__UseService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1960:1: ( ( 'useService' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1961:1: ( 'useService' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1961:1: ( 'useService' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1962:1: 'useService'
            {
             before(grammarAccess.getUseServiceAccess().getUseServiceKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__UseService__Group__0__Impl3957); 
             after(grammarAccess.getUseServiceAccess().getUseServiceKeyword_0()); 

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
    // $ANTLR end rule__UseService__Group__0__Impl


    // $ANTLR start rule__UseService__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1975:1: rule__UseService__Group__1 : rule__UseService__Group__1__Impl rule__UseService__Group__2 ;
    public final void rule__UseService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1979:1: ( rule__UseService__Group__1__Impl rule__UseService__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1980:2: rule__UseService__Group__1__Impl rule__UseService__Group__2
            {
            pushFollow(FOLLOW_rule__UseService__Group__1__Impl_in_rule__UseService__Group__13988);
            rule__UseService__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group__2_in_rule__UseService__Group__13991);
            rule__UseService__Group__2();
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
    // $ANTLR end rule__UseService__Group__1


    // $ANTLR start rule__UseService__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1987:1: rule__UseService__Group__1__Impl : ( ( rule__UseService__DestAssignment_1 ) ) ;
    public final void rule__UseService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1991:1: ( ( ( rule__UseService__DestAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1992:1: ( ( rule__UseService__DestAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1992:1: ( ( rule__UseService__DestAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1993:1: ( rule__UseService__DestAssignment_1 )
            {
             before(grammarAccess.getUseServiceAccess().getDestAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1994:1: ( rule__UseService__DestAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1994:2: rule__UseService__DestAssignment_1
            {
            pushFollow(FOLLOW_rule__UseService__DestAssignment_1_in_rule__UseService__Group__1__Impl4018);
            rule__UseService__DestAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getUseServiceAccess().getDestAssignment_1()); 

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
    // $ANTLR end rule__UseService__Group__1__Impl


    // $ANTLR start rule__UseService__Group__2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2004:1: rule__UseService__Group__2 : rule__UseService__Group__2__Impl rule__UseService__Group__3 ;
    public final void rule__UseService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2008:1: ( rule__UseService__Group__2__Impl rule__UseService__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2009:2: rule__UseService__Group__2__Impl rule__UseService__Group__3
            {
            pushFollow(FOLLOW_rule__UseService__Group__2__Impl_in_rule__UseService__Group__24048);
            rule__UseService__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group__3_in_rule__UseService__Group__24051);
            rule__UseService__Group__3();
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
    // $ANTLR end rule__UseService__Group__2


    // $ANTLR start rule__UseService__Group__2__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2016:1: rule__UseService__Group__2__Impl : ( 'forOp' ) ;
    public final void rule__UseService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2020:1: ( ( 'forOp' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2021:1: ( 'forOp' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2021:1: ( 'forOp' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2022:1: 'forOp'
            {
             before(grammarAccess.getUseServiceAccess().getForOpKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__UseService__Group__2__Impl4079); 
             after(grammarAccess.getUseServiceAccess().getForOpKeyword_2()); 

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
    // $ANTLR end rule__UseService__Group__2__Impl


    // $ANTLR start rule__UseService__Group__3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2035:1: rule__UseService__Group__3 : rule__UseService__Group__3__Impl rule__UseService__Group__4 ;
    public final void rule__UseService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2039:1: ( rule__UseService__Group__3__Impl rule__UseService__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2040:2: rule__UseService__Group__3__Impl rule__UseService__Group__4
            {
            pushFollow(FOLLOW_rule__UseService__Group__3__Impl_in_rule__UseService__Group__34110);
            rule__UseService__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group__4_in_rule__UseService__Group__34113);
            rule__UseService__Group__4();
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
    // $ANTLR end rule__UseService__Group__3


    // $ANTLR start rule__UseService__Group__3__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2047:1: rule__UseService__Group__3__Impl : ( ( rule__UseService__OperationAssignment_3 ) ) ;
    public final void rule__UseService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2051:1: ( ( ( rule__UseService__OperationAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2052:1: ( ( rule__UseService__OperationAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2052:1: ( ( rule__UseService__OperationAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2053:1: ( rule__UseService__OperationAssignment_3 )
            {
             before(grammarAccess.getUseServiceAccess().getOperationAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2054:1: ( rule__UseService__OperationAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2054:2: rule__UseService__OperationAssignment_3
            {
            pushFollow(FOLLOW_rule__UseService__OperationAssignment_3_in_rule__UseService__Group__3__Impl4140);
            rule__UseService__OperationAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getUseServiceAccess().getOperationAssignment_3()); 

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
    // $ANTLR end rule__UseService__Group__3__Impl


    // $ANTLR start rule__UseService__Group__4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2064:1: rule__UseService__Group__4 : rule__UseService__Group__4__Impl ;
    public final void rule__UseService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2068:1: ( rule__UseService__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2069:2: rule__UseService__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UseService__Group__4__Impl_in_rule__UseService__Group__44170);
            rule__UseService__Group__4__Impl();
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
    // $ANTLR end rule__UseService__Group__4


    // $ANTLR start rule__UseService__Group__4__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2075:1: rule__UseService__Group__4__Impl : ( ( rule__UseService__Group_4__0 )* ) ;
    public final void rule__UseService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2079:1: ( ( ( rule__UseService__Group_4__0 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2080:1: ( ( rule__UseService__Group_4__0 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2080:1: ( ( rule__UseService__Group_4__0 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2081:1: ( rule__UseService__Group_4__0 )*
            {
             before(grammarAccess.getUseServiceAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2082:1: ( rule__UseService__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2082:2: rule__UseService__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UseService__Group_4__0_in_rule__UseService__Group__4__Impl4197);
            	    rule__UseService__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getUseServiceAccess().getGroup_4()); 

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
    // $ANTLR end rule__UseService__Group__4__Impl


    // $ANTLR start rule__UseService__Group_4__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2102:1: rule__UseService__Group_4__0 : rule__UseService__Group_4__0__Impl rule__UseService__Group_4__1 ;
    public final void rule__UseService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2106:1: ( rule__UseService__Group_4__0__Impl rule__UseService__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2107:2: rule__UseService__Group_4__0__Impl rule__UseService__Group_4__1
            {
            pushFollow(FOLLOW_rule__UseService__Group_4__0__Impl_in_rule__UseService__Group_4__04238);
            rule__UseService__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group_4__1_in_rule__UseService__Group_4__04241);
            rule__UseService__Group_4__1();
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
    // $ANTLR end rule__UseService__Group_4__0


    // $ANTLR start rule__UseService__Group_4__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2114:1: rule__UseService__Group_4__0__Impl : ( 'arg=' ) ;
    public final void rule__UseService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2118:1: ( ( 'arg=' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2119:1: ( 'arg=' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2119:1: ( 'arg=' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2120:1: 'arg='
            {
             before(grammarAccess.getUseServiceAccess().getArgKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__UseService__Group_4__0__Impl4269); 
             after(grammarAccess.getUseServiceAccess().getArgKeyword_4_0()); 

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
    // $ANTLR end rule__UseService__Group_4__0__Impl


    // $ANTLR start rule__UseService__Group_4__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2133:1: rule__UseService__Group_4__1 : rule__UseService__Group_4__1__Impl ;
    public final void rule__UseService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2137:1: ( rule__UseService__Group_4__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2138:2: rule__UseService__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UseService__Group_4__1__Impl_in_rule__UseService__Group_4__14300);
            rule__UseService__Group_4__1__Impl();
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
    // $ANTLR end rule__UseService__Group_4__1


    // $ANTLR start rule__UseService__Group_4__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2144:1: rule__UseService__Group_4__1__Impl : ( ( rule__UseService__ArgAssignment_4_1 ) ) ;
    public final void rule__UseService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2148:1: ( ( ( rule__UseService__ArgAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2149:1: ( ( rule__UseService__ArgAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2149:1: ( ( rule__UseService__ArgAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2150:1: ( rule__UseService__ArgAssignment_4_1 )
            {
             before(grammarAccess.getUseServiceAccess().getArgAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2151:1: ( rule__UseService__ArgAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2151:2: rule__UseService__ArgAssignment_4_1
            {
            pushFollow(FOLLOW_rule__UseService__ArgAssignment_4_1_in_rule__UseService__Group_4__1__Impl4327);
            rule__UseService__ArgAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getUseServiceAccess().getArgAssignment_4_1()); 

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
    // $ANTLR end rule__UseService__Group_4__1__Impl


    // $ANTLR start rule__Launchservice__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2165:1: rule__Launchservice__Group__0 : rule__Launchservice__Group__0__Impl rule__Launchservice__Group__1 ;
    public final void rule__Launchservice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2169:1: ( rule__Launchservice__Group__0__Impl rule__Launchservice__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2170:2: rule__Launchservice__Group__0__Impl rule__Launchservice__Group__1
            {
            pushFollow(FOLLOW_rule__Launchservice__Group__0__Impl_in_rule__Launchservice__Group__04361);
            rule__Launchservice__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Launchservice__Group__1_in_rule__Launchservice__Group__04364);
            rule__Launchservice__Group__1();
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
    // $ANTLR end rule__Launchservice__Group__0


    // $ANTLR start rule__Launchservice__Group__0__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2177:1: rule__Launchservice__Group__0__Impl : ( 'launchService' ) ;
    public final void rule__Launchservice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2181:1: ( ( 'launchService' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2182:1: ( 'launchService' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2182:1: ( 'launchService' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2183:1: 'launchService'
            {
             before(grammarAccess.getLaunchserviceAccess().getLaunchServiceKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Launchservice__Group__0__Impl4392); 
             after(grammarAccess.getLaunchserviceAccess().getLaunchServiceKeyword_0()); 

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
    // $ANTLR end rule__Launchservice__Group__0__Impl


    // $ANTLR start rule__Launchservice__Group__1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2196:1: rule__Launchservice__Group__1 : rule__Launchservice__Group__1__Impl ;
    public final void rule__Launchservice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2200:1: ( rule__Launchservice__Group__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2201:2: rule__Launchservice__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Launchservice__Group__1__Impl_in_rule__Launchservice__Group__14423);
            rule__Launchservice__Group__1__Impl();
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
    // $ANTLR end rule__Launchservice__Group__1


    // $ANTLR start rule__Launchservice__Group__1__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2207:1: rule__Launchservice__Group__1__Impl : ( ( rule__Launchservice__DestAssignment_1 ) ) ;
    public final void rule__Launchservice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2211:1: ( ( ( rule__Launchservice__DestAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2212:1: ( ( rule__Launchservice__DestAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2212:1: ( ( rule__Launchservice__DestAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2213:1: ( rule__Launchservice__DestAssignment_1 )
            {
             before(grammarAccess.getLaunchserviceAccess().getDestAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2214:1: ( rule__Launchservice__DestAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2214:2: rule__Launchservice__DestAssignment_1
            {
            pushFollow(FOLLOW_rule__Launchservice__DestAssignment_1_in_rule__Launchservice__Group__1__Impl4450);
            rule__Launchservice__DestAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLaunchserviceAccess().getDestAssignment_1()); 

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
    // $ANTLR end rule__Launchservice__Group__1__Impl


    // $ANTLR start rule__ActionOnlyInteraction__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2228:1: rule__ActionOnlyInteraction__Group__0 : rule__ActionOnlyInteraction__Group__0__Impl rule__ActionOnlyInteraction__Group__1 ;
    public final void rule__ActionOnlyInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2232:1: ( rule__ActionOnlyInteraction__Group__0__Impl rule__ActionOnlyInteraction__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2233:2: rule__ActionOnlyInteraction__Group__0__Impl rule__ActionOnlyInteraction__Group__1
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__0__Impl_in_rule__ActionOnlyInteraction__Group__04484);
            rule__ActionOnlyInteraction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__1_in_rule__ActionOnlyInteraction__Group__04487);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2240:1: rule__ActionOnlyInteraction__Group__0__Impl : ( 'execAction' ) ;
    public final void rule__ActionOnlyInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2244:1: ( ( 'execAction' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2245:1: ( 'execAction' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2245:1: ( 'execAction' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2246:1: 'execAction'
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getExecActionKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ActionOnlyInteraction__Group__0__Impl4515); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2259:1: rule__ActionOnlyInteraction__Group__1 : rule__ActionOnlyInteraction__Group__1__Impl ;
    public final void rule__ActionOnlyInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2263:1: ( rule__ActionOnlyInteraction__Group__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2264:2: rule__ActionOnlyInteraction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__1__Impl_in_rule__ActionOnlyInteraction__Group__14546);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2270:1: rule__ActionOnlyInteraction__Group__1__Impl : ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) ) ;
    public final void rule__ActionOnlyInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2274:1: ( ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2275:1: ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2275:1: ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2276:1: ( rule__ActionOnlyInteraction__ActionAssignment_1 )
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getActionAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2277:1: ( rule__ActionOnlyInteraction__ActionAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2277:2: rule__ActionOnlyInteraction__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__ActionAssignment_1_in_rule__ActionOnlyInteraction__Group__1__Impl4573);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2291:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2295:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2296:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04607);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04610);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2303:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2307:1: ( ( 'action' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2308:1: ( 'action' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2308:1: ( 'action' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2309:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Action__Group__0__Impl4638); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2322:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2326:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2327:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14669);
            rule__Action__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14672);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2334:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2338:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2339:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2339:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2340:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2341:1: ( rule__Action__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2341:2: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl4699);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2351:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2355:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2356:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24729);
            rule__Action__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24732);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2363:1: rule__Action__Group__2__Impl : ( 'data' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2367:1: ( ( 'data' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2368:1: ( 'data' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2368:1: ( 'data' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2369:1: 'data'
            {
             before(grammarAccess.getActionAccess().getDataKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__Action__Group__2__Impl4760); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2382:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2386:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2387:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34791);
            rule__Action__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34794);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2394:1: rule__Action__Group__3__Impl : ( ( rule__Action__DataAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2398:1: ( ( ( rule__Action__DataAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2399:1: ( ( rule__Action__DataAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2399:1: ( ( rule__Action__DataAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2400:1: ( rule__Action__DataAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getDataAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2401:1: ( rule__Action__DataAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2401:2: rule__Action__DataAssignment_3
            {
            pushFollow(FOLLOW_rule__Action__DataAssignment_3_in_rule__Action__Group__3__Impl4821);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2411:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2415:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2416:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__44851);
            rule__Action__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__5_in_rule__Action__Group__44854);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2423:1: rule__Action__Group__4__Impl : ( 'category' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2427:1: ( ( 'category' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2428:1: ( 'category' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2428:1: ( 'category' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2429:1: 'category'
            {
             before(grammarAccess.getActionAccess().getCategoryKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Action__Group__4__Impl4882); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2442:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2446:1: ( rule__Action__Group__5__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2447:2: rule__Action__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__54913);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2453:1: rule__Action__Group__5__Impl : ( ( rule__Action__CategoryAssignment_5 ) ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2457:1: ( ( ( rule__Action__CategoryAssignment_5 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2458:1: ( ( rule__Action__CategoryAssignment_5 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2458:1: ( ( rule__Action__CategoryAssignment_5 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2459:1: ( rule__Action__CategoryAssignment_5 )
            {
             before(grammarAccess.getActionAccess().getCategoryAssignment_5()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2460:1: ( rule__Action__CategoryAssignment_5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2460:2: rule__Action__CategoryAssignment_5
            {
            pushFollow(FOLLOW_rule__Action__CategoryAssignment_5_in_rule__Action__Group__5__Impl4940);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2482:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2486:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2487:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__04982);
            rule__Data__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__1_in_rule__Data__Group__04985);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2494:1: rule__Data__Group__0__Impl : ( 'data' ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2498:1: ( ( 'data' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2499:1: ( 'data' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2499:1: ( 'data' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2500:1: 'data'
            {
             before(grammarAccess.getDataAccess().getDataKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Data__Group__0__Impl5013); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2513:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2517:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2518:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__15044);
            rule__Data__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__2_in_rule__Data__Group__15047);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2525:1: rule__Data__Group__1__Impl : ( ( rule__Data__NameAssignment_1 ) ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2529:1: ( ( ( rule__Data__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2530:1: ( ( rule__Data__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2530:1: ( ( rule__Data__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2531:1: ( rule__Data__NameAssignment_1 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2532:1: ( rule__Data__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2532:2: rule__Data__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Data__NameAssignment_1_in_rule__Data__Group__1__Impl5074);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2542:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2546:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2547:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_rule__Data__Group__2__Impl_in_rule__Data__Group__25104);
            rule__Data__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__3_in_rule__Data__Group__25107);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2554:1: rule__Data__Group__2__Impl : ( 'scheme' ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2558:1: ( ( 'scheme' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2559:1: ( 'scheme' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2559:1: ( 'scheme' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2560:1: 'scheme'
            {
             before(grammarAccess.getDataAccess().getSchemeKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Data__Group__2__Impl5135); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2573:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2577:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2578:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_rule__Data__Group__3__Impl_in_rule__Data__Group__35166);
            rule__Data__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__4_in_rule__Data__Group__35169);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2585:1: rule__Data__Group__3__Impl : ( ( rule__Data__SchemeAssignment_3 ) ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2589:1: ( ( ( rule__Data__SchemeAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2590:1: ( ( rule__Data__SchemeAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2590:1: ( ( rule__Data__SchemeAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2591:1: ( rule__Data__SchemeAssignment_3 )
            {
             before(grammarAccess.getDataAccess().getSchemeAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2592:1: ( rule__Data__SchemeAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2592:2: rule__Data__SchemeAssignment_3
            {
            pushFollow(FOLLOW_rule__Data__SchemeAssignment_3_in_rule__Data__Group__3__Impl5196);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2602:1: rule__Data__Group__4 : rule__Data__Group__4__Impl rule__Data__Group__5 ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2606:1: ( rule__Data__Group__4__Impl rule__Data__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2607:2: rule__Data__Group__4__Impl rule__Data__Group__5
            {
            pushFollow(FOLLOW_rule__Data__Group__4__Impl_in_rule__Data__Group__45226);
            rule__Data__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__5_in_rule__Data__Group__45229);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2614:1: rule__Data__Group__4__Impl : ( ( rule__Data__Group_4__0 )? ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2618:1: ( ( ( rule__Data__Group_4__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2619:1: ( ( rule__Data__Group_4__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2619:1: ( ( rule__Data__Group_4__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2620:1: ( rule__Data__Group_4__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2621:1: ( rule__Data__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2621:2: rule__Data__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_4__0_in_rule__Data__Group__4__Impl5256);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2631:1: rule__Data__Group__5 : rule__Data__Group__5__Impl rule__Data__Group__6 ;
    public final void rule__Data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2635:1: ( rule__Data__Group__5__Impl rule__Data__Group__6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2636:2: rule__Data__Group__5__Impl rule__Data__Group__6
            {
            pushFollow(FOLLOW_rule__Data__Group__5__Impl_in_rule__Data__Group__55287);
            rule__Data__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__6_in_rule__Data__Group__55290);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2643:1: rule__Data__Group__5__Impl : ( ( rule__Data__Group_5__0 )? ) ;
    public final void rule__Data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2647:1: ( ( ( rule__Data__Group_5__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2648:1: ( ( rule__Data__Group_5__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2648:1: ( ( rule__Data__Group_5__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2649:1: ( rule__Data__Group_5__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_5()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2650:1: ( rule__Data__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2650:2: rule__Data__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_5__0_in_rule__Data__Group__5__Impl5317);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2660:1: rule__Data__Group__6 : rule__Data__Group__6__Impl ;
    public final void rule__Data__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2664:1: ( rule__Data__Group__6__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2665:2: rule__Data__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group__6__Impl_in_rule__Data__Group__65348);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2671:1: rule__Data__Group__6__Impl : ( ( rule__Data__Group_6__0 )? ) ;
    public final void rule__Data__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2675:1: ( ( ( rule__Data__Group_6__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2676:1: ( ( rule__Data__Group_6__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2676:1: ( ( rule__Data__Group_6__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2677:1: ( rule__Data__Group_6__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_6()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2678:1: ( rule__Data__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2678:2: rule__Data__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_6__0_in_rule__Data__Group__6__Impl5375);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2702:1: rule__Data__Group_4__0 : rule__Data__Group_4__0__Impl rule__Data__Group_4__1 ;
    public final void rule__Data__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2706:1: ( rule__Data__Group_4__0__Impl rule__Data__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2707:2: rule__Data__Group_4__0__Impl rule__Data__Group_4__1
            {
            pushFollow(FOLLOW_rule__Data__Group_4__0__Impl_in_rule__Data__Group_4__05420);
            rule__Data__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group_4__1_in_rule__Data__Group_4__05423);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2714:1: rule__Data__Group_4__0__Impl : ( 'host' ) ;
    public final void rule__Data__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2718:1: ( ( 'host' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2719:1: ( 'host' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2719:1: ( 'host' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2720:1: 'host'
            {
             before(grammarAccess.getDataAccess().getHostKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__Data__Group_4__0__Impl5451); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2733:1: rule__Data__Group_4__1 : rule__Data__Group_4__1__Impl ;
    public final void rule__Data__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2737:1: ( rule__Data__Group_4__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2738:2: rule__Data__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_4__1__Impl_in_rule__Data__Group_4__15482);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2744:1: rule__Data__Group_4__1__Impl : ( ( rule__Data__HostAssignment_4_1 ) ) ;
    public final void rule__Data__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2748:1: ( ( ( rule__Data__HostAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2749:1: ( ( rule__Data__HostAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2749:1: ( ( rule__Data__HostAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2750:1: ( rule__Data__HostAssignment_4_1 )
            {
             before(grammarAccess.getDataAccess().getHostAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2751:1: ( rule__Data__HostAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2751:2: rule__Data__HostAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Data__HostAssignment_4_1_in_rule__Data__Group_4__1__Impl5509);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2765:1: rule__Data__Group_5__0 : rule__Data__Group_5__0__Impl rule__Data__Group_5__1 ;
    public final void rule__Data__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2769:1: ( rule__Data__Group_5__0__Impl rule__Data__Group_5__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2770:2: rule__Data__Group_5__0__Impl rule__Data__Group_5__1
            {
            pushFollow(FOLLOW_rule__Data__Group_5__0__Impl_in_rule__Data__Group_5__05543);
            rule__Data__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group_5__1_in_rule__Data__Group_5__05546);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2777:1: rule__Data__Group_5__0__Impl : ( 'port' ) ;
    public final void rule__Data__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2781:1: ( ( 'port' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2782:1: ( 'port' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2782:1: ( 'port' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2783:1: 'port'
            {
             before(grammarAccess.getDataAccess().getPortKeyword_5_0()); 
            match(input,34,FOLLOW_34_in_rule__Data__Group_5__0__Impl5574); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2796:1: rule__Data__Group_5__1 : rule__Data__Group_5__1__Impl ;
    public final void rule__Data__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2800:1: ( rule__Data__Group_5__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2801:2: rule__Data__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_5__1__Impl_in_rule__Data__Group_5__15605);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2807:1: rule__Data__Group_5__1__Impl : ( ( rule__Data__PortAssignment_5_1 ) ) ;
    public final void rule__Data__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2811:1: ( ( ( rule__Data__PortAssignment_5_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2812:1: ( ( rule__Data__PortAssignment_5_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2812:1: ( ( rule__Data__PortAssignment_5_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2813:1: ( rule__Data__PortAssignment_5_1 )
            {
             before(grammarAccess.getDataAccess().getPortAssignment_5_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2814:1: ( rule__Data__PortAssignment_5_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2814:2: rule__Data__PortAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Data__PortAssignment_5_1_in_rule__Data__Group_5__1__Impl5632);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2828:1: rule__Data__Group_6__0 : rule__Data__Group_6__0__Impl rule__Data__Group_6__1 ;
    public final void rule__Data__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2832:1: ( rule__Data__Group_6__0__Impl rule__Data__Group_6__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2833:2: rule__Data__Group_6__0__Impl rule__Data__Group_6__1
            {
            pushFollow(FOLLOW_rule__Data__Group_6__0__Impl_in_rule__Data__Group_6__05666);
            rule__Data__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group_6__1_in_rule__Data__Group_6__05669);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2840:1: rule__Data__Group_6__0__Impl : ( 'path' ) ;
    public final void rule__Data__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2844:1: ( ( 'path' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2845:1: ( 'path' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2845:1: ( 'path' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2846:1: 'path'
            {
             before(grammarAccess.getDataAccess().getPathKeyword_6_0()); 
            match(input,35,FOLLOW_35_in_rule__Data__Group_6__0__Impl5697); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2859:1: rule__Data__Group_6__1 : rule__Data__Group_6__1__Impl ;
    public final void rule__Data__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2863:1: ( rule__Data__Group_6__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2864:2: rule__Data__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_6__1__Impl_in_rule__Data__Group_6__15728);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2870:1: rule__Data__Group_6__1__Impl : ( ( rule__Data__PathAssignment_6_1 ) ) ;
    public final void rule__Data__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2874:1: ( ( ( rule__Data__PathAssignment_6_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2875:1: ( ( rule__Data__PathAssignment_6_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2875:1: ( ( rule__Data__PathAssignment_6_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2876:1: ( rule__Data__PathAssignment_6_1 )
            {
             before(grammarAccess.getDataAccess().getPathAssignment_6_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2877:1: ( rule__Data__PathAssignment_6_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2877:2: rule__Data__PathAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Data__PathAssignment_6_1_in_rule__Data__Group_6__1__Impl5755);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2891:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2895:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2896:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__05789);
            rule__Application__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__05792);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2903:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2907:1: ( ( 'Application' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2908:1: ( 'Application' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2908:1: ( 'Application' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2909:1: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Application__Group__0__Impl5820); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2922:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2926:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2927:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__15851);
            rule__Application__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__15854);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2934:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2938:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2939:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2939:1: ( ( rule__Application__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2940:1: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2941:1: ( rule__Application__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2941:2: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl5881);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2951:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2955:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2956:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__25911);
            rule__Application__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__25914);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2963:1: rule__Application__Group__2__Impl : ( 'avd' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2967:1: ( ( 'avd' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2968:1: ( 'avd' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2968:1: ( 'avd' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2969:1: 'avd'
            {
             before(grammarAccess.getApplicationAccess().getAvdKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__Application__Group__2__Impl5942); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2982:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2986:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2987:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__35973);
            rule__Application__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__35976);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2994:1: rule__Application__Group__3__Impl : ( ( rule__Application__AvdAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2998:1: ( ( ( rule__Application__AvdAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2999:1: ( ( rule__Application__AvdAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2999:1: ( ( rule__Application__AvdAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3000:1: ( rule__Application__AvdAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getAvdAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3001:1: ( rule__Application__AvdAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3001:2: rule__Application__AvdAssignment_3
            {
            pushFollow(FOLLOW_rule__Application__AvdAssignment_3_in_rule__Application__Group__3__Impl6003);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3011:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3015:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3016:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__46033);
            rule__Application__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__46036);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3023:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3027:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3028:1: ( ( rule__Application__Group_4__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3028:1: ( ( rule__Application__Group_4__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3029:1: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3030:1: ( rule__Application__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3030:2: rule__Application__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl6063);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3040:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3044:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3045:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__56094);
            rule__Application__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__6_in_rule__Application__Group__56097);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3052:1: rule__Application__Group__5__Impl : ( 'package' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3056:1: ( ( 'package' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3057:1: ( 'package' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3057:1: ( 'package' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3058:1: 'package'
            {
             before(grammarAccess.getApplicationAccess().getPackageKeyword_5()); 
            match(input,38,FOLLOW_38_in_rule__Application__Group__5__Impl6125); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3071:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3075:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3076:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__66156);
            rule__Application__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__7_in_rule__Application__Group__66159);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3083:1: rule__Application__Group__6__Impl : ( ( rule__Application__PackageNameAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3087:1: ( ( ( rule__Application__PackageNameAssignment_6 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3088:1: ( ( rule__Application__PackageNameAssignment_6 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3088:1: ( ( rule__Application__PackageNameAssignment_6 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3089:1: ( rule__Application__PackageNameAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_6()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3090:1: ( rule__Application__PackageNameAssignment_6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3090:2: rule__Application__PackageNameAssignment_6
            {
            pushFollow(FOLLOW_rule__Application__PackageNameAssignment_6_in_rule__Application__Group__6__Impl6186);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3100:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3104:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3105:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__76216);
            rule__Application__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__8_in_rule__Application__Group__76219);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3112:1: rule__Application__Group__7__Impl : ( 'entryActiviy' ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3116:1: ( ( 'entryActiviy' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3117:1: ( 'entryActiviy' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3117:1: ( 'entryActiviy' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3118:1: 'entryActiviy'
            {
             before(grammarAccess.getApplicationAccess().getEntryActiviyKeyword_7()); 
            match(input,39,FOLLOW_39_in_rule__Application__Group__7__Impl6247); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3131:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3135:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3136:2: rule__Application__Group__8__Impl rule__Application__Group__9
            {
            pushFollow(FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__86278);
            rule__Application__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__9_in_rule__Application__Group__86281);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3143:1: rule__Application__Group__8__Impl : ( ( rule__Application__MainActivityAssignment_8 ) ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3147:1: ( ( ( rule__Application__MainActivityAssignment_8 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3148:1: ( ( rule__Application__MainActivityAssignment_8 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3148:1: ( ( rule__Application__MainActivityAssignment_8 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3149:1: ( rule__Application__MainActivityAssignment_8 )
            {
             before(grammarAccess.getApplicationAccess().getMainActivityAssignment_8()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3150:1: ( rule__Application__MainActivityAssignment_8 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3150:2: rule__Application__MainActivityAssignment_8
            {
            pushFollow(FOLLOW_rule__Application__MainActivityAssignment_8_in_rule__Application__Group__8__Impl6308);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3160:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3164:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3165:2: rule__Application__Group__9__Impl rule__Application__Group__10
            {
            pushFollow(FOLLOW_rule__Application__Group__9__Impl_in_rule__Application__Group__96338);
            rule__Application__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__10_in_rule__Application__Group__96341);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3172:1: rule__Application__Group__9__Impl : ( 'target' ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3176:1: ( ( 'target' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3177:1: ( 'target' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3177:1: ( 'target' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3178:1: 'target'
            {
             before(grammarAccess.getApplicationAccess().getTargetKeyword_9()); 
            match(input,40,FOLLOW_40_in_rule__Application__Group__9__Impl6369); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3191:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3195:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3196:2: rule__Application__Group__10__Impl rule__Application__Group__11
            {
            pushFollow(FOLLOW_rule__Application__Group__10__Impl_in_rule__Application__Group__106400);
            rule__Application__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__11_in_rule__Application__Group__106403);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3203:1: rule__Application__Group__10__Impl : ( ( rule__Application__TargetAssignment_10 ) ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3207:1: ( ( ( rule__Application__TargetAssignment_10 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3208:1: ( ( rule__Application__TargetAssignment_10 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3208:1: ( ( rule__Application__TargetAssignment_10 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3209:1: ( rule__Application__TargetAssignment_10 )
            {
             before(grammarAccess.getApplicationAccess().getTargetAssignment_10()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3210:1: ( rule__Application__TargetAssignment_10 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3210:2: rule__Application__TargetAssignment_10
            {
            pushFollow(FOLLOW_rule__Application__TargetAssignment_10_in_rule__Application__Group__10__Impl6430);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3220:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3224:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3225:2: rule__Application__Group__11__Impl rule__Application__Group__12
            {
            pushFollow(FOLLOW_rule__Application__Group__11__Impl_in_rule__Application__Group__116460);
            rule__Application__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__12_in_rule__Application__Group__116463);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3232:1: rule__Application__Group__11__Impl : ( 'path' ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3236:1: ( ( 'path' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3237:1: ( 'path' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3237:1: ( 'path' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3238:1: 'path'
            {
             before(grammarAccess.getApplicationAccess().getPathKeyword_11()); 
            match(input,35,FOLLOW_35_in_rule__Application__Group__11__Impl6491); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3251:1: rule__Application__Group__12 : rule__Application__Group__12__Impl ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3255:1: ( rule__Application__Group__12__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3256:2: rule__Application__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__12__Impl_in_rule__Application__Group__126522);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3262:1: rule__Application__Group__12__Impl : ( ( rule__Application__PathAssignment_12 ) ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3266:1: ( ( ( rule__Application__PathAssignment_12 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3267:1: ( ( rule__Application__PathAssignment_12 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3267:1: ( ( rule__Application__PathAssignment_12 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3268:1: ( rule__Application__PathAssignment_12 )
            {
             before(grammarAccess.getApplicationAccess().getPathAssignment_12()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3269:1: ( rule__Application__PathAssignment_12 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3269:2: rule__Application__PathAssignment_12
            {
            pushFollow(FOLLOW_rule__Application__PathAssignment_12_in_rule__Application__Group__12__Impl6549);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3305:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3309:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3310:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__06605);
            rule__Application__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__06608);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3317:1: rule__Application__Group_4__0__Impl : ( 'workdir' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3321:1: ( ( 'workdir' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3322:1: ( 'workdir' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3322:1: ( 'workdir' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3323:1: 'workdir'
            {
             before(grammarAccess.getApplicationAccess().getWorkdirKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__Application__Group_4__0__Impl6636); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3336:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3340:1: ( rule__Application__Group_4__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3341:2: rule__Application__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__16667);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3347:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__WorkDirAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3351:1: ( ( ( rule__Application__WorkDirAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3352:1: ( ( rule__Application__WorkDirAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3352:1: ( ( rule__Application__WorkDirAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3353:1: ( rule__Application__WorkDirAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getWorkDirAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3354:1: ( rule__Application__WorkDirAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3354:2: rule__Application__WorkDirAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Application__WorkDirAssignment_4_1_in_rule__Application__Group_4__1__Impl6694);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3368:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3372:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3373:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__06728);
            rule__URI__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__06731);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3380:1: rule__URI__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3384:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3385:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3385:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3386:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__Group__0__Impl6758); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3397:1: rule__URI__Group__1 : rule__URI__Group__1__Impl rule__URI__Group__2 ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3401:1: ( rule__URI__Group__1__Impl rule__URI__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3402:2: rule__URI__Group__1__Impl rule__URI__Group__2
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__16787);
            rule__URI__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URI__Group__2_in_rule__URI__Group__16790);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3409:1: rule__URI__Group__1__Impl : ( '.' ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3413:1: ( ( '.' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3414:1: ( '.' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3414:1: ( '.' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3415:1: '.'
            {
             before(grammarAccess.getURIAccess().getFullStopKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__URI__Group__1__Impl6818); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3428:1: rule__URI__Group__2 : rule__URI__Group__2__Impl ;
    public final void rule__URI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3432:1: ( rule__URI__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3433:2: rule__URI__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__26849);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3439:1: rule__URI__Group__2__Impl : ( ruleRestUri ) ;
    public final void rule__URI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3443:1: ( ( ruleRestUri ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3444:1: ( ruleRestUri )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3444:1: ( ruleRestUri )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3445:1: ruleRestUri
            {
             before(grammarAccess.getURIAccess().getRestUriParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleRestUri_in_rule__URI__Group__2__Impl6876);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3463:1: rule__AndroidSystem__DataAssignment_0 : ( ruleData ) ;
    public final void rule__AndroidSystem__DataAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3467:1: ( ( ruleData ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3468:1: ( ruleData )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3468:1: ( ruleData )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3469:1: ruleData
            {
             before(grammarAccess.getAndroidSystemAccess().getDataDataParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__AndroidSystem__DataAssignment_06916);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3478:1: rule__AndroidSystem__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__AndroidSystem__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3482:1: ( ( ruleAction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3483:1: ( ruleAction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3483:1: ( ruleAction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3484:1: ruleAction
            {
             before(grammarAccess.getAndroidSystemAccess().getActionActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__AndroidSystem__ActionAssignment_16947);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3493:1: rule__AndroidSystem__ServiceInterfaceAssignment_2 : ( ruleServiceInterface ) ;
    public final void rule__AndroidSystem__ServiceInterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3497:1: ( ( ruleServiceInterface ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3498:1: ( ruleServiceInterface )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3498:1: ( ruleServiceInterface )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3499:1: ruleServiceInterface
            {
             before(grammarAccess.getAndroidSystemAccess().getServiceInterfaceServiceInterfaceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleServiceInterface_in_rule__AndroidSystem__ServiceInterfaceAssignment_26978);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3508:1: rule__AndroidSystem__ComponentAssignment_3 : ( ruleComponent ) ;
    public final void rule__AndroidSystem__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3512:1: ( ( ruleComponent ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3513:1: ( ruleComponent )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3513:1: ( ruleComponent )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3514:1: ruleComponent
            {
             before(grammarAccess.getAndroidSystemAccess().getComponentComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__AndroidSystem__ComponentAssignment_37009);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3523:1: rule__AndroidSystem__ApplicationAssignment_4 : ( ruleApplication ) ;
    public final void rule__AndroidSystem__ApplicationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3527:1: ( ( ruleApplication ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3528:1: ( ruleApplication )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3528:1: ( ruleApplication )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3529:1: ruleApplication
            {
             before(grammarAccess.getAndroidSystemAccess().getApplicationApplicationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidSystem__ApplicationAssignment_47040);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3538:1: rule__ServiceInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3542:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3543:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3543:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3544:1: RULE_ID
            {
             before(grammarAccess.getServiceInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceInterface__NameAssignment_17071); 
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


    // $ANTLR start rule__ServiceInterface__OperationAssignment_2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3553:1: rule__ServiceInterface__OperationAssignment_2 : ( ruleLocalOperation ) ;
    public final void rule__ServiceInterface__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3557:1: ( ( ruleLocalOperation ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3558:1: ( ruleLocalOperation )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3558:1: ( ruleLocalOperation )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3559:1: ruleLocalOperation
            {
             before(grammarAccess.getServiceInterfaceAccess().getOperationLocalOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLocalOperation_in_rule__ServiceInterface__OperationAssignment_27102);
            ruleLocalOperation();
            _fsp--;

             after(grammarAccess.getServiceInterfaceAccess().getOperationLocalOperationParserRuleCall_2_0()); 

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
    // $ANTLR end rule__ServiceInterface__OperationAssignment_2


    // $ANTLR start rule__LocalOperation__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3568:1: rule__LocalOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3572:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3573:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3573:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3574:1: RULE_ID
            {
             before(grammarAccess.getLocalOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalOperation__NameAssignment_17133); 
             after(grammarAccess.getLocalOperationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end rule__LocalOperation__NameAssignment_1


    // $ANTLR start rule__LocalOperation__ReturnAssignment_3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3583:1: rule__LocalOperation__ReturnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__LocalOperation__ReturnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3587:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3588:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3588:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3589:1: RULE_STRING
            {
             before(grammarAccess.getLocalOperationAccess().getReturnSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalOperation__ReturnAssignment_37164); 
             after(grammarAccess.getLocalOperationAccess().getReturnSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end rule__LocalOperation__ReturnAssignment_3


    // $ANTLR start rule__LocalOperation__InputTypeAssignment_4_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3598:1: rule__LocalOperation__InputTypeAssignment_4_1 : ( ruleInputType ) ;
    public final void rule__LocalOperation__InputTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3602:1: ( ( ruleInputType ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3603:1: ( ruleInputType )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3603:1: ( ruleInputType )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3604:1: ruleInputType
            {
             before(grammarAccess.getLocalOperationAccess().getInputTypeInputTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleInputType_in_rule__LocalOperation__InputTypeAssignment_4_17195);
            ruleInputType();
            _fsp--;

             after(grammarAccess.getLocalOperationAccess().getInputTypeInputTypeEnumRuleCall_4_1_0()); 

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
    // $ANTLR end rule__LocalOperation__InputTypeAssignment_4_1


    // $ANTLR start rule__Service__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3613:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3617:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3618:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3618:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3619:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_17226); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3628:1: rule__Service__InterfaceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Service__InterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3632:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3633:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3633:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3634:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceCrossReference_3_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3635:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3636:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__InterfaceAssignment_37261); 
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


    // $ANTLR start rule__Service__ServiceInteractionAssignment_4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3647:1: rule__Service__ServiceInteractionAssignment_4 : ( ruleExplicitInteractionService ) ;
    public final void rule__Service__ServiceInteractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3651:1: ( ( ruleExplicitInteractionService ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3652:1: ( ruleExplicitInteractionService )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3652:1: ( ruleExplicitInteractionService )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3653:1: ruleExplicitInteractionService
            {
             before(grammarAccess.getServiceAccess().getServiceInteractionExplicitInteractionServiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExplicitInteractionService_in_rule__Service__ServiceInteractionAssignment_47296);
            ruleExplicitInteractionService();
            _fsp--;

             after(grammarAccess.getServiceAccess().getServiceInteractionExplicitInteractionServiceParserRuleCall_4_0()); 

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
    // $ANTLR end rule__Service__ServiceInteractionAssignment_4


    // $ANTLR start rule__Activity__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3662:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3666:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3667:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3667:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3668:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_17327); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3677:1: rule__Activity__LaunchableAssignment_2 : ( ( 'launchable' ) ) ;
    public final void rule__Activity__LaunchableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3681:1: ( ( ( 'launchable' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3682:1: ( ( 'launchable' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3682:1: ( ( 'launchable' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3683:1: ( 'launchable' )
            {
             before(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3684:1: ( 'launchable' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3685:1: 'launchable'
            {
             before(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0()); 
            match(input,43,FOLLOW_43_in_rule__Activity__LaunchableAssignment_27363); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3700:1: rule__Activity__ActionsAssignment_3 : ( ruleLocalAction ) ;
    public final void rule__Activity__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3704:1: ( ( ruleLocalAction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3705:1: ( ruleLocalAction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3705:1: ( ruleLocalAction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3706:1: ruleLocalAction
            {
             before(grammarAccess.getActivityAccess().getActionsLocalActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocalAction_in_rule__Activity__ActionsAssignment_37402);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3715:1: rule__Activity__InteractionsAssignment_4 : ( ruleInterAction ) ;
    public final void rule__Activity__InteractionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3719:1: ( ( ruleInterAction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3720:1: ( ruleInterAction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3720:1: ( ruleInterAction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3721:1: ruleInterAction
            {
             before(grammarAccess.getActivityAccess().getInteractionsInterActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterAction_in_rule__Activity__InteractionsAssignment_47433);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3730:1: rule__LocalAction__ActionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalAction__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3734:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3735:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3735:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3736:1: ( RULE_ID )
            {
             before(grammarAccess.getLocalActionAccess().getActionActionCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3737:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3738:1: RULE_ID
            {
             before(grammarAccess.getLocalActionAccess().getActionActionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAction__ActionAssignment_17468); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3749:1: rule__LocalAction__ButtonAssignment_2 : ( ( 'button' ) ) ;
    public final void rule__LocalAction__ButtonAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3753:1: ( ( ( 'button' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3754:1: ( ( 'button' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3754:1: ( ( 'button' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3755:1: ( 'button' )
            {
             before(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3756:1: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3757:1: 'button'
            {
             before(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__LocalAction__ButtonAssignment_27508); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3772:1: rule__InterAction__ButtonAssignment_0_1 : ( ( 'button' ) ) ;
    public final void rule__InterAction__ButtonAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3776:1: ( ( ( 'button' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3777:1: ( ( 'button' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3777:1: ( ( 'button' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3778:1: ( 'button' )
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3779:1: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3780:1: 'button'
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0()); 
            match(input,44,FOLLOW_44_in_rule__InterAction__ButtonAssignment_0_17552); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3795:1: rule__InterAction__ButtonAssignment_1_1 : ( ( 'button' ) ) ;
    public final void rule__InterAction__ButtonAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3799:1: ( ( ( 'button' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3800:1: ( ( 'button' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3800:1: ( ( 'button' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3801:1: ( 'button' )
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3802:1: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3803:1: 'button'
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0()); 
            match(input,44,FOLLOW_44_in_rule__InterAction__ButtonAssignment_1_17596); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3818:1: rule__ExplicitInteractionActivity__DestAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExplicitInteractionActivity__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3822:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3823:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3823:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3824:1: ( RULE_ID )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3825:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3826:1: RULE_ID
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__DestAssignment_17639); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3837:1: rule__ExplicitInteractionActivity__ActionAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExplicitInteractionActivity__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3841:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3842:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3842:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3843:1: ( RULE_ID )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getActionActionCrossReference_2_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3844:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3845:1: RULE_ID
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getActionActionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__ActionAssignment_2_17678); 
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


    // $ANTLR start rule__UseService__DestAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3856:1: rule__UseService__DestAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseService__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3860:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3861:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3861:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3862:1: ( RULE_ID )
            {
             before(grammarAccess.getUseServiceAccess().getDestServiceInterfaceCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3863:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3864:1: RULE_ID
            {
             before(grammarAccess.getUseServiceAccess().getDestServiceInterfaceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseService__DestAssignment_17717); 
             after(grammarAccess.getUseServiceAccess().getDestServiceInterfaceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUseServiceAccess().getDestServiceInterfaceCrossReference_1_0()); 

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
    // $ANTLR end rule__UseService__DestAssignment_1


    // $ANTLR start rule__UseService__OperationAssignment_3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3875:1: rule__UseService__OperationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__UseService__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3879:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3880:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3880:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3881:1: ( RULE_ID )
            {
             before(grammarAccess.getUseServiceAccess().getOperationLocalOperationCrossReference_3_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3882:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3883:1: RULE_ID
            {
             before(grammarAccess.getUseServiceAccess().getOperationLocalOperationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseService__OperationAssignment_37756); 
             after(grammarAccess.getUseServiceAccess().getOperationLocalOperationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getUseServiceAccess().getOperationLocalOperationCrossReference_3_0()); 

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
    // $ANTLR end rule__UseService__OperationAssignment_3


    // $ANTLR start rule__UseService__ArgAssignment_4_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3894:1: rule__UseService__ArgAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__UseService__ArgAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3898:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3899:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3899:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3900:1: RULE_STRING
            {
             before(grammarAccess.getUseServiceAccess().getArgSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseService__ArgAssignment_4_17791); 
             after(grammarAccess.getUseServiceAccess().getArgSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end rule__UseService__ArgAssignment_4_1


    // $ANTLR start rule__Launchservice__DestAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3909:1: rule__Launchservice__DestAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Launchservice__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3913:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3914:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3914:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3915:1: ( RULE_ID )
            {
             before(grammarAccess.getLaunchserviceAccess().getDestServiceCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3916:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3917:1: RULE_ID
            {
             before(grammarAccess.getLaunchserviceAccess().getDestServiceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Launchservice__DestAssignment_17826); 
             after(grammarAccess.getLaunchserviceAccess().getDestServiceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLaunchserviceAccess().getDestServiceCrossReference_1_0()); 

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
    // $ANTLR end rule__Launchservice__DestAssignment_1


    // $ANTLR start rule__ActionOnlyInteraction__ActionAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3928:1: rule__ActionOnlyInteraction__ActionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActionOnlyInteraction__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3932:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3933:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3933:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3934:1: ( RULE_ID )
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getActionActionCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3935:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3936:1: RULE_ID
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getActionActionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionOnlyInteraction__ActionAssignment_17865); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3947:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3951:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3952:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3952:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3953:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_17900); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3962:1: rule__Action__DataAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Action__DataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3966:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3967:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3967:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3968:1: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getDataDataCrossReference_3_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3969:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3970:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getDataDataIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__DataAssignment_37935); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3981:1: rule__Action__CategoryAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Action__CategoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3985:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3986:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3986:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3987:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getCategorySTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__CategoryAssignment_57970); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3996:1: rule__Data__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4000:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4001:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4001:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4002:1: RULE_ID
            {
             before(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Data__NameAssignment_18001); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4011:1: rule__Data__SchemeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Data__SchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4015:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4016:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4016:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4017:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getSchemeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__SchemeAssignment_38032); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4026:1: rule__Data__HostAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Data__HostAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4030:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4031:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4031:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4032:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getHostSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__HostAssignment_4_18063); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4041:1: rule__Data__PortAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Data__PortAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4045:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4046:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4046:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4047:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getPortSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__PortAssignment_5_18094); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4056:1: rule__Data__PathAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Data__PathAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4060:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4061:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4061:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4062:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__PathAssignment_6_18125); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4071:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4075:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4076:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4076:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4077:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__NameAssignment_18156); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4086:1: rule__Application__AvdAssignment_3 : ( RULE_INT ) ;
    public final void rule__Application__AvdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4090:1: ( ( RULE_INT ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4091:1: ( RULE_INT )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4091:1: ( RULE_INT )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4092:1: RULE_INT
            {
             before(grammarAccess.getApplicationAccess().getAvdINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Application__AvdAssignment_38187); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4101:1: rule__Application__WorkDirAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Application__WorkDirAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4105:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4106:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4106:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4107:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getWorkDirIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__WorkDirAssignment_4_18218); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4116:1: rule__Application__PackageNameAssignment_6 : ( ruleURI ) ;
    public final void rule__Application__PackageNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4120:1: ( ( ruleURI ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4121:1: ( ruleURI )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4121:1: ( ruleURI )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4122:1: ruleURI
            {
             before(grammarAccess.getApplicationAccess().getPackageNameURIParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__Application__PackageNameAssignment_68249);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4131:1: rule__Application__MainActivityAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Application__MainActivityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4135:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4136:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4136:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4137:1: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getMainActivityActivityCrossReference_8_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4138:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4139:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getMainActivityActivityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__MainActivityAssignment_88284); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4150:1: rule__Application__TargetAssignment_10 : ( RULE_INT ) ;
    public final void rule__Application__TargetAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4154:1: ( ( RULE_INT ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4155:1: ( RULE_INT )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4155:1: ( RULE_INT )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4156:1: RULE_INT
            {
             before(grammarAccess.getApplicationAccess().getTargetINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Application__TargetAssignment_108319); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4165:1: rule__Application__PathAssignment_12 : ( RULE_ID ) ;
    public final void rule__Application__PathAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4169:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4170:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4170:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4171:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getPathIDTerminalRuleCall_12_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__PathAssignment_128350); 
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
    public static final BitSet FOLLOW_ruleLocalOperation_in_entryRuleLocalOperation241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalOperation248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__0_in_ruleLocalOperation274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_entryRuleLocalAction421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAction428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__0_in_ruleLocalAction454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterAction_in_entryRuleInterAction481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterAction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Alternatives_in_ruleInterAction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteraction548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteraction__Alternatives_in_ruleExplicitInteraction574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteractionActivity608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__0_in_ruleExplicitInteractionActivity634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_entryRuleExplicitInteractionService661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteractionService668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionService__Alternatives_in_ruleExplicitInteractionService694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseService_in_entryRuleUseService721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseService728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__0_in_ruleUseService754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLaunchservice_in_entryRuleLaunchservice781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLaunchservice788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Launchservice__Group__0_in_ruleLaunchservice814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionOnlyInteraction848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__0_in_ruleActionOnlyInteraction874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__0_in_ruleData994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0_in_ruleURI1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestUri_in_entryRuleRestUri1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestUri1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestUri__Alternatives_in_ruleRestUri1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputType__Alternatives_in_ruleInputType1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Component__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__Component__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__0_in_rule__InterAction__Alternatives1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__0_in_rule__InterAction__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_rule__ExplicitInteraction__Alternatives1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_rule__ExplicitInteraction__Alternatives1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseService_in_rule__ExplicitInteractionService__Alternatives1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLaunchservice_in_rule__ExplicitInteractionService__Alternatives1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RestUri__Alternatives1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__RestUri__Alternatives1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InputType__Alternatives1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InputType__Alternatives1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__InputType__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__0__Impl_in_rule__AndroidSystem__Group__01569 = new BitSet(new long[]{0x0000001000684000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__1_in_rule__AndroidSystem__Group__01572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__DataAssignment_0_in_rule__AndroidSystem__Group__0__Impl1599 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__1__Impl_in_rule__AndroidSystem__Group__11630 = new BitSet(new long[]{0x0000001000284000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__2_in_rule__AndroidSystem__Group__11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ActionAssignment_1_in_rule__AndroidSystem__Group__1__Impl1660 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__2__Impl_in_rule__AndroidSystem__Group__21691 = new BitSet(new long[]{0x0000001000280000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__3_in_rule__AndroidSystem__Group__21694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ServiceInterfaceAssignment_2_in_rule__AndroidSystem__Group__2__Impl1721 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__3__Impl_in_rule__AndroidSystem__Group__31752 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__4_in_rule__AndroidSystem__Group__31755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ComponentAssignment_3_in_rule__AndroidSystem__Group__3__Impl1782 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__4__Impl_in_rule__AndroidSystem__Group__41813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ApplicationAssignment_4_in_rule__AndroidSystem__Group__4__Impl1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__0__Impl_in_rule__ServiceInterface__Group__01880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__1_in_rule__ServiceInterface__Group__01883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ServiceInterface__Group__0__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__1__Impl_in_rule__ServiceInterface__Group__11942 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__2_in_rule__ServiceInterface__Group__11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__NameAssignment_1_in_rule__ServiceInterface__Group__1__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__2__Impl_in_rule__ServiceInterface__Group__22002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__OperationAssignment_2_in_rule__ServiceInterface__Group__2__Impl2029 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__0__Impl_in_rule__LocalOperation__Group__02066 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__1_in_rule__LocalOperation__Group__02069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LocalOperation__Group__0__Impl2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__1__Impl_in_rule__LocalOperation__Group__12128 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__2_in_rule__LocalOperation__Group__12131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__NameAssignment_1_in_rule__LocalOperation__Group__1__Impl2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__2__Impl_in_rule__LocalOperation__Group__22188 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__3_in_rule__LocalOperation__Group__22191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LocalOperation__Group__2__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__3__Impl_in_rule__LocalOperation__Group__32250 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__4_in_rule__LocalOperation__Group__32253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__ReturnAssignment_3_in_rule__LocalOperation__Group__3__Impl2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__4__Impl_in_rule__LocalOperation__Group__42310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__0_in_rule__LocalOperation__Group__4__Impl2337 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__0__Impl_in_rule__LocalOperation__Group_4__02378 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__1_in_rule__LocalOperation__Group_4__02381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LocalOperation__Group_4__0__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__1__Impl_in_rule__LocalOperation__Group_4__12440 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__2_in_rule__LocalOperation__Group_4__12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__InputTypeAssignment_4_1_in_rule__LocalOperation__Group_4__1__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__2__Impl_in_rule__LocalOperation__Group_4__22500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LocalOperation__Group_4__2__Impl2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__02565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__02568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__0__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__12627 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__12630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__22687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__22690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Service__Group__2__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__32749 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__32752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__InterfaceAssignment_3_in_rule__Service__Group__3__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__42809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ServiceInteractionAssignment_4_in_rule__Service__Group__4__Impl2836 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group__0__Impl2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12939 = new BitSet(new long[]{0x0000080032C00002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22999 = new BitSet(new long[]{0x0000000032C00002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__LaunchableAssignment_2_in_rule__Activity__Group__2__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33060 = new BitSet(new long[]{0x0000000032800002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ActionsAssignment_3_in_rule__Activity__Group__3__Impl3090 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InteractionsAssignment_4_in_rule__Activity__Group__4__Impl3148 = new BitSet(new long[]{0x0000000032800002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__0__Impl_in_rule__LocalAction__Group__03189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__1_in_rule__LocalAction__Group__03192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LocalAction__Group__0__Impl3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__1__Impl_in_rule__LocalAction__Group__13251 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__2_in_rule__LocalAction__Group__13254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__ActionAssignment_1_in_rule__LocalAction__Group__1__Impl3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__2__Impl_in_rule__LocalAction__Group__23311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__ButtonAssignment_2_in_rule__LocalAction__Group__2__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__0__Impl_in_rule__InterAction__Group_0__03375 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__1_in_rule__InterAction__Group_0__03378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_rule__InterAction__Group_0__0__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__1__Impl_in_rule__InterAction__Group_0__13434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__ButtonAssignment_0_1_in_rule__InterAction__Group_0__1__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__0__Impl_in_rule__InterAction__Group_1__03496 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__1_in_rule__InterAction__Group_1__03499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_rule__InterAction__Group_1__0__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__1__Impl_in_rule__InterAction__Group_1__13555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__ButtonAssignment_1_1_in_rule__InterAction__Group_1__1__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__0__Impl_in_rule__ExplicitInteractionActivity__Group__03617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__1_in_rule__ExplicitInteractionActivity__Group__03620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ExplicitInteractionActivity__Group__0__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__1__Impl_in_rule__ExplicitInteractionActivity__Group__13679 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__2_in_rule__ExplicitInteractionActivity__Group__13682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__DestAssignment_1_in_rule__ExplicitInteractionActivity__Group__1__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__2__Impl_in_rule__ExplicitInteractionActivity__Group__23739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__0_in_rule__ExplicitInteractionActivity__Group__2__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__0__Impl_in_rule__ExplicitInteractionActivity__Group_2__03803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__1_in_rule__ExplicitInteractionActivity__Group_2__03806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExplicitInteractionActivity__Group_2__0__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__1__Impl_in_rule__ExplicitInteractionActivity__Group_2__13865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__ActionAssignment_2_1_in_rule__ExplicitInteractionActivity__Group_2__1__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__0__Impl_in_rule__UseService__Group__03926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseService__Group__1_in_rule__UseService__Group__03929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UseService__Group__0__Impl3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__1__Impl_in_rule__UseService__Group__13988 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UseService__Group__2_in_rule__UseService__Group__13991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__DestAssignment_1_in_rule__UseService__Group__1__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__2__Impl_in_rule__UseService__Group__24048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseService__Group__3_in_rule__UseService__Group__24051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UseService__Group__2__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__3__Impl_in_rule__UseService__Group__34110 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__4_in_rule__UseService__Group__34113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__OperationAssignment_3_in_rule__UseService__Group__3__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__4__Impl_in_rule__UseService__Group__44170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group_4__0_in_rule__UseService__Group__4__Impl4197 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__UseService__Group_4__0__Impl_in_rule__UseService__Group_4__04238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseService__Group_4__1_in_rule__UseService__Group_4__04241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UseService__Group_4__0__Impl4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group_4__1__Impl_in_rule__UseService__Group_4__14300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__ArgAssignment_4_1_in_rule__UseService__Group_4__1__Impl4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Launchservice__Group__0__Impl_in_rule__Launchservice__Group__04361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Launchservice__Group__1_in_rule__Launchservice__Group__04364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Launchservice__Group__0__Impl4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Launchservice__Group__1__Impl_in_rule__Launchservice__Group__14423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Launchservice__DestAssignment_1_in_rule__Launchservice__Group__1__Impl4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__0__Impl_in_rule__ActionOnlyInteraction__Group__04484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__1_in_rule__ActionOnlyInteraction__Group__04487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ActionOnlyInteraction__Group__0__Impl4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__1__Impl_in_rule__ActionOnlyInteraction__Group__14546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__ActionAssignment_1_in_rule__ActionOnlyInteraction__Group__1__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Action__Group__0__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14669 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Action__Group__2__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34791 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DataAssignment_3_in_rule__Action__Group__3__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__44851 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__44854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Action__Group__4__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__54913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__CategoryAssignment_5_in_rule__Action__Group__5__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__04982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Data__Group__1_in_rule__Data__Group__04985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Data__Group__0__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__15044 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Data__Group__2_in_rule__Data__Group__15047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__NameAssignment_1_in_rule__Data__Group__1__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__2__Impl_in_rule__Data__Group__25104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group__3_in_rule__Data__Group__25107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Data__Group__2__Impl5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__3__Impl_in_rule__Data__Group__35166 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_rule__Data__Group__4_in_rule__Data__Group__35169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__SchemeAssignment_3_in_rule__Data__Group__3__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__4__Impl_in_rule__Data__Group__45226 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rule__Data__Group__5_in_rule__Data__Group__45229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_4__0_in_rule__Data__Group__4__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__5__Impl_in_rule__Data__Group__55287 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Data__Group__6_in_rule__Data__Group__55290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_5__0_in_rule__Data__Group__5__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__6__Impl_in_rule__Data__Group__65348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__0_in_rule__Data__Group__6__Impl5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_4__0__Impl_in_rule__Data__Group_4__05420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group_4__1_in_rule__Data__Group_4__05423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Data__Group_4__0__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_4__1__Impl_in_rule__Data__Group_4__15482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__HostAssignment_4_1_in_rule__Data__Group_4__1__Impl5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_5__0__Impl_in_rule__Data__Group_5__05543 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group_5__1_in_rule__Data__Group_5__05546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Data__Group_5__0__Impl5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_5__1__Impl_in_rule__Data__Group_5__15605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__PortAssignment_5_1_in_rule__Data__Group_5__1__Impl5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__0__Impl_in_rule__Data__Group_6__05666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group_6__1_in_rule__Data__Group_6__05669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Data__Group_6__0__Impl5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__1__Impl_in_rule__Data__Group_6__15728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__PathAssignment_6_1_in_rule__Data__Group_6__1__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__05789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__05792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Application__Group__0__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__15851 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__15854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__25911 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__25914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Application__Group__2__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__35973 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__35976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AvdAssignment_3_in_rule__Application__Group__3__Impl6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__46033 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__46036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__56094 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__6_in_rule__Application__Group__56097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Application__Group__5__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__66156 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__7_in_rule__Application__Group__66159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__PackageNameAssignment_6_in_rule__Application__Group__6__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__76216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__8_in_rule__Application__Group__76219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Application__Group__7__Impl6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__86278 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__9_in_rule__Application__Group__86281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__MainActivityAssignment_8_in_rule__Application__Group__8__Impl6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__9__Impl_in_rule__Application__Group__96338 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Application__Group__10_in_rule__Application__Group__96341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Application__Group__9__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__10__Impl_in_rule__Application__Group__106400 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Application__Group__11_in_rule__Application__Group__106403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__TargetAssignment_10_in_rule__Application__Group__10__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__11__Impl_in_rule__Application__Group__116460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__12_in_rule__Application__Group__116463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Application__Group__11__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__12__Impl_in_rule__Application__Group__126522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__PathAssignment_12_in_rule__Application__Group__12__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__06605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__06608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Application__Group_4__0__Impl6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__16667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__WorkDirAssignment_4_1_in_rule__Application__Group_4__1__Impl6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__06728 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__06731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__Group__0__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__16787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group__2_in_rule__URI__Group__16790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__URI__Group__1__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__26849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestUri_in_rule__URI__Group__2__Impl6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__AndroidSystem__DataAssignment_06916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__AndroidSystem__ActionAssignment_16947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_rule__AndroidSystem__ServiceInterfaceAssignment_26978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__AndroidSystem__ComponentAssignment_37009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidSystem__ApplicationAssignment_47040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceInterface__NameAssignment_17071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalOperation_in_rule__ServiceInterface__OperationAssignment_27102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalOperation__NameAssignment_17133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalOperation__ReturnAssignment_37164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputType_in_rule__LocalOperation__InputTypeAssignment_4_17195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_17226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__InterfaceAssignment_37261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_rule__Service__ServiceInteractionAssignment_47296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_17327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Activity__LaunchableAssignment_27363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_rule__Activity__ActionsAssignment_37402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterAction_in_rule__Activity__InteractionsAssignment_47433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAction__ActionAssignment_17468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__LocalAction__ButtonAssignment_27508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__InterAction__ButtonAssignment_0_17552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__InterAction__ButtonAssignment_1_17596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__DestAssignment_17639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__ActionAssignment_2_17678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseService__DestAssignment_17717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseService__OperationAssignment_37756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UseService__ArgAssignment_4_17791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Launchservice__DestAssignment_17826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionOnlyInteraction__ActionAssignment_17865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_17900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__DataAssignment_37935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__CategoryAssignment_57970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Data__NameAssignment_18001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__SchemeAssignment_38032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__HostAssignment_4_18063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__PortAssignment_5_18094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__PathAssignment_6_18125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__NameAssignment_18156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Application__AvdAssignment_38187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__WorkDirAssignment_4_18218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__Application__PackageNameAssignment_68249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__MainActivityAssignment_88284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Application__TargetAssignment_108319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__PathAssignment_128350 = new BitSet(new long[]{0x0000000000000002L});

}