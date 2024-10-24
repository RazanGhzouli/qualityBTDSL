/**
 */
package btcpp.impl;

import btcpp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BtcppFactoryImpl extends EFactoryImpl implements BtcppFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BtcppFactory init() {
		try {
			BtcppFactory theBtcppFactory = (BtcppFactory)EPackage.Registry.INSTANCE.getEFactory(BtcppPackage.eNS_URI);
			if (theBtcppFactory != null) {
				return theBtcppFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BtcppFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcppFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BtcppPackage.BEHAVIOR_TREE: return createBehaviorTree();
			case BtcppPackage.ALWAYS_FAILURE_NODE: return createAlwaysFailureNode();
			case BtcppPackage.ALWAYS_SUCCESS_NODE: return createAlwaysSuccessNode();
			case BtcppPackage.SET_BLACKBOARD_NODE: return createSetBlackboardNode();
			case BtcppPackage.FALLBACK_NODE: return createFallbackNode();
			case BtcppPackage.IF_THEN_ELSE_NODE: return createIfThenElseNode();
			case BtcppPackage.MANUAL_SELECTOR_NODE: return createManualSelectorNode();
			case BtcppPackage.PARALLEL_NODE: return createParallelNode();
			case BtcppPackage.SEQUENCE_WITH_MEMORY_NODE: return createSequenceWithMemoryNode();
			case BtcppPackage.SWITCH_NODE: return createSwitchNode();
			case BtcppPackage.REACTIVE_FALLBACK_NODE: return createReactiveFallbackNode();
			case BtcppPackage.WHILE_DO_ELSE_NODE: return createWhileDoElseNode();
			case BtcppPackage.REACTIVE_SEQUENCE_NODE: return createReactiveSequenceNode();
			case BtcppPackage.SEQUENCE_NODE: return createSequenceNode();
			case BtcppPackage.TIMEOUT_NODE: return createTimeoutNode();
			case BtcppPackage.KEEP_RUNNING_UNTIL_FAILURE_NODE: return createKeepRunningUntilFailureNode();
			case BtcppPackage.INVERTER_NODE: return createInverterNode();
			case BtcppPackage.FORCE_SUCCESS_NODE: return createForceSuccessNode();
			case BtcppPackage.FORCE_FAILURE_NODE: return createForceFailureNode();
			case BtcppPackage.REPEAT_NODE: return createRepeatNode();
			case BtcppPackage.SUB_TREE: return createSubTree();
			case BtcppPackage.SCRIPT_NODE: return createScriptNode();
			case BtcppPackage.SCRIPT_CONDITION_NODE: return createScriptConditionNode();
			case BtcppPackage.RETRY_NODE: return createRetryNode();
			case BtcppPackage.ROOT: return createRoot();
			case BtcppPackage.PARAMETER: return createParameter();
			case BtcppPackage.QUALITY_REQUIREMENT: return createQualityRequirement();
			case BtcppPackage.QUALITY: return createQuality();
			case BtcppPackage.PARALLEL_ALL_NODE: return createParallelAllNode();
			case BtcppPackage.DELAY_NODE: return createDelayNode();
			case BtcppPackage.PRECONDITION_NODE: return createPreconditionNode();
			case BtcppPackage.ENTRY_UPDATED_DECORATOR_NODE: return createEntryUpdatedDecoratorNode();
			case BtcppPackage.RUN_ONCE_NODE: return createRunOnceNode();
			case BtcppPackage.LOOP_NODE: return createLoopNode();
			case BtcppPackage.CONSUME_QUEUE_NODE: return createConsumeQueueNode();
			case BtcppPackage.TEST_NODE: return createTestNode();
			case BtcppPackage.ENTRY_UPDATED_ACTION_NODE: return createEntryUpdatedActionNode();
			case BtcppPackage.UNSET_BLACKBOARD_NODE: return createUnsetBlackboardNode();
			case BtcppPackage.THREADED_ACTION_NODE: return createThreadedActionNode();
			case BtcppPackage.CORO_ACTION_NODE: return createCoroActionNode();
			case BtcppPackage.SLEEP_NODE: return createSleepNode();
			case BtcppPackage.POP_FROM_QUEUE_NODE: return createPopFromQueueNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorTree createBehaviorTree() {
		BehaviorTreeImpl behaviorTree = new BehaviorTreeImpl();
		return behaviorTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlwaysFailureNode createAlwaysFailureNode() {
		AlwaysFailureNodeImpl alwaysFailureNode = new AlwaysFailureNodeImpl();
		return alwaysFailureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlwaysSuccessNode createAlwaysSuccessNode() {
		AlwaysSuccessNodeImpl alwaysSuccessNode = new AlwaysSuccessNodeImpl();
		return alwaysSuccessNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetBlackboardNode createSetBlackboardNode() {
		SetBlackboardNodeImpl setBlackboardNode = new SetBlackboardNodeImpl();
		return setBlackboardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FallbackNode createFallbackNode() {
		FallbackNodeImpl fallbackNode = new FallbackNodeImpl();
		return fallbackNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfThenElseNode createIfThenElseNode() {
		IfThenElseNodeImpl ifThenElseNode = new IfThenElseNodeImpl();
		return ifThenElseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManualSelectorNode createManualSelectorNode() {
		ManualSelectorNodeImpl manualSelectorNode = new ManualSelectorNodeImpl();
		return manualSelectorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelNode createParallelNode() {
		ParallelNodeImpl parallelNode = new ParallelNodeImpl();
		return parallelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceWithMemoryNode createSequenceWithMemoryNode() {
		SequenceWithMemoryNodeImpl sequenceWithMemoryNode = new SequenceWithMemoryNodeImpl();
		return sequenceWithMemoryNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchNode createSwitchNode() {
		SwitchNodeImpl switchNode = new SwitchNodeImpl();
		return switchNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactiveFallbackNode createReactiveFallbackNode() {
		ReactiveFallbackNodeImpl reactiveFallbackNode = new ReactiveFallbackNodeImpl();
		return reactiveFallbackNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileDoElseNode createWhileDoElseNode() {
		WhileDoElseNodeImpl whileDoElseNode = new WhileDoElseNodeImpl();
		return whileDoElseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactiveSequenceNode createReactiveSequenceNode() {
		ReactiveSequenceNodeImpl reactiveSequenceNode = new ReactiveSequenceNodeImpl();
		return reactiveSequenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceNode createSequenceNode() {
		SequenceNodeImpl sequenceNode = new SequenceNodeImpl();
		return sequenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeoutNode createTimeoutNode() {
		TimeoutNodeImpl timeoutNode = new TimeoutNodeImpl();
		return timeoutNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeepRunningUntilFailureNode createKeepRunningUntilFailureNode() {
		KeepRunningUntilFailureNodeImpl keepRunningUntilFailureNode = new KeepRunningUntilFailureNodeImpl();
		return keepRunningUntilFailureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InverterNode createInverterNode() {
		InverterNodeImpl inverterNode = new InverterNodeImpl();
		return inverterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForceSuccessNode createForceSuccessNode() {
		ForceSuccessNodeImpl forceSuccessNode = new ForceSuccessNodeImpl();
		return forceSuccessNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForceFailureNode createForceFailureNode() {
		ForceFailureNodeImpl forceFailureNode = new ForceFailureNodeImpl();
		return forceFailureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepeatNode createRepeatNode() {
		RepeatNodeImpl repeatNode = new RepeatNodeImpl();
		return repeatNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubTree createSubTree() {
		SubTreeImpl subTree = new SubTreeImpl();
		return subTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptNode createScriptNode() {
		ScriptNodeImpl scriptNode = new ScriptNodeImpl();
		return scriptNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptConditionNode createScriptConditionNode() {
		ScriptConditionNodeImpl scriptConditionNode = new ScriptConditionNodeImpl();
		return scriptConditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetryNode createRetryNode() {
		RetryNodeImpl retryNode = new RetryNodeImpl();
		return retryNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityRequirement createQualityRequirement() {
		QualityRequirementImpl qualityRequirement = new QualityRequirementImpl();
		return qualityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quality createQuality() {
		QualityImpl quality = new QualityImpl();
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelAllNode createParallelAllNode() {
		ParallelAllNodeImpl parallelAllNode = new ParallelAllNodeImpl();
		return parallelAllNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DelayNode createDelayNode() {
		DelayNodeImpl delayNode = new DelayNodeImpl();
		return delayNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreconditionNode createPreconditionNode() {
		PreconditionNodeImpl preconditionNode = new PreconditionNodeImpl();
		return preconditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryUpdatedDecoratorNode createEntryUpdatedDecoratorNode() {
		EntryUpdatedDecoratorNodeImpl entryUpdatedDecoratorNode = new EntryUpdatedDecoratorNodeImpl();
		return entryUpdatedDecoratorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunOnceNode createRunOnceNode() {
		RunOnceNodeImpl runOnceNode = new RunOnceNodeImpl();
		return runOnceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopNode createLoopNode() {
		LoopNodeImpl loopNode = new LoopNodeImpl();
		return loopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsumeQueueNode createConsumeQueueNode() {
		ConsumeQueueNodeImpl consumeQueueNode = new ConsumeQueueNodeImpl();
		return consumeQueueNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestNode createTestNode() {
		TestNodeImpl testNode = new TestNodeImpl();
		return testNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryUpdatedActionNode createEntryUpdatedActionNode() {
		EntryUpdatedActionNodeImpl entryUpdatedActionNode = new EntryUpdatedActionNodeImpl();
		return entryUpdatedActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsetBlackboardNode createUnsetBlackboardNode() {
		UnsetBlackboardNodeImpl unsetBlackboardNode = new UnsetBlackboardNodeImpl();
		return unsetBlackboardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadedActionNode createThreadedActionNode() {
		ThreadedActionNodeImpl threadedActionNode = new ThreadedActionNodeImpl();
		return threadedActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoroActionNode createCoroActionNode() {
		CoroActionNodeImpl coroActionNode = new CoroActionNodeImpl();
		return coroActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SleepNode createSleepNode() {
		SleepNodeImpl sleepNode = new SleepNodeImpl();
		return sleepNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PopFromQueueNode createPopFromQueueNode() {
		PopFromQueueNodeImpl popFromQueueNode = new PopFromQueueNodeImpl();
		return popFromQueueNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BtcppPackage getBtcppPackage() {
		return (BtcppPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BtcppPackage getPackage() {
		return BtcppPackage.eINSTANCE;
	}

} //BtcppFactoryImpl
