/**
 */
package btcpp.impl;

import btcpp.BtcppPackage;
import btcpp.SetBlackboardNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Blackboard Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link btcpp.impl.SetBlackboardNodeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link btcpp.impl.SetBlackboardNodeImpl#getOutput_key <em>Output key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetBlackboardNodeImpl extends ActionNodeBaseImpl implements SetBlackboardNode {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_key() <em>Output key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_key()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_key() <em>Output key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_key()
	 * @generated
	 * @ordered
	 */
	protected String output_key = OUTPUT_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetBlackboardNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.SET_BLACKBOARD_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.SET_BLACKBOARD_NODE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutput_key() {
		return output_key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput_key(String newOutput_key) {
		String oldOutput_key = output_key;
		output_key = newOutput_key;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.SET_BLACKBOARD_NODE__OUTPUT_KEY, oldOutput_key, output_key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtcppPackage.SET_BLACKBOARD_NODE__VALUE:
				return getValue();
			case BtcppPackage.SET_BLACKBOARD_NODE__OUTPUT_KEY:
				return getOutput_key();
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
			case BtcppPackage.SET_BLACKBOARD_NODE__VALUE:
				setValue((String)newValue);
				return;
			case BtcppPackage.SET_BLACKBOARD_NODE__OUTPUT_KEY:
				setOutput_key((String)newValue);
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
			case BtcppPackage.SET_BLACKBOARD_NODE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BtcppPackage.SET_BLACKBOARD_NODE__OUTPUT_KEY:
				setOutput_key(OUTPUT_KEY_EDEFAULT);
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
			case BtcppPackage.SET_BLACKBOARD_NODE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BtcppPackage.SET_BLACKBOARD_NODE__OUTPUT_KEY:
				return OUTPUT_KEY_EDEFAULT == null ? output_key != null : !OUTPUT_KEY_EDEFAULT.equals(output_key);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", output_key: ");
		result.append(output_key);
		result.append(')');
		return result.toString();
	}

} //SetBlackboardNodeImpl
