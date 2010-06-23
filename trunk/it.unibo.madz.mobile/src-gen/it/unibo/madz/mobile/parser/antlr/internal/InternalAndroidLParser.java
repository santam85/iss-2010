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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AndroidSystem'", "'serviceInterface'", "'op'", "'return'", "'inputType'", "';'", "'Service'", "'implements'", "'Activity'", "'launchable'", "'action'", "'button'", "'callActivity'", "'forActiom'", "'useService'", "'forOp'", "'arg='", "'launchService'", "'execAction'", "'data'", "'category'", "'scheme'", "'host'", "'port'", "'path'", "'Application'", "'avd'", "'workdir'", "'package'", "'entryActiviy'", "'target'", "'.'", "'String'", "'int'", "'double'"
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:87:1: ruleAndroidSystem returns [EObject current=null] : ( 'AndroidSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )* ( (lv_action_3_0= ruleAction ) )* ( (lv_serviceInterface_4_0= ruleServiceInterface ) )* ( (lv_component_5_0= ruleComponent ) )* ( (lv_application_6_0= ruleApplication ) ) ) ;
    public final EObject ruleAndroidSystem() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_data_2_0 = null;

        EObject lv_action_3_0 = null;

        EObject lv_serviceInterface_4_0 = null;

        EObject lv_component_5_0 = null;

        EObject lv_application_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:92:6: ( ( 'AndroidSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )* ( (lv_action_3_0= ruleAction ) )* ( (lv_serviceInterface_4_0= ruleServiceInterface ) )* ( (lv_component_5_0= ruleComponent ) )* ( (lv_application_6_0= ruleApplication ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:93:1: ( 'AndroidSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )* ( (lv_action_3_0= ruleAction ) )* ( (lv_serviceInterface_4_0= ruleServiceInterface ) )* ( (lv_component_5_0= ruleComponent ) )* ( (lv_application_6_0= ruleApplication ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:93:1: ( 'AndroidSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )* ( (lv_action_3_0= ruleAction ) )* ( (lv_serviceInterface_4_0= ruleServiceInterface ) )* ( (lv_component_5_0= ruleComponent ) )* ( (lv_application_6_0= ruleApplication ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:93:3: 'AndroidSystem' ( (lv_name_1_0= RULE_ID ) ) ( (lv_data_2_0= ruleData ) )* ( (lv_action_3_0= ruleAction ) )* ( (lv_serviceInterface_4_0= ruleServiceInterface ) )* ( (lv_component_5_0= ruleComponent ) )* ( (lv_application_6_0= ruleApplication ) )
            {
            match(input,11,FOLLOW_11_in_ruleAndroidSystem120); 

                    createLeafNode(grammarAccess.getAndroidSystemAccess().getAndroidSystemKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:97:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:98:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:98:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:99:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAndroidSystem137); 

            			createLeafNode(grammarAccess.getAndroidSystemAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:121:2: ( (lv_data_2_0= ruleData ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:122:1: (lv_data_2_0= ruleData )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:122:1: (lv_data_2_0= ruleData )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:123:3: lv_data_2_0= ruleData
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getDataDataParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleData_in_ruleAndroidSystem163);
            	    lv_data_2_0=ruleData();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"data",
            	    	        		lv_data_2_0, 
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:145:3: ( (lv_action_3_0= ruleAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:146:1: (lv_action_3_0= ruleAction )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:146:1: (lv_action_3_0= ruleAction )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:147:3: lv_action_3_0= ruleAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getActionActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleAndroidSystem185);
            	    lv_action_3_0=ruleAction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"action",
            	    	        		lv_action_3_0, 
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:169:3: ( (lv_serviceInterface_4_0= ruleServiceInterface ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:170:1: (lv_serviceInterface_4_0= ruleServiceInterface )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:170:1: (lv_serviceInterface_4_0= ruleServiceInterface )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:171:3: lv_serviceInterface_4_0= ruleServiceInterface
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getServiceInterfaceServiceInterfaceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceInterface_in_ruleAndroidSystem207);
            	    lv_serviceInterface_4_0=ruleServiceInterface();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"serviceInterface",
            	    	        		lv_serviceInterface_4_0, 
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:193:3: ( (lv_component_5_0= ruleComponent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:194:1: (lv_component_5_0= ruleComponent )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:194:1: (lv_component_5_0= ruleComponent )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:195:3: lv_component_5_0= ruleComponent
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getComponentComponentParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleAndroidSystem229);
            	    lv_component_5_0=ruleComponent();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"component",
            	    	        		lv_component_5_0, 
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:217:3: ( (lv_application_6_0= ruleApplication ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:218:1: (lv_application_6_0= ruleApplication )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:218:1: (lv_application_6_0= ruleApplication )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:219:3: lv_application_6_0= ruleApplication
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getApplicationApplicationParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleApplication_in_ruleAndroidSystem251);
            lv_application_6_0=ruleApplication();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"application",
            	        		lv_application_6_0, 
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:249:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:250:2: (iv_ruleComponent= ruleComponent EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:251:2: iv_ruleComponent= ruleComponent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComponentRule(), currentNode); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent287);
            iv_ruleComponent=ruleComponent();
            _fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent297); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:258:1: ruleComponent returns [EObject current=null] : (this_Activity_0= ruleActivity | this_Service_1= ruleService ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Activity_0 = null;

        EObject this_Service_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:263:6: ( (this_Activity_0= ruleActivity | this_Service_1= ruleService ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:264:1: (this_Activity_0= ruleActivity | this_Service_1= ruleService )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:264:1: (this_Activity_0= ruleActivity | this_Service_1= ruleService )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("264:1: (this_Activity_0= ruleActivity | this_Service_1= ruleService )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:265:5: this_Activity_0= ruleActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComponentAccess().getActivityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActivity_in_ruleComponent344);
                    this_Activity_0=ruleActivity();
                    _fsp--;

                     
                            current = this_Activity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:275:5: this_Service_1= ruleService
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getComponentAccess().getServiceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleComponent371);
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:291:1: entryRuleServiceInterface returns [EObject current=null] : iv_ruleServiceInterface= ruleServiceInterface EOF ;
    public final EObject entryRuleServiceInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceInterface = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:292:2: (iv_ruleServiceInterface= ruleServiceInterface EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:293:2: iv_ruleServiceInterface= ruleServiceInterface EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceInterfaceRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceInterface_in_entryRuleServiceInterface406);
            iv_ruleServiceInterface=ruleServiceInterface();
            _fsp--;

             current =iv_ruleServiceInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceInterface416); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:300:1: ruleServiceInterface returns [EObject current=null] : ( 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )* ) ;
    public final EObject ruleServiceInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_operation_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:305:6: ( ( 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:306:1: ( 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:306:1: ( 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:306:3: 'serviceInterface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_operation_2_0= ruleLocalOperation ) )*
            {
            match(input,12,FOLLOW_12_in_ruleServiceInterface451); 

                    createLeafNode(grammarAccess.getServiceInterfaceAccess().getServiceInterfaceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:310:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:311:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:311:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:312:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceInterface468); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:334:2: ( (lv_operation_2_0= ruleLocalOperation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:335:1: (lv_operation_2_0= ruleLocalOperation )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:335:1: (lv_operation_2_0= ruleLocalOperation )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:336:3: lv_operation_2_0= ruleLocalOperation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServiceInterfaceAccess().getOperationLocalOperationParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocalOperation_in_ruleServiceInterface494);
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:366:1: entryRuleLocalOperation returns [EObject current=null] : iv_ruleLocalOperation= ruleLocalOperation EOF ;
    public final EObject entryRuleLocalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalOperation = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:367:2: (iv_ruleLocalOperation= ruleLocalOperation EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:368:2: iv_ruleLocalOperation= ruleLocalOperation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocalOperationRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalOperation_in_entryRuleLocalOperation531);
            iv_ruleLocalOperation=ruleLocalOperation();
            _fsp--;

             current =iv_ruleLocalOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalOperation541); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:375:1: ruleLocalOperation returns [EObject current=null] : ( 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )* ) ;
    public final EObject ruleLocalOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_return_3_0=null;
        Enumerator lv_inputType_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:380:6: ( ( 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:381:1: ( 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:381:1: ( 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:381:3: 'op' ( (lv_name_1_0= RULE_ID ) ) 'return' ( (lv_return_3_0= RULE_STRING ) ) ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )*
            {
            match(input,13,FOLLOW_13_in_ruleLocalOperation576); 

                    createLeafNode(grammarAccess.getLocalOperationAccess().getOpKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:385:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:386:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:386:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:387:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalOperation593); 

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

            match(input,14,FOLLOW_14_in_ruleLocalOperation608); 

                    createLeafNode(grammarAccess.getLocalOperationAccess().getReturnKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:413:1: ( (lv_return_3_0= RULE_STRING ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:414:1: (lv_return_3_0= RULE_STRING )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:414:1: (lv_return_3_0= RULE_STRING )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:415:3: lv_return_3_0= RULE_STRING
            {
            lv_return_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLocalOperation625); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:437:2: ( 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:437:4: 'inputType' ( (lv_inputType_5_0= ruleInputType ) ) ';'
            	    {
            	    match(input,15,FOLLOW_15_in_ruleLocalOperation641); 

            	            createLeafNode(grammarAccess.getLocalOperationAccess().getInputTypeKeyword_4_0(), null); 
            	        
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:441:1: ( (lv_inputType_5_0= ruleInputType ) )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:442:1: (lv_inputType_5_0= ruleInputType )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:442:1: (lv_inputType_5_0= ruleInputType )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:443:3: lv_inputType_5_0= ruleInputType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLocalOperationAccess().getInputTypeInputTypeEnumRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInputType_in_ruleLocalOperation662);
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

            	    match(input,16,FOLLOW_16_in_ruleLocalOperation672); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:477:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:478:2: (iv_ruleService= ruleService EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:479:2: iv_ruleService= ruleService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceRule(), currentNode); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService710);
            iv_ruleService=ruleService();
            _fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService720); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:486:1: ruleService returns [EObject current=null] : ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )* ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_serviceInteraction_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:491:6: ( ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:492:1: ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:492:1: ( 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:492:3: 'Service' ( (lv_name_1_0= RULE_ID ) ) 'implements' ( ( RULE_ID ) ) ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )*
            {
            match(input,17,FOLLOW_17_in_ruleService755); 

                    createLeafNode(grammarAccess.getServiceAccess().getServiceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:496:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:497:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:497:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:498:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService772); 

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

            match(input,18,FOLLOW_18_in_ruleService787); 

                    createLeafNode(grammarAccess.getServiceAccess().getImplementsKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:524:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:525:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:525:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:526:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService805); 

            		createLeafNode(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceCrossReference_3_0(), "interface"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:538:2: ( (lv_serviceInteraction_4_0= ruleExplicitInteractionService ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:539:1: (lv_serviceInteraction_4_0= ruleExplicitInteractionService )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:539:1: (lv_serviceInteraction_4_0= ruleExplicitInteractionService )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:540:3: lv_serviceInteraction_4_0= ruleExplicitInteractionService
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServiceAccess().getServiceInteractionExplicitInteractionServiceParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleExplicitInteractionService_in_ruleService826);
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:570:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:571:2: (iv_ruleActivity= ruleActivity EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:572:2: iv_ruleActivity= ruleActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity863);
            iv_ruleActivity=ruleActivity();
            _fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity873); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:579:1: ruleActivity returns [EObject current=null] : ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_launchable_2_0=null;
        EObject lv_actions_3_0 = null;

        EObject lv_interactions_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:584:6: ( ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:585:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:585:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:585:3: 'Activity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_launchable_2_0= 'launchable' ) )? ( (lv_actions_3_0= ruleLocalAction ) )* ( (lv_interactions_4_0= ruleInterAction ) )*
            {
            match(input,19,FOLLOW_19_in_ruleActivity908); 

                    createLeafNode(grammarAccess.getActivityAccess().getActivityKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:589:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:590:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:590:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:591:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity925); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:613:2: ( (lv_launchable_2_0= 'launchable' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:614:1: (lv_launchable_2_0= 'launchable' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:614:1: (lv_launchable_2_0= 'launchable' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:615:3: lv_launchable_2_0= 'launchable'
                    {
                    lv_launchable_2_0=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleActivity948); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:634:3: ( (lv_actions_3_0= ruleLocalAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:635:1: (lv_actions_3_0= ruleLocalAction )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:635:1: (lv_actions_3_0= ruleLocalAction )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:636:3: lv_actions_3_0= ruleLocalAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getActionsLocalActionParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleLocalAction_in_ruleActivity983);
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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:658:3: ( (lv_interactions_4_0= ruleInterAction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23||LA11_0==25||(LA11_0>=28 && LA11_0<=29)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:659:1: (lv_interactions_4_0= ruleInterAction )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:659:1: (lv_interactions_4_0= ruleInterAction )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:660:3: lv_interactions_4_0= ruleInterAction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getInteractionsInterActionParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterAction_in_ruleActivity1005);
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:690:1: entryRuleLocalAction returns [EObject current=null] : iv_ruleLocalAction= ruleLocalAction EOF ;
    public final EObject entryRuleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:691:2: (iv_ruleLocalAction= ruleLocalAction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:692:2: iv_ruleLocalAction= ruleLocalAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocalActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalAction_in_entryRuleLocalAction1042);
            iv_ruleLocalAction=ruleLocalAction();
            _fsp--;

             current =iv_ruleLocalAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalAction1052); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:699:1: ruleLocalAction returns [EObject current=null] : ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? ) ;
    public final EObject ruleLocalAction() throws RecognitionException {
        EObject current = null;

        Token lv_button_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:704:6: ( ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:705:1: ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:705:1: ( 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )? )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:705:3: 'action' ( ( RULE_ID ) ) ( (lv_button_2_0= 'button' ) )?
            {
            match(input,21,FOLLOW_21_in_ruleLocalAction1087); 

                    createLeafNode(grammarAccess.getLocalActionAccess().getActionKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:709:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:710:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:710:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:711:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLocalActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalAction1105); 

            		createLeafNode(grammarAccess.getLocalActionAccess().getActionActionCrossReference_1_0(), "action"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:723:2: ( (lv_button_2_0= 'button' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:724:1: (lv_button_2_0= 'button' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:724:1: (lv_button_2_0= 'button' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:725:3: lv_button_2_0= 'button'
                    {
                    lv_button_2_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleLocalAction1123); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:752:1: entryRuleInterAction returns [EObject current=null] : iv_ruleInterAction= ruleInterAction EOF ;
    public final EObject entryRuleInterAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterAction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:753:2: (iv_ruleInterAction= ruleInterAction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:754:2: iv_ruleInterAction= ruleInterAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterAction_in_entryRuleInterAction1173);
            iv_ruleInterAction=ruleInterAction();
            _fsp--;

             current =iv_ruleInterAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterAction1183); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:761:1: ruleInterAction returns [EObject current=null] : ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) ) ;
    public final EObject ruleInterAction() throws RecognitionException {
        EObject current = null;

        Token lv_button_1_0=null;
        Token lv_button_3_0=null;
        EObject this_ExplicitInteraction_0 = null;

        EObject this_ActionOnlyInteraction_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:766:6: ( ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:767:1: ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:767:1: ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23||LA15_0==25||LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("767:1: ( (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? ) | (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? ) )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:767:2: (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:767:2: (this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )? )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:768:5: this_ExplicitInteraction_0= ruleExplicitInteraction ( (lv_button_1_0= 'button' ) )?
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInterActionAccess().getExplicitInteractionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExplicitInteraction_in_ruleInterAction1231);
                    this_ExplicitInteraction_0=ruleExplicitInteraction();
                    _fsp--;

                     
                            current = this_ExplicitInteraction_0; 
                            currentNode = currentNode.getParent();
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:776:1: ( (lv_button_1_0= 'button' ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==22) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:777:1: (lv_button_1_0= 'button' )
                            {
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:777:1: (lv_button_1_0= 'button' )
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:778:3: lv_button_1_0= 'button'
                            {
                            lv_button_1_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleInterAction1248); 

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
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:798:6: (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:798:6: (this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )? )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:799:5: this_ActionOnlyInteraction_2= ruleActionOnlyInteraction ( (lv_button_3_0= 'button' ) )?
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getInterActionAccess().getActionOnlyInteractionParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleActionOnlyInteraction_in_ruleInterAction1292);
                    this_ActionOnlyInteraction_2=ruleActionOnlyInteraction();
                    _fsp--;

                     
                            current = this_ActionOnlyInteraction_2; 
                            currentNode = currentNode.getParent();
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:807:1: ( (lv_button_3_0= 'button' ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==22) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:808:1: (lv_button_3_0= 'button' )
                            {
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:808:1: (lv_button_3_0= 'button' )
                            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:809:3: lv_button_3_0= 'button'
                            {
                            lv_button_3_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleInterAction1309); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:836:1: entryRuleExplicitInteraction returns [EObject current=null] : iv_ruleExplicitInteraction= ruleExplicitInteraction EOF ;
    public final EObject entryRuleExplicitInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitInteraction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:837:2: (iv_ruleExplicitInteraction= ruleExplicitInteraction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:838:2: iv_ruleExplicitInteraction= ruleExplicitInteraction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExplicitInteractionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction1360);
            iv_ruleExplicitInteraction=ruleExplicitInteraction();
            _fsp--;

             current =iv_ruleExplicitInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteraction1370); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:845:1: ruleExplicitInteraction returns [EObject current=null] : (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService ) ;
    public final EObject ruleExplicitInteraction() throws RecognitionException {
        EObject current = null;

        EObject this_ExplicitInteractionActivity_0 = null;

        EObject this_ExplicitInteractionService_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:850:6: ( (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:851:1: (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:851:1: (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            else if ( (LA16_0==25||LA16_0==28) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("851:1: (this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity | this_ExplicitInteractionService_1= ruleExplicitInteractionService )", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:852:5: this_ExplicitInteractionActivity_0= ruleExplicitInteractionActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionActivityParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_ruleExplicitInteraction1417);
                    this_ExplicitInteractionActivity_0=ruleExplicitInteractionActivity();
                    _fsp--;

                     
                            current = this_ExplicitInteractionActivity_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:862:5: this_ExplicitInteractionService_1= ruleExplicitInteractionService
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionServiceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExplicitInteractionService_in_ruleExplicitInteraction1444);
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:878:1: entryRuleExplicitInteractionActivity returns [EObject current=null] : iv_ruleExplicitInteractionActivity= ruleExplicitInteractionActivity EOF ;
    public final EObject entryRuleExplicitInteractionActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitInteractionActivity = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:879:2: (iv_ruleExplicitInteractionActivity= ruleExplicitInteractionActivity EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:880:2: iv_ruleExplicitInteractionActivity= ruleExplicitInteractionActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExplicitInteractionActivityRule(), currentNode); 
            pushFollow(FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity1479);
            iv_ruleExplicitInteractionActivity=ruleExplicitInteractionActivity();
            _fsp--;

             current =iv_ruleExplicitInteractionActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteractionActivity1489); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:887:1: ruleExplicitInteractionActivity returns [EObject current=null] : ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? ) ;
    public final EObject ruleExplicitInteractionActivity() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:892:6: ( ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:893:1: ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:893:1: ( 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )? )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:893:3: 'callActivity' ( ( RULE_ID ) ) ( 'forActiom' ( ( RULE_ID ) ) )?
            {
            match(input,23,FOLLOW_23_in_ruleExplicitInteractionActivity1524); 

                    createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getCallActivityKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:897:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:898:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:898:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:899:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExplicitInteractionActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1542); 

            		createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityCrossReference_1_0(), "dest"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:911:2: ( 'forActiom' ( ( RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:911:4: 'forActiom' ( ( RULE_ID ) )
                    {
                    match(input,24,FOLLOW_24_in_ruleExplicitInteractionActivity1553); 

                            createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getForActiomKeyword_2_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:915:1: ( ( RULE_ID ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:916:1: ( RULE_ID )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:916:1: ( RULE_ID )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:917:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getExplicitInteractionActivityRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1571); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:937:1: entryRuleExplicitInteractionService returns [EObject current=null] : iv_ruleExplicitInteractionService= ruleExplicitInteractionService EOF ;
    public final EObject entryRuleExplicitInteractionService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitInteractionService = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:938:2: (iv_ruleExplicitInteractionService= ruleExplicitInteractionService EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:939:2: iv_ruleExplicitInteractionService= ruleExplicitInteractionService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExplicitInteractionServiceRule(), currentNode); 
            pushFollow(FOLLOW_ruleExplicitInteractionService_in_entryRuleExplicitInteractionService1609);
            iv_ruleExplicitInteractionService=ruleExplicitInteractionService();
            _fsp--;

             current =iv_ruleExplicitInteractionService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInteractionService1619); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:946:1: ruleExplicitInteractionService returns [EObject current=null] : (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice ) ;
    public final EObject ruleExplicitInteractionService() throws RecognitionException {
        EObject current = null;

        EObject this_UseService_0 = null;

        EObject this_Launchservice_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:951:6: ( (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:952:1: (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:952:1: (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("952:1: (this_UseService_0= ruleUseService | this_Launchservice_1= ruleLaunchservice )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:953:5: this_UseService_0= ruleUseService
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExplicitInteractionServiceAccess().getUseServiceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUseService_in_ruleExplicitInteractionService1666);
                    this_UseService_0=ruleUseService();
                    _fsp--;

                     
                            current = this_UseService_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:963:5: this_Launchservice_1= ruleLaunchservice
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getExplicitInteractionServiceAccess().getLaunchserviceParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLaunchservice_in_ruleExplicitInteractionService1693);
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:979:1: entryRuleUseService returns [EObject current=null] : iv_ruleUseService= ruleUseService EOF ;
    public final EObject entryRuleUseService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseService = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:980:2: (iv_ruleUseService= ruleUseService EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:981:2: iv_ruleUseService= ruleUseService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUseServiceRule(), currentNode); 
            pushFollow(FOLLOW_ruleUseService_in_entryRuleUseService1728);
            iv_ruleUseService=ruleUseService();
            _fsp--;

             current =iv_ruleUseService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseService1738); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:988:1: ruleUseService returns [EObject current=null] : ( 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleUseService() throws RecognitionException {
        EObject current = null;

        Token lv_arg_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:993:6: ( ( 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )* ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:994:1: ( 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )* )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:994:1: ( 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )* )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:994:3: 'useService' ( ( RULE_ID ) ) 'forOp' ( ( RULE_ID ) ) ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )*
            {
            match(input,25,FOLLOW_25_in_ruleUseService1773); 

                    createLeafNode(grammarAccess.getUseServiceAccess().getUseServiceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:998:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:999:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:999:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1000:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUseServiceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseService1791); 

            		createLeafNode(grammarAccess.getUseServiceAccess().getDestServiceInterfaceCrossReference_1_0(), "dest"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleUseService1801); 

                    createLeafNode(grammarAccess.getUseServiceAccess().getForOpKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1016:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1017:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1017:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1018:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUseServiceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUseService1819); 

            		createLeafNode(grammarAccess.getUseServiceAccess().getOperationLocalOperationCrossReference_3_0(), "operation"); 
            	

            }


            }

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1030:2: ( 'arg=' ( (lv_arg_5_0= RULE_STRING ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1030:4: 'arg=' ( (lv_arg_5_0= RULE_STRING ) )
            	    {
            	    match(input,27,FOLLOW_27_in_ruleUseService1830); 

            	            createLeafNode(grammarAccess.getUseServiceAccess().getArgKeyword_4_0(), null); 
            	        
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1034:1: ( (lv_arg_5_0= RULE_STRING ) )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1035:1: (lv_arg_5_0= RULE_STRING )
            	    {
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1035:1: (lv_arg_5_0= RULE_STRING )
            	    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1036:3: lv_arg_5_0= RULE_STRING
            	    {
            	    lv_arg_5_0=(Token)input.LT(1);
            	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUseService1847); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1066:1: entryRuleLaunchservice returns [EObject current=null] : iv_ruleLaunchservice= ruleLaunchservice EOF ;
    public final EObject entryRuleLaunchservice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaunchservice = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1067:2: (iv_ruleLaunchservice= ruleLaunchservice EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1068:2: iv_ruleLaunchservice= ruleLaunchservice EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLaunchserviceRule(), currentNode); 
            pushFollow(FOLLOW_ruleLaunchservice_in_entryRuleLaunchservice1890);
            iv_ruleLaunchservice=ruleLaunchservice();
            _fsp--;

             current =iv_ruleLaunchservice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLaunchservice1900); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1075:1: ruleLaunchservice returns [EObject current=null] : ( 'launchService' ( ( RULE_ID ) ) ) ;
    public final EObject ruleLaunchservice() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1080:6: ( ( 'launchService' ( ( RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1081:1: ( 'launchService' ( ( RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1081:1: ( 'launchService' ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1081:3: 'launchService' ( ( RULE_ID ) )
            {
            match(input,28,FOLLOW_28_in_ruleLaunchservice1935); 

                    createLeafNode(grammarAccess.getLaunchserviceAccess().getLaunchServiceKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1085:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1086:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1086:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1087:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLaunchserviceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLaunchservice1953); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1107:1: entryRuleActionOnlyInteraction returns [EObject current=null] : iv_ruleActionOnlyInteraction= ruleActionOnlyInteraction EOF ;
    public final EObject entryRuleActionOnlyInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionOnlyInteraction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1108:2: (iv_ruleActionOnlyInteraction= ruleActionOnlyInteraction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1109:2: iv_ruleActionOnlyInteraction= ruleActionOnlyInteraction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionOnlyInteractionRule(), currentNode); 
            pushFollow(FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction1989);
            iv_ruleActionOnlyInteraction=ruleActionOnlyInteraction();
            _fsp--;

             current =iv_ruleActionOnlyInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionOnlyInteraction1999); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1116:1: ruleActionOnlyInteraction returns [EObject current=null] : ( 'execAction' ( ( RULE_ID ) ) ) ;
    public final EObject ruleActionOnlyInteraction() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1121:6: ( ( 'execAction' ( ( RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1122:1: ( 'execAction' ( ( RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1122:1: ( 'execAction' ( ( RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1122:3: 'execAction' ( ( RULE_ID ) )
            {
            match(input,29,FOLLOW_29_in_ruleActionOnlyInteraction2034); 

                    createLeafNode(grammarAccess.getActionOnlyInteractionAccess().getExecActionKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1126:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1127:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1127:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1128:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getActionOnlyInteractionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionOnlyInteraction2052); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1148:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1149:2: (iv_ruleAction= ruleAction EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1150:2: iv_ruleAction= ruleAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction2088);
            iv_ruleAction=ruleAction();
            _fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction2098); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1157:1: ruleAction returns [EObject current=null] : ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_category_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1162:6: ( ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1163:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1163:1: ( 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1163:3: 'action' ( (lv_name_1_0= RULE_ID ) ) 'data' ( ( RULE_ID ) ) 'category' ( (lv_category_5_0= RULE_STRING ) )
            {
            match(input,21,FOLLOW_21_in_ruleAction2133); 

                    createLeafNode(grammarAccess.getActionAccess().getActionKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1167:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1168:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1168:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1169:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2150); 

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

            match(input,30,FOLLOW_30_in_ruleAction2165); 

                    createLeafNode(grammarAccess.getActionAccess().getDataKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1195:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1196:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1196:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1197:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAction2183); 

            		createLeafNode(grammarAccess.getActionAccess().getDataDataCrossReference_3_0(), "data"); 
            	

            }


            }

            match(input,31,FOLLOW_31_in_ruleAction2193); 

                    createLeafNode(grammarAccess.getActionAccess().getCategoryKeyword_4(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1213:1: ( (lv_category_5_0= RULE_STRING ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1214:1: (lv_category_5_0= RULE_STRING )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1214:1: (lv_category_5_0= RULE_STRING )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1215:3: lv_category_5_0= RULE_STRING
            {
            lv_category_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAction2210); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1245:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1246:2: (iv_ruleData= ruleData EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1247:2: iv_ruleData= ruleData EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataRule(), currentNode); 
            pushFollow(FOLLOW_ruleData_in_entryRuleData2251);
            iv_ruleData=ruleData();
            _fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleData2261); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1254:1: ruleData returns [EObject current=null] : ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_scheme_3_0=null;
        Token lv_host_5_0=null;
        Token lv_port_7_0=null;
        Token lv_path_9_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1259:6: ( ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1260:1: ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1260:1: ( 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )? )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1260:3: 'data' ( (lv_name_1_0= RULE_ID ) ) 'scheme' ( (lv_scheme_3_0= RULE_STRING ) ) ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )? ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )? ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )?
            {
            match(input,30,FOLLOW_30_in_ruleData2296); 

                    createLeafNode(grammarAccess.getDataAccess().getDataKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1264:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1265:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1265:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1266:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleData2313); 

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

            match(input,32,FOLLOW_32_in_ruleData2328); 

                    createLeafNode(grammarAccess.getDataAccess().getSchemeKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1292:1: ( (lv_scheme_3_0= RULE_STRING ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1293:1: (lv_scheme_3_0= RULE_STRING )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1293:1: (lv_scheme_3_0= RULE_STRING )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1294:3: lv_scheme_3_0= RULE_STRING
            {
            lv_scheme_3_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData2345); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1316:2: ( 'host' ( (lv_host_5_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1316:4: 'host' ( (lv_host_5_0= RULE_STRING ) )
                    {
                    match(input,33,FOLLOW_33_in_ruleData2361); 

                            createLeafNode(grammarAccess.getDataAccess().getHostKeyword_4_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1320:1: ( (lv_host_5_0= RULE_STRING ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1321:1: (lv_host_5_0= RULE_STRING )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1321:1: (lv_host_5_0= RULE_STRING )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1322:3: lv_host_5_0= RULE_STRING
                    {
                    lv_host_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData2378); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1344:4: ( 'port' ( (lv_port_7_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1344:6: 'port' ( (lv_port_7_0= RULE_STRING ) )
                    {
                    match(input,34,FOLLOW_34_in_ruleData2396); 

                            createLeafNode(grammarAccess.getDataAccess().getPortKeyword_5_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1348:1: ( (lv_port_7_0= RULE_STRING ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1349:1: (lv_port_7_0= RULE_STRING )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1349:1: (lv_port_7_0= RULE_STRING )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1350:3: lv_port_7_0= RULE_STRING
                    {
                    lv_port_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData2413); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1372:4: ( 'path' ( (lv_path_9_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1372:6: 'path' ( (lv_path_9_0= RULE_STRING ) )
                    {
                    match(input,35,FOLLOW_35_in_ruleData2431); 

                            createLeafNode(grammarAccess.getDataAccess().getPathKeyword_6_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1376:1: ( (lv_path_9_0= RULE_STRING ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1377:1: (lv_path_9_0= RULE_STRING )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1377:1: (lv_path_9_0= RULE_STRING )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1378:3: lv_path_9_0= RULE_STRING
                    {
                    lv_path_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleData2448); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1408:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1409:2: (iv_ruleApplication= ruleApplication EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1410:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication2491);
            iv_ruleApplication=ruleApplication();
            _fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication2501); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1417:1: ruleApplication returns [EObject current=null] : ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) ) ;
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
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1422:6: ( ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1423:1: ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1423:1: ( 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1423:3: 'Application' ( (lv_name_1_0= RULE_ID ) ) 'avd' ( (lv_avd_3_0= RULE_INT ) ) ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )? 'package' ( (lv_packageName_7_0= ruleURI ) ) 'entryActiviy' ( ( RULE_ID ) ) 'target' ( (lv_target_11_0= RULE_INT ) ) 'path' ( (lv_path_13_0= RULE_ID ) )
            {
            match(input,36,FOLLOW_36_in_ruleApplication2536); 

                    createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1427:1: ( (lv_name_1_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1428:1: (lv_name_1_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1428:1: (lv_name_1_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1429:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2553); 

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

            match(input,37,FOLLOW_37_in_ruleApplication2568); 

                    createLeafNode(grammarAccess.getApplicationAccess().getAvdKeyword_2(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1455:1: ( (lv_avd_3_0= RULE_INT ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1456:1: (lv_avd_3_0= RULE_INT )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1456:1: (lv_avd_3_0= RULE_INT )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1457:3: lv_avd_3_0= RULE_INT
            {
            lv_avd_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication2585); 

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

            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1479:2: ( 'workdir' ( (lv_workDir_5_0= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1479:4: 'workdir' ( (lv_workDir_5_0= RULE_ID ) )
                    {
                    match(input,38,FOLLOW_38_in_ruleApplication2601); 

                            createLeafNode(grammarAccess.getApplicationAccess().getWorkdirKeyword_4_0(), null); 
                        
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1483:1: ( (lv_workDir_5_0= RULE_ID ) )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1484:1: (lv_workDir_5_0= RULE_ID )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1484:1: (lv_workDir_5_0= RULE_ID )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1485:3: lv_workDir_5_0= RULE_ID
                    {
                    lv_workDir_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2618); 

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

            match(input,39,FOLLOW_39_in_ruleApplication2635); 

                    createLeafNode(grammarAccess.getApplicationAccess().getPackageKeyword_5(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1511:1: ( (lv_packageName_7_0= ruleURI ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1512:1: (lv_packageName_7_0= ruleURI )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1512:1: (lv_packageName_7_0= ruleURI )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1513:3: lv_packageName_7_0= ruleURI
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getPackageNameURIParserRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleApplication2656);
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

            match(input,40,FOLLOW_40_in_ruleApplication2666); 

                    createLeafNode(grammarAccess.getApplicationAccess().getEntryActiviyKeyword_7(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1539:1: ( ( RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1540:1: ( RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1540:1: ( RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1541:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2684); 

            		createLeafNode(grammarAccess.getApplicationAccess().getMainActivityActivityCrossReference_8_0(), "mainActivity"); 
            	

            }


            }

            match(input,41,FOLLOW_41_in_ruleApplication2694); 

                    createLeafNode(grammarAccess.getApplicationAccess().getTargetKeyword_9(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1557:1: ( (lv_target_11_0= RULE_INT ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1558:1: (lv_target_11_0= RULE_INT )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1558:1: (lv_target_11_0= RULE_INT )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1559:3: lv_target_11_0= RULE_INT
            {
            lv_target_11_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApplication2711); 

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

            match(input,35,FOLLOW_35_in_ruleApplication2726); 

                    createLeafNode(grammarAccess.getApplicationAccess().getPathKeyword_11(), null); 
                
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1585:1: ( (lv_path_13_0= RULE_ID ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1586:1: (lv_path_13_0= RULE_ID )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1586:1: (lv_path_13_0= RULE_ID )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1587:3: lv_path_13_0= RULE_ID
            {
            lv_path_13_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplication2743); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1617:1: entryRuleURI returns [String current=null] : iv_ruleURI= ruleURI EOF ;
    public final String entryRuleURI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURI = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1618:2: (iv_ruleURI= ruleURI EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1619:2: iv_ruleURI= ruleURI EOF
            {
             currentNode = createCompositeNode(grammarAccess.getURIRule(), currentNode); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI2785);
            iv_ruleURI=ruleURI();
            _fsp--;

             current =iv_ruleURI.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI2796); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1626:1: ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri ) ;
    public final AntlrDatatypeRuleToken ruleURI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_RestUri_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1631:6: ( (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1632:1: (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1632:1: (this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1632:6: this_ID_0= RULE_ID kw= '.' this_RestUri_2= ruleRestUri
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI2836); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getURIAccess().getIDTerminalRuleCall_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_ruleURI2854); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getURIAccess().getFullStopKeyword_1(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getURIAccess().getRestUriParserRuleCall_2(), currentNode); 
                
            pushFollow(FOLLOW_ruleRestUri_in_ruleURI2876);
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1664:1: entryRuleRestUri returns [String current=null] : iv_ruleRestUri= ruleRestUri EOF ;
    public final String entryRuleRestUri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRestUri = null;


        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1665:2: (iv_ruleRestUri= ruleRestUri EOF )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1666:2: iv_ruleRestUri= ruleRestUri EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestUriRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestUri_in_entryRuleRestUri2922);
            iv_ruleRestUri=ruleRestUri();
            _fsp--;

             current =iv_ruleRestUri.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestUri2933); 

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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1673:1: ruleRestUri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_URI_1= ruleURI ) ;
    public final AntlrDatatypeRuleToken ruleRestUri() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_URI_1 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1678:6: ( (this_ID_0= RULE_ID | this_URI_1= ruleURI ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1679:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1679:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==42) ) {
                    alt24=2;
                }
                else if ( (LA24_1==EOF||LA24_1==40) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1679:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1679:1: (this_ID_0= RULE_ID | this_URI_1= ruleURI )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1679:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestUri2973); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getRestUriAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1688:5: this_URI_1= ruleURI
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRestUriAccess().getURIParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleURI_in_ruleRestUri3006);
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
    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1706:1: ruleInputType returns [Enumerator current=null] : ( ( 'String' ) | ( 'int' ) | ( 'double' ) ) ;
    public final Enumerator ruleInputType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1710:6: ( ( ( 'String' ) | ( 'int' ) | ( 'double' ) ) )
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1711:1: ( ( 'String' ) | ( 'int' ) | ( 'double' ) )
            {
            // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1711:1: ( ( 'String' ) | ( 'int' ) | ( 'double' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt25=1;
                }
                break;
            case 44:
                {
                alt25=2;
                }
                break;
            case 45:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1711:1: ( ( 'String' ) | ( 'int' ) | ( 'double' ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1711:2: ( 'String' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1711:2: ( 'String' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1711:4: 'String'
                    {
                    match(input,43,FOLLOW_43_in_ruleInputType3063); 

                            current = grammarAccess.getInputTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getInputTypeAccess().getStringEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1717:6: ( 'int' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1717:6: ( 'int' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1717:8: 'int'
                    {
                    match(input,44,FOLLOW_44_in_ruleInputType3078); 

                            current = grammarAccess.getInputTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getInputTypeAccess().getIntEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1723:6: ( 'double' )
                    {
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1723:6: ( 'double' )
                    // ../it.unibo.madz.mobile/src-gen/it/unibo/madz/mobile/parser/antlr/internal/InternalAndroidL.g:1723:8: 'double'
                    {
                    match(input,45,FOLLOW_45_in_ruleInputType3093); 

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
    public static final BitSet FOLLOW_11_in_ruleAndroidSystem120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAndroidSystem137 = new BitSet(new long[]{0x00000010402A1000L});
    public static final BitSet FOLLOW_ruleData_in_ruleAndroidSystem163 = new BitSet(new long[]{0x00000010402A1000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleAndroidSystem185 = new BitSet(new long[]{0x00000010002A1000L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_ruleAndroidSystem207 = new BitSet(new long[]{0x00000010000A1000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleAndroidSystem229 = new BitSet(new long[]{0x00000010000A0000L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleAndroidSystem251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleComponent344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleComponent371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceInterface_in_entryRuleServiceInterface406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceInterface416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleServiceInterface451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceInterface468 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleLocalOperation_in_ruleServiceInterface494 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleLocalOperation_in_entryRuleLocalOperation531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalOperation541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLocalOperation576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalOperation593 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLocalOperation608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLocalOperation625 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLocalOperation641 = new BitSet(new long[]{0x0000380000000000L});
    public static final BitSet FOLLOW_ruleInputType_in_ruleLocalOperation662 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLocalOperation672 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleService755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService772 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleService787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService805 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_ruleService826 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleActivity908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity925 = new BitSet(new long[]{0x0000000032B00002L});
    public static final BitSet FOLLOW_20_in_ruleActivity948 = new BitSet(new long[]{0x0000000032A00002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_ruleActivity983 = new BitSet(new long[]{0x0000000032A00002L});
    public static final BitSet FOLLOW_ruleInterAction_in_ruleActivity1005 = new BitSet(new long[]{0x0000000032800002L});
    public static final BitSet FOLLOW_ruleLocalAction_in_entryRuleLocalAction1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalAction1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLocalAction1087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalAction1105 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleLocalAction1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterAction_in_entryRuleInterAction1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterAction1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_ruleInterAction1231 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleInterAction1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_ruleInterAction1292 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleInterAction1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteraction_in_entryRuleExplicitInteraction1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteraction1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_ruleExplicitInteraction1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_ruleExplicitInteraction1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionActivity_in_entryRuleExplicitInteractionActivity1479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteractionActivity1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleExplicitInteractionActivity1524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1542 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleExplicitInteractionActivity1553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExplicitInteractionActivity1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInteractionService_in_entryRuleExplicitInteractionService1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInteractionService1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseService_in_ruleExplicitInteractionService1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLaunchservice_in_ruleExplicitInteractionService1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUseService_in_entryRuleUseService1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseService1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUseService1773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseService1791 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUseService1801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUseService1819 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleUseService1830 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUseService1847 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleLaunchservice_in_entryRuleLaunchservice1890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLaunchservice1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLaunchservice1935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLaunchservice1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionOnlyInteraction_in_entryRuleActionOnlyInteraction1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionOnlyInteraction1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleActionOnlyInteraction2034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionOnlyInteraction2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAction2133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2150 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAction2165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAction2183 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAction2193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAction2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleData_in_entryRuleData2251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleData2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleData2296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleData2313 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleData2328 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData2345 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_33_in_ruleData2361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData2378 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleData2396 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData2413 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleData2431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleData2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication2491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleApplication2536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2553 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleApplication2568 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication2585 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_38_in_ruleApplication2601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2618 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleApplication2635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleURI_in_ruleApplication2656 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleApplication2666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2684 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleApplication2694 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApplication2711 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleApplication2726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplication2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI2785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI2836 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleURI2854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRestUri_in_ruleURI2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestUri_in_entryRuleRestUri2922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestUri2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestUri2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_ruleRestUri3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInputType3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInputType3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleInputType3093 = new BitSet(new long[]{0x0000000000000002L});

}