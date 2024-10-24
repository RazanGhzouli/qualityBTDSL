/**
 */
package btcpp.provider;


import btcpp.BehaviorTree;
import btcpp.BtcppFactory;
import btcpp.BtcppPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link btcpp.BehaviorTree} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorTreeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorTreeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BehaviorTree_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BehaviorTree_ID_feature", "_UI_BehaviorTree_type"),
				 BtcppPackage.Literals.BEHAVIOR_TREE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BtcppPackage.Literals.BEHAVIOR_TREE__NODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BehaviorTree.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BehaviorTree"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BehaviorTree)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_BehaviorTree_type") :
			getString("_UI_BehaviorTree_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BehaviorTree.class)) {
			case BtcppPackage.BEHAVIOR_TREE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BtcppPackage.BEHAVIOR_TREE__NODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createAlwaysFailureNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createAlwaysSuccessNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createSetBlackboardNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createFallbackNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createIfThenElseNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createManualSelectorNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createParallelNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createSequenceWithMemoryNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createSwitchNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createReactiveFallbackNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createWhileDoElseNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createReactiveSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createTimeoutNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createKeepRunningUntilFailureNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createInverterNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createForceSuccessNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createForceFailureNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createRepeatNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createSubTree()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createScriptNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createScriptConditionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createRetryNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createParallelAllNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createDelayNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createPreconditionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createEntryUpdatedDecoratorNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createRunOnceNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createConsumeQueueNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createTestNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createEntryUpdatedActionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createUnsetBlackboardNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createThreadedActionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createCoroActionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createSleepNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.BEHAVIOR_TREE__NODE,
				 BtcppFactory.eINSTANCE.createPopFromQueueNode()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BtcppEditPlugin.INSTANCE;
	}

}
