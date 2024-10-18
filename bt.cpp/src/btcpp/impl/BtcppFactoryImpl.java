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
			case BtcppPackage.FALLBACK_NODE: return createFallbackNode();
			case BtcppPackage.IF_THEN_ELSE_NODE: return createIfThenElseNode();
			case BtcppPackage.MNUAL_NODE: return createMnualNode();
			case BtcppPackage.PARALLEL_NODE: return createParallelNode();
			case BtcppPackage.SEQUENCE_STAR_NODE: return createSequenceStarNode();
			case BtcppPackage.SWITCH_NODE: return createSwitchNode();
			case BtcppPackage.REACTIVE_FALLBACK: return createReactiveFallback();
			case BtcppPackage.WHILE_DO_ELSE_NODE: return createWhileDoElseNode();
			case BtcppPackage.REACTIVE_SEQUENCE: return createReactiveSequence();
			case BtcppPackage.SEQUENCE_NODE: return createSequenceNode();
			case BtcppPackage.SUBTREE_NODE: return createSubtreeNode();
			case BtcppPackage.TIMEOUT_NODE: return createTimeoutNode();
			case BtcppPackage.KEEP_RUNNING_UNTIL_FAILURE_NODE: return createKeepRunningUntilFailureNode();
			case BtcppPackage.TIMER_QUEUE_NODE: return createTimerQueueNode();
			case BtcppPackage.INVERTER_NODE: return createInverterNode();
			case BtcppPackage.FORCE_SUCCESS_NODE: return createForceSuccessNode();
			case BtcppPackage.FORCE_FAILURE_NODE: return createForceFailureNode();
			case BtcppPackage.REPEAT_NODE: return createRepeatNode();
			case BtcppPackage.SUB_TREE: return createSubTree();
			case BtcppPackage.SIMPLE_ACTION_NODE: return createSimpleActionNode();
			case BtcppPackage.SIMPLE_CONDITION_NODE: return createSimpleConditionNode();
			case BtcppPackage.RETRY_NODE: return createRetryNode();
			case BtcppPackage.ROOT: return createRoot();
			case BtcppPackage.BLACKBOARD_CHECK_INT: return createBlackboardCheckInt();
			case BtcppPackage.BLACKBOARD_CHECK_DOUBLE: return createBlackboardCheckDouble();
			case BtcppPackage.BLACKBOARD_CHECK_STRING: return createBlackboardCheckString();
			case BtcppPackage.PARAMETER: return createParameter();
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
	@Override
	public BlackboardCheckInt createBlackboardCheckInt() {
		BlackboardCheckIntImpl blackboardCheckInt = new BlackboardCheckIntImpl();
		return blackboardCheckInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlackboardCheckDouble createBlackboardCheckDouble() {
		BlackboardCheckDoubleImpl blackboardCheckDouble = new BlackboardCheckDoubleImpl();
		return blackboardCheckDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlackboardCheckString createBlackboardCheckString() {
		BlackboardCheckStringImpl blackboardCheckString = new BlackboardCheckStringImpl();
		return blackboardCheckString;
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
