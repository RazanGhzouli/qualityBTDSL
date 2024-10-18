/**
 */
package bt.cpp.btcpp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bt.cpp.btcpp.BtcppPackage
 * @generated
 */
public interface BtcppFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtcppFactory eINSTANCE = bt.cpp.btcpp.impl.BtcppFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behavior Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Tree</em>'.
	 * @generated
	 */
	BehaviorTree createBehaviorTree();

	/**
	 * Returns a new object of class '<em>Control Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Node</em>'.
	 * @generated
	 */
	ControlNode createControlNode();

	/**
	 * Returns a new object of class '<em>Decorator Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decorator Node</em>'.
	 * @generated
	 */
	DecoratorNode createDecoratorNode();

	/**
	 * Returns a new object of class '<em>Always Failure Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Always Failure Node</em>'.
	 * @generated
	 */
	AlwaysFailureNode createAlwaysFailureNode();

	/**
	 * Returns a new object of class '<em>Always Success Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Always Success Node</em>'.
	 * @generated
	 */
	AlwaysSuccessNode createAlwaysSuccessNode();

	/**
	 * Returns a new object of class '<em>Set Blackboard Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Blackboard Node</em>'.
	 * @generated
	 */
	SetBlackboardNode createSetBlackboardNode();

	/**
	 * Returns a new object of class '<em>Fallback Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fallback Node</em>'.
	 * @generated
	 */
	FallbackNode createFallbackNode();

	/**
	 * Returns a new object of class '<em>If Then Else Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Then Else Node</em>'.
	 * @generated
	 */
	IfThenElseNode createIfThenElseNode();

	/**
	 * Returns a new object of class '<em>Mnual Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mnual Node</em>'.
	 * @generated
	 */
	MnualNode createMnualNode();

	/**
	 * Returns a new object of class '<em>Parallel Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Node</em>'.
	 * @generated
	 */
	ParallelNode createParallelNode();

	/**
	 * Returns a new object of class '<em>Sequence Star Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Star Node</em>'.
	 * @generated
	 */
	SequenceStarNode createSequenceStarNode();

	/**
	 * Returns a new object of class '<em>Switch Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Node</em>'.
	 * @generated
	 */
	SwitchNode createSwitchNode();

	/**
	 * Returns a new object of class '<em>Reactive Fallback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactive Fallback</em>'.
	 * @generated
	 */
	ReactiveFallback createReactiveFallback();

	/**
	 * Returns a new object of class '<em>While Do Else Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Do Else Node</em>'.
	 * @generated
	 */
	WhileDoElseNode createWhileDoElseNode();

	/**
	 * Returns a new object of class '<em>Reactive Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactive Sequence</em>'.
	 * @generated
	 */
	ReactiveSequence createReactiveSequence();

	/**
	 * Returns a new object of class '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Node</em>'.
	 * @generated
	 */
	SequenceNode createSequenceNode();

	/**
	 * Returns a new object of class '<em>Subtree Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtree Node</em>'.
	 * @generated
	 */
	SubtreeNode createSubtreeNode();

	/**
	 * Returns a new object of class '<em>Timeout Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout Node</em>'.
	 * @generated
	 */
	TimeoutNode createTimeoutNode();

	/**
	 * Returns a new object of class '<em>Keep Running Until Failure Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keep Running Until Failure Node</em>'.
	 * @generated
	 */
	KeepRunningUntilFailureNode createKeepRunningUntilFailureNode();

	/**
	 * Returns a new object of class '<em>Timer Queue Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer Queue Node</em>'.
	 * @generated
	 */
	TimerQueueNode createTimerQueueNode();

	/**
	 * Returns a new object of class '<em>Inverter Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverter Node</em>'.
	 * @generated
	 */
	InverterNode createInverterNode();

	/**
	 * Returns a new object of class '<em>Force Success Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Force Success Node</em>'.
	 * @generated
	 */
	ForceSuccessNode createForceSuccessNode();

	/**
	 * Returns a new object of class '<em>Force Failure Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Force Failure Node</em>'.
	 * @generated
	 */
	ForceFailureNode createForceFailureNode();

	/**
	 * Returns a new object of class '<em>Repeat Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Node</em>'.
	 * @generated
	 */
	RepeatNode createRepeatNode();

	/**
	 * Returns a new object of class '<em>Blackboard Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackboard Precondition</em>'.
	 * @generated
	 */
	BlackboardPrecondition createBlackboardPrecondition();

	/**
	 * Returns a new object of class '<em>Black Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Black Board</em>'.
	 * @generated
	 */
	BlackBoard createBlackBoard();

	/**
	 * Returns a new object of class '<em>Node Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Configuration</em>'.
	 * @generated
	 */
	NodeConfiguration createNodeConfiguration();

	/**
	 * Returns a new object of class '<em>Condition Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Node</em>'.
	 * @generated
	 */
	ConditionNode createConditionNode();

	/**
	 * Returns a new object of class '<em>Sub Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Tree</em>'.
	 * @generated
	 */
	SubTree createSubTree();

	/**
	 * Returns a new object of class '<em>Leaf Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf Node</em>'.
	 * @generated
	 */
	LeafNode createLeafNode();

	/**
	 * Returns a new object of class '<em>Sync Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sync Action Node</em>'.
	 * @generated
	 */
	SyncActionNode createSyncActionNode();

	/**
	 * Returns a new object of class '<em>Action Node Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Node Base</em>'.
	 * @generated
	 */
	ActionNodeBase createActionNodeBase();

	/**
	 * Returns a new object of class '<em>Async Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Async Action Node</em>'.
	 * @generated
	 */
	AsyncActionNode createAsyncActionNode();

	/**
	 * Returns a new object of class '<em>Simple Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Action Node</em>'.
	 * @generated
	 */
	SimpleActionNode createSimpleActionNode();

	/**
	 * Returns a new object of class '<em>Stateful Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stateful Action Node</em>'.
	 * @generated
	 */
	StatefulActionNode createStatefulActionNode();

	/**
	 * Returns a new object of class '<em>Coro Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coro Action Node</em>'.
	 * @generated
	 */
	CoroActionNode createCoroActionNode();

	/**
	 * Returns a new object of class '<em>Simple Condition Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Condition Node</em>'.
	 * @generated
	 */
	SimpleConditionNode createSimpleConditionNode();

	/**
	 * Returns a new object of class '<em>Retry Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retry Node</em>'.
	 * @generated
	 */
	RetryNode createRetryNode();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtcppPackage getBtcppPackage();

} //BtcppFactory
