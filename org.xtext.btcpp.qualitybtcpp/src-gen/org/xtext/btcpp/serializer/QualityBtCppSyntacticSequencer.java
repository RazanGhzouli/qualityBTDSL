/*
 * generated by Xtext 2.36.0
 */
package org.xtext.btcpp.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.btcpp.services.QualityBtCppGrammarAccess;

@SuppressWarnings("all")
public class QualityBtCppSyntacticSequencer extends AbstractSyntacticSequencer {

	protected QualityBtCppGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AlwaysFailureNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q;
	protected AbstractElementAlias match_AlwaysSuccessNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QualityBtCppGrammarAccess) access;
		match_AlwaysFailureNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAlwaysFailureNodeAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAlwaysFailureNodeAccess().getRightParenthesisKeyword_2_6()));
		match_AlwaysSuccessNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAlwaysSuccessNodeAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAlwaysSuccessNodeAccess().getRightParenthesisKeyword_2_6()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AlwaysFailureNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q.equals(syntax))
				emit_AlwaysFailureNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AlwaysSuccessNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q.equals(syntax))
				emit_AlwaysSuccessNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'AlwaysFailure' (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_AlwaysFailureNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'AlwaysSuccessNode' (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_AlwaysSuccessNode___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}