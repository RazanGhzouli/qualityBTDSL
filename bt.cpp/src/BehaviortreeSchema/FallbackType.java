/**
 */
package BehaviortreeSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fallback Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BehaviortreeSchema.FallbackType#getBuiltInMultipleTypes <em>Built In Multiple Types</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getAction <em>Action</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getCondition <em>Condition</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getControl <em>Control</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getSequenceStar <em>Sequence Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getFallback <em>Fallback</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getFallbackStar <em>Fallback Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getParallel <em>Parallel</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getInverter <em>Inverter</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getForceSucces <em>Force Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getForceFailure <em>Force Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getAlwaysSucces <em>Always Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getAlwaysFailure <em>Always Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.FallbackType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType()
 * @model extendedMetaData="name='FallbackType' kind='elementOnly'"
 * @generated
 */
public interface FallbackType extends EObject {
	/**
	 * Returns the value of the '<em><b>Built In Multiple Types</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Multiple Types</em>' attribute list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_BuiltInMultipleTypes()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Action()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Condition()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Control()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Decorator()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Subtree()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Sequence()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_SequenceStar()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Fallback()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_FallbackStar()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Parallel()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Inverter()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_RetryUntilSuccesful()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Repeat()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Timeout()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_ForceSucces()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_ForceFailure()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_AlwaysSucces()
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
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_AlwaysFailure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AlwaysFailure' namespace='##targetNamespace' group='BuiltInMultipleTypes:0'"
	 * @generated
	 */
	EList<AlwaysFailureType> getAlwaysFailure();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getFallbackType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.FallbackType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FallbackType
