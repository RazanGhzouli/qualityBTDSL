/**
 */
package btcpp.impl;

import btcpp.BtcppPackage;
import btcpp.DelayNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link btcpp.impl.DelayNodeImpl#getDelay_msec <em>Delay msec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayNodeImpl extends DecoratorNodeImpl implements DelayNode {
	/**
	 * The default value of the '{@link #getDelay_msec() <em>Delay msec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_msec()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_MSEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay_msec() <em>Delay msec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_msec()
	 * @generated
	 * @ordered
	 */
	protected String delay_msec = DELAY_MSEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.DELAY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelay_msec() {
		return delay_msec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelay_msec(String newDelay_msec) {
		String oldDelay_msec = delay_msec;
		delay_msec = newDelay_msec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.DELAY_NODE__DELAY_MSEC, oldDelay_msec, delay_msec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtcppPackage.DELAY_NODE__DELAY_MSEC:
				return getDelay_msec();
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
			case BtcppPackage.DELAY_NODE__DELAY_MSEC:
				setDelay_msec((String)newValue);
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
			case BtcppPackage.DELAY_NODE__DELAY_MSEC:
				setDelay_msec(DELAY_MSEC_EDEFAULT);
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
			case BtcppPackage.DELAY_NODE__DELAY_MSEC:
				return DELAY_MSEC_EDEFAULT == null ? delay_msec != null : !DELAY_MSEC_EDEFAULT.equals(delay_msec);
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
		result.append(" (delay_msec: ");
		result.append(delay_msec);
		result.append(')');
		return result.toString();
	}

} //DelayNodeImpl
