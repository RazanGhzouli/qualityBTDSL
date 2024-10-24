/**
 */
package btcpp.impl;

import btcpp.ActionNodeBase;
import btcpp.AlwaysFailureNode;
import btcpp.AlwaysSuccessNode;
import btcpp.AsynchActionNode;
import btcpp.BehaviorTree;
import btcpp.BtcppFactory;
import btcpp.BtcppPackage;
import btcpp.ConditionNode;
import btcpp.ConsumeQueueNode;
import btcpp.ControlNode;
import btcpp.CoroActionNode;
import btcpp.DecoratorNode;
import btcpp.DelayNode;
import btcpp.EntryUpdatedActionNode;
import btcpp.EntryUpdatedDecoratorNode;
import btcpp.FallbackNode;
import btcpp.ForceFailureNode;
import btcpp.ForceSuccessNode;
import btcpp.IfThenElseNode;
import btcpp.InverterNode;
import btcpp.KeepRunningUntilFailureNode;
import btcpp.LeafNode;
import btcpp.LoopNode;
import btcpp.ManualSelectorNode;
import btcpp.ParallelAllNode;
import btcpp.ParallelNode;
import btcpp.Parameter;
import btcpp.PopFromQueueNode;
import btcpp.PreconditionNode;
import btcpp.Quality;
import btcpp.QualityRequirement;
import btcpp.ReactiveFallbackNode;
import btcpp.ReactiveSequenceNode;
import btcpp.RepeatNode;
import btcpp.RetryNode;
import btcpp.Root;
import btcpp.RunOnceNode;
import btcpp.ScriptConditionNode;
import btcpp.ScriptNode;
import btcpp.SequenceNode;
import btcpp.SequenceWithMemoryNode;
import btcpp.SetBlackboardNode;
import btcpp.SleepNode;
import btcpp.StatefulActionNode;
import btcpp.SubTree;
import btcpp.SwitchNode;
import btcpp.SyncActionNode;
import btcpp.TestNode;
import btcpp.ThreadedActionNode;
import btcpp.TimeoutNode;
import btcpp.TreeNode;
import btcpp.UnsetBlackboardNode;
import btcpp.WhileDoElseNode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass manualSelectorNodeEClass = null;

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
	private EClass sequenceWithMemoryNodeEClass = null;

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
	private EClass reactiveFallbackNodeEClass = null;

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
	private EClass reactiveSequenceNodeEClass = null;

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
	private EClass scriptNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptConditionNodeEClass = null;

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
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelAllNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preconditionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryUpdatedDecoratorNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runOnceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumeQueueNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryUpdatedActionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsetBlackboardNodeEClass = null;

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
	private EClass threadedActionNodeEClass = null;

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
	private EClass asynchActionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sleepNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popFromQueueNodeEClass = null;

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
		return (EReference)behaviorTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorTree_ID() {
		return (EAttribute)behaviorTreeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTreeNode_ID() {
		return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeNode_Name() {
		return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeNode_AnyAttribute() {
		return (EAttribute)treeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTreeNode_Parameters() {
		return (EReference)treeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTreeNode_Satisfices() {
		return (EReference)treeNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTreeNode_Satisfies() {
		return (EReference)treeNodeEClass.getEStructuralFeatures().get(5);
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
		return (EReference)controlNodeEClass.getEStructuralFeatures().get(0);
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
		return (EReference)decoratorNodeEClass.getEStructuralFeatures().get(0);
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
	public EClass getAlwaysSuccessNode() {
		return alwaysSuccessNodeEClass;
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
	public EAttribute getSetBlackboardNode_Value() {
		return (EAttribute)setBlackboardNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetBlackboardNode_Output_key() {
		return (EAttribute)setBlackboardNodeEClass.getEStructuralFeatures().get(1);
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
	public EClass getManualSelectorNode() {
		return manualSelectorNodeEClass;
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
	public EClass getSequenceWithMemoryNode() {
		return sequenceWithMemoryNodeEClass;
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
	public EClass getReactiveFallbackNode() {
		return reactiveFallbackNodeEClass;
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
	public EClass getReactiveSequenceNode() {
		return reactiveSequenceNodeEClass;
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
	public EClass getTimeoutNode() {
		return timeoutNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeoutNode_Msec() {
		return (EAttribute)timeoutNodeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getRepeatNode_Num_cycles() {
		return (EAttribute)repeatNodeEClass.getEStructuralFeatures().get(0);
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
	public EReference getSubTree_Child() {
		return (EReference)subTreeEClass.getEStructuralFeatures().get(0);
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
	public EClass getActionNodeBase() {
		return actionNodeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScriptNode() {
		return scriptNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScriptConditionNode() {
		return scriptConditionNodeEClass;
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
	public EAttribute getRetryNode_Num_attempts() {
		return (EAttribute)retryNodeEClass.getEStructuralFeatures().get(0);
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
	public EReference getRoot_Behaviortrees() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoot_Main_tree_to_execute() {
		return (EAttribute)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Key() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityRequirement() {
		return qualityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualityRequirement_ID() {
		return (EAttribute)qualityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualityRequirement_Description() {
		return (EAttribute)qualityRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuality() {
		return qualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuality_ID() {
		return (EAttribute)qualityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuality_Qualityreq() {
		return (EReference)qualityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelAllNode() {
		return parallelAllNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelayNode() {
		return delayNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelayNode_Delay_msec() {
		return (EAttribute)delayNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreconditionNode() {
		return preconditionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryUpdatedDecoratorNode() {
		return entryUpdatedDecoratorNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunOnceNode() {
		return runOnceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoopNode() {
		return loopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsumeQueueNode() {
		return consumeQueueNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestNode() {
		return testNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntryUpdatedActionNode() {
		return entryUpdatedActionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsetBlackboardNode() {
		return unsetBlackboardNodeEClass;
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
	public EClass getThreadedActionNode() {
		return threadedActionNodeEClass;
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
	public EClass getAsynchActionNode() {
		return asynchActionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSleepNode() {
		return sleepNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPopFromQueueNode() {
		return popFromQueueNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		createEAttribute(treeNodeEClass, TREE_NODE__ID);
		createEAttribute(treeNodeEClass, TREE_NODE__NAME);
		createEAttribute(treeNodeEClass, TREE_NODE__ANY_ATTRIBUTE);
		createEReference(treeNodeEClass, TREE_NODE__PARAMETERS);
		createEReference(treeNodeEClass, TREE_NODE__SATISFICES);
		createEReference(treeNodeEClass, TREE_NODE__SATISFIES);

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

		manualSelectorNodeEClass = createEClass(MANUAL_SELECTOR_NODE);

		parallelNodeEClass = createEClass(PARALLEL_NODE);

		sequenceWithMemoryNodeEClass = createEClass(SEQUENCE_WITH_MEMORY_NODE);

		switchNodeEClass = createEClass(SWITCH_NODE);

		reactiveFallbackNodeEClass = createEClass(REACTIVE_FALLBACK_NODE);

		whileDoElseNodeEClass = createEClass(WHILE_DO_ELSE_NODE);

		reactiveSequenceNodeEClass = createEClass(REACTIVE_SEQUENCE_NODE);

		sequenceNodeEClass = createEClass(SEQUENCE_NODE);

		timeoutNodeEClass = createEClass(TIMEOUT_NODE);
		createEAttribute(timeoutNodeEClass, TIMEOUT_NODE__MSEC);

		keepRunningUntilFailureNodeEClass = createEClass(KEEP_RUNNING_UNTIL_FAILURE_NODE);

		inverterNodeEClass = createEClass(INVERTER_NODE);

		forceSuccessNodeEClass = createEClass(FORCE_SUCCESS_NODE);

		forceFailureNodeEClass = createEClass(FORCE_FAILURE_NODE);

		repeatNodeEClass = createEClass(REPEAT_NODE);
		createEAttribute(repeatNodeEClass, REPEAT_NODE__NUM_CYCLES);

		conditionNodeEClass = createEClass(CONDITION_NODE);

		subTreeEClass = createEClass(SUB_TREE);
		createEReference(subTreeEClass, SUB_TREE__CHILD);

		leafNodeEClass = createEClass(LEAF_NODE);

		actionNodeBaseEClass = createEClass(ACTION_NODE_BASE);

		scriptNodeEClass = createEClass(SCRIPT_NODE);

		scriptConditionNodeEClass = createEClass(SCRIPT_CONDITION_NODE);

		retryNodeEClass = createEClass(RETRY_NODE);
		createEAttribute(retryNodeEClass, RETRY_NODE__NUM_ATTEMPTS);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__BEHAVIORTREES);
		createEAttribute(rootEClass, ROOT__MAIN_TREE_TO_EXECUTE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__KEY);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		qualityRequirementEClass = createEClass(QUALITY_REQUIREMENT);
		createEAttribute(qualityRequirementEClass, QUALITY_REQUIREMENT__ID);
		createEAttribute(qualityRequirementEClass, QUALITY_REQUIREMENT__DESCRIPTION);

		qualityEClass = createEClass(QUALITY);
		createEAttribute(qualityEClass, QUALITY__ID);
		createEReference(qualityEClass, QUALITY__QUALITYREQ);

		parallelAllNodeEClass = createEClass(PARALLEL_ALL_NODE);

		delayNodeEClass = createEClass(DELAY_NODE);
		createEAttribute(delayNodeEClass, DELAY_NODE__DELAY_MSEC);

		preconditionNodeEClass = createEClass(PRECONDITION_NODE);

		entryUpdatedDecoratorNodeEClass = createEClass(ENTRY_UPDATED_DECORATOR_NODE);

		runOnceNodeEClass = createEClass(RUN_ONCE_NODE);

		loopNodeEClass = createEClass(LOOP_NODE);

		consumeQueueNodeEClass = createEClass(CONSUME_QUEUE_NODE);

		testNodeEClass = createEClass(TEST_NODE);

		entryUpdatedActionNodeEClass = createEClass(ENTRY_UPDATED_ACTION_NODE);

		unsetBlackboardNodeEClass = createEClass(UNSET_BLACKBOARD_NODE);

		syncActionNodeEClass = createEClass(SYNC_ACTION_NODE);

		threadedActionNodeEClass = createEClass(THREADED_ACTION_NODE);

		statefulActionNodeEClass = createEClass(STATEFUL_ACTION_NODE);

		coroActionNodeEClass = createEClass(CORO_ACTION_NODE);

		asynchActionNodeEClass = createEClass(ASYNCH_ACTION_NODE);

		sleepNodeEClass = createEClass(SLEEP_NODE);

		popFromQueueNodeEClass = createEClass(POP_FROM_QUEUE_NODE);
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
		alwaysFailureNodeEClass.getESuperTypes().add(this.getSyncActionNode());
		alwaysSuccessNodeEClass.getESuperTypes().add(this.getSyncActionNode());
		setBlackboardNodeEClass.getESuperTypes().add(this.getSyncActionNode());
		fallbackNodeEClass.getESuperTypes().add(this.getControlNode());
		ifThenElseNodeEClass.getESuperTypes().add(this.getControlNode());
		manualSelectorNodeEClass.getESuperTypes().add(this.getControlNode());
		parallelNodeEClass.getESuperTypes().add(this.getControlNode());
		sequenceWithMemoryNodeEClass.getESuperTypes().add(this.getControlNode());
		switchNodeEClass.getESuperTypes().add(this.getControlNode());
		reactiveFallbackNodeEClass.getESuperTypes().add(this.getControlNode());
		whileDoElseNodeEClass.getESuperTypes().add(this.getControlNode());
		reactiveSequenceNodeEClass.getESuperTypes().add(this.getControlNode());
		sequenceNodeEClass.getESuperTypes().add(this.getControlNode());
		timeoutNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		keepRunningUntilFailureNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		inverterNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		forceSuccessNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		forceFailureNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		repeatNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		conditionNodeEClass.getESuperTypes().add(this.getLeafNode());
		subTreeEClass.getESuperTypes().add(this.getTreeNode());
		leafNodeEClass.getESuperTypes().add(this.getTreeNode());
		actionNodeBaseEClass.getESuperTypes().add(this.getLeafNode());
		scriptNodeEClass.getESuperTypes().add(this.getSyncActionNode());
		scriptConditionNodeEClass.getESuperTypes().add(this.getConditionNode());
		retryNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		parallelAllNodeEClass.getESuperTypes().add(this.getControlNode());
		delayNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		preconditionNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		entryUpdatedDecoratorNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		runOnceNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		loopNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		consumeQueueNodeEClass.getESuperTypes().add(this.getDecoratorNode());
		testNodeEClass.getESuperTypes().add(this.getStatefulActionNode());
		entryUpdatedActionNodeEClass.getESuperTypes().add(this.getSyncActionNode());
		unsetBlackboardNodeEClass.getESuperTypes().add(this.getSyncActionNode());
		syncActionNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		threadedActionNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		statefulActionNodeEClass.getESuperTypes().add(this.getAsynchActionNode());
		coroActionNodeEClass.getESuperTypes().add(this.getAsynchActionNode());
		asynchActionNodeEClass.getESuperTypes().add(this.getActionNodeBase());
		sleepNodeEClass.getESuperTypes().add(this.getStatefulActionNode());
		popFromQueueNodeEClass.getESuperTypes().add(this.getSyncActionNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(behaviorTreeEClass, BehaviorTree.class, "BehaviorTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorTree_Node(), this.getTreeNode(), null, "node", null, 1, -1, BehaviorTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorTree_ID(), ecorePackage.getEString(), "ID", null, 1, 1, BehaviorTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeNodeEClass, TreeNode.class, "TreeNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeNode_ID(), ecorePackage.getEString(), "ID", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeNode_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "AnyAttribute", null, 0, -1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNode_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNode_Satisfices(), this.getQuality(), null, "satisfices", null, 0, -1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNode_Satisfies(), this.getQualityRequirement(), null, "satisfies", null, 0, -1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(manualSelectorNodeEClass, ManualSelectorNode.class, "ManualSelectorNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelNodeEClass, ParallelNode.class, "ParallelNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceWithMemoryNodeEClass, SequenceWithMemoryNode.class, "SequenceWithMemoryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchNodeEClass, SwitchNode.class, "SwitchNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactiveFallbackNodeEClass, ReactiveFallbackNode.class, "ReactiveFallbackNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whileDoElseNodeEClass, WhileDoElseNode.class, "WhileDoElseNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactiveSequenceNodeEClass, ReactiveSequenceNode.class, "ReactiveSequenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceNodeEClass, SequenceNode.class, "SequenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeoutNodeEClass, TimeoutNode.class, "TimeoutNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeoutNode_Msec(), ecorePackage.getEString(), "msec", null, 1, 1, TimeoutNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keepRunningUntilFailureNodeEClass, KeepRunningUntilFailureNode.class, "KeepRunningUntilFailureNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverterNodeEClass, InverterNode.class, "InverterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forceSuccessNodeEClass, ForceSuccessNode.class, "ForceSuccessNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forceFailureNodeEClass, ForceFailureNode.class, "ForceFailureNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatNodeEClass, RepeatNode.class, "RepeatNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepeatNode_Num_cycles(), ecorePackage.getEString(), "num_cycles", null, 1, 1, RepeatNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionNodeEClass, ConditionNode.class, "ConditionNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subTreeEClass, SubTree.class, "SubTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubTree_Child(), this.getTreeNode(), null, "child", null, 0, -1, SubTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leafNodeEClass, LeafNode.class, "LeafNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionNodeBaseEClass, ActionNodeBase.class, "ActionNodeBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptNodeEClass, ScriptNode.class, "ScriptNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scriptConditionNodeEClass, ScriptConditionNode.class, "ScriptConditionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(retryNodeEClass, RetryNode.class, "RetryNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetryNode_Num_attempts(), ecorePackage.getEString(), "num_attempts", null, 1, 1, RetryNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Behaviortrees(), this.getBehaviorTree(), null, "behaviortrees", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoot_Main_tree_to_execute(), ecorePackage.getEString(), "main_tree_to_execute", null, 1, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Key(), ecorePackage.getEString(), "key", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityRequirementEClass, QualityRequirement.class, "QualityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualityRequirement_ID(), ecorePackage.getEString(), "ID", null, 0, 1, QualityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, QualityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityEClass, Quality.class, "Quality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuality_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Quality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuality_Qualityreq(), this.getQualityRequirement(), null, "qualityreq", null, 0, -1, Quality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelAllNodeEClass, ParallelAllNode.class, "ParallelAllNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayNodeEClass, DelayNode.class, "DelayNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelayNode_Delay_msec(), ecorePackage.getEString(), "delay_msec", null, 0, 1, DelayNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preconditionNodeEClass, PreconditionNode.class, "PreconditionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryUpdatedDecoratorNodeEClass, EntryUpdatedDecoratorNode.class, "EntryUpdatedDecoratorNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runOnceNodeEClass, RunOnceNode.class, "RunOnceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopNodeEClass, LoopNode.class, "LoopNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consumeQueueNodeEClass, ConsumeQueueNode.class, "ConsumeQueueNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testNodeEClass, TestNode.class, "TestNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryUpdatedActionNodeEClass, EntryUpdatedActionNode.class, "EntryUpdatedActionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsetBlackboardNodeEClass, UnsetBlackboardNode.class, "UnsetBlackboardNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(syncActionNodeEClass, SyncActionNode.class, "SyncActionNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(threadedActionNodeEClass, ThreadedActionNode.class, "ThreadedActionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statefulActionNodeEClass, StatefulActionNode.class, "StatefulActionNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coroActionNodeEClass, CoroActionNode.class, "CoroActionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asynchActionNodeEClass, AsynchActionNode.class, "AsynchActionNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sleepNodeEClass, SleepNode.class, "SleepNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(popFromQueueNodeEClass, PopFromQueueNode.class, "PopFromQueueNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BtcppPackageImpl
