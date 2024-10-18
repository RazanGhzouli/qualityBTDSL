/**
 */
package btcpp.impl;

import btcpp.ActionNodeBase;
import btcpp.AlwaysFailureNode;
import btcpp.AlwaysSuccessNode;
import btcpp.BehaviorTree;
import btcpp.BlackboardCheckDouble;
import btcpp.BlackboardCheckInt;
import btcpp.BlackboardCheckString;
import btcpp.BlackboardPrecondition;
import btcpp.BtcppFactory;
import btcpp.BtcppPackage;
import btcpp.ConditionNode;
import btcpp.ControlNode;
import btcpp.DecoratorNode;
import btcpp.FallbackNode;
import btcpp.ForceFailureNode;
import btcpp.ForceSuccessNode;
import btcpp.IfThenElseNode;
import btcpp.InverterNode;
import btcpp.KeepRunningUntilFailureNode;
import btcpp.LeafNode;
import btcpp.MnualNode;
import btcpp.NodeStatus;
import btcpp.NodeType;
import btcpp.ParallelNode;
import btcpp.Parameter;
import btcpp.ReactiveFallback;
import btcpp.ReactiveSequence;
import btcpp.RepeatNode;
import btcpp.RetryNode;
import btcpp.Root;
import btcpp.SequenceNode;
import btcpp.SequenceStarNode;
import btcpp.SetBlackboardNode;
import btcpp.SimpleActionNode;
import btcpp.SimpleConditionNode;
import btcpp.SubTree;
import btcpp.SubtreeNode;
import btcpp.SwitchNode;
import btcpp.TimeoutNode;
import btcpp.TimerQueueNode;
import btcpp.TreeNode;
import btcpp.WhileDoElseNode;

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
	private EClass actionNodeBaseEClass = null;

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
	private EClass blackboardCheckIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackboardCheckDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackboardCheckStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

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
	 * @see btcpp.BtcppPackage#eNS_URI
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
		if (isInited) return (BtcppPackage)EPackage.Registry.INSTANCE.getEPackage(BtcppPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBtcppPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BtcppPackageImpl theBtcppPackage = registeredBtcppPackage instanceof BtcppPackageImpl ? (BtcppPackageImpl)registeredBtcppPackage : new BtcppPackageImpl();

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
	public EClass getBehaviorTree() {
		return behaviorTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorTree_Node() {
		return (EReference)behaviorTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehaviorTree_ID() {
		return (EAttribute)behaviorTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeNode() {
		return treeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNode_UID() {
		return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNode_Name() {
		return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNode_NodeType() {
		return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNode_AnyAttribute() {
		return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeNode_NodeStatus() {
		return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeNode_Parameters() {
		return (EReference)treeNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlNode_Child() {
		return (EReference)controlNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecoratorNode() {
		return decoratorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecoratorNode_Child() {
		return (EReference)decoratorNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlwaysFailureNode() {
		return alwaysFailureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlwaysSuccessNode() {
		return alwaysSuccessNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetBlackboardNode() {
		return setBlackboardNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetBlackboardNode_Value() {
		return (EAttribute)setBlackboardNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetBlackboardNode_Output_key() {
		return (EAttribute)setBlackboardNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFallbackNode() {
		return fallbackNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfThenElseNode() {
		return ifThenElseNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMnualNode() {
		return mnualNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelNode() {
		return parallelNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceStarNode() {
		return sequenceStarNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchNode() {
		return switchNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactiveFallback() {
		return reactiveFallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileDoElseNode() {
		return whileDoElseNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactiveSequence() {
		return reactiveSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceNode() {
		return sequenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtreeNode() {
		return subtreeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeoutNode() {
		return timeoutNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeoutNode_Msec() {
		return (EAttribute)timeoutNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeepRunningUntilFailureNode() {
		return keepRunningUntilFailureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerQueueNode() {
		return timerQueueNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverterNode() {
		return inverterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForceSuccessNode() {
		return forceSuccessNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForceFailureNode() {
		return forceFailureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatNode() {
		return repeatNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatNode_Num_cycles() {
		return (EAttribute)repeatNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackboardPrecondition() {
		return blackboardPreconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlackboardPrecondition_Return_on_mismatch() {
		return (EAttribute)blackboardPreconditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlackboardPrecondition_Value_A() {
		return (EAttribute)blackboardPreconditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlackboardPrecondition_Value_B() {
		return (EAttribute)blackboardPreconditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionNode() {
		return conditionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubTree() {
		return subTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubTree_Child() {
		return (EReference)subTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeafNode() {
		return leafNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionNodeBase() {
		return actionNodeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleActionNode() {
		return simpleActionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleConditionNode() {
		return simpleConditionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetryNode() {
		return retryNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryNode_Num_attempts() {
		return (EAttribute)retryNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Behaviortrees() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoot_Main_tree_to_execute() {
		return (EAttribute)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackboardCheckInt() {
		return blackboardCheckIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackboardCheckDouble() {
		return blackboardCheckDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackboardCheckString() {
		return blackboardCheckStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Key() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeType() {
		return nodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNodeStatus() {
		return nodeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcppFactory getBtcppFactory() {
		return (BtcppFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		behaviorTreeEClass = createEClass(BEHAVIOR_TREE);
		createEReference(behaviorTreeEClass, BEHAVIOR_TREE__NODE);
		createEAttribute(behaviorTreeEClass, BEHAVIOR_TREE__ID);

		treeNodeEClass = createEClass(TREE_NODE);
		createEAttribute(treeNodeEClass, TREE_NODE__UID);
		createEAttribute(treeNodeEClass, TREE_NODE__NAME);
		createEAttribute(treeNodeEClass, TREE_NODE__NODE_TYPE);
		createEAttribute(treeNodeEClass, TREE_NODE__ANY_ATTRIBUTE);
		createEAttribute(treeNodeEClass, TREE_NODE__NODE_STATUS);
		createEReference(treeNodeEClass, TREE_NODE__PARAMETERS);

		controlNodeEClass = createEClass(CONTROL_NODE);
		createEReference(controlNodeEClass, CONTROL_NODE__CHILD);

		decoratorNodeEClass = createEClass(DECORATOR_NODE);
		createEReference(decoratorNodeEClass, DECORATOR_NODE__CHILD);

		alwaysFailureNodeEClass = createEClass(ALWAYS_FAILURE_NODE);

		alwaysSuccessNodeEClass = createEClass(ALWAYS_SUCCESS_NODE);

		setBlackboardNodeEClass = createEClass(SET_BLACKBOARD_NODE);
		createEAttribute(setBlackboardNodeEClass, SET_BLACKBOARD_NODE__VALUE);
		createEAttribute(setBlackboardNodeEClass, SET_BLACKBOARD_NODE__OUTPUT_KEY);

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
		createEAttribute(timeoutNodeEClass, TIMEOUT_NODE__MSEC);

		keepRunningUntilFailureNodeEClass = createEClass(KEEP_RUNNING_UNTIL_FAILURE_NODE);

		timerQueueNodeEClass = createEClass(TIMER_QUEUE_NODE);

		inverterNodeEClass = createEClass(INVERTER_NODE);

		forceSuccessNodeEClass = createEClass(FORCE_SUCCESS_NODE);

		forceFailureNodeEClass = createEClass(FORCE_FAILURE_NODE);

		repeatNodeEClass = createEClass(REPEAT_NODE);
		createEAttribute(repeatNodeEClass, REPEAT_NODE__NUM_CYCLES);

		blackboardPreconditionEClass = createEClass(BLACKBOARD_PRECONDITION);
		createEAttribute(blackboardPreconditionEClass, BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH);
		createEAttribute(blackboardPreconditionEClass, BLACKBOARD_PRECONDITION__VALUE_A);
		createEAttribute(blackboardPreconditionEClass, BLACKBOARD_PRECONDITION__VALUE_B);

		conditionNodeEClass = createEClass(CONDITION_NODE);

		subTreeEClass = createEClass(SUB_TREE);
		createEReference(subTreeEClass, SUB_TREE__CHILD);

		leafNodeEClass = createEClass(LEAF_NODE);

		actionNodeBaseEClass = createEClass(ACTION_NODE_BASE);

		simpleActionNodeEClass = createEClass(SIMPLE_ACTION_NODE);

		simpleConditionNodeEClass = createEClass(SIMPLE_CONDITION_NODE);

		retryNodeEClass = createEClass(RETRY_NODE);
		createEAttribute(retryNodeEClass, RETRY_NODE__NUM_ATTEMPTS);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__BEHAVIORTREES);
		createEAttribute(rootEClass, ROOT__MAIN_TREE_TO_EXECUTE);

		blackboardCheckIntEClass = createEClass(BLACKBOARD_CHECK_INT);

		blackboardCheckDoubleEClass = createEClass(BLACKBOARD_CHECK_DOUBLE);

		blackboardCheckStringEClass = createEClass(BLACKBOARD_CHECK_STRING);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__KEY);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		// Create enums
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		nodeStatusEEnum = createEEnum(NODE_STATUS);
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
		if (isInitialized) return;
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
		alwaysFailureNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		alwaysSuccessNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		setBlackboardNodeEClass.getESuperTypes().add(this.getActionNodeBase());
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
		actionNodeBaseEClass.getESuperTypes().add(this.getLeafNode());
		simpleActionNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		simpleConditionNodeEClass.getESuperTypes().add(this.getConditionNode());
		retryNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		blackboardCheckIntEClass.getESuperTypes().add(this.getBlackboardPrecondition());
		blackboardCheckDoubleEClass.getESuperTypes().add(this.getBlackboardPrecondition());
		blackboardCheckStringEClass.getESuperTypes().add(this.getBlackboardPrecondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(behaviorTreeEClass, BehaviorTree.class, "BehaviorTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorTree_Node(), this.getTreeNode(), null, "node", null, 1, -1, BehaviorTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorTree_ID(), ecorePackage.getEString(), "ID", null, 1, 1, BehaviorTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeNodeEClass, TreeNode.class, "TreeNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeNode_UID(), ecorePackage.getEString(), "uID", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNode_NodeType(), this.getNodeType(), "NodeType", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNode_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "AnyAttribute", null, 0, -1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNode_NodeStatus(), this.getNodeStatus(), "NodeStatus", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNode_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlNode_Child(), this.getTreeNode(), null, "child", null, 1, -1, ControlNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decoratorNodeEClass, DecoratorNode.class, "DecoratorNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecoratorNode_Child(), this.getTreeNode(), null, "child", null, 1, 1, DecoratorNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alwaysFailureNodeEClass, AlwaysFailureNode.class, "AlwaysFailureNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alwaysSuccessNodeEClass, AlwaysSuccessNode.class, "AlwaysSuccessNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setBlackboardNodeEClass, SetBlackboardNode.class, "SetBlackboardNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetBlackboardNode_Value(), ecorePackage.getEString(), "value", null, 1, 1, SetBlackboardNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetBlackboardNode_Output_key(), ecorePackage.getEString(), "output_key", null, 1, 1, SetBlackboardNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fallbackNodeEClass, FallbackNode.class, "FallbackNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ifThenElseNodeEClass, IfThenElseNode.class, "IfThenElseNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mnualNodeEClass, MnualNode.class, "MnualNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelNodeEClass, ParallelNode.class, "ParallelNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceStarNodeEClass, SequenceStarNode.class, "SequenceStarNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchNodeEClass, SwitchNode.class, "SwitchNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactiveFallbackEClass, ReactiveFallback.class, "ReactiveFallback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileDoElseNodeEClass, WhileDoElseNode.class, "WhileDoElseNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactiveSequenceEClass, ReactiveSequence.class, "ReactiveSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceNodeEClass, SequenceNode.class, "SequenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtreeNodeEClass, SubtreeNode.class, "SubtreeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeoutNodeEClass, TimeoutNode.class, "TimeoutNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeoutNode_Msec(), ecorePackage.getEString(), "msec", null, 1, 1, TimeoutNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keepRunningUntilFailureNodeEClass, KeepRunningUntilFailureNode.class, "KeepRunningUntilFailureNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timerQueueNodeEClass, TimerQueueNode.class, "TimerQueueNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverterNodeEClass, InverterNode.class, "InverterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forceSuccessNodeEClass, ForceSuccessNode.class, "ForceSuccessNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forceFailureNodeEClass, ForceFailureNode.class, "ForceFailureNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatNodeEClass, RepeatNode.class, "RepeatNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeatNode_Num_cycles(), ecorePackage.getEString(), "num_cycles", null, 1, 1, RepeatNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blackboardPreconditionEClass, BlackboardPrecondition.class, "BlackboardPrecondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlackboardPrecondition_Return_on_mismatch(), this.getNodeStatus(), "return_on_mismatch", null, 1, 1, BlackboardPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlackboardPrecondition_Value_A(), ecorePackage.getEString(), "value_A", null, 1, 1, BlackboardPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlackboardPrecondition_Value_B(), ecorePackage.getEString(), "value_B", null, 1, 1, BlackboardPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionNodeEClass, ConditionNode.class, "ConditionNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subTreeEClass, SubTree.class, "SubTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubTree_Child(), this.getTreeNode(), null, "child", null, 0, -1, SubTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leafNodeEClass, LeafNode.class, "LeafNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionNodeBaseEClass, ActionNodeBase.class, "ActionNodeBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleActionNodeEClass, SimpleActionNode.class, "SimpleActionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleConditionNodeEClass, SimpleConditionNode.class, "SimpleConditionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(retryNodeEClass, RetryNode.class, "RetryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetryNode_Num_attempts(), ecorePackage.getEString(), "num_attempts", null, 1, 1, RetryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Behaviortrees(), this.getBehaviorTree(), null, "behaviortrees", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoot_Main_tree_to_execute(), ecorePackage.getEString(), "main_tree_to_execute", null, 1, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blackboardCheckIntEClass, BlackboardCheckInt.class, "BlackboardCheckInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blackboardCheckDoubleEClass, BlackboardCheckDouble.class, "BlackboardCheckDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blackboardCheckStringEClass, BlackboardCheckString.class, "BlackboardCheckString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Key(), ecorePackage.getEString(), "key", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);
	}

} //BtcppPackageImpl
