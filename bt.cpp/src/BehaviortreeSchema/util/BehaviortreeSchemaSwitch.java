/**
 */
package BehaviortreeSchema.util;

import BehaviortreeSchema.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see BehaviortreeSchema.BehaviortreeSchemaPackage
 * @generated
 */
public class BehaviortreeSchemaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviortreeSchemaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviortreeSchemaSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviortreeSchemaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BehaviortreeSchemaPackage.ACTION_TYPE: {
				ActionType actionType = (ActionType)theEObject;
				T result = caseActionType(actionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.ALWAYS_FAILURE_TYPE: {
				AlwaysFailureType alwaysFailureType = (AlwaysFailureType)theEObject;
				T result = caseAlwaysFailureType(alwaysFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.ALWAYS_SUCCES_TYPE: {
				AlwaysSuccesType alwaysSuccesType = (AlwaysSuccesType)theEObject;
				T result = caseAlwaysSuccesType(alwaysSuccesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.BEHAVIOR_TREE_TYPE: {
				BehaviorTreeType behaviorTreeType = (BehaviorTreeType)theEObject;
				T result = caseBehaviorTreeType(behaviorTreeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.CONDITION_TYPE: {
				ConditionType conditionType = (ConditionType)theEObject;
				T result = caseConditionType(conditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.CONTROL_TYPE: {
				ControlType controlType = (ControlType)theEObject;
				T result = caseControlType(controlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.DECORATOR_TYPE: {
				DecoratorType decoratorType = (DecoratorType)theEObject;
				T result = caseDecoratorType(decoratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.FALLBACK_STAR_TYPE: {
				FallbackStarType fallbackStarType = (FallbackStarType)theEObject;
				T result = caseFallbackStarType(fallbackStarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.FALLBACK_TYPE: {
				FallbackType fallbackType = (FallbackType)theEObject;
				T result = caseFallbackType(fallbackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.FORCE_FAILURE_TYPE: {
				ForceFailureType forceFailureType = (ForceFailureType)theEObject;
				T result = caseForceFailureType(forceFailureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.FORCE_SUCCES_TYPE: {
				ForceSuccesType forceSuccesType = (ForceSuccesType)theEObject;
				T result = caseForceSuccesType(forceSuccesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.INVERTER_TYPE: {
				InverterType inverterType = (InverterType)theEObject;
				T result = caseInverterType(inverterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.PARALLEL_TYPE: {
				ParallelType parallelType = (ParallelType)theEObject;
				T result = caseParallelType(parallelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.REPEAT_TYPE: {
				RepeatType repeatType = (RepeatType)theEObject;
				T result = caseRepeatType(repeatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.RETRY_TYPE: {
				RetryType retryType = (RetryType)theEObject;
				T result = caseRetryType(retryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.ROOT_TYPE: {
				RootType rootType = (RootType)theEObject;
				T result = caseRootType(rootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.SEQUENCE_STAR_TYPE: {
				SequenceStarType sequenceStarType = (SequenceStarType)theEObject;
				T result = caseSequenceStarType(sequenceStarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.SUBTREE_TYPE: {
				SubtreeType subtreeType = (SubtreeType)theEObject;
				T result = caseSubtreeType(subtreeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.TIMEOUT_TYPE: {
				TimeoutType timeoutType = (TimeoutType)theEObject;
				T result = caseTimeoutType(timeoutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE: {
				TreeNodeModelType treeNodeModelType = (TreeNodeModelType)theEObject;
				T result = caseTreeNodeModelType(treeNodeModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionType(ActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlwaysFailureType(AlwaysFailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always Succes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always Succes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlwaysSuccesType(AlwaysSuccesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Tree Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Tree Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorTreeType(BehaviorTreeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionType(ConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlType(ControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decorator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decorator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecoratorType(DecoratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fallback Star Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fallback Star Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFallbackStarType(FallbackStarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fallback Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fallback Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFallbackType(FallbackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Force Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Force Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForceFailureType(ForceFailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Force Succes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Force Succes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForceSuccesType(ForceSuccesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverterType(InverterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelType(ParallelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatType(RepeatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetryType(RetryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootType(RootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Star Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Star Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceStarType(SequenceStarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtree Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtree Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtreeType(SubtreeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeout Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeout Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeoutType(TimeoutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Node Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Node Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeNodeModelType(TreeNodeModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehaviortreeSchemaSwitch
