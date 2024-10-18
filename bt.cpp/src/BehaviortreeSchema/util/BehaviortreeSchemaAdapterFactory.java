/**
 */
package BehaviortreeSchema.util;

import BehaviortreeSchema.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BehaviortreeSchema.BehaviortreeSchemaPackage
 * @generated
 */
public class BehaviortreeSchemaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviortreeSchemaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviortreeSchemaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviortreeSchemaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviortreeSchemaSwitch<Adapter> modelSwitch =
		new BehaviortreeSchemaSwitch<Adapter>() {
			@Override
			public Adapter caseActionType(ActionType object) {
				return createActionTypeAdapter();
			}
			@Override
			public Adapter caseAlwaysFailureType(AlwaysFailureType object) {
				return createAlwaysFailureTypeAdapter();
			}
			@Override
			public Adapter caseAlwaysSuccesType(AlwaysSuccesType object) {
				return createAlwaysSuccesTypeAdapter();
			}
			@Override
			public Adapter caseBehaviorTreeType(BehaviorTreeType object) {
				return createBehaviorTreeTypeAdapter();
			}
			@Override
			public Adapter caseConditionType(ConditionType object) {
				return createConditionTypeAdapter();
			}
			@Override
			public Adapter caseControlType(ControlType object) {
				return createControlTypeAdapter();
			}
			@Override
			public Adapter caseDecoratorType(DecoratorType object) {
				return createDecoratorTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFallbackStarType(FallbackStarType object) {
				return createFallbackStarTypeAdapter();
			}
			@Override
			public Adapter caseFallbackType(FallbackType object) {
				return createFallbackTypeAdapter();
			}
			@Override
			public Adapter caseForceFailureType(ForceFailureType object) {
				return createForceFailureTypeAdapter();
			}
			@Override
			public Adapter caseForceSuccesType(ForceSuccesType object) {
				return createForceSuccesTypeAdapter();
			}
			@Override
			public Adapter caseInverterType(InverterType object) {
				return createInverterTypeAdapter();
			}
			@Override
			public Adapter caseParallelType(ParallelType object) {
				return createParallelTypeAdapter();
			}
			@Override
			public Adapter caseRepeatType(RepeatType object) {
				return createRepeatTypeAdapter();
			}
			@Override
			public Adapter caseRetryType(RetryType object) {
				return createRetryTypeAdapter();
			}
			@Override
			public Adapter caseRootType(RootType object) {
				return createRootTypeAdapter();
			}
			@Override
			public Adapter caseSequenceStarType(SequenceStarType object) {
				return createSequenceStarTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseSubtreeType(SubtreeType object) {
				return createSubtreeTypeAdapter();
			}
			@Override
			public Adapter caseTimeoutType(TimeoutType object) {
				return createTimeoutTypeAdapter();
			}
			@Override
			public Adapter caseTreeNodeModelType(TreeNodeModelType object) {
				return createTreeNodeModelTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.ActionType
	 * @generated
	 */
	public Adapter createActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.AlwaysFailureType <em>Always Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.AlwaysFailureType
	 * @generated
	 */
	public Adapter createAlwaysFailureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.AlwaysSuccesType <em>Always Succes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.AlwaysSuccesType
	 * @generated
	 */
	public Adapter createAlwaysSuccesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.BehaviorTreeType <em>Behavior Tree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.BehaviorTreeType
	 * @generated
	 */
	public Adapter createBehaviorTreeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.ConditionType
	 * @generated
	 */
	public Adapter createConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.ControlType
	 * @generated
	 */
	public Adapter createControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.DecoratorType <em>Decorator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.DecoratorType
	 * @generated
	 */
	public Adapter createDecoratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.FallbackStarType <em>Fallback Star Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.FallbackStarType
	 * @generated
	 */
	public Adapter createFallbackStarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.FallbackType <em>Fallback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.FallbackType
	 * @generated
	 */
	public Adapter createFallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.ForceFailureType <em>Force Failure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.ForceFailureType
	 * @generated
	 */
	public Adapter createForceFailureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.ForceSuccesType <em>Force Succes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.ForceSuccesType
	 * @generated
	 */
	public Adapter createForceSuccesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.InverterType <em>Inverter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.InverterType
	 * @generated
	 */
	public Adapter createInverterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.ParallelType <em>Parallel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.ParallelType
	 * @generated
	 */
	public Adapter createParallelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.RepeatType <em>Repeat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.RepeatType
	 * @generated
	 */
	public Adapter createRepeatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.RetryType <em>Retry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.RetryType
	 * @generated
	 */
	public Adapter createRetryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.RootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.RootType
	 * @generated
	 */
	public Adapter createRootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.SequenceStarType <em>Sequence Star Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.SequenceStarType
	 * @generated
	 */
	public Adapter createSequenceStarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.SubtreeType <em>Subtree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.SubtreeType
	 * @generated
	 */
	public Adapter createSubtreeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.TimeoutType <em>Timeout Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.TimeoutType
	 * @generated
	 */
	public Adapter createTimeoutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BehaviortreeSchema.TreeNodeModelType <em>Tree Node Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BehaviortreeSchema.TreeNodeModelType
	 * @generated
	 */
	public Adapter createTreeNodeModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BehaviortreeSchemaAdapterFactory
