/*
* generated by Xtext
*/
package it.unibo.madz.mobile.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import it.unibo.madz.mobile.services.AndroidLGrammarAccess;

public class AndroidLParser extends AbstractContentAssistParser {
	
	@Inject
	private AndroidLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected it.unibo.madz.mobile.ui.contentassist.antlr.internal.InternalAndroidLParser createParser() {
		it.unibo.madz.mobile.ui.contentassist.antlr.internal.InternalAndroidLParser result = new it.unibo.madz.mobile.ui.contentassist.antlr.internal.InternalAndroidLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getComponentAccess().getAlternatives(), "rule__Component__Alternatives");
					put(grammarAccess.getInterActionAccess().getAlternatives(), "rule__InterAction__Alternatives");
					put(grammarAccess.getRestUriAccess().getAlternatives(), "rule__RestUri__Alternatives");
					put(grammarAccess.getAndroidSystemAccess().getGroup(), "rule__AndroidSystem__Group__0");
					put(grammarAccess.getServiceInterfaceAccess().getGroup(), "rule__ServiceInterface__Group__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
					put(grammarAccess.getLocalActionAccess().getGroup(), "rule__LocalAction__Group__0");
					put(grammarAccess.getInterActionAccess().getGroup_0(), "rule__InterAction__Group_0__0");
					put(grammarAccess.getInterActionAccess().getGroup_1(), "rule__InterAction__Group_1__0");
					put(grammarAccess.getExplicitInteractionActivityAccess().getGroup(), "rule__ExplicitInteractionActivity__Group__0");
					put(grammarAccess.getExplicitInteractionActivityAccess().getGroup_2(), "rule__ExplicitInteractionActivity__Group_2__0");
					put(grammarAccess.getActionOnlyInteractionAccess().getGroup(), "rule__ActionOnlyInteraction__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getDataAccess().getGroup(), "rule__Data__Group__0");
					put(grammarAccess.getDataAccess().getGroup_4(), "rule__Data__Group_4__0");
					put(grammarAccess.getDataAccess().getGroup_5(), "rule__Data__Group_5__0");
					put(grammarAccess.getDataAccess().getGroup_6(), "rule__Data__Group_6__0");
					put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
					put(grammarAccess.getApplicationAccess().getGroup_4(), "rule__Application__Group_4__0");
					put(grammarAccess.getURIAccess().getGroup(), "rule__URI__Group__0");
					put(grammarAccess.getAndroidSystemAccess().getDataAssignment_0(), "rule__AndroidSystem__DataAssignment_0");
					put(grammarAccess.getAndroidSystemAccess().getActionAssignment_1(), "rule__AndroidSystem__ActionAssignment_1");
					put(grammarAccess.getAndroidSystemAccess().getServiceInterfaceAssignment_2(), "rule__AndroidSystem__ServiceInterfaceAssignment_2");
					put(grammarAccess.getAndroidSystemAccess().getComponentAssignment_3(), "rule__AndroidSystem__ComponentAssignment_3");
					put(grammarAccess.getAndroidSystemAccess().getApplicationAssignment_4(), "rule__AndroidSystem__ApplicationAssignment_4");
					put(grammarAccess.getServiceInterfaceAccess().getNameAssignment_1(), "rule__ServiceInterface__NameAssignment_1");
					put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
					put(grammarAccess.getServiceAccess().getInterfaceAssignment_3(), "rule__Service__InterfaceAssignment_3");
					put(grammarAccess.getActivityAccess().getNameAssignment_1(), "rule__Activity__NameAssignment_1");
					put(grammarAccess.getActivityAccess().getLaunchableAssignment_2(), "rule__Activity__LaunchableAssignment_2");
					put(grammarAccess.getActivityAccess().getActionsAssignment_3(), "rule__Activity__ActionsAssignment_3");
					put(grammarAccess.getActivityAccess().getInteractionsAssignment_4(), "rule__Activity__InteractionsAssignment_4");
					put(grammarAccess.getLocalActionAccess().getActionAssignment_1(), "rule__LocalAction__ActionAssignment_1");
					put(grammarAccess.getLocalActionAccess().getButtonAssignment_2(), "rule__LocalAction__ButtonAssignment_2");
					put(grammarAccess.getInterActionAccess().getButtonAssignment_0_1(), "rule__InterAction__ButtonAssignment_0_1");
					put(grammarAccess.getInterActionAccess().getButtonAssignment_1_1(), "rule__InterAction__ButtonAssignment_1_1");
					put(grammarAccess.getExplicitInteractionActivityAccess().getDestAssignment_1(), "rule__ExplicitInteractionActivity__DestAssignment_1");
					put(grammarAccess.getExplicitInteractionActivityAccess().getActionAssignment_2_1(), "rule__ExplicitInteractionActivity__ActionAssignment_2_1");
					put(grammarAccess.getActionOnlyInteractionAccess().getActionAssignment_1(), "rule__ActionOnlyInteraction__ActionAssignment_1");
					put(grammarAccess.getActionAccess().getNameAssignment_1(), "rule__Action__NameAssignment_1");
					put(grammarAccess.getActionAccess().getDataAssignment_3(), "rule__Action__DataAssignment_3");
					put(grammarAccess.getActionAccess().getCategoryAssignment_5(), "rule__Action__CategoryAssignment_5");
					put(grammarAccess.getDataAccess().getNameAssignment_1(), "rule__Data__NameAssignment_1");
					put(grammarAccess.getDataAccess().getSchemeAssignment_3(), "rule__Data__SchemeAssignment_3");
					put(grammarAccess.getDataAccess().getHostAssignment_4_1(), "rule__Data__HostAssignment_4_1");
					put(grammarAccess.getDataAccess().getPortAssignment_5_1(), "rule__Data__PortAssignment_5_1");
					put(grammarAccess.getDataAccess().getPathAssignment_6_1(), "rule__Data__PathAssignment_6_1");
					put(grammarAccess.getApplicationAccess().getNameAssignment_1(), "rule__Application__NameAssignment_1");
					put(grammarAccess.getApplicationAccess().getAvdAssignment_3(), "rule__Application__AvdAssignment_3");
					put(grammarAccess.getApplicationAccess().getWorkDirAssignment_4_1(), "rule__Application__WorkDirAssignment_4_1");
					put(grammarAccess.getApplicationAccess().getPackageNameAssignment_6(), "rule__Application__PackageNameAssignment_6");
					put(grammarAccess.getApplicationAccess().getMainActivityAssignment_8(), "rule__Application__MainActivityAssignment_8");
					put(grammarAccess.getApplicationAccess().getTargetAssignment_10(), "rule__Application__TargetAssignment_10");
					put(grammarAccess.getApplicationAccess().getPathAssignment_12(), "rule__Application__PathAssignment_12");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			it.unibo.madz.mobile.ui.contentassist.antlr.internal.InternalAndroidLParser typedParser = (it.unibo.madz.mobile.ui.contentassist.antlr.internal.InternalAndroidLParser) parser;
			typedParser.entryRuleAndroidSystem();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AndroidLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AndroidLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
