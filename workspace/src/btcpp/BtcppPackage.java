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
	 * The number of structural features of the '<em>Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_FEATURE_COUNT = 6;

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
	int LEAF_NODE = 28;

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
	int ACTION_NODE_BASE = 29;

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
	int ALWAYS_FAILURE_NODE__UID = ACTION_NODE_BASE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__NAME = ACTION_NODE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__NODE_TYPE = ACTION_NODE_BASE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__ANY_ATTRIBUTE = ACTION_NODE_BASE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__NODE_STATUS = ACTION_NODE_BASE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__PARAMETERS = ACTION_NODE_BASE__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Always Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE_FEATURE_COUNT = ACTION_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Always Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE_OPERATION_COUNT = ACTION_NODE_BASE_OPERATION_COUNT + 0;

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
	int ALWAYS_SUCCESS_NODE__UID = ACTION_NODE_BASE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__NAME = ACTION_NODE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__NODE_TYPE = ACTION_NODE_BASE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__ANY_ATTRIBUTE = ACTION_NODE_BASE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__NODE_STATUS = ACTION_NODE_BASE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__PARAMETERS = ACTION_NODE_BASE__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Always Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE_FEATURE_COUNT = ACTION_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Always Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE_OPERATION_COUNT = ACTION_NODE_BASE_OPERATION_COUNT + 0;

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
	int SET_BLACKBOARD_NODE__UID = ACTION_NODE_BASE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__NAME = ACTION_NODE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__NODE_TYPE = ACTION_NODE_BASE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__ANY_ATTRIBUTE = ACTION_NODE_BASE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__NODE_STATUS = ACTION_NODE_BASE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__PARAMETERS = ACTION_NODE_BASE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__VALUE = ACTION_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__OUTPUT_KEY = ACTION_NODE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE_FEATURE_COUNT = ACTION_NODE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE_OPERATION_COUNT = ACTION_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.FallbackNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getFallbackNode()
	 * @generated
	 */
	int FALLBACK_NODE = 7;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Fallback Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fallback Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link btcpp.impl.MnualNodeImpl <em>Mnual Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.MnualNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getMnualNode()
	 * @generated
	 */
	int MNUAL_NODE = 9;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Mnual Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mnual Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link btcpp.impl.SequenceStarNodeImpl <em>Sequence Star Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SequenceStarNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSequenceStarNode()
	 * @generated
	 */
	int SEQUENCE_STAR_NODE = 11;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Sequence Star Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Star Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link btcpp.impl.ReactiveFallbackImpl <em>Reactive Fallback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ReactiveFallbackImpl
	 * @see btcpp.impl.BtcppPackageImpl#getReactiveFallback()
	 * @generated
	 */
	int REACTIVE_FALLBACK = 13;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__UID = CONTROL_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__NODE_TYPE = CONTROL_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__ANY_ATTRIBUTE = CONTROL_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__NODE_STATUS = CONTROL_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__PARAMETERS = CONTROL_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__CHILD = CONTROL_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Reactive Fallback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reactive Fallback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link btcpp.impl.SubtreeNodeImpl <em>Subtree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SubtreeNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSubtreeNode()
	 * @generated
	 */
	int SUBTREE_NODE = 17;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Subtree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subtree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.TimeoutNodeImpl <em>Timeout Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.TimeoutNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getTimeoutNode()
	 * @generated
	 */
	int TIMEOUT_NODE = 18;

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
	int KEEP_RUNNING_UNTIL_FAILURE_NODE = 19;

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
	 * The meta object id for the '{@link btcpp.impl.TimerQueueNodeImpl <em>Timer Queue Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.TimerQueueNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getTimerQueueNode()
	 * @generated
	 */
	int TIMER_QUEUE_NODE = 20;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Timer Queue Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timer Queue Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.InverterNodeImpl <em>Inverter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.InverterNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getInverterNode()
	 * @generated
	 */
	int INVERTER_NODE = 21;

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
	int FORCE_SUCCESS_NODE = 22;

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
	int FORCE_FAILURE_NODE = 23;

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
	int REPEAT_NODE = 24;

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
	 * The meta object id for the '{@link btcpp.impl.BlackboardPreconditionImpl <em>Blackboard Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.BlackboardPreconditionImpl
	 * @see btcpp.impl.BtcppPackageImpl#getBlackboardPrecondition()
	 * @generated
	 */
	int BLACKBOARD_PRECONDITION = 25;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__UID = DECORATOR_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__NAME = DECORATOR_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__NODE_TYPE = DECORATOR_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__ANY_ATTRIBUTE = DECORATOR_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__NODE_STATUS = DECORATOR_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__PARAMETERS = DECORATOR_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Return on mismatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__VALUE_A = DECORATOR_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__VALUE_B = DECORATOR_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Blackboard Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Blackboard Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ConditionNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getConditionNode()
	 * @generated
	 */
	int CONDITION_NODE = 26;

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
	int SUB_TREE = 27;

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
	 * The meta object id for the '{@link btcpp.impl.SimpleActionNodeImpl <em>Simple Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SimpleActionNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSimpleActionNode()
	 * @generated
	 */
	int SIMPLE_ACTION_NODE = 30;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__UID = ACTION_NODE_BASE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__NAME = ACTION_NODE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__NODE_TYPE = ACTION_NODE_BASE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__ANY_ATTRIBUTE = ACTION_NODE_BASE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__NODE_STATUS = ACTION_NODE_BASE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__PARAMETERS = ACTION_NODE_BASE__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Simple Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE_FEATURE_COUNT = ACTION_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE_OPERATION_COUNT = ACTION_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.SimpleConditionNodeImpl <em>Simple Condition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.SimpleConditionNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getSimpleConditionNode()
	 * @generated
	 */
	int SIMPLE_CONDITION_NODE = 31;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE__UID = CONDITION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE__NAME = CONDITION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE__NODE_TYPE = CONDITION_NODE__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE__ANY_ATTRIBUTE = CONDITION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE__NODE_STATUS = CONDITION_NODE__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE__PARAMETERS = CONDITION_NODE__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Simple Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE_FEATURE_COUNT = CONDITION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Condition Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE_OPERATION_COUNT = CONDITION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.RetryNodeImpl <em>Retry Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.RetryNodeImpl
	 * @see btcpp.impl.BtcppPackageImpl#getRetryNode()
	 * @generated
	 */
	int RETRY_NODE = 32;

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
	int ROOT = 33;

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
	 * The meta object id for the '{@link btcpp.impl.BlackboardCheckIntImpl <em>Blackboard Check Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.BlackboardCheckIntImpl
	 * @see btcpp.impl.BtcppPackageImpl#getBlackboardCheckInt()
	 * @generated
	 */
	int BLACKBOARD_CHECK_INT = 34;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__UID = BLACKBOARD_PRECONDITION__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__NAME = BLACKBOARD_PRECONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__NODE_TYPE = BLACKBOARD_PRECONDITION__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__ANY_ATTRIBUTE = BLACKBOARD_PRECONDITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__NODE_STATUS = BLACKBOARD_PRECONDITION__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__PARAMETERS = BLACKBOARD_PRECONDITION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__CHILD = BLACKBOARD_PRECONDITION__CHILD;

	/**
	 * The feature id for the '<em><b>Return on mismatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__RETURN_ON_MISMATCH = BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH;

	/**
	 * The feature id for the '<em><b>Value A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__VALUE_A = BLACKBOARD_PRECONDITION__VALUE_A;

	/**
	 * The feature id for the '<em><b>Value B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT__VALUE_B = BLACKBOARD_PRECONDITION__VALUE_B;

	/**
	 * The number of structural features of the '<em>Blackboard Check Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT_FEATURE_COUNT = BLACKBOARD_PRECONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blackboard Check Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_INT_OPERATION_COUNT = BLACKBOARD_PRECONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.BlackboardCheckDoubleImpl <em>Blackboard Check Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.BlackboardCheckDoubleImpl
	 * @see btcpp.impl.BtcppPackageImpl#getBlackboardCheckDouble()
	 * @generated
	 */
	int BLACKBOARD_CHECK_DOUBLE = 35;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__UID = BLACKBOARD_PRECONDITION__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__NAME = BLACKBOARD_PRECONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__NODE_TYPE = BLACKBOARD_PRECONDITION__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__ANY_ATTRIBUTE = BLACKBOARD_PRECONDITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__NODE_STATUS = BLACKBOARD_PRECONDITION__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__PARAMETERS = BLACKBOARD_PRECONDITION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__CHILD = BLACKBOARD_PRECONDITION__CHILD;

	/**
	 * The feature id for the '<em><b>Return on mismatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__RETURN_ON_MISMATCH = BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH;

	/**
	 * The feature id for the '<em><b>Value A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__VALUE_A = BLACKBOARD_PRECONDITION__VALUE_A;

	/**
	 * The feature id for the '<em><b>Value B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE__VALUE_B = BLACKBOARD_PRECONDITION__VALUE_B;

	/**
	 * The number of structural features of the '<em>Blackboard Check Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE_FEATURE_COUNT = BLACKBOARD_PRECONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blackboard Check Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_DOUBLE_OPERATION_COUNT = BLACKBOARD_PRECONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.BlackboardCheckStringImpl <em>Blackboard Check String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.BlackboardCheckStringImpl
	 * @see btcpp.impl.BtcppPackageImpl#getBlackboardCheckString()
	 * @generated
	 */
	int BLACKBOARD_CHECK_STRING = 36;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__UID = BLACKBOARD_PRECONDITION__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__NAME = BLACKBOARD_PRECONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__NODE_TYPE = BLACKBOARD_PRECONDITION__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__ANY_ATTRIBUTE = BLACKBOARD_PRECONDITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Node Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__NODE_STATUS = BLACKBOARD_PRECONDITION__NODE_STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__PARAMETERS = BLACKBOARD_PRECONDITION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__CHILD = BLACKBOARD_PRECONDITION__CHILD;

	/**
	 * The feature id for the '<em><b>Return on mismatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__RETURN_ON_MISMATCH = BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH;

	/**
	 * The feature id for the '<em><b>Value A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__VALUE_A = BLACKBOARD_PRECONDITION__VALUE_A;

	/**
	 * The feature id for the '<em><b>Value B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING__VALUE_B = BLACKBOARD_PRECONDITION__VALUE_B;

	/**
	 * The number of structural features of the '<em>Blackboard Check String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING_FEATURE_COUNT = BLACKBOARD_PRECONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blackboard Check String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_CHECK_STRING_OPERATION_COUNT = BLACKBOARD_PRECONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link btcpp.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.impl.ParameterImpl
	 * @see btcpp.impl.BtcppPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 37;

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
	 * The meta object id for the '{@link btcpp.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.NodeType
	 * @see btcpp.impl.BtcppPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 38;

	/**
	 * The meta object id for the '{@link btcpp.NodeStatus <em>Node Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see btcpp.NodeStatus
	 * @see btcpp.impl.BtcppPackageImpl#getNodeStatus()
	 * @generated
	 */
	int NODE_STATUS = 39;


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
	 * Returns the meta object for class '{@link btcpp.FallbackNode <em>Fallback Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback Node</em>'.
	 * @see btcpp.FallbackNode
	 * @generated
	 */
	EClass getFallbackNode();

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
	 * Returns the meta object for class '{@link btcpp.MnualNode <em>Mnual Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mnual Node</em>'.
	 * @see btcpp.MnualNode
	 * @generated
	 */
	EClass getMnualNode();

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
	 * Returns the meta object for class '{@link btcpp.SequenceStarNode <em>Sequence Star Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Star Node</em>'.
	 * @see btcpp.SequenceStarNode
	 * @generated
	 */
	EClass getSequenceStarNode();

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
	 * Returns the meta object for class '{@link btcpp.ReactiveFallback <em>Reactive Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Fallback</em>'.
	 * @see btcpp.ReactiveFallback
	 * @generated
	 */
	EClass getReactiveFallback();

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
	 * Returns the meta object for class '{@link btcpp.SubtreeNode <em>Subtree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtree Node</em>'.
	 * @see btcpp.SubtreeNode
	 * @generated
	 */
	EClass getSubtreeNode();

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
	 * Returns the meta object for class '{@link btcpp.TimerQueueNode <em>Timer Queue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Queue Node</em>'.
	 * @see btcpp.TimerQueueNode
	 * @generated
	 */
	EClass getTimerQueueNode();

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
	 * Returns the meta object for class '{@link btcpp.BlackboardPrecondition <em>Blackboard Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackboard Precondition</em>'.
	 * @see btcpp.BlackboardPrecondition
	 * @generated
	 */
	EClass getBlackboardPrecondition();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.BlackboardPrecondition#getReturn_on_mismatch <em>Return on mismatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return on mismatch</em>'.
	 * @see btcpp.BlackboardPrecondition#getReturn_on_mismatch()
	 * @see #getBlackboardPrecondition()
	 * @generated
	 */
	EAttribute getBlackboardPrecondition_Return_on_mismatch();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.BlackboardPrecondition#getValue_A <em>Value A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value A</em>'.
	 * @see btcpp.BlackboardPrecondition#getValue_A()
	 * @see #getBlackboardPrecondition()
	 * @generated
	 */
	EAttribute getBlackboardPrecondition_Value_A();

	/**
	 * Returns the meta object for the attribute '{@link btcpp.BlackboardPrecondition#getValue_B <em>Value B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value B</em>'.
	 * @see btcpp.BlackboardPrecondition#getValue_B()
	 * @see #getBlackboardPrecondition()
	 * @generated
	 */
	EAttribute getBlackboardPrecondition_Value_B();

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
	 * Returns the meta object for class '{@link btcpp.SimpleActionNode <em>Simple Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Action Node</em>'.
	 * @see btcpp.SimpleActionNode
	 * @generated
	 */
	EClass getSimpleActionNode();

	/**
	 * Returns the meta object for class '{@link btcpp.SimpleConditionNode <em>Simple Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Condition Node</em>'.
	 * @see btcpp.SimpleConditionNode
	 * @generated
	 */
	EClass getSimpleConditionNode();

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
	 * Returns the meta object for class '{@link btcpp.BlackboardCheckInt <em>Blackboard Check Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackboard Check Int</em>'.
	 * @see btcpp.BlackboardCheckInt
	 * @generated
	 */
	EClass getBlackboardCheckInt();

	/**
	 * Returns the meta object for class '{@link btcpp.BlackboardCheckDouble <em>Blackboard Check Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackboard Check Double</em>'.
	 * @see btcpp.BlackboardCheckDouble
	 * @generated
	 */
	EClass getBlackboardCheckDouble();

	/**
	 * Returns the meta object for class '{@link btcpp.BlackboardCheckString <em>Blackboard Check String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackboard Check String</em>'.
	 * @see btcpp.BlackboardCheckString
	 * @generated
	 */
	EClass getBlackboardCheckString();

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
		 * The meta object literal for the '{@link btcpp.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.FallbackNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getFallbackNode()
		 * @generated
		 */
		EClass FALLBACK_NODE = eINSTANCE.getFallbackNode();

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
		 * The meta object literal for the '{@link btcpp.impl.MnualNodeImpl <em>Mnual Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.MnualNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getMnualNode()
		 * @generated
		 */
		EClass MNUAL_NODE = eINSTANCE.getMnualNode();

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
		 * The meta object literal for the '{@link btcpp.impl.SequenceStarNodeImpl <em>Sequence Star Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SequenceStarNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSequenceStarNode()
		 * @generated
		 */
		EClass SEQUENCE_STAR_NODE = eINSTANCE.getSequenceStarNode();

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
		 * The meta object literal for the '{@link btcpp.impl.ReactiveFallbackImpl <em>Reactive Fallback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.ReactiveFallbackImpl
		 * @see btcpp.impl.BtcppPackageImpl#getReactiveFallback()
		 * @generated
		 */
		EClass REACTIVE_FALLBACK = eINSTANCE.getReactiveFallback();

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
		 * The meta object literal for the '{@link btcpp.impl.SubtreeNodeImpl <em>Subtree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SubtreeNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSubtreeNode()
		 * @generated
		 */
		EClass SUBTREE_NODE = eINSTANCE.getSubtreeNode();

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
		 * The meta object literal for the '{@link btcpp.impl.TimerQueueNodeImpl <em>Timer Queue Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.TimerQueueNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getTimerQueueNode()
		 * @generated
		 */
		EClass TIMER_QUEUE_NODE = eINSTANCE.getTimerQueueNode();

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
		 * The meta object literal for the '{@link btcpp.impl.BlackboardPreconditionImpl <em>Blackboard Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.BlackboardPreconditionImpl
		 * @see btcpp.impl.BtcppPackageImpl#getBlackboardPrecondition()
		 * @generated
		 */
		EClass BLACKBOARD_PRECONDITION = eINSTANCE.getBlackboardPrecondition();

		/**
		 * The meta object literal for the '<em><b>Return on mismatch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH = eINSTANCE.getBlackboardPrecondition_Return_on_mismatch();

		/**
		 * The meta object literal for the '<em><b>Value A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLACKBOARD_PRECONDITION__VALUE_A = eINSTANCE.getBlackboardPrecondition_Value_A();

		/**
		 * The meta object literal for the '<em><b>Value B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLACKBOARD_PRECONDITION__VALUE_B = eINSTANCE.getBlackboardPrecondition_Value_B();

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
		 * The meta object literal for the '{@link btcpp.impl.SimpleActionNodeImpl <em>Simple Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SimpleActionNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSimpleActionNode()
		 * @generated
		 */
		EClass SIMPLE_ACTION_NODE = eINSTANCE.getSimpleActionNode();

		/**
		 * The meta object literal for the '{@link btcpp.impl.SimpleConditionNodeImpl <em>Simple Condition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.SimpleConditionNodeImpl
		 * @see btcpp.impl.BtcppPackageImpl#getSimpleConditionNode()
		 * @generated
		 */
		EClass SIMPLE_CONDITION_NODE = eINSTANCE.getSimpleConditionNode();

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
		 * The meta object literal for the '{@link btcpp.impl.BlackboardCheckIntImpl <em>Blackboard Check Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.BlackboardCheckIntImpl
		 * @see btcpp.impl.BtcppPackageImpl#getBlackboardCheckInt()
		 * @generated
		 */
		EClass BLACKBOARD_CHECK_INT = eINSTANCE.getBlackboardCheckInt();

		/**
		 * The meta object literal for the '{@link btcpp.impl.BlackboardCheckDoubleImpl <em>Blackboard Check Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.BlackboardCheckDoubleImpl
		 * @see btcpp.impl.BtcppPackageImpl#getBlackboardCheckDouble()
		 * @generated
		 */
		EClass BLACKBOARD_CHECK_DOUBLE = eINSTANCE.getBlackboardCheckDouble();

		/**
		 * The meta object literal for the '{@link btcpp.impl.BlackboardCheckStringImpl <em>Blackboard Check String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see btcpp.impl.BlackboardCheckStringImpl
		 * @see btcpp.impl.BtcppPackageImpl#getBlackboardCheckString()
		 * @generated
		 */
		EClass BLACKBOARD_CHECK_STRING = eINSTANCE.getBlackboardCheckString();

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
