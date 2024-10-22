/**
 */
package btcpp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see btcpp.BtcppFactory
 * @model kind="package"
 * @generated
 */
public interface BtcppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "btcpp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/btcpp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "btcpp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtcppPackage eINSTANCE = btcpp.impl.BtcppPackageImpl.init();

	/**
	 * The meta object id for the '{@link btcpp.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.BehaviorTreeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getBehaviorTree()
	 * @generated
	 */
	int BEHAVIOR_TREE = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE__NODE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE__ID = 1;

	/**
	 * The number of structural features of the '<em>Behavior Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behavior Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.TreeNodeImpl <em>Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.TreeNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getTreeNode()
	 * @generated
	 */
	int TREE_NODE = 1;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__UID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__NODE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__ANY_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__NODE_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__PARAMETERS = 5;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__SATISFICES = 6;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__SATISFIES = 7;

	/**
	 * The number of structural features of the '<em>Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ControlNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 2;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__UID = TREE_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = TREE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NODE_TYPE = TREE_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__ANY_ATTRIBUTE = TREE_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NODE_STATUS = TREE_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__PARAMETERS = TREE_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__SATISFICES = TREE_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__SATISFIES = TREE_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__CHILD = TREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = TREE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_OPERATION_COUNT = TREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.DecoratorNodeImpl <em>Decorator Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.DecoratorNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getDecoratorNode()
	 * @generated
	 */
	int DECORATOR_NODE = 3;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__UID = TREE_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__NAME = TREE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__NODE_TYPE = TREE_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__ANY_ATTRIBUTE = TREE_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__NODE_STATUS = TREE_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__PARAMETERS = TREE_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__SATISFICES = TREE_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__SATISFIES = TREE_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__CHILD = TREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decorator Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE_FEATURE_COUNT = TREE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decorator Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE_OPERATION_COUNT = TREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.LeafNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getLeafNode()
	 * @generated
	 */
	int LEAF_NODE = 25;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__UID = TREE_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__NAME = TREE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__NODE_TYPE = TREE_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__ANY_ATTRIBUTE = TREE_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__NODE_STATUS = TREE_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__PARAMETERS = TREE_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__SATISFICES = TREE_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__SATISFIES = TREE_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Leaf Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_FEATURE_COUNT = TREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leaf Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE_OPERATION_COUNT = TREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ActionNodeBaseImpl <em>Action Node Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ActionNodeBaseImpl
	 * @see btcpp.impl.BtcppPackageImpl#getActionNodeBase()
	 * @generated
	 */
	int ACTION_NODE_BASE = 26;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__UID = LEAF_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__NAME = LEAF_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__NODE_TYPE = LEAF_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__ANY_ATTRIBUTE = LEAF_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__NODE_STATUS = LEAF_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__PARAMETERS = LEAF_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__SATISFICES = LEAF_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__SATISFIES = LEAF_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Action Node Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE_FEATURE_COUNT = LEAF_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Node Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE_OPERATION_COUNT = LEAF_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SyncActionNodeImpl <em>Sync Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SyncActionNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSyncActionNode()
	 * @generated
	 */
	int SYNC_ACTION_NODE = 54;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__UID = ACTION_NODE_BASE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__NAME = ACTION_NODE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__NODE_TYPE = ACTION_NODE_BASE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__ANY_ATTRIBUTE = ACTION_NODE_BASE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__NODE_STATUS = ACTION_NODE_BASE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__PARAMETERS = ACTION_NODE_BASE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__SATISFICES = ACTION_NODE_BASE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__SATISFIES = ACTION_NODE_BASE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Sync Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE_FEATURE_COUNT = ACTION_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sync Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE_OPERATION_COUNT = ACTION_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.AlwaysFailureNodeImpl <em>Always Failure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.AlwaysFailureNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getAlwaysFailureNode()
	 * @generated
	 */
	int ALWAYS_FAILURE_NODE = 4;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__UID = SYNC_ACTION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__NAME = SYNC_ACTION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__NODE_TYPE = SYNC_ACTION_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__ANY_ATTRIBUTE = SYNC_ACTION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__NODE_STATUS = SYNC_ACTION_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__PARAMETERS = SYNC_ACTION_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__SATISFICES = SYNC_ACTION_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__SATISFIES = SYNC_ACTION_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Always Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE_FEATURE_COUNT = SYNC_ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Always Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE_OPERATION_COUNT = SYNC_ACTION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.AlwaysSuccessNodeImpl <em>Always Success Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.AlwaysSuccessNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getAlwaysSuccessNode()
	 * @generated
	 */
	int ALWAYS_SUCCESS_NODE = 5;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__UID = SYNC_ACTION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__NAME = SYNC_ACTION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__NODE_TYPE = SYNC_ACTION_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__ANY_ATTRIBUTE = SYNC_ACTION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__NODE_STATUS = SYNC_ACTION_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__PARAMETERS = SYNC_ACTION_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__SATISFICES = SYNC_ACTION_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__SATISFIES = SYNC_ACTION_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Always Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE_FEATURE_COUNT = SYNC_ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Always Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE_OPERATION_COUNT = SYNC_ACTION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SetBlackboardNodeImpl <em>Set Blackboard Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SetBlackboardNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSetBlackboardNode()
	 * @generated
	 */
	int SET_BLACKBOARD_NODE = 6;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__UID = SYNC_ACTION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__NAME = SYNC_ACTION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__NODE_TYPE = SYNC_ACTION_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__ANY_ATTRIBUTE = SYNC_ACTION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__NODE_STATUS = SYNC_ACTION_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__PARAMETERS = SYNC_ACTION_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__SATISFICES = SYNC_ACTION_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__SATISFIES = SYNC_ACTION_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__VALUE = SYNC_ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__OUTPUT_KEY = SYNC_ACTION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE_FEATURE_COUNT = SYNC_ACTION_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE_OPERATION_COUNT = SYNC_ACTION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SelectorNodeImpl <em>Selector Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SelectorNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSelectorNode()
	 * @generated
	 */
	int SELECTOR_NODE = 7;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Selector Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selector Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.IfThenElseNodeImpl <em>If Then Else Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.IfThenElseNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getIfThenElseNode()
	 * @generated
	 */
	int IF_THEN_ELSE_NODE = 8;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>If Then Else Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>If Then Else Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ManualSelectorNodeImpl <em>Manual Selector Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ManualSelectorNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getManualSelectorNode()
	 * @generated
	 */
	int MANUAL_SELECTOR_NODE = 9;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Manual Selector Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual Selector Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SELECTOR_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ParallelNodeImpl <em>Parallel Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ParallelNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getParallelNode()
	 * @generated
	 */
	int PARALLEL_NODE = 10;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Parallel Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SequenceWithMemoryImpl <em>Sequence With Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SequenceWithMemoryImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSequenceWithMemory()
	 * @generated
	 */
	int SEQUENCE_WITH_MEMORY = 11;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Sequence With Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence With Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_WITH_MEMORY_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SwitchNodeImpl <em>Switch Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SwitchNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSwitchNode()
	 * @generated
	 */
	int SWITCH_NODE = 12;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Switch Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Switch Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ReactiveSelectorImpl <em>Reactive Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ReactiveSelectorImpl
	 * @see btcpp.impl.BtcppPackageImpl#getReactiveSelector()
	 * @generated
	 */
	int REACTIVE_SELECTOR = 13;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Reactive Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reactive Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SELECTOR_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.WhileDoElseNodeImpl <em>While Do Else Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.WhileDoElseNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getWhileDoElseNode()
	 * @generated
	 */
	int WHILE_DO_ELSE_NODE = 14;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>While Do Else Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>While Do Else Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ReactiveSequenceImpl <em>Reactive Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ReactiveSequenceImpl
	 * @see btcpp.impl.BtcppPackageImpl#getReactiveSequence()
	 * @generated
	 */
	int REACTIVE_SEQUENCE = 15;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Reactive Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reactive Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SequenceNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSequenceNode()
	 * @generated
	 */
	int SEQUENCE_NODE = 16;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.TimeoutNodeImpl <em>Timeout Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.TimeoutNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getTimeoutNode()
	 * @generated
	 */
	int TIMEOUT_NODE = 17;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__MSEC = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timeout Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timeout Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.KeepRunningUntilFailureNodeImpl <em>Keep Running Until Failure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.KeepRunningUntilFailureNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getKeepRunningUntilFailureNode()
	 * @generated
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE = 18;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Keep Running Until Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Keep Running Until Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.InverterNodeImpl <em>Inverter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.InverterNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getInverterNode()
	 * @generated
	 */
	int INVERTER_NODE = 19;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Inverter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inverter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ForceSuccessNodeImpl <em>Force Success Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ForceSuccessNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getForceSuccessNode()
	 * @generated
	 */
	int FORCE_SUCCESS_NODE = 20;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Force Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Force Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ForceFailureNodeImpl <em>Force Failure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ForceFailureNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getForceFailureNode()
	 * @generated
	 */
	int FORCE_FAILURE_NODE = 21;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Force Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Force Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.RepeatNodeImpl <em>Repeat Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.RepeatNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getRepeatNode()
	 * @generated
	 */
	int REPEAT_NODE = 22;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Num cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__NUM_CYCLES = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repeat Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ConditionNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getConditionNode()
	 * @generated
	 */
	int CONDITION_NODE = 23;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__UID = LEAF_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__NAME = LEAF_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__NODE_TYPE = LEAF_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__ANY_ATTRIBUTE = LEAF_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__NODE_STATUS = LEAF_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__PARAMETERS = LEAF_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__SATISFICES = LEAF_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__SATISFIES = LEAF_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_FEATURE_COUNT = LEAF_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE_OPERATION_COUNT = LEAF_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SubTreeImpl <em>Sub Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SubTreeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSubTree()
	 * @generated
	 */
	int SUB_TREE = 24;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__UID = TREE_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__NAME = TREE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__NODE_TYPE = TREE_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__ANY_ATTRIBUTE = TREE_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__NODE_STATUS = TREE_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__PARAMETERS = TREE_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__SATISFICES = TREE_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__SATISFIES = TREE_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__CHILD = TREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE_FEATURE_COUNT = TREE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE_OPERATION_COUNT = TREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ScriptNodeImpl <em>Script Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ScriptNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getScriptNode()
	 * @generated
	 */
	int SCRIPT_NODE = 27;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE__UID = SYNC_ACTION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE__NAME = SYNC_ACTION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE__NODE_TYPE = SYNC_ACTION_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE__ANY_ATTRIBUTE = SYNC_ACTION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE__NODE_STATUS = SYNC_ACTION_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE__PARAMETERS = SYNC_ACTION_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE__SATISFICES = SYNC_ACTION_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE__SATISFIES = SYNC_ACTION_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Script Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE_FEATURE_COUNT = SYNC_ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Script Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_NODE_OPERATION_COUNT = SYNC_ACTION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ScriptConditionNodeImpl <em>Script Condition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ScriptConditionNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getScriptConditionNode()
	 * @generated
	 */
	int SCRIPT_CONDITION_NODE = 28;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE__UID = CONDITION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE__NAME = CONDITION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE__NODE_TYPE = CONDITION_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE__ANY_ATTRIBUTE = CONDITION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE__NODE_STATUS = CONDITION_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE__PARAMETERS = CONDITION_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE__SATISFICES = CONDITION_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE__SATISFIES = CONDITION_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Script Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE_FEATURE_COUNT = CONDITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Script Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_CONDITION_NODE_OPERATION_COUNT = CONDITION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.RetryNodeImpl <em>Retry Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.RetryNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getRetryNode()
	 * @generated
	 */
	int RETRY_NODE = 29;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Num attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__NUM_ATTEMPTS = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Retry Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Retry Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.RootImpl
	 * @see btcpp.impl.BtcppPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 30;

	/**
	 * The feature id for the '<em><b>Behaviortrees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__BEHAVIORTREES = 0;

	/**
	 * The feature id for the '<em><b>Main tree to execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MAIN_TREE_TO_EXECUTE = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ParameterImpl
	 * @see btcpp.impl.BtcppPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 31;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.QualityRequirementImpl
	 * @see btcpp.impl.BtcppPackageImpl#getQualityRequirement()
	 * @generated
	 */
	int QUALITY_REQUIREMENT = 32;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.QualityImpl <em>Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.QualityImpl
	 * @see btcpp.impl.BtcppPackageImpl#getQuality()
	 * @generated
	 */
	int QUALITY = 33;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Qualityreq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__QUALITYREQ = 1;

	/**
	 * The number of structural features of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SelectorWithMemoryImpl <em>Selector With Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SelectorWithMemoryImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSelectorWithMemory()
	 * @generated
	 */
	int SELECTOR_WITH_MEMORY = 34;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Selector With Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selector With Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_WITH_MEMORY_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ParallelAllNodeImpl <em>Parallel All Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ParallelAllNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getParallelAllNode()
	 * @generated
	 */
	int PARALLEL_ALL_NODE = 35;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE__SATISFICES = CONTROL_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE__SATISFIES = CONTROL_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Parallel All Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel All Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_ALL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.DelayNodeImpl <em>Delay Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.DelayNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getDelayNode()
	 * @generated
	 */
	int DELAY_NODE = 36;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Delay msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE__DELAY_MSEC = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delay Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delay Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.PreconditionNodeImpl <em>Precondition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.PreconditionNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getPreconditionNode()
	 * @generated
	 */
	int PRECONDITION_NODE = 37;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Precondition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Precondition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.EntryUpdatedDecoratorNodeImpl <em>Entry Updated Decorator Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.EntryUpdatedDecoratorNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getEntryUpdatedDecoratorNode()
	 * @generated
	 */
	int ENTRY_UPDATED_DECORATOR_NODE = 38;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Entry Updated Decorator Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entry Updated Decorator Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_DECORATOR_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.RunOnceNodeImpl <em>Run Once Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.RunOnceNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getRunOnceNode()
	 * @generated
	 */
	int RUN_ONCE_NODE = 39;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Run Once Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Run Once Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_ONCE_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.LoopNodeImpl <em>Loop Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.LoopNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getLoopNode()
	 * @generated
	 */
	int LOOP_NODE = 40;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Loop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ConsumeQueueNodeImpl <em>Consume Queue Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ConsumeQueueNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getConsumeQueueNode()
	 * @generated
	 */
	int CONSUME_QUEUE_NODE = 41;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Consume Queue Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Consume Queue Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUME_QUEUE_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.CountNodeImpl <em>Count Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.CountNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getCountNode()
	 * @generated
	 */
	int COUNT_NODE = 42;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Count Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.EternalGuardNodeImpl <em>Eternal Guard Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.EternalGuardNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getEternalGuardNode()
	 * @generated
	 */
	int ETERNAL_GUARD_NODE = 43;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Eternal Guard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Eternal Guard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETERNAL_GUARD_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.StatusToBlackboardNodeImpl <em>Status To Blackboard Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.StatusToBlackboardNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getStatusToBlackboardNode()
	 * @generated
	 */
	int STATUS_TO_BLACKBOARD_NODE = 44;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Status To Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status To Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TO_BLACKBOARD_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.FailureIsRunningNodeImpl <em>Failure Is Running Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.FailureIsRunningNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getFailureIsRunningNode()
	 * @generated
	 */
	int FAILURE_IS_RUNNING_NODE = 45;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Failure Is Running Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure Is Running Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_RUNNING_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.FailureIsSuccessNodeImpl <em>Failure Is Success Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.FailureIsSuccessNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getFailureIsSuccessNode()
	 * @generated
	 */
	int FAILURE_IS_SUCCESS_NODE = 46;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Failure Is Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure Is Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_IS_SUCCESS_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.RunningIsFailureNodeImpl <em>Running Is Failure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.RunningIsFailureNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getRunningIsFailureNode()
	 * @generated
	 */
	int RUNNING_IS_FAILURE_NODE = 47;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Running Is Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Running Is Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_FAILURE_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.RunningIsSuccessNodeImpl <em>Running Is Success Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.RunningIsSuccessNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getRunningIsSuccessNode()
	 * @generated
	 */
	int RUNNING_IS_SUCCESS_NODE = 48;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Running Is Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Running Is Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNING_IS_SUCCESS_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SuccessIsFailureNodeImpl <em>Success Is Failure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SuccessIsFailureNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSuccessIsFailureNode()
	 * @generated
	 */
	int SUCCESS_IS_FAILURE_NODE = 49;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Success Is Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Success Is Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_FAILURE_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SuccessIsRunningNodeImpl <em>Success Is Running Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SuccessIsRunningNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSuccessIsRunningNode()
	 * @generated
	 */
	int SUCCESS_IS_RUNNING_NODE = 50;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE__SATISFICES = DECORATOR_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE__SATISFIES = DECORATOR_NODE__SATISFIES;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Success Is Running Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Success Is Running Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_IS_RUNNING_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.TestNodeImpl <em>Test Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.TestNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getTestNode()
	 * @generated
	 */
	int TEST_NODE = 51;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__UID = SYNC_ACTION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__NAME = SYNC_ACTION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__NODE_TYPE = SYNC_ACTION_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__ANY_ATTRIBUTE = SYNC_ACTION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__NODE_STATUS = SYNC_ACTION_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__PARAMETERS = SYNC_ACTION_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__SATISFICES = SYNC_ACTION_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__SATISFIES = SYNC_ACTION_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Test Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE_FEATURE_COUNT = SYNC_ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Test Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE_OPERATION_COUNT = SYNC_ACTION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.EntryUpdatedActionNodeImpl <em>Entry Updated Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.EntryUpdatedActionNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getEntryUpdatedActionNode()
	 * @generated
	 */
	int ENTRY_UPDATED_ACTION_NODE = 52;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE__UID = SYNC_ACTION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE__NAME = SYNC_ACTION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE__NODE_TYPE = SYNC_ACTION_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE__ANY_ATTRIBUTE = SYNC_ACTION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE__NODE_STATUS = SYNC_ACTION_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE__PARAMETERS = SYNC_ACTION_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE__SATISFICES = SYNC_ACTION_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE__SATISFIES = SYNC_ACTION_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Entry Updated Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE_FEATURE_COUNT = SYNC_ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entry Updated Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_UPDATED_ACTION_NODE_OPERATION_COUNT = SYNC_ACTION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.UnsetBlackboardNodeImpl <em>Unset Blackboard Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.UnsetBlackboardNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getUnsetBlackboardNode()
	 * @generated
	 */
	int UNSET_BLACKBOARD_NODE = 53;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE__UID = SYNC_ACTION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE__NAME = SYNC_ACTION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE__NODE_TYPE = SYNC_ACTION_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE__ANY_ATTRIBUTE = SYNC_ACTION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE__NODE_STATUS = SYNC_ACTION_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE__PARAMETERS = SYNC_ACTION_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Satisfices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE__SATISFICES = SYNC_ACTION_NODE__SATISFICES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE__SATISFIES = SYNC_ACTION_NODE__SATISFIES;

	/**
	 * The number of structural features of the '<em>Unset Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE_FEATURE_COUNT = SYNC_ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unset Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_BLACKBOARD_NODE_OPERATION_COUNT = SYNC_ACTION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.NodeType
	 * @see btcpp.impl.BtcppPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 55;

	/**
	 * The meta object id for the '{@link btcpp.NodeStatus <em>Node Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.NodeStatus
	 * @see btcpp.impl.BtcppPackageImpl#getNodeStatus()
	 * @generated
	 */
	int NODE_STATUS = 56;


	/**
	 * Returns the meta object for class '{@link btcpp.BehaviorTree <em>Behavior Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Tree</em>'.
	 * @see btcpp.BehaviorTree
	 * @generated
	 */
	EClass getBehaviorTree();

	/**
	 * Returns the meta object for the containment reference list '{@link btcpp.BehaviorTree#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see btcpp.BehaviorTree#getNode()
	 * @see #getBehaviorTree()
	 * @generated
	 */
	EReference getBehaviorTree_Node();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.BehaviorTree#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see btcpp.BehaviorTree#getID()
	 * @see #getBehaviorTree()
	 * @generated
	 */
	EAttribute getBehaviorTree_ID();

	/**
	 * Returns the meta object for class '{@link btcpp.TreeNode <em>Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Node</em>'.
	 * @see btcpp.TreeNode
	 * @generated
	 */
	EClass getTreeNode();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.TreeNode#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see btcpp.TreeNode#getUID()
	 * @see #getTreeNode()
	 * @generated
	 */
	EAttribute getTreeNode_UID();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.TreeNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see btcpp.TreeNode#getName()
	 * @see #getTreeNode()
	 * @generated
	 */
	EAttribute getTreeNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.TreeNode#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see btcpp.TreeNode#getNodeType()
	 * @see #getTreeNode()
	 * @generated
	 */
	EAttribute getTreeNode_NodeType();

	/**
	 * Returns the meta object for the attribute list '{@link btcpp.TreeNode#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see btcpp.TreeNode#getAnyAttribute()
	 * @see #getTreeNode()
	 * @generated
	 */
	EAttribute getTreeNode_AnyAttribute();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.TreeNode#getNodeStatus <em>Node Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Status</em>'.
	 * @see btcpp.TreeNode#getNodeStatus()
	 * @see #getTreeNode()
	 * @generated
	 */
	EAttribute getTreeNode_NodeStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link btcpp.TreeNode#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see btcpp.TreeNode#getParameters()
	 * @see #getTreeNode()
	 * @generated
	 */
	EReference getTreeNode_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link btcpp.TreeNode#getSatisfices <em>Satisfices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfices</em>'.
	 * @see btcpp.TreeNode#getSatisfices()
	 * @see #getTreeNode()
	 * @generated
	 */
	EReference getTreeNode_Satisfices();

	/**
	 * Returns the meta object for the reference list '{@link btcpp.TreeNode#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfies</em>'.
	 * @see btcpp.TreeNode#getSatisfies()
	 * @see #getTreeNode()
	 * @generated
	 */
	EReference getTreeNode_Satisfies();

	/**
	 * Returns the meta object for class '{@link btcpp.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see btcpp.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for the containment reference list '{@link btcpp.ControlNode#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see btcpp.ControlNode#getChild()
	 * @see #getControlNode()
	 * @generated
	 */
	EReference getControlNode_Child();

	/**
	 * Returns the meta object for class '{@link btcpp.DecoratorNode <em>Decorator Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorator Node</em>'.
	 * @see btcpp.DecoratorNode
	 * @generated
	 */
	EClass getDecoratorNode();

	/**
	 * Returns the meta object for the containment reference '{@link btcpp.DecoratorNode#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see btcpp.DecoratorNode#getChild()
	 * @see #getDecoratorNode()
	 * @generated
	 */
	EReference getDecoratorNode_Child();

	/**
	 * Returns the meta object for class '{@link btcpp.AlwaysFailureNode <em>Always Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always Failure Node</em>'.
	 * @see btcpp.AlwaysFailureNode
	 * @generated
	 */
	EClass getAlwaysFailureNode();

	/**
	 * Returns the meta object for class '{@link btcpp.AlwaysSuccessNode <em>Always Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always Success Node</em>'.
	 * @see btcpp.AlwaysSuccessNode
	 * @generated
	 */
	EClass getAlwaysSuccessNode();

	/**
	 * Returns the meta object for class '{@link btcpp.SetBlackboardNode <em>Set Blackboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Blackboard Node</em>'.
	 * @see btcpp.SetBlackboardNode
	 * @generated
	 */
	EClass getSetBlackboardNode();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.SetBlackboardNode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see btcpp.SetBlackboardNode#getValue()
	 * @see #getSetBlackboardNode()
	 * @generated
	 */
	EAttribute getSetBlackboardNode_Value();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.SetBlackboardNode#getOutput_key <em>Output key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output key</em>'.
	 * @see btcpp.SetBlackboardNode#getOutput_key()
	 * @see #getSetBlackboardNode()
	 * @generated
	 */
	EAttribute getSetBlackboardNode_Output_key();

	/**
	 * Returns the meta object for class '{@link btcpp.SelectorNode <em>Selector Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector Node</em>'.
	 * @see btcpp.SelectorNode
	 * @generated
	 */
	EClass getSelectorNode();

	/**
	 * Returns the meta object for class '{@link btcpp.IfThenElseNode <em>If Then Else Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else Node</em>'.
	 * @see btcpp.IfThenElseNode
	 * @generated
	 */
	EClass getIfThenElseNode();

	/**
	 * Returns the meta object for class '{@link btcpp.ManualSelectorNode <em>Manual Selector Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Selector Node</em>'.
	 * @see btcpp.ManualSelectorNode
	 * @generated
	 */
	EClass getManualSelectorNode();

	/**
	 * Returns the meta object for class '{@link btcpp.ParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Node</em>'.
	 * @see btcpp.ParallelNode
	 * @generated
	 */
	EClass getParallelNode();

	/**
	 * Returns the meta object for class '{@link btcpp.SequenceWithMemory <em>Sequence With Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence With Memory</em>'.
	 * @see btcpp.SequenceWithMemory
	 * @generated
	 */
	EClass getSequenceWithMemory();

	/**
	 * Returns the meta object for class '{@link btcpp.SwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Node</em>'.
	 * @see btcpp.SwitchNode
	 * @generated
	 */
	EClass getSwitchNode();

	/**
	 * Returns the meta object for class '{@link btcpp.ReactiveSelector <em>Reactive Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Selector</em>'.
	 * @see btcpp.ReactiveSelector
	 * @generated
	 */
	EClass getReactiveSelector();

	/**
	 * Returns the meta object for class '{@link btcpp.WhileDoElseNode <em>While Do Else Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Do Else Node</em>'.
	 * @see btcpp.WhileDoElseNode
	 * @generated
	 */
	EClass getWhileDoElseNode();

	/**
	 * Returns the meta object for class '{@link btcpp.ReactiveSequence <em>Reactive Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Sequence</em>'.
	 * @see btcpp.ReactiveSequence
	 * @generated
	 */
	EClass getReactiveSequence();

	/**
	 * Returns the meta object for class '{@link btcpp.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Node</em>'.
	 * @see btcpp.SequenceNode
	 * @generated
	 */
	EClass getSequenceNode();

	/**
	 * Returns the meta object for class '{@link btcpp.TimeoutNode <em>Timeout Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout Node</em>'.
	 * @see btcpp.TimeoutNode
	 * @generated
	 */
	EClass getTimeoutNode();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.TimeoutNode#getMsec <em>Msec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msec</em>'.
	 * @see btcpp.TimeoutNode#getMsec()
	 * @see #getTimeoutNode()
	 * @generated
	 */
	EAttribute getTimeoutNode_Msec();

	/**
	 * Returns the meta object for class '{@link btcpp.KeepRunningUntilFailureNode <em>Keep Running Until Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keep Running Until Failure Node</em>'.
	 * @see btcpp.KeepRunningUntilFailureNode
	 * @generated
	 */
	EClass getKeepRunningUntilFailureNode();

	/**
	 * Returns the meta object for class '{@link btcpp.InverterNode <em>Inverter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverter Node</em>'.
	 * @see btcpp.InverterNode
	 * @generated
	 */
	EClass getInverterNode();

	/**
	 * Returns the meta object for class '{@link btcpp.ForceSuccessNode <em>Force Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force Success Node</em>'.
	 * @see btcpp.ForceSuccessNode
	 * @generated
	 */
	EClass getForceSuccessNode();

	/**
	 * Returns the meta object for class '{@link btcpp.ForceFailureNode <em>Force Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force Failure Node</em>'.
	 * @see btcpp.ForceFailureNode
	 * @generated
	 */
	EClass getForceFailureNode();

	/**
	 * Returns the meta object for class '{@link btcpp.RepeatNode <em>Repeat Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Node</em>'.
	 * @see btcpp.RepeatNode
	 * @generated
	 */
	EClass getRepeatNode();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.RepeatNode#getNum_cycles <em>Num cycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num cycles</em>'.
	 * @see btcpp.RepeatNode#getNum_cycles()
	 * @see #getRepeatNode()
	 * @generated
	 */
	EAttribute getRepeatNode_Num_cycles();

	/**
	 * Returns the meta object for class '{@link btcpp.ConditionNode <em>Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Node</em>'.
	 * @see btcpp.ConditionNode
	 * @generated
	 */
	EClass getConditionNode();

	/**
	 * Returns the meta object for class '{@link btcpp.SubTree <em>Sub Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Tree</em>'.
	 * @see btcpp.SubTree
	 * @generated
	 */
	EClass getSubTree();

	/**
	 * Returns the meta object for the containment reference list '{@link btcpp.SubTree#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see btcpp.SubTree#getChild()
	 * @see #getSubTree()
	 * @generated
	 */
	EReference getSubTree_Child();

	/**
	 * Returns the meta object for class '{@link btcpp.LeafNode <em>Leaf Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Node</em>'.
	 * @see btcpp.LeafNode
	 * @generated
	 */
	EClass getLeafNode();

	/**
	 * Returns the meta object for class '{@link btcpp.ActionNodeBase <em>Action Node Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Node Base</em>'.
	 * @see btcpp.ActionNodeBase
	 * @generated
	 */
	EClass getActionNodeBase();

	/**
	 * Returns the meta object for class '{@link btcpp.ScriptNode <em>Script Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Node</em>'.
	 * @see btcpp.ScriptNode
	 * @generated
	 */
	EClass getScriptNode();

	/**
	 * Returns the meta object for class '{@link btcpp.ScriptConditionNode <em>Script Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Condition Node</em>'.
	 * @see btcpp.ScriptConditionNode
	 * @generated
	 */
	EClass getScriptConditionNode();

	/**
	 * Returns the meta object for class '{@link btcpp.RetryNode <em>Retry Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry Node</em>'.
	 * @see btcpp.RetryNode
	 * @generated
	 */
	EClass getRetryNode();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.RetryNode#getNum_attempts <em>Num attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num attempts</em>'.
	 * @see btcpp.RetryNode#getNum_attempts()
	 * @see #getRetryNode()
	 * @generated
	 */
	EAttribute getRetryNode_Num_attempts();

	/**
	 * Returns the meta object for class '{@link btcpp.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see btcpp.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link btcpp.Root#getBehaviortrees <em>Behaviortrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviortrees</em>'.
	 * @see btcpp.Root#getBehaviortrees()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Behaviortrees();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.Root#getMain_tree_to_execute <em>Main tree to execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main tree to execute</em>'.
	 * @see btcpp.Root#getMain_tree_to_execute()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_Main_tree_to_execute();

	/**
	 * Returns the meta object for class '{@link btcpp.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see btcpp.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.Parameter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see btcpp.Parameter#getKey()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Key();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see btcpp.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link btcpp.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Requirement</em>'.
	 * @see btcpp.QualityRequirement
	 * @generated
	 */
	EClass getQualityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.QualityRequirement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see btcpp.QualityRequirement#getID()
	 * @see #getQualityRequirement()
	 * @generated
	 */
	EAttribute getQualityRequirement_ID();

	/**
	 * Returns the meta object for class '{@link btcpp.Quality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality</em>'.
	 * @see btcpp.Quality
	 * @generated
	 */
	EClass getQuality();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.Quality#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see btcpp.Quality#getID()
	 * @see #getQuality()
	 * @generated
	 */
	EAttribute getQuality_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link btcpp.Quality#getQualityreq <em>Qualityreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualityreq</em>'.
	 * @see btcpp.Quality#getQualityreq()
	 * @see #getQuality()
	 * @generated
	 */
	EReference getQuality_Qualityreq();

	/**
	 * Returns the meta object for class '{@link btcpp.SelectorWithMemory <em>Selector With Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector With Memory</em>'.
	 * @see btcpp.SelectorWithMemory
	 * @generated
	 */
	EClass getSelectorWithMemory();

	/**
	 * Returns the meta object for class '{@link btcpp.ParallelAllNode <em>Parallel All Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel All Node</em>'.
	 * @see btcpp.ParallelAllNode
	 * @generated
	 */
	EClass getParallelAllNode();

	/**
	 * Returns the meta object for class '{@link btcpp.DelayNode <em>Delay Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Node</em>'.
	 * @see btcpp.DelayNode
	 * @generated
	 */
	EClass getDelayNode();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.DelayNode#getDelay_msec <em>Delay msec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay msec</em>'.
	 * @see btcpp.DelayNode#getDelay_msec()
	 * @see #getDelayNode()
	 * @generated
	 */
	EAttribute getDelayNode_Delay_msec();

	/**
	 * Returns the meta object for class '{@link btcpp.PreconditionNode <em>Precondition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition Node</em>'.
	 * @see btcpp.PreconditionNode
	 * @generated
	 */
	EClass getPreconditionNode();

	/**
	 * Returns the meta object for class '{@link btcpp.EntryUpdatedDecoratorNode <em>Entry Updated Decorator Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Updated Decorator Node</em>'.
	 * @see btcpp.EntryUpdatedDecoratorNode
	 * @generated
	 */
	EClass getEntryUpdatedDecoratorNode();

	/**
	 * Returns the meta object for class '{@link btcpp.RunOnceNode <em>Run Once Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Once Node</em>'.
	 * @see btcpp.RunOnceNode
	 * @generated
	 */
	EClass getRunOnceNode();

	/**
	 * Returns the meta object for class '{@link btcpp.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Node</em>'.
	 * @see btcpp.LoopNode
	 * @generated
	 */
	EClass getLoopNode();

	/**
	 * Returns the meta object for class '{@link btcpp.ConsumeQueueNode <em>Consume Queue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consume Queue Node</em>'.
	 * @see btcpp.ConsumeQueueNode
	 * @generated
	 */
	EClass getConsumeQueueNode();

	/**
	 * Returns the meta object for class '{@link btcpp.CountNode <em>Count Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Node</em>'.
	 * @see btcpp.CountNode
	 * @generated
	 */
	EClass getCountNode();

	/**
	 * Returns the meta object for class '{@link btcpp.EternalGuardNode <em>Eternal Guard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eternal Guard Node</em>'.
	 * @see btcpp.EternalGuardNode
	 * @generated
	 */
	EClass getEternalGuardNode();

	/**
	 * Returns the meta object for class '{@link btcpp.StatusToBlackboardNode <em>Status To Blackboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status To Blackboard Node</em>'.
	 * @see btcpp.StatusToBlackboardNode
	 * @generated
	 */
	EClass getStatusToBlackboardNode();

	/**
	 * Returns the meta object for class '{@link btcpp.FailureIsRunningNode <em>Failure Is Running Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Is Running Node</em>'.
	 * @see btcpp.FailureIsRunningNode
	 * @generated
	 */
	EClass getFailureIsRunningNode();

	/**
	 * Returns the meta object for class '{@link btcpp.FailureIsSuccessNode <em>Failure Is Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure Is Success Node</em>'.
	 * @see btcpp.FailureIsSuccessNode
	 * @generated
	 */
	EClass getFailureIsSuccessNode();

	/**
	 * Returns the meta object for class '{@link btcpp.RunningIsFailureNode <em>Running Is Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Running Is Failure Node</em>'.
	 * @see btcpp.RunningIsFailureNode
	 * @generated
	 */
	EClass getRunningIsFailureNode();

	/**
	 * Returns the meta object for class '{@link btcpp.RunningIsSuccessNode <em>Running Is Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Running Is Success Node</em>'.
	 * @see btcpp.RunningIsSuccessNode
	 * @generated
	 */
	EClass getRunningIsSuccessNode();

	/**
	 * Returns the meta object for class '{@link btcpp.SuccessIsFailureNode <em>Success Is Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Is Failure Node</em>'.
	 * @see btcpp.SuccessIsFailureNode
	 * @generated
	 */
	EClass getSuccessIsFailureNode();

	/**
	 * Returns the meta object for class '{@link btcpp.SuccessIsRunningNode <em>Success Is Running Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Is Running Node</em>'.
	 * @see btcpp.SuccessIsRunningNode
	 * @generated
	 */
	EClass getSuccessIsRunningNode();

	/**
	 * Returns the meta object for class '{@link btcpp.TestNode <em>Test Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Node</em>'.
	 * @see btcpp.TestNode
	 * @generated
	 */
	EClass getTestNode();

	/**
	 * Returns the meta object for class '{@link btcpp.EntryUpdatedActionNode <em>Entry Updated Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Updated Action Node</em>'.
	 * @see btcpp.EntryUpdatedActionNode
	 * @generated
	 */
	EClass getEntryUpdatedActionNode();

	/**
	 * Returns the meta object for class '{@link btcpp.UnsetBlackboardNode <em>Unset Blackboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unset Blackboard Node</em>'.
	 * @see btcpp.UnsetBlackboardNode
	 * @generated
	 */
	EClass getUnsetBlackboardNode();

	/**
	 * Returns the meta object for class '{@link btcpp.SyncActionNode <em>Sync Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Action Node</em>'.
	 * @see btcpp.SyncActionNode
	 * @generated
	 */
	EClass getSyncActionNode();

	/**
	 * Returns the meta object for enum '{@link btcpp.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see btcpp.NodeType
	 * @generated
	 */
	EEnum getNodeType();

	/**
	 * Returns the meta object for enum '{@link btcpp.NodeStatus <em>Node Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Status</em>'.
	 * @see btcpp.NodeStatus
	 * @generated
	 */
	EEnum getNodeStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BtcppFactory getBtcppFactory();

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
		 * The meta object literal for the '{@link btcpp.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.BehaviorTreeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getBehaviorTree()
		 * @generated
		 */
		EClass BEHAVIOR_TREE = eINSTANCE.getBehaviorTree();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_TREE__NODE = eINSTANCE.getBehaviorTree_Node();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_TREE__ID = eINSTANCE.getBehaviorTree_ID();

		/**
		 * The meta object literal for the '{@link btcpp.impl.TreeNodeImpl <em>Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.TreeNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getTreeNode()
		 * @generated
		 */
		EClass TREE_NODE = eINSTANCE.getTreeNode();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE__UID = eINSTANCE.getTreeNode_UID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE__NAME = eINSTANCE.getTreeNode_Name();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE__NODE_TYPE = eINSTANCE.getTreeNode_NodeType();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE__ANY_ATTRIBUTE = eINSTANCE.getTreeNode_AnyAttribute();

		/**
		 * The meta object literal for the '<em><b>Node Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE__NODE_STATUS = eINSTANCE.getTreeNode_NodeStatus();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE__PARAMETERS = eINSTANCE.getTreeNode_Parameters();

		/**
		 * The meta object literal for the '<em><b>Satisfices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE__SATISFICES = eINSTANCE.getTreeNode_Satisfices();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE__SATISFIES = eINSTANCE.getTreeNode_Satisfies();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ControlNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_NODE__CHILD = eINSTANCE.getControlNode_Child();

		/**
		 * The meta object literal for the '{@link btcpp.impl.DecoratorNodeImpl <em>Decorator Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.DecoratorNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getDecoratorNode()
		 * @generated
		 */
		EClass DECORATOR_NODE = eINSTANCE.getDecoratorNode();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_NODE__CHILD = eINSTANCE.getDecoratorNode_Child();

		/**
		 * The meta object literal for the '{@link btcpp.impl.AlwaysFailureNodeImpl <em>Always Failure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.AlwaysFailureNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getAlwaysFailureNode()
		 * @generated
		 */
		EClass ALWAYS_FAILURE_NODE = eINSTANCE.getAlwaysFailureNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.AlwaysSuccessNodeImpl <em>Always Success Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.AlwaysSuccessNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getAlwaysSuccessNode()
		 * @generated
		 */
		EClass ALWAYS_SUCCESS_NODE = eINSTANCE.getAlwaysSuccessNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SetBlackboardNodeImpl <em>Set Blackboard Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SetBlackboardNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSetBlackboardNode()
		 * @generated
		 */
		EClass SET_BLACKBOARD_NODE = eINSTANCE.getSetBlackboardNode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_BLACKBOARD_NODE__VALUE = eINSTANCE.getSetBlackboardNode_Value();

		/**
		 * The meta object literal for the '<em><b>Output key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_BLACKBOARD_NODE__OUTPUT_KEY = eINSTANCE.getSetBlackboardNode_Output_key();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SelectorNodeImpl <em>Selector Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SelectorNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSelectorNode()
		 * @generated
		 */
		EClass SELECTOR_NODE = eINSTANCE.getSelectorNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.IfThenElseNodeImpl <em>If Then Else Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.IfThenElseNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getIfThenElseNode()
		 * @generated
		 */
		EClass IF_THEN_ELSE_NODE = eINSTANCE.getIfThenElseNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ManualSelectorNodeImpl <em>Manual Selector Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ManualSelectorNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getManualSelectorNode()
		 * @generated
		 */
		EClass MANUAL_SELECTOR_NODE = eINSTANCE.getManualSelectorNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ParallelNodeImpl <em>Parallel Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ParallelNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getParallelNode()
		 * @generated
		 */
		EClass PARALLEL_NODE = eINSTANCE.getParallelNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SequenceWithMemoryImpl <em>Sequence With Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SequenceWithMemoryImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSequenceWithMemory()
		 * @generated
		 */
		EClass SEQUENCE_WITH_MEMORY = eINSTANCE.getSequenceWithMemory();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SwitchNodeImpl <em>Switch Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SwitchNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSwitchNode()
		 * @generated
		 */
		EClass SWITCH_NODE = eINSTANCE.getSwitchNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ReactiveSelectorImpl <em>Reactive Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ReactiveSelectorImpl
		 * @see btcpp.impl.BtcppPackageImpl#getReactiveSelector()
		 * @generated
		 */
		EClass REACTIVE_SELECTOR = eINSTANCE.getReactiveSelector();

		/**
		 * The meta object literal for the '{@link btcpp.impl.WhileDoElseNodeImpl <em>While Do Else Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.WhileDoElseNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getWhileDoElseNode()
		 * @generated
		 */
		EClass WHILE_DO_ELSE_NODE = eINSTANCE.getWhileDoElseNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ReactiveSequenceImpl <em>Reactive Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ReactiveSequenceImpl
		 * @see btcpp.impl.BtcppPackageImpl#getReactiveSequence()
		 * @generated
		 */
		EClass REACTIVE_SEQUENCE = eINSTANCE.getReactiveSequence();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SequenceNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSequenceNode()
		 * @generated
		 */
		EClass SEQUENCE_NODE = eINSTANCE.getSequenceNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.TimeoutNodeImpl <em>Timeout Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.TimeoutNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getTimeoutNode()
		 * @generated
		 */
		EClass TIMEOUT_NODE = eINSTANCE.getTimeoutNode();

		/**
		 * The meta object literal for the '<em><b>Msec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEOUT_NODE__MSEC = eINSTANCE.getTimeoutNode_Msec();

		/**
		 * The meta object literal for the '{@link btcpp.impl.KeepRunningUntilFailureNodeImpl <em>Keep Running Until Failure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.KeepRunningUntilFailureNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getKeepRunningUntilFailureNode()
		 * @generated
		 */
		EClass KEEP_RUNNING_UNTIL_FAILURE_NODE = eINSTANCE.getKeepRunningUntilFailureNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.InverterNodeImpl <em>Inverter Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.InverterNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getInverterNode()
		 * @generated
		 */
		EClass INVERTER_NODE = eINSTANCE.getInverterNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ForceSuccessNodeImpl <em>Force Success Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ForceSuccessNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getForceSuccessNode()
		 * @generated
		 */
		EClass FORCE_SUCCESS_NODE = eINSTANCE.getForceSuccessNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ForceFailureNodeImpl <em>Force Failure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ForceFailureNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getForceFailureNode()
		 * @generated
		 */
		EClass FORCE_FAILURE_NODE = eINSTANCE.getForceFailureNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.RepeatNodeImpl <em>Repeat Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.RepeatNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getRepeatNode()
		 * @generated
		 */
		EClass REPEAT_NODE = eINSTANCE.getRepeatNode();

		/**
		 * The meta object literal for the '<em><b>Num cycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT_NODE__NUM_CYCLES = eINSTANCE.getRepeatNode_Num_cycles();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ConditionNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getConditionNode()
		 * @generated
		 */
		EClass CONDITION_NODE = eINSTANCE.getConditionNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SubTreeImpl <em>Sub Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SubTreeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSubTree()
		 * @generated
		 */
		EClass SUB_TREE = eINSTANCE.getSubTree();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TREE__CHILD = eINSTANCE.getSubTree_Child();

		/**
		 * The meta object literal for the '{@link btcpp.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.LeafNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getLeafNode()
		 * @generated
		 */
		EClass LEAF_NODE = eINSTANCE.getLeafNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ActionNodeBaseImpl <em>Action Node Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ActionNodeBaseImpl
		 * @see btcpp.impl.BtcppPackageImpl#getActionNodeBase()
		 * @generated
		 */
		EClass ACTION_NODE_BASE = eINSTANCE.getActionNodeBase();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ScriptNodeImpl <em>Script Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ScriptNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getScriptNode()
		 * @generated
		 */
		EClass SCRIPT_NODE = eINSTANCE.getScriptNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ScriptConditionNodeImpl <em>Script Condition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ScriptConditionNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getScriptConditionNode()
		 * @generated
		 */
		EClass SCRIPT_CONDITION_NODE = eINSTANCE.getScriptConditionNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.RetryNodeImpl <em>Retry Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.RetryNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getRetryNode()
		 * @generated
		 */
		EClass RETRY_NODE = eINSTANCE.getRetryNode();

		/**
		 * The meta object literal for the '<em><b>Num attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETRY_NODE__NUM_ATTEMPTS = eINSTANCE.getRetryNode_Num_attempts();

		/**
		 * The meta object literal for the '{@link btcpp.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.RootImpl
		 * @see btcpp.impl.BtcppPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Behaviortrees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__BEHAVIORTREES = eINSTANCE.getRoot_Behaviortrees();

		/**
		 * The meta object literal for the '<em><b>Main tree to execute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__MAIN_TREE_TO_EXECUTE = eINSTANCE.getRoot_Main_tree_to_execute();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ParameterImpl
		 * @see btcpp.impl.BtcppPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__KEY = eINSTANCE.getParameter_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link btcpp.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.QualityRequirementImpl
		 * @see btcpp.impl.BtcppPackageImpl#getQualityRequirement()
		 * @generated
		 */
		EClass QUALITY_REQUIREMENT = eINSTANCE.getQualityRequirement();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_REQUIREMENT__ID = eINSTANCE.getQualityRequirement_ID();

		/**
		 * The meta object literal for the '{@link btcpp.impl.QualityImpl <em>Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.QualityImpl
		 * @see btcpp.impl.BtcppPackageImpl#getQuality()
		 * @generated
		 */
		EClass QUALITY = eINSTANCE.getQuality();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY__ID = eINSTANCE.getQuality_ID();

		/**
		 * The meta object literal for the '<em><b>Qualityreq</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY__QUALITYREQ = eINSTANCE.getQuality_Qualityreq();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SelectorWithMemoryImpl <em>Selector With Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SelectorWithMemoryImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSelectorWithMemory()
		 * @generated
		 */
		EClass SELECTOR_WITH_MEMORY = eINSTANCE.getSelectorWithMemory();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ParallelAllNodeImpl <em>Parallel All Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ParallelAllNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getParallelAllNode()
		 * @generated
		 */
		EClass PARALLEL_ALL_NODE = eINSTANCE.getParallelAllNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.DelayNodeImpl <em>Delay Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.DelayNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getDelayNode()
		 * @generated
		 */
		EClass DELAY_NODE = eINSTANCE.getDelayNode();

		/**
		 * The meta object literal for the '<em><b>Delay msec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY_NODE__DELAY_MSEC = eINSTANCE.getDelayNode_Delay_msec();

		/**
		 * The meta object literal for the '{@link btcpp.impl.PreconditionNodeImpl <em>Precondition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.PreconditionNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getPreconditionNode()
		 * @generated
		 */
		EClass PRECONDITION_NODE = eINSTANCE.getPreconditionNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.EntryUpdatedDecoratorNodeImpl <em>Entry Updated Decorator Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.EntryUpdatedDecoratorNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getEntryUpdatedDecoratorNode()
		 * @generated
		 */
		EClass ENTRY_UPDATED_DECORATOR_NODE = eINSTANCE.getEntryUpdatedDecoratorNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.RunOnceNodeImpl <em>Run Once Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.RunOnceNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getRunOnceNode()
		 * @generated
		 */
		EClass RUN_ONCE_NODE = eINSTANCE.getRunOnceNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.LoopNodeImpl <em>Loop Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.LoopNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getLoopNode()
		 * @generated
		 */
		EClass LOOP_NODE = eINSTANCE.getLoopNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.ConsumeQueueNodeImpl <em>Consume Queue Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ConsumeQueueNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getConsumeQueueNode()
		 * @generated
		 */
		EClass CONSUME_QUEUE_NODE = eINSTANCE.getConsumeQueueNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.CountNodeImpl <em>Count Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.CountNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getCountNode()
		 * @generated
		 */
		EClass COUNT_NODE = eINSTANCE.getCountNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.EternalGuardNodeImpl <em>Eternal Guard Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.EternalGuardNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getEternalGuardNode()
		 * @generated
		 */
		EClass ETERNAL_GUARD_NODE = eINSTANCE.getEternalGuardNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.StatusToBlackboardNodeImpl <em>Status To Blackboard Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.StatusToBlackboardNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getStatusToBlackboardNode()
		 * @generated
		 */
		EClass STATUS_TO_BLACKBOARD_NODE = eINSTANCE.getStatusToBlackboardNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.FailureIsRunningNodeImpl <em>Failure Is Running Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.FailureIsRunningNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getFailureIsRunningNode()
		 * @generated
		 */
		EClass FAILURE_IS_RUNNING_NODE = eINSTANCE.getFailureIsRunningNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.FailureIsSuccessNodeImpl <em>Failure Is Success Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.FailureIsSuccessNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getFailureIsSuccessNode()
		 * @generated
		 */
		EClass FAILURE_IS_SUCCESS_NODE = eINSTANCE.getFailureIsSuccessNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.RunningIsFailureNodeImpl <em>Running Is Failure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.RunningIsFailureNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getRunningIsFailureNode()
		 * @generated
		 */
		EClass RUNNING_IS_FAILURE_NODE = eINSTANCE.getRunningIsFailureNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.RunningIsSuccessNodeImpl <em>Running Is Success Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.RunningIsSuccessNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getRunningIsSuccessNode()
		 * @generated
		 */
		EClass RUNNING_IS_SUCCESS_NODE = eINSTANCE.getRunningIsSuccessNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SuccessIsFailureNodeImpl <em>Success Is Failure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SuccessIsFailureNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSuccessIsFailureNode()
		 * @generated
		 */
		EClass SUCCESS_IS_FAILURE_NODE = eINSTANCE.getSuccessIsFailureNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SuccessIsRunningNodeImpl <em>Success Is Running Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SuccessIsRunningNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSuccessIsRunningNode()
		 * @generated
		 */
		EClass SUCCESS_IS_RUNNING_NODE = eINSTANCE.getSuccessIsRunningNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.TestNodeImpl <em>Test Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.TestNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getTestNode()
		 * @generated
		 */
		EClass TEST_NODE = eINSTANCE.getTestNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.EntryUpdatedActionNodeImpl <em>Entry Updated Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.EntryUpdatedActionNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getEntryUpdatedActionNode()
		 * @generated
		 */
		EClass ENTRY_UPDATED_ACTION_NODE = eINSTANCE.getEntryUpdatedActionNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.UnsetBlackboardNodeImpl <em>Unset Blackboard Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.UnsetBlackboardNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getUnsetBlackboardNode()
		 * @generated
		 */
		EClass UNSET_BLACKBOARD_NODE = eINSTANCE.getUnsetBlackboardNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SyncActionNodeImpl <em>Sync Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SyncActionNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSyncActionNode()
		 * @generated
		 */
		EClass SYNC_ACTION_NODE = eINSTANCE.getSyncActionNode();

		/**
		 * The meta object literal for the '{@link btcpp.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.NodeType
		 * @see btcpp.impl.BtcppPackageImpl#getNodeType()
		 * @generated
		 */
		EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link btcpp.NodeStatus <em>Node Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.NodeStatus
		 * @see btcpp.impl.BtcppPackageImpl#getNodeStatus()
		 * @generated
		 */
		EEnum NODE_STATUS = eINSTANCE.getNodeStatus();

	}

} //BtcppPackage
