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
				if (result == null) result = caseActionNodeBase(alwaysFailureNode);
				if (result == null) result = caseLeafNode(alwaysFailureNode);
				if (result == null) result = caseTreeNode(alwaysFailureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.ALWAYS_SUCCESS_NODE: {
				AlwaysSuccessNode alwaysSuccessNode = (AlwaysSuccessNode)theEObject;
				T result = caseAlwaysSuccessNode(alwaysSuccessNode);
				if (result == null) result = caseActionNodeBase(alwaysSuccessNode);
				if (result == null) result = caseLeafNode(alwaysSuccessNode);
				if (result == null) result = caseTreeNode(alwaysSuccessNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SET_BLACKBOARD_NODE: {
				SetBlackboardNode setBlackboardNode = (SetBlackboardNode)theEObject;
				T result = caseSetBlackboardNode(setBlackboardNode);
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
			case BtcppPackage.MNUAL_NODE: {
				MnualNode mnualNode = (MnualNode)theEObject;
				T result = caseMnualNode(mnualNode);
				if (result == null) result = caseControlNode(mnualNode);
				if (result == null) result = caseTreeNode(mnualNode);
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
			case BtcppPackage.SEQUENCE_STAR_NODE: {
				SequenceStarNode sequenceStarNode = (SequenceStarNode)theEObject;
				T result = caseSequenceStarNode(sequenceStarNode);
				if (result == null) result = caseControlNode(sequenceStarNode);
				if (result == null) result = caseTreeNode(sequenceStarNode);
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
			case BtcppPackage.REACTIVE_FALLBACK: {
				ReactiveFallback reactiveFallback = (ReactiveFallback)theEObject;
				T result = caseReactiveFallback(reactiveFallback);
				if (result == null) result = caseControlNode(reactiveFallback);
				if (result == null) result = caseTreeNode(reactiveFallback);
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
			case BtcppPackage.REACTIVE_SEQUENCE: {
				ReactiveSequence reactiveSequence = (ReactiveSequence)theEObject;
				T result = caseReactiveSequence(reactiveSequence);
				if (result == null) result = caseControlNode(reactiveSequence);
				if (result == null) result = caseTreeNode(reactiveSequence);
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
			case BtcppPackage.SUBTREE_NODE: {
				SubtreeNode subtreeNode = (SubtreeNode)theEObject;
				T result = caseSubtreeNode(subtreeNode);
				if (result == null) result = caseDecoratorNode(subtreeNode);
				if (result == null) result = caseTreeNode(subtreeNode);
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
			case BtcppPackage.TIMER_QUEUE_NODE: {
				TimerQueueNode timerQueueNode = (TimerQueueNode)theEObject;
				T result = caseTimerQueueNode(timerQueueNode);
				if (result == null) result = caseDecoratorNode(timerQueueNode);
				if (result == null) result = caseTreeNode(timerQueueNode);
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
			case BtcppPackage.BLACKBOARD_PRECONDITION: {
				BlackboardPrecondition blackboardPrecondition = (BlackboardPrecondition)theEObject;
				T result = caseBlackboardPrecondition(blackboardPrecondition);
				if (result == null) result = caseDecoratorNode(blackboardPrecondition);
				if (result == null) result = caseTreeNode(blackboardPrecondition);
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
			case BtcppPackage.SIMPLE_ACTION_NODE: {
				SimpleActionNode simpleActionNode = (SimpleActionNode)theEObject;
				T result = caseSimpleActionNode(simpleActionNode);
				if (result == null) result = caseActionNodeBase(simpleActionNode);
				if (result == null) result = caseLeafNode(simpleActionNode);
				if (result == null) result = caseTreeNode(simpleActionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.SIMPLE_CONDITION_NODE: {
				SimpleConditionNode simpleConditionNode = (SimpleConditionNode)theEObject;
				T result = caseSimpleConditionNode(simpleConditionNode);
				if (result == null) result = caseConditionNode(simpleConditionNode);
				if (result == null) result = caseLeafNode(simpleConditionNode);
				if (result == null) result = caseTreeNode(simpleConditionNode);
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
			case BtcppPackage.BLACKBOARD_CHECK_INT: {
				BlackboardCheckInt blackboardCheckInt = (BlackboardCheckInt)theEObject;
				T result = caseBlackboardCheckInt(blackboardCheckInt);
				if (result == null) result = caseBlackboardPrecondition(blackboardCheckInt);
				if (result == null) result = caseDecoratorNode(blackboardCheckInt);
				if (result == null) result = caseTreeNode(blackboardCheckInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.BLACKBOARD_CHECK_DOUBLE: {
				BlackboardCheckDouble blackboardCheckDouble = (BlackboardCheckDouble)theEObject;
				T result = caseBlackboardCheckDouble(blackboardCheckDouble);
				if (result == null) result = caseBlackboardPrecondition(blackboardCheckDouble);
				if (result == null) result = caseDecoratorNode(blackboardCheckDouble);
				if (result == null) result = caseTreeNode(blackboardCheckDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.BLACKBOARD_CHECK_STRING: {
				BlackboardCheckString blackboardCheckString = (BlackboardCheckString)theEObject;
				T result = caseBlackboardCheckString(blackboardCheckString);
				if (result == null) result = caseBlackboardPrecondition(blackboardCheckString);
				if (result == null) result = caseDecoratorNode(blackboardCheckString);
				if (result == null) result = caseTreeNode(blackboardCheckString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BtcppPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
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
	 * Returns the result of interpreting the object as an instance of '<em>Mnual Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mnual Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMnualNode(MnualNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Star Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Star Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceStarNode(SequenceStarNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Reactive Fallback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reactive Fallback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactiveFallback(ReactiveFallback object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Reactive Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reactive Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactiveSequence(ReactiveSequence object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Subtree Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtree Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtreeNode(SubtreeNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Timer Queue Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Queue Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimerQueueNode(TimerQueueNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Blackboard Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blackboard Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackboardPrecondition(BlackboardPrecondition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Simple Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Action Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleActionNode(SimpleActionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Condition Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Condition Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleConditionNode(SimpleConditionNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Blackboard Check Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blackboard Check Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackboardCheckInt(BlackboardCheckInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blackboard Check Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blackboard Check Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackboardCheckDouble(BlackboardCheckDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blackboard Check String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blackboard Check String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlackboardCheckString(BlackboardCheckString object) {
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
