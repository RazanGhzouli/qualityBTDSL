/**
 */
package bt.cpp.btcpp.util;

import bt.cpp.btcpp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bt.cpp.btcpp.BtcppPackage
 * @generated
 */
public class BtcppAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BtcppPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcppAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BtcppPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BtcppSwitch<Adapter> modelSwitch = new BtcppSwitch<Adapter>() {
		@Override
		public Adapter caseBehaviorTree(BehaviorTree object) {
			return createBehaviorTreeAdapter();
		}

		@Override
		public Adapter caseTreeNode(TreeNode object) {
			return createTreeNodeAdapter();
		}

		@Override
		public Adapter caseControlNode(ControlNode object) {
			return createControlNodeAdapter();
		}

		@Override
		public Adapter caseDecoratorNode(DecoratorNode object) {
			return createDecoratorNodeAdapter();
		}

		@Override
		public Adapter caseAlwaysFailureNode(AlwaysFailureNode object) {
			return createAlwaysFailureNodeAdapter();
		}

		@Override
		public Adapter caseAlwaysSuccessNode(AlwaysSuccessNode object) {
			return createAlwaysSuccessNodeAdapter();
		}

		@Override
		public Adapter caseSetBlackboardNode(SetBlackboardNode object) {
			return createSetBlackboardNodeAdapter();
		}

		@Override
		public Adapter caseFallbackNode(FallbackNode object) {
			return createFallbackNodeAdapter();
		}

		@Override
		public Adapter caseIfThenElseNode(IfThenElseNode object) {
			return createIfThenElseNodeAdapter();
		}

		@Override
		public Adapter caseMnualNode(MnualNode object) {
			return createMnualNodeAdapter();
		}

		@Override
		public Adapter caseParallelNode(ParallelNode object) {
			return createParallelNodeAdapter();
		}

		@Override
		public Adapter caseSequenceStarNode(SequenceStarNode object) {
			return createSequenceStarNodeAdapter();
		}

		@Override
		public Adapter caseSwitchNode(SwitchNode object) {
			return createSwitchNodeAdapter();
		}

		@Override
		public Adapter caseReactiveFallback(ReactiveFallback object) {
			return createReactiveFallbackAdapter();
		}

		@Override
		public Adapter caseWhileDoElseNode(WhileDoElseNode object) {
			return createWhileDoElseNodeAdapter();
		}

		@Override
		public Adapter caseReactiveSequence(ReactiveSequence object) {
			return createReactiveSequenceAdapter();
		}

		@Override
		public Adapter caseSequenceNode(SequenceNode object) {
			return createSequenceNodeAdapter();
		}

		@Override
		public Adapter caseSubtreeNode(SubtreeNode object) {
			return createSubtreeNodeAdapter();
		}

		@Override
		public Adapter caseTimeoutNode(TimeoutNode object) {
			return createTimeoutNodeAdapter();
		}

		@Override
		public Adapter caseKeepRunningUntilFailureNode(KeepRunningUntilFailureNode object) {
			return createKeepRunningUntilFailureNodeAdapter();
		}

		@Override
		public Adapter caseTimerQueueNode(TimerQueueNode object) {
			return createTimerQueueNodeAdapter();
		}

		@Override
		public Adapter caseInverterNode(InverterNode object) {
			return createInverterNodeAdapter();
		}

		@Override
		public Adapter caseForceSuccessNode(ForceSuccessNode object) {
			return createForceSuccessNodeAdapter();
		}

		@Override
		public Adapter caseForceFailureNode(ForceFailureNode object) {
			return createForceFailureNodeAdapter();
		}

		@Override
		public Adapter caseRepeatNode(RepeatNode object) {
			return createRepeatNodeAdapter();
		}

		@Override
		public Adapter caseBlackboardPrecondition(BlackboardPrecondition object) {
			return createBlackboardPreconditionAdapter();
		}

		@Override
		public Adapter caseBlackBoard(BlackBoard object) {
			return createBlackBoardAdapter();
		}

		@Override
		public Adapter caseNodeConfiguration(NodeConfiguration object) {
			return createNodeConfigurationAdapter();
		}

		@Override
		public Adapter caseConditionNode(ConditionNode object) {
			return createConditionNodeAdapter();
		}

		@Override
		public Adapter caseSubTree(SubTree object) {
			return createSubTreeAdapter();
		}

		@Override
		public Adapter caseLeafNode(LeafNode object) {
			return createLeafNodeAdapter();
		}

		@Override
		public Adapter caseSyncActionNode(SyncActionNode object) {
			return createSyncActionNodeAdapter();
		}

		@Override
		public Adapter caseActionNodeBase(ActionNodeBase object) {
			return createActionNodeBaseAdapter();
		}

		@Override
		public Adapter caseAsyncActionNode(AsyncActionNode object) {
			return createAsyncActionNodeAdapter();
		}

		@Override
		public Adapter caseSimpleActionNode(SimpleActionNode object) {
			return createSimpleActionNodeAdapter();
		}

		@Override
		public Adapter caseStatefulActionNode(StatefulActionNode object) {
			return createStatefulActionNodeAdapter();
		}

		@Override
		public Adapter caseCoroActionNode(CoroActionNode object) {
			return createCoroActionNodeAdapter();
		}

		@Override
		public Adapter caseSimpleConditionNode(SimpleConditionNode object) {
			return createSimpleConditionNodeAdapter();
		}

		@Override
		public Adapter caseRetryNode(RetryNode object) {
			return createRetryNodeAdapter();
		}

		@Override
		public Adapter caseRoot(Root object) {
			return createRootAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.BehaviorTree <em>Behavior Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.BehaviorTree
	 * @generated
	 */
	public Adapter createBehaviorTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.TreeNode <em>Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.TreeNode
	 * @generated
	 */
	public Adapter createTreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.DecoratorNode <em>Decorator Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.DecoratorNode
	 * @generated
	 */
	public Adapter createDecoratorNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.AlwaysFailureNode <em>Always Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.AlwaysFailureNode
	 * @generated
	 */
	public Adapter createAlwaysFailureNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.AlwaysSuccessNode <em>Always Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.AlwaysSuccessNode
	 * @generated
	 */
	public Adapter createAlwaysSuccessNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.SetBlackboardNode <em>Set Blackboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.SetBlackboardNode
	 * @generated
	 */
	public Adapter createSetBlackboardNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.FallbackNode <em>Fallback Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.FallbackNode
	 * @generated
	 */
	public Adapter createFallbackNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.IfThenElseNode <em>If Then Else Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.IfThenElseNode
	 * @generated
	 */
	public Adapter createIfThenElseNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.MnualNode <em>Mnual Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.MnualNode
	 * @generated
	 */
	public Adapter createMnualNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.ParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.ParallelNode
	 * @generated
	 */
	public Adapter createParallelNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.SequenceStarNode <em>Sequence Star Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.SequenceStarNode
	 * @generated
	 */
	public Adapter createSequenceStarNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.SwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.SwitchNode
	 * @generated
	 */
	public Adapter createSwitchNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.ReactiveFallback <em>Reactive Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.ReactiveFallback
	 * @generated
	 */
	public Adapter createReactiveFallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.WhileDoElseNode <em>While Do Else Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.WhileDoElseNode
	 * @generated
	 */
	public Adapter createWhileDoElseNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.ReactiveSequence <em>Reactive Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.ReactiveSequence
	 * @generated
	 */
	public Adapter createReactiveSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.SequenceNode
	 * @generated
	 */
	public Adapter createSequenceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.SubtreeNode <em>Subtree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.SubtreeNode
	 * @generated
	 */
	public Adapter createSubtreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.TimeoutNode <em>Timeout Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.TimeoutNode
	 * @generated
	 */
	public Adapter createTimeoutNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.KeepRunningUntilFailureNode <em>Keep Running Until Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.KeepRunningUntilFailureNode
	 * @generated
	 */
	public Adapter createKeepRunningUntilFailureNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.TimerQueueNode <em>Timer Queue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.TimerQueueNode
	 * @generated
	 */
	public Adapter createTimerQueueNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.InverterNode <em>Inverter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.InverterNode
	 * @generated
	 */
	public Adapter createInverterNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.ForceSuccessNode <em>Force Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.ForceSuccessNode
	 * @generated
	 */
	public Adapter createForceSuccessNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.ForceFailureNode <em>Force Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.ForceFailureNode
	 * @generated
	 */
	public Adapter createForceFailureNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.RepeatNode <em>Repeat Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.RepeatNode
	 * @generated
	 */
	public Adapter createRepeatNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.BlackboardPrecondition <em>Blackboard Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.BlackboardPrecondition
	 * @generated
	 */
	public Adapter createBlackboardPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.BlackBoard <em>Black Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.BlackBoard
	 * @generated
	 */
	public Adapter createBlackBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.NodeConfiguration <em>Node Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.NodeConfiguration
	 * @generated
	 */
	public Adapter createNodeConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.ConditionNode <em>Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.ConditionNode
	 * @generated
	 */
	public Adapter createConditionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.SubTree <em>Sub Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.SubTree
	 * @generated
	 */
	public Adapter createSubTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.LeafNode <em>Leaf Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.LeafNode
	 * @generated
	 */
	public Adapter createLeafNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.SyncActionNode <em>Sync Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.SyncActionNode
	 * @generated
	 */
	public Adapter createSyncActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.ActionNodeBase <em>Action Node Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.ActionNodeBase
	 * @generated
	 */
	public Adapter createActionNodeBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.AsyncActionNode <em>Async Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.AsyncActionNode
	 * @generated
	 */
	public Adapter createAsyncActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.SimpleActionNode <em>Simple Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.SimpleActionNode
	 * @generated
	 */
	public Adapter createSimpleActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.StatefulActionNode <em>Stateful Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.StatefulActionNode
	 * @generated
	 */
	public Adapter createStatefulActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.CoroActionNode <em>Coro Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.CoroActionNode
	 * @generated
	 */
	public Adapter createCoroActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.SimpleConditionNode <em>Simple Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.SimpleConditionNode
	 * @generated
	 */
	public Adapter createSimpleConditionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.RetryNode <em>Retry Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.RetryNode
	 * @generated
	 */
	public Adapter createRetryNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bt.cpp.btcpp.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bt.cpp.btcpp.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BtcppAdapterFactory
