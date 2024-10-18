/**
 */
package bt.cpp.btcpp.impl;

import bt.cpp.btcpp.BehaviorTree;
import bt.cpp.btcpp.BtcppPackage;
import bt.cpp.btcpp.SubTree;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.impl.SubTreeImpl#getRefersTo <em>Refers To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubTreeImpl extends TreeNodeImpl implements SubTree {
	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorTree> refersTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.SUB_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviorTree> getRefersTo() {
		if (refersTo == null) {
			refersTo = new EObjectResolvingEList<BehaviorTree>(BehaviorTree.class, this,
					BtcppPackage.SUB_TREE__REFERS_TO);
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BtcppPackage.SUB_TREE__REFERS_TO:
			return getRefersTo();
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
		case BtcppPackage.SUB_TREE__REFERS_TO:
			getRefersTo().clear();
			getRefersTo().addAll((Collection<? extends BehaviorTree>) newValue);
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
		case BtcppPackage.SUB_TREE__REFERS_TO:
			getRefersTo().clear();
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
		case BtcppPackage.SUB_TREE__REFERS_TO:
			return refersTo != null && !refersTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubTreeImpl
