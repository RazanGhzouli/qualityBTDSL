/**
 */
package BehaviortreeSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BehaviortreeSchema.ControlType#getBuiltInMultipleTypes <em>Built In Multiple Types</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getAction <em>Action</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getCondition <em>Condition</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getControl <em>Control</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getSequenceStar <em>Sequence Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getFallback <em>Fallback</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getFallbackStar <em>Fallback Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getParallel <em>Parallel</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getInverter <em>Inverter</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getForceSucces <em>Force Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getForceFailure <em>Force Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getAlwaysSucces <em>Always Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getAlwaysFailure <em>Always Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getID <em>ID</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getName <em>Name</em>}</li>
 *   <li>{@link BehaviortreeSchema.ControlType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType()
 * @model extendedMetaData="name='ControlType' kind='elementOnly'"
 * @generated
 */
public interface ControlType extends EObject {
	/**
	 * Returns the value of the '<em><b>Built In Multiple Types</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Multiple Types</em>' attribute list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_BuiltInMultipleTypes()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	FeatureMap getBuiltInMultipleTypes();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.ActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Action()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Action' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<ActionType> getAction();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Condition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<ConditionType> getCondition();

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.ControlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Control()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Control' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<ControlType> getControl();

	/**
	 * Returns the value of the '<em><b>Decorator</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.DecoratorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorator</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Decorator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Decorator' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<DecoratorType> getDecorator();

	/**
	 * Returns the value of the '<em><b>Subtree</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.SubtreeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Subtree()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Subtree' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<SubtreeType> getSubtree();

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.SequenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Sequence()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Sequence' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<SequenceType> getSequence();

	/**
	 * Returns the value of the '<em><b>Sequence Star</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.SequenceStarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Star</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_SequenceStar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SequenceStar' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<SequenceStarType> getSequenceStar();

	/**
	 * Returns the value of the '<em><b>Fallback</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.FallbackType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fallback</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Fallback()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fallback' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<FallbackType> getFallback();

	/**
	 * Returns the value of the '<em><b>Fallback Star</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.FallbackStarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fallback Star</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_FallbackStar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FallbackStar' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<FallbackStarType> getFallbackStar();

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.ParallelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Parallel()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Parallel' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<ParallelType> getParallel();

	/**
	 * Returns the value of the '<em><b>Inverter</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.InverterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverter</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Inverter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Inverter' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<InverterType> getInverter();

	/**
	 * Returns the value of the '<em><b>Retry Until Succesful</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.RetryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Until Succesful</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_RetryUntilSuccesful()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RetryUntilSuccesful' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<RetryType> getRetryUntilSuccesful();

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.RepeatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Repeat()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Repeat' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<RepeatType> getRepeat();

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.TimeoutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Timeout()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Timeout' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<TimeoutType> getTimeout();

	/**
	 * Returns the value of the '<em><b>Force Succes</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.ForceSuccesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Succes</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_ForceSucces()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ForceSucces' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<ForceSuccesType> getForceSucces();

	/**
	 * Returns the value of the '<em><b>Force Failure</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.ForceFailureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Failure</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_ForceFailure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ForceFailure' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<ForceFailureType> getForceFailure();

	/**
	 * Returns the value of the '<em><b>Always Succes</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.AlwaysSuccesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Succes</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_AlwaysSucces()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AlwaysSucces' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<AlwaysSuccesType> getAlwaysSucces();

	/**
	 * Returns the value of the '<em><b>Always Failure</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.AlwaysFailureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Failure</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_AlwaysFailure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AlwaysFailure' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<AlwaysFailureType> getAlwaysFailure();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.ControlType#getID <em>ID</em>}' attribute.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.ControlType#getName <em>Name</em>}' attribute.
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getControlType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##any' name=':21' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ControlType
