/**
 */
package BehaviortreeSchema;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getAction <em>Action</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getCondition <em>Condition</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getControl <em>Control</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getSequenceStar <em>Sequence Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getFallback <em>Fallback</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getFallbackStar <em>Fallback Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getParallel <em>Parallel</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getInverter <em>Inverter</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getForceSucces <em>Force Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getForceFailure <em>Force Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getAlwaysSucces <em>Always Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getAlwaysFailure <em>Always Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getID <em>ID</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getName <em>Name</em>}</li>
 *   <li>{@link BehaviortreeSchema.DecoratorType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType()
 * @model extendedMetaData="name='DecoratorType' kind='elementOnly'"
 * @generated
 */
public interface DecoratorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ActionType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getAction <em>Action</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionType getCondition();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getCondition <em>Condition</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Control()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Control' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlType getControl();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getControl <em>Control</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Decorator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Decorator' namespace='##targetNamespace'"
	 * @generated
	 */
	DecoratorType getDecorator();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getDecorator <em>Decorator</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Subtree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subtree' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtreeType getSubtree();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getSubtree <em>Subtree</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceType getSequence();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getSequence <em>Sequence</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_SequenceStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SequenceStar' namespace='##targetNamespace'"
	 * @generated
	 */
	SequenceStarType getSequenceStar();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getSequenceStar <em>Sequence Star</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Fallback()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fallback' namespace='##targetNamespace'"
	 * @generated
	 */
	FallbackType getFallback();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getFallback <em>Fallback</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_FallbackStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FallbackStar' namespace='##targetNamespace'"
	 * @generated
	 */
	FallbackStarType getFallbackStar();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getFallbackStar <em>Fallback Star</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Parallel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Parallel' namespace='##targetNamespace'"
	 * @generated
	 */
	ParallelType getParallel();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getParallel <em>Parallel</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Inverter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Inverter' namespace='##targetNamespace'"
	 * @generated
	 */
	InverterType getInverter();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getInverter <em>Inverter</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_RetryUntilSuccesful()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RetryUntilSuccesful' namespace='##targetNamespace'"
	 * @generated
	 */
	RetryType getRetryUntilSuccesful();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Repeat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Repeat' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatType getRepeat();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getRepeat <em>Repeat</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Timeout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Timeout' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeoutType getTimeout();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getTimeout <em>Timeout</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_ForceSucces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ForceSucces' namespace='##targetNamespace'"
	 * @generated
	 */
	ForceSuccesType getForceSucces();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getForceSucces <em>Force Succes</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_ForceFailure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ForceFailure' namespace='##targetNamespace'"
	 * @generated
	 */
	ForceFailureType getForceFailure();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getForceFailure <em>Force Failure</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_AlwaysSucces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlwaysSucces' namespace='##targetNamespace'"
	 * @generated
	 */
	AlwaysSuccesType getAlwaysSucces();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getAlwaysSucces <em>Always Succes</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_AlwaysFailure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlwaysFailure' namespace='##targetNamespace'"
	 * @generated
	 */
	AlwaysFailureType getAlwaysFailure();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getAlwaysFailure <em>Always Failure</em>}' containment reference.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.DecoratorType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getDecoratorType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':20' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DecoratorType
