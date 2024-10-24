/**
 */
package btcpp.util;

import btcpp.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see btcpp.BtcppPackage
 * @generated
 */
public class BtcppSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BtcppPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcppSwitch() {
		if (modelPackage == null) {
			modelPackage = BtcppPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BtcppPackage.BEHAVIOR_TREE: {
				BehaviorTree behaviorTree = (BehaviorTree)theEObject;
				T result = caseBehaviorTree(behaviorTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.TREE_NODE: {
				TreeNode treeNode = (TreeNode)theEObject;
				T result = caseTreeNode(treeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.CONTROL_NODE: {
				ControlNode controlNode = (ControlNode)theEObject;
				T result = caseControlNode(controlNode);
				if (result == null) result = caseTreeNode(controlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.DECORATOR_NODE: {
				DecoratorNode decoratorNode = (DecoratorNode)theEObject;
				T result = caseDecoratorNode(decoratorNode);
				if (result == null) result = caseTreeNode(decoratorNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.ALWAYS_FAILURE_NODE: {
				AlwaysFailureNode alwaysFailureNode = (AlwaysFailureNode)theEObject;
				T result = caseAlwaysFailureNode(alwaysFailureNode);
				if (result == null) result = caseSyncActionNode(alwaysFailureNode);
				if (result == null) result = caseActionNodeBase(alwaysFailureNode);
				if (result == null) result = caseLeafNode(alwaysFailureNode);
				if (result == null) result = caseTreeNode(alwaysFailureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.ALWAYS_SUCCESS_NODE: {
				AlwaysSuccessNode alwaysSuccessNode = (AlwaysSuccessNode)theEObject;
				T result = caseAlwaysSuccessNode(alwaysSuccessNode);
				if (result == null) result = caseSyncActionNode(alwaysSuccessNode);
				if (result == null) result = caseActionNodeBase(alwaysSuccessNode);
				if (result == null) result = caseLeafNode(alwaysSuccessNode);
				if (result == null) result = caseTreeNode(alwaysSuccessNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SET_BLACKBOARD_NODE: {
				SetBlackboardNode setBlackboardNode = (SetBlackboardNode)theEObject;
				T result = caseSetBlackboardNode(setBlackboardNode);
				if (result == null) result = caseSyncActionNode(setBlackboardNode);
				if (result == null) result = caseActionNodeBase(setBlackboardNode);
				if (result == null) result = caseLeafNode(setBlackboardNode);
				if (result == null) result = caseTreeNode(setBlackboardNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.FALLBACK_NODE: {
				FallbackNode fallbackNode = (FallbackNode)theEObject;
				T result = caseFallbackNode(fallbackNode);
				if (result == null) result = caseControlNode(fallbackNode);
				if (result == null) result = caseTreeNode(fallbackNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.IF_THEN_ELSE_NODE: {
				IfThenElseNode ifThenElseNode = (IfThenElseNode)theEObject;
				T result = caseIfThenElseNode(ifThenElseNode);
				if (result == null) result = caseControlNode(ifThenElseNode);
				if (result == null) result = caseTreeNode(ifThenElseNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.MANUAL_SELECTOR_NODE: {
				ManualSelectorNode manualSelectorNode = (ManualSelectorNode)theEObject;
				T result = caseManualSelectorNode(manualSelectorNode);
				if (result == null) result = caseControlNode(manualSelectorNode);
				if (result == null) result = caseTreeNode(manualSelectorNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.PARALLEL_NODE: {
				ParallelNode parallelNode = (ParallelNode)theEObject;
				T result = caseParallelNode(parallelNode);
				if (result == null) result = caseControlNode(parallelNode);
				if (result == null) result = caseTreeNode(parallelNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SEQUENCE_WITH_MEMORY_NODE: {
				SequenceWithMemoryNode sequenceWithMemoryNode = (SequenceWithMemoryNode)theEObject;
				T result = caseSequenceWithMemoryNode(sequenceWithMemoryNode);
				if (result == null) result = caseControlNode(sequenceWithMemoryNode);
				if (result == null) result = caseTreeNode(sequenceWithMemoryNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SWITCH_NODE: {
				SwitchNode switchNode = (SwitchNode)theEObject;
				T result = caseSwitchNode(switchNode);
				if (result == null) result = caseControlNode(switchNode);
				if (result == null) result = caseTreeNode(switchNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.REACTIVE_FALLBACK_NODE: {
				ReactiveFallbackNode reactiveFallbackNode = (ReactiveFallbackNode)theEObject;
				T result = caseReactiveFallbackNode(reactiveFallbackNode);
				if (result == null) result = caseControlNode(reactiveFallbackNode);
				if (result == null) result = caseTreeNode(reactiveFallbackNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.WHILE_DO_ELSE_NODE: {
				WhileDoElseNode whileDoElseNode = (WhileDoElseNode)theEObject;
				T result = caseWhileDoElseNode(whileDoElseNode);
				if (result == null) result = caseControlNode(whileDoElseNode);
				if (result == null) result = caseTreeNode(whileDoElseNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.REACTIVE_SEQUENCE_NODE: {
				ReactiveSequenceNode reactiveSequenceNode = (ReactiveSequenceNode)theEObject;
				T result = caseReactiveSequenceNode(reactiveSequenceNode);
				if (result == null) result = caseControlNode(reactiveSequenceNode);
				if (result == null) result = caseTreeNode(reactiveSequenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SEQUENCE_NODE: {
				SequenceNode sequenceNode = (SequenceNode)theEObject;
				T result = caseSequenceNode(sequenceNode);
				if (result == null) result = caseControlNode(sequenceNode);
				if (result == null) result = caseTreeNode(sequenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.TIMEOUT_NODE: {
				TimeoutNode timeoutNode = (TimeoutNode)theEObject;
				T result = caseTimeoutNode(timeoutNode);
				if (result == null) result = caseDecoratorNode(timeoutNode);
				if (result == null) result = caseTreeNode(timeoutNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.KEEP_RUNNING_UNTIL_FAILURE_NODE: {
				KeepRunningUntilFailureNode keepRunningUntilFailureNode = (KeepRunningUntilFailureNode)theEObject;
				T result = caseKeepRunningUntilFailureNode(keepRunningUntilFailureNode);
				if (result == null) result = caseDecoratorNode(keepRunningUntilFailureNode);
				if (result == null) result = caseTreeNode(keepRunningUntilFailureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.INVERTER_NODE: {
				InverterNode inverterNode = (InverterNode)theEObject;
				T result = caseInverterNode(inverterNode);
				if (result == null) result = caseDecoratorNode(inverterNode);
				if (result == null) result = caseTreeNode(inverterNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.FORCE_SUCCESS_NODE: {
				ForceSuccessNode forceSuccessNode = (ForceSuccessNode)theEObject;
				T result = caseForceSuccessNode(forceSuccessNode);
				if (result == null) result = caseDecoratorNode(forceSuccessNode);
				if (result == null) result = caseTreeNode(forceSuccessNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.FORCE_FAILURE_NODE: {
				ForceFailureNode forceFailureNode = (ForceFailureNode)theEObject;
				T result = caseForceFailureNode(forceFailureNode);
				if (result == null) result = caseDecoratorNode(forceFailureNode);
				if (result == null) result = caseTreeNode(forceFailureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.REPEAT_NODE: {
				RepeatNode repeatNode = (RepeatNode)theEObject;
				T result = caseRepeatNode(repeatNode);
				if (result == null) result = caseDecoratorNode(repeatNode);
				if (result == null) result = caseTreeNode(repeatNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.CONDITION_NODE: {
				ConditionNode conditionNode = (ConditionNode)theEObject;
				T result = caseConditionNode(conditionNode);
				if (result == null) result = caseLeafNode(conditionNode);
				if (result == null) result = caseTreeNode(conditionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SUB_TREE: {
				SubTree subTree = (SubTree)theEObject;
				T result = caseSubTree(subTree);
				if (result == null) result = caseTreeNode(subTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.LEAF_NODE: {
				LeafNode leafNode = (LeafNode)theEObject;
				T result = caseLeafNode(leafNode);
				if (result == null) result = caseTreeNode(leafNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.ACTION_NODE_BASE: {
				ActionNodeBase actionNodeBase = (ActionNodeBase)theEObject;
				T result = caseActionNodeBase(actionNodeBase);
				if (result == null) result = caseLeafNode(actionNodeBase);
				if (result == null) result = caseTreeNode(actionNodeBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SCRIPT_NODE: {
				ScriptNode scriptNode = (ScriptNode)theEObject;
				T result = caseScriptNode(scriptNode);
				if (result == null) result = caseSyncActionNode(scriptNode);
				if (result == null) result = caseActionNodeBase(scriptNode);
				if (result == null) result = caseLeafNode(scriptNode);
				if (result == null) result = caseTreeNode(scriptNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SCRIPT_CONDITION_NODE: {
				ScriptConditionNode scriptConditionNode = (ScriptConditionNode)theEObject;
				T result = caseScriptConditionNode(scriptConditionNode);
				if (result == null) result = caseConditionNode(scriptConditionNode);
				if (result == null) result = caseLeafNode(scriptConditionNode);
				if (result == null) result = caseTreeNode(scriptConditionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.RETRY_NODE: {
				RetryNode retryNode = (RetryNode)theEObject;
				T result = caseRetryNode(retryNode);
				if (result == null) result = caseDecoratorNode(retryNode);
				if (result == null) result = caseTreeNode(retryNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.QUALITY_REQUIREMENT: {
				QualityRequirement qualityRequirement = (QualityRequirement)theEObject;
				T result = caseQualityRequirement(qualityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.QUALITY: {
				Quality quality = (Quality)theEObject;
				T result = caseQuality(quality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.PARALLEL_ALL_NODE: {
				ParallelAllNode parallelAllNode = (ParallelAllNode)theEObject;
				T result = caseParallelAllNode(parallelAllNode);
				if (result == null) result = caseControlNode(parallelAllNode);
				if (result == null) result = caseTreeNode(parallelAllNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.DELAY_NODE: {
				DelayNode delayNode = (DelayNode)theEObject;
				T result = caseDelayNode(delayNode);
				if (result == null) result = caseDecoratorNode(delayNode);
				if (result == null) result = caseTreeNode(delayNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.PRECONDITION_NODE: {
				PreconditionNode preconditionNode = (PreconditionNode)theEObject;
				T result = casePreconditionNode(preconditionNode);
				if (result == null) result = caseDecoratorNode(preconditionNode);
				if (result == null) result = caseTreeNode(preconditionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.ENTRY_UPDATED_DECORATOR_NODE: {
				EntryUpdatedDecoratorNode entryUpdatedDecoratorNode = (EntryUpdatedDecoratorNode)theEObject;
				T result = caseEntryUpdatedDecoratorNode(entryUpdatedDecoratorNode);
				if (result == null) result = caseDecoratorNode(entryUpdatedDecoratorNode);
				if (result == null) result = caseTreeNode(entryUpdatedDecoratorNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.RUN_ONCE_NODE: {
				RunOnceNode runOnceNode = (RunOnceNode)theEObject;
				T result = caseRunOnceNode(runOnceNode);
				if (result == null) result = caseDecoratorNode(runOnceNode);
				if (result == null) result = caseTreeNode(runOnceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.LOOP_NODE: {
				LoopNode loopNode = (LoopNode)theEObject;
				T result = caseLoopNode(loopNode);
				if (result == null) result = caseDecoratorNode(loopNode);
				if (result == null) result = caseTreeNode(loopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.CONSUME_QUEUE_NODE: {
				ConsumeQueueNode consumeQueueNode = (ConsumeQueueNode)theEObject;
				T result = caseConsumeQueueNode(consumeQueueNode);
				if (result == null) result = caseDecoratorNode(consumeQueueNode);
				if (result == null) result = caseTreeNode(consumeQueueNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.TEST_NODE: {
				TestNode testNode = (TestNode)theEObject;
				T result = caseTestNode(testNode);
				if (result == null) result = caseStatefulActionNode(testNode);
				if (result == null) result = caseAsynchActionNode(testNode);
				if (result == null) result = caseActionNodeBase(testNode);
				if (result == null) result = caseLeafNode(testNode);
				if (result == null) result = caseTreeNode(testNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.ENTRY_UPDATED_ACTION_NODE: {
				EntryUpdatedActionNode entryUpdatedActionNode = (EntryUpdatedActionNode)theEObject;
				T result = caseEntryUpdatedActionNode(entryUpdatedActionNode);
				if (result == null) result = caseSyncActionNode(entryUpdatedActionNode);
				if (result == null) result = caseActionNodeBase(entryUpdatedActionNode);
				if (result == null) result = caseLeafNode(entryUpdatedActionNode);
				if (result == null) result = caseTreeNode(entryUpdatedActionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.UNSET_BLACKBOARD_NODE: {
				UnsetBlackboardNode unsetBlackboardNode = (UnsetBlackboardNode)theEObject;
				T result = caseUnsetBlackboardNode(unsetBlackboardNode);
				if (result == null) result = caseSyncActionNode(unsetBlackboardNode);
				if (result == null) result = caseActionNodeBase(unsetBlackboardNode);
				if (result == null) result = caseLeafNode(unsetBlackboardNode);
				if (result == null) result = caseTreeNode(unsetBlackboardNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SYNC_ACTION_NODE: {
				SyncActionNode syncActionNode = (SyncActionNode)theEObject;
				T result = caseSyncActionNode(syncActionNode);
				if (result == null) result = caseActionNodeBase(syncActionNode);
				if (result == null) result = caseLeafNode(syncActionNode);
				if (result == null) result = caseTreeNode(syncActionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.THREADED_ACTION_NODE: {
				ThreadedActionNode threadedActionNode = (ThreadedActionNode)theEObject;
				T result = caseThreadedActionNode(threadedActionNode);
				if (result == null) result = caseActionNodeBase(threadedActionNode);
				if (result == null) result = caseLeafNode(threadedActionNode);
				if (result == null) result = caseTreeNode(threadedActionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.STATEFUL_ACTION_NODE: {
				StatefulActionNode statefulActionNode = (StatefulActionNode)theEObject;
				T result = caseStatefulActionNode(statefulActionNode);
				if (result == null) result = caseAsynchActionNode(statefulActionNode);
				if (result == null) result = caseActionNodeBase(statefulActionNode);
				if (result == null) result = caseLeafNode(statefulActionNode);
				if (result == null) result = caseTreeNode(statefulActionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.CORO_ACTION_NODE: {
				CoroActionNode coroActionNode = (CoroActionNode)theEObject;
				T result = caseCoroActionNode(coroActionNode);
				if (result == null) result = caseAsynchActionNode(coroActionNode);
				if (result == null) result = caseActionNodeBase(coroActionNode);
				if (result == null) result = caseLeafNode(coroActionNode);
				if (result == null) result = caseTreeNode(coroActionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.ASYNCH_ACTION_NODE: {
				AsynchActionNode asynchActionNode = (AsynchActionNode)theEObject;
				T result = caseAsynchActionNode(asynchActionNode);
				if (result == null) result = caseActionNodeBase(asynchActionNode);
				if (result == null) result = caseLeafNode(asynchActionNode);
				if (result == null) result = caseTreeNode(asynchActionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SLEEP_NODE: {
				SleepNode sleepNode = (SleepNode)theEObject;
				T result = caseSleepNode(sleepNode);
				if (result == null) result = caseStatefulActionNode(sleepNode);
				if (result == null) result = caseAsynchActionNode(sleepNode);
				if (result == null) result = caseActionNodeBase(sleepNode);
				if (result == null) result = caseLeafNode(sleepNode);
				if (result == null) result = caseTreeNode(sleepNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.POP_FROM_QUEUE_NODE: {
				PopFromQueueNode popFromQueueNode = (PopFromQueueNode)theEObject;
				T result = casePopFromQueueNode(popFromQueueNode);
				if (result == null) result = caseSyncActionNode(popFromQueueNode);
				if (result == null) result = caseActionNodeBase(popFromQueueNode);
				if (result == null) result = caseLeafNode(popFromQueueNode);
				if (result == null) result = caseTreeNode(popFromQueueNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorTree(BehaviorTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeNode(TreeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlNode(ControlNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decorator Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decorator Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecoratorNode(DecoratorNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always Failure Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always Failure Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlwaysFailureNode(AlwaysFailureNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always Success Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always Success Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlwaysSuccessNode(AlwaysSuccessNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Blackboard Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Blackboard Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetBlackboardNode(SetBlackboardNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fallback Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fallback Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFallbackNode(FallbackNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Then Else Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Then Else Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfThenElseNode(IfThenElseNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual Selector Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual Selector Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualSelectorNode(ManualSelectorNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelNode(ParallelNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence With Memory Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence With Memory Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceWithMemoryNode(SequenceWithMemoryNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchNode(SwitchNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reactive Fallback Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reactive Fallback Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactiveFallbackNode(ReactiveFallbackNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Do Else Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Do Else Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileDoElseNode(WhileDoElseNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reactive Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reactive Sequence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactiveSequenceNode(ReactiveSequenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceNode(SequenceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeout Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeout Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeoutNode(TimeoutNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keep Running Until Failure Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keep Running Until Failure Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeepRunningUntilFailureNode(KeepRunningUntilFailureNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverter Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverter Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverterNode(InverterNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Force Success Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Force Success Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForceSuccessNode(ForceSuccessNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Force Failure Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Force Failure Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForceFailureNode(ForceFailureNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatNode(RepeatNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionNode(ConditionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubTree(SubTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeafNode(LeafNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Node Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Node Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionNodeBase(ActionNodeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptNode(ScriptNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Condition Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Condition Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptConditionNode(ScriptConditionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retry Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retry Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetryNode(RetryNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityRequirement(QualityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuality(Quality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel All Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel All Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelAllNode(ParallelAllNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayNode(DelayNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreconditionNode(PreconditionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Updated Decorator Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Updated Decorator Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryUpdatedDecoratorNode(EntryUpdatedDecoratorNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run Once Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Once Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunOnceNode(RunOnceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopNode(LoopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consume Queue Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consume Queue Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumeQueueNode(ConsumeQueueNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestNode(TestNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Updated Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Updated Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryUpdatedActionNode(EntryUpdatedActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unset Blackboard Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unset Blackboard Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsetBlackboardNode(UnsetBlackboardNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sync Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sync Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSyncActionNode(SyncActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threaded Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threaded Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadedActionNode(ThreadedActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stateful Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stateful Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatefulActionNode(StatefulActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coro Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coro Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoroActionNode(CoroActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asynch Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asynch Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynchActionNode(AsynchActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sleep Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sleep Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSleepNode(SleepNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pop From Queue Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pop From Queue Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopFromQueueNode(PopFromQueueNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BtcppSwitch
