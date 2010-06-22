package it.unibo.madz.mobile.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import it.unibo.madz.mobile.services.AndroidLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'serviceInterface'", "'op'", "'return'", "'inputType'", "';'", "'Service'", "'implements'", "'Activity'", "'launchable'", "'action'", "'button'", "'callActivity'", "'forActiom'", "'useService'", "'forOp'", "'arg='", "'launchService'", "'execAction'", "'data'", "'category'", "'scheme'", "'host'", "'port'", "'path'", "'Application'", "'avd'", "'workdir'", "'package'", "'entryActiviy'", "'target'", "'.'", "'String'", "'int'", "'double'"
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
    public String getGrammarFileName() { return "../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g"; }



     	private AndroidLGrammarAccess grammarAccess;
     	
        public InternalAndroidLParser(TokenStream input, IAstFactory factory, AndroidLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AndroidSystem";	
       	}
       	
       	@Override
       	protected AndroidLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleAndroidSystem
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:78:1: entryRuleAndroidSystem returns [EObject current=null] : iv_ruleAndroidSystem= ruleAndroidSystem EOF ;
    public final EObject entryRuleAndroidSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroidSystem = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:79:2: (iv_ruleAndroidSystem= ruleAndroidSystem EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:80:2: iv_ruleAndroidSystem= ruleAndroidSystem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAndroidSystemRule(), currentNode); 
            pushFollow(FOLLOW_ruleAndroidSystem_in_entryRuleAndroidSystem75);
            iv_ruleAndroidSystem=ruleAndroidSystem();
            _fsp--;

             current =iv_ruleAndroidSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndroidSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAndroidSystem


    // $ANTLR start ruleAndroidSystem
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:87:1: ruleAndroidSystem returns [EObject current=null] : ( ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) ) ) ;
    public final EObject ruleAndroidSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_data_0_0 = null;

        EObject lv_action_1_0 = null;

        EObject lv_serviceInterface_2_0 = null;

        EObject lv_component_3_0 = null;

        EObject lv_application_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:92:6: ( ( ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:93:1: ( ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:93:1: ( ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:93:2: ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:93:2: ( (lv_data_0_0= ruleData ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:94:1: (lv_data_0_0= ruleData )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:94:1: (lv_data_0_0= ruleData )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:95:3: lv_data_0_0= ruleData
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getDataDataParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleAndroidSystem131);
            	    lv_data_0_0=ruleData();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"data",
            	    	        		lv_data_0_0, 
            	    	        		"Data", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:117:3: ( (lv_action_1_0= ruleAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:118:1: (lv_action_1_0= ruleAction )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:118:1: (lv_action_1_0= ruleAction )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:119:3: lv_action_1_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getActionActionParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleAndroidSystem153);
            	    lv_action_1_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"action",
            	    	        		lv_action_1_0, 
            	    	        		"Action", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:141:3: ( (lv_serviceInterface_2_0= ruleServiceInterface ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:142:1: (lv_serviceInterface_2_0= ruleServiceInterface )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:142:1: (lv_serviceInterface_2_0= ruleServiceInterface )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:143:3: lv_serviceInterface_2_0= ruleServiceInterface
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getServiceInterfaceServiceInterfaceParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceInterface_in_ruleAndroidSystem175);
            	    lv_serviceInterface_2_0=ruleServiceInterface();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"serviceInterface",
            	    	        		lv_serviceInterface_2_0, 
            	    	        		"ServiceInterface", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:165:3: ( (lv_component_3_0= ruleComponent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:166:1: (lv_component_3_0= ruleComponent )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:166:1: (lv_component_3_0= ruleComponent )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:167:3: lv_component_3_0= ruleComponent
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getComponentComponentParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleAndroidSystem197);
            	    lv_component_3_0=ruleComponent();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"component",
            	    	        		lv_component_3_0, 
            	    	        		"Component", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:189:3: ( (lv_application_4_0= ruleApplication ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:190:1: (lv_application_4_0= ruleApplication )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:190:1: (lv_application_4_0= ruleApplication )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:191:3: lv_application_4_0= ruleApplication
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getApplicationApplicationParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_ruleAndroidSystem219);
            lv_application_4_0=ruleApplication();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"application",
            	        		lv_application_4_0, 
            	        		"Application", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAndroidSystem


    // $ANTLR start entryRuleComponent
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:221:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:222:2: (iv_ruleComponent= ruleComponent EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:223:2: iv_ruleComponent= ruleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent255);
            iv_ruleComponent=ruleComponent();
            _fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleComponent


    // $ANTLR start ruleComponent
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:230:1: ruleComponent returns [EObject current=null] : (this_Activity_0= ruleActivity | this_Service_1= ruleService ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_Service_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:235:6: ( (this_Activity_0= ruleActivity | this_Service_1= ruleService ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:236:1: (this_Activity_0= ruleActivity | this_Service_1= ruleService )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:236:1: (this_Activity_0= ruleActivity | this_Service_1= ruleService )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("236:1: (this_Activity_0= ruleActivity | this_Service_1= ruleService )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:237:5: this_Activity_0= ruleActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComponentAccess().getActivityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleComponent312);
                    this_Activity_0=ruleActivity();
                    _fsp--;

                     
                            current = this_Activity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:247:5: this_Service_1= ruleService
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComponentAccess().getServiceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleComponent339);
                    this_Service_1=ruleService();
                    _fsp--;

                     
                            current = this_Service_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComponent


    // $ANTLR start entryRuleServiceInterface
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:263:1: entryRuleServiceInterface returns [EObject current=null] : iv_ruleServiceInterface= ruleServiceInterface EOF ;
    public final EObject entryRuleServiceInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceInterface = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:264:2: (iv_ruleServiceInterface= ruleServiceInterface EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:265:2: iv_ruleServiceInterface= ruleServiceInterface EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceInterfaceRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceInterface_in_entryRuleServiceInterface374);
            iv_ruleServiceInterface=ruleServiceInterface();
            _fsp--;

             current =iv_ruleServiceInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceInterface384); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleServiceInterface


    // $ANTLR start ruleServiceInterface
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:272:1: ruleServiceInterface returns [EObject current=null] : ( 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )* ) ;
    public final EObject ruleServiceInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_operation_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:277:6: ( ( 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:278:1: ( 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:278:1: ( 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:278:3: 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )*
            {
            match(input,11,FOLLOW_11_in_ruleServiceInterface419); 

                    createLeafNode(grammarAccess.getServiceInterfaceAccess().getServiceInterfaceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:282:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:283:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:283:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:284:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceInterface436); 

            			createLeafNode(grammarAccess.getServiceInterfaceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceInterfaceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:306:2: ( (lv_operation_2_0= ruleLocalOperation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:307:1: (lv_operation_2_0= ruleLocalOperation )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:307:1: (lv_operation_2_0= ruleLocalOperation )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:308:3: lv_operation_2_0= ruleLocalOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServiceInterfaceAccess().getOperationLocalOperationParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocalOperation_in_ruleServiceInterface462);
            	    lv_operation_2_0=ruleLocalOperation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getServiceInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"operation",
            	    	        		lv_operation_2_0, 
            	    	        		"LocalOperation", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleServiceInterface


    // $ANTLR start entryRuleLocalOperation
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:338:1: entryRuleLocalOperation returns [EObject current=null] : iv_ruleLocalOperation= ruleLocalOperation EOF ;
    public final EObject entryRuleLocalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalOperation = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:339:2: (iv_ruleLocalOperation= ruleLocalOperation EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:340:2: iv_ruleLocalOperation= ruleLocalOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocalOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalOperation_in_entryRuleLocalOperation499);
            iv_ruleLocalOperation=ruleLocalOperation();
            _fsp--;

             current =iv_ruleLocalOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalOperation509); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLocalOperation


    // $ANTLR start ruleLocalOperation
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:347:1: ruleLocalOperation returns [EObject current=null] : ( 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )* ) ;
    public final EObject ruleLocalOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_return_3_0=null;
        Enumerator lv_inputType_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:352:6: ( ( 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:353:1: ( 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:353:1: ( 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:353:3: 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )*
            {
            match(input,12,FOLLOW_12_in_ruleLocalOperation544); 

                    createLeafNode(grammarAccess.getLocalOperationAccess().getOpKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:357:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:358:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:358:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:359:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalOperation561); 

            			createLeafNode(grammarAccess.getLocalOperationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocalOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleLocalOperation576); 

                    createLeafNode(grammarAccess.getLocalOperationAccess().getReturnKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:385:1: ( (lv_return_3_0= RULE_STRING ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:386:1: (lv_return_3_0= RULE_STRING )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:386:1: (lv_return_3_0= RULE_STRING )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:387:3: lv_return_3_0= RULE_STRING
            {
            lv_return_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocalOperation593); 

            			createLeafNode(grammarAccess.getLocalOperationAccess().getReturnSTRINGTerminalRuleCall_3_0(), "return"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocalOperationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"return",
            	        		lv_return_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:409:2: ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:409:4: 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';'
            	    {
            	    match(input,14,FOLLOW_14_in_ruleLocalOperation609); 

            	            createLeafNode(grammarAccess.getLocalOperationAccess().getInputTypeKeyword_4_0(), null); 
            	        
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:413:1: ( (lv_inputType_5_0= ruleInputType ) )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:414:1: (lv_inputType_5_0= ruleInputType )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:414:1: (lv_inputType_5_0= ruleInputType )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:415:3: lv_inputType_5_0= ruleInputType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLocalOperationAccess().getInputTypeInputTypeEnumRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInputType_in_ruleLocalOperation630);
            	    lv_inputType_5_0=ruleInputType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLocalOperationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"inputType",
            	    	        		lv_inputType_5_0, 
            	    	        		"InputType", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,15,FOLLOW_15_in_ruleLocalOperation640); 

            	            createLeafNode(grammarAccess.getLocalOperationAccess().getSemicolonKeyword_4_2(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLocalOperation


    // $ANTLR start entryRuleService
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:449:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:450:2: (iv_ruleService= ruleService EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:451:2: iv_ruleService= ruleService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceRule(), currentNode); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService678);
            iv_ruleService=ruleService();
            _fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService688); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleService


    // $ANTLR start ruleService
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:458:1: ruleService returns [EObject current=null] : ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )* ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_serviceInteraction_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:463:6: ( ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:464:1: ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:464:1: ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:464:3: 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )*
            {
            match(input,16,FOLLOW_16_in_ruleService723); 

                    createLeafNode(grammarAccess.getServiceAccess().getServiceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:468:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:469:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:469:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:470:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService740); 

            			createLeafNode(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleService755); 

                    createLeafNode(grammarAccess.getServiceAccess().getImplementsKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:496:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:497:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:497:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:498:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService773); 

            		createLeafNode(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceCrossReference_3_0(), "interface"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:510:2: ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24||LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:511:1: (lv_serviceInteraction_4_0= ruleExplicitInteractionService )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:511:1: (lv_serviceInteraction_4_0= ruleExplicitInteractionService )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:512:3: lv_serviceInteraction_4_0= ruleExplicitInteractionService
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServiceAccess().getServiceInteractionExplicitInteractionServiceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExplicitInteractionService_in_ruleService794);
            	    lv_serviceInteraction_4_0=ruleExplicitInteractionService();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"serviceInteraction",
            	    	        		lv_serviceInteraction_4_0, 
            	    	        		"ExplicitInteractionService", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleService


    // $ANTLR start entryRuleActivity
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:542:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:543:2: (iv_ruleActivity= ruleActivity EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:544:2: iv_ruleActivity= ruleActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity831);
            iv_ruleActivity=ruleActivity();
            _fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity841); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleActivity


    // $ANTLR start ruleActivity
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:551:1: ruleActivity returns [EObject current=null] : ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_launchable_2_0=null;
        EObject lv_actions_3_0 = null;

        EObject lv_interactions_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:556:6: ( ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:557:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:557:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:557:3: 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )*
            {
            match(input,18,FOLLOW_18_in_ruleActivity876); 

                    createLeafNode(grammarAccess.getActivityAccess().getActivityKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:561:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:562:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:562:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:563:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity893); 

            			createLeafNode(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:585:2: ( (lv_launchable_2_0= 'launchable' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:586:1: (lv_launchable_2_0= 'launchable' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:586:1: (lv_launchable_2_0= 'launchable' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:587:3: lv_launchable_2_0= 'launchable'
                    {
                    lv_launchable_2_0=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleActivity916); 

                            createLeafNode(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0(), "launchable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "launchable", true, "launchable", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:606:3: ( (lv_actions_3_0= ruleLocalAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:607:1: (lv_actions_3_0= ruleLocalAction )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:607:1: (lv_actions_3_0= ruleLocalAction )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:608:3: lv_actions_3_0= ruleLocalAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getActionsLocalActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocalAction_in_ruleActivity951);
            	    lv_actions_3_0=ruleLocalAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"actions",
            	    	        		lv_actions_3_0, 
            	    	        		"LocalAction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:630:3: ( (lv_interactions_4_0= ruleInterAction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22||LA11_0==24||(LA11_0>=27 && LA11_0<=28)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:631:1: (lv_interactions_4_0= ruleInterAction )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:631:1: (lv_interactions_4_0= ruleInterAction )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:632:3: lv_interactions_4_0= ruleInterAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getInteractionsInterActionParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterAction_in_ruleActivity973);
            	    lv_interactions_4_0=ruleInterAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"interactions",
            	    	        		lv_interactions_4_0, 
            	    	        		"InterAction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleActivity


    // $ANTLR start entryRuleLocalAction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:662:1: entryRuleLocalAction returns [EObject current=null] : iv_ruleLocalAction= ruleLocalAction EOF ;
    public final EObject entryRuleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:663:2: (iv_ruleLocalAction= ruleLocalAction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:664:2: iv_ruleLocalAction= ruleLocalAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocalActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalAction_in_entryRuleLocalAction1010);
            iv_ruleLocalAction=ruleLocalAction();
            _fsp--;

             current =iv_ruleLocalAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAction1020); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLocalAction


    // $ANTLR start ruleLocalAction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:671:1: ruleLocalAction returns [EObject current=null] : ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? ) ;
    public final EObject ruleLocalAction() throws RecognitionException {
        EObject current = null;

        Token lv_button_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:676:6: ( ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:677:1: ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:677:1: ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:677:3: 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )?
            {
            match(input,20,FOLLOW_20_in_ruleLocalAction1055); 

                    createLeafNode(grammarAccess.getLocalActionAccess().getActionKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:681:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:682:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:682:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:683:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLocalActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalAction1073); 

            		createLeafNode(grammarAccess.getLocalActionAccess().getActionActionCrossReference_1_0(), "action"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:695:2: ( (lv_button_2_0= 'button' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:696:1: (lv_button_2_0= 'button' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:696:1: (lv_button_2_0= 'button' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:697:3: lv_button_2_0= 'button'
                    {
                    lv_button_2_0=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruleLocalAction1091); 

                            createLeafNode(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0(), "button"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLocalActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "button", true, "button", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLocalAction


    // $ANTLR start entryRuleInterAction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:724:1: entryRuleInterAction returns [EObject current=null] : iv_ruleInterAction= ruleInterAction EOF ;
    public final EObject entryRuleInterAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterAction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:725:2: (iv_ruleInterAction= ruleInterAction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:726:2: iv_ruleInterAction= ruleInterAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterAction_in_entryRuleInterAction1141);
            iv_ruleInterAction=ruleInterAction();
            _fsp--;

             current =iv_ruleInterAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterAction1151); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterAction


    // $ANTLR start ruleInterAction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:733:1: ruleInterAction returns [EObject current=null] : ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) ) ;
    public final EObject ruleInterAction() throws RecognitionException {
        EObject current = null;

        Token lv_button_1_0=null;
        Token lv_button_3_0=null;
        EObject this_ExplicitInteraction_0 = null;

        EObject this_ActionOnlyInteraction_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:738:6: ( ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:739:1: ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:739:1: ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22||LA15_0==24||LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("739:1: ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:739:2: (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:739:2: (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:740:5: this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )?
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInterActionAccess().getExplicitInteractionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExplicitInteraction_in_ruleInterAction1199);
                    this_ExplicitInteraction_0=ruleExplicitInteraction();
                    _fsp--;

                     
                            current = this_ExplicitInteraction_0; 
                            currentNode = currentNode.getParent();
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:748:1: ( (lv_button_1_0= 'button' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:749:1: (lv_button_1_0= 'button' )
                            {
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:749:1: (lv_button_1_0= 'button' )
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:750:3: lv_button_1_0= 'button'
                            {
                            lv_button_1_0=(Token)input.LT(1);
                            match(input,21,FOLLOW_21_in_ruleInterAction1216); 

                                    createLeafNode(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0(), "button"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInterActionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "button", true, "button", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:770:6: (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:770:6: (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:771:5: this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )?
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInterActionAccess().getActionOnlyInteractionParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActionOnlyInteraction_in_ruleInterAction1260);
                    this_ActionOnlyInteraction_2=ruleActionOnlyInteraction();
                    _fsp--;

                     
                            current = this_ActionOnlyInteraction_2; 
                            currentNode = currentNode.getParent();
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:779:1: ( (lv_button_3_0= 'button' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==21) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:780:1: (lv_button_3_0= 'button' )
                            {
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:780:1: (lv_button_3_0= 'button' )
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:781:3: lv_button_3_0= 'button'
                            {
                            lv_button_3_0=(Token)input.LT(1);
                            match(input,21,FOLLOW_21_in_ruleInterAction1277); 

                                    createLeafNode(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0(), "button"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getInterActionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "button", true, "button", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInterAction


    // $ANTLR start entryRuleExplicitInteraction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:808:1: entryRuleExplicitInteraction returns [EObject current=null] : iv_ruleExplicitInteraction= ruleExplicitInteraction EOF ;
    public final EObject entryRuleExplicitInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitInteraction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:809:2: (iv_ruleExplicitInteraction= ruleExplicitInteraction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:810:2: iv_ruleExplicitInteraction= ruleExplicitInteraction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExplicitInteractionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction1328);
            iv_ruleExplicitInteraction=ruleExplicitInteraction();
            _fsp--;

             current =iv_ruleExplicitInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteraction1338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExplicitInteraction


    // $ANTLR start ruleExplicitInteraction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:817:1: ruleExplicitInteraction returns [EObject current=null] : (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService ) ;
    public final EObject ruleExplicitInteraction() throws RecognitionException {
        EObject current = null;

        EObject this_ExplicitInteractionActivity_0 = null;

        EObject this_ExplicitInteractionService_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:822:6: ( (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:823:1: (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:823:1: (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            else if ( (LA16_0==24||LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("823:1: (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:824:5: this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionActivityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_ruleExplicitInteraction1385);
                    this_ExplicitInteractionActivity_0=ruleExplicitInteractionActivity();
                    _fsp--;

                     
                            current = this_ExplicitInteractionActivity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:834:5: this_ExplicitInteractionService_1= ruleExplicitInteractionService
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionServiceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExplicitInteractionService_in_ruleExplicitInteraction1412);
                    this_ExplicitInteractionService_1=ruleExplicitInteractionService();
                    _fsp--;

                     
                            current = this_ExplicitInteractionService_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExplicitInteraction


    // $ANTLR start entryRuleExplicitInteractionActivity
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:850:1: entryRuleExplicitInteractionActivity returns [EObject current=null] : iv_ruleExplicitInteractionActivity= ruleExplicitInteractionActivity EOF ;
    public final EObject entryRuleExplicitInteractionActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitInteractionActivity = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:851:2: (iv_ruleExplicitInteractionActivity= ruleExplicitInteractionActivity EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:852:2: iv_ruleExplicitInteractionActivity= ruleExplicitInteractionActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExplicitInteractionActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity1447);
            iv_ruleExplicitInteractionActivity=ruleExplicitInteractionActivity();
            _fsp--;

             current =iv_ruleExplicitInteractionActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteractionActivity1457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExplicitInteractionActivity


    // $ANTLR start ruleExplicitInteractionActivity
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:859:1: ruleExplicitInteractionActivity returns [EObject current=null] : ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? ) ;
    public final EObject ruleExplicitInteractionActivity() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:864:6: ( ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:865:1: ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:865:1: ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:865:3: 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )?
            {
            match(input,22,FOLLOW_22_in_ruleExplicitInteractionActivity1492); 

                    createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getCallActivityKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:869:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:870:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:870:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:871:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExplicitInteractionActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1510); 

            		createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityCrossReference_1_0(), "dest"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:883:2: ( 'forActiom' ( ( RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:883:4: 'forActiom' ( ( RULE_ID ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleExplicitInteractionActivity1521); 

                            createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getForActiomKeyword_2_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:887:1: ( ( RULE_ID ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:888:1: ( RULE_ID )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:888:1: ( RULE_ID )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:889:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getExplicitInteractionActivityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1539); 

                    		createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getActionActionCrossReference_2_1_0(), "action"); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExplicitInteractionActivity


    // $ANTLR start entryRuleExplicitInteractionService
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:909:1: entryRuleExplicitInteractionService returns [EObject current=null] : iv_ruleExplicitInteractionService= ruleExplicitInteractionService EOF ;
    public final EObject entryRuleExplicitInteractionService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitInteractionService = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:910:2: (iv_ruleExplicitInteractionService= ruleExplicitInteractionService EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:911:2: iv_ruleExplicitInteractionService= ruleExplicitInteractionService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExplicitInteractionServiceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExplicitInteractionService_in_entryRuleExplicitInteractionService1577);
            iv_ruleExplicitInteractionService=ruleExplicitInteractionService();
            _fsp--;

             current =iv_ruleExplicitInteractionService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteractionService1587); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExplicitInteractionService


    // $ANTLR start ruleExplicitInteractionService
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:918:1: ruleExplicitInteractionService returns [EObject current=null] : (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice ) ;
    public final EObject ruleExplicitInteractionService() throws RecognitionException {
        EObject current = null;

        EObject this_UseService_0 = null;

        EObject this_Launchservice_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:923:6: ( (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:924:1: (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:924:1: (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("924:1: (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:925:5: this_UseService_0= ruleUseService
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExplicitInteractionServiceAccess().getUseServiceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUseService_in_ruleExplicitInteractionService1634);
                    this_UseService_0=ruleUseService();
                    _fsp--;

                     
                            current = this_UseService_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:935:5: this_Launchservice_1= ruleLaunchservice
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExplicitInteractionServiceAccess().getLaunchserviceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLaunchservice_in_ruleExplicitInteractionService1661);
                    this_Launchservice_1=ruleLaunchservice();
                    _fsp--;

                     
                            current = this_Launchservice_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExplicitInteractionService


    // $ANTLR start entryRuleUseService
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:951:1: entryRuleUseService returns [EObject current=null] : iv_ruleUseService= ruleUseService EOF ;
    public final EObject entryRuleUseService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseService = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:952:2: (iv_ruleUseService= ruleUseService EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:953:2: iv_ruleUseService= ruleUseService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUseServiceRule(), currentNode); 
            pushFollow(FOLLOW_ruleUseService_in_entryRuleUseService1696);
            iv_ruleUseService=ruleUseService();
            _fsp--;

             current =iv_ruleUseService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseService1706); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUseService


    // $ANTLR start ruleUseService
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:960:1: ruleUseService returns [EObject current=null] : ( 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleUseService() throws RecognitionException {
        EObject current = null;

        Token lv_arg_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:965:6: ( ( 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:966:1: ( 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:966:1: ( 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:966:3: 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )*
            {
            match(input,24,FOLLOW_24_in_ruleUseService1741); 

                    createLeafNode(grammarAccess.getUseServiceAccess().getUseServiceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:970:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:971:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:971:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:972:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUseServiceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseService1759); 

            		createLeafNode(grammarAccess.getUseServiceAccess().getDestServiceInterfaceCrossReference_1_0(), "dest"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleUseService1769); 

                    createLeafNode(grammarAccess.getUseServiceAccess().getForOpKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:988:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:989:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:989:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:990:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUseServiceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseService1787); 

            		createLeafNode(grammarAccess.getUseServiceAccess().getOperationLocalOperationCrossReference_3_0(), "operation"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1002:2: ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1002:4: 'arg=' ( (lv_arg_5_0= RULE_STRING ) )
            	    {
            	    match(input,26,FOLLOW_26_in_ruleUseService1798); 

            	            createLeafNode(grammarAccess.getUseServiceAccess().getArgKeyword_4_0(), null); 
            	        
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1006:1: ( (lv_arg_5_0= RULE_STRING ) )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1007:1: (lv_arg_5_0= RULE_STRING )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1007:1: (lv_arg_5_0= RULE_STRING )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1008:3: lv_arg_5_0= RULE_STRING
            	    {
            	    lv_arg_5_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseService1815); 

            	    			createLeafNode(grammarAccess.getUseServiceAccess().getArgSTRINGTerminalRuleCall_4_1_0(), "arg"); 
            	    		

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getUseServiceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"arg",
            	    	        		lv_arg_5_0, 
            	    	        		"STRING", 
            	    	        		lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUseService


    // $ANTLR start entryRuleLaunchservice
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1038:1: entryRuleLaunchservice returns [EObject current=null] : iv_ruleLaunchservice= ruleLaunchservice EOF ;
    public final EObject entryRuleLaunchservice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaunchservice = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1039:2: (iv_ruleLaunchservice= ruleLaunchservice EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1040:2: iv_ruleLaunchservice= ruleLaunchservice EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLaunchserviceRule(), currentNode); 
            pushFollow(FOLLOW_ruleLaunchservice_in_entryRuleLaunchservice1858);
            iv_ruleLaunchservice=ruleLaunchservice();
            _fsp--;

             current =iv_ruleLaunchservice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLaunchservice1868); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLaunchservice


    // $ANTLR start ruleLaunchservice
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1047:1: ruleLaunchservice returns [EObject current=null] : ( 'launchService' ( ( RULE_ID ) ) ) ;
    public final EObject ruleLaunchservice() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1052:6: ( ( 'launchService' ( ( RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1053:1: ( 'launchService' ( ( RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1053:1: ( 'launchService' ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1053:3: 'launchService' ( ( RULE_ID ) )
            {
            match(input,27,FOLLOW_27_in_ruleLaunchservice1903); 

                    createLeafNode(grammarAccess.getLaunchserviceAccess().getLaunchServiceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1057:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1058:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1058:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1059:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLaunchserviceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLaunchservice1921); 

            		createLeafNode(grammarAccess.getLaunchserviceAccess().getDestServiceCrossReference_1_0(), "dest"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLaunchservice


    // $ANTLR start entryRuleActionOnlyInteraction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1079:1: entryRuleActionOnlyInteraction returns [EObject current=null] : iv_ruleActionOnlyInteraction= ruleActionOnlyInteraction EOF ;
    public final EObject entryRuleActionOnlyInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionOnlyInteraction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1080:2: (iv_ruleActionOnlyInteraction= ruleActionOnlyInteraction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1081:2: iv_ruleActionOnlyInteraction= ruleActionOnlyInteraction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionOnlyInteractionRule(), currentNode); 
            pushFollow(FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction1957);
            iv_ruleActionOnlyInteraction=ruleActionOnlyInteraction();
            _fsp--;

             current =iv_ruleActionOnlyInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionOnlyInteraction1967); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleActionOnlyInteraction


    // $ANTLR start ruleActionOnlyInteraction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1088:1: ruleActionOnlyInteraction returns [EObject current=null] : ( 'execAction' ( ( RULE_ID ) ) ) ;
    public final EObject ruleActionOnlyInteraction() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1093:6: ( ( 'execAction' ( ( RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1094:1: ( 'execAction' ( ( RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1094:1: ( 'execAction' ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1094:3: 'execAction' ( ( RULE_ID ) )
            {
            match(input,28,FOLLOW_28_in_ruleActionOnlyInteraction2002); 

                    createLeafNode(grammarAccess.getActionOnlyInteractionAccess().getExecActionKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1098:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1099:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1099:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1100:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getActionOnlyInteractionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionOnlyInteraction2020); 

            		createLeafNode(grammarAccess.getActionOnlyInteractionAccess().getActionActionCrossReference_1_0(), "action"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleActionOnlyInteraction


    // $ANTLR start entryRuleAction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1120:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1121:2: (iv_ruleAction= ruleAction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1122:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2056);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2066); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1129:1: ruleAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_category_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1134:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1135:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1135:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1135:3: 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) )
            {
            match(input,20,FOLLOW_20_in_ruleAction2101); 

                    createLeafNode(grammarAccess.getActionAccess().getActionKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1139:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1140:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1140:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1141:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2118); 

            			createLeafNode(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,29,FOLLOW_29_in_ruleAction2133); 

                    createLeafNode(grammarAccess.getActionAccess().getDataKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1167:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1168:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1168:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1169:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2151); 

            		createLeafNode(grammarAccess.getActionAccess().getDataDataCrossReference_3_0(), "data"); 
            	

            }


            }

            match(input,30,FOLLOW_30_in_ruleAction2161); 

                    createLeafNode(grammarAccess.getActionAccess().getCategoryKeyword_4(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1185:1: ( (lv_category_5_0= RULE_STRING ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1186:1: (lv_category_5_0= RULE_STRING )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1186:1: (lv_category_5_0= RULE_STRING )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1187:3: lv_category_5_0= RULE_STRING
            {
            lv_category_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction2178); 

            			createLeafNode(grammarAccess.getActionAccess().getCategorySTRINGTerminalRuleCall_5_0(), "category"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"category",
            	        		lv_category_5_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleData
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1217:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1218:2: (iv_ruleData= ruleData EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1219:2: iv_ruleData= ruleData EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataRule(), currentNode); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData2219);
            iv_ruleData=ruleData();
            _fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData2229); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleData


    // $ANTLR start ruleData
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1226:1: ruleData returns [EObject current=null] : ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_scheme_3_0=null;
        Token lv_host_5_0=null;
        Token lv_port_7_0=null;
        Token lv_path_9_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1231:6: ( ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1232:1: ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1232:1: ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1232:3: 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )?
            {
            match(input,29,FOLLOW_29_in_ruleData2264); 

                    createLeafNode(grammarAccess.getDataAccess().getDataKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1236:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1237:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1237:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1238:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleData2281); 

            			createLeafNode(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,31,FOLLOW_31_in_ruleData2296); 

                    createLeafNode(grammarAccess.getDataAccess().getSchemeKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1264:1: ( (lv_scheme_3_0= RULE_STRING ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1265:1: (lv_scheme_3_0= RULE_STRING )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1265:1: (lv_scheme_3_0= RULE_STRING )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1266:3: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData2313); 

            			createLeafNode(grammarAccess.getDataAccess().getSchemeSTRINGTerminalRuleCall_3_0(), "scheme"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"scheme",
            	        		lv_scheme_3_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1288:2: ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1288:4: 'host' ( (lv_host_5_0= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleData2329); 

                            createLeafNode(grammarAccess.getDataAccess().getHostKeyword_4_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1292:1: ( (lv_host_5_0= RULE_STRING ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1293:1: (lv_host_5_0= RULE_STRING )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1293:1: (lv_host_5_0= RULE_STRING )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1294:3: lv_host_5_0= RULE_STRING
                    {
                    lv_host_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData2346); 

                    			createLeafNode(grammarAccess.getDataAccess().getHostSTRINGTerminalRuleCall_4_1_0(), "host"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"host",
                    	        		lv_host_5_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1316:4: ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1316:6: 'port' ( (lv_port_7_0= RULE_STRING ) )
                    {
                    match(input,33,FOLLOW_33_in_ruleData2364); 

                            createLeafNode(grammarAccess.getDataAccess().getPortKeyword_5_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1320:1: ( (lv_port_7_0= RULE_STRING ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1321:1: (lv_port_7_0= RULE_STRING )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1321:1: (lv_port_7_0= RULE_STRING )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1322:3: lv_port_7_0= RULE_STRING
                    {
                    lv_port_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData2381); 

                    			createLeafNode(grammarAccess.getDataAccess().getPortSTRINGTerminalRuleCall_5_1_0(), "port"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"port",
                    	        		lv_port_7_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1344:4: ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1344:6: 'path' ( (lv_path_9_0= RULE_STRING ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleData2399); 

                            createLeafNode(grammarAccess.getDataAccess().getPathKeyword_6_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1348:1: ( (lv_path_9_0= RULE_STRING ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1349:1: (lv_path_9_0= RULE_STRING )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1349:1: (lv_path_9_0= RULE_STRING )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1350:3: lv_path_9_0= RULE_STRING
                    {
                    lv_path_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData2416); 

                    			createLeafNode(grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_6_1_0(), "path"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"path",
                    	        		lv_path_9_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleData


    // $ANTLR start entryRuleApplication
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1380:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1381:2: (iv_ruleApplication= ruleApplication EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1382:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication2459);
            iv_ruleApplication=ruleApplication();
            _fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication2469); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1389:1: ruleApplication returns [EObject current=null] : ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_avd_3_0=null;
        Token lv_workDir_5_0=null;
        Token lv_target_11_0=null;
        Token lv_path_13_0=null;
        AntlrDatatypeRuleToken lv_packageName_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1394:6: ( ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1395:1: ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1395:1: ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1395:3: 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) )
            {
            match(input,35,FOLLOW_35_in_ruleApplication2504); 

                    createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1399:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1400:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1400:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1401:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2521); 

            			createLeafNode(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,36,FOLLOW_36_in_ruleApplication2536); 

                    createLeafNode(grammarAccess.getApplicationAccess().getAvdKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1427:1: ( (lv_avd_3_0= RULE_INT ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1428:1: (lv_avd_3_0= RULE_INT )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1428:1: (lv_avd_3_0= RULE_INT )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1429:3: lv_avd_3_0= RULE_INT
            {
            lv_avd_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication2553); 

            			createLeafNode(grammarAccess.getApplicationAccess().getAvdINTTerminalRuleCall_3_0(), "avd"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"avd",
            	        		lv_avd_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1451:2: ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1451:4: 'workdir' ( (lv_workDir_5_0= RULE_ID ) )
                    {
                    match(input,37,FOLLOW_37_in_ruleApplication2569); 

                            createLeafNode(grammarAccess.getApplicationAccess().getWorkdirKeyword_4_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1455:1: ( (lv_workDir_5_0= RULE_ID ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1456:1: (lv_workDir_5_0= RULE_ID )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1456:1: (lv_workDir_5_0= RULE_ID )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1457:3: lv_workDir_5_0= RULE_ID
                    {
                    lv_workDir_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2586); 

                    			createLeafNode(grammarAccess.getApplicationAccess().getWorkDirIDTerminalRuleCall_4_1_0(), "workDir"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"workDir",
                    	        		lv_workDir_5_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_ruleApplication2603); 

                    createLeafNode(grammarAccess.getApplicationAccess().getPackageKeyword_5(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1483:1: ( (lv_packageName_7_0= ruleURI ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1484:1: (lv_packageName_7_0= ruleURI )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1484:1: (lv_packageName_7_0= ruleURI )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1485:3: lv_packageName_7_0= ruleURI
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getPackageNameURIParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleApplication2624);
            lv_packageName_7_0=ruleURI();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"packageName",
            	        		lv_packageName_7_0, 
            	        		"URI", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,39,FOLLOW_39_in_ruleApplication2634); 

                    createLeafNode(grammarAccess.getApplicationAccess().getEntryActiviyKeyword_7(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1511:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1512:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1512:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1513:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2652); 

            		createLeafNode(grammarAccess.getApplicationAccess().getMainActivityActivityCrossReference_8_0(), "mainActivity"); 
            	

            }


            }

            match(input,40,FOLLOW_40_in_ruleApplication2662); 

                    createLeafNode(grammarAccess.getApplicationAccess().getTargetKeyword_9(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1529:1: ( (lv_target_11_0= RULE_INT ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1530:1: (lv_target_11_0= RULE_INT )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1530:1: (lv_target_11_0= RULE_INT )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1531:3: lv_target_11_0= RULE_INT
            {
            lv_target_11_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication2679); 

            			createLeafNode(grammarAccess.getApplicationAccess().getTargetINTTerminalRuleCall_10_0(), "target"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"target",
            	        		lv_target_11_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,34,FOLLOW_34_in_ruleApplication2694); 

                    createLeafNode(grammarAccess.getApplicationAccess().getPathKeyword_11(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1557:1: ( (lv_path_13_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1558:1: (lv_path_13_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1558:1: (lv_path_13_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1559:3: lv_path_13_0= RULE_ID
            {
            lv_path_13_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2711); 

            			createLeafNode(grammarAccess.getApplicationAccess().getPathIDTerminalRuleCall_12_0(), "path"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"path",
            	        		lv_path_13_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleURI
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1589:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1590:2: (iv_ruleURI= ruleURI EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1591:2: iv_ruleURI= ruleURI EOF
            {
             currentNode = createCompositeNode(grammarAccess.getURIRule(), currentNode); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI2753);
            iv_ruleURI=ruleURI();
            _fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI2764); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleURI


    // $ANTLR start ruleURI
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1598:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri ) ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_RestUri_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1603:6: ( (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1604:1: (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1604:1: (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1604:6: this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI2804); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getURIAccess().getIDTerminalRuleCall_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,41,FOLLOW_41_in_ruleURI2822); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getURIAccess().getFullStopKeyword_1(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getURIAccess().getRestUriParserRuleCall_2(), currentNode); 
                
            pushFollow(FOLLOW_ruleRestUri_in_ruleURI2844);
            this_RestUri_2=ruleRestUri();
            _fsp--;


            		current.merge(this_RestUri_2);
                
             
                    currentNode = currentNode.getParent();
                

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleURI


    // $ANTLR start entryRuleRestUri
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1636:1: entryRuleRestUri returns [String current=null] : iv_ruleRestUri= ruleRestUri EOF ;
    public final String entryRuleRestUri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRestUri = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1637:2: (iv_ruleRestUri= ruleRestUri EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1638:2: iv_ruleRestUri= ruleRestUri EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestUriRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestUri_in_entryRuleRestUri2890);
            iv_ruleRestUri=ruleRestUri();
            _fsp--;

             current =iv_ruleRestUri.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestUri2901); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRestUri


    // $ANTLR start ruleRestUri
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1645:1: ruleRestUri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_URI_1= ruleURI ) ;
    public final AntlrDatatypeRuleToken ruleRestUri() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_URI_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1650:6: ( (this_ID_0= RULE_ID | this_URI_1= ruleURI ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1651:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1651:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==41) ) {
                    alt24=2;
                }
                else if ( (LA24_1==EOF||LA24_1==39) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1651:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1651:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1651:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestUri2941); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getRestUriAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1660:5: this_URI_1= ruleURI
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRestUriAccess().getURIParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleURI_in_ruleRestUri2974);
                    this_URI_1=ruleURI();
                    _fsp--;


                    		current.merge(this_URI_1);
                        
                     
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRestUri


    // $ANTLR start ruleInputType
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1678:1: ruleInputType returns [Enumerator current=null] : ( ( 'String' ) | ( 'int' ) | ( 'double' ) ) ;
    public final Enumerator ruleInputType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1682:6: ( ( ( 'String' ) | ( 'int' ) | ( 'double' ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1683:1: ( ( 'String' ) | ( 'int' ) | ( 'double' ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1683:1: ( ( 'String' ) | ( 'int' ) | ( 'double' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt25=1;
                }
                break;
            case 43:
                {
                alt25=2;
                }
                break;
            case 44:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1683:1: ( ( 'String' ) | ( 'int' ) | ( 'double' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1683:2: ( 'String' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1683:2: ( 'String' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1683:4: 'String'
                    {
                    match(input,42,FOLLOW_42_in_ruleInputType3031); 

                            current = grammarAccess.getInputTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getInputTypeAccess().getStringEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1689:6: ( 'int' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1689:6: ( 'int' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1689:8: 'int'
                    {
                    match(input,43,FOLLOW_43_in_ruleInputType3046); 

                            current = grammarAccess.getInputTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getInputTypeAccess().getIntEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1695:6: ( 'double' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1695:6: ( 'double' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1695:8: 'double'
                    {
                    match(input,44,FOLLOW_44_in_ruleInputType3061); 

                            current = grammarAccess.getInputTypeAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getInputTypeAccess().getDoubleEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInputType


 

    public static final BitSet FOLLOW_ruleAndroidSystem_in_entryRuleAndroidSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_ruleAndroidSystem131 = new BitSet(new long[]{0x0000000820150800L});
    public static final BitSet FOLLOW_ruleAction_in_ruleAndroidSystem153 = new BitSet(new long[]{0x0000000800150800L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_ruleAndroidSystem175 = new BitSet(new long[]{0x0000000800050800L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleAndroidSystem197 = new BitSet(new long[]{0x0000000800050000L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidSystem219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleComponent312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleComponent339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_entryRuleServiceInterface374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceInterface384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleServiceInterface419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceInterface436 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleLocalOperation_in_ruleServiceInterface462 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleLocalOperation_in_entryRuleLocalOperation499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalOperation509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLocalOperation544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalOperation561 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLocalOperation576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLocalOperation593 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleLocalOperation609 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_ruleInputType_in_ruleLocalOperation630 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLocalOperation640 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleService723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService740 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleService755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService773 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_ruleService794 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleActivity876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity893 = new BitSet(new long[]{0x0000000019580002L});
    public static final BitSet FOLLOW_19_in_ruleActivity916 = new BitSet(new long[]{0x0000000019500002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_ruleActivity951 = new BitSet(new long[]{0x0000000019500002L});
    public static final BitSet FOLLOW_ruleInterAction_in_ruleActivity973 = new BitSet(new long[]{0x0000000019400002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_entryRuleLocalAction1010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAction1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleLocalAction1055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalAction1073 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleLocalAction1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterAction_in_entryRuleInterAction1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterAction1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_ruleInterAction1199 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleInterAction1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_ruleInterAction1260 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleInterAction1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteraction1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_ruleExplicitInteraction1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_ruleExplicitInteraction1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteractionActivity1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleExplicitInteractionActivity1492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1510 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleExplicitInteractionActivity1521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_entryRuleExplicitInteractionService1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteractionService1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseService_in_ruleExplicitInteractionService1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLaunchservice_in_ruleExplicitInteractionService1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseService_in_entryRuleUseService1696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseService1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleUseService1741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseService1759 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleUseService1769 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseService1787 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleUseService1798 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseService1815 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleLaunchservice_in_entryRuleLaunchservice1858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLaunchservice1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLaunchservice1903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLaunchservice1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionOnlyInteraction1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleActionOnlyInteraction2002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionOnlyInteraction2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAction2101 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2118 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAction2133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2151 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAction2161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData2219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleData2264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleData2281 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleData2296 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData2313 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_32_in_ruleData2329 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData2346 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33_in_ruleData2364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData2381 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleData2399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication2459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleApplication2504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2521 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleApplication2536 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication2553 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_ruleApplication2569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2586 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleApplication2603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleURI_in_ruleApplication2624 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleApplication2634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2652 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleApplication2662 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication2679 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleApplication2694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI2753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI2804 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleURI2822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRestUri_in_ruleURI2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestUri_in_entryRuleRestUri2890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestUri2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestUri2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_ruleRestUri2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleInputType3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInputType3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInputType3061 = new BitSet(new long[]{0x0000000000000002L});

}