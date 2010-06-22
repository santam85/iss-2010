package it.unibo.madz.mobile.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ServiceInterface'", "'Service'", "'implements'", "'Activity'", "'launchable'", "'action'", "'button'", "'callActivity'", "'forActiom'", "'execAction'", "'data'", "'category'", "'scheme'", "'host'", "'port'", "'path'", "'Application'", "'avd'", "'workdir'", "'package'", "'entryActiviy'", "'target'", "'.'"
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:77:1: entryRuleAndroidSystem returns [EObject current=null] : iv_ruleAndroidSystem= ruleAndroidSystem EOF ;
    public final EObject entryRuleAndroidSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndroidSystem = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:78:2: (iv_ruleAndroidSystem= ruleAndroidSystem EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:79:2: iv_ruleAndroidSystem= ruleAndroidSystem EOF
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:86:1: ruleAndroidSystem returns [EObject current=null] : ( ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) ) ) ;
    public final EObject ruleAndroidSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_data_0_0 = null;

        EObject lv_action_1_0 = null;

        EObject lv_serviceInterface_2_0 = null;

        EObject lv_component_3_0 = null;

        EObject lv_application_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:91:6: ( ( ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:92:1: ( ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:92:1: ( ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:92:2: ( (lv_data_0_0= ruleData ) )* ( (lv_action_1_0= ruleAction ) )* ( (lv_serviceInterface_2_0= ruleServiceInterface ) )* ( (lv_component_3_0= ruleComponent ) )* ( (lv_application_4_0= ruleApplication ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:92:2: ( (lv_data_0_0= ruleData ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:93:1: (lv_data_0_0= ruleData )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:93:1: (lv_data_0_0= ruleData )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:94:3: lv_data_0_0= ruleData
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:116:3: ( (lv_action_1_0= ruleAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:117:1: (lv_action_1_0= ruleAction )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:117:1: (lv_action_1_0= ruleAction )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:118:3: lv_action_1_0= ruleAction
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:140:3: ( (lv_serviceInterface_2_0= ruleServiceInterface ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:141:1: (lv_serviceInterface_2_0= ruleServiceInterface )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:141:1: (lv_serviceInterface_2_0= ruleServiceInterface )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:142:3: lv_serviceInterface_2_0= ruleServiceInterface
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:164:3: ( (lv_component_3_0= ruleComponent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:165:1: (lv_component_3_0= ruleComponent )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:165:1: (lv_component_3_0= ruleComponent )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:166:3: lv_component_3_0= ruleComponent
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:188:3: ( (lv_application_4_0= ruleApplication ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:189:1: (lv_application_4_0= ruleApplication )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:189:1: (lv_application_4_0= ruleApplication )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:190:3: lv_application_4_0= ruleApplication
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:220:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:221:2: (iv_ruleComponent= ruleComponent EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:222:2: iv_ruleComponent= ruleComponent EOF
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:229:1: ruleComponent returns [EObject current=null] : (this_Activity_0= ruleActivity | this_Service_1= ruleService ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_Service_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:234:6: ( (this_Activity_0= ruleActivity | this_Service_1= ruleService ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:235:1: (this_Activity_0= ruleActivity | this_Service_1= ruleService )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:235:1: (this_Activity_0= ruleActivity | this_Service_1= ruleService )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("235:1: (this_Activity_0= ruleActivity | this_Service_1= ruleService )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:236:5: this_Activity_0= ruleActivity
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
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:246:5: this_Service_1= ruleService
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:262:1: entryRuleServiceInterface returns [EObject current=null] : iv_ruleServiceInterface= ruleServiceInterface EOF ;
    public final EObject entryRuleServiceInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceInterface = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:263:2: (iv_ruleServiceInterface= ruleServiceInterface EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:264:2: iv_ruleServiceInterface= ruleServiceInterface EOF
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:271:1: ruleServiceInterface returns [EObject current=null] : ( 'ServiceInterface' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleServiceInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:276:6: ( ( 'ServiceInterface' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:277:1: ( 'ServiceInterface' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:277:1: ( 'ServiceInterface' ( (lv_name_1_0= RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:277:3: 'ServiceInterface' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,11,FOLLOW_11_in_ruleServiceInterface419); 

                    createLeafNode(grammarAccess.getServiceInterfaceAccess().getServiceInterfaceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:281:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:282:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:282:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:283:3: lv_name_1_0= RULE_ID
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


    // $ANTLR start entryRuleService
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:313:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:314:2: (iv_ruleService= ruleService EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:315:2: iv_ruleService= ruleService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceRule(), currentNode); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService477);
            iv_ruleService=ruleService();
            _fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService487); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:322:1: ruleService returns [EObject current=null] : ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:327:6: ( ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:328:1: ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:328:1: ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:328:3: 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) )
            {
            match(input,12,FOLLOW_12_in_ruleService522); 

                    createLeafNode(grammarAccess.getServiceAccess().getServiceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:332:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:333:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:333:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:334:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService539); 

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

            match(input,13,FOLLOW_13_in_ruleService554); 

                    createLeafNode(grammarAccess.getServiceAccess().getImplementsKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:360:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:361:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:361:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:362:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService572); 

            		createLeafNode(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceCrossReference_3_0(), "interface"); 
            	

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
    // $ANTLR end ruleService


    // $ANTLR start entryRuleActivity
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:382:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:383:2: (iv_ruleActivity= ruleActivity EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:384:2: iv_ruleActivity= ruleActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity608);
            iv_ruleActivity=ruleActivity();
            _fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity618); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:391:1: ruleActivity returns [EObject current=null] : ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_launchable_2_0=null;
        EObject lv_actions_3_0 = null;

        EObject lv_interactions_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:396:6: ( ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:397:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:397:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:397:3: 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )*
            {
            match(input,14,FOLLOW_14_in_ruleActivity653); 

                    createLeafNode(grammarAccess.getActivityAccess().getActivityKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:401:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:402:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:402:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:403:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity670); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:425:2: ( (lv_launchable_2_0= 'launchable' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:426:1: (lv_launchable_2_0= 'launchable' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:426:1: (lv_launchable_2_0= 'launchable' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:427:3: lv_launchable_2_0= 'launchable'
                    {
                    lv_launchable_2_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_ruleActivity693); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:446:3: ( (lv_actions_3_0= ruleLocalAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:447:1: (lv_actions_3_0= ruleLocalAction )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:447:1: (lv_actions_3_0= ruleLocalAction )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:448:3: lv_actions_3_0= ruleLocalAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getActionsLocalActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocalAction_in_ruleActivity728);
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
            	    break loop7;
                }
            } while (true);

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:470:3: ( (lv_interactions_4_0= ruleInterAction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18||LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:471:1: (lv_interactions_4_0= ruleInterAction )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:471:1: (lv_interactions_4_0= ruleInterAction )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:472:3: lv_interactions_4_0= ruleInterAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getInteractionsInterActionParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterAction_in_ruleActivity750);
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
    // $ANTLR end ruleActivity


    // $ANTLR start entryRuleLocalAction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:502:1: entryRuleLocalAction returns [EObject current=null] : iv_ruleLocalAction= ruleLocalAction EOF ;
    public final EObject entryRuleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:503:2: (iv_ruleLocalAction= ruleLocalAction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:504:2: iv_ruleLocalAction= ruleLocalAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocalActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalAction_in_entryRuleLocalAction787);
            iv_ruleLocalAction=ruleLocalAction();
            _fsp--;

             current =iv_ruleLocalAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAction797); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:511:1: ruleLocalAction returns [EObject current=null] : ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? ) ;
    public final EObject ruleLocalAction() throws RecognitionException {
        EObject current = null;

        Token lv_button_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:516:6: ( ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:517:1: ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:517:1: ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:517:3: 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )?
            {
            match(input,16,FOLLOW_16_in_ruleLocalAction832); 

                    createLeafNode(grammarAccess.getLocalActionAccess().getActionKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:521:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:522:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:522:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:523:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLocalActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalAction850); 

            		createLeafNode(grammarAccess.getLocalActionAccess().getActionActionCrossReference_1_0(), "action"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:535:2: ( (lv_button_2_0= 'button' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:536:1: (lv_button_2_0= 'button' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:536:1: (lv_button_2_0= 'button' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:537:3: lv_button_2_0= 'button'
                    {
                    lv_button_2_0=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleLocalAction868); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:564:1: entryRuleInterAction returns [EObject current=null] : iv_ruleInterAction= ruleInterAction EOF ;
    public final EObject entryRuleInterAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterAction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:565:2: (iv_ruleInterAction= ruleInterAction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:566:2: iv_ruleInterAction= ruleInterAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterAction_in_entryRuleInterAction918);
            iv_ruleInterAction=ruleInterAction();
            _fsp--;

             current =iv_ruleInterAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterAction928); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:573:1: ruleInterAction returns [EObject current=null] : ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) ) ;
    public final EObject ruleInterAction() throws RecognitionException {
        EObject current = null;

        Token lv_button_1_0=null;
        Token lv_button_3_0=null;
        EObject this_ExplicitInteraction_0 = null;

        EObject this_ActionOnlyInteraction_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:578:6: ( ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:579:1: ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:579:1: ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("579:1: ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:579:2: (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:579:2: (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:580:5: this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )?
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInterActionAccess().getExplicitInteractionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExplicitInteraction_in_ruleInterAction976);
                    this_ExplicitInteraction_0=ruleExplicitInteraction();
                    _fsp--;

                     
                            current = this_ExplicitInteraction_0; 
                            currentNode = currentNode.getParent();
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:588:1: ( (lv_button_1_0= 'button' ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==17) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:589:1: (lv_button_1_0= 'button' )
                            {
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:589:1: (lv_button_1_0= 'button' )
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:590:3: lv_button_1_0= 'button'
                            {
                            lv_button_1_0=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleInterAction993); 

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
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:610:6: (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:610:6: (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:611:5: this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )?
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInterActionAccess().getActionOnlyInteractionParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActionOnlyInteraction_in_ruleInterAction1037);
                    this_ActionOnlyInteraction_2=ruleActionOnlyInteraction();
                    _fsp--;

                     
                            current = this_ActionOnlyInteraction_2; 
                            currentNode = currentNode.getParent();
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:619:1: ( (lv_button_3_0= 'button' ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==17) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:620:1: (lv_button_3_0= 'button' )
                            {
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:620:1: (lv_button_3_0= 'button' )
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:621:3: lv_button_3_0= 'button'
                            {
                            lv_button_3_0=(Token)input.LT(1);
                            match(input,17,FOLLOW_17_in_ruleInterAction1054); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:648:1: entryRuleExplicitInteraction returns [EObject current=null] : iv_ruleExplicitInteraction= ruleExplicitInteraction EOF ;
    public final EObject entryRuleExplicitInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitInteraction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:649:2: (iv_ruleExplicitInteraction= ruleExplicitInteraction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:650:2: iv_ruleExplicitInteraction= ruleExplicitInteraction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExplicitInteractionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction1105);
            iv_ruleExplicitInteraction=ruleExplicitInteraction();
            _fsp--;

             current =iv_ruleExplicitInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteraction1115); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:657:1: ruleExplicitInteraction returns [EObject current=null] : this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity ;
    public final EObject ruleExplicitInteraction() throws RecognitionException {
        EObject current = null;

        EObject this_ExplicitInteractionActivity_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:662:6: (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:664:5: this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionActivityParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_ruleExplicitInteraction1161);
            this_ExplicitInteractionActivity_0=ruleExplicitInteractionActivity();
            _fsp--;

             
                    current = this_ExplicitInteractionActivity_0; 
                    currentNode = currentNode.getParent();
                

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:680:1: entryRuleExplicitInteractionActivity returns [EObject current=null] : iv_ruleExplicitInteractionActivity= ruleExplicitInteractionActivity EOF ;
    public final EObject entryRuleExplicitInteractionActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitInteractionActivity = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:681:2: (iv_ruleExplicitInteractionActivity= ruleExplicitInteractionActivity EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:682:2: iv_ruleExplicitInteractionActivity= ruleExplicitInteractionActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExplicitInteractionActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity1195);
            iv_ruleExplicitInteractionActivity=ruleExplicitInteractionActivity();
            _fsp--;

             current =iv_ruleExplicitInteractionActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteractionActivity1205); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:689:1: ruleExplicitInteractionActivity returns [EObject current=null] : ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? ) ;
    public final EObject ruleExplicitInteractionActivity() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:694:6: ( ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:695:1: ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:695:1: ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:695:3: 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )?
            {
            match(input,18,FOLLOW_18_in_ruleExplicitInteractionActivity1240); 

                    createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getCallActivityKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:699:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:700:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:700:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:701:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExplicitInteractionActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1258); 

            		createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityCrossReference_1_0(), "dest"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:713:2: ( 'forActiom' ( ( RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:713:4: 'forActiom' ( ( RULE_ID ) )
                    {
                    match(input,19,FOLLOW_19_in_ruleExplicitInteractionActivity1269); 

                            createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getForActiomKeyword_2_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:717:1: ( ( RULE_ID ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:718:1: ( RULE_ID )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:718:1: ( RULE_ID )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:719:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getExplicitInteractionActivityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1287); 

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


    // $ANTLR start entryRuleActionOnlyInteraction
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:739:1: entryRuleActionOnlyInteraction returns [EObject current=null] : iv_ruleActionOnlyInteraction= ruleActionOnlyInteraction EOF ;
    public final EObject entryRuleActionOnlyInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionOnlyInteraction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:740:2: (iv_ruleActionOnlyInteraction= ruleActionOnlyInteraction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:741:2: iv_ruleActionOnlyInteraction= ruleActionOnlyInteraction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionOnlyInteractionRule(), currentNode); 
            pushFollow(FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction1325);
            iv_ruleActionOnlyInteraction=ruleActionOnlyInteraction();
            _fsp--;

             current =iv_ruleActionOnlyInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionOnlyInteraction1335); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:748:1: ruleActionOnlyInteraction returns [EObject current=null] : ( 'execAction' ( ( RULE_ID ) ) ) ;
    public final EObject ruleActionOnlyInteraction() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:753:6: ( ( 'execAction' ( ( RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:754:1: ( 'execAction' ( ( RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:754:1: ( 'execAction' ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:754:3: 'execAction' ( ( RULE_ID ) )
            {
            match(input,20,FOLLOW_20_in_ruleActionOnlyInteraction1370); 

                    createLeafNode(grammarAccess.getActionOnlyInteractionAccess().getExecActionKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:758:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:759:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:759:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:760:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getActionOnlyInteractionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionOnlyInteraction1388); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:780:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:781:2: (iv_ruleAction= ruleAction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:782:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1424);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1434); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:789:1: ruleAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_category_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:794:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:795:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:795:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:795:3: 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) )
            {
            match(input,16,FOLLOW_16_in_ruleAction1469); 

                    createLeafNode(grammarAccess.getActionAccess().getActionKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:799:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:800:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:800:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:801:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction1486); 

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

            match(input,21,FOLLOW_21_in_ruleAction1501); 

                    createLeafNode(grammarAccess.getActionAccess().getDataKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:827:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:828:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:828:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:829:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction1519); 

            		createLeafNode(grammarAccess.getActionAccess().getDataDataCrossReference_3_0(), "data"); 
            	

            }


            }

            match(input,22,FOLLOW_22_in_ruleAction1529); 

                    createLeafNode(grammarAccess.getActionAccess().getCategoryKeyword_4(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:845:1: ( (lv_category_5_0= RULE_STRING ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:846:1: (lv_category_5_0= RULE_STRING )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:846:1: (lv_category_5_0= RULE_STRING )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:847:3: lv_category_5_0= RULE_STRING
            {
            lv_category_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction1546); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:877:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:878:2: (iv_ruleData= ruleData EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:879:2: iv_ruleData= ruleData EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataRule(), currentNode); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData1587);
            iv_ruleData=ruleData();
            _fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData1597); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:886:1: ruleData returns [EObject current=null] : ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_scheme_3_0=null;
        Token lv_host_5_0=null;
        Token lv_port_7_0=null;
        Token lv_path_9_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:891:6: ( ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:892:1: ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:892:1: ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:892:3: 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )?
            {
            match(input,21,FOLLOW_21_in_ruleData1632); 

                    createLeafNode(grammarAccess.getDataAccess().getDataKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:896:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:897:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:897:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:898:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleData1649); 

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

            match(input,23,FOLLOW_23_in_ruleData1664); 

                    createLeafNode(grammarAccess.getDataAccess().getSchemeKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:924:1: ( (lv_scheme_3_0= RULE_STRING ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:925:1: (lv_scheme_3_0= RULE_STRING )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:925:1: (lv_scheme_3_0= RULE_STRING )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:926:3: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData1681); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:948:2: ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:948:4: 'host' ( (lv_host_5_0= RULE_STRING ) )
                    {
                    match(input,24,FOLLOW_24_in_ruleData1697); 

                            createLeafNode(grammarAccess.getDataAccess().getHostKeyword_4_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:952:1: ( (lv_host_5_0= RULE_STRING ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:953:1: (lv_host_5_0= RULE_STRING )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:953:1: (lv_host_5_0= RULE_STRING )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:954:3: lv_host_5_0= RULE_STRING
                    {
                    lv_host_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData1714); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:976:4: ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:976:6: 'port' ( (lv_port_7_0= RULE_STRING ) )
                    {
                    match(input,25,FOLLOW_25_in_ruleData1732); 

                            createLeafNode(grammarAccess.getDataAccess().getPortKeyword_5_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:980:1: ( (lv_port_7_0= RULE_STRING ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:981:1: (lv_port_7_0= RULE_STRING )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:981:1: (lv_port_7_0= RULE_STRING )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:982:3: lv_port_7_0= RULE_STRING
                    {
                    lv_port_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData1749); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1004:4: ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1004:6: 'path' ( (lv_path_9_0= RULE_STRING ) )
                    {
                    match(input,26,FOLLOW_26_in_ruleData1767); 

                            createLeafNode(grammarAccess.getDataAccess().getPathKeyword_6_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1008:1: ( (lv_path_9_0= RULE_STRING ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1009:1: (lv_path_9_0= RULE_STRING )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1009:1: (lv_path_9_0= RULE_STRING )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1010:3: lv_path_9_0= RULE_STRING
                    {
                    lv_path_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData1784); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1040:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1041:2: (iv_ruleApplication= ruleApplication EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1042:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication1827);
            iv_ruleApplication=ruleApplication();
            _fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication1837); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1049:1: ruleApplication returns [EObject current=null] : ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) ) ;
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
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1054:6: ( ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1055:1: ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1055:1: ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1055:3: 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) )
            {
            match(input,27,FOLLOW_27_in_ruleApplication1872); 

                    createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1059:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1060:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1060:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1061:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication1889); 

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

            match(input,28,FOLLOW_28_in_ruleApplication1904); 

                    createLeafNode(grammarAccess.getApplicationAccess().getAvdKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1087:1: ( (lv_avd_3_0= RULE_INT ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1088:1: (lv_avd_3_0= RULE_INT )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1088:1: (lv_avd_3_0= RULE_INT )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1089:3: lv_avd_3_0= RULE_INT
            {
            lv_avd_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication1921); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1111:2: ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1111:4: 'workdir' ( (lv_workDir_5_0= RULE_ID ) )
                    {
                    match(input,29,FOLLOW_29_in_ruleApplication1937); 

                            createLeafNode(grammarAccess.getApplicationAccess().getWorkdirKeyword_4_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1115:1: ( (lv_workDir_5_0= RULE_ID ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1116:1: (lv_workDir_5_0= RULE_ID )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1116:1: (lv_workDir_5_0= RULE_ID )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1117:3: lv_workDir_5_0= RULE_ID
                    {
                    lv_workDir_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication1954); 

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

            match(input,30,FOLLOW_30_in_ruleApplication1971); 

                    createLeafNode(grammarAccess.getApplicationAccess().getPackageKeyword_5(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1143:1: ( (lv_packageName_7_0= ruleURI ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1144:1: (lv_packageName_7_0= ruleURI )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1144:1: (lv_packageName_7_0= ruleURI )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1145:3: lv_packageName_7_0= ruleURI
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getPackageNameURIParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleApplication1992);
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

            match(input,31,FOLLOW_31_in_ruleApplication2002); 

                    createLeafNode(grammarAccess.getApplicationAccess().getEntryActiviyKeyword_7(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1171:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1172:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1172:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1173:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2020); 

            		createLeafNode(grammarAccess.getApplicationAccess().getMainActivityActivityCrossReference_8_0(), "mainActivity"); 
            	

            }


            }

            match(input,32,FOLLOW_32_in_ruleApplication2030); 

                    createLeafNode(grammarAccess.getApplicationAccess().getTargetKeyword_9(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1189:1: ( (lv_target_11_0= RULE_INT ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1190:1: (lv_target_11_0= RULE_INT )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1190:1: (lv_target_11_0= RULE_INT )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1191:3: lv_target_11_0= RULE_INT
            {
            lv_target_11_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication2047); 

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

            match(input,26,FOLLOW_26_in_ruleApplication2062); 

                    createLeafNode(grammarAccess.getApplicationAccess().getPathKeyword_11(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1217:1: ( (lv_path_13_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1218:1: (lv_path_13_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1218:1: (lv_path_13_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1219:3: lv_path_13_0= RULE_ID
            {
            lv_path_13_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2079); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1249:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1250:2: (iv_ruleURI= ruleURI EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1251:2: iv_ruleURI= ruleURI EOF
            {
             currentNode = createCompositeNode(grammarAccess.getURIRule(), currentNode); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI2121);
            iv_ruleURI=ruleURI();
            _fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI2132); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1258:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri ) ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_RestUri_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1263:6: ( (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1264:1: (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1264:1: (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1264:6: this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI2172); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getURIAccess().getIDTerminalRuleCall_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,33,FOLLOW_33_in_ruleURI2190); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getURIAccess().getFullStopKeyword_1(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getURIAccess().getRestUriParserRuleCall_2(), currentNode); 
                
            pushFollow(FOLLOW_ruleRestUri_in_ruleURI2212);
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1296:1: entryRuleRestUri returns [String current=null] : iv_ruleRestUri= ruleRestUri EOF ;
    public final String entryRuleRestUri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRestUri = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1297:2: (iv_ruleRestUri= ruleRestUri EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1298:2: iv_ruleRestUri= ruleRestUri EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestUriRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestUri_in_entryRuleRestUri2258);
            iv_ruleRestUri=ruleRestUri();
            _fsp--;

             current =iv_ruleRestUri.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestUri2269); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1305:1: ruleRestUri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_URI_1= ruleURI ) ;
    public final AntlrDatatypeRuleToken ruleRestUri() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_URI_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1310:6: ( (this_ID_0= RULE_ID | this_URI_1= ruleURI ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1311:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1311:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==33) ) {
                    alt18=2;
                }
                else if ( (LA18_1==EOF||LA18_1==31) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1311:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1311:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1311:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestUri2309); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getRestUriAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1320:5: this_URI_1= ruleURI
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRestUriAccess().getURIParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleURI_in_ruleRestUri2342);
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


 

    public static final BitSet FOLLOW_ruleAndroidSystem_in_entryRuleAndroidSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndroidSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_ruleAndroidSystem131 = new BitSet(new long[]{0x0000000008215800L});
    public static final BitSet FOLLOW_ruleAction_in_ruleAndroidSystem153 = new BitSet(new long[]{0x0000000008015800L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_ruleAndroidSystem175 = new BitSet(new long[]{0x0000000008005800L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleAndroidSystem197 = new BitSet(new long[]{0x0000000008005000L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidSystem219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleComponent312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleComponent339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_entryRuleServiceInterface374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceInterface384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleServiceInterface419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceInterface436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleService522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService539 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleService554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActivity653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity670 = new BitSet(new long[]{0x0000000000158002L});
    public static final BitSet FOLLOW_15_in_ruleActivity693 = new BitSet(new long[]{0x0000000000150002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_ruleActivity728 = new BitSet(new long[]{0x0000000000150002L});
    public static final BitSet FOLLOW_ruleInterAction_in_ruleActivity750 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_entryRuleLocalAction787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAction797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleLocalAction832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalAction850 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleLocalAction868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterAction_in_entryRuleInterAction918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterAction928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_ruleInterAction976 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleInterAction993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_ruleInterAction1037 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleInterAction1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteraction1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_ruleExplicitInteraction1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity1195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteractionActivity1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleExplicitInteractionActivity1240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1258 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleExplicitInteractionActivity1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionOnlyInteraction1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleActionOnlyInteraction1370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionOnlyInteraction1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAction1469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction1486 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAction1501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction1519 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAction1529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleData1632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleData1649 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleData1664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData1681 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_24_in_ruleData1697 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData1714 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleData1732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData1749 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleData1767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleApplication1872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication1889 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleApplication1904 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication1921 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleApplication1937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication1954 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleApplication1971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleURI_in_ruleApplication1992 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleApplication2002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2020 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleApplication2030 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication2047 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleApplication2062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI2121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI2172 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleURI2190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRestUri_in_ruleURI2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestUri_in_entryRuleRestUri2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestUri2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestUri2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_ruleRestUri2342 = new BitSet(new long[]{0x0000000000000002L});

}