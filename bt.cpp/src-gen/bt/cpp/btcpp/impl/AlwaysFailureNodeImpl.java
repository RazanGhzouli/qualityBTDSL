/**
 */
package bt.cpp.btcpp.impl;

import bt.cpp.btcpp.AlwaysFailureNode;
import bt.cpp.btcpp.BtcppPackage;
import bt.cpp.btcpp.SyncActionNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Always Failure Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.impl.AlwaysFailureNodeImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlwaysFailureNodeImpl extends MinimalEObjectImpl.Container implements AlwaysFailureNode {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected SyncActionNode actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlwaysFailureNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.ALWAYS_FAILURE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyncActionNode getActions() {
		if (actions != null && actions.eIsProxy()) {
			InternalEObject oldActions = (InternalEObject) actions;
			actions = (SyncActionNode) eResolveProxy(oldActions);
			if (actions != oldActions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BtcppPackage.ALWAYS_FAILURE_NODE__ACTIONS,
							oldActions, actions));
			}
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyncActionNode basicGetActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActions(SyncActionNode newActions) {
		SyncActionNode oldActions = actions;
		actions = newActions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.ALWAYS_FAILURE_NODE__ACTIONS, oldActions,
					actions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BtcppPackage.ALWAYS_FAILURE_NODE__ACTIONS:
			if (resolve)
				return getActions();
			return basicGetActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BtcppPackage.ALWAYS_FAILURE_NODE__ACTIONS:
			setActions((SyncActionNode) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BtcppPackage.ALWAYS_FAILURE_NODE__ACTIONS:
			setActions((SyncActionNode) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BtcppPackage.ALWAYS_FAILURE_NODE__ACTIONS:
			return actions != null;
		}
		return super.eIsSet(featureID);
	}

} //AlwaysFailureNodeImpl
