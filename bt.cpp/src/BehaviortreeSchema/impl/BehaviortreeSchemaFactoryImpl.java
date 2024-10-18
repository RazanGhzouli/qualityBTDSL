/**
 */
package BehaviortreeSchema.impl;

import BehaviortreeSchema.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviortreeSchemaFactoryImpl extends EFactoryImpl implements BehaviortreeSchemaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviortreeSchemaFactory init() {
		try {
			BehaviortreeSchemaFactory theBehaviortreeSchemaFactory = (BehaviortreeSchemaFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviortreeSchemaPackage.eNS_URI);
			if (theBehaviortreeSchemaFactory != null) {
				return theBehaviortreeSchemaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviortreeSchemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviortreeSchemaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviortreeSchemaPackage.ACTION_TYPE: return createActionType();
			case BehaviortreeSchemaPackage.ALWAYS_FAILURE_TYPE: return createAlwaysFailureType();
			case BehaviortreeSchemaPackage.ALWAYS_SUCCES_TYPE: return createAlwaysSuccesType();
			case BehaviortreeSchemaPackage.BEHAVIOR_TREE_TYPE: return createBehaviorTreeType();
			case BehaviortreeSchemaPackage.CONDITION_TYPE: return createConditionType();
			case BehaviortreeSchemaPackage.CONTROL_TYPE: return createControlType();
			case BehaviortreeSchemaPackage.DECORATOR_TYPE: return createDecoratorType();
			case BehaviortreeSchemaPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case BehaviortreeSchemaPackage.FALLBACK_STAR_TYPE: return createFallbackStarType();
			case BehaviortreeSchemaPackage.FALLBACK_TYPE: return createFallbackType();
			case BehaviortreeSchemaPackage.FORCE_FAILURE_TYPE: return createForceFailureType();
			case BehaviortreeSchemaPackage.FORCE_SUCCES_TYPE: return createForceSuccesType();
			case BehaviortreeSchemaPackage.INVERTER_TYPE: return createInverterType();
			case BehaviortreeSchemaPackage.PARALLEL_TYPE: return createParallelType();
			case BehaviortreeSchemaPackage.REPEAT_TYPE: return createRepeatType();
			case BehaviortreeSchemaPackage.RETRY_TYPE: return createRetryType();
			case BehaviortreeSchemaPackage.ROOT_TYPE: return createRootType();
			case BehaviortreeSchemaPackage.SEQUENCE_STAR_TYPE: return createSequenceStarType();
			case BehaviortreeSchemaPackage.SEQUENCE_TYPE: return createSequenceType();
			case BehaviortreeSchemaPackage.SUBTREE_TYPE: return createSubtreeType();
			case BehaviortreeSchemaPackage.TIMEOUT_TYPE: return createTimeoutType();
			case BehaviortreeSchemaPackage.TREE_NODE_MODEL_TYPE: return createTreeNodeModelType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlwaysFailureType createAlwaysFailureType() {
		AlwaysFailureTypeImpl alwaysFailureType = new AlwaysFailureTypeImpl();
		return alwaysFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlwaysSuccesType createAlwaysSuccesType() {
		AlwaysSuccesTypeImpl alwaysSuccesType = new AlwaysSuccesTypeImpl();
		return alwaysSuccesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorTreeType createBehaviorTreeType() {
		BehaviorTreeTypeImpl behaviorTreeType = new BehaviorTreeTypeImpl();
		return behaviorTreeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionType createConditionType() {
		ConditionTypeImpl conditionType = new ConditionTypeImpl();
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlType createControlType() {
		ControlTypeImpl controlType = new ControlTypeImpl();
		return controlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecoratorType createDecoratorType() {
		DecoratorTypeImpl decoratorType = new DecoratorTypeImpl();
		return decoratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FallbackStarType createFallbackStarType() {
		FallbackStarTypeImpl fallbackStarType = new FallbackStarTypeImpl();
		return fallbackStarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FallbackType createFallbackType() {
		FallbackTypeImpl fallbackType = new FallbackTypeImpl();
		return fallbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForceFailureType createForceFailureType() {
		ForceFailureTypeImpl forceFailureType = new ForceFailureTypeImpl();
		return forceFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForceSuccesType createForceSuccesType() {
		ForceSuccesTypeImpl forceSuccesType = new ForceSuccesTypeImpl();
		return forceSuccesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InverterType createInverterType() {
		InverterTypeImpl inverterType = new InverterTypeImpl();
		return inverterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelType createParallelType() {
		ParallelTypeImpl parallelType = new ParallelTypeImpl();
		return parallelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepeatType createRepeatType() {
		RepeatTypeImpl repeatType = new RepeatTypeImpl();
		return repeatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RetryType createRetryType() {
		RetryTypeImpl retryType = new RetryTypeImpl();
		return retryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootType createRootType() {
		RootTypeImpl rootType = new RootTypeImpl();
		return rootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceStarType createSequenceStarType() {
		SequenceStarTypeImpl sequenceStarType = new SequenceStarTypeImpl();
		return sequenceStarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubtreeType createSubtreeType() {
		SubtreeTypeImpl subtreeType = new SubtreeTypeImpl();
		return subtreeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeoutType createTimeoutType() {
		TimeoutTypeImpl timeoutType = new TimeoutTypeImpl();
		return timeoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TreeNodeModelType createTreeNodeModelType() {
		TreeNodeModelTypeImpl treeNodeModelType = new TreeNodeModelTypeImpl();
		return treeNodeModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviortreeSchemaPackage getBehaviortreeSchemaPackage() {
		return (BehaviortreeSchemaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviortreeSchemaPackage getPackage() {
		return BehaviortreeSchemaPackage.eINSTANCE;
	}

} //BehaviortreeSchemaFactoryImpl
