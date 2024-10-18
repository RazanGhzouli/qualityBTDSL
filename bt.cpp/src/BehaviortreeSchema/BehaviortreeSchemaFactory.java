/**
 */
package BehaviortreeSchema;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BehaviortreeSchema.BehaviortreeSchemaPackage
 * @generated
 */
public interface BehaviortreeSchemaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviortreeSchemaFactory eINSTANCE = BehaviortreeSchema.impl.BehaviortreeSchemaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Type</em>'.
	 * @generated
	 */
	ActionType createActionType();

	/**
	 * Returns a new object of class '<em>Always Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Always Failure Type</em>'.
	 * @generated
	 */
	AlwaysFailureType createAlwaysFailureType();

	/**
	 * Returns a new object of class '<em>Always Succes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Always Succes Type</em>'.
	 * @generated
	 */
	AlwaysSuccesType createAlwaysSuccesType();

	/**
	 * Returns a new object of class '<em>Behavior Tree Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Tree Type</em>'.
	 * @generated
	 */
	BehaviorTreeType createBehaviorTreeType();

	/**
	 * Returns a new object of class '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Type</em>'.
	 * @generated
	 */
	ConditionType createConditionType();

	/**
	 * Returns a new object of class '<em>Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Type</em>'.
	 * @generated
	 */
	ControlType createControlType();

	/**
	 * Returns a new object of class '<em>Decorator Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decorator Type</em>'.
	 * @generated
	 */
	DecoratorType createDecoratorType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Fallback Star Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fallback Star Type</em>'.
	 * @generated
	 */
	FallbackStarType createFallbackStarType();

	/**
	 * Returns a new object of class '<em>Fallback Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fallback Type</em>'.
	 * @generated
	 */
	FallbackType createFallbackType();

	/**
	 * Returns a new object of class '<em>Force Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Force Failure Type</em>'.
	 * @generated
	 */
	ForceFailureType createForceFailureType();

	/**
	 * Returns a new object of class '<em>Force Succes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Force Succes Type</em>'.
	 * @generated
	 */
	ForceSuccesType createForceSuccesType();

	/**
	 * Returns a new object of class '<em>Inverter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverter Type</em>'.
	 * @generated
	 */
	InverterType createInverterType();

	/**
	 * Returns a new object of class '<em>Parallel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Type</em>'.
	 * @generated
	 */
	ParallelType createParallelType();

	/**
	 * Returns a new object of class '<em>Repeat Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat Type</em>'.
	 * @generated
	 */
	RepeatType createRepeatType();

	/**
	 * Returns a new object of class '<em>Retry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retry Type</em>'.
	 * @generated
	 */
	RetryType createRetryType();

	/**
	 * Returns a new object of class '<em>Root Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Type</em>'.
	 * @generated
	 */
	RootType createRootType();

	/**
	 * Returns a new object of class '<em>Sequence Star Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Star Type</em>'.
	 * @generated
	 */
	SequenceStarType createSequenceStarType();

	/**
	 * Returns a new object of class '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Type</em>'.
	 * @generated
	 */
	SequenceType createSequenceType();

	/**
	 * Returns a new object of class '<em>Subtree Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtree Type</em>'.
	 * @generated
	 */
	SubtreeType createSubtreeType();

	/**
	 * Returns a new object of class '<em>Timeout Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout Type</em>'.
	 * @generated
	 */
	TimeoutType createTimeoutType();

	/**
	 * Returns a new object of class '<em>Tree Node Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Node Model Type</em>'.
	 * @generated
	 */
	TreeNodeModelType createTreeNodeModelType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviortreeSchemaPackage getBehaviortreeSchemaPackage();

} //BehaviortreeSchemaFactory
