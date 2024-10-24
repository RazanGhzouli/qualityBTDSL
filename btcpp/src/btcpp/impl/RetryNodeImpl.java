/**
 */
package btcpp.impl;

import btcpp.BtcppPackage;
import btcpp.RetryNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retry Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link btcpp.impl.RetryNodeImpl#getNum_attempts <em>Num attempts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetryNodeImpl extends DecoratorNodeImpl implements RetryNode {
	/**
	 * The default value of the '{@link #getNum_attempts() <em>Num attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_attempts()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_ATTEMPTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNum_attempts() <em>Num attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_attempts()
	 * @generated
	 * @ordered
	 */
	protected String num_attempts = NUM_ATTEMPTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetryNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.RETRY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNum_attempts() {
		return num_attempts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum_attempts(String newNum_attempts) {
		String oldNum_attempts = num_attempts;
		num_attempts = newNum_attempts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.RETRY_NODE__NUM_ATTEMPTS, oldNum_attempts, num_attempts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtcppPackage.RETRY_NODE__NUM_ATTEMPTS:
				return getNum_attempts();
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
			case BtcppPackage.RETRY_NODE__NUM_ATTEMPTS:
				setNum_attempts((String)newValue);
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
			case BtcppPackage.RETRY_NODE__NUM_ATTEMPTS:
				setNum_attempts(NUM_ATTEMPTS_EDEFAULT);
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
			case BtcppPackage.RETRY_NODE__NUM_ATTEMPTS:
				return NUM_ATTEMPTS_EDEFAULT == null ? num_attempts != null : !NUM_ATTEMPTS_EDEFAULT.equals(num_attempts);
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
		result.append(" (num_attempts: ");
		result.append(num_attempts);
		result.append(')');
		return result.toString();
	}

} //RetryNodeImpl
