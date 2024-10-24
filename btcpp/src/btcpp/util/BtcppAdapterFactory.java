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
			public Adapter caseManualSelectorNode(ManualSelectorNode object) {
				return createManualSelectorNodeAdapter();
			}
			@Override
			public Adapter caseParallelNode(ParallelNode object) {
				return createParallelNodeAdapter();
			}
			@Override
			public Adapter caseSequenceWithMemoryNode(SequenceWithMemoryNode object) {
				return createSequenceWithMemoryNodeAdapter();
			}
			@Override
			public Adapter caseSwitchNode(SwitchNode object) {
				return createSwitchNodeAdapter();
			}
			@Override
			public Adapter caseReactiveFallbackNode(ReactiveFallbackNode object) {
				return createReactiveFallbackNodeAdapter();
			}
			@Override
			public Adapter caseWhileDoElseNode(WhileDoElseNode object) {
				return createWhileDoElseNodeAdapter();
			}
			@Override
			public Adapter caseReactiveSequenceNode(ReactiveSequenceNode object) {
				return createReactiveSequenceNodeAdapter();
			}
			@Override
			public Adapter caseSequenceNode(SequenceNode object) {
				return createSequenceNodeAdapter();
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
			public Adapter caseScriptNode(ScriptNode object) {
				return createScriptNodeAdapter();
			}
			@Override
			public Adapter caseScriptConditionNode(ScriptConditionNode object) {
				return createScriptConditionNodeAdapter();
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
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseQualityRequirement(QualityRequirement object) {
				return createQualityRequirementAdapter();
			}
			@Override
			public Adapter caseQuality(Quality object) {
				return createQualityAdapter();
			}
			@Override
			public Adapter caseParallelAllNode(ParallelAllNode object) {
				return createParallelAllNodeAdapter();
			}
			@Override
			public Adapter caseDelayNode(DelayNode object) {
				return createDelayNodeAdapter();
			}
			@Override
			public Adapter casePreconditionNode(PreconditionNode object) {
				return createPreconditionNodeAdapter();
			}
			@Override
			public Adapter caseEntryUpdatedDecoratorNode(EntryUpdatedDecoratorNode object) {
				return createEntryUpdatedDecoratorNodeAdapter();
			}
			@Override
			public Adapter caseRunOnceNode(RunOnceNode object) {
				return createRunOnceNodeAdapter();
			}
			@Override
			public Adapter caseLoopNode(LoopNode object) {
				return createLoopNodeAdapter();
			}
			@Override
			public Adapter caseConsumeQueueNode(ConsumeQueueNode object) {
				return createConsumeQueueNodeAdapter();
			}
			@Override
			public Adapter caseTestNode(TestNode object) {
				return createTestNodeAdapter();
			}
			@Override
			public Adapter caseEntryUpdatedActionNode(EntryUpdatedActionNode object) {
				return createEntryUpdatedActionNodeAdapter();
			}
			@Override
			public Adapter caseUnsetBlackboardNode(UnsetBlackboardNode object) {
				return createUnsetBlackboardNodeAdapter();
			}
			@Override
			public Adapter caseSyncActionNode(SyncActionNode object) {
				return createSyncActionNodeAdapter();
			}
			@Override
			public Adapter caseThreadedActionNode(ThreadedActionNode object) {
				return createThreadedActionNodeAdapter();
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
			public Adapter caseAsynchActionNode(AsynchActionNode object) {
				return createAsynchActionNodeAdapter();
			}
			@Override
			public Adapter caseSleepNode(SleepNode object) {
				return createSleepNodeAdapter();
			}
			@Override
			public Adapter casePopFromQueueNode(PopFromQueueNode object) {
				return createPopFromQueueNodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link btcpp.ManualSelectorNode <em>Manual Selector Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ManualSelectorNode
	 * @generated
	 */
	public Adapter createManualSelectorNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link btcpp.SequenceWithMemoryNode <em>Sequence With Memory Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SequenceWithMemoryNode
	 * @generated
	 */
	public Adapter createSequenceWithMemoryNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link btcpp.ReactiveFallbackNode <em>Reactive Fallback Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ReactiveFallbackNode
	 * @generated
	 */
	public Adapter createReactiveFallbackNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link btcpp.ReactiveSequenceNode <em>Reactive Sequence Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ReactiveSequenceNode
	 * @generated
	 */
	public Adapter createReactiveSequenceNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link btcpp.ScriptNode <em>Script Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ScriptNode
	 * @generated
	 */
	public Adapter createScriptNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ScriptConditionNode <em>Script Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ScriptConditionNode
	 * @generated
	 */
	public Adapter createScriptConditionNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link btcpp.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.QualityRequirement
	 * @generated
	 */
	public Adapter createQualityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.Quality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.Quality
	 * @generated
	 */
	public Adapter createQualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ParallelAllNode <em>Parallel All Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ParallelAllNode
	 * @generated
	 */
	public Adapter createParallelAllNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.DelayNode <em>Delay Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.DelayNode
	 * @generated
	 */
	public Adapter createDelayNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.PreconditionNode <em>Precondition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.PreconditionNode
	 * @generated
	 */
	public Adapter createPreconditionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.EntryUpdatedDecoratorNode <em>Entry Updated Decorator Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.EntryUpdatedDecoratorNode
	 * @generated
	 */
	public Adapter createEntryUpdatedDecoratorNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.RunOnceNode <em>Run Once Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.RunOnceNode
	 * @generated
	 */
	public Adapter createRunOnceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.LoopNode <em>Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.LoopNode
	 * @generated
	 */
	public Adapter createLoopNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ConsumeQueueNode <em>Consume Queue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ConsumeQueueNode
	 * @generated
	 */
	public Adapter createConsumeQueueNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.TestNode <em>Test Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.TestNode
	 * @generated
	 */
	public Adapter createTestNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.EntryUpdatedActionNode <em>Entry Updated Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.EntryUpdatedActionNode
	 * @generated
	 */
	public Adapter createEntryUpdatedActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.UnsetBlackboardNode <em>Unset Blackboard Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.UnsetBlackboardNode
	 * @generated
	 */
	public Adapter createUnsetBlackboardNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SyncActionNode <em>Sync Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SyncActionNode
	 * @generated
	 */
	public Adapter createSyncActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.ThreadedActionNode <em>Threaded Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.ThreadedActionNode
	 * @generated
	 */
	public Adapter createThreadedActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.StatefulActionNode <em>Stateful Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.StatefulActionNode
	 * @generated
	 */
	public Adapter createStatefulActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.CoroActionNode <em>Coro Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.CoroActionNode
	 * @generated
	 */
	public Adapter createCoroActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.AsynchActionNode <em>Asynch Action Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.AsynchActionNode
	 * @generated
	 */
	public Adapter createAsynchActionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.SleepNode <em>Sleep Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.SleepNode
	 * @generated
	 */
	public Adapter createSleepNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link btcpp.PopFromQueueNode <em>Pop From Queue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see btcpp.PopFromQueueNode
	 * @generated
	 */
	public Adapter createPopFromQueueNodeAdapter() {
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
