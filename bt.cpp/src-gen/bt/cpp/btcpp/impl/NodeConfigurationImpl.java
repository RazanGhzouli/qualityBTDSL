/**
 */
package bt.cpp.btcpp.impl;

import bt.cpp.btcpp.BlackBoard;
import bt.cpp.btcpp.BtcppPackage;
import bt.cpp.btcpp.NodeConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.impl.NodeConfigurationImpl#getBlackboard <em>Blackboard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeConfigurationImpl extends MinimalEObjectImpl.Container implements NodeConfiguration {
	/**
	 * The cached value of the '{@link #getBlackboard() <em>Blackboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackboard()
	 * @generated
	 * @ordered
	 */
	protected BlackBoard blackboard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.NODE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlackBoard getBlackboard() {
		return blackboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlackboard(BlackBoard newBlackboard, NotificationChain msgs) {
		BlackBoard oldBlackboard = blackboard;
		blackboard = newBlackboard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BtcppPackage.NODE_CONFIGURATION__BLACKBOARD, oldBlackboard, newBlackboard);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlackboard(BlackBoard newBlackboard) {
		if (newBlackboard != blackboard) {
			NotificationChain msgs = null;
			if (blackboard != null)
				msgs = ((InternalEObject) blackboard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BtcppPackage.NODE_CONFIGURATION__BLACKBOARD, null, msgs);
			if (newBlackboard != null)
				msgs = ((InternalEObject) newBlackboard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BtcppPackage.NODE_CONFIGURATION__BLACKBOARD, null, msgs);
			msgs = basicSetBlackboard(newBlackboard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.NODE_CONFIGURATION__BLACKBOARD,
					newBlackboard, newBlackboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BtcppPackage.NODE_CONFIGURATION__BLACKBOARD:
			return basicSetBlackboard(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BtcppPackage.NODE_CONFIGURATION__BLACKBOARD:
			return getBlackboard();
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
		case BtcppPackage.NODE_CONFIGURATION__BLACKBOARD:
			setBlackboard((BlackBoard) newValue);
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
		case BtcppPackage.NODE_CONFIGURATION__BLACKBOARD:
			setBlackboard((BlackBoard) null);
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
		case BtcppPackage.NODE_CONFIGURATION__BLACKBOARD:
			return blackboard != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeConfigurationImpl
