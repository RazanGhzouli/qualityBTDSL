/**
 */
package btcpp.impl;

import btcpp.BtcppPackage;
import btcpp.RepeatNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link btcpp.impl.RepeatNodeImpl#getNum_cycles <em>Num cycles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatNodeImpl extends DecoratorNodeImpl implements RepeatNode {
	/**
	 * The default value of the '{@link #getNum_cycles() <em>Num cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_cycles()
	 * @generated
	 * @ordered
	 */
	protected static final String NUM_CYCLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNum_cycles() <em>Num cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_cycles()
	 * @generated
	 * @ordered
	 */
	protected String num_cycles = NUM_CYCLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.REPEAT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNum_cycles() {
		return num_cycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum_cycles(String newNum_cycles) {
		String oldNum_cycles = num_cycles;
		num_cycles = newNum_cycles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.REPEAT_NODE__NUM_CYCLES, oldNum_cycles, num_cycles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtcppPackage.REPEAT_NODE__NUM_CYCLES:
				return getNum_cycles();
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
			case BtcppPackage.REPEAT_NODE__NUM_CYCLES:
				setNum_cycles((String)newValue);
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
			case BtcppPackage.REPEAT_NODE__NUM_CYCLES:
				setNum_cycles(NUM_CYCLES_EDEFAULT);
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
			case BtcppPackage.REPEAT_NODE__NUM_CYCLES:
				return NUM_CYCLES_EDEFAULT == null ? num_cycles != null : !NUM_CYCLES_EDEFAULT.equals(num_cycles);
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
		result.append(" (num_cycles: ");
		result.append(num_cycles);
		result.append(')');
		return result.toString();
	}

} //RepeatNodeImpl
