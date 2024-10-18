/**
 */
package BehaviortreeSchema.impl;

import BehaviortreeSchema.BehaviorTreeType;
import BehaviortreeSchema.BehaviortreeSchemaPackage;
import BehaviortreeSchema.RootType;
import BehaviortreeSchema.TreeNodeModelType;

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
 * An implementation of the model object '<em><b>Root Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BehaviortreeSchema.impl.RootTypeImpl#getBehaviorTree <em>Behavior Tree</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.RootTypeImpl#getTreeNodeModel <em>Tree Node Model</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.RootTypeImpl#getMainTreeToExecute <em>Main Tree To Execute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootTypeImpl extends MinimalEObjectImpl.Container implements RootType {
	/**
	 * The cached value of the '{@link #getBehaviorTree() <em>Behavior Tree</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorTree()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorTreeType> behaviorTree;

	/**
	 * The cached value of the '{@link #getTreeNodeModel() <em>Tree Node Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeNodeModel()
	 * @generated
	 * @ordered
	 */
	protected TreeNodeModelType treeNodeModel;

	/**
	 * The default value of the '{@link #getMainTreeToExecute() <em>Main Tree To Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainTreeToExecute()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_TREE_TO_EXECUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainTreeToExecute() <em>Main Tree To Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainTreeToExecute()
	 * @generated
	 * @ordered
	 */
	protected String mainTreeToExecute = MAIN_TREE_TO_EXECUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviortreeSchemaPackage.Literals.ROOT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviorTreeType> getBehaviorTree() {
		if (behaviorTree == null) {
			behaviorTree = new EObjectContainmentEList<BehaviorTreeType>(BehaviorTreeType.class, this, BehaviortreeSchemaPackage.ROOT_TYPE__BEHAVIOR_TREE);
		}
		return behaviorTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TreeNodeModelType getTreeNodeModel() {
		return treeNodeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreeNodeModel(TreeNodeModelType newTreeNodeModel, NotificationChain msgs) {
		TreeNodeModelType oldTreeNodeModel = treeNodeModel;
		treeNodeModel = newTreeNodeModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.ROOT_TYPE__TREE_NODE_MODEL, oldTreeNodeModel, newTreeNodeModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreeNodeModel(TreeNodeModelType newTreeNodeModel) {
		if (newTreeNodeModel != treeNodeModel) {
			NotificationChain msgs = null;
			if (treeNodeModel != null)
				msgs = ((InternalEObject)treeNodeModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.ROOT_TYPE__TREE_NODE_MODEL, null, msgs);
			if (newTreeNodeModel != null)
				msgs = ((InternalEObject)newTreeNodeModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.ROOT_TYPE__TREE_NODE_MODEL, null, msgs);
			msgs = basicSetTreeNodeModel(newTreeNodeModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.ROOT_TYPE__TREE_NODE_MODEL, newTreeNodeModel, newTreeNodeModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMainTreeToExecute() {
		return mainTreeToExecute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainTreeToExecute(String newMainTreeToExecute) {
		String oldMainTreeToExecute = mainTreeToExecute;
		mainTreeToExecute = newMainTreeToExecute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.ROOT_TYPE__MAIN_TREE_TO_EXECUTE, oldMainTreeToExecute, mainTreeToExecute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviortreeSchemaPackage.ROOT_TYPE__BEHAVIOR_TREE:
				return ((InternalEList<?>)getBehaviorTree()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.ROOT_TYPE__TREE_NODE_MODEL:
				return basicSetTreeNodeModel(null, msgs);
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
			case BehaviortreeSchemaPackage.ROOT_TYPE__BEHAVIOR_TREE:
				return getBehaviorTree();
			case BehaviortreeSchemaPackage.ROOT_TYPE__TREE_NODE_MODEL:
				return getTreeNodeModel();
			case BehaviortreeSchemaPackage.ROOT_TYPE__MAIN_TREE_TO_EXECUTE:
				return getMainTreeToExecute();
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
			case BehaviortreeSchemaPackage.ROOT_TYPE__BEHAVIOR_TREE:
				getBehaviorTree().clear();
				getBehaviorTree().addAll((Collection<? extends BehaviorTreeType>)newValue);
				return;
			case BehaviortreeSchemaPackage.ROOT_TYPE__TREE_NODE_MODEL:
				setTreeNodeModel((TreeNodeModelType)newValue);
				return;
			case BehaviortreeSchemaPackage.ROOT_TYPE__MAIN_TREE_TO_EXECUTE:
				setMainTreeToExecute((String)newValue);
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
			case BehaviortreeSchemaPackage.ROOT_TYPE__BEHAVIOR_TREE:
				getBehaviorTree().clear();
				return;
			case BehaviortreeSchemaPackage.ROOT_TYPE__TREE_NODE_MODEL:
				setTreeNodeModel((TreeNodeModelType)null);
				return;
			case BehaviortreeSchemaPackage.ROOT_TYPE__MAIN_TREE_TO_EXECUTE:
				setMainTreeToExecute(MAIN_TREE_TO_EXECUTE_EDEFAULT);
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
			case BehaviortreeSchemaPackage.ROOT_TYPE__BEHAVIOR_TREE:
				return behaviorTree != null && !behaviorTree.isEmpty();
			case BehaviortreeSchemaPackage.ROOT_TYPE__TREE_NODE_MODEL:
				return treeNodeModel != null;
			case BehaviortreeSchemaPackage.ROOT_TYPE__MAIN_TREE_TO_EXECUTE:
				return MAIN_TREE_TO_EXECUTE_EDEFAULT == null ? mainTreeToExecute != null : !MAIN_TREE_TO_EXECUTE_EDEFAULT.equals(mainTreeToExecute);
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
		result.append(" (mainTreeToExecute: ");
		result.append(mainTreeToExecute);
		result.append(')');
		return result.toString();
	}

} //RootTypeImpl
