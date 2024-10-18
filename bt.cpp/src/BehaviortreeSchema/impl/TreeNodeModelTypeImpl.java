/**
 */
package BehaviortreeSchema.impl;

import BehaviortreeSchema.ActionType;
import BehaviortreeSchema.BehaviortreeSchemaPackage;
import BehaviortreeSchema.ConditionType;
import BehaviortreeSchema.ControlType;
import BehaviortreeSchema.DecoratorType;
import BehaviortreeSchema.TreeNodeModelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Node Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BehaviortreeSchema.impl.TreeNodeModelTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.TreeNodeModelTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.TreeNodeModelTypeImpl#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.TreeNodeModelTypeImpl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeNodeModelTypeImpl extends MinimalEObjectImpl.Container implements TreeNodeModelType {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionType action;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ConditionType condition;

	/**
	 * The cached value of the '{@link #getDecorator() <em>Decorator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorator()
	 * @generated
	 * @ordered
	 */
	protected DecoratorType decorator;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected ControlType control;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeNodeModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviortreeSchemaPackage.Literals.TREE_NODE_MODEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionType getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(ActionType newAction, NotificationChain msgs) {
		ActionType oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__ACTION, oldAction, newAction);
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
	public void setAction(ActionType newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionType getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ConditionType newCondition, NotificationChain msgs) {
		ConditionType oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONDITION, oldCondition, newCondition);
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
	public void setCondition(ConditionType newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecoratorType getDecorator() {
		return decorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecorator(DecoratorType newDecorator, NotificationChain msgs) {
		DecoratorType oldDecorator = decorator;
		decorator = newDecorator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__DECORATOR, oldDecorator, newDecorator);
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
	public void setDecorator(DecoratorType newDecorator) {
		if (newDecorator != decorator) {
			NotificationChain msgs = null;
			if (decorator != null)
				msgs = ((InternalEObject)decorator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__DECORATOR, null, msgs);
			if (newDecorator != null)
				msgs = ((InternalEObject)newDecorator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__DECORATOR, null, msgs);
			msgs = basicSetDecorator(newDecorator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__DECORATOR, newDecorator, newDecorator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlType getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(ControlType newControl, NotificationChain msgs) {
		ControlType oldControl = control;
		control = newControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONTROL, oldControl, newControl);
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
	public void setControl(ControlType newControl) {
		if (newControl != control) {
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject)control).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONTROL, null, msgs);
			if (newControl != null)
				msgs = ((InternalEObject)newControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONTROL, null, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONTROL, newControl, newControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__ACTION:
				return basicSetAction(null, msgs);
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONDITION:
				return basicSetCondition(null, msgs);
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__DECORATOR:
				return basicSetDecorator(null, msgs);
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONTROL:
				return basicSetControl(null, msgs);
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
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__ACTION:
				return getAction();
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONDITION:
				return getCondition();
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__DECORATOR:
				return getDecorator();
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONTROL:
				return getControl();
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
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__ACTION:
				setAction((ActionType)newValue);
				return;
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONDITION:
				setCondition((ConditionType)newValue);
				return;
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__DECORATOR:
				setDecorator((DecoratorType)newValue);
				return;
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONTROL:
				setControl((ControlType)newValue);
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
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__ACTION:
				setAction((ActionType)null);
				return;
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONDITION:
				setCondition((ConditionType)null);
				return;
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__DECORATOR:
				setDecorator((DecoratorType)null);
				return;
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONTROL:
				setControl((ControlType)null);
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
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__ACTION:
				return action != null;
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONDITION:
				return condition != null;
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__DECORATOR:
				return decorator != null;
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE__CONTROL:
				return control != null;
		}
		return super.eIsSet(featureID);
	}

} //TreeNodeModelTypeImpl
