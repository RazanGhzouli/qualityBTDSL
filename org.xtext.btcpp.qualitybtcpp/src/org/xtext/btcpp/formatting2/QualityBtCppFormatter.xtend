/*
 * generated by Xtext 2.36.0
 */
package org.xtext.btcpp.formatting2

import btcpp.BehaviorTree
import btcpp.Root
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.btcpp.services.QualityBtCppGrammarAccess

class QualityBtCppFormatter extends AbstractFormatter2 {
	
	@Inject extension QualityBtCppGrammarAccess

	def dispatch void format(Root root, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (behaviorTree : root.behaviortrees) {
			behaviorTree.format
		}
	}

	def dispatch void format(BehaviorTree behaviorTree, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (treeNode : behaviorTree.node) {
			treeNode.format
		}
	}
	
	// TODO: implement for Quality, AlwaysFailureNode, AlwaysSuccessNode, SetBlackboardNode, FallbackNode, IfThenElseNode, ManualSelectorNode, ParallelNode, SequenceWithMemoryNode, SwitchNode, ReactiveFallbackNode, WhileDoElseNode, ReactiveSequenceNode, SequenceNode, TimeoutNode, KeepRunningUntilFailureNode, InverterNode, ForceSuccessNode, ForceFailureNode, RepeatNode, SubTree, ScriptNode, ScriptConditionNode, RetryNode, ParallelAllNode, DelayNode, PreconditionNode, EntryUpdatedDecoratorNode, RunOnceNode, LoopNode, ConsumeQueueNode, TestNode, EntryUpdatedActionNode, UnsetBlackboardNode, ThreadedActionNode, CoroActionNode, SleepNode, PopFromQueueNode
}