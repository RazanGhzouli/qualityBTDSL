/**
 */
package bt.cpp.btcpp.impl;

import bt.cpp.btcpp.*;

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
			BtcppFactory theBtcppFactory = (BtcppFactory) EPackage.Registry.INSTANCE.getEFactory(BtcppPackage.eNS_URI);
			if (theBtcppFactory != null) {
				return theBtcppFactory;
			}
		} catch (Exception exception) {
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
		case BtcppPackage.BEHAVIOR_TREE:
			return createBehaviorTree();
		case BtcppPackage.CONTROL_NODE:
			return createControlNode();
		case BtcppPackage.DECORATOR_NODE:
			return createDecoratorNode();
		case BtcppPackage.ALWAYS_FAILURE_NODE:
			return createAlwaysFailureNode();
		case BtcppPackage.ALWAYS_SUCCESS_NODE:
			return createAlwaysSuccessNode();
		case BtcppPackage.SET_BLACKBOARD_NODE:
			return createSetBlackboardNode();
		case BtcppPackage.FALLBACK_NODE:
			return createFallbackNode();
		case BtcppPackage.IF_THEN_ELSE_NODE:
			return createIfThenElseNode();
		case BtcppPackage.MNUAL_NODE:
			return createMnualNode();
		case BtcppPackage.PARALLEL_NODE:
			return createParallelNode();
		case BtcppPackage.SEQUENCE_STAR_NODE:
			return createSequenceStarNode();
		case BtcppPackage.SWITCH_NODE:
			return createSwitchNode();
		case BtcppPackage.REACTIVE_FALLBACK:
			return createReactiveFallback();
		case BtcppPackage.WHILE_DO_ELSE_NODE:
			return createWhileDoElseNode();
		case BtcppPackage.REACTIVE_SEQUENCE:
			return createReactiveSequence();
		case BtcppPackage.SEQUENCE_NODE:
			return createSequenceNode();
		case BtcppPackage.SUBTREE_NODE:
			return createSubtreeNode();
		case BtcppPackage.TIMEOUT_NODE:
			return createTimeoutNode();
		case BtcppPackage.KEEP_RUNNING_UNTIL_FAILURE_NODE:
			return createKeepRunningUntilFailureNode();
		case BtcppPackage.TIMER_QUEUE_NODE:
			return createTimerQueueNode();
		case BtcppPackage.INVERTER_NODE:
			return createInverterNode();
		case BtcppPackage.FORCE_SUCCESS_NODE:
			return createForceSuccessNode();
		case BtcppPackage.FORCE_FAILURE_NODE:
			return createForceFailureNode();
		case BtcppPackage.REPEAT_NODE:
			return createRepeatNode();
		case BtcppPackage.BLACKBOARD_PRECONDITION:
			return createBlackboardPrecondition();
		case BtcppPackage.BLACK_BOARD:
			return createBlackBoard();
		case BtcppPackage.NODE_CONFIGURATION:
			return createNodeConfiguration();
		case BtcppPackage.CONDITION_NODE:
			return createConditionNode();
		case BtcppPackage.SUB_TREE:
			return createSubTree();
		case BtcppPackage.LEAF_NODE:
			return createLeafNode();
		case BtcppPackage.SYNC_ACTION_NODE:
			return createSyncActionNode();
		case BtcppPackage.ACTION_NODE_BASE:
			return createActionNodeBase();
		case BtcppPackage.ASYNC_ACTION_NODE:
			return createAsyncActionNode();
		case BtcppPackage.SIMPLE_ACTION_NODE:
			return createSimpleActionNode();
		case BtcppPackage.STATEFUL_ACTION_NODE:
			return createStatefulActionNode();
		case BtcppPackage.CORO_ACTION_NODE:
			return createCoroActionNode();
		case BtcppPackage.SIMPLE_CONDITION_NODE:
			return createSimpleConditionNode();
		case BtcppPackage.RETRY_NODE:
			return createRetryNode();
		case BtcppPackage.ROOT:
			return createRoot();
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
		case BtcppPackage.PORT_DIRECTION:
			return createPortDirectionFromString(eDataType, initialValue);
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
		case BtcppPackage.PORT_DIRECTION:
			return convertPortDirectionToString(eDataType, instanceValue);
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
	public ControlNode createControlNode() {
		ControlNodeImpl controlNode = new ControlNodeImpl();
		return controlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecoratorNode createDecoratorNode() {
		DecoratorNodeImpl decoratorNode = new DecoratorNodeImpl();
		return decoratorNode;
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
	public MnualNode createMnualNode() {
		MnualNodeImpl mnualNode = new MnualNodeImpl();
		return mnualNode;
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
	public SequenceStarNode createSequenceStarNode() {
		SequenceStarNodeImpl sequenceStarNode = new SequenceStarNodeImpl();
		return sequenceStarNode;
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
	public ReactiveFallback createReactiveFallback() {
		ReactiveFallbackImpl reactiveFallback = new ReactiveFallbackImpl();
		return reactiveFallback;
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
	public ReactiveSequence createReactiveSequence() {
		ReactiveSequenceImpl reactiveSequence = new ReactiveSequenceImpl();
		return reactiveSequence;
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
	public SubtreeNode createSubtreeNode() {
		SubtreeNodeImpl subtreeNode = new SubtreeNodeImpl();
		return subtreeNode;
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
	public TimerQueueNode createTimerQueueNode() {
		TimerQueueNodeImpl timerQueueNode = new TimerQueueNodeImpl();
		return timerQueueNode;
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
	public BlackboardPrecondition createBlackboardPrecondition() {
		BlackboardPreconditionImpl blackboardPrecondition = new BlackboardPreconditionImpl();
		return blackboardPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlackBoard createBlackBoard() {
		BlackBoardImpl blackBoard = new BlackBoardImpl();
		return blackBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeConfiguration createNodeConfiguration() {
		NodeConfigurationImpl nodeConfiguration = new NodeConfigurationImpl();
		return nodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionNode createConditionNode() {
		ConditionNodeImpl conditionNode = new ConditionNodeImpl();
		return conditionNode;
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
	public LeafNode createLeafNode() {
		LeafNodeImpl leafNode = new LeafNodeImpl();
		return leafNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyncActionNode createSyncActionNode() {
		SyncActionNodeImpl syncActionNode = new SyncActionNodeImpl();
		return syncActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionNodeBase createActionNodeBase() {
		ActionNodeBaseImpl actionNodeBase = new ActionNodeBaseImpl();
		return actionNodeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AsyncActionNode createAsyncActionNode() {
		AsyncActionNodeImpl asyncActionNode = new AsyncActionNodeImpl();
		return asyncActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleActionNode createSimpleActionNode() {
		SimpleActionNodeImpl simpleActionNode = new SimpleActionNodeImpl();
		return simpleActionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatefulActionNode createStatefulActionNode() {
		StatefulActionNodeImpl statefulActionNode = new StatefulActionNodeImpl();
		return statefulActionNode;
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
	public SimpleConditionNode createSimpleConditionNode() {
		SimpleConditionNodeImpl simpleConditionNode = new SimpleConditionNodeImpl();
		return simpleConditionNode;
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
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
		NodeType result = NodeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public PortDirection createPortDirectionFromString(EDataType eDataType, String initialValue) {
		PortDirection result = PortDirection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BtcppPackage getBtcppPackage() {
		return (BtcppPackage) getEPackage();
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
