/**
 */
package btcpp.impl;

import btcpp.BtcppPackage;
import btcpp.NodeStatus;
import btcpp.NodeType;
import btcpp.Parameter;
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
 *   <li>{@link btcpp.impl.TreeNodeImpl#getUID <em>UID</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getNodeStatus <em>Node Status</em>}</li>
 *   <li>{@link btcpp.impl.TreeNodeImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TreeNodeImpl extends MinimalEObjectImpl.Container implements TreeNode {
	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

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
	 * The default value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected static final NodeType NODE_TYPE_EDEFAULT = NodeType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected NodeType nodeType = NODE_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getNodeStatus() <em>Node Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final NodeStatus NODE_STATUS_EDEFAULT = NodeStatus.IDLE;

	/**
	 * The cached value of the '{@link #getNodeStatus() <em>Node Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeStatus()
	 * @generated
	 * @ordered
	 */
	protected NodeStatus nodeStatus = NODE_STATUS_EDEFAULT;

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
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.TREE_NODE__UID, oldUID, uID));
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
	public NodeType getNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeType(NodeType newNodeType) {
		NodeType oldNodeType = nodeType;
		nodeType = newNodeType == null ? NODE_TYPE_EDEFAULT : newNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.TREE_NODE__NODE_TYPE, oldNodeType, nodeType));
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
	public NodeStatus getNodeStatus() {
		return nodeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeStatus(NodeStatus newNodeStatus) {
		NodeStatus oldNodeStatus = nodeStatus;
		nodeStatus = newNodeStatus == null ? NODE_STATUS_EDEFAULT : newNodeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BtcppPackage.TREE_NODE__NODE_STATUS, oldNodeStatus, nodeStatus));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
			case BtcppPackage.TREE_NODE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case BtcppPackage.TREE_NODE__UID:
				return getUID();
			case BtcppPackage.TREE_NODE__NAME:
				return getName();
			case BtcppPackage.TREE_NODE__NODE_TYPE:
				return getNodeType();
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
			case BtcppPackage.TREE_NODE__NODE_STATUS:
				return getNodeStatus();
			case BtcppPackage.TREE_NODE__PARAMETERS:
				return getParameters();
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
			case BtcppPackage.TREE_NODE__UID:
				setUID((String)newValue);
				return;
			case BtcppPackage.TREE_NODE__NAME:
				setName((String)newValue);
				return;
			case BtcppPackage.TREE_NODE__NODE_TYPE:
				setNodeType((NodeType)newValue);
				return;
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
			case BtcppPackage.TREE_NODE__NODE_STATUS:
				setNodeStatus((NodeStatus)newValue);
				return;
			case BtcppPackage.TREE_NODE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case BtcppPackage.TREE_NODE__UID:
				setUID(UID_EDEFAULT);
				return;
			case BtcppPackage.TREE_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BtcppPackage.TREE_NODE__NODE_TYPE:
				setNodeType(NODE_TYPE_EDEFAULT);
				return;
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case BtcppPackage.TREE_NODE__NODE_STATUS:
				setNodeStatus(NODE_STATUS_EDEFAULT);
				return;
			case BtcppPackage.TREE_NODE__PARAMETERS:
				getParameters().clear();
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
			case BtcppPackage.TREE_NODE__UID:
				return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
			case BtcppPackage.TREE_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BtcppPackage.TREE_NODE__NODE_TYPE:
				return nodeType != NODE_TYPE_EDEFAULT;
			case BtcppPackage.TREE_NODE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case BtcppPackage.TREE_NODE__NODE_STATUS:
				return nodeStatus != NODE_STATUS_EDEFAULT;
			case BtcppPackage.TREE_NODE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (uID: ");
		result.append(uID);
		result.append(", name: ");
		result.append(name);
		result.append(", NodeType: ");
		result.append(nodeType);
		result.append(", AnyAttribute: ");
		result.append(anyAttribute);
		result.append(", NodeStatus: ");
		result.append(nodeStatus);
		result.append(')');
		return result.toString();
	}

} //TreeNodeImpl
