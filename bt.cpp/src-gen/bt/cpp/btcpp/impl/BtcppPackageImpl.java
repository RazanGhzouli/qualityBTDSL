/**
 */
package bt.cpp.btcpp.impl;

import bt.cpp.btcpp.ActionNodeBase;
import bt.cpp.btcpp.AlwaysFailureNode;
import bt.cpp.btcpp.AlwaysSuccessNode;
import bt.cpp.btcpp.AsyncActionNode;
import bt.cpp.btcpp.BehaviorTree;
import bt.cpp.btcpp.BlackBoard;
import bt.cpp.btcpp.BlackboardPrecondition;
import bt.cpp.btcpp.BtcppFactory;
import bt.cpp.btcpp.BtcppPackage;
import bt.cpp.btcpp.ConditionNode;
import bt.cpp.btcpp.ControlNode;
import bt.cpp.btcpp.CoroActionNode;
import bt.cpp.btcpp.DecoratorNode;
import bt.cpp.btcpp.FallbackNode;
import bt.cpp.btcpp.ForceFailureNode;
import bt.cpp.btcpp.ForceSuccessNode;
import bt.cpp.btcpp.IfThenElseNode;
import bt.cpp.btcpp.InverterNode;
import bt.cpp.btcpp.KeepRunningUntilFailureNode;
import bt.cpp.btcpp.LeafNode;
import bt.cpp.btcpp.MnualNode;
import bt.cpp.btcpp.NodeConfiguration;
import bt.cpp.btcpp.NodeStatus;
import bt.cpp.btcpp.NodeType;
import bt.cpp.btcpp.ParallelNode;
import bt.cpp.btcpp.PortDirection;
import bt.cpp.btcpp.ReactiveFallback;
import bt.cpp.btcpp.ReactiveSequence;
import bt.cpp.btcpp.RepeatNode;
import bt.cpp.btcpp.RetryNode;
import bt.cpp.btcpp.Root;
import bt.cpp.btcpp.SequenceNode;
import bt.cpp.btcpp.SequenceStarNode;
import bt.cpp.btcpp.SetBlackboardNode;
import bt.cpp.btcpp.SimpleActionNode;
import bt.cpp.btcpp.SimpleConditionNode;
import bt.cpp.btcpp.StatefulActionNode;
import bt.cpp.btcpp.SubTree;
import bt.cpp.btcpp.SubtreeNode;
import bt.cpp.btcpp.SwitchNode;
import bt.cpp.btcpp.SyncActionNode;
import bt.cpp.btcpp.TimeoutNode;
import bt.cpp.btcpp.TimerQueueNode;
import bt.cpp.btcpp.TreeNode;
import bt.cpp.btcpp.WhileDoElseNode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtcppPackageImpl extends EPackageImpl implements BtcppPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratorNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alwaysFailureNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alwaysSuccessNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setBlackboardNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fallbackNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifThenElseNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mnualNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceStarNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactiveFallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileDoElseNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactiveSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtreeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keepRunningUntilFailureNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerQueueNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forceSuccessNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forceFailureNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackboardPreconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leafNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syncActionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionNodeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asyncActionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleActionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statefulActionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coroActionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleConditionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portDirectionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bt.cpp.btcpp.BtcppPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BtcppPackageImpl() {
		super(eNS_URI, BtcppFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BtcppPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BtcppPackage init() {
		if (isInited)
			return (BtcppPackage) EPackage.Registry.INSTANCE.getEPackage(BtcppPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBtcppPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BtcppPackageImpl theBtcppPackage = registeredBtcppPackage instanceof BtcppPackageImpl
				? (BtcppPackageImpl) registeredBtcppPackage
				: new BtcppPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBtcppPackage.createPackageContents();

		// Initialize created meta-data
		theBtcppPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBtcppPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BtcppPackage.eNS_URI, theBtcppPackage);
		return theBtcppPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviorTree() {
		return behaviorTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTree_Node() {
		return (EReference) behaviorTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorTree_Type() {
		return (EAttribute) behaviorTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTreeNode() {
		return treeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeNode_UID() {
		return (EAttribute) treeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeNode_Name() {
		return (EAttribute) treeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTreeNode_Config() {
		return (EReference) treeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeNode_Status() {
		return (EAttribute) treeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlNode_Child() {
		return (EReference) controlNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecoratorNode() {
		return decoratorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorNode_Child() {
		return (EReference) decoratorNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlwaysFailureNode() {
		return alwaysFailureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlwaysFailureNode_Actions() {
		return (EReference) alwaysFailureNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlwaysSuccessNode() {
		return alwaysSuccessNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlwaysSuccessNode_Actions() {
		return (EReference) alwaysSuccessNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetBlackboardNode() {
		return setBlackboardNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetBlackboardNode_Actions() {
		return (EReference) setBlackboardNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFallbackNode() {
		return fallbackNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfThenElseNode() {
		return ifThenElseNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMnualNode() {
		return mnualNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelNode() {
		return parallelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceStarNode() {
		return sequenceStarNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchNode() {
		return switchNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactiveFallback() {
		return reactiveFallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhileDoElseNode() {
		return whileDoElseNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactiveSequence() {
		return reactiveSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceNode() {
		return sequenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubtreeNode() {
		return subtreeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeoutNode() {
		return timeoutNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeepRunningUntilFailureNode() {
		return keepRunningUntilFailureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimerQueueNode() {
		return timerQueueNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInverterNode() {
		return inverterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForceSuccessNode() {
		return forceSuccessNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForceFailureNode() {
		return forceFailureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepeatNode() {
		return repeatNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlackboardPrecondition() {
		return blackboardPreconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlackBoard() {
		return blackBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeConfiguration() {
		return nodeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeConfiguration_Blackboard() {
		return (EReference) nodeConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionNode() {
		return conditionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubTree() {
		return subTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubTree_RefersTo() {
		return (EReference) subTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeafNode() {
		return leafNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSyncActionNode() {
		return syncActionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionNodeBase() {
		return actionNodeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsyncActionNode() {
		return asyncActionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleActionNode() {
		return simpleActionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatefulActionNode() {
		return statefulActionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoroActionNode() {
		return coroActionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleConditionNode() {
		return simpleConditionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetryNode() {
		return retryNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_Root() {
		return (EReference) rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNodeType() {
		return nodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNodeStatus() {
		return nodeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPortDirection() {
		return portDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BtcppFactory getBtcppFactory() {
		return (BtcppFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		behaviorTreeEClass = createEClass(BEHAVIOR_TREE);
		createEReference(behaviorTreeEClass, BEHAVIOR_TREE__NODE);
		createEAttribute(behaviorTreeEClass, BEHAVIOR_TREE__TYPE);

		treeNodeEClass = createEClass(TREE_NODE);
		createEAttribute(treeNodeEClass, TREE_NODE__UID);
		createEAttribute(treeNodeEClass, TREE_NODE__NAME);
		createEReference(treeNodeEClass, TREE_NODE__CONFIG);
		createEAttribute(treeNodeEClass, TREE_NODE__STATUS);

		controlNodeEClass = createEClass(CONTROL_NODE);
		createEReference(controlNodeEClass, CONTROL_NODE__CHILD);

		decoratorNodeEClass = createEClass(DECORATOR_NODE);
		createEReference(decoratorNodeEClass, DECORATOR_NODE__CHILD);

		alwaysFailureNodeEClass = createEClass(ALWAYS_FAILURE_NODE);
		createEReference(alwaysFailureNodeEClass, ALWAYS_FAILURE_NODE__ACTIONS);

		alwaysSuccessNodeEClass = createEClass(ALWAYS_SUCCESS_NODE);
		createEReference(alwaysSuccessNodeEClass, ALWAYS_SUCCESS_NODE__ACTIONS);

		setBlackboardNodeEClass = createEClass(SET_BLACKBOARD_NODE);
		createEReference(setBlackboardNodeEClass, SET_BLACKBOARD_NODE__ACTIONS);

		fallbackNodeEClass = createEClass(FALLBACK_NODE);

		ifThenElseNodeEClass = createEClass(IF_THEN_ELSE_NODE);

		mnualNodeEClass = createEClass(MNUAL_NODE);

		parallelNodeEClass = createEClass(PARALLEL_NODE);

		sequenceStarNodeEClass = createEClass(SEQUENCE_STAR_NODE);

		switchNodeEClass = createEClass(SWITCH_NODE);

		reactiveFallbackEClass = createEClass(REACTIVE_FALLBACK);

		whileDoElseNodeEClass = createEClass(WHILE_DO_ELSE_NODE);

		reactiveSequenceEClass = createEClass(REACTIVE_SEQUENCE);

		sequenceNodeEClass = createEClass(SEQUENCE_NODE);

		subtreeNodeEClass = createEClass(SUBTREE_NODE);

		timeoutNodeEClass = createEClass(TIMEOUT_NODE);

		keepRunningUntilFailureNodeEClass = createEClass(KEEP_RUNNING_UNTIL_FAILURE_NODE);

		timerQueueNodeEClass = createEClass(TIMER_QUEUE_NODE);

		inverterNodeEClass = createEClass(INVERTER_NODE);

		forceSuccessNodeEClass = createEClass(FORCE_SUCCESS_NODE);

		forceFailureNodeEClass = createEClass(FORCE_FAILURE_NODE);

		repeatNodeEClass = createEClass(REPEAT_NODE);

		blackboardPreconditionEClass = createEClass(BLACKBOARD_PRECONDITION);

		blackBoardEClass = createEClass(BLACK_BOARD);

		nodeConfigurationEClass = createEClass(NODE_CONFIGURATION);
		createEReference(nodeConfigurationEClass, NODE_CONFIGURATION__BLACKBOARD);

		conditionNodeEClass = createEClass(CONDITION_NODE);

		subTreeEClass = createEClass(SUB_TREE);
		createEReference(subTreeEClass, SUB_TREE__REFERS_TO);

		leafNodeEClass = createEClass(LEAF_NODE);

		syncActionNodeEClass = createEClass(SYNC_ACTION_NODE);

		actionNodeBaseEClass = createEClass(ACTION_NODE_BASE);

		asyncActionNodeEClass = createEClass(ASYNC_ACTION_NODE);

		simpleActionNodeEClass = createEClass(SIMPLE_ACTION_NODE);

		statefulActionNodeEClass = createEClass(STATEFUL_ACTION_NODE);

		coroActionNodeEClass = createEClass(CORO_ACTION_NODE);

		simpleConditionNodeEClass = createEClass(SIMPLE_CONDITION_NODE);

		retryNodeEClass = createEClass(RETRY_NODE);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__ROOT);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		nodeStatusEEnum = createEEnum(NODE_STATUS);
		portDirectionEEnum = createEEnum(PORT_DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		controlNodeEClass.getESuperTypes().add(this.getTreeNode());
		decoratorNodeEClass.getESuperTypes().add(this.getTreeNode());
		fallbackNodeEClass.getESuperTypes().add(this.getControlNode());
		ifThenElseNodeEClass.getESuperTypes().add(this.getControlNode());
		mnualNodeEClass.getESuperTypes().add(this.getControlNode());
		parallelNodeEClass.getESuperTypes().add(this.getControlNode());
		sequenceStarNodeEClass.getESuperTypes().add(this.getControlNode());
		switchNodeEClass.getESuperTypes().add(this.getControlNode());
		reactiveFallbackEClass.getESuperTypes().add(this.getControlNode());
		whileDoElseNodeEClass.getESuperTypes().add(this.getControlNode());
		reactiveSequenceEClass.getESuperTypes().add(this.getControlNode());
		sequenceNodeEClass.getESuperTypes().add(this.getControlNode());
		subtreeNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		timeoutNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		keepRunningUntilFailureNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		timerQueueNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		inverterNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		forceSuccessNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		forceFailureNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		repeatNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		blackboardPreconditionEClass.getESuperTypes().add(this.getDecoratorNode());
		conditionNodeEClass.getESuperTypes().add(this.getLeafNode());
		subTreeEClass.getESuperTypes().add(this.getTreeNode());
		leafNodeEClass.getESuperTypes().add(this.getTreeNode());
		syncActionNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		actionNodeBaseEClass.getESuperTypes().add(this.getLeafNode());
		asyncActionNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		simpleActionNodeEClass.getESuperTypes().add(this.getSyncActionNode());
		statefulActionNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		coroActionNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		simpleConditionNodeEClass.getESuperTypes().add(this.getConditionNode());
		retryNodeEClass.getESuperTypes().add(this.getDecoratorNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(behaviorTreeEClass, BehaviorTree.class, "BehaviorTree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorTree_Node(), this.getTreeNode(), null, "node", null, 1, -1, BehaviorTree.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorTree_Type(), this.getNodeType(), "type", null, 0, 1, BehaviorTree.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeNodeEClass, TreeNode.class, "TreeNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeNode_UID(), ecorePackage.getEString(), "uID", null, 0, 1, TreeNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, TreeNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNode_Config(), this.getNodeConfiguration(), null, "config", null, 1, 1, TreeNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNode_Status(), this.getNodeStatus(), "status", null, 0, 1, TreeNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlNode_Child(), this.getTreeNode(), null, "child", null, 0, -1, ControlNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decoratorNodeEClass, DecoratorNode.class, "DecoratorNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecoratorNode_Child(), this.getTreeNode(), null, "child", null, 0, 1, DecoratorNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alwaysFailureNodeEClass, AlwaysFailureNode.class, "AlwaysFailureNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlwaysFailureNode_Actions(), this.getSyncActionNode(), null, "actions", null, 0, 1,
				AlwaysFailureNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alwaysSuccessNodeEClass, AlwaysSuccessNode.class, "AlwaysSuccessNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlwaysSuccessNode_Actions(), this.getSyncActionNode(), null, "actions", null, 0, 1,
				AlwaysSuccessNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setBlackboardNodeEClass, SetBlackboardNode.class, "SetBlackboardNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetBlackboardNode_Actions(), this.getSyncActionNode(), null, "actions", null, 0, 1,
				SetBlackboardNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fallbackNodeEClass, FallbackNode.class, "FallbackNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifThenElseNodeEClass, IfThenElseNode.class, "IfThenElseNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mnualNodeEClass, MnualNode.class, "MnualNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelNodeEClass, ParallelNode.class, "ParallelNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceStarNodeEClass, SequenceStarNode.class, "SequenceStarNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchNodeEClass, SwitchNode.class, "SwitchNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactiveFallbackEClass, ReactiveFallback.class, "ReactiveFallback", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileDoElseNodeEClass, WhileDoElseNode.class, "WhileDoElseNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactiveSequenceEClass, ReactiveSequence.class, "ReactiveSequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceNodeEClass, SequenceNode.class, "SequenceNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtreeNodeEClass, SubtreeNode.class, "SubtreeNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeoutNodeEClass, TimeoutNode.class, "TimeoutNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(keepRunningUntilFailureNodeEClass, KeepRunningUntilFailureNode.class, "KeepRunningUntilFailureNode",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timerQueueNodeEClass, TimerQueueNode.class, "TimerQueueNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverterNodeEClass, InverterNode.class, "InverterNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(forceSuccessNodeEClass, ForceSuccessNode.class, "ForceSuccessNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(forceFailureNodeEClass, ForceFailureNode.class, "ForceFailureNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatNodeEClass, RepeatNode.class, "RepeatNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(blackboardPreconditionEClass, BlackboardPrecondition.class, "BlackboardPrecondition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blackBoardEClass, BlackBoard.class, "BlackBoard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeConfigurationEClass, NodeConfiguration.class, "NodeConfiguration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeConfiguration_Blackboard(), this.getBlackBoard(), null, "blackboard", null, 0, 1,
				NodeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionNodeEClass, ConditionNode.class, "ConditionNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(subTreeEClass, SubTree.class, "SubTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubTree_RefersTo(), this.getBehaviorTree(), null, "refersTo", null, 0, -1, SubTree.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leafNodeEClass, LeafNode.class, "LeafNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(syncActionNodeEClass, SyncActionNode.class, "SyncActionNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionNodeBaseEClass, ActionNodeBase.class, "ActionNodeBase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(asyncActionNodeEClass, AsyncActionNode.class, "AsyncActionNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleActionNodeEClass, SimpleActionNode.class, "SimpleActionNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(statefulActionNodeEClass, StatefulActionNode.class, "StatefulActionNode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coroActionNodeEClass, CoroActionNode.class, "CoroActionNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleConditionNodeEClass, SimpleConditionNode.class, "SimpleConditionNode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(retryNodeEClass, RetryNode.class, "RetryNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Root(), this.getBehaviorTree(), null, "root", null, 1, 1, Root.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.UNDEFINED);
		addEEnumLiteral(nodeTypeEEnum, NodeType.ACTION);
		addEEnumLiteral(nodeTypeEEnum, NodeType.CONDITION);
		addEEnumLiteral(nodeTypeEEnum, NodeType.CONTROL);
		addEEnumLiteral(nodeTypeEEnum, NodeType.DECORATOR);
		addEEnumLiteral(nodeTypeEEnum, NodeType.SUBTREE);

		initEEnum(nodeStatusEEnum, NodeStatus.class, "NodeStatus");
		addEEnumLiteral(nodeStatusEEnum, NodeStatus.IDLE);
		addEEnumLiteral(nodeStatusEEnum, NodeStatus.RUNNING);
		addEEnumLiteral(nodeStatusEEnum, NodeStatus.SUCCESS);
		addEEnumLiteral(nodeStatusEEnum, NodeStatus.FAILURE);

		initEEnum(portDirectionEEnum, PortDirection.class, "PortDirection");
		addEEnumLiteral(portDirectionEEnum, PortDirection.INPUT);
		addEEnumLiteral(portDirectionEEnum, PortDirection.OUTPUT);
		addEEnumLiteral(portDirectionEEnum, PortDirection.INOUT);

		// Create resource
		createResource(eNS_URI);
	}

} //BtcppPackageImpl
