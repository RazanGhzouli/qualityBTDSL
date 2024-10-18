/**
 */
package bt.cpp.btcpp;

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
 * @see bt.cpp.btcpp.BtcppFactory
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
	BtcppPackage eINSTANCE = bt.cpp.btcpp.impl.BtcppPackageImpl.init();

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.BehaviorTreeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getBehaviorTree()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_TREE__TYPE = 1;

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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.TreeNodeImpl <em>Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.TreeNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getTreeNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__STATUS = 3;

	/**
	 * The number of structural features of the '<em>Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.ControlNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getControlNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__CONFIG = TREE_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__STATUS = TREE_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.DecoratorNodeImpl <em>Decorator Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.DecoratorNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getDecoratorNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__CONFIG = TREE_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_NODE__STATUS = TREE_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.AlwaysFailureNodeImpl <em>Always Failure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.AlwaysFailureNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getAlwaysFailureNode()
	 * @generated
	 */
	int ALWAYS_FAILURE_NODE = 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Always Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Always Failure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FAILURE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.AlwaysSuccessNodeImpl <em>Always Success Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.AlwaysSuccessNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getAlwaysSuccessNode()
	 * @generated
	 */
	int ALWAYS_SUCCESS_NODE = 5;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Always Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Always Success Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_SUCCESS_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.SetBlackboardNodeImpl <em>Set Blackboard Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.SetBlackboardNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSetBlackboardNode()
	 * @generated
	 */
	int SET_BLACKBOARD_NODE = 6;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Set Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Set Blackboard Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLACKBOARD_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.FallbackNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getFallbackNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_NODE__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.IfThenElseNodeImpl <em>If Then Else Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.IfThenElseNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getIfThenElseNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_NODE__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.MnualNodeImpl <em>Mnual Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.MnualNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getMnualNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNUAL_NODE__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.ParallelNodeImpl <em>Parallel Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.ParallelNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getParallelNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NODE__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.SequenceStarNodeImpl <em>Sequence Star Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.SequenceStarNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSequenceStarNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_NODE__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.SwitchNodeImpl <em>Switch Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.SwitchNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSwitchNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_NODE__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.ReactiveFallbackImpl <em>Reactive Fallback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.ReactiveFallbackImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getReactiveFallback()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.WhileDoElseNodeImpl <em>While Do Else Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.WhileDoElseNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getWhileDoElseNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_DO_ELSE_NODE__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.ReactiveSequenceImpl <em>Reactive Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.ReactiveSequenceImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getReactiveSequence()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.SequenceNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSequenceNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__CONFIG = CONTROL_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_NODE__STATUS = CONTROL_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.SubtreeNodeImpl <em>Subtree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.SubtreeNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSubtreeNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTREE_NODE__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.TimeoutNodeImpl <em>Timeout Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.TimeoutNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getTimeoutNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Timeout Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timeout Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.KeepRunningUntilFailureNodeImpl <em>Keep Running Until Failure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.KeepRunningUntilFailureNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getKeepRunningUntilFailureNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_RUNNING_UNTIL_FAILURE_NODE__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.TimerQueueNodeImpl <em>Timer Queue Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.TimerQueueNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getTimerQueueNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_QUEUE_NODE__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.InverterNodeImpl <em>Inverter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.InverterNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getInverterNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_NODE__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.ForceSuccessNodeImpl <em>Force Success Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.ForceSuccessNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getForceSuccessNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_NODE__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.ForceFailureNodeImpl <em>Force Failure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.ForceFailureNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getForceFailureNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_NODE__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.RepeatNodeImpl <em>Repeat Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.RepeatNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getRepeatNode()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Repeat Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Repeat Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.BlackboardPreconditionImpl <em>Blackboard Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.BlackboardPreconditionImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getBlackboardPrecondition()
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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Blackboard Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blackboard Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKBOARD_PRECONDITION_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.BlackBoardImpl <em>Black Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.BlackBoardImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getBlackBoard()
	 * @generated
	 */
	int BLACK_BOARD = 26;

	/**
	 * The number of structural features of the '<em>Black Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_BOARD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Black Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACK_BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.NodeConfigurationImpl <em>Node Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.NodeConfigurationImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getNodeConfiguration()
	 * @generated
	 */
	int NODE_CONFIGURATION = 27;

	/**
	 * The feature id for the '<em><b>Blackboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONFIGURATION__BLACKBOARD = 0;

	/**
	 * The number of structural features of the '<em>Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.LeafNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getLeafNode()
	 * @generated
	 */
	int LEAF_NODE = 30;

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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__CONFIG = TREE_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_NODE__STATUS = TREE_NODE__STATUS;

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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.ConditionNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getConditionNode()
	 * @generated
	 */
	int CONDITION_NODE = 28;

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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__CONFIG = LEAF_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_NODE__STATUS = LEAF_NODE__STATUS;

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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.SubTreeImpl <em>Sub Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.SubTreeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSubTree()
	 * @generated
	 */
	int SUB_TREE = 29;

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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__CONFIG = TREE_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__STATUS = TREE_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TREE__REFERS_TO = TREE_NODE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.ActionNodeBaseImpl <em>Action Node Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.ActionNodeBaseImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getActionNodeBase()
	 * @generated
	 */
	int ACTION_NODE_BASE = 32;

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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__CONFIG = LEAF_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_NODE_BASE__STATUS = LEAF_NODE__STATUS;

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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.SyncActionNodeImpl <em>Sync Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.SyncActionNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSyncActionNode()
	 * @generated
	 */
	int SYNC_ACTION_NODE = 31;

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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__CONFIG = ACTION_NODE_BASE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNC_ACTION_NODE__STATUS = ACTION_NODE_BASE__STATUS;

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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.AsyncActionNodeImpl <em>Async Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.AsyncActionNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getAsyncActionNode()
	 * @generated
	 */
	int ASYNC_ACTION_NODE = 33;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_ACTION_NODE__UID = ACTION_NODE_BASE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_ACTION_NODE__NAME = ACTION_NODE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_ACTION_NODE__CONFIG = ACTION_NODE_BASE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_ACTION_NODE__STATUS = ACTION_NODE_BASE__STATUS;

	/**
	 * The number of structural features of the '<em>Async Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_ACTION_NODE_FEATURE_COUNT = ACTION_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Async Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_ACTION_NODE_OPERATION_COUNT = ACTION_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.SimpleActionNodeImpl <em>Simple Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.SimpleActionNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSimpleActionNode()
	 * @generated
	 */
	int SIMPLE_ACTION_NODE = 34;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__UID = SYNC_ACTION_NODE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__NAME = SYNC_ACTION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__CONFIG = SYNC_ACTION_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE__STATUS = SYNC_ACTION_NODE__STATUS;

	/**
	 * The number of structural features of the '<em>Simple Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE_FEATURE_COUNT = SYNC_ACTION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_NODE_OPERATION_COUNT = SYNC_ACTION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.StatefulActionNodeImpl <em>Stateful Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.StatefulActionNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getStatefulActionNode()
	 * @generated
	 */
	int STATEFUL_ACTION_NODE = 35;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_ACTION_NODE__UID = ACTION_NODE_BASE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_ACTION_NODE__NAME = ACTION_NODE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_ACTION_NODE__CONFIG = ACTION_NODE_BASE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_ACTION_NODE__STATUS = ACTION_NODE_BASE__STATUS;

	/**
	 * The number of structural features of the '<em>Stateful Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_ACTION_NODE_FEATURE_COUNT = ACTION_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stateful Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFUL_ACTION_NODE_OPERATION_COUNT = ACTION_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.CoroActionNodeImpl <em>Coro Action Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.CoroActionNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getCoroActionNode()
	 * @generated
	 */
	int CORO_ACTION_NODE = 36;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORO_ACTION_NODE__UID = ACTION_NODE_BASE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORO_ACTION_NODE__NAME = ACTION_NODE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORO_ACTION_NODE__CONFIG = ACTION_NODE_BASE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORO_ACTION_NODE__STATUS = ACTION_NODE_BASE__STATUS;

	/**
	 * The number of structural features of the '<em>Coro Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORO_ACTION_NODE_FEATURE_COUNT = ACTION_NODE_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coro Action Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORO_ACTION_NODE_OPERATION_COUNT = ACTION_NODE_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.SimpleConditionNodeImpl <em>Simple Condition Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.SimpleConditionNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSimpleConditionNode()
	 * @generated
	 */
	int SIMPLE_CONDITION_NODE = 37;

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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE__CONFIG = CONDITION_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_NODE__STATUS = CONDITION_NODE__STATUS;

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
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.RetryNodeImpl <em>Retry Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.RetryNodeImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getRetryNode()
	 * @generated
	 */
	int RETRY_NODE = 38;

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
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__CONFIG = DECORATOR_NODE__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__STATUS = DECORATOR_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE__CHILD = DECORATOR_NODE__CHILD;

	/**
	 * The number of structural features of the '<em>Retry Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE_FEATURE_COUNT = DECORATOR_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Retry Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_NODE_OPERATION_COUNT = DECORATOR_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.impl.RootImpl
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 39;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ROOT = 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.NodeType
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 40;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.NodeStatus <em>Node Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.NodeStatus
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getNodeStatus()
	 * @generated
	 */
	int NODE_STATUS = 41;

	/**
	 * The meta object id for the '{@link bt.cpp.btcpp.PortDirection <em>Port Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bt.cpp.btcpp.PortDirection
	 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getPortDirection()
	 * @generated
	 */
	int PORT_DIRECTION = 42;

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.BehaviorTree <em>Behavior Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Tree</em>'.
	 * @see bt.cpp.btcpp.BehaviorTree
	 * @generated
	 */
	EClass getBehaviorTree();

	/**
	 * Returns the meta object for the containment reference list '{@link bt.cpp.btcpp.BehaviorTree#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see bt.cpp.btcpp.BehaviorTree#getNode()
	 * @see #getBehaviorTree()
	 * @generated
	 */
	EReference getBehaviorTree_Node();

	/**
	 * Returns the meta object for the attribute '{@link bt.cpp.btcpp.BehaviorTree#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bt.cpp.btcpp.BehaviorTree#getType()
	 * @see #getBehaviorTree()
	 * @generated
	 */
	EAttribute getBehaviorTree_Type();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.TreeNode <em>Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Node</em>'.
	 * @see bt.cpp.btcpp.TreeNode
	 * @generated
	 */
	EClass getTreeNode();

	/**
	 * Returns the meta object for the attribute '{@link bt.cpp.btcpp.TreeNode#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see bt.cpp.btcpp.TreeNode#getUID()
	 * @see #getTreeNode()
	 * @generated
	 */
	EAttribute getTreeNode_UID();

	/**
	 * Returns the meta object for the attribute '{@link bt.cpp.btcpp.TreeNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bt.cpp.btcpp.TreeNode#getName()
	 * @see #getTreeNode()
	 * @generated
	 */
	EAttribute getTreeNode_Name();

	/**
	 * Returns the meta object for the containment reference '{@link bt.cpp.btcpp.TreeNode#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see bt.cpp.btcpp.TreeNode#getConfig()
	 * @see #getTreeNode()
	 * @generated
	 */
	EReference getTreeNode_Config();

	/**
	 * Returns the meta object for the attribute '{@link bt.cpp.btcpp.TreeNode#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see bt.cpp.btcpp.TreeNode#getStatus()
	 * @see #getTreeNode()
	 * @generated
	 */
	EAttribute getTreeNode_Status();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see bt.cpp.btcpp.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for the reference list '{@link bt.cpp.btcpp.ControlNode#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see bt.cpp.btcpp.ControlNode#getChild()
	 * @see #getControlNode()
	 * @generated
	 */
	EReference getControlNode_Child();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.DecoratorNode <em>Decorator Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorator Node</em>'.
	 * @see bt.cpp.btcpp.DecoratorNode
	 * @generated
	 */
	EClass getDecoratorNode();

	/**
	 * Returns the meta object for the reference '{@link bt.cpp.btcpp.DecoratorNode#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see bt.cpp.btcpp.DecoratorNode#getChild()
	 * @see #getDecoratorNode()
	 * @generated
	 */
	EReference getDecoratorNode_Child();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.AlwaysFailureNode <em>Always Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always Failure Node</em>'.
	 * @see bt.cpp.btcpp.AlwaysFailureNode
	 * @generated
	 */
	EClass getAlwaysFailureNode();

	/**
	 * Returns the meta object for the reference '{@link bt.cpp.btcpp.AlwaysFailureNode#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actions</em>'.
	 * @see bt.cpp.btcpp.AlwaysFailureNode#getActions()
	 * @see #getAlwaysFailureNode()
	 * @generated
	 */
	EReference getAlwaysFailureNode_Actions();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.AlwaysSuccessNode <em>Always Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always Success Node</em>'.
	 * @see bt.cpp.btcpp.AlwaysSuccessNode
	 * @generated
	 */
	EClass getAlwaysSuccessNode();

	/**
	 * Returns the meta object for the reference '{@link bt.cpp.btcpp.AlwaysSuccessNode#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actions</em>'.
	 * @see bt.cpp.btcpp.AlwaysSuccessNode#getActions()
	 * @see #getAlwaysSuccessNode()
	 * @generated
	 */
	EReference getAlwaysSuccessNode_Actions();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.SetBlackboardNode <em>Set Blackboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Blackboard Node</em>'.
	 * @see bt.cpp.btcpp.SetBlackboardNode
	 * @generated
	 */
	EClass getSetBlackboardNode();

	/**
	 * Returns the meta object for the reference '{@link bt.cpp.btcpp.SetBlackboardNode#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actions</em>'.
	 * @see bt.cpp.btcpp.SetBlackboardNode#getActions()
	 * @see #getSetBlackboardNode()
	 * @generated
	 */
	EReference getSetBlackboardNode_Actions();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.FallbackNode <em>Fallback Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback Node</em>'.
	 * @see bt.cpp.btcpp.FallbackNode
	 * @generated
	 */
	EClass getFallbackNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.IfThenElseNode <em>If Then Else Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else Node</em>'.
	 * @see bt.cpp.btcpp.IfThenElseNode
	 * @generated
	 */
	EClass getIfThenElseNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.MnualNode <em>Mnual Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mnual Node</em>'.
	 * @see bt.cpp.btcpp.MnualNode
	 * @generated
	 */
	EClass getMnualNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.ParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Node</em>'.
	 * @see bt.cpp.btcpp.ParallelNode
	 * @generated
	 */
	EClass getParallelNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.SequenceStarNode <em>Sequence Star Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Star Node</em>'.
	 * @see bt.cpp.btcpp.SequenceStarNode
	 * @generated
	 */
	EClass getSequenceStarNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.SwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Node</em>'.
	 * @see bt.cpp.btcpp.SwitchNode
	 * @generated
	 */
	EClass getSwitchNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.ReactiveFallback <em>Reactive Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Fallback</em>'.
	 * @see bt.cpp.btcpp.ReactiveFallback
	 * @generated
	 */
	EClass getReactiveFallback();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.WhileDoElseNode <em>While Do Else Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Do Else Node</em>'.
	 * @see bt.cpp.btcpp.WhileDoElseNode
	 * @generated
	 */
	EClass getWhileDoElseNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.ReactiveSequence <em>Reactive Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Sequence</em>'.
	 * @see bt.cpp.btcpp.ReactiveSequence
	 * @generated
	 */
	EClass getReactiveSequence();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Node</em>'.
	 * @see bt.cpp.btcpp.SequenceNode
	 * @generated
	 */
	EClass getSequenceNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.SubtreeNode <em>Subtree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtree Node</em>'.
	 * @see bt.cpp.btcpp.SubtreeNode
	 * @generated
	 */
	EClass getSubtreeNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.TimeoutNode <em>Timeout Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout Node</em>'.
	 * @see bt.cpp.btcpp.TimeoutNode
	 * @generated
	 */
	EClass getTimeoutNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.KeepRunningUntilFailureNode <em>Keep Running Until Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keep Running Until Failure Node</em>'.
	 * @see bt.cpp.btcpp.KeepRunningUntilFailureNode
	 * @generated
	 */
	EClass getKeepRunningUntilFailureNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.TimerQueueNode <em>Timer Queue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Queue Node</em>'.
	 * @see bt.cpp.btcpp.TimerQueueNode
	 * @generated
	 */
	EClass getTimerQueueNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.InverterNode <em>Inverter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverter Node</em>'.
	 * @see bt.cpp.btcpp.InverterNode
	 * @generated
	 */
	EClass getInverterNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.ForceSuccessNode <em>Force Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force Success Node</em>'.
	 * @see bt.cpp.btcpp.ForceSuccessNode
	 * @generated
	 */
	EClass getForceSuccessNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.ForceFailureNode <em>Force Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force Failure Node</em>'.
	 * @see bt.cpp.btcpp.ForceFailureNode
	 * @generated
	 */
	EClass getForceFailureNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.RepeatNode <em>Repeat Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Node</em>'.
	 * @see bt.cpp.btcpp.RepeatNode
	 * @generated
	 */
	EClass getRepeatNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.BlackboardPrecondition <em>Blackboard Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackboard Precondition</em>'.
	 * @see bt.cpp.btcpp.BlackboardPrecondition
	 * @generated
	 */
	EClass getBlackboardPrecondition();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.BlackBoard <em>Black Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Black Board</em>'.
	 * @see bt.cpp.btcpp.BlackBoard
	 * @generated
	 */
	EClass getBlackBoard();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.NodeConfiguration <em>Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Configuration</em>'.
	 * @see bt.cpp.btcpp.NodeConfiguration
	 * @generated
	 */
	EClass getNodeConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link bt.cpp.btcpp.NodeConfiguration#getBlackboard <em>Blackboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blackboard</em>'.
	 * @see bt.cpp.btcpp.NodeConfiguration#getBlackboard()
	 * @see #getNodeConfiguration()
	 * @generated
	 */
	EReference getNodeConfiguration_Blackboard();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.ConditionNode <em>Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Node</em>'.
	 * @see bt.cpp.btcpp.ConditionNode
	 * @generated
	 */
	EClass getConditionNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.SubTree <em>Sub Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Tree</em>'.
	 * @see bt.cpp.btcpp.SubTree
	 * @generated
	 */
	EClass getSubTree();

	/**
	 * Returns the meta object for the reference list '{@link bt.cpp.btcpp.SubTree#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refers To</em>'.
	 * @see bt.cpp.btcpp.SubTree#getRefersTo()
	 * @see #getSubTree()
	 * @generated
	 */
	EReference getSubTree_RefersTo();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.LeafNode <em>Leaf Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Node</em>'.
	 * @see bt.cpp.btcpp.LeafNode
	 * @generated
	 */
	EClass getLeafNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.SyncActionNode <em>Sync Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sync Action Node</em>'.
	 * @see bt.cpp.btcpp.SyncActionNode
	 * @generated
	 */
	EClass getSyncActionNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.ActionNodeBase <em>Action Node Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Node Base</em>'.
	 * @see bt.cpp.btcpp.ActionNodeBase
	 * @generated
	 */
	EClass getActionNodeBase();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.AsyncActionNode <em>Async Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Async Action Node</em>'.
	 * @see bt.cpp.btcpp.AsyncActionNode
	 * @generated
	 */
	EClass getAsyncActionNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.SimpleActionNode <em>Simple Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Action Node</em>'.
	 * @see bt.cpp.btcpp.SimpleActionNode
	 * @generated
	 */
	EClass getSimpleActionNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.StatefulActionNode <em>Stateful Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateful Action Node</em>'.
	 * @see bt.cpp.btcpp.StatefulActionNode
	 * @generated
	 */
	EClass getStatefulActionNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.CoroActionNode <em>Coro Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coro Action Node</em>'.
	 * @see bt.cpp.btcpp.CoroActionNode
	 * @generated
	 */
	EClass getCoroActionNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.SimpleConditionNode <em>Simple Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Condition Node</em>'.
	 * @see bt.cpp.btcpp.SimpleConditionNode
	 * @generated
	 */
	EClass getSimpleConditionNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.RetryNode <em>Retry Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry Node</em>'.
	 * @see bt.cpp.btcpp.RetryNode
	 * @generated
	 */
	EClass getRetryNode();

	/**
	 * Returns the meta object for class '{@link bt.cpp.btcpp.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see bt.cpp.btcpp.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link bt.cpp.btcpp.Root#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see bt.cpp.btcpp.Root#getRoot()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Root();

	/**
	 * Returns the meta object for enum '{@link bt.cpp.btcpp.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see bt.cpp.btcpp.NodeType
	 * @generated
	 */
	EEnum getNodeType();

	/**
	 * Returns the meta object for enum '{@link bt.cpp.btcpp.NodeStatus <em>Node Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Status</em>'.
	 * @see bt.cpp.btcpp.NodeStatus
	 * @generated
	 */
	EEnum getNodeStatus();

	/**
	 * Returns the meta object for enum '{@link bt.cpp.btcpp.PortDirection <em>Port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction</em>'.
	 * @see bt.cpp.btcpp.PortDirection
	 * @generated
	 */
	EEnum getPortDirection();

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
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.BehaviorTreeImpl <em>Behavior Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.BehaviorTreeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getBehaviorTree()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_TREE__TYPE = eINSTANCE.getBehaviorTree_Type();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.TreeNodeImpl <em>Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.TreeNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getTreeNode()
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
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_NODE__CONFIG = eINSTANCE.getTreeNode_Config();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_NODE__STATUS = eINSTANCE.getTreeNode_Status();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.ControlNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_NODE__CHILD = eINSTANCE.getControlNode_Child();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.DecoratorNodeImpl <em>Decorator Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.DecoratorNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getDecoratorNode()
		 * @generated
		 */
		EClass DECORATOR_NODE = eINSTANCE.getDecoratorNode();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR_NODE__CHILD = eINSTANCE.getDecoratorNode_Child();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.AlwaysFailureNodeImpl <em>Always Failure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.AlwaysFailureNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getAlwaysFailureNode()
		 * @generated
		 */
		EClass ALWAYS_FAILURE_NODE = eINSTANCE.getAlwaysFailureNode();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALWAYS_FAILURE_NODE__ACTIONS = eINSTANCE.getAlwaysFailureNode_Actions();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.AlwaysSuccessNodeImpl <em>Always Success Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.AlwaysSuccessNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getAlwaysSuccessNode()
		 * @generated
		 */
		EClass ALWAYS_SUCCESS_NODE = eINSTANCE.getAlwaysSuccessNode();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALWAYS_SUCCESS_NODE__ACTIONS = eINSTANCE.getAlwaysSuccessNode_Actions();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.SetBlackboardNodeImpl <em>Set Blackboard Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.SetBlackboardNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSetBlackboardNode()
		 * @generated
		 */
		EClass SET_BLACKBOARD_NODE = eINSTANCE.getSetBlackboardNode();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_BLACKBOARD_NODE__ACTIONS = eINSTANCE.getSetBlackboardNode_Actions();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.FallbackNodeImpl <em>Fallback Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.FallbackNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getFallbackNode()
		 * @generated
		 */
		EClass FALLBACK_NODE = eINSTANCE.getFallbackNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.IfThenElseNodeImpl <em>If Then Else Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.IfThenElseNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getIfThenElseNode()
		 * @generated
		 */
		EClass IF_THEN_ELSE_NODE = eINSTANCE.getIfThenElseNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.MnualNodeImpl <em>Mnual Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.MnualNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getMnualNode()
		 * @generated
		 */
		EClass MNUAL_NODE = eINSTANCE.getMnualNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.ParallelNodeImpl <em>Parallel Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.ParallelNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getParallelNode()
		 * @generated
		 */
		EClass PARALLEL_NODE = eINSTANCE.getParallelNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.SequenceStarNodeImpl <em>Sequence Star Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.SequenceStarNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSequenceStarNode()
		 * @generated
		 */
		EClass SEQUENCE_STAR_NODE = eINSTANCE.getSequenceStarNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.SwitchNodeImpl <em>Switch Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.SwitchNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSwitchNode()
		 * @generated
		 */
		EClass SWITCH_NODE = eINSTANCE.getSwitchNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.ReactiveFallbackImpl <em>Reactive Fallback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.ReactiveFallbackImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getReactiveFallback()
		 * @generated
		 */
		EClass REACTIVE_FALLBACK = eINSTANCE.getReactiveFallback();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.WhileDoElseNodeImpl <em>While Do Else Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.WhileDoElseNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getWhileDoElseNode()
		 * @generated
		 */
		EClass WHILE_DO_ELSE_NODE = eINSTANCE.getWhileDoElseNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.ReactiveSequenceImpl <em>Reactive Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.ReactiveSequenceImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getReactiveSequence()
		 * @generated
		 */
		EClass REACTIVE_SEQUENCE = eINSTANCE.getReactiveSequence();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.SequenceNodeImpl <em>Sequence Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.SequenceNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSequenceNode()
		 * @generated
		 */
		EClass SEQUENCE_NODE = eINSTANCE.getSequenceNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.SubtreeNodeImpl <em>Subtree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.SubtreeNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSubtreeNode()
		 * @generated
		 */
		EClass SUBTREE_NODE = eINSTANCE.getSubtreeNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.TimeoutNodeImpl <em>Timeout Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.TimeoutNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getTimeoutNode()
		 * @generated
		 */
		EClass TIMEOUT_NODE = eINSTANCE.getTimeoutNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.KeepRunningUntilFailureNodeImpl <em>Keep Running Until Failure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.KeepRunningUntilFailureNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getKeepRunningUntilFailureNode()
		 * @generated
		 */
		EClass KEEP_RUNNING_UNTIL_FAILURE_NODE = eINSTANCE.getKeepRunningUntilFailureNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.TimerQueueNodeImpl <em>Timer Queue Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.TimerQueueNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getTimerQueueNode()
		 * @generated
		 */
		EClass TIMER_QUEUE_NODE = eINSTANCE.getTimerQueueNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.InverterNodeImpl <em>Inverter Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.InverterNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getInverterNode()
		 * @generated
		 */
		EClass INVERTER_NODE = eINSTANCE.getInverterNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.ForceSuccessNodeImpl <em>Force Success Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.ForceSuccessNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getForceSuccessNode()
		 * @generated
		 */
		EClass FORCE_SUCCESS_NODE = eINSTANCE.getForceSuccessNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.ForceFailureNodeImpl <em>Force Failure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.ForceFailureNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getForceFailureNode()
		 * @generated
		 */
		EClass FORCE_FAILURE_NODE = eINSTANCE.getForceFailureNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.RepeatNodeImpl <em>Repeat Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.RepeatNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getRepeatNode()
		 * @generated
		 */
		EClass REPEAT_NODE = eINSTANCE.getRepeatNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.BlackboardPreconditionImpl <em>Blackboard Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.BlackboardPreconditionImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getBlackboardPrecondition()
		 * @generated
		 */
		EClass BLACKBOARD_PRECONDITION = eINSTANCE.getBlackboardPrecondition();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.BlackBoardImpl <em>Black Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.BlackBoardImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getBlackBoard()
		 * @generated
		 */
		EClass BLACK_BOARD = eINSTANCE.getBlackBoard();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.NodeConfigurationImpl <em>Node Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.NodeConfigurationImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getNodeConfiguration()
		 * @generated
		 */
		EClass NODE_CONFIGURATION = eINSTANCE.getNodeConfiguration();

		/**
		 * The meta object literal for the '<em><b>Blackboard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_CONFIGURATION__BLACKBOARD = eINSTANCE.getNodeConfiguration_Blackboard();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.ConditionNodeImpl <em>Condition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.ConditionNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getConditionNode()
		 * @generated
		 */
		EClass CONDITION_NODE = eINSTANCE.getConditionNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.SubTreeImpl <em>Sub Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.SubTreeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSubTree()
		 * @generated
		 */
		EClass SUB_TREE = eINSTANCE.getSubTree();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TREE__REFERS_TO = eINSTANCE.getSubTree_RefersTo();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.LeafNodeImpl <em>Leaf Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.LeafNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getLeafNode()
		 * @generated
		 */
		EClass LEAF_NODE = eINSTANCE.getLeafNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.SyncActionNodeImpl <em>Sync Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.SyncActionNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSyncActionNode()
		 * @generated
		 */
		EClass SYNC_ACTION_NODE = eINSTANCE.getSyncActionNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.ActionNodeBaseImpl <em>Action Node Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.ActionNodeBaseImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getActionNodeBase()
		 * @generated
		 */
		EClass ACTION_NODE_BASE = eINSTANCE.getActionNodeBase();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.AsyncActionNodeImpl <em>Async Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.AsyncActionNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getAsyncActionNode()
		 * @generated
		 */
		EClass ASYNC_ACTION_NODE = eINSTANCE.getAsyncActionNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.SimpleActionNodeImpl <em>Simple Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.SimpleActionNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSimpleActionNode()
		 * @generated
		 */
		EClass SIMPLE_ACTION_NODE = eINSTANCE.getSimpleActionNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.StatefulActionNodeImpl <em>Stateful Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.StatefulActionNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getStatefulActionNode()
		 * @generated
		 */
		EClass STATEFUL_ACTION_NODE = eINSTANCE.getStatefulActionNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.CoroActionNodeImpl <em>Coro Action Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.CoroActionNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getCoroActionNode()
		 * @generated
		 */
		EClass CORO_ACTION_NODE = eINSTANCE.getCoroActionNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.SimpleConditionNodeImpl <em>Simple Condition Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.SimpleConditionNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getSimpleConditionNode()
		 * @generated
		 */
		EClass SIMPLE_CONDITION_NODE = eINSTANCE.getSimpleConditionNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.RetryNodeImpl <em>Retry Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.RetryNodeImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getRetryNode()
		 * @generated
		 */
		EClass RETRY_NODE = eINSTANCE.getRetryNode();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.impl.RootImpl
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ROOT = eINSTANCE.getRoot_Root();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.NodeType
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getNodeType()
		 * @generated
		 */
		EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.NodeStatus <em>Node Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.NodeStatus
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getNodeStatus()
		 * @generated
		 */
		EEnum NODE_STATUS = eINSTANCE.getNodeStatus();

		/**
		 * The meta object literal for the '{@link bt.cpp.btcpp.PortDirection <em>Port Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bt.cpp.btcpp.PortDirection
		 * @see bt.cpp.btcpp.impl.BtcppPackageImpl#getPortDirection()
		 * @generated
		 */
		EEnum PORT_DIRECTION = eINSTANCE.getPortDirection();

	}

} //BtcppPackage
