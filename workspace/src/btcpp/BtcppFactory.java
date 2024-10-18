/**
 */
package btcpp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see btcpp.BtcppPackage
 * @generated
 */
public interface BtcppFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtcppFactory eINSTANCE = btcpp.impl.BtcppFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behavior Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Tree</em>'.
	 * @generated
	 */
	BehaviorTree createBehaviorTree();

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
	 * Returns a new object of class '<em>Sub Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Tree</em>'.
	 * @generated
	 */
	SubTree createSubTree();

	/**
	 * Returns a new object of class '<em>Simple Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Action Node</em>'.
	 * @generated
	 */
	SimpleActionNode createSimpleActionNode();

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
	 * Returns a new object of class '<em>Blackboard Check Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackboard Check Int</em>'.
	 * @generated
	 */
	BlackboardCheckInt createBlackboardCheckInt();

	/**
	 * Returns a new object of class '<em>Blackboard Check Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackboard Check Double</em>'.
	 * @generated
	 */
	BlackboardCheckDouble createBlackboardCheckDouble();

	/**
	 * Returns a new object of class '<em>Blackboard Check String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackboard Check String</em>'.
	 * @generated
	 */
	BlackboardCheckString createBlackboardCheckString();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtcppPackage getBtcppPackage();

} //BtcppFactory
