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
	 * Returns a new object of class '<em>Manual Selector Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manual Selector Node</em>'.
	 * @generated
	 */
	ManualSelectorNode createManualSelectorNode();

	/**
	 * Returns a new object of class '<em>Parallel Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Node</em>'.
	 * @generated
	 */
	ParallelNode createParallelNode();

	/**
	 * Returns a new object of class '<em>Sequence With Memory Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence With Memory Node</em>'.
	 * @generated
	 */
	SequenceWithMemoryNode createSequenceWithMemoryNode();

	/**
	 * Returns a new object of class '<em>Switch Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Node</em>'.
	 * @generated
	 */
	SwitchNode createSwitchNode();

	/**
	 * Returns a new object of class '<em>Reactive Fallback Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactive Fallback Node</em>'.
	 * @generated
	 */
	ReactiveFallbackNode createReactiveFallbackNode();

	/**
	 * Returns a new object of class '<em>While Do Else Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Do Else Node</em>'.
	 * @generated
	 */
	WhileDoElseNode createWhileDoElseNode();

	/**
	 * Returns a new object of class '<em>Reactive Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactive Sequence Node</em>'.
	 * @generated
	 */
	ReactiveSequenceNode createReactiveSequenceNode();

	/**
	 * Returns a new object of class '<em>Sequence Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Node</em>'.
	 * @generated
	 */
	SequenceNode createSequenceNode();

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
	 * Returns a new object of class '<em>Script Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Node</em>'.
	 * @generated
	 */
	ScriptNode createScriptNode();

	/**
	 * Returns a new object of class '<em>Script Condition Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Condition Node</em>'.
	 * @generated
	 */
	ScriptConditionNode createScriptConditionNode();

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
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Requirement</em>'.
	 * @generated
	 */
	QualityRequirement createQualityRequirement();

	/**
	 * Returns a new object of class '<em>Quality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality</em>'.
	 * @generated
	 */
	Quality createQuality();

	/**
	 * Returns a new object of class '<em>Parallel All Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel All Node</em>'.
	 * @generated
	 */
	ParallelAllNode createParallelAllNode();

	/**
	 * Returns a new object of class '<em>Delay Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delay Node</em>'.
	 * @generated
	 */
	DelayNode createDelayNode();

	/**
	 * Returns a new object of class '<em>Precondition Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition Node</em>'.
	 * @generated
	 */
	PreconditionNode createPreconditionNode();

	/**
	 * Returns a new object of class '<em>Entry Updated Decorator Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Updated Decorator Node</em>'.
	 * @generated
	 */
	EntryUpdatedDecoratorNode createEntryUpdatedDecoratorNode();

	/**
	 * Returns a new object of class '<em>Run Once Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Once Node</em>'.
	 * @generated
	 */
	RunOnceNode createRunOnceNode();

	/**
	 * Returns a new object of class '<em>Loop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Node</em>'.
	 * @generated
	 */
	LoopNode createLoopNode();

	/**
	 * Returns a new object of class '<em>Consume Queue Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consume Queue Node</em>'.
	 * @generated
	 */
	ConsumeQueueNode createConsumeQueueNode();

	/**
	 * Returns a new object of class '<em>Test Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Node</em>'.
	 * @generated
	 */
	TestNode createTestNode();

	/**
	 * Returns a new object of class '<em>Entry Updated Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Updated Action Node</em>'.
	 * @generated
	 */
	EntryUpdatedActionNode createEntryUpdatedActionNode();

	/**
	 * Returns a new object of class '<em>Unset Blackboard Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unset Blackboard Node</em>'.
	 * @generated
	 */
	UnsetBlackboardNode createUnsetBlackboardNode();

	/**
	 * Returns a new object of class '<em>Threaded Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threaded Action Node</em>'.
	 * @generated
	 */
	ThreadedActionNode createThreadedActionNode();

	/**
	 * Returns a new object of class '<em>Coro Action Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coro Action Node</em>'.
	 * @generated
	 */
	CoroActionNode createCoroActionNode();

	/**
	 * Returns a new object of class '<em>Sleep Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sleep Node</em>'.
	 * @generated
	 */
	SleepNode createSleepNode();

	/**
	 * Returns a new object of class '<em>Pop From Queue Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pop From Queue Node</em>'.
	 * @generated
	 */
	PopFromQueueNode createPopFromQueueNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtcppPackage getBtcppPackage();

} //BtcppFactory
