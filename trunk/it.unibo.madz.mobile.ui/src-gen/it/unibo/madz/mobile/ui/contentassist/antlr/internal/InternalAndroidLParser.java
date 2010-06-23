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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'int'", "'double'", "'AndroidSystem'", "'serviceInterface'", "'op'", "'return'", "'inputType'", "';'", "'Service'", "'implements'", "'Activity'", "'action'", "'callActivity'", "'forActiom'", "'useService'", "'forOp'", "'arg='", "'launchService'", "'execAction'", "'data'", "'category'", "'scheme'", "'host'", "'port'", "'path'", "'Application'", "'avd'", "'package'", "'entryActiviy'", "'target'", "'workdir'", "'.'", "'launchable'", "'button'"
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

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
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

            if ( (LA2_0==24||LA2_0==26||LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
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

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==26||LA3_0==29) ) {
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

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
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

                if ( (LA5_1==EOF||LA5_1==40) ) {
                    alt5=1;
                }
                else if ( (LA5_1==43) ) {
                    alt5=2;
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:767:1: rule__AndroidSystem__Group__0__Impl : ( 'AndroidSystem' ) ;
    public final void rule__AndroidSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:771:1: ( ( 'AndroidSystem' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:772:1: ( 'AndroidSystem' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:772:1: ( 'AndroidSystem' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:773:1: 'AndroidSystem'
            {
             before(grammarAccess.getAndroidSystemAccess().getAndroidSystemKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__AndroidSystem__Group__0__Impl1600); 
             after(grammarAccess.getAndroidSystemAccess().getAndroidSystemKeyword_0()); 

            }


            }

        }
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:786:1: rule__AndroidSystem__Group__1 : rule__AndroidSystem__Group__1__Impl rule__AndroidSystem__Group__2 ;
    public final void rule__AndroidSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:790:1: ( rule__AndroidSystem__Group__1__Impl rule__AndroidSystem__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:791:2: rule__AndroidSystem__Group__1__Impl rule__AndroidSystem__Group__2
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__1__Impl_in_rule__AndroidSystem__Group__11631);
            rule__AndroidSystem__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__2_in_rule__AndroidSystem__Group__11634);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:798:1: rule__AndroidSystem__Group__1__Impl : ( ( rule__AndroidSystem__NameAssignment_1 ) ) ;
    public final void rule__AndroidSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:802:1: ( ( ( rule__AndroidSystem__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:803:1: ( ( rule__AndroidSystem__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:803:1: ( ( rule__AndroidSystem__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:804:1: ( rule__AndroidSystem__NameAssignment_1 )
            {
             before(grammarAccess.getAndroidSystemAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:805:1: ( rule__AndroidSystem__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:805:2: rule__AndroidSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AndroidSystem__NameAssignment_1_in_rule__AndroidSystem__Group__1__Impl1661);
            rule__AndroidSystem__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAndroidSystemAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:815:1: rule__AndroidSystem__Group__2 : rule__AndroidSystem__Group__2__Impl rule__AndroidSystem__Group__3 ;
    public final void rule__AndroidSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:819:1: ( rule__AndroidSystem__Group__2__Impl rule__AndroidSystem__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:820:2: rule__AndroidSystem__Group__2__Impl rule__AndroidSystem__Group__3
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:827:1: rule__AndroidSystem__Group__2__Impl : ( ( rule__AndroidSystem__DataAssignment_2 )* ) ;
    public final void rule__AndroidSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:831:1: ( ( ( rule__AndroidSystem__DataAssignment_2 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:832:1: ( ( rule__AndroidSystem__DataAssignment_2 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:832:1: ( ( rule__AndroidSystem__DataAssignment_2 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:833:1: ( rule__AndroidSystem__DataAssignment_2 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getDataAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:834:1: ( rule__AndroidSystem__DataAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:834:2: rule__AndroidSystem__DataAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__DataAssignment_2_in_rule__AndroidSystem__Group__2__Impl1721);
            	    rule__AndroidSystem__DataAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAndroidSystemAccess().getDataAssignment_2()); 

            }


            }

        }
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:844:1: rule__AndroidSystem__Group__3 : rule__AndroidSystem__Group__3__Impl rule__AndroidSystem__Group__4 ;
    public final void rule__AndroidSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:848:1: ( rule__AndroidSystem__Group__3__Impl rule__AndroidSystem__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:849:2: rule__AndroidSystem__Group__3__Impl rule__AndroidSystem__Group__4
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:856:1: rule__AndroidSystem__Group__3__Impl : ( ( rule__AndroidSystem__ActionAssignment_3 )* ) ;
    public final void rule__AndroidSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:860:1: ( ( ( rule__AndroidSystem__ActionAssignment_3 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:861:1: ( ( rule__AndroidSystem__ActionAssignment_3 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:861:1: ( ( rule__AndroidSystem__ActionAssignment_3 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:862:1: ( rule__AndroidSystem__ActionAssignment_3 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getActionAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:863:1: ( rule__AndroidSystem__ActionAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:863:2: rule__AndroidSystem__ActionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__ActionAssignment_3_in_rule__AndroidSystem__Group__3__Impl1782);
            	    rule__AndroidSystem__ActionAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAndroidSystemAccess().getActionAssignment_3()); 

            }


            }

        }
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:873:1: rule__AndroidSystem__Group__4 : rule__AndroidSystem__Group__4__Impl rule__AndroidSystem__Group__5 ;
    public final void rule__AndroidSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:877:1: ( rule__AndroidSystem__Group__4__Impl rule__AndroidSystem__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:878:2: rule__AndroidSystem__Group__4__Impl rule__AndroidSystem__Group__5
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__4__Impl_in_rule__AndroidSystem__Group__41813);
            rule__AndroidSystem__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__5_in_rule__AndroidSystem__Group__41816);
            rule__AndroidSystem__Group__5();
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:885:1: rule__AndroidSystem__Group__4__Impl : ( ( rule__AndroidSystem__ServiceInterfaceAssignment_4 )* ) ;
    public final void rule__AndroidSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:889:1: ( ( ( rule__AndroidSystem__ServiceInterfaceAssignment_4 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:890:1: ( ( rule__AndroidSystem__ServiceInterfaceAssignment_4 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:890:1: ( ( rule__AndroidSystem__ServiceInterfaceAssignment_4 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:891:1: ( rule__AndroidSystem__ServiceInterfaceAssignment_4 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getServiceInterfaceAssignment_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:892:1: ( rule__AndroidSystem__ServiceInterfaceAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:892:2: rule__AndroidSystem__ServiceInterfaceAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__ServiceInterfaceAssignment_4_in_rule__AndroidSystem__Group__4__Impl1843);
            	    rule__AndroidSystem__ServiceInterfaceAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAndroidSystemAccess().getServiceInterfaceAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start rule__AndroidSystem__Group__5
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:902:1: rule__AndroidSystem__Group__5 : rule__AndroidSystem__Group__5__Impl rule__AndroidSystem__Group__6 ;
    public final void rule__AndroidSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:906:1: ( rule__AndroidSystem__Group__5__Impl rule__AndroidSystem__Group__6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:907:2: rule__AndroidSystem__Group__5__Impl rule__AndroidSystem__Group__6
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__5__Impl_in_rule__AndroidSystem__Group__51874);
            rule__AndroidSystem__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndroidSystem__Group__6_in_rule__AndroidSystem__Group__51877);
            rule__AndroidSystem__Group__6();
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
    // $ANTLR end rule__AndroidSystem__Group__5


    // $ANTLR start rule__AndroidSystem__Group__5__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:914:1: rule__AndroidSystem__Group__5__Impl : ( ( rule__AndroidSystem__ComponentAssignment_5 )* ) ;
    public final void rule__AndroidSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:918:1: ( ( ( rule__AndroidSystem__ComponentAssignment_5 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:919:1: ( ( rule__AndroidSystem__ComponentAssignment_5 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:919:1: ( ( rule__AndroidSystem__ComponentAssignment_5 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:920:1: ( rule__AndroidSystem__ComponentAssignment_5 )*
            {
             before(grammarAccess.getAndroidSystemAccess().getComponentAssignment_5()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:921:1: ( rule__AndroidSystem__ComponentAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20||LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:921:2: rule__AndroidSystem__ComponentAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__AndroidSystem__ComponentAssignment_5_in_rule__AndroidSystem__Group__5__Impl1904);
            	    rule__AndroidSystem__ComponentAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAndroidSystemAccess().getComponentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__5__Impl


    // $ANTLR start rule__AndroidSystem__Group__6
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:931:1: rule__AndroidSystem__Group__6 : rule__AndroidSystem__Group__6__Impl ;
    public final void rule__AndroidSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:935:1: ( rule__AndroidSystem__Group__6__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:936:2: rule__AndroidSystem__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AndroidSystem__Group__6__Impl_in_rule__AndroidSystem__Group__61935);
            rule__AndroidSystem__Group__6__Impl();
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
    // $ANTLR end rule__AndroidSystem__Group__6


    // $ANTLR start rule__AndroidSystem__Group__6__Impl
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:942:1: rule__AndroidSystem__Group__6__Impl : ( ( rule__AndroidSystem__ApplicationAssignment_6 ) ) ;
    public final void rule__AndroidSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:946:1: ( ( ( rule__AndroidSystem__ApplicationAssignment_6 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:947:1: ( ( rule__AndroidSystem__ApplicationAssignment_6 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:947:1: ( ( rule__AndroidSystem__ApplicationAssignment_6 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:948:1: ( rule__AndroidSystem__ApplicationAssignment_6 )
            {
             before(grammarAccess.getAndroidSystemAccess().getApplicationAssignment_6()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:949:1: ( rule__AndroidSystem__ApplicationAssignment_6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:949:2: rule__AndroidSystem__ApplicationAssignment_6
            {
            pushFollow(FOLLOW_rule__AndroidSystem__ApplicationAssignment_6_in_rule__AndroidSystem__Group__6__Impl1962);
            rule__AndroidSystem__ApplicationAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getAndroidSystemAccess().getApplicationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__Group__6__Impl


    // $ANTLR start rule__ServiceInterface__Group__0
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:973:1: rule__ServiceInterface__Group__0 : rule__ServiceInterface__Group__0__Impl rule__ServiceInterface__Group__1 ;
    public final void rule__ServiceInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:977:1: ( rule__ServiceInterface__Group__0__Impl rule__ServiceInterface__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:978:2: rule__ServiceInterface__Group__0__Impl rule__ServiceInterface__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceInterface__Group__0__Impl_in_rule__ServiceInterface__Group__02006);
            rule__ServiceInterface__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ServiceInterface__Group__1_in_rule__ServiceInterface__Group__02009);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:985:1: rule__ServiceInterface__Group__0__Impl : ( 'serviceInterface' ) ;
    public final void rule__ServiceInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:989:1: ( ( 'serviceInterface' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:990:1: ( 'serviceInterface' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:990:1: ( 'serviceInterface' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:991:1: 'serviceInterface'
            {
             before(grammarAccess.getServiceInterfaceAccess().getServiceInterfaceKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__ServiceInterface__Group__0__Impl2037); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1004:1: rule__ServiceInterface__Group__1 : rule__ServiceInterface__Group__1__Impl rule__ServiceInterface__Group__2 ;
    public final void rule__ServiceInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1008:1: ( rule__ServiceInterface__Group__1__Impl rule__ServiceInterface__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1009:2: rule__ServiceInterface__Group__1__Impl rule__ServiceInterface__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceInterface__Group__1__Impl_in_rule__ServiceInterface__Group__12068);
            rule__ServiceInterface__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ServiceInterface__Group__2_in_rule__ServiceInterface__Group__12071);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1016:1: rule__ServiceInterface__Group__1__Impl : ( ( rule__ServiceInterface__NameAssignment_1 ) ) ;
    public final void rule__ServiceInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1020:1: ( ( ( rule__ServiceInterface__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1021:1: ( ( rule__ServiceInterface__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1021:1: ( ( rule__ServiceInterface__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1022:1: ( rule__ServiceInterface__NameAssignment_1 )
            {
             before(grammarAccess.getServiceInterfaceAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1023:1: ( rule__ServiceInterface__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1023:2: rule__ServiceInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceInterface__NameAssignment_1_in_rule__ServiceInterface__Group__1__Impl2098);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1033:1: rule__ServiceInterface__Group__2 : rule__ServiceInterface__Group__2__Impl ;
    public final void rule__ServiceInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1037:1: ( rule__ServiceInterface__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1038:2: rule__ServiceInterface__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ServiceInterface__Group__2__Impl_in_rule__ServiceInterface__Group__22128);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1044:1: rule__ServiceInterface__Group__2__Impl : ( ( rule__ServiceInterface__OperationAssignment_2 )* ) ;
    public final void rule__ServiceInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1048:1: ( ( ( rule__ServiceInterface__OperationAssignment_2 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1049:1: ( ( rule__ServiceInterface__OperationAssignment_2 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1049:1: ( ( rule__ServiceInterface__OperationAssignment_2 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1050:1: ( rule__ServiceInterface__OperationAssignment_2 )*
            {
             before(grammarAccess.getServiceInterfaceAccess().getOperationAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1051:1: ( rule__ServiceInterface__OperationAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1051:2: rule__ServiceInterface__OperationAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ServiceInterface__OperationAssignment_2_in_rule__ServiceInterface__Group__2__Impl2155);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1067:1: rule__LocalOperation__Group__0 : rule__LocalOperation__Group__0__Impl rule__LocalOperation__Group__1 ;
    public final void rule__LocalOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1071:1: ( rule__LocalOperation__Group__0__Impl rule__LocalOperation__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1072:2: rule__LocalOperation__Group__0__Impl rule__LocalOperation__Group__1
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__0__Impl_in_rule__LocalOperation__Group__02192);
            rule__LocalOperation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group__1_in_rule__LocalOperation__Group__02195);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1079:1: rule__LocalOperation__Group__0__Impl : ( 'op' ) ;
    public final void rule__LocalOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1083:1: ( ( 'op' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1084:1: ( 'op' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1084:1: ( 'op' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1085:1: 'op'
            {
             before(grammarAccess.getLocalOperationAccess().getOpKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__LocalOperation__Group__0__Impl2223); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1098:1: rule__LocalOperation__Group__1 : rule__LocalOperation__Group__1__Impl rule__LocalOperation__Group__2 ;
    public final void rule__LocalOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1102:1: ( rule__LocalOperation__Group__1__Impl rule__LocalOperation__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1103:2: rule__LocalOperation__Group__1__Impl rule__LocalOperation__Group__2
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__1__Impl_in_rule__LocalOperation__Group__12254);
            rule__LocalOperation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group__2_in_rule__LocalOperation__Group__12257);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1110:1: rule__LocalOperation__Group__1__Impl : ( ( rule__LocalOperation__NameAssignment_1 ) ) ;
    public final void rule__LocalOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1114:1: ( ( ( rule__LocalOperation__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1115:1: ( ( rule__LocalOperation__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1115:1: ( ( rule__LocalOperation__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1116:1: ( rule__LocalOperation__NameAssignment_1 )
            {
             before(grammarAccess.getLocalOperationAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1117:1: ( rule__LocalOperation__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1117:2: rule__LocalOperation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LocalOperation__NameAssignment_1_in_rule__LocalOperation__Group__1__Impl2284);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1127:1: rule__LocalOperation__Group__2 : rule__LocalOperation__Group__2__Impl rule__LocalOperation__Group__3 ;
    public final void rule__LocalOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1131:1: ( rule__LocalOperation__Group__2__Impl rule__LocalOperation__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1132:2: rule__LocalOperation__Group__2__Impl rule__LocalOperation__Group__3
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__2__Impl_in_rule__LocalOperation__Group__22314);
            rule__LocalOperation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group__3_in_rule__LocalOperation__Group__22317);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1139:1: rule__LocalOperation__Group__2__Impl : ( 'return' ) ;
    public final void rule__LocalOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1143:1: ( ( 'return' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1144:1: ( 'return' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1144:1: ( 'return' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1145:1: 'return'
            {
             before(grammarAccess.getLocalOperationAccess().getReturnKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__LocalOperation__Group__2__Impl2345); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1158:1: rule__LocalOperation__Group__3 : rule__LocalOperation__Group__3__Impl rule__LocalOperation__Group__4 ;
    public final void rule__LocalOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1162:1: ( rule__LocalOperation__Group__3__Impl rule__LocalOperation__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1163:2: rule__LocalOperation__Group__3__Impl rule__LocalOperation__Group__4
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__3__Impl_in_rule__LocalOperation__Group__32376);
            rule__LocalOperation__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group__4_in_rule__LocalOperation__Group__32379);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1170:1: rule__LocalOperation__Group__3__Impl : ( ( rule__LocalOperation__ReturnAssignment_3 ) ) ;
    public final void rule__LocalOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1174:1: ( ( ( rule__LocalOperation__ReturnAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1175:1: ( ( rule__LocalOperation__ReturnAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1175:1: ( ( rule__LocalOperation__ReturnAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1176:1: ( rule__LocalOperation__ReturnAssignment_3 )
            {
             before(grammarAccess.getLocalOperationAccess().getReturnAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1177:1: ( rule__LocalOperation__ReturnAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1177:2: rule__LocalOperation__ReturnAssignment_3
            {
            pushFollow(FOLLOW_rule__LocalOperation__ReturnAssignment_3_in_rule__LocalOperation__Group__3__Impl2406);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1187:1: rule__LocalOperation__Group__4 : rule__LocalOperation__Group__4__Impl ;
    public final void rule__LocalOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1191:1: ( rule__LocalOperation__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1192:2: rule__LocalOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group__4__Impl_in_rule__LocalOperation__Group__42436);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1198:1: rule__LocalOperation__Group__4__Impl : ( ( rule__LocalOperation__Group_4__0 )* ) ;
    public final void rule__LocalOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1202:1: ( ( ( rule__LocalOperation__Group_4__0 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1203:1: ( ( rule__LocalOperation__Group_4__0 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1203:1: ( ( rule__LocalOperation__Group_4__0 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1204:1: ( rule__LocalOperation__Group_4__0 )*
            {
             before(grammarAccess.getLocalOperationAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1205:1: ( rule__LocalOperation__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1205:2: rule__LocalOperation__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__LocalOperation__Group_4__0_in_rule__LocalOperation__Group__4__Impl2463);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1225:1: rule__LocalOperation__Group_4__0 : rule__LocalOperation__Group_4__0__Impl rule__LocalOperation__Group_4__1 ;
    public final void rule__LocalOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1229:1: ( rule__LocalOperation__Group_4__0__Impl rule__LocalOperation__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1230:2: rule__LocalOperation__Group_4__0__Impl rule__LocalOperation__Group_4__1
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group_4__0__Impl_in_rule__LocalOperation__Group_4__02504);
            rule__LocalOperation__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group_4__1_in_rule__LocalOperation__Group_4__02507);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1237:1: rule__LocalOperation__Group_4__0__Impl : ( 'inputType' ) ;
    public final void rule__LocalOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1241:1: ( ( 'inputType' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1242:1: ( 'inputType' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1242:1: ( 'inputType' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1243:1: 'inputType'
            {
             before(grammarAccess.getLocalOperationAccess().getInputTypeKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__LocalOperation__Group_4__0__Impl2535); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1256:1: rule__LocalOperation__Group_4__1 : rule__LocalOperation__Group_4__1__Impl rule__LocalOperation__Group_4__2 ;
    public final void rule__LocalOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1260:1: ( rule__LocalOperation__Group_4__1__Impl rule__LocalOperation__Group_4__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1261:2: rule__LocalOperation__Group_4__1__Impl rule__LocalOperation__Group_4__2
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group_4__1__Impl_in_rule__LocalOperation__Group_4__12566);
            rule__LocalOperation__Group_4__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalOperation__Group_4__2_in_rule__LocalOperation__Group_4__12569);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1268:1: rule__LocalOperation__Group_4__1__Impl : ( ( rule__LocalOperation__InputTypeAssignment_4_1 ) ) ;
    public final void rule__LocalOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1272:1: ( ( ( rule__LocalOperation__InputTypeAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1273:1: ( ( rule__LocalOperation__InputTypeAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1273:1: ( ( rule__LocalOperation__InputTypeAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1274:1: ( rule__LocalOperation__InputTypeAssignment_4_1 )
            {
             before(grammarAccess.getLocalOperationAccess().getInputTypeAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1275:1: ( rule__LocalOperation__InputTypeAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1275:2: rule__LocalOperation__InputTypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__LocalOperation__InputTypeAssignment_4_1_in_rule__LocalOperation__Group_4__1__Impl2596);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1285:1: rule__LocalOperation__Group_4__2 : rule__LocalOperation__Group_4__2__Impl ;
    public final void rule__LocalOperation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1289:1: ( rule__LocalOperation__Group_4__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1290:2: rule__LocalOperation__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__LocalOperation__Group_4__2__Impl_in_rule__LocalOperation__Group_4__22626);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1296:1: rule__LocalOperation__Group_4__2__Impl : ( ';' ) ;
    public final void rule__LocalOperation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1300:1: ( ( ';' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1301:1: ( ';' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1301:1: ( ';' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1302:1: ';'
            {
             before(grammarAccess.getLocalOperationAccess().getSemicolonKeyword_4_2()); 
            match(input,19,FOLLOW_19_in_rule__LocalOperation__Group_4__2__Impl2654); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1321:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1325:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1326:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__02691);
            rule__Service__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__02694);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1333:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1337:1: ( ( 'Service' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1338:1: ( 'Service' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1338:1: ( 'Service' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1339:1: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Service__Group__0__Impl2722); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1352:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1356:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1357:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__12753);
            rule__Service__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__12756);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1364:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1368:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1369:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1369:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1370:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1371:1: ( rule__Service__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1371:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl2783);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1381:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1385:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1386:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__22813);
            rule__Service__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__22816);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1393:1: rule__Service__Group__2__Impl : ( 'implements' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1397:1: ( ( 'implements' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1398:1: ( 'implements' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1398:1: ( 'implements' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1399:1: 'implements'
            {
             before(grammarAccess.getServiceAccess().getImplementsKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Service__Group__2__Impl2844); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1412:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1416:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1417:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__32875);
            rule__Service__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__32878);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1424:1: rule__Service__Group__3__Impl : ( ( rule__Service__InterfaceAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1428:1: ( ( ( rule__Service__InterfaceAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1429:1: ( ( rule__Service__InterfaceAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1429:1: ( ( rule__Service__InterfaceAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1430:1: ( rule__Service__InterfaceAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getInterfaceAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1431:1: ( rule__Service__InterfaceAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1431:2: rule__Service__InterfaceAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__InterfaceAssignment_3_in_rule__Service__Group__3__Impl2905);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1441:1: rule__Service__Group__4 : rule__Service__Group__4__Impl ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1445:1: ( rule__Service__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1446:2: rule__Service__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__42935);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1452:1: rule__Service__Group__4__Impl : ( ( rule__Service__ServiceInteractionAssignment_4 )* ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1456:1: ( ( ( rule__Service__ServiceInteractionAssignment_4 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1457:1: ( ( rule__Service__ServiceInteractionAssignment_4 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1457:1: ( ( rule__Service__ServiceInteractionAssignment_4 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1458:1: ( rule__Service__ServiceInteractionAssignment_4 )*
            {
             before(grammarAccess.getServiceAccess().getServiceInteractionAssignment_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1459:1: ( rule__Service__ServiceInteractionAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26||LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1459:2: rule__Service__ServiceInteractionAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Service__ServiceInteractionAssignment_4_in_rule__Service__Group__4__Impl2962);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1479:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1483:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1484:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03003);
            rule__Activity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03006);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1491:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1495:1: ( ( 'Activity' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1496:1: ( 'Activity' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1496:1: ( 'Activity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1497:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Activity__Group__0__Impl3034); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1510:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1514:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1515:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13065);
            rule__Activity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13068);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1522:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1526:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1527:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1527:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1528:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1529:1: ( rule__Activity__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1529:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3095);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1539:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1543:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1544:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23125);
            rule__Activity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23128);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1551:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__LaunchableAssignment_2 )? ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1555:1: ( ( ( rule__Activity__LaunchableAssignment_2 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1556:1: ( ( rule__Activity__LaunchableAssignment_2 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1556:1: ( ( rule__Activity__LaunchableAssignment_2 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1557:1: ( rule__Activity__LaunchableAssignment_2 )?
            {
             before(grammarAccess.getActivityAccess().getLaunchableAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1558:1: ( rule__Activity__LaunchableAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1558:2: rule__Activity__LaunchableAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Activity__LaunchableAssignment_2_in_rule__Activity__Group__2__Impl3155);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1568:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1572:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1573:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33186);
            rule__Activity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33189);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1580:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__ActionsAssignment_3 )* ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1584:1: ( ( ( rule__Activity__ActionsAssignment_3 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1585:1: ( ( rule__Activity__ActionsAssignment_3 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1585:1: ( ( rule__Activity__ActionsAssignment_3 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1586:1: ( rule__Activity__ActionsAssignment_3 )*
            {
             before(grammarAccess.getActivityAccess().getActionsAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1587:1: ( rule__Activity__ActionsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1587:2: rule__Activity__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Activity__ActionsAssignment_3_in_rule__Activity__Group__3__Impl3216);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1597:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1601:1: ( rule__Activity__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1602:2: rule__Activity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43247);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1608:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__InteractionsAssignment_4 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1612:1: ( ( ( rule__Activity__InteractionsAssignment_4 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1613:1: ( ( rule__Activity__InteractionsAssignment_4 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1613:1: ( ( rule__Activity__InteractionsAssignment_4 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1614:1: ( rule__Activity__InteractionsAssignment_4 )*
            {
             before(grammarAccess.getActivityAccess().getInteractionsAssignment_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1615:1: ( rule__Activity__InteractionsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24||LA16_0==26||(LA16_0>=29 && LA16_0<=30)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1615:2: rule__Activity__InteractionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Activity__InteractionsAssignment_4_in_rule__Activity__Group__4__Impl3274);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1635:1: rule__LocalAction__Group__0 : rule__LocalAction__Group__0__Impl rule__LocalAction__Group__1 ;
    public final void rule__LocalAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1639:1: ( rule__LocalAction__Group__0__Impl rule__LocalAction__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1640:2: rule__LocalAction__Group__0__Impl rule__LocalAction__Group__1
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__0__Impl_in_rule__LocalAction__Group__03315);
            rule__LocalAction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalAction__Group__1_in_rule__LocalAction__Group__03318);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1647:1: rule__LocalAction__Group__0__Impl : ( 'action' ) ;
    public final void rule__LocalAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1651:1: ( ( 'action' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1652:1: ( 'action' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1652:1: ( 'action' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1653:1: 'action'
            {
             before(grammarAccess.getLocalActionAccess().getActionKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__LocalAction__Group__0__Impl3346); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1666:1: rule__LocalAction__Group__1 : rule__LocalAction__Group__1__Impl rule__LocalAction__Group__2 ;
    public final void rule__LocalAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1670:1: ( rule__LocalAction__Group__1__Impl rule__LocalAction__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1671:2: rule__LocalAction__Group__1__Impl rule__LocalAction__Group__2
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__1__Impl_in_rule__LocalAction__Group__13377);
            rule__LocalAction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LocalAction__Group__2_in_rule__LocalAction__Group__13380);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1678:1: rule__LocalAction__Group__1__Impl : ( ( rule__LocalAction__ActionAssignment_1 ) ) ;
    public final void rule__LocalAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1682:1: ( ( ( rule__LocalAction__ActionAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1683:1: ( ( rule__LocalAction__ActionAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1683:1: ( ( rule__LocalAction__ActionAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1684:1: ( rule__LocalAction__ActionAssignment_1 )
            {
             before(grammarAccess.getLocalActionAccess().getActionAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1685:1: ( rule__LocalAction__ActionAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1685:2: rule__LocalAction__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__LocalAction__ActionAssignment_1_in_rule__LocalAction__Group__1__Impl3407);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1695:1: rule__LocalAction__Group__2 : rule__LocalAction__Group__2__Impl ;
    public final void rule__LocalAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1699:1: ( rule__LocalAction__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1700:2: rule__LocalAction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LocalAction__Group__2__Impl_in_rule__LocalAction__Group__23437);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1706:1: rule__LocalAction__Group__2__Impl : ( ( rule__LocalAction__ButtonAssignment_2 )? ) ;
    public final void rule__LocalAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1710:1: ( ( ( rule__LocalAction__ButtonAssignment_2 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1711:1: ( ( rule__LocalAction__ButtonAssignment_2 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1711:1: ( ( rule__LocalAction__ButtonAssignment_2 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1712:1: ( rule__LocalAction__ButtonAssignment_2 )?
            {
             before(grammarAccess.getLocalActionAccess().getButtonAssignment_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1713:1: ( rule__LocalAction__ButtonAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1713:2: rule__LocalAction__ButtonAssignment_2
                    {
                    pushFollow(FOLLOW_rule__LocalAction__ButtonAssignment_2_in_rule__LocalAction__Group__2__Impl3464);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1729:1: rule__InterAction__Group_0__0 : rule__InterAction__Group_0__0__Impl rule__InterAction__Group_0__1 ;
    public final void rule__InterAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1733:1: ( rule__InterAction__Group_0__0__Impl rule__InterAction__Group_0__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1734:2: rule__InterAction__Group_0__0__Impl rule__InterAction__Group_0__1
            {
            pushFollow(FOLLOW_rule__InterAction__Group_0__0__Impl_in_rule__InterAction__Group_0__03501);
            rule__InterAction__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InterAction__Group_0__1_in_rule__InterAction__Group_0__03504);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1741:1: rule__InterAction__Group_0__0__Impl : ( ruleExplicitInteraction ) ;
    public final void rule__InterAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1745:1: ( ( ruleExplicitInteraction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1746:1: ( ruleExplicitInteraction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1746:1: ( ruleExplicitInteraction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1747:1: ruleExplicitInteraction
            {
             before(grammarAccess.getInterActionAccess().getExplicitInteractionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExplicitInteraction_in_rule__InterAction__Group_0__0__Impl3531);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1758:1: rule__InterAction__Group_0__1 : rule__InterAction__Group_0__1__Impl ;
    public final void rule__InterAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1762:1: ( rule__InterAction__Group_0__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1763:2: rule__InterAction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__InterAction__Group_0__1__Impl_in_rule__InterAction__Group_0__13560);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1769:1: rule__InterAction__Group_0__1__Impl : ( ( rule__InterAction__ButtonAssignment_0_1 )? ) ;
    public final void rule__InterAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1773:1: ( ( ( rule__InterAction__ButtonAssignment_0_1 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1774:1: ( ( rule__InterAction__ButtonAssignment_0_1 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1774:1: ( ( rule__InterAction__ButtonAssignment_0_1 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1775:1: ( rule__InterAction__ButtonAssignment_0_1 )?
            {
             before(grammarAccess.getInterActionAccess().getButtonAssignment_0_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1776:1: ( rule__InterAction__ButtonAssignment_0_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1776:2: rule__InterAction__ButtonAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__InterAction__ButtonAssignment_0_1_in_rule__InterAction__Group_0__1__Impl3587);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1790:1: rule__InterAction__Group_1__0 : rule__InterAction__Group_1__0__Impl rule__InterAction__Group_1__1 ;
    public final void rule__InterAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1794:1: ( rule__InterAction__Group_1__0__Impl rule__InterAction__Group_1__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1795:2: rule__InterAction__Group_1__0__Impl rule__InterAction__Group_1__1
            {
            pushFollow(FOLLOW_rule__InterAction__Group_1__0__Impl_in_rule__InterAction__Group_1__03622);
            rule__InterAction__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__InterAction__Group_1__1_in_rule__InterAction__Group_1__03625);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1802:1: rule__InterAction__Group_1__0__Impl : ( ruleActionOnlyInteraction ) ;
    public final void rule__InterAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1806:1: ( ( ruleActionOnlyInteraction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1807:1: ( ruleActionOnlyInteraction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1807:1: ( ruleActionOnlyInteraction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1808:1: ruleActionOnlyInteraction
            {
             before(grammarAccess.getInterActionAccess().getActionOnlyInteractionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleActionOnlyInteraction_in_rule__InterAction__Group_1__0__Impl3652);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1819:1: rule__InterAction__Group_1__1 : rule__InterAction__Group_1__1__Impl ;
    public final void rule__InterAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1823:1: ( rule__InterAction__Group_1__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1824:2: rule__InterAction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InterAction__Group_1__1__Impl_in_rule__InterAction__Group_1__13681);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1830:1: rule__InterAction__Group_1__1__Impl : ( ( rule__InterAction__ButtonAssignment_1_1 )? ) ;
    public final void rule__InterAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1834:1: ( ( ( rule__InterAction__ButtonAssignment_1_1 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1835:1: ( ( rule__InterAction__ButtonAssignment_1_1 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1835:1: ( ( rule__InterAction__ButtonAssignment_1_1 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1836:1: ( rule__InterAction__ButtonAssignment_1_1 )?
            {
             before(grammarAccess.getInterActionAccess().getButtonAssignment_1_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1837:1: ( rule__InterAction__ButtonAssignment_1_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1837:2: rule__InterAction__ButtonAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__InterAction__ButtonAssignment_1_1_in_rule__InterAction__Group_1__1__Impl3708);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1851:1: rule__ExplicitInteractionActivity__Group__0 : rule__ExplicitInteractionActivity__Group__0__Impl rule__ExplicitInteractionActivity__Group__1 ;
    public final void rule__ExplicitInteractionActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1855:1: ( rule__ExplicitInteractionActivity__Group__0__Impl rule__ExplicitInteractionActivity__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1856:2: rule__ExplicitInteractionActivity__Group__0__Impl rule__ExplicitInteractionActivity__Group__1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__0__Impl_in_rule__ExplicitInteractionActivity__Group__03743);
            rule__ExplicitInteractionActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__1_in_rule__ExplicitInteractionActivity__Group__03746);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1863:1: rule__ExplicitInteractionActivity__Group__0__Impl : ( 'callActivity' ) ;
    public final void rule__ExplicitInteractionActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1867:1: ( ( 'callActivity' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1868:1: ( 'callActivity' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1868:1: ( 'callActivity' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1869:1: 'callActivity'
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getCallActivityKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ExplicitInteractionActivity__Group__0__Impl3774); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1882:1: rule__ExplicitInteractionActivity__Group__1 : rule__ExplicitInteractionActivity__Group__1__Impl rule__ExplicitInteractionActivity__Group__2 ;
    public final void rule__ExplicitInteractionActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1886:1: ( rule__ExplicitInteractionActivity__Group__1__Impl rule__ExplicitInteractionActivity__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1887:2: rule__ExplicitInteractionActivity__Group__1__Impl rule__ExplicitInteractionActivity__Group__2
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__1__Impl_in_rule__ExplicitInteractionActivity__Group__13805);
            rule__ExplicitInteractionActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__2_in_rule__ExplicitInteractionActivity__Group__13808);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1894:1: rule__ExplicitInteractionActivity__Group__1__Impl : ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) ) ;
    public final void rule__ExplicitInteractionActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1898:1: ( ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1899:1: ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1899:1: ( ( rule__ExplicitInteractionActivity__DestAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1900:1: ( rule__ExplicitInteractionActivity__DestAssignment_1 )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getDestAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1901:1: ( rule__ExplicitInteractionActivity__DestAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1901:2: rule__ExplicitInteractionActivity__DestAssignment_1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__DestAssignment_1_in_rule__ExplicitInteractionActivity__Group__1__Impl3835);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1911:1: rule__ExplicitInteractionActivity__Group__2 : rule__ExplicitInteractionActivity__Group__2__Impl ;
    public final void rule__ExplicitInteractionActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1915:1: ( rule__ExplicitInteractionActivity__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1916:2: rule__ExplicitInteractionActivity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group__2__Impl_in_rule__ExplicitInteractionActivity__Group__23865);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1922:1: rule__ExplicitInteractionActivity__Group__2__Impl : ( ( rule__ExplicitInteractionActivity__Group_2__0 )? ) ;
    public final void rule__ExplicitInteractionActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1926:1: ( ( ( rule__ExplicitInteractionActivity__Group_2__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1927:1: ( ( rule__ExplicitInteractionActivity__Group_2__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1927:1: ( ( rule__ExplicitInteractionActivity__Group_2__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1928:1: ( rule__ExplicitInteractionActivity__Group_2__0 )?
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getGroup_2()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1929:1: ( rule__ExplicitInteractionActivity__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1929:2: rule__ExplicitInteractionActivity__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__0_in_rule__ExplicitInteractionActivity__Group__2__Impl3892);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1945:1: rule__ExplicitInteractionActivity__Group_2__0 : rule__ExplicitInteractionActivity__Group_2__0__Impl rule__ExplicitInteractionActivity__Group_2__1 ;
    public final void rule__ExplicitInteractionActivity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1949:1: ( rule__ExplicitInteractionActivity__Group_2__0__Impl rule__ExplicitInteractionActivity__Group_2__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1950:2: rule__ExplicitInteractionActivity__Group_2__0__Impl rule__ExplicitInteractionActivity__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__0__Impl_in_rule__ExplicitInteractionActivity__Group_2__03929);
            rule__ExplicitInteractionActivity__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__1_in_rule__ExplicitInteractionActivity__Group_2__03932);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1957:1: rule__ExplicitInteractionActivity__Group_2__0__Impl : ( 'forActiom' ) ;
    public final void rule__ExplicitInteractionActivity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1961:1: ( ( 'forActiom' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1962:1: ( 'forActiom' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1962:1: ( 'forActiom' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1963:1: 'forActiom'
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getForActiomKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__ExplicitInteractionActivity__Group_2__0__Impl3960); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1976:1: rule__ExplicitInteractionActivity__Group_2__1 : rule__ExplicitInteractionActivity__Group_2__1__Impl ;
    public final void rule__ExplicitInteractionActivity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1980:1: ( rule__ExplicitInteractionActivity__Group_2__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1981:2: rule__ExplicitInteractionActivity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__Group_2__1__Impl_in_rule__ExplicitInteractionActivity__Group_2__13991);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1987:1: rule__ExplicitInteractionActivity__Group_2__1__Impl : ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) ) ;
    public final void rule__ExplicitInteractionActivity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1991:1: ( ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1992:1: ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1992:1: ( ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1993:1: ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getActionAssignment_2_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1994:1: ( rule__ExplicitInteractionActivity__ActionAssignment_2_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:1994:2: rule__ExplicitInteractionActivity__ActionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExplicitInteractionActivity__ActionAssignment_2_1_in_rule__ExplicitInteractionActivity__Group_2__1__Impl4018);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2008:1: rule__UseService__Group__0 : rule__UseService__Group__0__Impl rule__UseService__Group__1 ;
    public final void rule__UseService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2012:1: ( rule__UseService__Group__0__Impl rule__UseService__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2013:2: rule__UseService__Group__0__Impl rule__UseService__Group__1
            {
            pushFollow(FOLLOW_rule__UseService__Group__0__Impl_in_rule__UseService__Group__04052);
            rule__UseService__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group__1_in_rule__UseService__Group__04055);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2020:1: rule__UseService__Group__0__Impl : ( 'useService' ) ;
    public final void rule__UseService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2024:1: ( ( 'useService' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2025:1: ( 'useService' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2025:1: ( 'useService' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2026:1: 'useService'
            {
             before(grammarAccess.getUseServiceAccess().getUseServiceKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__UseService__Group__0__Impl4083); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2039:1: rule__UseService__Group__1 : rule__UseService__Group__1__Impl rule__UseService__Group__2 ;
    public final void rule__UseService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2043:1: ( rule__UseService__Group__1__Impl rule__UseService__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2044:2: rule__UseService__Group__1__Impl rule__UseService__Group__2
            {
            pushFollow(FOLLOW_rule__UseService__Group__1__Impl_in_rule__UseService__Group__14114);
            rule__UseService__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group__2_in_rule__UseService__Group__14117);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2051:1: rule__UseService__Group__1__Impl : ( ( rule__UseService__DestAssignment_1 ) ) ;
    public final void rule__UseService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2055:1: ( ( ( rule__UseService__DestAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2056:1: ( ( rule__UseService__DestAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2056:1: ( ( rule__UseService__DestAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2057:1: ( rule__UseService__DestAssignment_1 )
            {
             before(grammarAccess.getUseServiceAccess().getDestAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2058:1: ( rule__UseService__DestAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2058:2: rule__UseService__DestAssignment_1
            {
            pushFollow(FOLLOW_rule__UseService__DestAssignment_1_in_rule__UseService__Group__1__Impl4144);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2068:1: rule__UseService__Group__2 : rule__UseService__Group__2__Impl rule__UseService__Group__3 ;
    public final void rule__UseService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2072:1: ( rule__UseService__Group__2__Impl rule__UseService__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2073:2: rule__UseService__Group__2__Impl rule__UseService__Group__3
            {
            pushFollow(FOLLOW_rule__UseService__Group__2__Impl_in_rule__UseService__Group__24174);
            rule__UseService__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group__3_in_rule__UseService__Group__24177);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2080:1: rule__UseService__Group__2__Impl : ( 'forOp' ) ;
    public final void rule__UseService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2084:1: ( ( 'forOp' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2085:1: ( 'forOp' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2085:1: ( 'forOp' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2086:1: 'forOp'
            {
             before(grammarAccess.getUseServiceAccess().getForOpKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__UseService__Group__2__Impl4205); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2099:1: rule__UseService__Group__3 : rule__UseService__Group__3__Impl rule__UseService__Group__4 ;
    public final void rule__UseService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2103:1: ( rule__UseService__Group__3__Impl rule__UseService__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2104:2: rule__UseService__Group__3__Impl rule__UseService__Group__4
            {
            pushFollow(FOLLOW_rule__UseService__Group__3__Impl_in_rule__UseService__Group__34236);
            rule__UseService__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group__4_in_rule__UseService__Group__34239);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2111:1: rule__UseService__Group__3__Impl : ( ( rule__UseService__OperationAssignment_3 ) ) ;
    public final void rule__UseService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2115:1: ( ( ( rule__UseService__OperationAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2116:1: ( ( rule__UseService__OperationAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2116:1: ( ( rule__UseService__OperationAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2117:1: ( rule__UseService__OperationAssignment_3 )
            {
             before(grammarAccess.getUseServiceAccess().getOperationAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2118:1: ( rule__UseService__OperationAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2118:2: rule__UseService__OperationAssignment_3
            {
            pushFollow(FOLLOW_rule__UseService__OperationAssignment_3_in_rule__UseService__Group__3__Impl4266);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2128:1: rule__UseService__Group__4 : rule__UseService__Group__4__Impl ;
    public final void rule__UseService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2132:1: ( rule__UseService__Group__4__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2133:2: rule__UseService__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UseService__Group__4__Impl_in_rule__UseService__Group__44296);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2139:1: rule__UseService__Group__4__Impl : ( ( rule__UseService__Group_4__0 )* ) ;
    public final void rule__UseService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2143:1: ( ( ( rule__UseService__Group_4__0 )* ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2144:1: ( ( rule__UseService__Group_4__0 )* )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2144:1: ( ( rule__UseService__Group_4__0 )* )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2145:1: ( rule__UseService__Group_4__0 )*
            {
             before(grammarAccess.getUseServiceAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2146:1: ( rule__UseService__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2146:2: rule__UseService__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__UseService__Group_4__0_in_rule__UseService__Group__4__Impl4323);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2166:1: rule__UseService__Group_4__0 : rule__UseService__Group_4__0__Impl rule__UseService__Group_4__1 ;
    public final void rule__UseService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2170:1: ( rule__UseService__Group_4__0__Impl rule__UseService__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2171:2: rule__UseService__Group_4__0__Impl rule__UseService__Group_4__1
            {
            pushFollow(FOLLOW_rule__UseService__Group_4__0__Impl_in_rule__UseService__Group_4__04364);
            rule__UseService__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UseService__Group_4__1_in_rule__UseService__Group_4__04367);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2178:1: rule__UseService__Group_4__0__Impl : ( 'arg=' ) ;
    public final void rule__UseService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2182:1: ( ( 'arg=' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2183:1: ( 'arg=' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2183:1: ( 'arg=' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2184:1: 'arg='
            {
             before(grammarAccess.getUseServiceAccess().getArgKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__UseService__Group_4__0__Impl4395); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2197:1: rule__UseService__Group_4__1 : rule__UseService__Group_4__1__Impl ;
    public final void rule__UseService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2201:1: ( rule__UseService__Group_4__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2202:2: rule__UseService__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__UseService__Group_4__1__Impl_in_rule__UseService__Group_4__14426);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2208:1: rule__UseService__Group_4__1__Impl : ( ( rule__UseService__ArgAssignment_4_1 ) ) ;
    public final void rule__UseService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2212:1: ( ( ( rule__UseService__ArgAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2213:1: ( ( rule__UseService__ArgAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2213:1: ( ( rule__UseService__ArgAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2214:1: ( rule__UseService__ArgAssignment_4_1 )
            {
             before(grammarAccess.getUseServiceAccess().getArgAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2215:1: ( rule__UseService__ArgAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2215:2: rule__UseService__ArgAssignment_4_1
            {
            pushFollow(FOLLOW_rule__UseService__ArgAssignment_4_1_in_rule__UseService__Group_4__1__Impl4453);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2229:1: rule__Launchservice__Group__0 : rule__Launchservice__Group__0__Impl rule__Launchservice__Group__1 ;
    public final void rule__Launchservice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2233:1: ( rule__Launchservice__Group__0__Impl rule__Launchservice__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2234:2: rule__Launchservice__Group__0__Impl rule__Launchservice__Group__1
            {
            pushFollow(FOLLOW_rule__Launchservice__Group__0__Impl_in_rule__Launchservice__Group__04487);
            rule__Launchservice__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Launchservice__Group__1_in_rule__Launchservice__Group__04490);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2241:1: rule__Launchservice__Group__0__Impl : ( 'launchService' ) ;
    public final void rule__Launchservice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2245:1: ( ( 'launchService' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2246:1: ( 'launchService' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2246:1: ( 'launchService' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2247:1: 'launchService'
            {
             before(grammarAccess.getLaunchserviceAccess().getLaunchServiceKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Launchservice__Group__0__Impl4518); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2260:1: rule__Launchservice__Group__1 : rule__Launchservice__Group__1__Impl ;
    public final void rule__Launchservice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2264:1: ( rule__Launchservice__Group__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2265:2: rule__Launchservice__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Launchservice__Group__1__Impl_in_rule__Launchservice__Group__14549);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2271:1: rule__Launchservice__Group__1__Impl : ( ( rule__Launchservice__DestAssignment_1 ) ) ;
    public final void rule__Launchservice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2275:1: ( ( ( rule__Launchservice__DestAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2276:1: ( ( rule__Launchservice__DestAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2276:1: ( ( rule__Launchservice__DestAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2277:1: ( rule__Launchservice__DestAssignment_1 )
            {
             before(grammarAccess.getLaunchserviceAccess().getDestAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2278:1: ( rule__Launchservice__DestAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2278:2: rule__Launchservice__DestAssignment_1
            {
            pushFollow(FOLLOW_rule__Launchservice__DestAssignment_1_in_rule__Launchservice__Group__1__Impl4576);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2292:1: rule__ActionOnlyInteraction__Group__0 : rule__ActionOnlyInteraction__Group__0__Impl rule__ActionOnlyInteraction__Group__1 ;
    public final void rule__ActionOnlyInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2296:1: ( rule__ActionOnlyInteraction__Group__0__Impl rule__ActionOnlyInteraction__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2297:2: rule__ActionOnlyInteraction__Group__0__Impl rule__ActionOnlyInteraction__Group__1
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__0__Impl_in_rule__ActionOnlyInteraction__Group__04610);
            rule__ActionOnlyInteraction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__1_in_rule__ActionOnlyInteraction__Group__04613);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2304:1: rule__ActionOnlyInteraction__Group__0__Impl : ( 'execAction' ) ;
    public final void rule__ActionOnlyInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2308:1: ( ( 'execAction' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2309:1: ( 'execAction' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2309:1: ( 'execAction' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2310:1: 'execAction'
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getExecActionKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ActionOnlyInteraction__Group__0__Impl4641); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2323:1: rule__ActionOnlyInteraction__Group__1 : rule__ActionOnlyInteraction__Group__1__Impl ;
    public final void rule__ActionOnlyInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2327:1: ( rule__ActionOnlyInteraction__Group__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2328:2: rule__ActionOnlyInteraction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__Group__1__Impl_in_rule__ActionOnlyInteraction__Group__14672);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2334:1: rule__ActionOnlyInteraction__Group__1__Impl : ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) ) ;
    public final void rule__ActionOnlyInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2338:1: ( ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2339:1: ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2339:1: ( ( rule__ActionOnlyInteraction__ActionAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2340:1: ( rule__ActionOnlyInteraction__ActionAssignment_1 )
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getActionAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2341:1: ( rule__ActionOnlyInteraction__ActionAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2341:2: rule__ActionOnlyInteraction__ActionAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionOnlyInteraction__ActionAssignment_1_in_rule__ActionOnlyInteraction__Group__1__Impl4699);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2355:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2359:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2360:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04733);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04736);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2367:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2371:1: ( ( 'action' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2372:1: ( 'action' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2372:1: ( 'action' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2373:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Action__Group__0__Impl4764); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2386:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2390:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2391:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14795);
            rule__Action__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14798);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2398:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2402:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2403:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2403:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2404:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2405:1: ( rule__Action__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2405:2: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl4825);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2415:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2419:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2420:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24855);
            rule__Action__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24858);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2427:1: rule__Action__Group__2__Impl : ( 'data' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2431:1: ( ( 'data' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2432:1: ( 'data' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2432:1: ( 'data' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2433:1: 'data'
            {
             before(grammarAccess.getActionAccess().getDataKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Action__Group__2__Impl4886); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2446:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2450:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2451:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34917);
            rule__Action__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34920);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2458:1: rule__Action__Group__3__Impl : ( ( rule__Action__DataAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2462:1: ( ( ( rule__Action__DataAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2463:1: ( ( rule__Action__DataAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2463:1: ( ( rule__Action__DataAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2464:1: ( rule__Action__DataAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getDataAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2465:1: ( rule__Action__DataAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2465:2: rule__Action__DataAssignment_3
            {
            pushFollow(FOLLOW_rule__Action__DataAssignment_3_in_rule__Action__Group__3__Impl4947);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2475:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2479:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2480:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__44977);
            rule__Action__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__5_in_rule__Action__Group__44980);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2487:1: rule__Action__Group__4__Impl : ( 'category' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2491:1: ( ( 'category' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2492:1: ( 'category' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2492:1: ( 'category' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2493:1: 'category'
            {
             before(grammarAccess.getActionAccess().getCategoryKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Action__Group__4__Impl5008); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2506:1: rule__Action__Group__5 : rule__Action__Group__5__Impl ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2510:1: ( rule__Action__Group__5__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2511:2: rule__Action__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__55039);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2517:1: rule__Action__Group__5__Impl : ( ( rule__Action__CategoryAssignment_5 ) ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2521:1: ( ( ( rule__Action__CategoryAssignment_5 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2522:1: ( ( rule__Action__CategoryAssignment_5 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2522:1: ( ( rule__Action__CategoryAssignment_5 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2523:1: ( rule__Action__CategoryAssignment_5 )
            {
             before(grammarAccess.getActionAccess().getCategoryAssignment_5()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2524:1: ( rule__Action__CategoryAssignment_5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2524:2: rule__Action__CategoryAssignment_5
            {
            pushFollow(FOLLOW_rule__Action__CategoryAssignment_5_in_rule__Action__Group__5__Impl5066);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2546:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2550:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2551:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__05108);
            rule__Data__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__1_in_rule__Data__Group__05111);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2558:1: rule__Data__Group__0__Impl : ( 'data' ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2562:1: ( ( 'data' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2563:1: ( 'data' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2563:1: ( 'data' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2564:1: 'data'
            {
             before(grammarAccess.getDataAccess().getDataKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Data__Group__0__Impl5139); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2577:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2581:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2582:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__15170);
            rule__Data__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__2_in_rule__Data__Group__15173);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2589:1: rule__Data__Group__1__Impl : ( ( rule__Data__NameAssignment_1 ) ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2593:1: ( ( ( rule__Data__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2594:1: ( ( rule__Data__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2594:1: ( ( rule__Data__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2595:1: ( rule__Data__NameAssignment_1 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2596:1: ( rule__Data__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2596:2: rule__Data__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Data__NameAssignment_1_in_rule__Data__Group__1__Impl5200);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2606:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2610:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2611:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_rule__Data__Group__2__Impl_in_rule__Data__Group__25230);
            rule__Data__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__3_in_rule__Data__Group__25233);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2618:1: rule__Data__Group__2__Impl : ( 'scheme' ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2622:1: ( ( 'scheme' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2623:1: ( 'scheme' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2623:1: ( 'scheme' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2624:1: 'scheme'
            {
             before(grammarAccess.getDataAccess().getSchemeKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Data__Group__2__Impl5261); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2637:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2641:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2642:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_rule__Data__Group__3__Impl_in_rule__Data__Group__35292);
            rule__Data__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__4_in_rule__Data__Group__35295);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2649:1: rule__Data__Group__3__Impl : ( ( rule__Data__SchemeAssignment_3 ) ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2653:1: ( ( ( rule__Data__SchemeAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2654:1: ( ( rule__Data__SchemeAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2654:1: ( ( rule__Data__SchemeAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2655:1: ( rule__Data__SchemeAssignment_3 )
            {
             before(grammarAccess.getDataAccess().getSchemeAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2656:1: ( rule__Data__SchemeAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2656:2: rule__Data__SchemeAssignment_3
            {
            pushFollow(FOLLOW_rule__Data__SchemeAssignment_3_in_rule__Data__Group__3__Impl5322);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2666:1: rule__Data__Group__4 : rule__Data__Group__4__Impl rule__Data__Group__5 ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2670:1: ( rule__Data__Group__4__Impl rule__Data__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2671:2: rule__Data__Group__4__Impl rule__Data__Group__5
            {
            pushFollow(FOLLOW_rule__Data__Group__4__Impl_in_rule__Data__Group__45352);
            rule__Data__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__5_in_rule__Data__Group__45355);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2678:1: rule__Data__Group__4__Impl : ( ( rule__Data__Group_4__0 )? ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2682:1: ( ( ( rule__Data__Group_4__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2683:1: ( ( rule__Data__Group_4__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2683:1: ( ( rule__Data__Group_4__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2684:1: ( rule__Data__Group_4__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2685:1: ( rule__Data__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2685:2: rule__Data__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_4__0_in_rule__Data__Group__4__Impl5382);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2695:1: rule__Data__Group__5 : rule__Data__Group__5__Impl rule__Data__Group__6 ;
    public final void rule__Data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2699:1: ( rule__Data__Group__5__Impl rule__Data__Group__6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2700:2: rule__Data__Group__5__Impl rule__Data__Group__6
            {
            pushFollow(FOLLOW_rule__Data__Group__5__Impl_in_rule__Data__Group__55413);
            rule__Data__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group__6_in_rule__Data__Group__55416);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2707:1: rule__Data__Group__5__Impl : ( ( rule__Data__Group_5__0 )? ) ;
    public final void rule__Data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2711:1: ( ( ( rule__Data__Group_5__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2712:1: ( ( rule__Data__Group_5__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2712:1: ( ( rule__Data__Group_5__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2713:1: ( rule__Data__Group_5__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_5()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2714:1: ( rule__Data__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2714:2: rule__Data__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_5__0_in_rule__Data__Group__5__Impl5443);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2724:1: rule__Data__Group__6 : rule__Data__Group__6__Impl ;
    public final void rule__Data__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2728:1: ( rule__Data__Group__6__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2729:2: rule__Data__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group__6__Impl_in_rule__Data__Group__65474);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2735:1: rule__Data__Group__6__Impl : ( ( rule__Data__Group_6__0 )? ) ;
    public final void rule__Data__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2739:1: ( ( ( rule__Data__Group_6__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2740:1: ( ( rule__Data__Group_6__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2740:1: ( ( rule__Data__Group_6__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2741:1: ( rule__Data__Group_6__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_6()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2742:1: ( rule__Data__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2742:2: rule__Data__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Data__Group_6__0_in_rule__Data__Group__6__Impl5501);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2766:1: rule__Data__Group_4__0 : rule__Data__Group_4__0__Impl rule__Data__Group_4__1 ;
    public final void rule__Data__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2770:1: ( rule__Data__Group_4__0__Impl rule__Data__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2771:2: rule__Data__Group_4__0__Impl rule__Data__Group_4__1
            {
            pushFollow(FOLLOW_rule__Data__Group_4__0__Impl_in_rule__Data__Group_4__05546);
            rule__Data__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group_4__1_in_rule__Data__Group_4__05549);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2778:1: rule__Data__Group_4__0__Impl : ( 'host' ) ;
    public final void rule__Data__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2782:1: ( ( 'host' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2783:1: ( 'host' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2783:1: ( 'host' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2784:1: 'host'
            {
             before(grammarAccess.getDataAccess().getHostKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__Data__Group_4__0__Impl5577); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2797:1: rule__Data__Group_4__1 : rule__Data__Group_4__1__Impl ;
    public final void rule__Data__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2801:1: ( rule__Data__Group_4__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2802:2: rule__Data__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_4__1__Impl_in_rule__Data__Group_4__15608);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2808:1: rule__Data__Group_4__1__Impl : ( ( rule__Data__HostAssignment_4_1 ) ) ;
    public final void rule__Data__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2812:1: ( ( ( rule__Data__HostAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2813:1: ( ( rule__Data__HostAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2813:1: ( ( rule__Data__HostAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2814:1: ( rule__Data__HostAssignment_4_1 )
            {
             before(grammarAccess.getDataAccess().getHostAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2815:1: ( rule__Data__HostAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2815:2: rule__Data__HostAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Data__HostAssignment_4_1_in_rule__Data__Group_4__1__Impl5635);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2829:1: rule__Data__Group_5__0 : rule__Data__Group_5__0__Impl rule__Data__Group_5__1 ;
    public final void rule__Data__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2833:1: ( rule__Data__Group_5__0__Impl rule__Data__Group_5__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2834:2: rule__Data__Group_5__0__Impl rule__Data__Group_5__1
            {
            pushFollow(FOLLOW_rule__Data__Group_5__0__Impl_in_rule__Data__Group_5__05669);
            rule__Data__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group_5__1_in_rule__Data__Group_5__05672);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2841:1: rule__Data__Group_5__0__Impl : ( 'port' ) ;
    public final void rule__Data__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2845:1: ( ( 'port' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2846:1: ( 'port' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2846:1: ( 'port' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2847:1: 'port'
            {
             before(grammarAccess.getDataAccess().getPortKeyword_5_0()); 
            match(input,35,FOLLOW_35_in_rule__Data__Group_5__0__Impl5700); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2860:1: rule__Data__Group_5__1 : rule__Data__Group_5__1__Impl ;
    public final void rule__Data__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2864:1: ( rule__Data__Group_5__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2865:2: rule__Data__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_5__1__Impl_in_rule__Data__Group_5__15731);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2871:1: rule__Data__Group_5__1__Impl : ( ( rule__Data__PortAssignment_5_1 ) ) ;
    public final void rule__Data__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2875:1: ( ( ( rule__Data__PortAssignment_5_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2876:1: ( ( rule__Data__PortAssignment_5_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2876:1: ( ( rule__Data__PortAssignment_5_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2877:1: ( rule__Data__PortAssignment_5_1 )
            {
             before(grammarAccess.getDataAccess().getPortAssignment_5_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2878:1: ( rule__Data__PortAssignment_5_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2878:2: rule__Data__PortAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Data__PortAssignment_5_1_in_rule__Data__Group_5__1__Impl5758);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2892:1: rule__Data__Group_6__0 : rule__Data__Group_6__0__Impl rule__Data__Group_6__1 ;
    public final void rule__Data__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2896:1: ( rule__Data__Group_6__0__Impl rule__Data__Group_6__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2897:2: rule__Data__Group_6__0__Impl rule__Data__Group_6__1
            {
            pushFollow(FOLLOW_rule__Data__Group_6__0__Impl_in_rule__Data__Group_6__05792);
            rule__Data__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Data__Group_6__1_in_rule__Data__Group_6__05795);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2904:1: rule__Data__Group_6__0__Impl : ( 'path' ) ;
    public final void rule__Data__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2908:1: ( ( 'path' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2909:1: ( 'path' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2909:1: ( 'path' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2910:1: 'path'
            {
             before(grammarAccess.getDataAccess().getPathKeyword_6_0()); 
            match(input,36,FOLLOW_36_in_rule__Data__Group_6__0__Impl5823); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2923:1: rule__Data__Group_6__1 : rule__Data__Group_6__1__Impl ;
    public final void rule__Data__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2927:1: ( rule__Data__Group_6__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2928:2: rule__Data__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Data__Group_6__1__Impl_in_rule__Data__Group_6__15854);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2934:1: rule__Data__Group_6__1__Impl : ( ( rule__Data__PathAssignment_6_1 ) ) ;
    public final void rule__Data__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2938:1: ( ( ( rule__Data__PathAssignment_6_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2939:1: ( ( rule__Data__PathAssignment_6_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2939:1: ( ( rule__Data__PathAssignment_6_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2940:1: ( rule__Data__PathAssignment_6_1 )
            {
             before(grammarAccess.getDataAccess().getPathAssignment_6_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2941:1: ( rule__Data__PathAssignment_6_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2941:2: rule__Data__PathAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Data__PathAssignment_6_1_in_rule__Data__Group_6__1__Impl5881);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2955:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2959:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2960:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__05915);
            rule__Application__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__05918);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2967:1: rule__Application__Group__0__Impl : ( 'Application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2971:1: ( ( 'Application' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2972:1: ( 'Application' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2972:1: ( 'Application' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2973:1: 'Application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Application__Group__0__Impl5946); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2986:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2990:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2991:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__15977);
            rule__Application__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__15980);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:2998:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3002:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3003:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3003:1: ( ( rule__Application__NameAssignment_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3004:1: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3005:1: ( rule__Application__NameAssignment_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3005:2: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl6007);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3015:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3019:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3020:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__26037);
            rule__Application__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__26040);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3027:1: rule__Application__Group__2__Impl : ( 'avd' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3031:1: ( ( 'avd' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3032:1: ( 'avd' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3032:1: ( 'avd' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3033:1: 'avd'
            {
             before(grammarAccess.getApplicationAccess().getAvdKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Application__Group__2__Impl6068); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3046:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3050:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3051:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__36099);
            rule__Application__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__36102);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3058:1: rule__Application__Group__3__Impl : ( ( rule__Application__AvdAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3062:1: ( ( ( rule__Application__AvdAssignment_3 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3063:1: ( ( rule__Application__AvdAssignment_3 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3063:1: ( ( rule__Application__AvdAssignment_3 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3064:1: ( rule__Application__AvdAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getAvdAssignment_3()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3065:1: ( rule__Application__AvdAssignment_3 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3065:2: rule__Application__AvdAssignment_3
            {
            pushFollow(FOLLOW_rule__Application__AvdAssignment_3_in_rule__Application__Group__3__Impl6129);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3075:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3079:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3080:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__46159);
            rule__Application__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__46162);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3087:1: rule__Application__Group__4__Impl : ( ( rule__Application__Group_4__0 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3091:1: ( ( ( rule__Application__Group_4__0 )? ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3092:1: ( ( rule__Application__Group_4__0 )? )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3092:1: ( ( rule__Application__Group_4__0 )? )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3093:1: ( rule__Application__Group_4__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_4()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3094:1: ( rule__Application__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3094:2: rule__Application__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl6189);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3104:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3108:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3109:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__56220);
            rule__Application__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__6_in_rule__Application__Group__56223);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3116:1: rule__Application__Group__5__Impl : ( 'package' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3120:1: ( ( 'package' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3121:1: ( 'package' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3121:1: ( 'package' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3122:1: 'package'
            {
             before(grammarAccess.getApplicationAccess().getPackageKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__Application__Group__5__Impl6251); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3135:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3139:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3140:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__66282);
            rule__Application__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__7_in_rule__Application__Group__66285);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3147:1: rule__Application__Group__6__Impl : ( ( rule__Application__PackageNameAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3151:1: ( ( ( rule__Application__PackageNameAssignment_6 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3152:1: ( ( rule__Application__PackageNameAssignment_6 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3152:1: ( ( rule__Application__PackageNameAssignment_6 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3153:1: ( rule__Application__PackageNameAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getPackageNameAssignment_6()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3154:1: ( rule__Application__PackageNameAssignment_6 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3154:2: rule__Application__PackageNameAssignment_6
            {
            pushFollow(FOLLOW_rule__Application__PackageNameAssignment_6_in_rule__Application__Group__6__Impl6312);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3164:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3168:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3169:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__76342);
            rule__Application__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__8_in_rule__Application__Group__76345);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3176:1: rule__Application__Group__7__Impl : ( 'entryActiviy' ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3180:1: ( ( 'entryActiviy' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3181:1: ( 'entryActiviy' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3181:1: ( 'entryActiviy' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3182:1: 'entryActiviy'
            {
             before(grammarAccess.getApplicationAccess().getEntryActiviyKeyword_7()); 
            match(input,40,FOLLOW_40_in_rule__Application__Group__7__Impl6373); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3195:1: rule__Application__Group__8 : rule__Application__Group__8__Impl rule__Application__Group__9 ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3199:1: ( rule__Application__Group__8__Impl rule__Application__Group__9 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3200:2: rule__Application__Group__8__Impl rule__Application__Group__9
            {
            pushFollow(FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__86404);
            rule__Application__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__9_in_rule__Application__Group__86407);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3207:1: rule__Application__Group__8__Impl : ( ( rule__Application__MainActivityAssignment_8 ) ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3211:1: ( ( ( rule__Application__MainActivityAssignment_8 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3212:1: ( ( rule__Application__MainActivityAssignment_8 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3212:1: ( ( rule__Application__MainActivityAssignment_8 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3213:1: ( rule__Application__MainActivityAssignment_8 )
            {
             before(grammarAccess.getApplicationAccess().getMainActivityAssignment_8()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3214:1: ( rule__Application__MainActivityAssignment_8 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3214:2: rule__Application__MainActivityAssignment_8
            {
            pushFollow(FOLLOW_rule__Application__MainActivityAssignment_8_in_rule__Application__Group__8__Impl6434);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3224:1: rule__Application__Group__9 : rule__Application__Group__9__Impl rule__Application__Group__10 ;
    public final void rule__Application__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3228:1: ( rule__Application__Group__9__Impl rule__Application__Group__10 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3229:2: rule__Application__Group__9__Impl rule__Application__Group__10
            {
            pushFollow(FOLLOW_rule__Application__Group__9__Impl_in_rule__Application__Group__96464);
            rule__Application__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__10_in_rule__Application__Group__96467);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3236:1: rule__Application__Group__9__Impl : ( 'target' ) ;
    public final void rule__Application__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3240:1: ( ( 'target' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3241:1: ( 'target' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3241:1: ( 'target' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3242:1: 'target'
            {
             before(grammarAccess.getApplicationAccess().getTargetKeyword_9()); 
            match(input,41,FOLLOW_41_in_rule__Application__Group__9__Impl6495); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3255:1: rule__Application__Group__10 : rule__Application__Group__10__Impl rule__Application__Group__11 ;
    public final void rule__Application__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3259:1: ( rule__Application__Group__10__Impl rule__Application__Group__11 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3260:2: rule__Application__Group__10__Impl rule__Application__Group__11
            {
            pushFollow(FOLLOW_rule__Application__Group__10__Impl_in_rule__Application__Group__106526);
            rule__Application__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__11_in_rule__Application__Group__106529);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3267:1: rule__Application__Group__10__Impl : ( ( rule__Application__TargetAssignment_10 ) ) ;
    public final void rule__Application__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3271:1: ( ( ( rule__Application__TargetAssignment_10 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3272:1: ( ( rule__Application__TargetAssignment_10 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3272:1: ( ( rule__Application__TargetAssignment_10 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3273:1: ( rule__Application__TargetAssignment_10 )
            {
             before(grammarAccess.getApplicationAccess().getTargetAssignment_10()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3274:1: ( rule__Application__TargetAssignment_10 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3274:2: rule__Application__TargetAssignment_10
            {
            pushFollow(FOLLOW_rule__Application__TargetAssignment_10_in_rule__Application__Group__10__Impl6556);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3284:1: rule__Application__Group__11 : rule__Application__Group__11__Impl rule__Application__Group__12 ;
    public final void rule__Application__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3288:1: ( rule__Application__Group__11__Impl rule__Application__Group__12 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3289:2: rule__Application__Group__11__Impl rule__Application__Group__12
            {
            pushFollow(FOLLOW_rule__Application__Group__11__Impl_in_rule__Application__Group__116586);
            rule__Application__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group__12_in_rule__Application__Group__116589);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3296:1: rule__Application__Group__11__Impl : ( 'path' ) ;
    public final void rule__Application__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3300:1: ( ( 'path' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3301:1: ( 'path' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3301:1: ( 'path' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3302:1: 'path'
            {
             before(grammarAccess.getApplicationAccess().getPathKeyword_11()); 
            match(input,36,FOLLOW_36_in_rule__Application__Group__11__Impl6617); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3315:1: rule__Application__Group__12 : rule__Application__Group__12__Impl ;
    public final void rule__Application__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3319:1: ( rule__Application__Group__12__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3320:2: rule__Application__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__12__Impl_in_rule__Application__Group__126648);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3326:1: rule__Application__Group__12__Impl : ( ( rule__Application__PathAssignment_12 ) ) ;
    public final void rule__Application__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3330:1: ( ( ( rule__Application__PathAssignment_12 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3331:1: ( ( rule__Application__PathAssignment_12 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3331:1: ( ( rule__Application__PathAssignment_12 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3332:1: ( rule__Application__PathAssignment_12 )
            {
             before(grammarAccess.getApplicationAccess().getPathAssignment_12()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3333:1: ( rule__Application__PathAssignment_12 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3333:2: rule__Application__PathAssignment_12
            {
            pushFollow(FOLLOW_rule__Application__PathAssignment_12_in_rule__Application__Group__12__Impl6675);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3369:1: rule__Application__Group_4__0 : rule__Application__Group_4__0__Impl rule__Application__Group_4__1 ;
    public final void rule__Application__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3373:1: ( rule__Application__Group_4__0__Impl rule__Application__Group_4__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3374:2: rule__Application__Group_4__0__Impl rule__Application__Group_4__1
            {
            pushFollow(FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__06731);
            rule__Application__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__06734);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3381:1: rule__Application__Group_4__0__Impl : ( 'workdir' ) ;
    public final void rule__Application__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3385:1: ( ( 'workdir' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3386:1: ( 'workdir' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3386:1: ( 'workdir' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3387:1: 'workdir'
            {
             before(grammarAccess.getApplicationAccess().getWorkdirKeyword_4_0()); 
            match(input,42,FOLLOW_42_in_rule__Application__Group_4__0__Impl6762); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3400:1: rule__Application__Group_4__1 : rule__Application__Group_4__1__Impl ;
    public final void rule__Application__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3404:1: ( rule__Application__Group_4__1__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3405:2: rule__Application__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__16793);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3411:1: rule__Application__Group_4__1__Impl : ( ( rule__Application__WorkDirAssignment_4_1 ) ) ;
    public final void rule__Application__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3415:1: ( ( ( rule__Application__WorkDirAssignment_4_1 ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3416:1: ( ( rule__Application__WorkDirAssignment_4_1 ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3416:1: ( ( rule__Application__WorkDirAssignment_4_1 ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3417:1: ( rule__Application__WorkDirAssignment_4_1 )
            {
             before(grammarAccess.getApplicationAccess().getWorkDirAssignment_4_1()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3418:1: ( rule__Application__WorkDirAssignment_4_1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3418:2: rule__Application__WorkDirAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Application__WorkDirAssignment_4_1_in_rule__Application__Group_4__1__Impl6820);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3432:1: rule__URI__Group__0 : rule__URI__Group__0__Impl rule__URI__Group__1 ;
    public final void rule__URI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3436:1: ( rule__URI__Group__0__Impl rule__URI__Group__1 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3437:2: rule__URI__Group__0__Impl rule__URI__Group__1
            {
            pushFollow(FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__06854);
            rule__URI__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URI__Group__1_in_rule__URI__Group__06857);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3444:1: rule__URI__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__URI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3448:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3449:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3449:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3450:1: RULE_ID
            {
             before(grammarAccess.getURIAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__URI__Group__0__Impl6884); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3461:1: rule__URI__Group__1 : rule__URI__Group__1__Impl rule__URI__Group__2 ;
    public final void rule__URI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3465:1: ( rule__URI__Group__1__Impl rule__URI__Group__2 )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3466:2: rule__URI__Group__1__Impl rule__URI__Group__2
            {
            pushFollow(FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__16913);
            rule__URI__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__URI__Group__2_in_rule__URI__Group__16916);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3473:1: rule__URI__Group__1__Impl : ( '.' ) ;
    public final void rule__URI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3477:1: ( ( '.' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3478:1: ( '.' )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3478:1: ( '.' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3479:1: '.'
            {
             before(grammarAccess.getURIAccess().getFullStopKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__URI__Group__1__Impl6944); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3492:1: rule__URI__Group__2 : rule__URI__Group__2__Impl ;
    public final void rule__URI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3496:1: ( rule__URI__Group__2__Impl )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3497:2: rule__URI__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__26975);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3503:1: rule__URI__Group__2__Impl : ( ruleRestUri ) ;
    public final void rule__URI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3507:1: ( ( ruleRestUri ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3508:1: ( ruleRestUri )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3508:1: ( ruleRestUri )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3509:1: ruleRestUri
            {
             before(grammarAccess.getURIAccess().getRestUriParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleRestUri_in_rule__URI__Group__2__Impl7002);
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


    // $ANTLR start rule__AndroidSystem__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3527:1: rule__AndroidSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AndroidSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3531:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3532:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3532:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3533:1: RULE_ID
            {
             before(grammarAccess.getAndroidSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndroidSystem__NameAssignment_17042); 
             after(grammarAccess.getAndroidSystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__NameAssignment_1


    // $ANTLR start rule__AndroidSystem__DataAssignment_2
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3542:1: rule__AndroidSystem__DataAssignment_2 : ( ruleData ) ;
    public final void rule__AndroidSystem__DataAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3546:1: ( ( ruleData ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3547:1: ( ruleData )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3547:1: ( ruleData )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3548:1: ruleData
            {
             before(grammarAccess.getAndroidSystemAccess().getDataDataParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleData_in_rule__AndroidSystem__DataAssignment_27073);
            ruleData();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getDataDataParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__DataAssignment_2


    // $ANTLR start rule__AndroidSystem__ActionAssignment_3
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3557:1: rule__AndroidSystem__ActionAssignment_3 : ( ruleAction ) ;
    public final void rule__AndroidSystem__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3561:1: ( ( ruleAction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3562:1: ( ruleAction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3562:1: ( ruleAction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3563:1: ruleAction
            {
             before(grammarAccess.getAndroidSystemAccess().getActionActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__AndroidSystem__ActionAssignment_37104);
            ruleAction();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getActionActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__ActionAssignment_3


    // $ANTLR start rule__AndroidSystem__ServiceInterfaceAssignment_4
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3572:1: rule__AndroidSystem__ServiceInterfaceAssignment_4 : ( ruleServiceInterface ) ;
    public final void rule__AndroidSystem__ServiceInterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3576:1: ( ( ruleServiceInterface ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3577:1: ( ruleServiceInterface )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3577:1: ( ruleServiceInterface )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3578:1: ruleServiceInterface
            {
             before(grammarAccess.getAndroidSystemAccess().getServiceInterfaceServiceInterfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleServiceInterface_in_rule__AndroidSystem__ServiceInterfaceAssignment_47135);
            ruleServiceInterface();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getServiceInterfaceServiceInterfaceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__ServiceInterfaceAssignment_4


    // $ANTLR start rule__AndroidSystem__ComponentAssignment_5
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3587:1: rule__AndroidSystem__ComponentAssignment_5 : ( ruleComponent ) ;
    public final void rule__AndroidSystem__ComponentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3591:1: ( ( ruleComponent ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3592:1: ( ruleComponent )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3592:1: ( ruleComponent )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3593:1: ruleComponent
            {
             before(grammarAccess.getAndroidSystemAccess().getComponentComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__AndroidSystem__ComponentAssignment_57166);
            ruleComponent();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getComponentComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__ComponentAssignment_5


    // $ANTLR start rule__AndroidSystem__ApplicationAssignment_6
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3602:1: rule__AndroidSystem__ApplicationAssignment_6 : ( ruleApplication ) ;
    public final void rule__AndroidSystem__ApplicationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3606:1: ( ( ruleApplication ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3607:1: ( ruleApplication )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3607:1: ( ruleApplication )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3608:1: ruleApplication
            {
             before(grammarAccess.getAndroidSystemAccess().getApplicationApplicationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__AndroidSystem__ApplicationAssignment_67197);
            ruleApplication();
            _fsp--;

             after(grammarAccess.getAndroidSystemAccess().getApplicationApplicationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndroidSystem__ApplicationAssignment_6


    // $ANTLR start rule__ServiceInterface__NameAssignment_1
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3617:1: rule__ServiceInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3621:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3622:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3622:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3623:1: RULE_ID
            {
             before(grammarAccess.getServiceInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceInterface__NameAssignment_17228); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3632:1: rule__ServiceInterface__OperationAssignment_2 : ( ruleLocalOperation ) ;
    public final void rule__ServiceInterface__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3636:1: ( ( ruleLocalOperation ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3637:1: ( ruleLocalOperation )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3637:1: ( ruleLocalOperation )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3638:1: ruleLocalOperation
            {
             before(grammarAccess.getServiceInterfaceAccess().getOperationLocalOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLocalOperation_in_rule__ServiceInterface__OperationAssignment_27259);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3647:1: rule__LocalOperation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalOperation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3651:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3652:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3652:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3653:1: RULE_ID
            {
             before(grammarAccess.getLocalOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalOperation__NameAssignment_17290); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3662:1: rule__LocalOperation__ReturnAssignment_3 : ( RULE_STRING ) ;
    public final void rule__LocalOperation__ReturnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3666:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3667:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3667:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3668:1: RULE_STRING
            {
             before(grammarAccess.getLocalOperationAccess().getReturnSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LocalOperation__ReturnAssignment_37321); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3677:1: rule__LocalOperation__InputTypeAssignment_4_1 : ( ruleInputType ) ;
    public final void rule__LocalOperation__InputTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3681:1: ( ( ruleInputType ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3682:1: ( ruleInputType )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3682:1: ( ruleInputType )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3683:1: ruleInputType
            {
             before(grammarAccess.getLocalOperationAccess().getInputTypeInputTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleInputType_in_rule__LocalOperation__InputTypeAssignment_4_17352);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3692:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3696:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3697:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3697:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3698:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_17383); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3707:1: rule__Service__InterfaceAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Service__InterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3711:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3712:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3712:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3713:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceCrossReference_3_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3714:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3715:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__InterfaceAssignment_37418); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3726:1: rule__Service__ServiceInteractionAssignment_4 : ( ruleExplicitInteractionService ) ;
    public final void rule__Service__ServiceInteractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3730:1: ( ( ruleExplicitInteractionService ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3731:1: ( ruleExplicitInteractionService )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3731:1: ( ruleExplicitInteractionService )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3732:1: ruleExplicitInteractionService
            {
             before(grammarAccess.getServiceAccess().getServiceInteractionExplicitInteractionServiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExplicitInteractionService_in_rule__Service__ServiceInteractionAssignment_47453);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3741:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3745:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3746:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3746:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3747:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_17484); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3756:1: rule__Activity__LaunchableAssignment_2 : ( ( 'launchable' ) ) ;
    public final void rule__Activity__LaunchableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3760:1: ( ( ( 'launchable' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3761:1: ( ( 'launchable' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3761:1: ( ( 'launchable' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3762:1: ( 'launchable' )
            {
             before(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3763:1: ( 'launchable' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3764:1: 'launchable'
            {
             before(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__Activity__LaunchableAssignment_27520); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3779:1: rule__Activity__ActionsAssignment_3 : ( ruleLocalAction ) ;
    public final void rule__Activity__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3783:1: ( ( ruleLocalAction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3784:1: ( ruleLocalAction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3784:1: ( ruleLocalAction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3785:1: ruleLocalAction
            {
             before(grammarAccess.getActivityAccess().getActionsLocalActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocalAction_in_rule__Activity__ActionsAssignment_37559);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3794:1: rule__Activity__InteractionsAssignment_4 : ( ruleInterAction ) ;
    public final void rule__Activity__InteractionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3798:1: ( ( ruleInterAction ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3799:1: ( ruleInterAction )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3799:1: ( ruleInterAction )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3800:1: ruleInterAction
            {
             before(grammarAccess.getActivityAccess().getInteractionsInterActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterAction_in_rule__Activity__InteractionsAssignment_47590);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3809:1: rule__LocalAction__ActionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LocalAction__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3813:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3814:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3814:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3815:1: ( RULE_ID )
            {
             before(grammarAccess.getLocalActionAccess().getActionActionCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3816:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3817:1: RULE_ID
            {
             before(grammarAccess.getLocalActionAccess().getActionActionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalAction__ActionAssignment_17625); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3828:1: rule__LocalAction__ButtonAssignment_2 : ( ( 'button' ) ) ;
    public final void rule__LocalAction__ButtonAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3832:1: ( ( ( 'button' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3833:1: ( ( 'button' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3833:1: ( ( 'button' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3834:1: ( 'button' )
            {
             before(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3835:1: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3836:1: 'button'
            {
             before(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__LocalAction__ButtonAssignment_27665); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3851:1: rule__InterAction__ButtonAssignment_0_1 : ( ( 'button' ) ) ;
    public final void rule__InterAction__ButtonAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3855:1: ( ( ( 'button' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3856:1: ( ( 'button' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3856:1: ( ( 'button' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3857:1: ( 'button' )
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3858:1: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3859:1: 'button'
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0()); 
            match(input,45,FOLLOW_45_in_rule__InterAction__ButtonAssignment_0_17709); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3874:1: rule__InterAction__ButtonAssignment_1_1 : ( ( 'button' ) ) ;
    public final void rule__InterAction__ButtonAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3878:1: ( ( ( 'button' ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3879:1: ( ( 'button' ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3879:1: ( ( 'button' ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3880:1: ( 'button' )
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3881:1: ( 'button' )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3882:1: 'button'
            {
             before(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0()); 
            match(input,45,FOLLOW_45_in_rule__InterAction__ButtonAssignment_1_17753); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3897:1: rule__ExplicitInteractionActivity__DestAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExplicitInteractionActivity__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3901:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3902:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3902:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3903:1: ( RULE_ID )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3904:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3905:1: RULE_ID
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__DestAssignment_17796); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3916:1: rule__ExplicitInteractionActivity__ActionAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExplicitInteractionActivity__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3920:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3921:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3921:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3922:1: ( RULE_ID )
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getActionActionCrossReference_2_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3923:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3924:1: RULE_ID
            {
             before(grammarAccess.getExplicitInteractionActivityAccess().getActionActionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__ActionAssignment_2_17835); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3935:1: rule__UseService__DestAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseService__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3939:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3940:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3940:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3941:1: ( RULE_ID )
            {
             before(grammarAccess.getUseServiceAccess().getDestServiceInterfaceCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3942:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3943:1: RULE_ID
            {
             before(grammarAccess.getUseServiceAccess().getDestServiceInterfaceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseService__DestAssignment_17874); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3954:1: rule__UseService__OperationAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__UseService__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3958:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3959:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3959:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3960:1: ( RULE_ID )
            {
             before(grammarAccess.getUseServiceAccess().getOperationLocalOperationCrossReference_3_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3961:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3962:1: RULE_ID
            {
             before(grammarAccess.getUseServiceAccess().getOperationLocalOperationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UseService__OperationAssignment_37913); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3973:1: rule__UseService__ArgAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__UseService__ArgAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3977:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3978:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3978:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3979:1: RULE_STRING
            {
             before(grammarAccess.getUseServiceAccess().getArgSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UseService__ArgAssignment_4_17948); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3988:1: rule__Launchservice__DestAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Launchservice__DestAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3992:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3993:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3993:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3994:1: ( RULE_ID )
            {
             before(grammarAccess.getLaunchserviceAccess().getDestServiceCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3995:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:3996:1: RULE_ID
            {
             before(grammarAccess.getLaunchserviceAccess().getDestServiceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Launchservice__DestAssignment_17983); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4007:1: rule__ActionOnlyInteraction__ActionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActionOnlyInteraction__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4011:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4012:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4012:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4013:1: ( RULE_ID )
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getActionActionCrossReference_1_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4014:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4015:1: RULE_ID
            {
             before(grammarAccess.getActionOnlyInteractionAccess().getActionActionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionOnlyInteraction__ActionAssignment_18022); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4026:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4030:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4031:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4031:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4032:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_18057); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4041:1: rule__Action__DataAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Action__DataAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4045:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4046:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4046:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4047:1: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getDataDataCrossReference_3_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4048:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4049:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getDataDataIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__DataAssignment_38092); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4060:1: rule__Action__CategoryAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Action__CategoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4064:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4065:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4065:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4066:1: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getCategorySTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Action__CategoryAssignment_58127); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4075:1: rule__Data__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Data__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4079:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4080:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4080:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4081:1: RULE_ID
            {
             before(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Data__NameAssignment_18158); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4090:1: rule__Data__SchemeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Data__SchemeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4094:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4095:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4095:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4096:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getSchemeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__SchemeAssignment_38189); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4105:1: rule__Data__HostAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Data__HostAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4109:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4110:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4110:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4111:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getHostSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__HostAssignment_4_18220); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4120:1: rule__Data__PortAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Data__PortAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4124:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4125:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4125:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4126:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getPortSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__PortAssignment_5_18251); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4135:1: rule__Data__PathAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Data__PathAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4139:1: ( ( RULE_STRING ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4140:1: ( RULE_STRING )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4140:1: ( RULE_STRING )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4141:1: RULE_STRING
            {
             before(grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Data__PathAssignment_6_18282); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4150:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4154:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4155:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4155:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4156:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__NameAssignment_18313); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4165:1: rule__Application__AvdAssignment_3 : ( RULE_INT ) ;
    public final void rule__Application__AvdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4169:1: ( ( RULE_INT ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4170:1: ( RULE_INT )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4170:1: ( RULE_INT )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4171:1: RULE_INT
            {
             before(grammarAccess.getApplicationAccess().getAvdINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Application__AvdAssignment_38344); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4180:1: rule__Application__WorkDirAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__Application__WorkDirAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4184:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4185:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4186:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getWorkDirIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__WorkDirAssignment_4_18375); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4195:1: rule__Application__PackageNameAssignment_6 : ( ruleURI ) ;
    public final void rule__Application__PackageNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4199:1: ( ( ruleURI ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4200:1: ( ruleURI )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4200:1: ( ruleURI )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4201:1: ruleURI
            {
             before(grammarAccess.getApplicationAccess().getPackageNameURIParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleURI_in_rule__Application__PackageNameAssignment_68406);
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4210:1: rule__Application__MainActivityAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Application__MainActivityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4214:1: ( ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4215:1: ( ( RULE_ID ) )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4215:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4216:1: ( RULE_ID )
            {
             before(grammarAccess.getApplicationAccess().getMainActivityActivityCrossReference_8_0()); 
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4217:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4218:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getMainActivityActivityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__MainActivityAssignment_88441); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4229:1: rule__Application__TargetAssignment_10 : ( RULE_INT ) ;
    public final void rule__Application__TargetAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4233:1: ( ( RULE_INT ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4234:1: ( RULE_INT )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4234:1: ( RULE_INT )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4235:1: RULE_INT
            {
             before(grammarAccess.getApplicationAccess().getTargetINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Application__TargetAssignment_108476); 
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
    // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4244:1: rule__Application__PathAssignment_12 : ( RULE_ID ) ;
    public final void rule__Application__PathAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4248:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4249:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4249:1: ( RULE_ID )
            // ../it.unibo.madz.mobile.ui/src-gen/it/unibo/madz/mobile/ui/contentassist/antlr/internal/InternalAndroidL.g:4250:1: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getPathIDTerminalRuleCall_12_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Application__PathAssignment_128507); 
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
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__0__Impl_in_rule__AndroidSystem__Group__01569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__1_in_rule__AndroidSystem__Group__01572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AndroidSystem__Group__0__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__1__Impl_in_rule__AndroidSystem__Group__11631 = new BitSet(new long[]{0x0000002080D08000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__2_in_rule__AndroidSystem__Group__11634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__NameAssignment_1_in_rule__AndroidSystem__Group__1__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__2__Impl_in_rule__AndroidSystem__Group__21691 = new BitSet(new long[]{0x0000002000D08000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__3_in_rule__AndroidSystem__Group__21694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__DataAssignment_2_in_rule__AndroidSystem__Group__2__Impl1721 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__3__Impl_in_rule__AndroidSystem__Group__31752 = new BitSet(new long[]{0x0000002000508000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__4_in_rule__AndroidSystem__Group__31755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ActionAssignment_3_in_rule__AndroidSystem__Group__3__Impl1782 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__4__Impl_in_rule__AndroidSystem__Group__41813 = new BitSet(new long[]{0x0000002000500000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__5_in_rule__AndroidSystem__Group__41816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ServiceInterfaceAssignment_4_in_rule__AndroidSystem__Group__4__Impl1843 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__5__Impl_in_rule__AndroidSystem__Group__51874 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__6_in_rule__AndroidSystem__Group__51877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ComponentAssignment_5_in_rule__AndroidSystem__Group__5__Impl1904 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__Group__6__Impl_in_rule__AndroidSystem__Group__61935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndroidSystem__ApplicationAssignment_6_in_rule__AndroidSystem__Group__6__Impl1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__0__Impl_in_rule__ServiceInterface__Group__02006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__1_in_rule__ServiceInterface__Group__02009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ServiceInterface__Group__0__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__1__Impl_in_rule__ServiceInterface__Group__12068 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__2_in_rule__ServiceInterface__Group__12071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__NameAssignment_1_in_rule__ServiceInterface__Group__1__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__Group__2__Impl_in_rule__ServiceInterface__Group__22128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceInterface__OperationAssignment_2_in_rule__ServiceInterface__Group__2__Impl2155 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__0__Impl_in_rule__LocalOperation__Group__02192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__1_in_rule__LocalOperation__Group__02195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LocalOperation__Group__0__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__1__Impl_in_rule__LocalOperation__Group__12254 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__2_in_rule__LocalOperation__Group__12257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__NameAssignment_1_in_rule__LocalOperation__Group__1__Impl2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__2__Impl_in_rule__LocalOperation__Group__22314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__3_in_rule__LocalOperation__Group__22317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LocalOperation__Group__2__Impl2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__3__Impl_in_rule__LocalOperation__Group__32376 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__4_in_rule__LocalOperation__Group__32379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__ReturnAssignment_3_in_rule__LocalOperation__Group__3__Impl2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group__4__Impl_in_rule__LocalOperation__Group__42436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__0_in_rule__LocalOperation__Group__4__Impl2463 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__0__Impl_in_rule__LocalOperation__Group_4__02504 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__1_in_rule__LocalOperation__Group_4__02507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LocalOperation__Group_4__0__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__1__Impl_in_rule__LocalOperation__Group_4__12566 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__2_in_rule__LocalOperation__Group_4__12569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__InputTypeAssignment_4_1_in_rule__LocalOperation__Group_4__1__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalOperation__Group_4__2__Impl_in_rule__LocalOperation__Group_4__22626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LocalOperation__Group_4__2__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__02691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__02694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Service__Group__0__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__12753 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__12756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__22813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__22816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Service__Group__2__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__32875 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__32878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__InterfaceAssignment_3_in_rule__Service__Group__3__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__42935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ServiceInteractionAssignment_4_in_rule__Service__Group__4__Impl2962 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__03003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__03006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group__0__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__13065 = new BitSet(new long[]{0x0000100065800002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__13068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__23125 = new BitSet(new long[]{0x0000000065800002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__23128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__LaunchableAssignment_2_in_rule__Activity__Group__2__Impl3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__33186 = new BitSet(new long[]{0x0000000065000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__33189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__ActionsAssignment_3_in_rule__Activity__Group__3__Impl3216 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__43247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__InteractionsAssignment_4_in_rule__Activity__Group__4__Impl3274 = new BitSet(new long[]{0x0000000065000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__0__Impl_in_rule__LocalAction__Group__03315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__1_in_rule__LocalAction__Group__03318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LocalAction__Group__0__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__1__Impl_in_rule__LocalAction__Group__13377 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__2_in_rule__LocalAction__Group__13380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__ActionAssignment_1_in_rule__LocalAction__Group__1__Impl3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__Group__2__Impl_in_rule__LocalAction__Group__23437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalAction__ButtonAssignment_2_in_rule__LocalAction__Group__2__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__0__Impl_in_rule__InterAction__Group_0__03501 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__1_in_rule__InterAction__Group_0__03504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_rule__InterAction__Group_0__0__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_0__1__Impl_in_rule__InterAction__Group_0__13560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__ButtonAssignment_0_1_in_rule__InterAction__Group_0__1__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__0__Impl_in_rule__InterAction__Group_1__03622 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__1_in_rule__InterAction__Group_1__03625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_rule__InterAction__Group_1__0__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__Group_1__1__Impl_in_rule__InterAction__Group_1__13681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterAction__ButtonAssignment_1_1_in_rule__InterAction__Group_1__1__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__0__Impl_in_rule__ExplicitInteractionActivity__Group__03743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__1_in_rule__ExplicitInteractionActivity__Group__03746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExplicitInteractionActivity__Group__0__Impl3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__1__Impl_in_rule__ExplicitInteractionActivity__Group__13805 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__2_in_rule__ExplicitInteractionActivity__Group__13808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__DestAssignment_1_in_rule__ExplicitInteractionActivity__Group__1__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group__2__Impl_in_rule__ExplicitInteractionActivity__Group__23865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__0_in_rule__ExplicitInteractionActivity__Group__2__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__0__Impl_in_rule__ExplicitInteractionActivity__Group_2__03929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__1_in_rule__ExplicitInteractionActivity__Group_2__03932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ExplicitInteractionActivity__Group_2__0__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__Group_2__1__Impl_in_rule__ExplicitInteractionActivity__Group_2__13991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExplicitInteractionActivity__ActionAssignment_2_1_in_rule__ExplicitInteractionActivity__Group_2__1__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__0__Impl_in_rule__UseService__Group__04052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseService__Group__1_in_rule__UseService__Group__04055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UseService__Group__0__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__1__Impl_in_rule__UseService__Group__14114 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__UseService__Group__2_in_rule__UseService__Group__14117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__DestAssignment_1_in_rule__UseService__Group__1__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__2__Impl_in_rule__UseService__Group__24174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UseService__Group__3_in_rule__UseService__Group__24177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UseService__Group__2__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__3__Impl_in_rule__UseService__Group__34236 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__4_in_rule__UseService__Group__34239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__OperationAssignment_3_in_rule__UseService__Group__3__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group__4__Impl_in_rule__UseService__Group__44296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group_4__0_in_rule__UseService__Group__4__Impl4323 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__UseService__Group_4__0__Impl_in_rule__UseService__Group_4__04364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UseService__Group_4__1_in_rule__UseService__Group_4__04367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UseService__Group_4__0__Impl4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__Group_4__1__Impl_in_rule__UseService__Group_4__14426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseService__ArgAssignment_4_1_in_rule__UseService__Group_4__1__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Launchservice__Group__0__Impl_in_rule__Launchservice__Group__04487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Launchservice__Group__1_in_rule__Launchservice__Group__04490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Launchservice__Group__0__Impl4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Launchservice__Group__1__Impl_in_rule__Launchservice__Group__14549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Launchservice__DestAssignment_1_in_rule__Launchservice__Group__1__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__0__Impl_in_rule__ActionOnlyInteraction__Group__04610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__1_in_rule__ActionOnlyInteraction__Group__04613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ActionOnlyInteraction__Group__0__Impl4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__Group__1__Impl_in_rule__ActionOnlyInteraction__Group__14672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionOnlyInteraction__ActionAssignment_1_in_rule__ActionOnlyInteraction__Group__1__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Action__Group__0__Impl4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14795 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Action__Group__2__Impl4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34917 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Action__Group__4_in_rule__Action__Group__34920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__DataAssignment_3_in_rule__Action__Group__3__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__4__Impl_in_rule__Action__Group__44977 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group__5_in_rule__Action__Group__44980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Action__Group__4__Impl5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__5__Impl_in_rule__Action__Group__55039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__CategoryAssignment_5_in_rule__Action__Group__5__Impl5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__0__Impl_in_rule__Data__Group__05108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Data__Group__1_in_rule__Data__Group__05111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Data__Group__0__Impl5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__1__Impl_in_rule__Data__Group__15170 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Data__Group__2_in_rule__Data__Group__15173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__NameAssignment_1_in_rule__Data__Group__1__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__2__Impl_in_rule__Data__Group__25230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group__3_in_rule__Data__Group__25233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Data__Group__2__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__3__Impl_in_rule__Data__Group__35292 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_rule__Data__Group__4_in_rule__Data__Group__35295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__SchemeAssignment_3_in_rule__Data__Group__3__Impl5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__4__Impl_in_rule__Data__Group__45352 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_rule__Data__Group__5_in_rule__Data__Group__45355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_4__0_in_rule__Data__Group__4__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__5__Impl_in_rule__Data__Group__55413 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__6_in_rule__Data__Group__55416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_5__0_in_rule__Data__Group__5__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group__6__Impl_in_rule__Data__Group__65474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__0_in_rule__Data__Group__6__Impl5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_4__0__Impl_in_rule__Data__Group_4__05546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group_4__1_in_rule__Data__Group_4__05549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Data__Group_4__0__Impl5577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_4__1__Impl_in_rule__Data__Group_4__15608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__HostAssignment_4_1_in_rule__Data__Group_4__1__Impl5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_5__0__Impl_in_rule__Data__Group_5__05669 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group_5__1_in_rule__Data__Group_5__05672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Data__Group_5__0__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_5__1__Impl_in_rule__Data__Group_5__15731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__PortAssignment_5_1_in_rule__Data__Group_5__1__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__0__Impl_in_rule__Data__Group_6__05792 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Data__Group_6__1_in_rule__Data__Group_6__05795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Data__Group_6__0__Impl5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__Group_6__1__Impl_in_rule__Data__Group_6__15854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Data__PathAssignment_6_1_in_rule__Data__Group_6__1__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__05915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__05918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Application__Group__0__Impl5946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__15977 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__15980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__NameAssignment_1_in_rule__Application__Group__1__Impl6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__26037 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__26040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Application__Group__2__Impl6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__36099 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__36102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__AvdAssignment_3_in_rule__Application__Group__3__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__46159 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__46162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0_in_rule__Application__Group__4__Impl6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__56220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__6_in_rule__Application__Group__56223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Application__Group__5__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__66282 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__7_in_rule__Application__Group__66285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__PackageNameAssignment_6_in_rule__Application__Group__6__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__76342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__8_in_rule__Application__Group__76345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Application__Group__7__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__86404 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__9_in_rule__Application__Group__86407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__MainActivityAssignment_8_in_rule__Application__Group__8__Impl6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__9__Impl_in_rule__Application__Group__96464 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Application__Group__10_in_rule__Application__Group__96467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Application__Group__9__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__10__Impl_in_rule__Application__Group__106526 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Application__Group__11_in_rule__Application__Group__106529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__TargetAssignment_10_in_rule__Application__Group__10__Impl6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__11__Impl_in_rule__Application__Group__116586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group__12_in_rule__Application__Group__116589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Application__Group__11__Impl6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__12__Impl_in_rule__Application__Group__126648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__PathAssignment_12_in_rule__Application__Group__12__Impl6675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__0__Impl_in_rule__Application__Group_4__06731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1_in_rule__Application__Group_4__06734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Application__Group_4__0__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group_4__1__Impl_in_rule__Application__Group_4__16793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__WorkDirAssignment_4_1_in_rule__Application__Group_4__1__Impl6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__0__Impl_in_rule__URI__Group__06854 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__URI__Group__1_in_rule__URI__Group__06857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__URI__Group__0__Impl6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__1__Impl_in_rule__URI__Group__16913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__URI__Group__2_in_rule__URI__Group__16916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__URI__Group__1__Impl6944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__URI__Group__2__Impl_in_rule__URI__Group__26975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestUri_in_rule__URI__Group__2__Impl7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndroidSystem__NameAssignment_17042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_rule__AndroidSystem__DataAssignment_27073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__AndroidSystem__ActionAssignment_37104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_rule__AndroidSystem__ServiceInterfaceAssignment_47135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__AndroidSystem__ComponentAssignment_57166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__AndroidSystem__ApplicationAssignment_67197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceInterface__NameAssignment_17228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalOperation_in_rule__ServiceInterface__OperationAssignment_27259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalOperation__NameAssignment_17290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LocalOperation__ReturnAssignment_37321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputType_in_rule__LocalOperation__InputTypeAssignment_4_17352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_17383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__InterfaceAssignment_37418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_rule__Service__ServiceInteractionAssignment_47453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_17484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Activity__LaunchableAssignment_27520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_rule__Activity__ActionsAssignment_37559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterAction_in_rule__Activity__InteractionsAssignment_47590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalAction__ActionAssignment_17625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__LocalAction__ButtonAssignment_27665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__InterAction__ButtonAssignment_0_17709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__InterAction__ButtonAssignment_1_17753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__DestAssignment_17796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExplicitInteractionActivity__ActionAssignment_2_17835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseService__DestAssignment_17874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UseService__OperationAssignment_37913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UseService__ArgAssignment_4_17948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Launchservice__DestAssignment_17983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionOnlyInteraction__ActionAssignment_18022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_18057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__DataAssignment_38092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Action__CategoryAssignment_58127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Data__NameAssignment_18158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__SchemeAssignment_38189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__HostAssignment_4_18220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__PortAssignment_5_18251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Data__PathAssignment_6_18282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__NameAssignment_18313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Application__AvdAssignment_38344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__WorkDirAssignment_4_18375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_rule__Application__PackageNameAssignment_68406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__MainActivityAssignment_88441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Application__TargetAssignment_108476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Application__PathAssignment_128507 = new BitSet(new long[]{0x0000000000000002L});

}