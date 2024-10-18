/**
 */
package BehaviortreeSchema.impl;

import BehaviortreeSchema.ActionType;
import BehaviortreeSchema.AlwaysFailureType;
import BehaviortreeSchema.AlwaysSuccesType;
import BehaviortreeSchema.BehaviortreeSchemaPackage;
import BehaviortreeSchema.ConditionType;
import BehaviortreeSchema.ControlType;
import BehaviortreeSchema.DecoratorType;
import BehaviortreeSchema.FallbackStarType;
import BehaviortreeSchema.FallbackType;
import BehaviortreeSchema.ForceFailureType;
import BehaviortreeSchema.ForceSuccesType;
import BehaviortreeSchema.InverterType;
import BehaviortreeSchema.ParallelType;
import BehaviortreeSchema.RepeatType;
import BehaviortreeSchema.RetryType;
import BehaviortreeSchema.SequenceStarType;
import BehaviortreeSchema.SequenceType;
import BehaviortreeSchema.SubtreeType;
import BehaviortreeSchema.TimeoutType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inverter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getSequenceStar <em>Sequence Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getFallback <em>Fallback</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getFallbackStar <em>Fallback Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getInverter <em>Inverter</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getRetryUntilSuccesful <em>Retry Until Succesful</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getForceSucces <em>Force Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getForceFailure <em>Force Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getAlwaysSucces <em>Always Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getAlwaysFailure <em>Always Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.InverterTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InverterTypeImpl extends MinimalEObjectImpl.Container implements InverterType {
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
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected ControlType control;

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
	 * The cached value of the '{@link #getSubtree() <em>Subtree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtree()
	 * @generated
	 * @ordered
	 */
	protected SubtreeType subtree;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected SequenceType sequence;

	/**
	 * The cached value of the '{@link #getSequenceStar() <em>Sequence Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceStar()
	 * @generated
	 * @ordered
	 */
	protected SequenceStarType sequenceStar;

	/**
	 * The cached value of the '{@link #getFallback() <em>Fallback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallback()
	 * @generated
	 * @ordered
	 */
	protected FallbackType fallback;

	/**
	 * The cached value of the '{@link #getFallbackStar() <em>Fallback Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallbackStar()
	 * @generated
	 * @ordered
	 */
	protected FallbackStarType fallbackStar;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected ParallelType parallel;

	/**
	 * The cached value of the '{@link #getInverter() <em>Inverter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverter()
	 * @generated
	 * @ordered
	 */
	protected InverterType inverter;

	/**
	 * The cached value of the '{@link #getRetryUntilSuccesful() <em>Retry Until Succesful</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryUntilSuccesful()
	 * @generated
	 * @ordered
	 */
	protected RetryType retryUntilSuccesful;

	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected RepeatType repeat;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected TimeoutType timeout;

	/**
	 * The cached value of the '{@link #getForceSucces() <em>Force Succes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceSucces()
	 * @generated
	 * @ordered
	 */
	protected ForceSuccesType forceSucces;

	/**
	 * The cached value of the '{@link #getForceFailure() <em>Force Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceFailure()
	 * @generated
	 * @ordered
	 */
	protected ForceFailureType forceFailure;

	/**
	 * The cached value of the '{@link #getAlwaysSucces() <em>Always Succes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlwaysSucces()
	 * @generated
	 * @ordered
	 */
	protected AlwaysSuccesType alwaysSucces;

	/**
	 * The cached value of the '{@link #getAlwaysFailure() <em>Always Failure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlwaysFailure()
	 * @generated
	 * @ordered
	 */
	protected AlwaysFailureType alwaysFailure;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InverterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviortreeSchemaPackage.Literals.INVERTER_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__ACTION, oldAction, newAction);
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
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__ACTION, newAction, newAction));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__CONDITION, newCondition, newCondition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__CONTROL, oldControl, newControl);
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
				msgs = ((InternalEObject)control).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__CONTROL, null, msgs);
			if (newControl != null)
				msgs = ((InternalEObject)newControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__CONTROL, null, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__CONTROL, newControl, newControl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__DECORATOR, oldDecorator, newDecorator);
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
				msgs = ((InternalEObject)decorator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__DECORATOR, null, msgs);
			if (newDecorator != null)
				msgs = ((InternalEObject)newDecorator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__DECORATOR, null, msgs);
			msgs = basicSetDecorator(newDecorator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__DECORATOR, newDecorator, newDecorator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtreeType getSubtree() {
		return subtree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtree(SubtreeType newSubtree, NotificationChain msgs) {
		SubtreeType oldSubtree = subtree;
		subtree = newSubtree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__SUBTREE, oldSubtree, newSubtree);
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
	public void setSubtree(SubtreeType newSubtree) {
		if (newSubtree != subtree) {
			NotificationChain msgs = null;
			if (subtree != null)
				msgs = ((InternalEObject)subtree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__SUBTREE, null, msgs);
			if (newSubtree != null)
				msgs = ((InternalEObject)newSubtree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__SUBTREE, null, msgs);
			msgs = basicSetSubtree(newSubtree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__SUBTREE, newSubtree, newSubtree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceType getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(SequenceType newSequence, NotificationChain msgs) {
		SequenceType oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(SequenceType newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceStarType getSequenceStar() {
		return sequenceStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceStar(SequenceStarType newSequenceStar, NotificationChain msgs) {
		SequenceStarType oldSequenceStar = sequenceStar;
		sequenceStar = newSequenceStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE_STAR, oldSequenceStar, newSequenceStar);
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
	public void setSequenceStar(SequenceStarType newSequenceStar) {
		if (newSequenceStar != sequenceStar) {
			NotificationChain msgs = null;
			if (sequenceStar != null)
				msgs = ((InternalEObject)sequenceStar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE_STAR, null, msgs);
			if (newSequenceStar != null)
				msgs = ((InternalEObject)newSequenceStar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE_STAR, null, msgs);
			msgs = basicSetSequenceStar(newSequenceStar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE_STAR, newSequenceStar, newSequenceStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FallbackType getFallback() {
		return fallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFallback(FallbackType newFallback, NotificationChain msgs) {
		FallbackType oldFallback = fallback;
		fallback = newFallback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK, oldFallback, newFallback);
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
	public void setFallback(FallbackType newFallback) {
		if (newFallback != fallback) {
			NotificationChain msgs = null;
			if (fallback != null)
				msgs = ((InternalEObject)fallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK, null, msgs);
			if (newFallback != null)
				msgs = ((InternalEObject)newFallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK, null, msgs);
			msgs = basicSetFallback(newFallback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK, newFallback, newFallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FallbackStarType getFallbackStar() {
		return fallbackStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFallbackStar(FallbackStarType newFallbackStar, NotificationChain msgs) {
		FallbackStarType oldFallbackStar = fallbackStar;
		fallbackStar = newFallbackStar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK_STAR, oldFallbackStar, newFallbackStar);
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
	public void setFallbackStar(FallbackStarType newFallbackStar) {
		if (newFallbackStar != fallbackStar) {
			NotificationChain msgs = null;
			if (fallbackStar != null)
				msgs = ((InternalEObject)fallbackStar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK_STAR, null, msgs);
			if (newFallbackStar != null)
				msgs = ((InternalEObject)newFallbackStar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK_STAR, null, msgs);
			msgs = basicSetFallbackStar(newFallbackStar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK_STAR, newFallbackStar, newFallbackStar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelType getParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParallel(ParallelType newParallel, NotificationChain msgs) {
		ParallelType oldParallel = parallel;
		parallel = newParallel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__PARALLEL, oldParallel, newParallel);
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
	public void setParallel(ParallelType newParallel) {
		if (newParallel != parallel) {
			NotificationChain msgs = null;
			if (parallel != null)
				msgs = ((InternalEObject)parallel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__PARALLEL, null, msgs);
			if (newParallel != null)
				msgs = ((InternalEObject)newParallel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__PARALLEL, null, msgs);
			msgs = basicSetParallel(newParallel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__PARALLEL, newParallel, newParallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InverterType getInverter() {
		return inverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInverter(InverterType newInverter, NotificationChain msgs) {
		InverterType oldInverter = inverter;
		inverter = newInverter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__INVERTER, oldInverter, newInverter);
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
	public void setInverter(InverterType newInverter) {
		if (newInverter != inverter) {
			NotificationChain msgs = null;
			if (inverter != null)
				msgs = ((InternalEObject)inverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__INVERTER, null, msgs);
			if (newInverter != null)
				msgs = ((InternalEObject)newInverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__INVERTER, null, msgs);
			msgs = basicSetInverter(newInverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__INVERTER, newInverter, newInverter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetryType getRetryUntilSuccesful() {
		return retryUntilSuccesful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetryUntilSuccesful(RetryType newRetryUntilSuccesful, NotificationChain msgs) {
		RetryType oldRetryUntilSuccesful = retryUntilSuccesful;
		retryUntilSuccesful = newRetryUntilSuccesful;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL, oldRetryUntilSuccesful, newRetryUntilSuccesful);
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
	public void setRetryUntilSuccesful(RetryType newRetryUntilSuccesful) {
		if (newRetryUntilSuccesful != retryUntilSuccesful) {
			NotificationChain msgs = null;
			if (retryUntilSuccesful != null)
				msgs = ((InternalEObject)retryUntilSuccesful).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL, null, msgs);
			if (newRetryUntilSuccesful != null)
				msgs = ((InternalEObject)newRetryUntilSuccesful).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL, null, msgs);
			msgs = basicSetRetryUntilSuccesful(newRetryUntilSuccesful, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL, newRetryUntilSuccesful, newRetryUntilSuccesful));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepeatType getRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeat(RepeatType newRepeat, NotificationChain msgs) {
		RepeatType oldRepeat = repeat;
		repeat = newRepeat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__REPEAT, oldRepeat, newRepeat);
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
	public void setRepeat(RepeatType newRepeat) {
		if (newRepeat != repeat) {
			NotificationChain msgs = null;
			if (repeat != null)
				msgs = ((InternalEObject)repeat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__REPEAT, null, msgs);
			if (newRepeat != null)
				msgs = ((InternalEObject)newRepeat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__REPEAT, null, msgs);
			msgs = basicSetRepeat(newRepeat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__REPEAT, newRepeat, newRepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeoutType getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeout(TimeoutType newTimeout, NotificationChain msgs) {
		TimeoutType oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__TIMEOUT, oldTimeout, newTimeout);
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
	public void setTimeout(TimeoutType newTimeout) {
		if (newTimeout != timeout) {
			NotificationChain msgs = null;
			if (timeout != null)
				msgs = ((InternalEObject)timeout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__TIMEOUT, null, msgs);
			if (newTimeout != null)
				msgs = ((InternalEObject)newTimeout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__TIMEOUT, null, msgs);
			msgs = basicSetTimeout(newTimeout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__TIMEOUT, newTimeout, newTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForceSuccesType getForceSucces() {
		return forceSucces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForceSucces(ForceSuccesType newForceSucces, NotificationChain msgs) {
		ForceSuccesType oldForceSucces = forceSucces;
		forceSucces = newForceSucces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_SUCCES, oldForceSucces, newForceSucces);
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
	public void setForceSucces(ForceSuccesType newForceSucces) {
		if (newForceSucces != forceSucces) {
			NotificationChain msgs = null;
			if (forceSucces != null)
				msgs = ((InternalEObject)forceSucces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_SUCCES, null, msgs);
			if (newForceSucces != null)
				msgs = ((InternalEObject)newForceSucces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_SUCCES, null, msgs);
			msgs = basicSetForceSucces(newForceSucces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_SUCCES, newForceSucces, newForceSucces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForceFailureType getForceFailure() {
		return forceFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForceFailure(ForceFailureType newForceFailure, NotificationChain msgs) {
		ForceFailureType oldForceFailure = forceFailure;
		forceFailure = newForceFailure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_FAILURE, oldForceFailure, newForceFailure);
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
	public void setForceFailure(ForceFailureType newForceFailure) {
		if (newForceFailure != forceFailure) {
			NotificationChain msgs = null;
			if (forceFailure != null)
				msgs = ((InternalEObject)forceFailure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_FAILURE, null, msgs);
			if (newForceFailure != null)
				msgs = ((InternalEObject)newForceFailure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_FAILURE, null, msgs);
			msgs = basicSetForceFailure(newForceFailure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_FAILURE, newForceFailure, newForceFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlwaysSuccesType getAlwaysSucces() {
		return alwaysSucces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlwaysSucces(AlwaysSuccesType newAlwaysSucces, NotificationChain msgs) {
		AlwaysSuccesType oldAlwaysSucces = alwaysSucces;
		alwaysSucces = newAlwaysSucces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_SUCCES, oldAlwaysSucces, newAlwaysSucces);
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
	public void setAlwaysSucces(AlwaysSuccesType newAlwaysSucces) {
		if (newAlwaysSucces != alwaysSucces) {
			NotificationChain msgs = null;
			if (alwaysSucces != null)
				msgs = ((InternalEObject)alwaysSucces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_SUCCES, null, msgs);
			if (newAlwaysSucces != null)
				msgs = ((InternalEObject)newAlwaysSucces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_SUCCES, null, msgs);
			msgs = basicSetAlwaysSucces(newAlwaysSucces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_SUCCES, newAlwaysSucces, newAlwaysSucces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlwaysFailureType getAlwaysFailure() {
		return alwaysFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlwaysFailure(AlwaysFailureType newAlwaysFailure, NotificationChain msgs) {
		AlwaysFailureType oldAlwaysFailure = alwaysFailure;
		alwaysFailure = newAlwaysFailure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_FAILURE, oldAlwaysFailure, newAlwaysFailure);
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
	public void setAlwaysFailure(AlwaysFailureType newAlwaysFailure) {
		if (newAlwaysFailure != alwaysFailure) {
			NotificationChain msgs = null;
			if (alwaysFailure != null)
				msgs = ((InternalEObject)alwaysFailure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_FAILURE, null, msgs);
			if (newAlwaysFailure != null)
				msgs = ((InternalEObject)newAlwaysFailure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_FAILURE, null, msgs);
			msgs = basicSetAlwaysFailure(newAlwaysFailure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_FAILURE, newAlwaysFailure, newAlwaysFailure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.INVERTER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ACTION:
				return basicSetAction(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONDITION:
				return basicSetCondition(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONTROL:
				return basicSetControl(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__DECORATOR:
				return basicSetDecorator(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SUBTREE:
				return basicSetSubtree(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE_STAR:
				return basicSetSequenceStar(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK:
				return basicSetFallback(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK_STAR:
				return basicSetFallbackStar(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__PARALLEL:
				return basicSetParallel(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__INVERTER:
				return basicSetInverter(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL:
				return basicSetRetryUntilSuccesful(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__REPEAT:
				return basicSetRepeat(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__TIMEOUT:
				return basicSetTimeout(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_SUCCES:
				return basicSetForceSucces(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_FAILURE:
				return basicSetForceFailure(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_SUCCES:
				return basicSetAlwaysSucces(null, msgs);
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_FAILURE:
				return basicSetAlwaysFailure(null, msgs);
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
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ACTION:
				return getAction();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONDITION:
				return getCondition();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONTROL:
				return getControl();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__DECORATOR:
				return getDecorator();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SUBTREE:
				return getSubtree();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE:
				return getSequence();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE_STAR:
				return getSequenceStar();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK:
				return getFallback();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK_STAR:
				return getFallbackStar();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__PARALLEL:
				return getParallel();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__INVERTER:
				return getInverter();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL:
				return getRetryUntilSuccesful();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__REPEAT:
				return getRepeat();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__TIMEOUT:
				return getTimeout();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_SUCCES:
				return getForceSucces();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_FAILURE:
				return getForceFailure();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_SUCCES:
				return getAlwaysSucces();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_FAILURE:
				return getAlwaysFailure();
			case BehaviortreeSchemaPackage.INVERTER_TYPE__NAME:
				return getName();
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
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ACTION:
				setAction((ActionType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONDITION:
				setCondition((ConditionType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONTROL:
				setControl((ControlType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__DECORATOR:
				setDecorator((DecoratorType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SUBTREE:
				setSubtree((SubtreeType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE:
				setSequence((SequenceType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE_STAR:
				setSequenceStar((SequenceStarType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK:
				setFallback((FallbackType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK_STAR:
				setFallbackStar((FallbackStarType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__PARALLEL:
				setParallel((ParallelType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__INVERTER:
				setInverter((InverterType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL:
				setRetryUntilSuccesful((RetryType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__REPEAT:
				setRepeat((RepeatType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__TIMEOUT:
				setTimeout((TimeoutType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_SUCCES:
				setForceSucces((ForceSuccesType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_FAILURE:
				setForceFailure((ForceFailureType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_SUCCES:
				setAlwaysSucces((AlwaysSuccesType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_FAILURE:
				setAlwaysFailure((AlwaysFailureType)newValue);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__NAME:
				setName((String)newValue);
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
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ACTION:
				setAction((ActionType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONDITION:
				setCondition((ConditionType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONTROL:
				setControl((ControlType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__DECORATOR:
				setDecorator((DecoratorType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SUBTREE:
				setSubtree((SubtreeType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE:
				setSequence((SequenceType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE_STAR:
				setSequenceStar((SequenceStarType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK:
				setFallback((FallbackType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK_STAR:
				setFallbackStar((FallbackStarType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__PARALLEL:
				setParallel((ParallelType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__INVERTER:
				setInverter((InverterType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL:
				setRetryUntilSuccesful((RetryType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__REPEAT:
				setRepeat((RepeatType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__TIMEOUT:
				setTimeout((TimeoutType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_SUCCES:
				setForceSucces((ForceSuccesType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_FAILURE:
				setForceFailure((ForceFailureType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_SUCCES:
				setAlwaysSucces((AlwaysSuccesType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_FAILURE:
				setAlwaysFailure((AlwaysFailureType)null);
				return;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ACTION:
				return action != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONDITION:
				return condition != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__CONTROL:
				return control != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__DECORATOR:
				return decorator != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SUBTREE:
				return subtree != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE:
				return sequence != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__SEQUENCE_STAR:
				return sequenceStar != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK:
				return fallback != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FALLBACK_STAR:
				return fallbackStar != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__PARALLEL:
				return parallel != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__INVERTER:
				return inverter != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL:
				return retryUntilSuccesful != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__REPEAT:
				return repeat != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__TIMEOUT:
				return timeout != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_SUCCES:
				return forceSucces != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__FORCE_FAILURE:
				return forceFailure != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_SUCCES:
				return alwaysSucces != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__ALWAYS_FAILURE:
				return alwaysFailure != null;
			case BehaviortreeSchemaPackage.INVERTER_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InverterTypeImpl
