/**
 */
package BehaviortreeSchema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BehaviortreeSchema.BehaviortreeSchemaFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface BehaviortreeSchemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BehaviortreeSchema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/D:/paper/2020-behaviortrees/BehviorTreeCCP/behaviortree_schema.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BehaviortreeSchema";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviortreeSchemaPackage eINSTANCE = BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.ActionTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.AlwaysFailureTypeImpl <em>Always Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.AlwaysFailureTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getAlwaysFailureType()
	 * @generated
	 */
	int ALWAYS_FAILURE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Always Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Always Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.AlwaysSuccesTypeImpl <em>Always Succes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.AlwaysSuccesTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getAlwaysSuccesType()
	 * @generated
	 */
	int ALWAYS_SUCCES_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCES_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Always Succes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Always Succes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.BehaviorTreeTypeImpl <em>Behavior Tree Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.BehaviorTreeTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getBehaviorTreeType()
	 * @generated
	 */
	int BEHAVIOR_TREE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__SUBTREE = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__SEQUENCE_STAR = 6;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__FALLBACK = 7;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__FALLBACK_STAR = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__INVERTER = 10;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__RETRY_UNTIL_SUCCESFUL = 11;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__REPEAT = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__TIMEOUT = 13;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__FORCE_SUCCES = 14;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__FORCE_FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__ALWAYS_SUCCES = 16;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__ALWAYS_FAILURE = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE__ID = 18;

	/**
	 * The number of structural features of the '<em>Behavior Tree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Behavior Tree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.ConditionTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.ControlTypeImpl <em>Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.ControlTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Built In Multiple Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__BUILT_IN_MULTIPLE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__DECORATOR = 4;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__SUBTREE = 5;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__SEQUENCE_STAR = 7;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__FALLBACK = 8;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__FALLBACK_STAR = 9;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__PARALLEL = 10;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__INVERTER = 11;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__RETRY_UNTIL_SUCCESFUL = 12;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__REPEAT = 13;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__TIMEOUT = 14;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__FORCE_SUCCES = 15;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__FORCE_FAILURE = 16;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ALWAYS_SUCCES = 17;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ALWAYS_FAILURE = 18;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ID = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__NAME = 20;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE__ANY_ATTRIBUTE = 21;

	/**
	 * The number of structural features of the '<em>Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.DecoratorTypeImpl <em>Decorator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.DecoratorTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getDecoratorType()
	 * @generated
	 */
	int DECORATOR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__SUBTREE = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__SEQUENCE_STAR = 6;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__FALLBACK = 7;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__FALLBACK_STAR = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__INVERTER = 10;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__RETRY_UNTIL_SUCCESFUL = 11;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__REPEAT = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__TIMEOUT = 13;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__FORCE_SUCCES = 14;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__FORCE_FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__ALWAYS_SUCCES = 16;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__ALWAYS_FAILURE = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__ID = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__NAME = 19;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE__ANY_ATTRIBUTE = 20;

	/**
	 * The number of structural features of the '<em>Decorator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Decorator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.DocumentRootImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROOT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.FallbackStarTypeImpl <em>Fallback Star Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.FallbackStarTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getFallbackStarType()
	 * @generated
	 */
	int FALLBACK_STAR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Built In Multiple Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__BUILT_IN_MULTIPLE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__DECORATOR = 4;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__SUBTREE = 5;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__SEQUENCE_STAR = 7;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__FALLBACK = 8;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__FALLBACK_STAR = 9;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__PARALLEL = 10;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__INVERTER = 11;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__RETRY_UNTIL_SUCCESFUL = 12;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__REPEAT = 13;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__TIMEOUT = 14;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__FORCE_SUCCES = 15;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__FORCE_FAILURE = 16;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__ALWAYS_SUCCES = 17;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__ALWAYS_FAILURE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE__NAME = 19;

	/**
	 * The number of structural features of the '<em>Fallback Star Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Fallback Star Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_STAR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.FallbackTypeImpl <em>Fallback Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.FallbackTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getFallbackType()
	 * @generated
	 */
	int FALLBACK_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Built In Multiple Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__BUILT_IN_MULTIPLE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__DECORATOR = 4;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__SUBTREE = 5;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__SEQUENCE_STAR = 7;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__FALLBACK = 8;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__FALLBACK_STAR = 9;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__PARALLEL = 10;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__INVERTER = 11;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__RETRY_UNTIL_SUCCESFUL = 12;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__REPEAT = 13;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__TIMEOUT = 14;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__FORCE_SUCCES = 15;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__FORCE_FAILURE = 16;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__ALWAYS_SUCCES = 17;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__ALWAYS_FAILURE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__NAME = 19;

	/**
	 * The number of structural features of the '<em>Fallback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Fallback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.ForceFailureTypeImpl <em>Force Failure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.ForceFailureTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getForceFailureType()
	 * @generated
	 */
	int FORCE_FAILURE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__SUBTREE = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__SEQUENCE_STAR = 6;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__FALLBACK = 7;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__FALLBACK_STAR = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__INVERTER = 10;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__RETRY_UNTIL_SUCCESFUL = 11;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__REPEAT = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__TIMEOUT = 13;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__FORCE_SUCCES = 14;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__FORCE_FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__ALWAYS_SUCCES = 16;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__ALWAYS_FAILURE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE__NAME = 18;

	/**
	 * The number of structural features of the '<em>Force Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Force Failure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.ForceSuccesTypeImpl <em>Force Succes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.ForceSuccesTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getForceSuccesType()
	 * @generated
	 */
	int FORCE_SUCCES_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__SUBTREE = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__SEQUENCE_STAR = 6;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__FALLBACK = 7;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__FALLBACK_STAR = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__INVERTER = 10;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__RETRY_UNTIL_SUCCESFUL = 11;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__REPEAT = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__TIMEOUT = 13;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__FORCE_SUCCES = 14;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__FORCE_FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__ALWAYS_SUCCES = 16;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__ALWAYS_FAILURE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE__NAME = 18;

	/**
	 * The number of structural features of the '<em>Force Succes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Force Succes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.InverterTypeImpl <em>Inverter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.InverterTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getInverterType()
	 * @generated
	 */
	int INVERTER_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__SUBTREE = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__SEQUENCE_STAR = 6;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__FALLBACK = 7;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__FALLBACK_STAR = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__INVERTER = 10;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL = 11;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__REPEAT = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__TIMEOUT = 13;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__FORCE_SUCCES = 14;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__FORCE_FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__ALWAYS_SUCCES = 16;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__ALWAYS_FAILURE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE__NAME = 18;

	/**
	 * The number of structural features of the '<em>Inverter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Inverter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.ParallelTypeImpl <em>Parallel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.ParallelTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getParallelType()
	 * @generated
	 */
	int PARALLEL_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Built In Multiple Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__BUILT_IN_MULTIPLE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__DECORATOR = 4;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__SUBTREE = 5;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__SEQUENCE_STAR = 7;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__FALLBACK = 8;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__FALLBACK_STAR = 9;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__PARALLEL = 10;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__INVERTER = 11;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__RETRY_UNTIL_SUCCESFUL = 12;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__REPEAT = 13;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__TIMEOUT = 14;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__FORCE_SUCCES = 15;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__FORCE_FAILURE = 16;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__ALWAYS_SUCCES = 17;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__ALWAYS_FAILURE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__NAME = 19;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE__THRESHOLD = 20;

	/**
	 * The number of structural features of the '<em>Parallel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Parallel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.RepeatTypeImpl <em>Repeat Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.RepeatTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getRepeatType()
	 * @generated
	 */
	int REPEAT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__SUBTREE = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__SEQUENCE_STAR = 6;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__FALLBACK = 7;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__FALLBACK_STAR = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__INVERTER = 10;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__RETRY_UNTIL_SUCCESFUL = 11;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__REPEAT = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__TIMEOUT = 13;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__FORCE_SUCCES = 14;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__FORCE_FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__ALWAYS_SUCCES = 16;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__ALWAYS_FAILURE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__NAME = 18;

	/**
	 * The feature id for the '<em><b>Num Cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE__NUM_CYCLES = 19;

	/**
	 * The number of structural features of the '<em>Repeat Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Repeat Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.RetryTypeImpl <em>Retry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.RetryTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getRetryType()
	 * @generated
	 */
	int RETRY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__SUBTREE = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__SEQUENCE_STAR = 6;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__FALLBACK = 7;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__FALLBACK_STAR = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__INVERTER = 10;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__RETRY_UNTIL_SUCCESFUL = 11;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__REPEAT = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__TIMEOUT = 13;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__FORCE_SUCCES = 14;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__FORCE_FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__ALWAYS_SUCCES = 16;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__ALWAYS_FAILURE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__NAME = 18;

	/**
	 * The feature id for the '<em><b>Num Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE__NUM_ATTEMPTS = 19;

	/**
	 * The number of structural features of the '<em>Retry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Retry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.RootTypeImpl <em>Root Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.RootTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getRootType()
	 * @generated
	 */
	int ROOT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Behavior Tree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE__BEHAVIOR_TREE = 0;

	/**
	 * The feature id for the '<em><b>Tree Node Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE__TREE_NODE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Main Tree To Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE__MAIN_TREE_TO_EXECUTE = 2;

	/**
	 * The number of structural features of the '<em>Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.SequenceStarTypeImpl <em>Sequence Star Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.SequenceStarTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getSequenceStarType()
	 * @generated
	 */
	int SEQUENCE_STAR_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Built In Multiple Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__BUILT_IN_MULTIPLE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__DECORATOR = 4;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__SUBTREE = 5;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__SEQUENCE_STAR = 7;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__FALLBACK = 8;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__FALLBACK_STAR = 9;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__PARALLEL = 10;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__INVERTER = 11;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__RETRY_UNTIL_SUCCESFUL = 12;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__REPEAT = 13;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__TIMEOUT = 14;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__FORCE_SUCCES = 15;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__FORCE_FAILURE = 16;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__ALWAYS_SUCCES = 17;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__ALWAYS_FAILURE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE__NAME = 19;

	/**
	 * The number of structural features of the '<em>Sequence Star Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Sequence Star Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.SequenceTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Built In Multiple Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__BUILT_IN_MULTIPLE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__DECORATOR = 4;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__SUBTREE = 5;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__SEQUENCE = 6;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__SEQUENCE_STAR = 7;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__FALLBACK = 8;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__FALLBACK_STAR = 9;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__PARALLEL = 10;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__INVERTER = 11;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__RETRY_UNTIL_SUCCESFUL = 12;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__REPEAT = 13;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TIMEOUT = 14;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__FORCE_SUCCES = 15;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__FORCE_FAILURE = 16;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ALWAYS_SUCCES = 17;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ALWAYS_FAILURE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__NAME = 19;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.SubtreeTypeImpl <em>Subtree Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.SubtreeTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getSubtreeType()
	 * @generated
	 */
	int SUBTREE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__SUBTREE = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__SEQUENCE_STAR = 6;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__FALLBACK = 7;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__FALLBACK_STAR = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__INVERTER = 10;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__RETRY_UNTIL_SUCCESFUL = 11;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__REPEAT = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__TIMEOUT = 13;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__FORCE_SUCCES = 14;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__FORCE_FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__ALWAYS_SUCCES = 16;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__ALWAYS_FAILURE = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__ID = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__NAME = 19;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE__ANY_ATTRIBUTE = 20;

	/**
	 * The number of structural features of the '<em>Subtree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Subtree Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.TimeoutTypeImpl <em>Timeout Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.TimeoutTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getTimeoutType()
	 * @generated
	 */
	int TIMEOUT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Subtree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__SUBTREE = 4;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Sequence Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__SEQUENCE_STAR = 6;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__FALLBACK = 7;

	/**
	 * The feature id for the '<em><b>Fallback Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__FALLBACK_STAR = 8;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__PARALLEL = 9;

	/**
	 * The feature id for the '<em><b>Inverter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__INVERTER = 10;

	/**
	 * The feature id for the '<em><b>Retry Until Succesful</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__RETRY_UNTIL_SUCCESFUL = 11;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__REPEAT = 12;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__TIMEOUT = 13;

	/**
	 * The feature id for the '<em><b>Force Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__FORCE_SUCCES = 14;

	/**
	 * The feature id for the '<em><b>Force Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__FORCE_FAILURE = 15;

	/**
	 * The feature id for the '<em><b>Always Succes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__ALWAYS_SUCCES = 16;

	/**
	 * The feature id for the '<em><b>Always Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__ALWAYS_FAILURE = 17;

	/**
	 * The feature id for the '<em><b>Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__MSEC = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE__NAME = 19;

	/**
	 * The number of structural features of the '<em>Timeout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Timeout Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BehaviortreeSchema.impl.TreeNodeModelTypeImpl <em>Tree Node Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BehaviortreeSchema.impl.TreeNodeModelTypeImpl
	 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getTreeNodeModelType()
	 * @generated
	 */
	int TREE_NODE_MODEL_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_MODEL_TYPE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_MODEL_TYPE__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Decorator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_MODEL_TYPE__DECORATOR = 2;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_MODEL_TYPE__CONTROL = 3;

	/**
	 * The number of structural features of the '<em>Tree Node Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_MODEL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tree Node Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_MODEL_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see BehaviortreeSchema.ActionType
	 * @generated
	 */
	EClass getActionType();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ActionType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see BehaviortreeSchema.ActionType#getID()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_ID();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ActionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.ActionType#getName()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.ActionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see BehaviortreeSchema.ActionType#getAnyAttribute()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.AlwaysFailureType <em>Always Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always Failure Type</em>'.
	 * @see BehaviortreeSchema.AlwaysFailureType
	 * @generated
	 */
	EClass getAlwaysFailureType();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.AlwaysFailureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.AlwaysFailureType#getName()
	 * @see #getAlwaysFailureType()
	 * @generated
	 */
	EAttribute getAlwaysFailureType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.AlwaysSuccesType <em>Always Succes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always Succes Type</em>'.
	 * @see BehaviortreeSchema.AlwaysSuccesType
	 * @generated
	 */
	EClass getAlwaysSuccesType();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.AlwaysSuccesType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.AlwaysSuccesType#getName()
	 * @see #getAlwaysSuccesType()
	 * @generated
	 */
	EAttribute getAlwaysSuccesType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.BehaviorTreeType <em>Behavior Tree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Tree Type</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType
	 * @generated
	 */
	EClass getBehaviorTreeType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getAction()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getCondition()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getControl()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Control();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getDecorator()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getSubtree()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Subtree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getSequence()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getSequenceStar()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getFallback()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getFallbackStar()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getParallel()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getInverter()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Inverter();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getRetryUntilSuccesful()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getRepeat()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getTimeout()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getForceSucces()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getForceFailure()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getAlwaysSucces()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.BehaviorTreeType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getAlwaysFailure()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EReference getBehaviorTreeType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.BehaviorTreeType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see BehaviortreeSchema.BehaviorTreeType#getID()
	 * @see #getBehaviorTreeType()
	 * @generated
	 */
	EAttribute getBehaviorTreeType_ID();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Type</em>'.
	 * @see BehaviortreeSchema.ConditionType
	 * @generated
	 */
	EClass getConditionType();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ConditionType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see BehaviortreeSchema.ConditionType#getID()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_ID();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ConditionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.ConditionType#getName()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.ConditionType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see BehaviortreeSchema.ConditionType#getAnyAttribute()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Type</em>'.
	 * @see BehaviortreeSchema.ControlType
	 * @generated
	 */
	EClass getControlType();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.ControlType#getBuiltInMultipleTypes <em>Built In Multiple Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Built In Multiple Types</em>'.
	 * @see BehaviortreeSchema.ControlType#getBuiltInMultipleTypes()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_BuiltInMultipleTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see BehaviortreeSchema.ControlType#getAction()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see BehaviortreeSchema.ControlType#getCondition()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see BehaviortreeSchema.ControlType#getControl()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.ControlType#getDecorator()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Decorator();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.ControlType#getSubtree()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Subtree();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.ControlType#getSequence()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.ControlType#getSequenceStar()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.ControlType#getFallback()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Fallback();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.ControlType#getFallbackStar()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.ControlType#getParallel()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.ControlType#getInverter()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Inverter();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.ControlType#getRetryUntilSuccesful()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.ControlType#getRepeat()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Repeat();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.ControlType#getTimeout()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_Timeout();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.ControlType#getForceSucces()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.ControlType#getForceFailure()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.ControlType#getAlwaysSucces()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ControlType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.ControlType#getAlwaysFailure()
	 * @see #getControlType()
	 * @generated
	 */
	EReference getControlType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ControlType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see BehaviortreeSchema.ControlType#getID()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_ID();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ControlType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.ControlType#getName()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.ControlType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see BehaviortreeSchema.ControlType#getAnyAttribute()
	 * @see #getControlType()
	 * @generated
	 */
	EAttribute getControlType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.DecoratorType <em>Decorator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorator Type</em>'.
	 * @see BehaviortreeSchema.DecoratorType
	 * @generated
	 */
	EClass getDecoratorType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getAction()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getCondition()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getControl()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Control();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getDecorator()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getSubtree()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Subtree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getSequence()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getSequenceStar()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getFallback()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getFallbackStar()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getParallel()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getInverter()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Inverter();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getRetryUntilSuccesful()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getRepeat()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getTimeout()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getForceSucces()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getForceFailure()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getAlwaysSucces()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DecoratorType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getAlwaysFailure()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EReference getDecoratorType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.DecoratorType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getID()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EAttribute getDecoratorType_ID();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.DecoratorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getName()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EAttribute getDecoratorType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.DecoratorType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see BehaviortreeSchema.DecoratorType#getAnyAttribute()
	 * @see #getDecoratorType()
	 * @generated
	 */
	EAttribute getDecoratorType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see BehaviortreeSchema.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see BehaviortreeSchema.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link BehaviortreeSchema.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see BehaviortreeSchema.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link BehaviortreeSchema.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see BehaviortreeSchema.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.DocumentRoot#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see BehaviortreeSchema.DocumentRoot#getRoot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Root();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.FallbackStarType <em>Fallback Star Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback Star Type</em>'.
	 * @see BehaviortreeSchema.FallbackStarType
	 * @generated
	 */
	EClass getFallbackStarType();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.FallbackStarType#getBuiltInMultipleTypes <em>Built In Multiple Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Built In Multiple Types</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getBuiltInMultipleTypes()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EAttribute getFallbackStarType_BuiltInMultipleTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getAction()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getCondition()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getControl()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getDecorator()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Decorator();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getSubtree()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Subtree();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getSequence()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getSequenceStar()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getFallback()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Fallback();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getFallbackStar()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getParallel()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getInverter()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Inverter();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getRetryUntilSuccesful()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getRepeat()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Repeat();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getTimeout()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_Timeout();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getForceSucces()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getForceFailure()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getAlwaysSucces()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackStarType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getAlwaysFailure()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EReference getFallbackStarType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.FallbackStarType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.FallbackStarType#getName()
	 * @see #getFallbackStarType()
	 * @generated
	 */
	EAttribute getFallbackStarType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.FallbackType <em>Fallback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback Type</em>'.
	 * @see BehaviortreeSchema.FallbackType
	 * @generated
	 */
	EClass getFallbackType();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.FallbackType#getBuiltInMultipleTypes <em>Built In Multiple Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Built In Multiple Types</em>'.
	 * @see BehaviortreeSchema.FallbackType#getBuiltInMultipleTypes()
	 * @see #getFallbackType()
	 * @generated
	 */
	EAttribute getFallbackType_BuiltInMultipleTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see BehaviortreeSchema.FallbackType#getAction()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see BehaviortreeSchema.FallbackType#getCondition()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see BehaviortreeSchema.FallbackType#getControl()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.FallbackType#getDecorator()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Decorator();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.FallbackType#getSubtree()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Subtree();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.FallbackType#getSequence()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.FallbackType#getSequenceStar()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.FallbackType#getFallback()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Fallback();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.FallbackType#getFallbackStar()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.FallbackType#getParallel()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.FallbackType#getInverter()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Inverter();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.FallbackType#getRetryUntilSuccesful()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.FallbackType#getRepeat()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Repeat();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.FallbackType#getTimeout()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Timeout();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.FallbackType#getForceSucces()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.FallbackType#getForceFailure()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.FallbackType#getAlwaysSucces()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.FallbackType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.FallbackType#getAlwaysFailure()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.FallbackType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.FallbackType#getName()
	 * @see #getFallbackType()
	 * @generated
	 */
	EAttribute getFallbackType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.ForceFailureType <em>Force Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force Failure Type</em>'.
	 * @see BehaviortreeSchema.ForceFailureType
	 * @generated
	 */
	EClass getForceFailureType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getAction()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getCondition()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getControl()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Control();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getDecorator()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getSubtree()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Subtree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getSequence()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getSequenceStar()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getFallback()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getFallbackStar()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getParallel()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getInverter()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Inverter();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getRetryUntilSuccesful()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getRepeat()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getTimeout()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getForceSucces()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getForceFailure()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getAlwaysSucces()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceFailureType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getAlwaysFailure()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EReference getForceFailureType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ForceFailureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.ForceFailureType#getName()
	 * @see #getForceFailureType()
	 * @generated
	 */
	EAttribute getForceFailureType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.ForceSuccesType <em>Force Succes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force Succes Type</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType
	 * @generated
	 */
	EClass getForceSuccesType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getAction()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getCondition()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getControl()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Control();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getDecorator()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getSubtree()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Subtree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getSequence()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getSequenceStar()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getFallback()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getFallbackStar()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getParallel()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getInverter()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Inverter();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getRetryUntilSuccesful()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getRepeat()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getTimeout()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getForceSucces()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getForceFailure()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getAlwaysSucces()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.ForceSuccesType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getAlwaysFailure()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EReference getForceSuccesType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ForceSuccesType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.ForceSuccesType#getName()
	 * @see #getForceSuccesType()
	 * @generated
	 */
	EAttribute getForceSuccesType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.InverterType <em>Inverter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverter Type</em>'.
	 * @see BehaviortreeSchema.InverterType
	 * @generated
	 */
	EClass getInverterType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.InverterType#getAction()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.InverterType#getCondition()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.InverterType#getControl()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Control();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.InverterType#getDecorator()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.InverterType#getSubtree()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Subtree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.InverterType#getSequence()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.InverterType#getSequenceStar()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.InverterType#getFallback()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.InverterType#getFallbackStar()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.InverterType#getParallel()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.InverterType#getInverter()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Inverter();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.InverterType#getRetryUntilSuccesful()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.InverterType#getRepeat()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.InverterType#getTimeout()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.InverterType#getForceSucces()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.InverterType#getForceFailure()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.InverterType#getAlwaysSucces()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.InverterType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.InverterType#getAlwaysFailure()
	 * @see #getInverterType()
	 * @generated
	 */
	EReference getInverterType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.InverterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.InverterType#getName()
	 * @see #getInverterType()
	 * @generated
	 */
	EAttribute getInverterType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.ParallelType <em>Parallel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Type</em>'.
	 * @see BehaviortreeSchema.ParallelType
	 * @generated
	 */
	EClass getParallelType();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.ParallelType#getBuiltInMultipleTypes <em>Built In Multiple Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Built In Multiple Types</em>'.
	 * @see BehaviortreeSchema.ParallelType#getBuiltInMultipleTypes()
	 * @see #getParallelType()
	 * @generated
	 */
	EAttribute getParallelType_BuiltInMultipleTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see BehaviortreeSchema.ParallelType#getAction()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see BehaviortreeSchema.ParallelType#getCondition()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see BehaviortreeSchema.ParallelType#getControl()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.ParallelType#getDecorator()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Decorator();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.ParallelType#getSubtree()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Subtree();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.ParallelType#getSequence()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.ParallelType#getSequenceStar()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.ParallelType#getFallback()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Fallback();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.ParallelType#getFallbackStar()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.ParallelType#getParallel()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.ParallelType#getInverter()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Inverter();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.ParallelType#getRetryUntilSuccesful()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.ParallelType#getRepeat()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Repeat();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.ParallelType#getTimeout()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_Timeout();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.ParallelType#getForceSucces()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.ParallelType#getForceFailure()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.ParallelType#getAlwaysSucces()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.ParallelType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.ParallelType#getAlwaysFailure()
	 * @see #getParallelType()
	 * @generated
	 */
	EReference getParallelType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ParallelType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.ParallelType#getName()
	 * @see #getParallelType()
	 * @generated
	 */
	EAttribute getParallelType_Name();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.ParallelType#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see BehaviortreeSchema.ParallelType#getThreshold()
	 * @see #getParallelType()
	 * @generated
	 */
	EAttribute getParallelType_Threshold();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.RepeatType <em>Repeat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Type</em>'.
	 * @see BehaviortreeSchema.RepeatType
	 * @generated
	 */
	EClass getRepeatType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.RepeatType#getAction()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.RepeatType#getCondition()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.RepeatType#getControl()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Control();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.RepeatType#getDecorator()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.RepeatType#getSubtree()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Subtree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.RepeatType#getSequence()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.RepeatType#getSequenceStar()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.RepeatType#getFallback()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.RepeatType#getFallbackStar()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.RepeatType#getParallel()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.RepeatType#getInverter()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Inverter();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.RepeatType#getRetryUntilSuccesful()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.RepeatType#getRepeat()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.RepeatType#getTimeout()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.RepeatType#getForceSucces()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.RepeatType#getForceFailure()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.RepeatType#getAlwaysSucces()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RepeatType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.RepeatType#getAlwaysFailure()
	 * @see #getRepeatType()
	 * @generated
	 */
	EReference getRepeatType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.RepeatType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.RepeatType#getName()
	 * @see #getRepeatType()
	 * @generated
	 */
	EAttribute getRepeatType_Name();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.RepeatType#getNumCycles <em>Num Cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Cycles</em>'.
	 * @see BehaviortreeSchema.RepeatType#getNumCycles()
	 * @see #getRepeatType()
	 * @generated
	 */
	EAttribute getRepeatType_NumCycles();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.RetryType <em>Retry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry Type</em>'.
	 * @see BehaviortreeSchema.RetryType
	 * @generated
	 */
	EClass getRetryType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.RetryType#getAction()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.RetryType#getCondition()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.RetryType#getControl()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Control();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.RetryType#getDecorator()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.RetryType#getSubtree()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Subtree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.RetryType#getSequence()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.RetryType#getSequenceStar()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.RetryType#getFallback()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.RetryType#getFallbackStar()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.RetryType#getParallel()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.RetryType#getInverter()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Inverter();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.RetryType#getRetryUntilSuccesful()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.RetryType#getRepeat()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.RetryType#getTimeout()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.RetryType#getForceSucces()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.RetryType#getForceFailure()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.RetryType#getAlwaysSucces()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RetryType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.RetryType#getAlwaysFailure()
	 * @see #getRetryType()
	 * @generated
	 */
	EReference getRetryType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.RetryType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.RetryType#getName()
	 * @see #getRetryType()
	 * @generated
	 */
	EAttribute getRetryType_Name();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.RetryType#getNumAttempts <em>Num Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Attempts</em>'.
	 * @see BehaviortreeSchema.RetryType#getNumAttempts()
	 * @see #getRetryType()
	 * @generated
	 */
	EAttribute getRetryType_NumAttempts();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.RootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Type</em>'.
	 * @see BehaviortreeSchema.RootType
	 * @generated
	 */
	EClass getRootType();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.RootType#getBehaviorTree <em>Behavior Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior Tree</em>'.
	 * @see BehaviortreeSchema.RootType#getBehaviorTree()
	 * @see #getRootType()
	 * @generated
	 */
	EReference getRootType_BehaviorTree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.RootType#getTreeNodeModel <em>Tree Node Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tree Node Model</em>'.
	 * @see BehaviortreeSchema.RootType#getTreeNodeModel()
	 * @see #getRootType()
	 * @generated
	 */
	EReference getRootType_TreeNodeModel();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.RootType#getMainTreeToExecute <em>Main Tree To Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Tree To Execute</em>'.
	 * @see BehaviortreeSchema.RootType#getMainTreeToExecute()
	 * @see #getRootType()
	 * @generated
	 */
	EAttribute getRootType_MainTreeToExecute();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.SequenceStarType <em>Sequence Star Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Star Type</em>'.
	 * @see BehaviortreeSchema.SequenceStarType
	 * @generated
	 */
	EClass getSequenceStarType();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.SequenceStarType#getBuiltInMultipleTypes <em>Built In Multiple Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Built In Multiple Types</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getBuiltInMultipleTypes()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EAttribute getSequenceStarType_BuiltInMultipleTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getAction()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getCondition()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getControl()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getDecorator()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Decorator();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getSubtree()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Subtree();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getSequence()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getSequenceStar()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getFallback()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Fallback();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getFallbackStar()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getParallel()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getInverter()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Inverter();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getRetryUntilSuccesful()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getRepeat()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Repeat();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getTimeout()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_Timeout();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getForceSucces()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getForceFailure()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getAlwaysSucces()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceStarType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getAlwaysFailure()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EReference getSequenceStarType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.SequenceStarType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.SequenceStarType#getName()
	 * @see #getSequenceStarType()
	 * @generated
	 */
	EAttribute getSequenceStarType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see BehaviortreeSchema.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.SequenceType#getBuiltInMultipleTypes <em>Built In Multiple Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Built In Multiple Types</em>'.
	 * @see BehaviortreeSchema.SequenceType#getBuiltInMultipleTypes()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_BuiltInMultipleTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see BehaviortreeSchema.SequenceType#getAction()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see BehaviortreeSchema.SequenceType#getCondition()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see BehaviortreeSchema.SequenceType#getControl()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Control();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.SequenceType#getDecorator()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Decorator();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.SequenceType#getSubtree()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Subtree();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.SequenceType#getSequence()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.SequenceType#getSequenceStar()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.SequenceType#getFallback()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Fallback();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.SequenceType#getFallbackStar()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.SequenceType#getParallel()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.SequenceType#getInverter()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Inverter();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.SequenceType#getRetryUntilSuccesful()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.SequenceType#getRepeat()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Repeat();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.SequenceType#getTimeout()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_Timeout();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.SequenceType#getForceSucces()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.SequenceType#getForceFailure()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.SequenceType#getAlwaysSucces()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference list '{@link BehaviortreeSchema.SequenceType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.SequenceType#getAlwaysFailure()
	 * @see #getSequenceType()
	 * @generated
	 */
	EReference getSequenceType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.SequenceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.SequenceType#getName()
	 * @see #getSequenceType()
	 * @generated
	 */
	EAttribute getSequenceType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.SubtreeType <em>Subtree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtree Type</em>'.
	 * @see BehaviortreeSchema.SubtreeType
	 * @generated
	 */
	EClass getSubtreeType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getAction()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getCondition()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getControl()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Control();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getDecorator()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getSubtree()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Subtree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getSequence()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getSequenceStar()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getFallback()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getFallbackStar()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getParallel()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getInverter()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Inverter();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getRetryUntilSuccesful()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getRepeat()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getTimeout()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getForceSucces()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getForceFailure()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getAlwaysSucces()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.SubtreeType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getAlwaysFailure()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EReference getSubtreeType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.SubtreeType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getID()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EAttribute getSubtreeType_ID();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.SubtreeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getName()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EAttribute getSubtreeType_Name();

	/**
	 * Returns the meta object for the attribute list '{@link BehaviortreeSchema.SubtreeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see BehaviortreeSchema.SubtreeType#getAnyAttribute()
	 * @see #getSubtreeType()
	 * @generated
	 */
	EAttribute getSubtreeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.TimeoutType <em>Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout Type</em>'.
	 * @see BehaviortreeSchema.TimeoutType
	 * @generated
	 */
	EClass getTimeoutType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getAction()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getCondition()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getControl()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Control();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getDecorator()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getSubtree <em>Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtree</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getSubtree()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Subtree();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getSequence()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Sequence();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getSequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Star</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getSequenceStar()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_SequenceStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getFallback()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getFallbackStar <em>Fallback Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback Star</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getFallbackStar()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_FallbackStar();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getParallel()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getInverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inverter</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getInverter()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Inverter();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getRetryUntilSuccesful <em>Retry Until Succesful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retry Until Succesful</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getRetryUntilSuccesful()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_RetryUntilSuccesful();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getRepeat()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getTimeout()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_Timeout();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getForceSucces <em>Force Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Succes</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getForceSucces()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_ForceSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Force Failure</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getForceFailure()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_ForceFailure();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getAlwaysSucces <em>Always Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Succes</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getAlwaysSucces()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_AlwaysSucces();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TimeoutType#getAlwaysFailure <em>Always Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Always Failure</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getAlwaysFailure()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EReference getTimeoutType_AlwaysFailure();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.TimeoutType#getMsec <em>Msec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msec</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getMsec()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EAttribute getTimeoutType_Msec();

	/**
	 * Returns the meta object for the attribute '{@link BehaviortreeSchema.TimeoutType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BehaviortreeSchema.TimeoutType#getName()
	 * @see #getTimeoutType()
	 * @generated
	 */
	EAttribute getTimeoutType_Name();

	/**
	 * Returns the meta object for class '{@link BehaviortreeSchema.TreeNodeModelType <em>Tree Node Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Node Model Type</em>'.
	 * @see BehaviortreeSchema.TreeNodeModelType
	 * @generated
	 */
	EClass getTreeNodeModelType();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TreeNodeModelType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see BehaviortreeSchema.TreeNodeModelType#getAction()
	 * @see #getTreeNodeModelType()
	 * @generated
	 */
	EReference getTreeNodeModelType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TreeNodeModelType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see BehaviortreeSchema.TreeNodeModelType#getCondition()
	 * @see #getTreeNodeModelType()
	 * @generated
	 */
	EReference getTreeNodeModelType_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TreeNodeModelType#getDecorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorator</em>'.
	 * @see BehaviortreeSchema.TreeNodeModelType#getDecorator()
	 * @see #getTreeNodeModelType()
	 * @generated
	 */
	EReference getTreeNodeModelType_Decorator();

	/**
	 * Returns the meta object for the containment reference '{@link BehaviortreeSchema.TreeNodeModelType#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see BehaviortreeSchema.TreeNodeModelType#getControl()
	 * @see #getTreeNodeModelType()
	 * @generated
	 */
	EReference getTreeNodeModelType_Control();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviortreeSchemaFactory getBehaviortreeSchemaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.ActionTypeImpl <em>Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.ActionTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getActionType()
		 * @generated
		 */
		EClass ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__ID = eINSTANCE.getActionType_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__NAME = eINSTANCE.getActionType_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getActionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.AlwaysFailureTypeImpl <em>Always Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.AlwaysFailureTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getAlwaysFailureType()
		 * @generated
		 */
		EClass ALWAYS_FAILURE_TYPE = eINSTANCE.getAlwaysFailureType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALWAYS_FAILURE_TYPE__NAME = eINSTANCE.getAlwaysFailureType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.AlwaysSuccesTypeImpl <em>Always Succes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.AlwaysSuccesTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getAlwaysSuccesType()
		 * @generated
		 */
		EClass ALWAYS_SUCCES_TYPE = eINSTANCE.getAlwaysSuccesType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALWAYS_SUCCES_TYPE__NAME = eINSTANCE.getAlwaysSuccesType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.BehaviorTreeTypeImpl <em>Behavior Tree Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.BehaviorTreeTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getBehaviorTreeType()
		 * @generated
		 */
		EClass BEHAVIOR_TREE_TYPE = eINSTANCE.getBehaviorTreeType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__ACTION = eINSTANCE.getBehaviorTreeType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__CONDITION = eINSTANCE.getBehaviorTreeType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__CONTROL = eINSTANCE.getBehaviorTreeType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__DECORATOR = eINSTANCE.getBehaviorTreeType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__SUBTREE = eINSTANCE.getBehaviorTreeType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__SEQUENCE = eINSTANCE.getBehaviorTreeType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__SEQUENCE_STAR = eINSTANCE.getBehaviorTreeType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__FALLBACK = eINSTANCE.getBehaviorTreeType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__FALLBACK_STAR = eINSTANCE.getBehaviorTreeType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__PARALLEL = eINSTANCE.getBehaviorTreeType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__INVERTER = eINSTANCE.getBehaviorTreeType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getBehaviorTreeType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__REPEAT = eINSTANCE.getBehaviorTreeType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__TIMEOUT = eINSTANCE.getBehaviorTreeType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__FORCE_SUCCES = eINSTANCE.getBehaviorTreeType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__FORCE_FAILURE = eINSTANCE.getBehaviorTreeType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__ALWAYS_SUCCES = eINSTANCE.getBehaviorTreeType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE_TYPE__ALWAYS_FAILURE = eINSTANCE.getBehaviorTreeType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_TREE_TYPE__ID = eINSTANCE.getBehaviorTreeType_ID();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.ConditionTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getConditionType()
		 * @generated
		 */
		EClass CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__ID = eINSTANCE.getConditionType_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__NAME = eINSTANCE.getConditionType_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_TYPE__ANY_ATTRIBUTE = eINSTANCE.getConditionType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.ControlTypeImpl <em>Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.ControlTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getControlType()
		 * @generated
		 */
		EClass CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '<em><b>Built In Multiple Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_TYPE__BUILT_IN_MULTIPLE_TYPES = eINSTANCE.getControlType_BuiltInMultipleTypes();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__ACTION = eINSTANCE.getControlType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__CONDITION = eINSTANCE.getControlType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__CONTROL = eINSTANCE.getControlType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__DECORATOR = eINSTANCE.getControlType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__SUBTREE = eINSTANCE.getControlType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__SEQUENCE = eINSTANCE.getControlType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__SEQUENCE_STAR = eINSTANCE.getControlType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__FALLBACK = eINSTANCE.getControlType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__FALLBACK_STAR = eINSTANCE.getControlType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__PARALLEL = eINSTANCE.getControlType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__INVERTER = eINSTANCE.getControlType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getControlType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__REPEAT = eINSTANCE.getControlType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__TIMEOUT = eINSTANCE.getControlType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__FORCE_SUCCES = eINSTANCE.getControlType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__FORCE_FAILURE = eINSTANCE.getControlType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__ALWAYS_SUCCES = eINSTANCE.getControlType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_TYPE__ALWAYS_FAILURE = eINSTANCE.getControlType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_TYPE__ID = eINSTANCE.getControlType_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_TYPE__NAME = eINSTANCE.getControlType_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_TYPE__ANY_ATTRIBUTE = eINSTANCE.getControlType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.DecoratorTypeImpl <em>Decorator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.DecoratorTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getDecoratorType()
		 * @generated
		 */
		EClass DECORATOR_TYPE = eINSTANCE.getDecoratorType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__ACTION = eINSTANCE.getDecoratorType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__CONDITION = eINSTANCE.getDecoratorType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__CONTROL = eINSTANCE.getDecoratorType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__DECORATOR = eINSTANCE.getDecoratorType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__SUBTREE = eINSTANCE.getDecoratorType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__SEQUENCE = eINSTANCE.getDecoratorType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__SEQUENCE_STAR = eINSTANCE.getDecoratorType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__FALLBACK = eINSTANCE.getDecoratorType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__FALLBACK_STAR = eINSTANCE.getDecoratorType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__PARALLEL = eINSTANCE.getDecoratorType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__INVERTER = eINSTANCE.getDecoratorType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getDecoratorType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__REPEAT = eINSTANCE.getDecoratorType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__TIMEOUT = eINSTANCE.getDecoratorType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__FORCE_SUCCES = eINSTANCE.getDecoratorType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__FORCE_FAILURE = eINSTANCE.getDecoratorType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__ALWAYS_SUCCES = eINSTANCE.getDecoratorType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_TYPE__ALWAYS_FAILURE = eINSTANCE.getDecoratorType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR_TYPE__ID = eINSTANCE.getDecoratorType_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR_TYPE__NAME = eINSTANCE.getDecoratorType_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDecoratorType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.DocumentRootImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROOT = eINSTANCE.getDocumentRoot_Root();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.FallbackStarTypeImpl <em>Fallback Star Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.FallbackStarTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getFallbackStarType()
		 * @generated
		 */
		EClass FALLBACK_STAR_TYPE = eINSTANCE.getFallbackStarType();

		/**
		 * The meta object literal for the '<em><b>Built In Multiple Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLBACK_STAR_TYPE__BUILT_IN_MULTIPLE_TYPES = eINSTANCE.getFallbackStarType_BuiltInMultipleTypes();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__ACTION = eINSTANCE.getFallbackStarType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__CONDITION = eINSTANCE.getFallbackStarType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__CONTROL = eINSTANCE.getFallbackStarType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__DECORATOR = eINSTANCE.getFallbackStarType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__SUBTREE = eINSTANCE.getFallbackStarType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__SEQUENCE = eINSTANCE.getFallbackStarType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__SEQUENCE_STAR = eINSTANCE.getFallbackStarType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__FALLBACK = eINSTANCE.getFallbackStarType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__FALLBACK_STAR = eINSTANCE.getFallbackStarType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__PARALLEL = eINSTANCE.getFallbackStarType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__INVERTER = eINSTANCE.getFallbackStarType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getFallbackStarType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__REPEAT = eINSTANCE.getFallbackStarType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__TIMEOUT = eINSTANCE.getFallbackStarType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__FORCE_SUCCES = eINSTANCE.getFallbackStarType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__FORCE_FAILURE = eINSTANCE.getFallbackStarType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__ALWAYS_SUCCES = eINSTANCE.getFallbackStarType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_STAR_TYPE__ALWAYS_FAILURE = eINSTANCE.getFallbackStarType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLBACK_STAR_TYPE__NAME = eINSTANCE.getFallbackStarType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.FallbackTypeImpl <em>Fallback Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.FallbackTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getFallbackType()
		 * @generated
		 */
		EClass FALLBACK_TYPE = eINSTANCE.getFallbackType();

		/**
		 * The meta object literal for the '<em><b>Built In Multiple Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLBACK_TYPE__BUILT_IN_MULTIPLE_TYPES = eINSTANCE.getFallbackType_BuiltInMultipleTypes();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__ACTION = eINSTANCE.getFallbackType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__CONDITION = eINSTANCE.getFallbackType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__CONTROL = eINSTANCE.getFallbackType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__DECORATOR = eINSTANCE.getFallbackType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__SUBTREE = eINSTANCE.getFallbackType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__SEQUENCE = eINSTANCE.getFallbackType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__SEQUENCE_STAR = eINSTANCE.getFallbackType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__FALLBACK = eINSTANCE.getFallbackType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__FALLBACK_STAR = eINSTANCE.getFallbackType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__PARALLEL = eINSTANCE.getFallbackType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__INVERTER = eINSTANCE.getFallbackType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getFallbackType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__REPEAT = eINSTANCE.getFallbackType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__TIMEOUT = eINSTANCE.getFallbackType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__FORCE_SUCCES = eINSTANCE.getFallbackType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__FORCE_FAILURE = eINSTANCE.getFallbackType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__ALWAYS_SUCCES = eINSTANCE.getFallbackType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__ALWAYS_FAILURE = eINSTANCE.getFallbackType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLBACK_TYPE__NAME = eINSTANCE.getFallbackType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.ForceFailureTypeImpl <em>Force Failure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.ForceFailureTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getForceFailureType()
		 * @generated
		 */
		EClass FORCE_FAILURE_TYPE = eINSTANCE.getForceFailureType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__ACTION = eINSTANCE.getForceFailureType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__CONDITION = eINSTANCE.getForceFailureType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__CONTROL = eINSTANCE.getForceFailureType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__DECORATOR = eINSTANCE.getForceFailureType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__SUBTREE = eINSTANCE.getForceFailureType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__SEQUENCE = eINSTANCE.getForceFailureType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__SEQUENCE_STAR = eINSTANCE.getForceFailureType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__FALLBACK = eINSTANCE.getForceFailureType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__FALLBACK_STAR = eINSTANCE.getForceFailureType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__PARALLEL = eINSTANCE.getForceFailureType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__INVERTER = eINSTANCE.getForceFailureType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getForceFailureType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__REPEAT = eINSTANCE.getForceFailureType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__TIMEOUT = eINSTANCE.getForceFailureType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__FORCE_SUCCES = eINSTANCE.getForceFailureType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__FORCE_FAILURE = eINSTANCE.getForceFailureType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__ALWAYS_SUCCES = eINSTANCE.getForceFailureType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_FAILURE_TYPE__ALWAYS_FAILURE = eINSTANCE.getForceFailureType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCE_FAILURE_TYPE__NAME = eINSTANCE.getForceFailureType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.ForceSuccesTypeImpl <em>Force Succes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.ForceSuccesTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getForceSuccesType()
		 * @generated
		 */
		EClass FORCE_SUCCES_TYPE = eINSTANCE.getForceSuccesType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__ACTION = eINSTANCE.getForceSuccesType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__CONDITION = eINSTANCE.getForceSuccesType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__CONTROL = eINSTANCE.getForceSuccesType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__DECORATOR = eINSTANCE.getForceSuccesType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__SUBTREE = eINSTANCE.getForceSuccesType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__SEQUENCE = eINSTANCE.getForceSuccesType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__SEQUENCE_STAR = eINSTANCE.getForceSuccesType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__FALLBACK = eINSTANCE.getForceSuccesType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__FALLBACK_STAR = eINSTANCE.getForceSuccesType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__PARALLEL = eINSTANCE.getForceSuccesType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__INVERTER = eINSTANCE.getForceSuccesType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getForceSuccesType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__REPEAT = eINSTANCE.getForceSuccesType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__TIMEOUT = eINSTANCE.getForceSuccesType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__FORCE_SUCCES = eINSTANCE.getForceSuccesType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__FORCE_FAILURE = eINSTANCE.getForceSuccesType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__ALWAYS_SUCCES = eINSTANCE.getForceSuccesType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORCE_SUCCES_TYPE__ALWAYS_FAILURE = eINSTANCE.getForceSuccesType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORCE_SUCCES_TYPE__NAME = eINSTANCE.getForceSuccesType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.InverterTypeImpl <em>Inverter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.InverterTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getInverterType()
		 * @generated
		 */
		EClass INVERTER_TYPE = eINSTANCE.getInverterType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__ACTION = eINSTANCE.getInverterType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__CONDITION = eINSTANCE.getInverterType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__CONTROL = eINSTANCE.getInverterType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__DECORATOR = eINSTANCE.getInverterType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__SUBTREE = eINSTANCE.getInverterType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__SEQUENCE = eINSTANCE.getInverterType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__SEQUENCE_STAR = eINSTANCE.getInverterType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__FALLBACK = eINSTANCE.getInverterType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__FALLBACK_STAR = eINSTANCE.getInverterType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__PARALLEL = eINSTANCE.getInverterType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__INVERTER = eINSTANCE.getInverterType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getInverterType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__REPEAT = eINSTANCE.getInverterType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__TIMEOUT = eINSTANCE.getInverterType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__FORCE_SUCCES = eINSTANCE.getInverterType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__FORCE_FAILURE = eINSTANCE.getInverterType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__ALWAYS_SUCCES = eINSTANCE.getInverterType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERTER_TYPE__ALWAYS_FAILURE = eINSTANCE.getInverterType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVERTER_TYPE__NAME = eINSTANCE.getInverterType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.ParallelTypeImpl <em>Parallel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.ParallelTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getParallelType()
		 * @generated
		 */
		EClass PARALLEL_TYPE = eINSTANCE.getParallelType();

		/**
		 * The meta object literal for the '<em><b>Built In Multiple Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL_TYPE__BUILT_IN_MULTIPLE_TYPES = eINSTANCE.getParallelType_BuiltInMultipleTypes();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__ACTION = eINSTANCE.getParallelType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__CONDITION = eINSTANCE.getParallelType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__CONTROL = eINSTANCE.getParallelType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__DECORATOR = eINSTANCE.getParallelType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__SUBTREE = eINSTANCE.getParallelType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__SEQUENCE = eINSTANCE.getParallelType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__SEQUENCE_STAR = eINSTANCE.getParallelType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__FALLBACK = eINSTANCE.getParallelType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__FALLBACK_STAR = eINSTANCE.getParallelType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__PARALLEL = eINSTANCE.getParallelType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__INVERTER = eINSTANCE.getParallelType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getParallelType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__REPEAT = eINSTANCE.getParallelType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__TIMEOUT = eINSTANCE.getParallelType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__FORCE_SUCCES = eINSTANCE.getParallelType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__FORCE_FAILURE = eINSTANCE.getParallelType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__ALWAYS_SUCCES = eINSTANCE.getParallelType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TYPE__ALWAYS_FAILURE = eINSTANCE.getParallelType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL_TYPE__NAME = eINSTANCE.getParallelType_Name();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL_TYPE__THRESHOLD = eINSTANCE.getParallelType_Threshold();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.RepeatTypeImpl <em>Repeat Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.RepeatTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getRepeatType()
		 * @generated
		 */
		EClass REPEAT_TYPE = eINSTANCE.getRepeatType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__ACTION = eINSTANCE.getRepeatType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__CONDITION = eINSTANCE.getRepeatType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__CONTROL = eINSTANCE.getRepeatType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__DECORATOR = eINSTANCE.getRepeatType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__SUBTREE = eINSTANCE.getRepeatType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__SEQUENCE = eINSTANCE.getRepeatType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__SEQUENCE_STAR = eINSTANCE.getRepeatType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__FALLBACK = eINSTANCE.getRepeatType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__FALLBACK_STAR = eINSTANCE.getRepeatType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__PARALLEL = eINSTANCE.getRepeatType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__INVERTER = eINSTANCE.getRepeatType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getRepeatType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__REPEAT = eINSTANCE.getRepeatType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__TIMEOUT = eINSTANCE.getRepeatType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__FORCE_SUCCES = eINSTANCE.getRepeatType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__FORCE_FAILURE = eINSTANCE.getRepeatType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__ALWAYS_SUCCES = eINSTANCE.getRepeatType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_TYPE__ALWAYS_FAILURE = eINSTANCE.getRepeatType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_TYPE__NAME = eINSTANCE.getRepeatType_Name();

		/**
		 * The meta object literal for the '<em><b>Num Cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_TYPE__NUM_CYCLES = eINSTANCE.getRepeatType_NumCycles();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.RetryTypeImpl <em>Retry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.RetryTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getRetryType()
		 * @generated
		 */
		EClass RETRY_TYPE = eINSTANCE.getRetryType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__ACTION = eINSTANCE.getRetryType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__CONDITION = eINSTANCE.getRetryType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__CONTROL = eINSTANCE.getRetryType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__DECORATOR = eINSTANCE.getRetryType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__SUBTREE = eINSTANCE.getRetryType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__SEQUENCE = eINSTANCE.getRetryType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__SEQUENCE_STAR = eINSTANCE.getRetryType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__FALLBACK = eINSTANCE.getRetryType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__FALLBACK_STAR = eINSTANCE.getRetryType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__PARALLEL = eINSTANCE.getRetryType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__INVERTER = eINSTANCE.getRetryType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getRetryType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__REPEAT = eINSTANCE.getRetryType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__TIMEOUT = eINSTANCE.getRetryType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__FORCE_SUCCES = eINSTANCE.getRetryType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__FORCE_FAILURE = eINSTANCE.getRetryType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__ALWAYS_SUCCES = eINSTANCE.getRetryType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETRY_TYPE__ALWAYS_FAILURE = eINSTANCE.getRetryType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_TYPE__NAME = eINSTANCE.getRetryType_Name();

		/**
		 * The meta object literal for the '<em><b>Num Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_TYPE__NUM_ATTEMPTS = eINSTANCE.getRetryType_NumAttempts();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.RootTypeImpl <em>Root Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.RootTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getRootType()
		 * @generated
		 */
		EClass ROOT_TYPE = eINSTANCE.getRootType();

		/**
		 * The meta object literal for the '<em><b>Behavior Tree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_TYPE__BEHAVIOR_TREE = eINSTANCE.getRootType_BehaviorTree();

		/**
		 * The meta object literal for the '<em><b>Tree Node Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_TYPE__TREE_NODE_MODEL = eINSTANCE.getRootType_TreeNodeModel();

		/**
		 * The meta object literal for the '<em><b>Main Tree To Execute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT_TYPE__MAIN_TREE_TO_EXECUTE = eINSTANCE.getRootType_MainTreeToExecute();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.SequenceStarTypeImpl <em>Sequence Star Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.SequenceStarTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getSequenceStarType()
		 * @generated
		 */
		EClass SEQUENCE_STAR_TYPE = eINSTANCE.getSequenceStarType();

		/**
		 * The meta object literal for the '<em><b>Built In Multiple Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_STAR_TYPE__BUILT_IN_MULTIPLE_TYPES = eINSTANCE.getSequenceStarType_BuiltInMultipleTypes();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__ACTION = eINSTANCE.getSequenceStarType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__CONDITION = eINSTANCE.getSequenceStarType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__CONTROL = eINSTANCE.getSequenceStarType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__DECORATOR = eINSTANCE.getSequenceStarType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__SUBTREE = eINSTANCE.getSequenceStarType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__SEQUENCE = eINSTANCE.getSequenceStarType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__SEQUENCE_STAR = eINSTANCE.getSequenceStarType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__FALLBACK = eINSTANCE.getSequenceStarType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__FALLBACK_STAR = eINSTANCE.getSequenceStarType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__PARALLEL = eINSTANCE.getSequenceStarType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__INVERTER = eINSTANCE.getSequenceStarType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getSequenceStarType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__REPEAT = eINSTANCE.getSequenceStarType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__TIMEOUT = eINSTANCE.getSequenceStarType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__FORCE_SUCCES = eINSTANCE.getSequenceStarType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__FORCE_FAILURE = eINSTANCE.getSequenceStarType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__ALWAYS_SUCCES = eINSTANCE.getSequenceStarType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STAR_TYPE__ALWAYS_FAILURE = eINSTANCE.getSequenceStarType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_STAR_TYPE__NAME = eINSTANCE.getSequenceStarType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.SequenceTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '<em><b>Built In Multiple Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_TYPE__BUILT_IN_MULTIPLE_TYPES = eINSTANCE.getSequenceType_BuiltInMultipleTypes();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__ACTION = eINSTANCE.getSequenceType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__CONDITION = eINSTANCE.getSequenceType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__CONTROL = eINSTANCE.getSequenceType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__DECORATOR = eINSTANCE.getSequenceType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__SUBTREE = eINSTANCE.getSequenceType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__SEQUENCE = eINSTANCE.getSequenceType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__SEQUENCE_STAR = eINSTANCE.getSequenceType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__FALLBACK = eINSTANCE.getSequenceType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__FALLBACK_STAR = eINSTANCE.getSequenceType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__PARALLEL = eINSTANCE.getSequenceType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__INVERTER = eINSTANCE.getSequenceType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getSequenceType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__REPEAT = eINSTANCE.getSequenceType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__TIMEOUT = eINSTANCE.getSequenceType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__FORCE_SUCCES = eINSTANCE.getSequenceType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__FORCE_FAILURE = eINSTANCE.getSequenceType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__ALWAYS_SUCCES = eINSTANCE.getSequenceType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_TYPE__ALWAYS_FAILURE = eINSTANCE.getSequenceType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_TYPE__NAME = eINSTANCE.getSequenceType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.SubtreeTypeImpl <em>Subtree Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.SubtreeTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getSubtreeType()
		 * @generated
		 */
		EClass SUBTREE_TYPE = eINSTANCE.getSubtreeType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__ACTION = eINSTANCE.getSubtreeType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__CONDITION = eINSTANCE.getSubtreeType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__CONTROL = eINSTANCE.getSubtreeType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__DECORATOR = eINSTANCE.getSubtreeType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__SUBTREE = eINSTANCE.getSubtreeType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__SEQUENCE = eINSTANCE.getSubtreeType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__SEQUENCE_STAR = eINSTANCE.getSubtreeType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__FALLBACK = eINSTANCE.getSubtreeType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__FALLBACK_STAR = eINSTANCE.getSubtreeType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__PARALLEL = eINSTANCE.getSubtreeType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__INVERTER = eINSTANCE.getSubtreeType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getSubtreeType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__REPEAT = eINSTANCE.getSubtreeType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__TIMEOUT = eINSTANCE.getSubtreeType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__FORCE_SUCCES = eINSTANCE.getSubtreeType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__FORCE_FAILURE = eINSTANCE.getSubtreeType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__ALWAYS_SUCCES = eINSTANCE.getSubtreeType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTREE_TYPE__ALWAYS_FAILURE = eINSTANCE.getSubtreeType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTREE_TYPE__ID = eINSTANCE.getSubtreeType_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTREE_TYPE__NAME = eINSTANCE.getSubtreeType_Name();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTREE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getSubtreeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.TimeoutTypeImpl <em>Timeout Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.TimeoutTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getTimeoutType()
		 * @generated
		 */
		EClass TIMEOUT_TYPE = eINSTANCE.getTimeoutType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__ACTION = eINSTANCE.getTimeoutType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__CONDITION = eINSTANCE.getTimeoutType_Condition();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__CONTROL = eINSTANCE.getTimeoutType_Control();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__DECORATOR = eINSTANCE.getTimeoutType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Subtree</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__SUBTREE = eINSTANCE.getTimeoutType_Subtree();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__SEQUENCE = eINSTANCE.getTimeoutType_Sequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__SEQUENCE_STAR = eINSTANCE.getTimeoutType_SequenceStar();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__FALLBACK = eINSTANCE.getTimeoutType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Fallback Star</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__FALLBACK_STAR = eINSTANCE.getTimeoutType_FallbackStar();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__PARALLEL = eINSTANCE.getTimeoutType_Parallel();

		/**
		 * The meta object literal for the '<em><b>Inverter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__INVERTER = eINSTANCE.getTimeoutType_Inverter();

		/**
		 * The meta object literal for the '<em><b>Retry Until Succesful</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__RETRY_UNTIL_SUCCESFUL = eINSTANCE.getTimeoutType_RetryUntilSuccesful();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__REPEAT = eINSTANCE.getTimeoutType_Repeat();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__TIMEOUT = eINSTANCE.getTimeoutType_Timeout();

		/**
		 * The meta object literal for the '<em><b>Force Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__FORCE_SUCCES = eINSTANCE.getTimeoutType_ForceSucces();

		/**
		 * The meta object literal for the '<em><b>Force Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__FORCE_FAILURE = eINSTANCE.getTimeoutType_ForceFailure();

		/**
		 * The meta object literal for the '<em><b>Always Succes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__ALWAYS_SUCCES = eINSTANCE.getTimeoutType_AlwaysSucces();

		/**
		 * The meta object literal for the '<em><b>Always Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMEOUT_TYPE__ALWAYS_FAILURE = eINSTANCE.getTimeoutType_AlwaysFailure();

		/**
		 * The meta object literal for the '<em><b>Msec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEOUT_TYPE__MSEC = eINSTANCE.getTimeoutType_Msec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEOUT_TYPE__NAME = eINSTANCE.getTimeoutType_Name();

		/**
		 * The meta object literal for the '{@link BehaviortreeSchema.impl.TreeNodeModelTypeImpl <em>Tree Node Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BehaviortreeSchema.impl.TreeNodeModelTypeImpl
		 * @see BehaviortreeSchema.impl.BehaviortreeSchemaPackageImpl#getTreeNodeModelType()
		 * @generated
		 */
		EClass TREE_NODE_MODEL_TYPE = eINSTANCE.getTreeNodeModelType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE_MODEL_TYPE__ACTION = eINSTANCE.getTreeNodeModelType_Action();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE_MODEL_TYPE__CONDITION = eINSTANCE.getTreeNodeModelType_Condition();

		/**
		 * The meta object literal for the '<em><b>Decorator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE_MODEL_TYPE__DECORATOR = eINSTANCE.getTreeNodeModelType_Decorator();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE_MODEL_TYPE__CONTROL = eINSTANCE.getTreeNodeModelType_Control();

	}

} //BehaviortreeSchemaPackage
