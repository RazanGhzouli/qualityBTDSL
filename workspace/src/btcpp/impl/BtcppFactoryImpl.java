/**
 */
package btcpp.impl;

import btcpp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case BtcppPackage.SELECTOR_NODE: return createSelectorNode();
			case BtcppPackage.IF_THEN_ELSE_NODE: return createIfThenElseNode();
			case BtcppPackage.MANUAL_SELECTOR_NODE: return createManualSelectorNode();
			case BtcppPackage.PARALLEL_NODE: return createParallelNode();
			case BtcppPackage.SEQUENCE_WITH_MEMORY: return createSequenceWithMemory();
			case BtcppPackage.SWITCH_NODE: return createSwitchNode();
			case BtcppPackage.REACTIVE_SELECTOR: return createReactiveSelector();
			case BtcppPackage.WHILE_DO_ELSE_NODE: return createWhileDoElseNode();
			case BtcppPackage.REACTIVE_SEQUENCE: return createReactiveSequence();
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
			case BtcppPackage.SELECTOR_WITH_MEMORY: return createSelectorWithMemory();
			case BtcppPackage.PARALLEL_ALL_NODE: return createParallelAllNode();
			case BtcppPackage.DELAY_NODE: return createDelayNode();
			case BtcppPackage.PRECONDITION_NODE: return createPreconditionNode();
			case BtcppPackage.ENTRY_UPDATED_DECORATOR_NODE: return createEntryUpdatedDecoratorNode();
			case BtcppPackage.RUN_ONCE_NODE: return createRunOnceNode();
			case BtcppPackage.LOOP_NODE: return createLoopNode();
			case BtcppPackage.CONSUME_QUEUE_NODE: return createConsumeQueueNode();
			case BtcppPackage.COUNT_NODE: return createCountNode();
			case BtcppPackage.ETERNAL_GUARD_NODE: return createEternalGuardNode();
			case BtcppPackage.STATUS_TO_BLACKBOARD_NODE: return createStatusToBlackboardNode();
			case BtcppPackage.FAILURE_IS_RUNNING_NODE: return createFailureIsRunningNode();
			case BtcppPackage.FAILURE_IS_SUCCESS_NODE: return createFailureIsSuccessNode();
			case BtcppPackage.RUNNING_IS_FAILURE_NODE: return createRunningIsFailureNode();
			case BtcppPackage.RUNNING_IS_SUCCESS_NODE: return createRunningIsSuccessNode();
			case BtcppPackage.SUCCESS_IS_FAILURE_NODE: return createSuccessIsFailureNode();
			case BtcppPackage.SUCCESS_IS_RUNNING_NODE: return createSuccessIsRunningNode();
			case BtcppPackage.TEST_NODE: return createTestNode();
			case BtcppPackage.ENTRY_UPDATED_ACTION_NODE: return createEntryUpdatedActionNode();
			case BtcppPackage.UNSET_BLACKBOARD_NODE: return createUnsetBlackboardNode();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BtcppPackage.NODE_TYPE:
				return createNodeTypeFromString(eDataType, initialValue);
			case BtcppPackage.NODE_STATUS:
				return createNodeStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BtcppPackage.NODE_TYPE:
				return convertNodeTypeToString(eDataType, instanceValue);
			case BtcppPackage.NODE_STATUS:
				return convertNodeStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTree createBehaviorTree() {
		BehaviorTreeImpl behaviorTree = new BehaviorTreeImpl();
		return behaviorTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlwaysFailureNode createAlwaysFailureNode() {
		AlwaysFailureNodeImpl alwaysFailureNode = new AlwaysFailureNodeImpl();
		return alwaysFailureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlwaysSuccessNode createAlwaysSuccessNode() {
		AlwaysSuccessNodeImpl alwaysSuccessNode = new AlwaysSuccessNodeImpl();
		return alwaysSuccessNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetBlackboardNode createSetBlackboardNode() {
		SetBlackboardNodeImpl setBlackboardNode = new SetBlackboardNodeImpl();
		return setBlackboardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorNode createSelectorNode() {
		SelectorNodeImpl selectorNode = new SelectorNodeImpl();
		return selectorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenElseNode createIfThenElseNode() {
		IfThenElseNodeImpl ifThenElseNode = new IfThenElseNodeImpl();
		return ifThenElseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualSelectorNode createManualSelectorNode() {
		ManualSelectorNodeImpl manualSelectorNode = new ManualSelectorNodeImpl();
		return manualSelectorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelNode createParallelNode() {
		ParallelNodeImpl parallelNode = new ParallelNodeImpl();
		return parallelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceWithMemory createSequenceWithMemory() {
		SequenceWithMemoryImpl sequenceWithMemory = new SequenceWithMemoryImpl();
		return sequenceWithMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchNode createSwitchNode() {
		SwitchNodeImpl switchNode = new SwitchNodeImpl();
		return switchNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveSelector createReactiveSelector() {
		ReactiveSelectorImpl reactiveSelector = new ReactiveSelectorImpl();
		return reactiveSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileDoElseNode createWhileDoElseNode() {
		WhileDoElseNodeImpl whileDoElseNode = new WhileDoElseNodeImpl();
		return whileDoElseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveSequence createReactiveSequence() {
		ReactiveSequenceImpl reactiveSequence = new ReactiveSequenceImpl();
		return reactiveSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceNode createSequenceNode() {
		SequenceNodeImpl sequenceNode = new SequenceNodeImpl();
		return sequenceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeoutNode createTimeoutNode() {
		TimeoutNodeImpl timeoutNode = new TimeoutNodeImpl();
		return timeoutNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepRunningUntilFailureNode createKeepRunningUntilFailureNode() {
		KeepRunningUntilFailureNodeImpl keepRunningUntilFailureNode = new KeepRunningUntilFailureNodeImpl();
		return keepRunningUntilFailureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverterNode createInverterNode() {
		InverterNodeImpl inverterNode = new InverterNodeImpl();
		return inverterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForceSuccessNode createForceSuccessNode() {
		ForceSuccessNodeImpl forceSuccessNode = new ForceSuccessNodeImpl();
		return forceSuccessNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForceFailureNode createForceFailureNode() {
		ForceFailureNodeImpl forceFailureNode = new ForceFailureNodeImpl();
		return forceFailureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatNode createRepeatNode() {
		RepeatNodeImpl repeatNode = new RepeatNodeImpl();
		return repeatNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubTree createSubTree() {
		SubTreeImpl subTree = new SubTreeImpl();
		return subTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptNode createScriptNode() {
		ScriptNodeImpl scriptNode = new ScriptNodeImpl();
		return scriptNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptConditionNode createScriptConditionNode() {
		ScriptConditionNodeImpl scriptConditionNode = new ScriptConditionNodeImpl();
		return scriptConditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryNode createRetryNode() {
		RetryNodeImpl retryNode = new RetryNodeImpl();
		return retryNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityRequirement createQualityRequirement() {
		QualityRequirementImpl qualityRequirement = new QualityRequirementImpl();
		return qualityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quality createQuality() {
		QualityImpl quality = new QualityImpl();
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectorWithMemory createSelectorWithMemory() {
		SelectorWithMemoryImpl selectorWithMemory = new SelectorWithMemoryImpl();
		return selectorWithMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelAllNode createParallelAllNode() {
		ParallelAllNodeImpl parallelAllNode = new ParallelAllNodeImpl();
		return parallelAllNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayNode createDelayNode() {
		DelayNodeImpl delayNode = new DelayNodeImpl();
		return delayNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionNode createPreconditionNode() {
		PreconditionNodeImpl preconditionNode = new PreconditionNodeImpl();
		return preconditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryUpdatedDecoratorNode createEntryUpdatedDecoratorNode() {
		EntryUpdatedDecoratorNodeImpl entryUpdatedDecoratorNode = new EntryUpdatedDecoratorNodeImpl();
		return entryUpdatedDecoratorNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunOnceNode createRunOnceNode() {
		RunOnceNodeImpl runOnceNode = new RunOnceNodeImpl();
		return runOnceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopNode createLoopNode() {
		LoopNodeImpl loopNode = new LoopNodeImpl();
		return loopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumeQueueNode createConsumeQueueNode() {
		ConsumeQueueNodeImpl consumeQueueNode = new ConsumeQueueNodeImpl();
		return consumeQueueNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountNode createCountNode() {
		CountNodeImpl countNode = new CountNodeImpl();
		return countNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EternalGuardNode createEternalGuardNode() {
		EternalGuardNodeImpl eternalGuardNode = new EternalGuardNodeImpl();
		return eternalGuardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusToBlackboardNode createStatusToBlackboardNode() {
		StatusToBlackboardNodeImpl statusToBlackboardNode = new StatusToBlackboardNodeImpl();
		return statusToBlackboardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureIsRunningNode createFailureIsRunningNode() {
		FailureIsRunningNodeImpl failureIsRunningNode = new FailureIsRunningNodeImpl();
		return failureIsRunningNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureIsSuccessNode createFailureIsSuccessNode() {
		FailureIsSuccessNodeImpl failureIsSuccessNode = new FailureIsSuccessNodeImpl();
		return failureIsSuccessNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunningIsFailureNode createRunningIsFailureNode() {
		RunningIsFailureNodeImpl runningIsFailureNode = new RunningIsFailureNodeImpl();
		return runningIsFailureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunningIsSuccessNode createRunningIsSuccessNode() {
		RunningIsSuccessNodeImpl runningIsSuccessNode = new RunningIsSuccessNodeImpl();
		return runningIsSuccessNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessIsFailureNode createSuccessIsFailureNode() {
		SuccessIsFailureNodeImpl successIsFailureNode = new SuccessIsFailureNodeImpl();
		return successIsFailureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessIsRunningNode createSuccessIsRunningNode() {
		SuccessIsRunningNodeImpl successIsRunningNode = new SuccessIsRunningNodeImpl();
		return successIsRunningNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestNode createTestNode() {
		TestNodeImpl testNode = new TestNodeImpl();
		return testNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryUpdatedActionNode createEntryUpdatedActionNode() {
		EntryUpdatedActionNodeImpl entryUpdatedActionNode = new EntryUpdatedActionNodeImpl();
		return entryUpdatedActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsetBlackboardNode createUnsetBlackboardNode() {
		UnsetBlackboardNodeImpl unsetBlackboardNode = new UnsetBlackboardNodeImpl();
		return unsetBlackboardNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
		NodeType result = NodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeStatus createNodeStatusFromString(EDataType eDataType, String initialValue) {
		NodeStatus result = NodeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
