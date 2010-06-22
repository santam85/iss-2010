/*
* generated by Xtext
*/
grammar InternalAndroidL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package it.unibo.madz.mobile.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAndroidSystem
entryRuleAndroidSystem returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getAndroidSystemRule(), currentNode); }
	 iv_ruleAndroidSystem=ruleAndroidSystem 
	 { $current=$iv_ruleAndroidSystem.current; } 
	 EOF 
;

// Rule AndroidSystem
ruleAndroidSystem returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getDataDataParserRuleCall_0_0(), currentNode); 
	    }
		lv_data_0_0=ruleData		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"data",
	        		lv_data_0_0, 
	        		"Data", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getActionActionParserRuleCall_1_0(), currentNode); 
	    }
		lv_action_1_0=ruleAction		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"action",
	        		lv_action_1_0, 
	        		"Action", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getServiceInterfaceServiceInterfaceParserRuleCall_2_0(), currentNode); 
	    }
		lv_serviceInterface_2_0=ruleServiceInterface		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"serviceInterface",
	        		lv_serviceInterface_2_0, 
	        		"ServiceInterface", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getComponentComponentParserRuleCall_3_0(), currentNode); 
	    }
		lv_component_3_0=ruleComponent		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"component",
	        		lv_component_3_0, 
	        		"Component", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getAndroidSystemAccess().getApplicationApplicationParserRuleCall_4_0(), currentNode); 
	    }
		lv_application_4_0=ruleApplication		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getAndroidSystemRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"application",
	        		lv_application_4_0, 
	        		"Application", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getComponentRule(), currentNode); }
	 iv_ruleComponent=ruleComponent 
	 { $current=$iv_ruleComponent.current; } 
	 EOF 
;

// Rule Component
ruleComponent returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getActivityParserRuleCall_0(), currentNode); 
    }
    this_Activity_0=ruleActivity
    { 
        $current = $this_Activity_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getComponentAccess().getServiceParserRuleCall_1(), currentNode); 
    }
    this_Service_1=ruleService
    { 
        $current = $this_Service_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleServiceInterface
entryRuleServiceInterface returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getServiceInterfaceRule(), currentNode); }
	 iv_ruleServiceInterface=ruleServiceInterface 
	 { $current=$iv_ruleServiceInterface.current; } 
	 EOF 
;

// Rule ServiceInterface
ruleServiceInterface returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'ServiceInterface' 
    {
        createLeafNode(grammarAccess.getServiceInterfaceAccess().getServiceInterfaceKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getServiceInterfaceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getServiceInterfaceRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleService
entryRuleService returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getServiceRule(), currentNode); }
	 iv_ruleService=ruleService 
	 { $current=$iv_ruleService.current; } 
	 EOF 
;

// Rule Service
ruleService returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'Service' 
    {
        createLeafNode(grammarAccess.getServiceAccess().getServiceKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'implements' 
    {
        createLeafNode(grammarAccess.getServiceAccess().getImplementsKeyword_2(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getServiceRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getServiceAccess().getInterfaceServiceInterfaceCrossReference_3_0(), "interface"); 
	}

)
))
;





// Entry rule entryRuleActivity
entryRuleActivity returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); }
	 iv_ruleActivity=ruleActivity 
	 { $current=$iv_ruleActivity.current; } 
	 EOF 
;

// Rule Activity
ruleActivity returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'Activity' 
    {
        createLeafNode(grammarAccess.getActivityAccess().getActivityKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
(
		lv_launchable_2_0=	'launchable' 
    {
        createLeafNode(grammarAccess.getActivityAccess().getLaunchableLaunchableKeyword_2_0(), "launchable"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "launchable", true, "launchable", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)?(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getActionsLocalActionParserRuleCall_3_0(), currentNode); 
	    }
		lv_actions_3_0=ruleLocalAction		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"actions",
	        		lv_actions_3_0, 
	        		"LocalAction", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getInteractionsInterActionParserRuleCall_4_0(), currentNode); 
	    }
		lv_interactions_4_0=ruleInterAction		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"interactions",
	        		lv_interactions_4_0, 
	        		"InterAction", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*)
;





// Entry rule entryRuleLocalAction
entryRuleLocalAction returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getLocalActionRule(), currentNode); }
	 iv_ruleLocalAction=ruleLocalAction 
	 { $current=$iv_ruleLocalAction.current; } 
	 EOF 
;

// Rule LocalAction
ruleLocalAction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'action' 
    {
        createLeafNode(grammarAccess.getLocalActionAccess().getActionKeyword_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getLocalActionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getLocalActionAccess().getActionActionCrossReference_1_0(), "action"); 
	}

)
)(
(
		lv_button_2_0=	'button' 
    {
        createLeafNode(grammarAccess.getLocalActionAccess().getButtonButtonKeyword_2_0(), "button"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLocalActionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "button", true, "button", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)?)
;





// Entry rule entryRuleInterAction
entryRuleInterAction returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getInterActionRule(), currentNode); }
	 iv_ruleInterAction=ruleInterAction 
	 { $current=$iv_ruleInterAction.current; } 
	 EOF 
;

// Rule InterAction
ruleInterAction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
((
    { 
        currentNode=createCompositeNode(grammarAccess.getInterActionAccess().getExplicitInteractionParserRuleCall_0_0(), currentNode); 
    }
    this_ExplicitInteraction_0=ruleExplicitInteraction
    { 
        $current = $this_ExplicitInteraction_0.current; 
        currentNode = currentNode.getParent();
    }
(
(
		lv_button_1_0=	'button' 
    {
        createLeafNode(grammarAccess.getInterActionAccess().getButtonButtonKeyword_0_1_0(), "button"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInterActionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "button", true, "button", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)?)
    |(
    { 
        currentNode=createCompositeNode(grammarAccess.getInterActionAccess().getActionOnlyInteractionParserRuleCall_1_0(), currentNode); 
    }
    this_ActionOnlyInteraction_2=ruleActionOnlyInteraction
    { 
        $current = $this_ActionOnlyInteraction_2.current; 
        currentNode = currentNode.getParent();
    }
(
(
		lv_button_3_0=	'button' 
    {
        createLeafNode(grammarAccess.getInterActionAccess().getButtonButtonKeyword_1_1_0(), "button"); 
    }
 
	    {
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getInterActionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        
	        try {
	       		set($current, "button", true, "button", lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)?))
;





// Entry rule entryRuleExplicitInteraction
entryRuleExplicitInteraction returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getExplicitInteractionRule(), currentNode); }
	 iv_ruleExplicitInteraction=ruleExplicitInteraction 
	 { $current=$iv_ruleExplicitInteraction.current; } 
	 EOF 
;

// Rule ExplicitInteraction
ruleExplicitInteraction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:

    { 
        currentNode=createCompositeNode(grammarAccess.getExplicitInteractionAccess().getExplicitInteractionActivityParserRuleCall(), currentNode); 
    }
    this_ExplicitInteractionActivity_0=ruleExplicitInteractionActivity
    { 
        $current = $this_ExplicitInteractionActivity_0.current; 
        currentNode = currentNode.getParent();
    }

;





// Entry rule entryRuleExplicitInteractionActivity
entryRuleExplicitInteractionActivity returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getExplicitInteractionActivityRule(), currentNode); }
	 iv_ruleExplicitInteractionActivity=ruleExplicitInteractionActivity 
	 { $current=$iv_ruleExplicitInteractionActivity.current; } 
	 EOF 
;

// Rule ExplicitInteractionActivity
ruleExplicitInteractionActivity returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'callActivity' 
    {
        createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getCallActivityKeyword_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getExplicitInteractionActivityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getDestActivityCrossReference_1_0(), "dest"); 
	}

)
)(	'forActiom' 
    {
        createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getForActiomKeyword_2_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getExplicitInteractionActivityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getExplicitInteractionActivityAccess().getActionActionCrossReference_2_1_0(), "action"); 
	}

)
))?)
;





// Entry rule entryRuleActionOnlyInteraction
entryRuleActionOnlyInteraction returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getActionOnlyInteractionRule(), currentNode); }
	 iv_ruleActionOnlyInteraction=ruleActionOnlyInteraction 
	 { $current=$iv_ruleActionOnlyInteraction.current; } 
	 EOF 
;

// Rule ActionOnlyInteraction
ruleActionOnlyInteraction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'execAction' 
    {
        createLeafNode(grammarAccess.getActionOnlyInteractionAccess().getExecActionKeyword_0(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getActionOnlyInteractionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getActionOnlyInteractionAccess().getActionActionCrossReference_1_0(), "action"); 
	}

)
))
;





// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); }
	 iv_ruleAction=ruleAction 
	 { $current=$iv_ruleAction.current; } 
	 EOF 
;

// Rule Action
ruleAction returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'action' 
    {
        createLeafNode(grammarAccess.getActionAccess().getActionKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'data' 
    {
        createLeafNode(grammarAccess.getActionAccess().getDataKeyword_2(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getActionAccess().getDataDataCrossReference_3_0(), "data"); 
	}

)
)	'category' 
    {
        createLeafNode(grammarAccess.getActionAccess().getCategoryKeyword_4(), null); 
    }
(
(
		lv_category_5_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getActionAccess().getCategorySTRINGTerminalRuleCall_5_0(), "category"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"category",
	        		lv_category_5_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleData
entryRuleData returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getDataRule(), currentNode); }
	 iv_ruleData=ruleData 
	 { $current=$iv_ruleData.current; } 
	 EOF 
;

// Rule Data
ruleData returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'data' 
    {
        createLeafNode(grammarAccess.getDataAccess().getDataKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getDataAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'scheme' 
    {
        createLeafNode(grammarAccess.getDataAccess().getSchemeKeyword_2(), null); 
    }
(
(
		lv_scheme_3_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getDataAccess().getSchemeSTRINGTerminalRuleCall_3_0(), "scheme"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"scheme",
	        		lv_scheme_3_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	'host' 
    {
        createLeafNode(grammarAccess.getDataAccess().getHostKeyword_4_0(), null); 
    }
(
(
		lv_host_5_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getDataAccess().getHostSTRINGTerminalRuleCall_4_1_0(), "host"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"host",
	        		lv_host_5_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?(	'port' 
    {
        createLeafNode(grammarAccess.getDataAccess().getPortKeyword_5_0(), null); 
    }
(
(
		lv_port_7_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getDataAccess().getPortSTRINGTerminalRuleCall_5_1_0(), "port"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"port",
	        		lv_port_7_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?(	'path' 
    {
        createLeafNode(grammarAccess.getDataAccess().getPathKeyword_6_0(), null); 
    }
(
(
		lv_path_9_0=RULE_STRING
		{
			createLeafNode(grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_6_1_0(), "path"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getDataRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"path",
	        		lv_path_9_0, 
	        		"STRING", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?)
;





// Entry rule entryRuleApplication
entryRuleApplication returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); }
	 iv_ruleApplication=ruleApplication 
	 { $current=$iv_ruleApplication.current; } 
	 EOF 
;

// Rule Application
ruleApplication returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'Application' 
    {
        createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'avd' 
    {
        createLeafNode(grammarAccess.getApplicationAccess().getAvdKeyword_2(), null); 
    }
(
(
		lv_avd_3_0=RULE_INT
		{
			createLeafNode(grammarAccess.getApplicationAccess().getAvdINTTerminalRuleCall_3_0(), "avd"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"avd",
	        		lv_avd_3_0, 
	        		"INT", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(	'workdir' 
    {
        createLeafNode(grammarAccess.getApplicationAccess().getWorkdirKeyword_4_0(), null); 
    }
(
(
		lv_workDir_5_0=RULE_ID
		{
			createLeafNode(grammarAccess.getApplicationAccess().getWorkDirIDTerminalRuleCall_4_1_0(), "workDir"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"workDir",
	        		lv_workDir_5_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))?	'package' 
    {
        createLeafNode(grammarAccess.getApplicationAccess().getPackageKeyword_5(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getPackageNameURIParserRuleCall_6_0(), currentNode); 
	    }
		lv_packageName_7_0=ruleURI		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"packageName",
	        		lv_packageName_7_0, 
	        		"URI", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	'entryActiviy' 
    {
        createLeafNode(grammarAccess.getApplicationAccess().getEntryActiviyKeyword_7(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
	RULE_ID
	{
		createLeafNode(grammarAccess.getApplicationAccess().getMainActivityActivityCrossReference_8_0(), "mainActivity"); 
	}

)
)	'target' 
    {
        createLeafNode(grammarAccess.getApplicationAccess().getTargetKeyword_9(), null); 
    }
(
(
		lv_target_11_0=RULE_INT
		{
			createLeafNode(grammarAccess.getApplicationAccess().getTargetINTTerminalRuleCall_10_0(), "target"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"target",
	        		lv_target_11_0, 
	        		"INT", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'path' 
    {
        createLeafNode(grammarAccess.getApplicationAccess().getPathKeyword_11(), null); 
    }
(
(
		lv_path_13_0=RULE_ID
		{
			createLeafNode(grammarAccess.getApplicationAccess().getPathIDTerminalRuleCall_12_0(), "path"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"path",
	        		lv_path_13_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
))
;





// Entry rule entryRuleURI
entryRuleURI returns [String current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getURIRule(), currentNode); } 
	 iv_ruleURI=ruleURI 
	 { $current=$iv_ruleURI.current.getText(); }  
	 EOF 
;

// Rule URI
ruleURI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    createLeafNode(grammarAccess.getURIAccess().getIDTerminalRuleCall_0(), null); 
    }

	kw='.' 
    {
        $current.merge(kw);
        createLeafNode(grammarAccess.getURIAccess().getFullStopKeyword_1(), null); 
    }

    { 
        currentNode=createCompositeNode(grammarAccess.getURIAccess().getRestUriParserRuleCall_2(), currentNode); 
    }
    this_RestUri_2=ruleRestUri    {
		$current.merge(this_RestUri_2);
    }

    { 
        currentNode = currentNode.getParent();
    }
)
    ;





// Entry rule entryRuleRestUri
entryRuleRestUri returns [String current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getRestUriRule(), currentNode); } 
	 iv_ruleRestUri=ruleRestUri 
	 { $current=$iv_ruleRestUri.current.getText(); }  
	 EOF 
;

// Rule RestUri
ruleRestUri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    createLeafNode(grammarAccess.getRestUriAccess().getIDTerminalRuleCall_0(), null); 
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getRestUriAccess().getURIParserRuleCall_1(), currentNode); 
    }
    this_URI_1=ruleURI    {
		$current.merge(this_URI_1);
    }

    { 
        currentNode = currentNode.getParent();
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


