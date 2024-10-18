/**
 */
package btcpp.impl;

import btcpp.BtcppPackage;
import btcpp.TimeoutNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timeout Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link btcpp.impl.TimeoutNodeImpl#getMsec <em>Msec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeoutNodeImpl extends DecoratorNodeImpl implements TimeoutNode {
	/**
	 * The default value of the '{@link #getMsec() <em>Msec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsec()
	 * @generated
	 * @ordered
	 */
	protected static final String MSEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMsec() <em>Msec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsec()
	 * @generated
	 * @ordered
	 */
	protected String msec = MSEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeoutNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.TIMEOUT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMsec() {
		return msec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMsec(String newMsec) {
		String oldMsec = msec;
		msec = newMsec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.TIMEOUT_NODE__MSEC, oldMsec, msec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtcppPackage.TIMEOUT_NODE__MSEC:
				return getMsec();
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
			case BtcppPackage.TIMEOUT_NODE__MSEC:
				setMsec((String)newValue);
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
			case BtcppPackage.TIMEOUT_NODE__MSEC:
				setMsec(MSEC_EDEFAULT);
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
			case BtcppPackage.TIMEOUT_NODE__MSEC:
				return MSEC_EDEFAULT == null ? msec != null : !MSEC_EDEFAULT.equals(msec);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (msec: ");
		result.append(msec);
		result.append(')');
		return result.toString();
	}

} //TimeoutNodeImpl
