/**
 */
package BehaviortreeSchema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Tree Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getAction <em>Action</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getCondition <em>Condition</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getControl <em>Control</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getSequenceStar <em>Sequence Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getFallback <em>Fallback</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getFallbackStar <em>Fallback Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getParallel <em>Parallel</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getInverter <em>Inverter</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getForceSucces <em>Force Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getForceFailure <em>Force Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getAlwaysSucces <em>Always Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getAlwaysFailure <em>Always Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.BehaviorTreeType#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType()
 * @model extendedMetaData="name='BehaviorTree_._type' kind='elementOnly'"
 * @generated
 */
public interface BehaviorTreeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ActionType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ConditionType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionType getCondition();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(ControlType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Control()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Control' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlType getControl();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(ControlType value);

	/**
	 * Returns the value of the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorator</em>' containment reference.
	 * @see #setDecorator(DecoratorType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Decorator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Decorator' namespace='##targetNamespace'"
	 * @generated
	 */
	DecoratorType getDecorator();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getDecorator <em>Decorator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorator</em>' containment reference.
	 * @see #getDecorator()
	 * @generated
	 */
	void setDecorator(DecoratorType value);

	/**
	 * Returns the value of the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree</em>' containment reference.
	 * @see #setSubtree(SubtreeType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Subtree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subtree' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtreeType getSubtree();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getSubtree <em>Subtree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtree</em>' containment reference.
	 * @see #getSubtree()
	 * @generated
	 */
	void setSubtree(SubtreeType value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(SequenceType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceType getSequence();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(SequenceType value);

	/**
	 * Returns the value of the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Star</em>' containment reference.
	 * @see #setSequenceStar(SequenceStarType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_SequenceStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SequenceStar' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceStarType getSequenceStar();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getSequenceStar <em>Sequence Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Star</em>' containment reference.
	 * @see #getSequenceStar()
	 * @generated
	 */
	void setSequenceStar(SequenceStarType value);

	/**
	 * Returns the value of the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fallback</em>' containment reference.
	 * @see #setFallback(FallbackType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Fallback()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fallback' namespace='##targetNamespace'"
	 * @generated
	 */
	FallbackType getFallback();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getFallback <em>Fallback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fallback</em>' containment reference.
	 * @see #getFallback()
	 * @generated
	 */
	void setFallback(FallbackType value);

	/**
	 * Returns the value of the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fallback Star</em>' containment reference.
	 * @see #setFallbackStar(FallbackStarType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_FallbackStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FallbackStar' namespace='##targetNamespace'"
	 * @generated
	 */
	FallbackStarType getFallbackStar();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getFallbackStar <em>Fallback Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fallback Star</em>' containment reference.
	 * @see #getFallbackStar()
	 * @generated
	 */
	void setFallbackStar(FallbackStarType value);

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' containment reference.
	 * @see #setParallel(ParallelType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Parallel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Parallel' namespace='##targetNamespace'"
	 * @generated
	 */
	ParallelType getParallel();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getParallel <em>Parallel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' containment reference.
	 * @see #getParallel()
	 * @generated
	 */
	void setParallel(ParallelType value);

	/**
	 * Returns the value of the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverter</em>' containment reference.
	 * @see #setInverter(InverterType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Inverter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Inverter' namespace='##targetNamespace'"
	 * @generated
	 */
	InverterType getInverter();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getInverter <em>Inverter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverter</em>' containment reference.
	 * @see #getInverter()
	 * @generated
	 */
	void setInverter(InverterType value);

	/**
	 * Returns the value of the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Until Succesful</em>' containment reference.
	 * @see #setRetryUntilSuccesful(RetryType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_RetryUntilSuccesful()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RetryUntilSuccesful' namespace='##targetNamespace'"
	 * @generated
	 */
	RetryType getRetryUntilSuccesful();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Until Succesful</em>' containment reference.
	 * @see #getRetryUntilSuccesful()
	 * @generated
	 */
	void setRetryUntilSuccesful(RetryType value);

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' containment reference.
	 * @see #setRepeat(RepeatType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Repeat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Repeat' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatType getRepeat();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getRepeat <em>Repeat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' containment reference.
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(RepeatType value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' containment reference.
	 * @see #setTimeout(TimeoutType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_Timeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Timeout' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeoutType getTimeout();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getTimeout <em>Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' containment reference.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(TimeoutType value);

	/**
	 * Returns the value of the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Succes</em>' containment reference.
	 * @see #setForceSucces(ForceSuccesType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_ForceSucces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ForceSucces' namespace='##targetNamespace'"
	 * @generated
	 */
	ForceSuccesType getForceSucces();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getForceSucces <em>Force Succes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Succes</em>' containment reference.
	 * @see #getForceSucces()
	 * @generated
	 */
	void setForceSucces(ForceSuccesType value);

	/**
	 * Returns the value of the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Failure</em>' containment reference.
	 * @see #setForceFailure(ForceFailureType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_ForceFailure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ForceFailure' namespace='##targetNamespace'"
	 * @generated
	 */
	ForceFailureType getForceFailure();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getForceFailure <em>Force Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Failure</em>' containment reference.
	 * @see #getForceFailure()
	 * @generated
	 */
	void setForceFailure(ForceFailureType value);

	/**
	 * Returns the value of the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Succes</em>' containment reference.
	 * @see #setAlwaysSucces(AlwaysSuccesType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_AlwaysSucces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlwaysSucces' namespace='##targetNamespace'"
	 * @generated
	 */
	AlwaysSuccesType getAlwaysSucces();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getAlwaysSucces <em>Always Succes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Succes</em>' containment reference.
	 * @see #getAlwaysSucces()
	 * @generated
	 */
	void setAlwaysSucces(AlwaysSuccesType value);

	/**
	 * Returns the value of the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Failure</em>' containment reference.
	 * @see #setAlwaysFailure(AlwaysFailureType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_AlwaysFailure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlwaysFailure' namespace='##targetNamespace'"
	 * @generated
	 */
	AlwaysFailureType getAlwaysFailure();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getAlwaysFailure <em>Always Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Always Failure</em>' containment reference.
	 * @see #getAlwaysFailure()
	 * @generated
	 */
	void setAlwaysFailure(AlwaysFailureType value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getBehaviorTreeType_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.BehaviorTreeType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // BehaviorTreeType