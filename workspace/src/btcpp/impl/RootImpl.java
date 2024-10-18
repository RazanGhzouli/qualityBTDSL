/**
 */
package btcpp.impl;

import btcpp.BehaviorTree;
import btcpp.BtcppPackage;
import btcpp.Root;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link btcpp.impl.RootImpl#getBehaviortrees <em>Behaviortrees</em>}</li>
 *   <li>{@link btcpp.impl.RootImpl#getMain_tree_to_execute <em>Main tree to execute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getBehaviortrees() <em>Behaviortrees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviortrees()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorTree> behaviortrees;

	/**
	 * The default value of the '{@link #getMain_tree_to_execute() <em>Main tree to execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain_tree_to_execute()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_TREE_TO_EXECUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMain_tree_to_execute() <em>Main tree to execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain_tree_to_execute()
	 * @generated
	 * @ordered
	 */
	protected String main_tree_to_execute = MAIN_TREE_TO_EXECUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BehaviorTree> getBehaviortrees() {
		if (behaviortrees == null) {
			behaviortrees = new EObjectContainmentEList<BehaviorTree>(BehaviorTree.class, this, BtcppPackage.ROOT__BEHAVIORTREES);
		}
		return behaviortrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMain_tree_to_execute() {
		return main_tree_to_execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain_tree_to_execute(String newMain_tree_to_execute) {
		String oldMain_tree_to_execute = main_tree_to_execute;
		main_tree_to_execute = newMain_tree_to_execute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.ROOT__MAIN_TREE_TO_EXECUTE, oldMain_tree_to_execute, main_tree_to_execute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtcppPackage.ROOT__BEHAVIORTREES:
				return ((InternalEList<?>)getBehaviortrees()).basicRemove(otherEnd, msgs);
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
			case BtcppPackage.ROOT__BEHAVIORTREES:
				return getBehaviortrees();
			case BtcppPackage.ROOT__MAIN_TREE_TO_EXECUTE:
				return getMain_tree_to_execute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BtcppPackage.ROOT__BEHAVIORTREES:
				getBehaviortrees().clear();
				getBehaviortrees().addAll((Collection<? extends BehaviorTree>)newValue);
				return;
			case BtcppPackage.ROOT__MAIN_TREE_TO_EXECUTE:
				setMain_tree_to_execute((String)newValue);
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
			case BtcppPackage.ROOT__BEHAVIORTREES:
				getBehaviortrees().clear();
				return;
			case BtcppPackage.ROOT__MAIN_TREE_TO_EXECUTE:
				setMain_tree_to_execute(MAIN_TREE_TO_EXECUTE_EDEFAULT);
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
			case BtcppPackage.ROOT__BEHAVIORTREES:
				return behaviortrees != null && !behaviortrees.isEmpty();
			case BtcppPackage.ROOT__MAIN_TREE_TO_EXECUTE:
				return MAIN_TREE_TO_EXECUTE_EDEFAULT == null ? main_tree_to_execute != null : !MAIN_TREE_TO_EXECUTE_EDEFAULT.equals(main_tree_to_execute);
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
		result.append(" (main_tree_to_execute: ");
		result.append(main_tree_to_execute);
		result.append(')');
		return result.toString();
	}

} //RootImpl
