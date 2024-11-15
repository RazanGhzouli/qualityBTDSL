/**
 */
package btcpp.provider;

import btcpp.util.BtcppAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BtcppItemProviderAdapterFactory extends BtcppAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcppItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.BehaviorTree} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorTreeItemProvider behaviorTreeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.BehaviorTree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBehaviorTreeAdapter() {
		if (behaviorTreeItemProvider == null) {
			behaviorTreeItemProvider = new BehaviorTreeItemProvider(this);
		}

		return behaviorTreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.AlwaysFailureNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlwaysFailureNodeItemProvider alwaysFailureNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.AlwaysFailureNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlwaysFailureNodeAdapter() {
		if (alwaysFailureNodeItemProvider == null) {
			alwaysFailureNodeItemProvider = new AlwaysFailureNodeItemProvider(this);
		}

		return alwaysFailureNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.AlwaysSuccessNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlwaysSuccessNodeItemProvider alwaysSuccessNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.AlwaysSuccessNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlwaysSuccessNodeAdapter() {
		if (alwaysSuccessNodeItemProvider == null) {
			alwaysSuccessNodeItemProvider = new AlwaysSuccessNodeItemProvider(this);
		}

		return alwaysSuccessNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.SetBlackboardNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetBlackboardNodeItemProvider setBlackboardNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.SetBlackboardNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetBlackboardNodeAdapter() {
		if (setBlackboardNodeItemProvider == null) {
			setBlackboardNodeItemProvider = new SetBlackboardNodeItemProvider(this);
		}

		return setBlackboardNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.FallbackNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FallbackNodeItemProvider fallbackNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.FallbackNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFallbackNodeAdapter() {
		if (fallbackNodeItemProvider == null) {
			fallbackNodeItemProvider = new FallbackNodeItemProvider(this);
		}

		return fallbackNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.IfThenElseNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseNodeItemProvider ifThenElseNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.IfThenElseNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfThenElseNodeAdapter() {
		if (ifThenElseNodeItemProvider == null) {
			ifThenElseNodeItemProvider = new IfThenElseNodeItemProvider(this);
		}

		return ifThenElseNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ManualSelectorNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualSelectorNodeItemProvider manualSelectorNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ManualSelectorNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManualSelectorNodeAdapter() {
		if (manualSelectorNodeItemProvider == null) {
			manualSelectorNodeItemProvider = new ManualSelectorNodeItemProvider(this);
		}

		return manualSelectorNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ParallelNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelNodeItemProvider parallelNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ParallelNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelNodeAdapter() {
		if (parallelNodeItemProvider == null) {
			parallelNodeItemProvider = new ParallelNodeItemProvider(this);
		}

		return parallelNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.SequenceWithMemoryNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceWithMemoryNodeItemProvider sequenceWithMemoryNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.SequenceWithMemoryNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceWithMemoryNodeAdapter() {
		if (sequenceWithMemoryNodeItemProvider == null) {
			sequenceWithMemoryNodeItemProvider = new SequenceWithMemoryNodeItemProvider(this);
		}

		return sequenceWithMemoryNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.SwitchNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchNodeItemProvider switchNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.SwitchNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwitchNodeAdapter() {
		if (switchNodeItemProvider == null) {
			switchNodeItemProvider = new SwitchNodeItemProvider(this);
		}

		return switchNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ReactiveFallbackNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactiveFallbackNodeItemProvider reactiveFallbackNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ReactiveFallbackNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReactiveFallbackNodeAdapter() {
		if (reactiveFallbackNodeItemProvider == null) {
			reactiveFallbackNodeItemProvider = new ReactiveFallbackNodeItemProvider(this);
		}

		return reactiveFallbackNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.WhileDoElseNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileDoElseNodeItemProvider whileDoElseNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.WhileDoElseNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileDoElseNodeAdapter() {
		if (whileDoElseNodeItemProvider == null) {
			whileDoElseNodeItemProvider = new WhileDoElseNodeItemProvider(this);
		}

		return whileDoElseNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ReactiveSequenceNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactiveSequenceNodeItemProvider reactiveSequenceNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ReactiveSequenceNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReactiveSequenceNodeAdapter() {
		if (reactiveSequenceNodeItemProvider == null) {
			reactiveSequenceNodeItemProvider = new ReactiveSequenceNodeItemProvider(this);
		}

		return reactiveSequenceNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.SequenceNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceNodeItemProvider sequenceNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.SequenceNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceNodeAdapter() {
		if (sequenceNodeItemProvider == null) {
			sequenceNodeItemProvider = new SequenceNodeItemProvider(this);
		}

		return sequenceNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.TimeoutNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeoutNodeItemProvider timeoutNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.TimeoutNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeoutNodeAdapter() {
		if (timeoutNodeItemProvider == null) {
			timeoutNodeItemProvider = new TimeoutNodeItemProvider(this);
		}

		return timeoutNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.KeepRunningUntilFailureNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeepRunningUntilFailureNodeItemProvider keepRunningUntilFailureNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.KeepRunningUntilFailureNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeepRunningUntilFailureNodeAdapter() {
		if (keepRunningUntilFailureNodeItemProvider == null) {
			keepRunningUntilFailureNodeItemProvider = new KeepRunningUntilFailureNodeItemProvider(this);
		}

		return keepRunningUntilFailureNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.InverterNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InverterNodeItemProvider inverterNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.InverterNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInverterNodeAdapter() {
		if (inverterNodeItemProvider == null) {
			inverterNodeItemProvider = new InverterNodeItemProvider(this);
		}

		return inverterNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ForceSuccessNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForceSuccessNodeItemProvider forceSuccessNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ForceSuccessNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForceSuccessNodeAdapter() {
		if (forceSuccessNodeItemProvider == null) {
			forceSuccessNodeItemProvider = new ForceSuccessNodeItemProvider(this);
		}

		return forceSuccessNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ForceFailureNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForceFailureNodeItemProvider forceFailureNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ForceFailureNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForceFailureNodeAdapter() {
		if (forceFailureNodeItemProvider == null) {
			forceFailureNodeItemProvider = new ForceFailureNodeItemProvider(this);
		}

		return forceFailureNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.RepeatNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatNodeItemProvider repeatNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.RepeatNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatNodeAdapter() {
		if (repeatNodeItemProvider == null) {
			repeatNodeItemProvider = new RepeatNodeItemProvider(this);
		}

		return repeatNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.SubTree} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTreeItemProvider subTreeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.SubTree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubTreeAdapter() {
		if (subTreeItemProvider == null) {
			subTreeItemProvider = new SubTreeItemProvider(this);
		}

		return subTreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ScriptNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptNodeItemProvider scriptNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ScriptNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptNodeAdapter() {
		if (scriptNodeItemProvider == null) {
			scriptNodeItemProvider = new ScriptNodeItemProvider(this);
		}

		return scriptNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ScriptConditionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptConditionNodeItemProvider scriptConditionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ScriptConditionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptConditionNodeAdapter() {
		if (scriptConditionNodeItemProvider == null) {
			scriptConditionNodeItemProvider = new ScriptConditionNodeItemProvider(this);
		}

		return scriptConditionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.RetryNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetryNodeItemProvider retryNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.RetryNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRetryNodeAdapter() {
		if (retryNodeItemProvider == null) {
			retryNodeItemProvider = new RetryNodeItemProvider(this);
		}

		return retryNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.Root} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootItemProvider rootItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.Root}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRootAdapter() {
		if (rootItemProvider == null) {
			rootItemProvider = new RootItemProvider(this);
		}

		return rootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.QualityRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityRequirementItemProvider qualityRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.QualityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQualityRequirementAdapter() {
		if (qualityRequirementItemProvider == null) {
			qualityRequirementItemProvider = new QualityRequirementItemProvider(this);
		}

		return qualityRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.Quality} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityItemProvider qualityItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.Quality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQualityAdapter() {
		if (qualityItemProvider == null) {
			qualityItemProvider = new QualityItemProvider(this);
		}

		return qualityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ParallelAllNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelAllNodeItemProvider parallelAllNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ParallelAllNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelAllNodeAdapter() {
		if (parallelAllNodeItemProvider == null) {
			parallelAllNodeItemProvider = new ParallelAllNodeItemProvider(this);
		}

		return parallelAllNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.DelayNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayNodeItemProvider delayNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.DelayNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelayNodeAdapter() {
		if (delayNodeItemProvider == null) {
			delayNodeItemProvider = new DelayNodeItemProvider(this);
		}

		return delayNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.PreconditionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionNodeItemProvider preconditionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.PreconditionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPreconditionNodeAdapter() {
		if (preconditionNodeItemProvider == null) {
			preconditionNodeItemProvider = new PreconditionNodeItemProvider(this);
		}

		return preconditionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.EntryUpdatedDecoratorNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryUpdatedDecoratorNodeItemProvider entryUpdatedDecoratorNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.EntryUpdatedDecoratorNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryUpdatedDecoratorNodeAdapter() {
		if (entryUpdatedDecoratorNodeItemProvider == null) {
			entryUpdatedDecoratorNodeItemProvider = new EntryUpdatedDecoratorNodeItemProvider(this);
		}

		return entryUpdatedDecoratorNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.RunOnceNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunOnceNodeItemProvider runOnceNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.RunOnceNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRunOnceNodeAdapter() {
		if (runOnceNodeItemProvider == null) {
			runOnceNodeItemProvider = new RunOnceNodeItemProvider(this);
		}

		return runOnceNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.LoopNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopNodeItemProvider loopNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.LoopNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopNodeAdapter() {
		if (loopNodeItemProvider == null) {
			loopNodeItemProvider = new LoopNodeItemProvider(this);
		}

		return loopNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ConsumeQueueNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumeQueueNodeItemProvider consumeQueueNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ConsumeQueueNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConsumeQueueNodeAdapter() {
		if (consumeQueueNodeItemProvider == null) {
			consumeQueueNodeItemProvider = new ConsumeQueueNodeItemProvider(this);
		}

		return consumeQueueNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.TestNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestNodeItemProvider testNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.TestNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestNodeAdapter() {
		if (testNodeItemProvider == null) {
			testNodeItemProvider = new TestNodeItemProvider(this);
		}

		return testNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.EntryUpdatedActionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryUpdatedActionNodeItemProvider entryUpdatedActionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.EntryUpdatedActionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryUpdatedActionNodeAdapter() {
		if (entryUpdatedActionNodeItemProvider == null) {
			entryUpdatedActionNodeItemProvider = new EntryUpdatedActionNodeItemProvider(this);
		}

		return entryUpdatedActionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.UnsetBlackboardNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsetBlackboardNodeItemProvider unsetBlackboardNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.UnsetBlackboardNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnsetBlackboardNodeAdapter() {
		if (unsetBlackboardNodeItemProvider == null) {
			unsetBlackboardNodeItemProvider = new UnsetBlackboardNodeItemProvider(this);
		}

		return unsetBlackboardNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.ThreadedActionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadedActionNodeItemProvider threadedActionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.ThreadedActionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThreadedActionNodeAdapter() {
		if (threadedActionNodeItemProvider == null) {
			threadedActionNodeItemProvider = new ThreadedActionNodeItemProvider(this);
		}

		return threadedActionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.CoroActionNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoroActionNodeItemProvider coroActionNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.CoroActionNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCoroActionNodeAdapter() {
		if (coroActionNodeItemProvider == null) {
			coroActionNodeItemProvider = new CoroActionNodeItemProvider(this);
		}

		return coroActionNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.SleepNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SleepNodeItemProvider sleepNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.SleepNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSleepNodeAdapter() {
		if (sleepNodeItemProvider == null) {
			sleepNodeItemProvider = new SleepNodeItemProvider(this);
		}

		return sleepNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link btcpp.PopFromQueueNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopFromQueueNodeItemProvider popFromQueueNodeItemProvider;

	/**
	 * This creates an adapter for a {@link btcpp.PopFromQueueNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPopFromQueueNodeAdapter() {
		if (popFromQueueNodeItemProvider == null) {
			popFromQueueNodeItemProvider = new PopFromQueueNodeItemProvider(this);
		}

		return popFromQueueNodeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (behaviorTreeItemProvider != null) behaviorTreeItemProvider.dispose();
		if (alwaysFailureNodeItemProvider != null) alwaysFailureNodeItemProvider.dispose();
		if (alwaysSuccessNodeItemProvider != null) alwaysSuccessNodeItemProvider.dispose();
		if (setBlackboardNodeItemProvider != null) setBlackboardNodeItemProvider.dispose();
		if (fallbackNodeItemProvider != null) fallbackNodeItemProvider.dispose();
		if (ifThenElseNodeItemProvider != null) ifThenElseNodeItemProvider.dispose();
		if (manualSelectorNodeItemProvider != null) manualSelectorNodeItemProvider.dispose();
		if (parallelNodeItemProvider != null) parallelNodeItemProvider.dispose();
		if (sequenceWithMemoryNodeItemProvider != null) sequenceWithMemoryNodeItemProvider.dispose();
		if (switchNodeItemProvider != null) switchNodeItemProvider.dispose();
		if (reactiveFallbackNodeItemProvider != null) reactiveFallbackNodeItemProvider.dispose();
		if (whileDoElseNodeItemProvider != null) whileDoElseNodeItemProvider.dispose();
		if (reactiveSequenceNodeItemProvider != null) reactiveSequenceNodeItemProvider.dispose();
		if (sequenceNodeItemProvider != null) sequenceNodeItemProvider.dispose();
		if (timeoutNodeItemProvider != null) timeoutNodeItemProvider.dispose();
		if (keepRunningUntilFailureNodeItemProvider != null) keepRunningUntilFailureNodeItemProvider.dispose();
		if (inverterNodeItemProvider != null) inverterNodeItemProvider.dispose();
		if (forceSuccessNodeItemProvider != null) forceSuccessNodeItemProvider.dispose();
		if (forceFailureNodeItemProvider != null) forceFailureNodeItemProvider.dispose();
		if (repeatNodeItemProvider != null) repeatNodeItemProvider.dispose();
		if (subTreeItemProvider != null) subTreeItemProvider.dispose();
		if (scriptNodeItemProvider != null) scriptNodeItemProvider.dispose();
		if (scriptConditionNodeItemProvider != null) scriptConditionNodeItemProvider.dispose();
		if (retryNodeItemProvider != null) retryNodeItemProvider.dispose();
		if (rootItemProvider != null) rootItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (qualityRequirementItemProvider != null) qualityRequirementItemProvider.dispose();
		if (qualityItemProvider != null) qualityItemProvider.dispose();
		if (parallelAllNodeItemProvider != null) parallelAllNodeItemProvider.dispose();
		if (delayNodeItemProvider != null) delayNodeItemProvider.dispose();
		if (preconditionNodeItemProvider != null) preconditionNodeItemProvider.dispose();
		if (entryUpdatedDecoratorNodeItemProvider != null) entryUpdatedDecoratorNodeItemProvider.dispose();
		if (runOnceNodeItemProvider != null) runOnceNodeItemProvider.dispose();
		if (loopNodeItemProvider != null) loopNodeItemProvider.dispose();
		if (consumeQueueNodeItemProvider != null) consumeQueueNodeItemProvider.dispose();
		if (testNodeItemProvider != null) testNodeItemProvider.dispose();
		if (entryUpdatedActionNodeItemProvider != null) entryUpdatedActionNodeItemProvider.dispose();
		if (unsetBlackboardNodeItemProvider != null) unsetBlackboardNodeItemProvider.dispose();
		if (threadedActionNodeItemProvider != null) threadedActionNodeItemProvider.dispose();
		if (coroActionNodeItemProvider != null) coroActionNodeItemProvider.dispose();
		if (sleepNodeItemProvider != null) sleepNodeItemProvider.dispose();
		if (popFromQueueNodeItemProvider != null) popFromQueueNodeItemProvider.dispose();
	}

}
