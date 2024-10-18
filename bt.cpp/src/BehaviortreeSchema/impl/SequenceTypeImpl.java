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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getBuiltInMultipleTypes <em>Built In Multiple Types</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getControl <em>Control</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getDecorator <em>Decorator</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getSubtree <em>Subtree</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getSequenceStar <em>Sequence Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getFallback <em>Fallback</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getFallbackStar <em>Fallback Star</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getInverter <em>Inverter</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getRetryUntilSuccesful <em>Retry Until Succesful</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getForceSucces <em>Force Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getForceFailure <em>Force Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getAlwaysSucces <em>Always Succes</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getAlwaysFailure <em>Always Failure</em>}</li>
 *   <li>{@link BehaviortreeSchema.impl.SequenceTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceTypeImpl extends MinimalEObjectImpl.Container implements SequenceType {
	/**
	 * The cached value of the '{@link #getBuiltInMultipleTypes() <em>Built In Multiple Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInMultipleTypes()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap builtInMultipleTypes;

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
	protected SequenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBuiltInMultipleTypes() {
		if (builtInMultipleTypes == null) {
			builtInMultipleTypes = new BasicFeatureMap(this, BehaviortreeSchemaPackage.SEQUENCE_TYPE__BUILT_IN_MULTIPLE_TYPES);
		}
		return builtInMultipleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionType> getAction() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionType> getCondition() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlType> getControl() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__CONTROL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DecoratorType> getDecorator() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__DECORATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubtreeType> getSubtree() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__SUBTREE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceType> getSequence() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__SEQUENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceStarType> getSequenceStar() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__SEQUENCE_STAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FallbackType> getFallback() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__FALLBACK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FallbackStarType> getFallbackStar() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__FALLBACK_STAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParallelType> getParallel() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__PARALLEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InverterType> getInverter() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__INVERTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RetryType> getRetryUntilSuccesful() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__RETRY_UNTIL_SUCCESFUL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RepeatType> getRepeat() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__REPEAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeoutType> getTimeout() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__TIMEOUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForceSuccesType> getForceSucces() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__FORCE_SUCCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForceFailureType> getForceFailure() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__FORCE_FAILURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlwaysSuccesType> getAlwaysSucces() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__ALWAYS_SUCCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlwaysFailureType> getAlwaysFailure() {
		return getBuiltInMultipleTypes().list(BehaviortreeSchemaPackage.Literals.SEQUENCE_TYPE__ALWAYS_FAILURE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviortreeSchemaPackage.SEQUENCE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__BUILT_IN_MULTIPLE_TYPES:
				return ((InternalEList<?>)getBuiltInMultipleTypes()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__DECORATOR:
				return ((InternalEList<?>)getDecorator()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SUBTREE:
				return ((InternalEList<?>)getSubtree()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE:
				return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE_STAR:
				return ((InternalEList<?>)getSequenceStar()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK:
				return ((InternalEList<?>)getFallback()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK_STAR:
				return ((InternalEList<?>)getFallbackStar()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__PARALLEL:
				return ((InternalEList<?>)getParallel()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__INVERTER:
				return ((InternalEList<?>)getInverter()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__RETRY_UNTIL_SUCCESFUL:
				return ((InternalEList<?>)getRetryUntilSuccesful()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__REPEAT:
				return ((InternalEList<?>)getRepeat()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__TIMEOUT:
				return ((InternalEList<?>)getTimeout()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_SUCCES:
				return ((InternalEList<?>)getForceSucces()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_FAILURE:
				return ((InternalEList<?>)getForceFailure()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_SUCCES:
				return ((InternalEList<?>)getAlwaysSucces()).basicRemove(otherEnd, msgs);
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_FAILURE:
				return ((InternalEList<?>)getAlwaysFailure()).basicRemove(otherEnd, msgs);
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
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__BUILT_IN_MULTIPLE_TYPES:
				if (coreType) return getBuiltInMultipleTypes();
				return ((FeatureMap.Internal)getBuiltInMultipleTypes()).getWrapper();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ACTION:
				return getAction();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONDITION:
				return getCondition();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONTROL:
				return getControl();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__DECORATOR:
				return getDecorator();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SUBTREE:
				return getSubtree();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE:
				return getSequence();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE_STAR:
				return getSequenceStar();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK:
				return getFallback();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK_STAR:
				return getFallbackStar();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__PARALLEL:
				return getParallel();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__INVERTER:
				return getInverter();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__RETRY_UNTIL_SUCCESFUL:
				return getRetryUntilSuccesful();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__REPEAT:
				return getRepeat();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__TIMEOUT:
				return getTimeout();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_SUCCES:
				return getForceSucces();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_FAILURE:
				return getForceFailure();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_SUCCES:
				return getAlwaysSucces();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_FAILURE:
				return getAlwaysFailure();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__NAME:
				return getName();
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
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__BUILT_IN_MULTIPLE_TYPES:
				((FeatureMap.Internal)getBuiltInMultipleTypes()).set(newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends ConditionType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends ControlType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__DECORATOR:
				getDecorator().clear();
				getDecorator().addAll((Collection<? extends DecoratorType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SUBTREE:
				getSubtree().clear();
				getSubtree().addAll((Collection<? extends SubtreeType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE:
				getSequence().clear();
				getSequence().addAll((Collection<? extends SequenceType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE_STAR:
				getSequenceStar().clear();
				getSequenceStar().addAll((Collection<? extends SequenceStarType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK:
				getFallback().clear();
				getFallback().addAll((Collection<? extends FallbackType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK_STAR:
				getFallbackStar().clear();
				getFallbackStar().addAll((Collection<? extends FallbackStarType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__PARALLEL:
				getParallel().clear();
				getParallel().addAll((Collection<? extends ParallelType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__INVERTER:
				getInverter().clear();
				getInverter().addAll((Collection<? extends InverterType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__RETRY_UNTIL_SUCCESFUL:
				getRetryUntilSuccesful().clear();
				getRetryUntilSuccesful().addAll((Collection<? extends RetryType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__REPEAT:
				getRepeat().clear();
				getRepeat().addAll((Collection<? extends RepeatType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__TIMEOUT:
				getTimeout().clear();
				getTimeout().addAll((Collection<? extends TimeoutType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_SUCCES:
				getForceSucces().clear();
				getForceSucces().addAll((Collection<? extends ForceSuccesType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_FAILURE:
				getForceFailure().clear();
				getForceFailure().addAll((Collection<? extends ForceFailureType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_SUCCES:
				getAlwaysSucces().clear();
				getAlwaysSucces().addAll((Collection<? extends AlwaysSuccesType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_FAILURE:
				getAlwaysFailure().clear();
				getAlwaysFailure().addAll((Collection<? extends AlwaysFailureType>)newValue);
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__NAME:
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
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__BUILT_IN_MULTIPLE_TYPES:
				getBuiltInMultipleTypes().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ACTION:
				getAction().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONDITION:
				getCondition().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONTROL:
				getControl().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__DECORATOR:
				getDecorator().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SUBTREE:
				getSubtree().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE:
				getSequence().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE_STAR:
				getSequenceStar().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK:
				getFallback().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK_STAR:
				getFallbackStar().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__PARALLEL:
				getParallel().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__INVERTER:
				getInverter().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__RETRY_UNTIL_SUCCESFUL:
				getRetryUntilSuccesful().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__REPEAT:
				getRepeat().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__TIMEOUT:
				getTimeout().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_SUCCES:
				getForceSucces().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_FAILURE:
				getForceFailure().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_SUCCES:
				getAlwaysSucces().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_FAILURE:
				getAlwaysFailure().clear();
				return;
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__NAME:
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
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__BUILT_IN_MULTIPLE_TYPES:
				return builtInMultipleTypes != null && !builtInMultipleTypes.isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ACTION:
				return !getAction().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONDITION:
				return !getCondition().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__CONTROL:
				return !getControl().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__DECORATOR:
				return !getDecorator().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SUBTREE:
				return !getSubtree().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE:
				return !getSequence().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__SEQUENCE_STAR:
				return !getSequenceStar().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK:
				return !getFallback().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FALLBACK_STAR:
				return !getFallbackStar().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__PARALLEL:
				return !getParallel().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__INVERTER:
				return !getInverter().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__RETRY_UNTIL_SUCCESFUL:
				return !getRetryUntilSuccesful().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__REPEAT:
				return !getRepeat().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__TIMEOUT:
				return !getTimeout().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_SUCCES:
				return !getForceSucces().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__FORCE_FAILURE:
				return !getForceFailure().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_SUCCES:
				return !getAlwaysSucces().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__ALWAYS_FAILURE:
				return !getAlwaysFailure().isEmpty();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE__NAME:
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
		result.append(" (builtInMultipleTypes: ");
		result.append(builtInMultipleTypes);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SequenceTypeImpl
