/**
 */
package btcpp.impl;

import btcpp.BtcppPackage;
import btcpp.Parameter;
import btcpp.Quality;
import btcpp.QualityRequirement;
import btcpp.TreeNode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getID <em>ID</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getSatisfices <em>Satisfices</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TreeNodeImpl extends MinimalEObjectImpl.Container implements TreeNode {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getSatisfices() <em>Satisfices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfices()
	 * @generated
	 * @ordered
	 */
	protected EList<Quality> satisfices;

	/**
	 * The cached value of the '{@link #getSatisfies() <em>Satisfies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfies()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityRequirement> satisfies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcppPackage.Literals.TREE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.TREE_NODE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.TREE_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BtcppPackage.TREE_NODE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, BtcppPackage.TREE_NODE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Quality> getSatisfices() {
		if (satisfices == null) {
			satisfices = new EObjectContainmentEList<Quality>(Quality.class, this, BtcppPackage.TREE_NODE__SATISFICES);
		}
		return satisfices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualityRequirement> getSatisfies() {
		if (satisfies == null) {
			satisfies = new EObjectContainmentEList<QualityRequirement>(QualityRequirement.class, this, BtcppPackage.TREE_NODE__SATISFIES);
		}
		return satisfies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
			case BtcppPackage.TREE_NODE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case BtcppPackage.TREE_NODE__SATISFICES:
				return ((InternalEList<?>)getSatisfices()).basicRemove(otherEnd, msgs);
			case BtcppPackage.TREE_NODE__SATISFIES:
				return ((InternalEList<?>)getSatisfies()).basicRemove(otherEnd, msgs);
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
			case BtcppPackage.TREE_NODE__ID:
				return getID();
			case BtcppPackage.TREE_NODE__NAME:
				return getName();
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
			case BtcppPackage.TREE_NODE__PARAMETERS:
				return getParameters();
			case BtcppPackage.TREE_NODE__SATISFICES:
				return getSatisfices();
			case BtcppPackage.TREE_NODE__SATISFIES:
				return getSatisfies();
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
			case BtcppPackage.TREE_NODE__ID:
				setID((String)newValue);
				return;
			case BtcppPackage.TREE_NODE__NAME:
				setName((String)newValue);
				return;
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
			case BtcppPackage.TREE_NODE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case BtcppPackage.TREE_NODE__SATISFICES:
				getSatisfices().clear();
				getSatisfices().addAll((Collection<? extends Quality>)newValue);
				return;
			case BtcppPackage.TREE_NODE__SATISFIES:
				getSatisfies().clear();
				getSatisfies().addAll((Collection<? extends QualityRequirement>)newValue);
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
			case BtcppPackage.TREE_NODE__ID:
				setID(ID_EDEFAULT);
				return;
			case BtcppPackage.TREE_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case BtcppPackage.TREE_NODE__PARAMETERS:
				getParameters().clear();
				return;
			case BtcppPackage.TREE_NODE__SATISFICES:
				getSatisfices().clear();
				return;
			case BtcppPackage.TREE_NODE__SATISFIES:
				getSatisfies().clear();
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
			case BtcppPackage.TREE_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BtcppPackage.TREE_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case BtcppPackage.TREE_NODE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BtcppPackage.TREE_NODE__SATISFICES:
				return satisfices != null && !satisfices.isEmpty();
			case BtcppPackage.TREE_NODE__SATISFIES:
				return satisfies != null && !satisfies.isEmpty();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", AnyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TreeNodeImpl
