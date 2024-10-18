/**
 */
package btcpp.impl;

import btcpp.BlackboardPrecondition;
import btcpp.BtcppPackage;
import btcpp.NodeStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blackboard Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link btcpp.impl.BlackboardPreconditionImpl#getReturn_on_mismatch <em>Return on mismatch</em>}</li>
 *   <li>{@link btcpp.impl.BlackboardPreconditionImpl#getValue_A <em>Value A</em>}</li>
 *   <li>{@link btcpp.impl.BlackboardPreconditionImpl#getValue_B <em>Value B</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BlackboardPreconditionImpl extends DecoratorNodeImpl implements BlackboardPrecondition {
	/**
	 * The default value of the '{@link #getReturn_on_mismatch() <em>Return on mismatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn_on_mismatch()
	 * @generated
	 * @ordered
	 */
	protected static final NodeStatus RETURN_ON_MISMATCH_EDEFAULT = NodeStatus.IDLE;

	/**
	 * The cached value of the '{@link #getReturn_on_mismatch() <em>Return on mismatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn_on_mismatch()
	 * @generated
	 * @ordered
	 */
	protected NodeStatus return_on_mismatch = RETURN_ON_MISMATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue_A() <em>Value A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_A()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue_A() <em>Value A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_A()
	 * @generated
	 * @ordered
	 */
	protected String value_A = VALUE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue_B() <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_B()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue_B() <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_B()
	 * @generated
	 * @ordered
	 */
	protected String value_B = VALUE_B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlackboardPreconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.BLACKBOARD_PRECONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeStatus getReturn_on_mismatch() {
		return return_on_mismatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn_on_mismatch(NodeStatus newReturn_on_mismatch) {
		NodeStatus oldReturn_on_mismatch = return_on_mismatch;
		return_on_mismatch = newReturn_on_mismatch == null ? RETURN_ON_MISMATCH_EDEFAULT : newReturn_on_mismatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH, oldReturn_on_mismatch, return_on_mismatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue_A() {
		return value_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_A(String newValue_A) {
		String oldValue_A = value_A;
		value_A = newValue_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_A, oldValue_A, value_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue_B() {
		return value_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_B(String newValue_B) {
		String oldValue_B = value_B;
		value_B = newValue_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_B, oldValue_B, value_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BtcppPackage.BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH:
				return getReturn_on_mismatch();
			case BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_A:
				return getValue_A();
			case BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_B:
				return getValue_B();
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
			case BtcppPackage.BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH:
				setReturn_on_mismatch((NodeStatus)newValue);
				return;
			case BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_A:
				setValue_A((String)newValue);
				return;
			case BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_B:
				setValue_B((String)newValue);
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
			case BtcppPackage.BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH:
				setReturn_on_mismatch(RETURN_ON_MISMATCH_EDEFAULT);
				return;
			case BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_A:
				setValue_A(VALUE_A_EDEFAULT);
				return;
			case BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_B:
				setValue_B(VALUE_B_EDEFAULT);
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
			case BtcppPackage.BLACKBOARD_PRECONDITION__RETURN_ON_MISMATCH:
				return return_on_mismatch != RETURN_ON_MISMATCH_EDEFAULT;
			case BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_A:
				return VALUE_A_EDEFAULT == null ? value_A != null : !VALUE_A_EDEFAULT.equals(value_A);
			case BtcppPackage.BLACKBOARD_PRECONDITION__VALUE_B:
				return VALUE_B_EDEFAULT == null ? value_B != null : !VALUE_B_EDEFAULT.equals(value_B);
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
		result.append(" (return_on_mismatch: ");
		result.append(return_on_mismatch);
		result.append(", value_A: ");
		result.append(value_A);
		result.append(", value_B: ");
		result.append(value_B);
		result.append(')');
		return result.toString();
	}

} //BlackboardPreconditionImpl
