/*
 * generated by Xtext 2.36.0
 */
package org.xtext.btcpp.serializer;

import btcpp.AlwaysFailureNode;
import btcpp.AlwaysSuccessNode;
import btcpp.BehaviorTree;
import btcpp.BtcppPackage;
import btcpp.ConsumeQueueNode;
import btcpp.CoroActionNode;
import btcpp.DelayNode;
import btcpp.EntryUpdatedActionNode;
import btcpp.EntryUpdatedDecoratorNode;
import btcpp.FallbackNode;
import btcpp.ForceFailureNode;
import btcpp.ForceSuccessNode;
import btcpp.IfThenElseNode;
import btcpp.InverterNode;
import btcpp.KeepRunningUntilFailureNode;
import btcpp.LoopNode;
import btcpp.ManualSelectorNode;
import btcpp.ParallelAllNode;
import btcpp.ParallelNode;
import btcpp.PopFromQueueNode;
import btcpp.PreconditionNode;
import btcpp.Quality;
import btcpp.QualityRequirement;
import btcpp.ReactiveFallbackNode;
import btcpp.ReactiveSequenceNode;
import btcpp.RepeatNode;
import btcpp.RetryNode;
import btcpp.Root;
import btcpp.RunOnceNode;
import btcpp.ScriptConditionNode;
import btcpp.ScriptNode;
import btcpp.SequenceNode;
import btcpp.SequenceWithMemoryNode;
import btcpp.SetBlackboardNode;
import btcpp.SleepNode;
import btcpp.SubTree;
import btcpp.SwitchNode;
import btcpp.TestNode;
import btcpp.ThreadedActionNode;
import btcpp.TimeoutNode;
import btcpp.UnsetBlackboardNode;
import btcpp.WhileDoElseNode;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.btcpp.services.QualityBtCppGrammarAccess;

@SuppressWarnings("all")
public class QualityBtCppSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QualityBtCppGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BtcppPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BtcppPackage.ALWAYS_FAILURE_NODE:
				sequence_AlwaysFailureNode(context, (AlwaysFailureNode) semanticObject); 
				return; 
			case BtcppPackage.ALWAYS_SUCCESS_NODE:
				sequence_AlwaysSuccessNode(context, (AlwaysSuccessNode) semanticObject); 
				return; 
			case BtcppPackage.BEHAVIOR_TREE:
				sequence_BehaviorTree(context, (BehaviorTree) semanticObject); 
				return; 
			case BtcppPackage.CONSUME_QUEUE_NODE:
				sequence_ConsumeQueueNode(context, (ConsumeQueueNode) semanticObject); 
				return; 
			case BtcppPackage.CORO_ACTION_NODE:
				sequence_CoroActionNode(context, (CoroActionNode) semanticObject); 
				return; 
			case BtcppPackage.DELAY_NODE:
				sequence_DelayNode(context, (DelayNode) semanticObject); 
				return; 
			case BtcppPackage.ENTRY_UPDATED_ACTION_NODE:
				sequence_EntryUpdatedActionNode(context, (EntryUpdatedActionNode) semanticObject); 
				return; 
			case BtcppPackage.ENTRY_UPDATED_DECORATOR_NODE:
				sequence_EntryUpdatedDecoratorNode(context, (EntryUpdatedDecoratorNode) semanticObject); 
				return; 
			case BtcppPackage.FALLBACK_NODE:
				sequence_FallbackNode(context, (FallbackNode) semanticObject); 
				return; 
			case BtcppPackage.FORCE_FAILURE_NODE:
				sequence_ForceFailureNode(context, (ForceFailureNode) semanticObject); 
				return; 
			case BtcppPackage.FORCE_SUCCESS_NODE:
				sequence_ForceSuccessNode(context, (ForceSuccessNode) semanticObject); 
				return; 
			case BtcppPackage.IF_THEN_ELSE_NODE:
				sequence_IfThenElseNode(context, (IfThenElseNode) semanticObject); 
				return; 
			case BtcppPackage.INVERTER_NODE:
				sequence_InverterNode(context, (InverterNode) semanticObject); 
				return; 
			case BtcppPackage.KEEP_RUNNING_UNTIL_FAILURE_NODE:
				sequence_KeepRunningUntilFailureNode(context, (KeepRunningUntilFailureNode) semanticObject); 
				return; 
			case BtcppPackage.LOOP_NODE:
				sequence_LoopNode(context, (LoopNode) semanticObject); 
				return; 
			case BtcppPackage.MANUAL_SELECTOR_NODE:
				sequence_ManualSelectorNode(context, (ManualSelectorNode) semanticObject); 
				return; 
			case BtcppPackage.PARALLEL_ALL_NODE:
				sequence_ParallelAllNode(context, (ParallelAllNode) semanticObject); 
				return; 
			case BtcppPackage.PARALLEL_NODE:
				sequence_ParallelNode(context, (ParallelNode) semanticObject); 
				return; 
			case BtcppPackage.PARAMETER:
				sequence_Parameter(context, (btcpp.Parameter) semanticObject); 
				return; 
			case BtcppPackage.POP_FROM_QUEUE_NODE:
				sequence_PopFromQueueNode(context, (PopFromQueueNode) semanticObject); 
				return; 
			case BtcppPackage.PRECONDITION_NODE:
				sequence_PreconditionNode(context, (PreconditionNode) semanticObject); 
				return; 
			case BtcppPackage.QUALITY:
				sequence_Quality(context, (Quality) semanticObject); 
				return; 
			case BtcppPackage.QUALITY_REQUIREMENT:
				sequence_QualityRequirement(context, (QualityRequirement) semanticObject); 
				return; 
			case BtcppPackage.REACTIVE_FALLBACK_NODE:
				sequence_ReactiveFallbackNode(context, (ReactiveFallbackNode) semanticObject); 
				return; 
			case BtcppPackage.REACTIVE_SEQUENCE_NODE:
				sequence_ReactiveSequenceNode(context, (ReactiveSequenceNode) semanticObject); 
				return; 
			case BtcppPackage.REPEAT_NODE:
				sequence_RepeatNode(context, (RepeatNode) semanticObject); 
				return; 
			case BtcppPackage.RETRY_NODE:
				sequence_RetryNode(context, (RetryNode) semanticObject); 
				return; 
			case BtcppPackage.ROOT:
				sequence_Root(context, (Root) semanticObject); 
				return; 
			case BtcppPackage.RUN_ONCE_NODE:
				sequence_RunOnceNode(context, (RunOnceNode) semanticObject); 
				return; 
			case BtcppPackage.SCRIPT_CONDITION_NODE:
				sequence_ScriptConditionNode(context, (ScriptConditionNode) semanticObject); 
				return; 
			case BtcppPackage.SCRIPT_NODE:
				sequence_ScriptNode(context, (ScriptNode) semanticObject); 
				return; 
			case BtcppPackage.SEQUENCE_NODE:
				sequence_SequenceNode(context, (SequenceNode) semanticObject); 
				return; 
			case BtcppPackage.SEQUENCE_WITH_MEMORY_NODE:
				sequence_SequenceWithMemoryNode(context, (SequenceWithMemoryNode) semanticObject); 
				return; 
			case BtcppPackage.SET_BLACKBOARD_NODE:
				sequence_SetBlackboardNode(context, (SetBlackboardNode) semanticObject); 
				return; 
			case BtcppPackage.SLEEP_NODE:
				sequence_SleepNode(context, (SleepNode) semanticObject); 
				return; 
			case BtcppPackage.SUB_TREE:
				sequence_SubTree(context, (SubTree) semanticObject); 
				return; 
			case BtcppPackage.SWITCH_NODE:
				sequence_SwitchNode(context, (SwitchNode) semanticObject); 
				return; 
			case BtcppPackage.TEST_NODE:
				sequence_TestNode(context, (TestNode) semanticObject); 
				return; 
			case BtcppPackage.THREADED_ACTION_NODE:
				sequence_ThreadedActionNode(context, (ThreadedActionNode) semanticObject); 
				return; 
			case BtcppPackage.TIMEOUT_NODE:
				sequence_TimeoutNode(context, (TimeoutNode) semanticObject); 
				return; 
			case BtcppPackage.UNSET_BLACKBOARD_NODE:
				sequence_UnsetBlackboardNode(context, (UnsetBlackboardNode) semanticObject); 
				return; 
			case BtcppPackage.WHILE_DO_ELSE_NODE:
				sequence_WhileDoElseNode(context, (WhileDoElseNode) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns AlwaysFailureNode
	 *     LeafNode returns AlwaysFailureNode
	 *     ActionNodeBase returns AlwaysFailureNode
	 *     AlwaysFailureNode returns AlwaysFailureNode
	 *
	 * Constraint:
	 *     (
	 *         ID=EString? 
	 *         name=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_AlwaysFailureNode(ISerializationContext context, AlwaysFailureNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns AlwaysSuccessNode
	 *     LeafNode returns AlwaysSuccessNode
	 *     ActionNodeBase returns AlwaysSuccessNode
	 *     AlwaysSuccessNode returns AlwaysSuccessNode
	 *
	 * Constraint:
	 *     (
	 *         ID=EString? 
	 *         name=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_AlwaysSuccessNode(ISerializationContext context, AlwaysSuccessNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BehaviorTree returns BehaviorTree
	 *
	 * Constraint:
	 *     (ID=EString node+=TreeNode node+=TreeNode*)
	 * </pre>
	 */
	protected void sequence_BehaviorTree(ISerializationContext context, BehaviorTree semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ConsumeQueueNode
	 *     DecoratorNode returns ConsumeQueueNode
	 *     ConsumeQueueNode returns ConsumeQueueNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_ConsumeQueueNode(ISerializationContext context, ConsumeQueueNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns CoroActionNode
	 *     LeafNode returns CoroActionNode
	 *     ActionNodeBase returns CoroActionNode
	 *     CoroActionNode returns CoroActionNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_CoroActionNode(ISerializationContext context, CoroActionNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns DelayNode
	 *     DecoratorNode returns DelayNode
	 *     DelayNode returns DelayNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         delay_msec=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_DelayNode(ISerializationContext context, DelayNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns EntryUpdatedActionNode
	 *     LeafNode returns EntryUpdatedActionNode
	 *     ActionNodeBase returns EntryUpdatedActionNode
	 *     EntryUpdatedActionNode returns EntryUpdatedActionNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_EntryUpdatedActionNode(ISerializationContext context, EntryUpdatedActionNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EntryUpdatedDecoratorNode returns EntryUpdatedDecoratorNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_EntryUpdatedDecoratorNode(ISerializationContext context, EntryUpdatedDecoratorNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns FallbackNode
	 *     ControlNode returns FallbackNode
	 *     FallbackNode returns FallbackNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_FallbackNode(ISerializationContext context, FallbackNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ForceFailureNode
	 *     DecoratorNode returns ForceFailureNode
	 *     ForceFailureNode returns ForceFailureNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_ForceFailureNode(ISerializationContext context, ForceFailureNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ForceSuccessNode
	 *     DecoratorNode returns ForceSuccessNode
	 *     ForceSuccessNode returns ForceSuccessNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_ForceSuccessNode(ISerializationContext context, ForceSuccessNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns IfThenElseNode
	 *     ControlNode returns IfThenElseNode
	 *     IfThenElseNode returns IfThenElseNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_IfThenElseNode(ISerializationContext context, IfThenElseNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns InverterNode
	 *     DecoratorNode returns InverterNode
	 *     InverterNode returns InverterNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_InverterNode(ISerializationContext context, InverterNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns KeepRunningUntilFailureNode
	 *     DecoratorNode returns KeepRunningUntilFailureNode
	 *     KeepRunningUntilFailureNode returns KeepRunningUntilFailureNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_KeepRunningUntilFailureNode(ISerializationContext context, KeepRunningUntilFailureNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns LoopNode
	 *     DecoratorNode returns LoopNode
	 *     LoopNode returns LoopNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_LoopNode(ISerializationContext context, LoopNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ManualSelectorNode
	 *     ControlNode returns ManualSelectorNode
	 *     ManualSelectorNode returns ManualSelectorNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_ManualSelectorNode(ISerializationContext context, ManualSelectorNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ParallelAllNode
	 *     ControlNode returns ParallelAllNode
	 *     ParallelAllNode returns ParallelAllNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_ParallelAllNode(ISerializationContext context, ParallelAllNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ParallelNode
	 *     ControlNode returns ParallelNode
	 *     ParallelNode returns ParallelNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_ParallelNode(ISerializationContext context, ParallelNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (key=EString value=EString)
	 * </pre>
	 */
	protected void sequence_Parameter(ISerializationContext context, btcpp.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BtcppPackage.Literals.PARAMETER__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BtcppPackage.Literals.PARAMETER__KEY));
			if (transientValues.isValueTransient(semanticObject, BtcppPackage.Literals.PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BtcppPackage.Literals.PARAMETER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getKeyEStringParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns PopFromQueueNode
	 *     LeafNode returns PopFromQueueNode
	 *     ActionNodeBase returns PopFromQueueNode
	 *     PopFromQueueNode returns PopFromQueueNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_PopFromQueueNode(ISerializationContext context, PopFromQueueNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns PreconditionNode
	 *     DecoratorNode returns PreconditionNode
	 *     PreconditionNode returns PreconditionNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_PreconditionNode(ISerializationContext context, PreconditionNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QualityRequirement returns QualityRequirement
	 *
	 * Constraint:
	 *     (ID=EString? description=EString?)
	 * </pre>
	 */
	protected void sequence_QualityRequirement(ISerializationContext context, QualityRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Quality returns Quality
	 *
	 * Constraint:
	 *     (ID=EString? (qualityreq+=QualityRequirement qualityreq+=QualityRequirement*)?)
	 * </pre>
	 */
	protected void sequence_Quality(ISerializationContext context, Quality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ReactiveFallbackNode
	 *     ControlNode returns ReactiveFallbackNode
	 *     ReactiveFallbackNode returns ReactiveFallbackNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_ReactiveFallbackNode(ISerializationContext context, ReactiveFallbackNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ReactiveSequenceNode
	 *     ControlNode returns ReactiveSequenceNode
	 *     ReactiveSequenceNode returns ReactiveSequenceNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_ReactiveSequenceNode(ISerializationContext context, ReactiveSequenceNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns RepeatNode
	 *     DecoratorNode returns RepeatNode
	 *     RepeatNode returns RepeatNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         num_cycles=EString 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_RepeatNode(ISerializationContext context, RepeatNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns RetryNode
	 *     DecoratorNode returns RetryNode
	 *     RetryNode returns RetryNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         num_attempts=EString 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_RetryNode(ISerializationContext context, RetryNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Root returns Root
	 *
	 * Constraint:
	 *     (main_tree_to_execute=EString behaviortrees+=BehaviorTree behaviortrees+=BehaviorTree*)
	 * </pre>
	 */
	protected void sequence_Root(ISerializationContext context, Root semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns RunOnceNode
	 *     DecoratorNode returns RunOnceNode
	 *     RunOnceNode returns RunOnceNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_RunOnceNode(ISerializationContext context, RunOnceNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ScriptConditionNode
	 *     LeafNode returns ScriptConditionNode
	 *     ConditionNode returns ScriptConditionNode
	 *     ScriptConditionNode returns ScriptConditionNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_ScriptConditionNode(ISerializationContext context, ScriptConditionNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ScriptNode
	 *     LeafNode returns ScriptNode
	 *     ActionNodeBase returns ScriptNode
	 *     ScriptNode returns ScriptNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_ScriptNode(ISerializationContext context, ScriptNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns SequenceNode
	 *     ControlNode returns SequenceNode
	 *     SequenceNode returns SequenceNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_SequenceNode(ISerializationContext context, SequenceNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns SequenceWithMemoryNode
	 *     ControlNode returns SequenceWithMemoryNode
	 *     SequenceWithMemoryNode returns SequenceWithMemoryNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_SequenceWithMemoryNode(ISerializationContext context, SequenceWithMemoryNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns SetBlackboardNode
	 *     LeafNode returns SetBlackboardNode
	 *     ActionNodeBase returns SetBlackboardNode
	 *     SetBlackboardNode returns SetBlackboardNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         value=EString 
	 *         output_key=EString 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_SetBlackboardNode(ISerializationContext context, SetBlackboardNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns SleepNode
	 *     LeafNode returns SleepNode
	 *     ActionNodeBase returns SleepNode
	 *     SleepNode returns SleepNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_SleepNode(ISerializationContext context, SleepNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns SubTree
	 *     SubTree returns SubTree
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         (child+=TreeNode child+=TreeNode*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_SubTree(ISerializationContext context, SubTree semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns SwitchNode
	 *     ControlNode returns SwitchNode
	 *     SwitchNode returns SwitchNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_SwitchNode(ISerializationContext context, SwitchNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns TestNode
	 *     LeafNode returns TestNode
	 *     ActionNodeBase returns TestNode
	 *     TestNode returns TestNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_TestNode(ISerializationContext context, TestNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns ThreadedActionNode
	 *     LeafNode returns ThreadedActionNode
	 *     ActionNodeBase returns ThreadedActionNode
	 *     ThreadedActionNode returns ThreadedActionNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_ThreadedActionNode(ISerializationContext context, ThreadedActionNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns TimeoutNode
	 *     DecoratorNode returns TimeoutNode
	 *     TimeoutNode returns TimeoutNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         msec=EString 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child=TreeNode
	 *     )
	 * </pre>
	 */
	protected void sequence_TimeoutNode(ISerializationContext context, TimeoutNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns UnsetBlackboardNode
	 *     LeafNode returns UnsetBlackboardNode
	 *     ActionNodeBase returns UnsetBlackboardNode
	 *     UnsetBlackboardNode returns UnsetBlackboardNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_UnsetBlackboardNode(ISerializationContext context, UnsetBlackboardNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TreeNode returns WhileDoElseNode
	 *     ControlNode returns WhileDoElseNode
	 *     WhileDoElseNode returns WhileDoElseNode
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ID=EString? 
	 *         (satisfices+=[Quality|EString] satisfices+=[Quality|EString]*)? 
	 *         (satisfies+=[QualityRequirement|EString] satisfies+=[QualityRequirement|EString]*)? 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         child+=TreeNode 
	 *         child+=TreeNode*
	 *     )
	 * </pre>
	 */
	protected void sequence_WhileDoElseNode(ISerializationContext context, WhileDoElseNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}