/*
* generated by Xtext
*/
package emfviews.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import emfviews.dsl.services.SqlviewGrammarAccess;

public class SqlviewParser extends AbstractContentAssistParser {
	
	@Inject
	private SqlviewGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected emfviews.dsl.ui.contentassist.antlr.internal.InternalSqlviewParser createParser() {
		emfviews.dsl.ui.contentassist.antlr.internal.InternalSqlviewParser result = new emfviews.dsl.ui.contentassist.antlr.internal.InternalSqlviewParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSelectAccess().getAlternatives(), "rule__Select__Alternatives");
					put(grammarAccess.getConditionAccess().getAlternatives_1_0(), "rule__Condition__Alternatives_1_0");
					put(grammarAccess.getComparisonAccess().getAlternatives_1(), "rule__Comparison__Alternatives_1");
					put(grammarAccess.getRightAccess().getAlternatives(), "rule__Right__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
					put(grammarAccess.getMetamodelAccess().getGroup(), "rule__Metamodel__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getSelectAccess().getGroup_1(), "rule__Select__Group_1__0");
					put(grammarAccess.getSelectAccess().getGroup_1_5(), "rule__Select__Group_1_5__0");
					put(grammarAccess.getFromAccess().getGroup(), "rule__From__Group__0");
					put(grammarAccess.getFromAccess().getGroup_3(), "rule__From__Group_3__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getConditionAccess().getGroup_1(), "rule__Condition__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
					put(grammarAccess.getRightAccess().getGroup_0(), "rule__Right__Group_0__0");
					put(grammarAccess.getModelAccess().getViewNameAssignment_1(), "rule__Model__ViewNameAssignment_1");
					put(grammarAccess.getModelAccess().getMetamodelAssignment_3(), "rule__Model__MetamodelAssignment_3");
					put(grammarAccess.getModelAccess().getMetamodelAssignment_4_1(), "rule__Model__MetamodelAssignment_4_1");
					put(grammarAccess.getModelAccess().getExpressionAssignment_5(), "rule__Model__ExpressionAssignment_5");
					put(grammarAccess.getMetamodelAccess().getMetamodelURLAssignment_0(), "rule__Metamodel__MetamodelURLAssignment_0");
					put(grammarAccess.getMetamodelAccess().getMetamodelNameAssignment_2(), "rule__Metamodel__MetamodelNameAssignment_2");
					put(grammarAccess.getExpressionAccess().getSelectAssignment_1(), "rule__Expression__SelectAssignment_1");
					put(grammarAccess.getExpressionAccess().getFromAssignment_3(), "rule__Expression__FromAssignment_3");
					put(grammarAccess.getExpressionAccess().getConditionAssignment_5(), "rule__Expression__ConditionAssignment_5");
					put(grammarAccess.getSelectAccess().getSelectAssignment_0(), "rule__Select__SelectAssignment_0");
					put(grammarAccess.getSelectAccess().getMetamodelAssignment_1_0(), "rule__Select__MetamodelAssignment_1_0");
					put(grammarAccess.getSelectAccess().getClassAssignment_1_2(), "rule__Select__ClassAssignment_1_2");
					put(grammarAccess.getSelectAccess().getAttributeAssignment_1_4(), "rule__Select__AttributeAssignment_1_4");
					put(grammarAccess.getSelectAccess().getMetamodelAssignment_1_5_1(), "rule__Select__MetamodelAssignment_1_5_1");
					put(grammarAccess.getSelectAccess().getClassAssignment_1_5_3(), "rule__Select__ClassAssignment_1_5_3");
					put(grammarAccess.getSelectAccess().getAttributeAssignment_1_5_5(), "rule__Select__AttributeAssignment_1_5_5");
					put(grammarAccess.getFromAccess().getMetamodelAssignment_0(), "rule__From__MetamodelAssignment_0");
					put(grammarAccess.getFromAccess().getClassAssignment_2(), "rule__From__ClassAssignment_2");
					put(grammarAccess.getFromAccess().getMetamodelAssignment_3_1(), "rule__From__MetamodelAssignment_3_1");
					put(grammarAccess.getFromAccess().getClassAssignment_3_3(), "rule__From__ClassAssignment_3_3");
					put(grammarAccess.getAttributeAccess().getNameAssignment(), "rule__Attribute__NameAssignment");
					put(grammarAccess.getClassAccess().getNameAssignment(), "rule__Class__NameAssignment");
					put(grammarAccess.getMetamodelNameAccess().getNameAssignment(), "rule__MetamodelName__NameAssignment");
					put(grammarAccess.getConditionAccess().getValueAssignment_0(), "rule__Condition__ValueAssignment_0");
					put(grammarAccess.getConditionAccess().getValueAssignment_1_1(), "rule__Condition__ValueAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getLeftAssignment_0(), "rule__Comparison__LeftAssignment_0");
					put(grammarAccess.getComparisonAccess().getRightAssignment_2(), "rule__Comparison__RightAssignment_2");
					put(grammarAccess.getLeftAccess().getMetamodelAssignment_0(), "rule__Left__MetamodelAssignment_0");
					put(grammarAccess.getLeftAccess().getClassAssignment_2(), "rule__Left__ClassAssignment_2");
					put(grammarAccess.getLeftAccess().getAttributeWhereLeftAssignment_4(), "rule__Left__AttributeWhereLeftAssignment_4");
					put(grammarAccess.getRightAccess().getMetamodelAssignment_0_0(), "rule__Right__MetamodelAssignment_0_0");
					put(grammarAccess.getRightAccess().getClassAssignment_0_2(), "rule__Right__ClassAssignment_0_2");
					put(grammarAccess.getRightAccess().getAttributeWhereRightAssignment_0_4(), "rule__Right__AttributeWhereRightAssignment_0_4");
					put(grammarAccess.getRightAccess().getValueAssignment_1(), "rule__Right__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			emfviews.dsl.ui.contentassist.antlr.internal.InternalSqlviewParser typedParser = (emfviews.dsl.ui.contentassist.antlr.internal.InternalSqlviewParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SqlviewGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SqlviewGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
