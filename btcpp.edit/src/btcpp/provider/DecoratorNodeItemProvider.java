/**
 */
package btcpp.provider;


import btcpp.BtcppFactory;
import btcpp.BtcppPackage;
import btcpp.DecoratorNode;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link btcpp.DecoratorNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DecoratorNodeItemProvider extends TreeNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecoratorNodeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(BtcppPackage.Literals.DECORATOR_NODE__CHILD);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DecoratorNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DecoratorNode_type") :
			getString("_UI_DecoratorNode_type") + " " + label;
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

		switch (notification.getFeatureID(DecoratorNode.class)) {
			case BtcppPackage.DECORATOR_NODE__CHILD:
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
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createAlwaysFailureNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createAlwaysSuccessNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createSetBlackboardNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createFallbackNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createIfThenElseNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createManualSelectorNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createParallelNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createSequenceWithMemoryNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createSwitchNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createReactiveFallbackNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createWhileDoElseNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createReactiveSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createTimeoutNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createKeepRunningUntilFailureNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createInverterNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createForceSuccessNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createForceFailureNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createRepeatNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createSubTree()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createScriptNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createScriptConditionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createRetryNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createParallelAllNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createDelayNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createPreconditionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createEntryUpdatedDecoratorNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createRunOnceNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createConsumeQueueNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createTestNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createEntryUpdatedActionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createUnsetBlackboardNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createThreadedActionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createCoroActionNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createSleepNode()));

		newChildDescriptors.add
			(createChildParameter
				(BtcppPackage.Literals.DECORATOR_NODE__CHILD,
				 BtcppFactory.eINSTANCE.createPopFromQueueNode()));
	}

}
