/**
 */
package btcpp.util;

import btcpp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see btcpp.BtcppPackage
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BtcppSwitch<Adapter> modelSwitch =
		new BtcppSwitch<Adapter>() {
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
			public Adapter caseActionNodeBase(ActionNodeBase object) {
				return createActionNodeBaseAdapter();
			}
			@Override
			public Adapter caseSimpleActionNode(SimpleActionNode object) {
				return createSimpleActionNodeAdapter();
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
			public Adapter caseBlackboardCheckInt(BlackboardCheckInt object) {
				return createBlackboardCheckIntAdapter();
			}
			@Override
			public Adapter caseBlackboardCheckDouble(BlackboardCheckDouble object) {
				return createBlackboardCheckDoubleAdapter();
			}
			@Override
			public Adapter caseBlackboardCheckString(BlackboardCheckString object) {
				return createBlackboardCheckStringAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link btcpp.BehaviorTree <em>Behavior Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.BehaviorTree
	 * @generated
	 */
	public Adapter createBehaviorTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.TreeNode <em>Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.TreeNode
	 * @generated
	 */
	public Adapter createTreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ControlNode
	 * @generated
	 */
	public Adapter createControlNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.DecoratorNode <em>Decorator Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.DecoratorNode
	 * @generated
	 */
	public Adapter createDecoratorNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.AlwaysFailureNode <em>Always Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.AlwaysFailureNode
	 * @generated
	 */
	public Adapter createAlwaysFailureNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.AlwaysSuccessNode <em>Always Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.AlwaysSuccessNode
	 * @generated
	 */
	public Adapter createAlwaysSuccessNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SetBlackboardNode <em>Set Blackboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SetBlackboardNode
	 * @generated
	 */
	public Adapter createSetBlackboardNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.FallbackNode <em>Fallback Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.FallbackNode
	 * @generated
	 */
	public Adapter createFallbackNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.IfThenElseNode <em>If Then Else Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.IfThenElseNode
	 * @generated
	 */
	public Adapter createIfThenElseNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.MnualNode <em>Mnual Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.MnualNode
	 * @generated
	 */
	public Adapter createMnualNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ParallelNode <em>Parallel Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ParallelNode
	 * @generated
	 */
	public Adapter createParallelNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SequenceStarNode <em>Sequence Star Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SequenceStarNode
	 * @generated
	 */
	public Adapter createSequenceStarNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SwitchNode <em>Switch Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SwitchNode
	 * @generated
	 */
	public Adapter createSwitchNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ReactiveFallback <em>Reactive Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ReactiveFallback
	 * @generated
	 */
	public Adapter createReactiveFallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.WhileDoElseNode <em>While Do Else Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.WhileDoElseNode
	 * @generated
	 */
	public Adapter createWhileDoElseNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ReactiveSequence <em>Reactive Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ReactiveSequence
	 * @generated
	 */
	public Adapter createReactiveSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SequenceNode <em>Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SequenceNode
	 * @generated
	 */
	public Adapter createSequenceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SubtreeNode <em>Subtree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SubtreeNode
	 * @generated
	 */
	public Adapter createSubtreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.TimeoutNode <em>Timeout Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.TimeoutNode
	 * @generated
	 */
	public Adapter createTimeoutNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.KeepRunningUntilFailureNode <em>Keep Running Until Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.KeepRunningUntilFailureNode
	 * @generated
	 */
	public Adapter createKeepRunningUntilFailureNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.TimerQueueNode <em>Timer Queue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.TimerQueueNode
	 * @generated
	 */
	public Adapter createTimerQueueNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.InverterNode <em>Inverter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.InverterNode
	 * @generated
	 */
	public Adapter createInverterNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ForceSuccessNode <em>Force Success Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ForceSuccessNode
	 * @generated
	 */
	public Adapter createForceSuccessNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ForceFailureNode <em>Force Failure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ForceFailureNode
	 * @generated
	 */
	public Adapter createForceFailureNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.RepeatNode <em>Repeat Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.RepeatNode
	 * @generated
	 */
	public Adapter createRepeatNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.BlackboardPrecondition <em>Blackboard Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.BlackboardPrecondition
	 * @generated
	 */
	public Adapter createBlackboardPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ConditionNode <em>Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ConditionNode
	 * @generated
	 */
	public Adapter createConditionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SubTree <em>Sub Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SubTree
	 * @generated
	 */
	public Adapter createSubTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.LeafNode <em>Leaf Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.LeafNode
	 * @generated
	 */
	public Adapter createLeafNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ActionNodeBase <em>Action Node Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ActionNodeBase
	 * @generated
	 */
	public Adapter createActionNodeBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SimpleActionNode <em>Simple Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SimpleActionNode
	 * @generated
	 */
	public Adapter createSimpleActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SimpleConditionNode <em>Simple Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SimpleConditionNode
	 * @generated
	 */
	public Adapter createSimpleConditionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.RetryNode <em>Retry Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.RetryNode
	 * @generated
	 */
	public Adapter createRetryNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.BlackboardCheckInt <em>Blackboard Check Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.BlackboardCheckInt
	 * @generated
	 */
	public Adapter createBlackboardCheckIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.BlackboardCheckDouble <em>Blackboard Check Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.BlackboardCheckDouble
	 * @generated
	 */
	public Adapter createBlackboardCheckDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.BlackboardCheckString <em>Blackboard Check String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.BlackboardCheckString
	 * @generated
	 */
	public Adapter createBlackboardCheckStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
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
