/**
 */
package BehaviortreeSchema.impl;

import BehaviortreeSchema.ActionType;
import BehaviortreeSchema.AlwaysFailureType;
import BehaviortreeSchema.AlwaysSuccesType;
import BehaviortreeSchema.BehaviorTreeType;
import BehaviortreeSchema.BehaviortreeSchemaFactory;
import BehaviortreeSchema.BehaviortreeSchemaPackage;
import BehaviortreeSchema.ConditionType;
import BehaviortreeSchema.ControlType;
import BehaviortreeSchema.DecoratorType;
import BehaviortreeSchema.DocumentRoot;
import BehaviortreeSchema.FallbackStarType;
import BehaviortreeSchema.FallbackType;
import BehaviortreeSchema.ForceFailureType;
import BehaviortreeSchema.ForceSuccesType;
import BehaviortreeSchema.InverterType;
import BehaviortreeSchema.ParallelType;
import BehaviortreeSchema.RepeatType;
import BehaviortreeSchema.RetryType;
import BehaviortreeSchema.RootType;
import BehaviortreeSchema.SequenceStarType;
import BehaviortreeSchema.SequenceType;
import BehaviortreeSchema.SubtreeType;
import BehaviortreeSchema.TimeoutType;
import BehaviortreeSchema.TreeNodeModelType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviortreeSchemaPackageImpl extends EPackageImpl implements BehaviortreeSchemaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alwaysFailureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alwaysSuccesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorTreeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fallbackStarTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fallbackTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forceFailureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forceSuccesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceStarTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtreeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeNodeModelTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviortreeSchemaPackageImpl() {
		super(eNS_URI, BehaviortreeSchemaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BehaviortreeSchemaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviortreeSchemaPackage init() {
		if (isInited) return (BehaviortreeSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviortreeSchemaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBehaviortreeSchemaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BehaviortreeSchemaPackageImpl theBehaviortreeSchemaPackage = registeredBehaviortreeSchemaPackage instanceof BehaviortreeSchemaPackageImpl ? (BehaviortreeSchemaPackageImpl)registeredBehaviortreeSchemaPackage : new BehaviortreeSchemaPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBehaviortreeSchemaPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviortreeSchemaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviortreeSchemaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviortreeSchemaPackage.eNS_URI, theBehaviortreeSchemaPackage);
		return theBehaviortreeSchemaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionType() {
		return actionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionType_ID() {
		return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionType_Name() {
		return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionType_AnyAttribute() {
		return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlwaysFailureType() {
		return alwaysFailureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlwaysFailureType_Name() {
		return (EAttribute)alwaysFailureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlwaysSuccesType() {
		return alwaysSuccesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlwaysSuccesType_Name() {
		return (EAttribute)alwaysSuccesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviorTreeType() {
		return behaviorTreeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Action() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Condition() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Control() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Decorator() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Subtree() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Sequence() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_SequenceStar() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Fallback() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_FallbackStar() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Parallel() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Inverter() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_RetryUntilSuccesful() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Repeat() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_Timeout() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_ForceSucces() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_ForceFailure() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_AlwaysSucces() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorTreeType_AlwaysFailure() {
		return (EReference)behaviorTreeTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorTreeType_ID() {
		return (EAttribute)behaviorTreeTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionType() {
		return conditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditionType_ID() {
		return (EAttribute)conditionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditionType_Name() {
		return (EAttribute)conditionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditionType_AnyAttribute() {
		return (EAttribute)conditionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlType() {
		return controlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlType_BuiltInMultipleTypes() {
		return (EAttribute)controlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Action() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Condition() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Control() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Decorator() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Subtree() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Sequence() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_SequenceStar() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Fallback() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_FallbackStar() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Parallel() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Inverter() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_RetryUntilSuccesful() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Repeat() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_Timeout() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_ForceSucces() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_ForceFailure() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_AlwaysSucces() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlType_AlwaysFailure() {
		return (EReference)controlTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlType_ID() {
		return (EAttribute)controlTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlType_Name() {
		return (EAttribute)controlTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControlType_AnyAttribute() {
		return (EAttribute)controlTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecoratorType() {
		return decoratorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Action() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Condition() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Control() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Decorator() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Subtree() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Sequence() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_SequenceStar() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Fallback() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_FallbackStar() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Parallel() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Inverter() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_RetryUntilSuccesful() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Repeat() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_Timeout() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_ForceSucces() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_ForceFailure() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_AlwaysSucces() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecoratorType_AlwaysFailure() {
		return (EReference)decoratorTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecoratorType_ID() {
		return (EAttribute)decoratorTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecoratorType_Name() {
		return (EAttribute)decoratorTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecoratorType_AnyAttribute() {
		return (EAttribute)decoratorTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Root() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFallbackStarType() {
		return fallbackStarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFallbackStarType_BuiltInMultipleTypes() {
		return (EAttribute)fallbackStarTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Action() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Condition() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Control() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Decorator() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Subtree() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Sequence() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_SequenceStar() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Fallback() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_FallbackStar() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Parallel() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Inverter() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_RetryUntilSuccesful() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Repeat() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_Timeout() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_ForceSucces() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_ForceFailure() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_AlwaysSucces() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackStarType_AlwaysFailure() {
		return (EReference)fallbackStarTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFallbackStarType_Name() {
		return (EAttribute)fallbackStarTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFallbackType() {
		return fallbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFallbackType_BuiltInMultipleTypes() {
		return (EAttribute)fallbackTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Action() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Condition() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Control() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Decorator() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Subtree() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Sequence() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_SequenceStar() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Fallback() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_FallbackStar() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Parallel() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Inverter() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_RetryUntilSuccesful() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Repeat() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Timeout() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_ForceSucces() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_ForceFailure() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_AlwaysSucces() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_AlwaysFailure() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFallbackType_Name() {
		return (EAttribute)fallbackTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForceFailureType() {
		return forceFailureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Action() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Condition() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Control() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Decorator() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Subtree() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Sequence() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_SequenceStar() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Fallback() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_FallbackStar() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Parallel() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Inverter() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_RetryUntilSuccesful() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Repeat() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_Timeout() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_ForceSucces() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_ForceFailure() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_AlwaysSucces() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceFailureType_AlwaysFailure() {
		return (EReference)forceFailureTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForceFailureType_Name() {
		return (EAttribute)forceFailureTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForceSuccesType() {
		return forceSuccesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Action() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Condition() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Control() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Decorator() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Subtree() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Sequence() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_SequenceStar() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Fallback() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_FallbackStar() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Parallel() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Inverter() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_RetryUntilSuccesful() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Repeat() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_Timeout() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_ForceSucces() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_ForceFailure() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_AlwaysSucces() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForceSuccesType_AlwaysFailure() {
		return (EReference)forceSuccesTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForceSuccesType_Name() {
		return (EAttribute)forceSuccesTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInverterType() {
		return inverterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Action() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Condition() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Control() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Decorator() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Subtree() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Sequence() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_SequenceStar() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Fallback() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_FallbackStar() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Parallel() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Inverter() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_RetryUntilSuccesful() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Repeat() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_Timeout() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_ForceSucces() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_ForceFailure() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_AlwaysSucces() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInverterType_AlwaysFailure() {
		return (EReference)inverterTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInverterType_Name() {
		return (EAttribute)inverterTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelType() {
		return parallelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParallelType_BuiltInMultipleTypes() {
		return (EAttribute)parallelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Action() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Condition() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Control() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Decorator() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Subtree() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Sequence() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_SequenceStar() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Fallback() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_FallbackStar() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Parallel() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Inverter() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_RetryUntilSuccesful() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Repeat() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_Timeout() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_ForceSucces() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_ForceFailure() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_AlwaysSucces() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelType_AlwaysFailure() {
		return (EReference)parallelTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParallelType_Name() {
		return (EAttribute)parallelTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParallelType_Threshold() {
		return (EAttribute)parallelTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepeatType() {
		return repeatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Action() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Condition() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Control() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Decorator() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Subtree() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Sequence() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_SequenceStar() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Fallback() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_FallbackStar() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Parallel() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Inverter() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_RetryUntilSuccesful() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Repeat() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_Timeout() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_ForceSucces() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_ForceFailure() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_AlwaysSucces() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepeatType_AlwaysFailure() {
		return (EReference)repeatTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepeatType_Name() {
		return (EAttribute)repeatTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepeatType_NumCycles() {
		return (EAttribute)repeatTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetryType() {
		return retryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Action() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Condition() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Control() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Decorator() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Subtree() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Sequence() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_SequenceStar() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Fallback() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_FallbackStar() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Parallel() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Inverter() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_RetryUntilSuccesful() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Repeat() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_Timeout() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_ForceSucces() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_ForceFailure() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_AlwaysSucces() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetryType_AlwaysFailure() {
		return (EReference)retryTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetryType_Name() {
		return (EAttribute)retryTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetryType_NumAttempts() {
		return (EAttribute)retryTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootType() {
		return rootTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRootType_BehaviorTree() {
		return (EReference)rootTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRootType_TreeNodeModel() {
		return (EReference)rootTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRootType_MainTreeToExecute() {
		return (EAttribute)rootTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceStarType() {
		return sequenceStarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSequenceStarType_BuiltInMultipleTypes() {
		return (EAttribute)sequenceStarTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Action() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Condition() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Control() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Decorator() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Subtree() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Sequence() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_SequenceStar() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Fallback() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_FallbackStar() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Parallel() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Inverter() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_RetryUntilSuccesful() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Repeat() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_Timeout() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_ForceSucces() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_ForceFailure() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_AlwaysSucces() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceStarType_AlwaysFailure() {
		return (EReference)sequenceStarTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSequenceStarType_Name() {
		return (EAttribute)sequenceStarTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSequenceType_BuiltInMultipleTypes() {
		return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Action() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Condition() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Control() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Decorator() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Subtree() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Sequence() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_SequenceStar() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Fallback() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_FallbackStar() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Parallel() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Inverter() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_RetryUntilSuccesful() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Repeat() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_Timeout() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_ForceSucces() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_ForceFailure() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_AlwaysSucces() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSequenceType_AlwaysFailure() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSequenceType_Name() {
		return (EAttribute)sequenceTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubtreeType() {
		return subtreeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Action() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Condition() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Control() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Decorator() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Subtree() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Sequence() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_SequenceStar() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Fallback() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_FallbackStar() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Parallel() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Inverter() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_RetryUntilSuccesful() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Repeat() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_Timeout() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_ForceSucces() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_ForceFailure() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_AlwaysSucces() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubtreeType_AlwaysFailure() {
		return (EReference)subtreeTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubtreeType_ID() {
		return (EAttribute)subtreeTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubtreeType_Name() {
		return (EAttribute)subtreeTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubtreeType_AnyAttribute() {
		return (EAttribute)subtreeTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeoutType() {
		return timeoutTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Action() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Condition() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Control() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Decorator() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Subtree() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Sequence() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_SequenceStar() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Fallback() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_FallbackStar() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Parallel() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Inverter() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_RetryUntilSuccesful() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Repeat() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_Timeout() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_ForceSucces() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_ForceFailure() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_AlwaysSucces() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeoutType_AlwaysFailure() {
		return (EReference)timeoutTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeoutType_Msec() {
		return (EAttribute)timeoutTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeoutType_Name() {
		return (EAttribute)timeoutTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTreeNodeModelType() {
		return treeNodeModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTreeNodeModelType_Action() {
		return (EReference)treeNodeModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTreeNodeModelType_Condition() {
		return (EReference)treeNodeModelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTreeNodeModelType_Decorator() {
		return (EReference)treeNodeModelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTreeNodeModelType_Control() {
		return (EReference)treeNodeModelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviortreeSchemaFactory getBehaviortreeSchemaFactory() {
		return (BehaviortreeSchemaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actionTypeEClass = createEClass(ACTION_TYPE);
		createEAttribute(actionTypeEClass, ACTION_TYPE__ID);
		createEAttribute(actionTypeEClass, ACTION_TYPE__NAME);
		createEAttribute(actionTypeEClass, ACTION_TYPE__ANY_ATTRIBUTE);

		alwaysFailureTypeEClass = createEClass(ALWAYS_FAILURE_TYPE);
		createEAttribute(alwaysFailureTypeEClass, ALWAYS_FAILURE_TYPE__NAME);

		alwaysSuccesTypeEClass = createEClass(ALWAYS_SUCCES_TYPE);
		createEAttribute(alwaysSuccesTypeEClass, ALWAYS_SUCCES_TYPE__NAME);

		behaviorTreeTypeEClass = createEClass(BEHAVIOR_TREE_TYPE);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__ACTION);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__CONDITION);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__CONTROL);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__DECORATOR);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__SUBTREE);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__SEQUENCE);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__SEQUENCE_STAR);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__FALLBACK);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__FALLBACK_STAR);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__PARALLEL);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__INVERTER);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__REPEAT);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__TIMEOUT);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__FORCE_SUCCES);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__FORCE_FAILURE);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__ALWAYS_SUCCES);
		createEReference(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__ALWAYS_FAILURE);
		createEAttribute(behaviorTreeTypeEClass, BEHAVIOR_TREE_TYPE__ID);

		conditionTypeEClass = createEClass(CONDITION_TYPE);
		createEAttribute(conditionTypeEClass, CONDITION_TYPE__ID);
		createEAttribute(conditionTypeEClass, CONDITION_TYPE__NAME);
		createEAttribute(conditionTypeEClass, CONDITION_TYPE__ANY_ATTRIBUTE);

		controlTypeEClass = createEClass(CONTROL_TYPE);
		createEAttribute(controlTypeEClass, CONTROL_TYPE__BUILT_IN_MULTIPLE_TYPES);
		createEReference(controlTypeEClass, CONTROL_TYPE__ACTION);
		createEReference(controlTypeEClass, CONTROL_TYPE__CONDITION);
		createEReference(controlTypeEClass, CONTROL_TYPE__CONTROL);
		createEReference(controlTypeEClass, CONTROL_TYPE__DECORATOR);
		createEReference(controlTypeEClass, CONTROL_TYPE__SUBTREE);
		createEReference(controlTypeEClass, CONTROL_TYPE__SEQUENCE);
		createEReference(controlTypeEClass, CONTROL_TYPE__SEQUENCE_STAR);
		createEReference(controlTypeEClass, CONTROL_TYPE__FALLBACK);
		createEReference(controlTypeEClass, CONTROL_TYPE__FALLBACK_STAR);
		createEReference(controlTypeEClass, CONTROL_TYPE__PARALLEL);
		createEReference(controlTypeEClass, CONTROL_TYPE__INVERTER);
		createEReference(controlTypeEClass, CONTROL_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(controlTypeEClass, CONTROL_TYPE__REPEAT);
		createEReference(controlTypeEClass, CONTROL_TYPE__TIMEOUT);
		createEReference(controlTypeEClass, CONTROL_TYPE__FORCE_SUCCES);
		createEReference(controlTypeEClass, CONTROL_TYPE__FORCE_FAILURE);
		createEReference(controlTypeEClass, CONTROL_TYPE__ALWAYS_SUCCES);
		createEReference(controlTypeEClass, CONTROL_TYPE__ALWAYS_FAILURE);
		createEAttribute(controlTypeEClass, CONTROL_TYPE__ID);
		createEAttribute(controlTypeEClass, CONTROL_TYPE__NAME);
		createEAttribute(controlTypeEClass, CONTROL_TYPE__ANY_ATTRIBUTE);

		decoratorTypeEClass = createEClass(DECORATOR_TYPE);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__ACTION);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__CONDITION);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__CONTROL);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__DECORATOR);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__SUBTREE);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__SEQUENCE);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__SEQUENCE_STAR);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__FALLBACK);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__FALLBACK_STAR);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__PARALLEL);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__INVERTER);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__REPEAT);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__TIMEOUT);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__FORCE_SUCCES);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__FORCE_FAILURE);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__ALWAYS_SUCCES);
		createEReference(decoratorTypeEClass, DECORATOR_TYPE__ALWAYS_FAILURE);
		createEAttribute(decoratorTypeEClass, DECORATOR_TYPE__ID);
		createEAttribute(decoratorTypeEClass, DECORATOR_TYPE__NAME);
		createEAttribute(decoratorTypeEClass, DECORATOR_TYPE__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT);

		fallbackStarTypeEClass = createEClass(FALLBACK_STAR_TYPE);
		createEAttribute(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__BUILT_IN_MULTIPLE_TYPES);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__ACTION);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__CONDITION);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__CONTROL);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__DECORATOR);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__SUBTREE);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__SEQUENCE);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__SEQUENCE_STAR);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__FALLBACK);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__FALLBACK_STAR);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__PARALLEL);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__INVERTER);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__REPEAT);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__TIMEOUT);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__FORCE_SUCCES);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__FORCE_FAILURE);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__ALWAYS_SUCCES);
		createEReference(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__ALWAYS_FAILURE);
		createEAttribute(fallbackStarTypeEClass, FALLBACK_STAR_TYPE__NAME);

		fallbackTypeEClass = createEClass(FALLBACK_TYPE);
		createEAttribute(fallbackTypeEClass, FALLBACK_TYPE__BUILT_IN_MULTIPLE_TYPES);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__ACTION);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__CONDITION);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__CONTROL);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__DECORATOR);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__SUBTREE);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__SEQUENCE);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__SEQUENCE_STAR);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__FALLBACK);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__FALLBACK_STAR);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__PARALLEL);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__INVERTER);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__REPEAT);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__TIMEOUT);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__FORCE_SUCCES);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__FORCE_FAILURE);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__ALWAYS_SUCCES);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__ALWAYS_FAILURE);
		createEAttribute(fallbackTypeEClass, FALLBACK_TYPE__NAME);

		forceFailureTypeEClass = createEClass(FORCE_FAILURE_TYPE);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__ACTION);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__CONDITION);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__CONTROL);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__DECORATOR);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__SUBTREE);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__SEQUENCE);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__SEQUENCE_STAR);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__FALLBACK);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__FALLBACK_STAR);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__PARALLEL);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__INVERTER);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__REPEAT);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__TIMEOUT);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__FORCE_SUCCES);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__FORCE_FAILURE);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__ALWAYS_SUCCES);
		createEReference(forceFailureTypeEClass, FORCE_FAILURE_TYPE__ALWAYS_FAILURE);
		createEAttribute(forceFailureTypeEClass, FORCE_FAILURE_TYPE__NAME);

		forceSuccesTypeEClass = createEClass(FORCE_SUCCES_TYPE);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__ACTION);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__CONDITION);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__CONTROL);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__DECORATOR);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__SUBTREE);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__SEQUENCE);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__SEQUENCE_STAR);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__FALLBACK);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__FALLBACK_STAR);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__PARALLEL);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__INVERTER);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__REPEAT);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__TIMEOUT);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__FORCE_SUCCES);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__FORCE_FAILURE);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__ALWAYS_SUCCES);
		createEReference(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__ALWAYS_FAILURE);
		createEAttribute(forceSuccesTypeEClass, FORCE_SUCCES_TYPE__NAME);

		inverterTypeEClass = createEClass(INVERTER_TYPE);
		createEReference(inverterTypeEClass, INVERTER_TYPE__ACTION);
		createEReference(inverterTypeEClass, INVERTER_TYPE__CONDITION);
		createEReference(inverterTypeEClass, INVERTER_TYPE__CONTROL);
		createEReference(inverterTypeEClass, INVERTER_TYPE__DECORATOR);
		createEReference(inverterTypeEClass, INVERTER_TYPE__SUBTREE);
		createEReference(inverterTypeEClass, INVERTER_TYPE__SEQUENCE);
		createEReference(inverterTypeEClass, INVERTER_TYPE__SEQUENCE_STAR);
		createEReference(inverterTypeEClass, INVERTER_TYPE__FALLBACK);
		createEReference(inverterTypeEClass, INVERTER_TYPE__FALLBACK_STAR);
		createEReference(inverterTypeEClass, INVERTER_TYPE__PARALLEL);
		createEReference(inverterTypeEClass, INVERTER_TYPE__INVERTER);
		createEReference(inverterTypeEClass, INVERTER_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(inverterTypeEClass, INVERTER_TYPE__REPEAT);
		createEReference(inverterTypeEClass, INVERTER_TYPE__TIMEOUT);
		createEReference(inverterTypeEClass, INVERTER_TYPE__FORCE_SUCCES);
		createEReference(inverterTypeEClass, INVERTER_TYPE__FORCE_FAILURE);
		createEReference(inverterTypeEClass, INVERTER_TYPE__ALWAYS_SUCCES);
		createEReference(inverterTypeEClass, INVERTER_TYPE__ALWAYS_FAILURE);
		createEAttribute(inverterTypeEClass, INVERTER_TYPE__NAME);

		parallelTypeEClass = createEClass(PARALLEL_TYPE);
		createEAttribute(parallelTypeEClass, PARALLEL_TYPE__BUILT_IN_MULTIPLE_TYPES);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__ACTION);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__CONDITION);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__CONTROL);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__DECORATOR);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__SUBTREE);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__SEQUENCE);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__SEQUENCE_STAR);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__FALLBACK);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__FALLBACK_STAR);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__PARALLEL);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__INVERTER);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__REPEAT);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__TIMEOUT);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__FORCE_SUCCES);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__FORCE_FAILURE);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__ALWAYS_SUCCES);
		createEReference(parallelTypeEClass, PARALLEL_TYPE__ALWAYS_FAILURE);
		createEAttribute(parallelTypeEClass, PARALLEL_TYPE__NAME);
		createEAttribute(parallelTypeEClass, PARALLEL_TYPE__THRESHOLD);

		repeatTypeEClass = createEClass(REPEAT_TYPE);
		createEReference(repeatTypeEClass, REPEAT_TYPE__ACTION);
		createEReference(repeatTypeEClass, REPEAT_TYPE__CONDITION);
		createEReference(repeatTypeEClass, REPEAT_TYPE__CONTROL);
		createEReference(repeatTypeEClass, REPEAT_TYPE__DECORATOR);
		createEReference(repeatTypeEClass, REPEAT_TYPE__SUBTREE);
		createEReference(repeatTypeEClass, REPEAT_TYPE__SEQUENCE);
		createEReference(repeatTypeEClass, REPEAT_TYPE__SEQUENCE_STAR);
		createEReference(repeatTypeEClass, REPEAT_TYPE__FALLBACK);
		createEReference(repeatTypeEClass, REPEAT_TYPE__FALLBACK_STAR);
		createEReference(repeatTypeEClass, REPEAT_TYPE__PARALLEL);
		createEReference(repeatTypeEClass, REPEAT_TYPE__INVERTER);
		createEReference(repeatTypeEClass, REPEAT_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(repeatTypeEClass, REPEAT_TYPE__REPEAT);
		createEReference(repeatTypeEClass, REPEAT_TYPE__TIMEOUT);
		createEReference(repeatTypeEClass, REPEAT_TYPE__FORCE_SUCCES);
		createEReference(repeatTypeEClass, REPEAT_TYPE__FORCE_FAILURE);
		createEReference(repeatTypeEClass, REPEAT_TYPE__ALWAYS_SUCCES);
		createEReference(repeatTypeEClass, REPEAT_TYPE__ALWAYS_FAILURE);
		createEAttribute(repeatTypeEClass, REPEAT_TYPE__NAME);
		createEAttribute(repeatTypeEClass, REPEAT_TYPE__NUM_CYCLES);

		retryTypeEClass = createEClass(RETRY_TYPE);
		createEReference(retryTypeEClass, RETRY_TYPE__ACTION);
		createEReference(retryTypeEClass, RETRY_TYPE__CONDITION);
		createEReference(retryTypeEClass, RETRY_TYPE__CONTROL);
		createEReference(retryTypeEClass, RETRY_TYPE__DECORATOR);
		createEReference(retryTypeEClass, RETRY_TYPE__SUBTREE);
		createEReference(retryTypeEClass, RETRY_TYPE__SEQUENCE);
		createEReference(retryTypeEClass, RETRY_TYPE__SEQUENCE_STAR);
		createEReference(retryTypeEClass, RETRY_TYPE__FALLBACK);
		createEReference(retryTypeEClass, RETRY_TYPE__FALLBACK_STAR);
		createEReference(retryTypeEClass, RETRY_TYPE__PARALLEL);
		createEReference(retryTypeEClass, RETRY_TYPE__INVERTER);
		createEReference(retryTypeEClass, RETRY_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(retryTypeEClass, RETRY_TYPE__REPEAT);
		createEReference(retryTypeEClass, RETRY_TYPE__TIMEOUT);
		createEReference(retryTypeEClass, RETRY_TYPE__FORCE_SUCCES);
		createEReference(retryTypeEClass, RETRY_TYPE__FORCE_FAILURE);
		createEReference(retryTypeEClass, RETRY_TYPE__ALWAYS_SUCCES);
		createEReference(retryTypeEClass, RETRY_TYPE__ALWAYS_FAILURE);
		createEAttribute(retryTypeEClass, RETRY_TYPE__NAME);
		createEAttribute(retryTypeEClass, RETRY_TYPE__NUM_ATTEMPTS);

		rootTypeEClass = createEClass(ROOT_TYPE);
		createEReference(rootTypeEClass, ROOT_TYPE__BEHAVIOR_TREE);
		createEReference(rootTypeEClass, ROOT_TYPE__TREE_NODE_MODEL);
		createEAttribute(rootTypeEClass, ROOT_TYPE__MAIN_TREE_TO_EXECUTE);

		sequenceStarTypeEClass = createEClass(SEQUENCE_STAR_TYPE);
		createEAttribute(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__BUILT_IN_MULTIPLE_TYPES);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__ACTION);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__CONDITION);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__CONTROL);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__DECORATOR);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__SUBTREE);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__SEQUENCE);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__SEQUENCE_STAR);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__FALLBACK);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__FALLBACK_STAR);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__PARALLEL);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__INVERTER);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__REPEAT);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__TIMEOUT);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__FORCE_SUCCES);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__FORCE_FAILURE);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__ALWAYS_SUCCES);
		createEReference(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__ALWAYS_FAILURE);
		createEAttribute(sequenceStarTypeEClass, SEQUENCE_STAR_TYPE__NAME);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);
		createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__BUILT_IN_MULTIPLE_TYPES);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__ACTION);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__CONDITION);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__CONTROL);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__DECORATOR);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__SUBTREE);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__SEQUENCE);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__SEQUENCE_STAR);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__FALLBACK);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__FALLBACK_STAR);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__PARALLEL);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__INVERTER);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__REPEAT);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__TIMEOUT);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__FORCE_SUCCES);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__FORCE_FAILURE);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__ALWAYS_SUCCES);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__ALWAYS_FAILURE);
		createEAttribute(sequenceTypeEClass, SEQUENCE_TYPE__NAME);

		subtreeTypeEClass = createEClass(SUBTREE_TYPE);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__ACTION);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__CONDITION);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__CONTROL);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__DECORATOR);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__SUBTREE);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__SEQUENCE);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__SEQUENCE_STAR);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__FALLBACK);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__FALLBACK_STAR);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__PARALLEL);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__INVERTER);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__REPEAT);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__TIMEOUT);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__FORCE_SUCCES);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__FORCE_FAILURE);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__ALWAYS_SUCCES);
		createEReference(subtreeTypeEClass, SUBTREE_TYPE__ALWAYS_FAILURE);
		createEAttribute(subtreeTypeEClass, SUBTREE_TYPE__ID);
		createEAttribute(subtreeTypeEClass, SUBTREE_TYPE__NAME);
		createEAttribute(subtreeTypeEClass, SUBTREE_TYPE__ANY_ATTRIBUTE);

		timeoutTypeEClass = createEClass(TIMEOUT_TYPE);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__ACTION);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__CONDITION);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__CONTROL);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__DECORATOR);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__SUBTREE);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__SEQUENCE);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__SEQUENCE_STAR);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__FALLBACK);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__FALLBACK_STAR);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__PARALLEL);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__INVERTER);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__RETRY_UNTIL_SUCCESFUL);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__REPEAT);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__TIMEOUT);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__FORCE_SUCCES);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__FORCE_FAILURE);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__ALWAYS_SUCCES);
		createEReference(timeoutTypeEClass, TIMEOUT_TYPE__ALWAYS_FAILURE);
		createEAttribute(timeoutTypeEClass, TIMEOUT_TYPE__MSEC);
		createEAttribute(timeoutTypeEClass, TIMEOUT_TYPE__NAME);

		treeNodeModelTypeEClass = createEClass(TREE_NODE_MODEL_TYPE);
		createEReference(treeNodeModelTypeEClass, TREE_NODE_MODEL_TYPE__ACTION);
		createEReference(treeNodeModelTypeEClass, TREE_NODE_MODEL_TYPE__CONDITION);
		createEReference(treeNodeModelTypeEClass, TREE_NODE_MODEL_TYPE__DECORATOR);
		createEReference(treeNodeModelTypeEClass, TREE_NODE_MODEL_TYPE__CONTROL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(actionTypeEClass, ActionType.class, "ActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionType_ID(), theXMLTypePackage.getString(), "iD", null, 1, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alwaysFailureTypeEClass, AlwaysFailureType.class, "AlwaysFailureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlwaysFailureType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, AlwaysFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alwaysSuccesTypeEClass, AlwaysSuccesType.class, "AlwaysSuccesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlwaysSuccesType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, AlwaysSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorTreeTypeEClass, BehaviorTreeType.class, "BehaviorTreeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorTreeType_Action(), this.getActionType(), null, "action", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Condition(), this.getConditionType(), null, "condition", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Control(), this.getControlType(), null, "control", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Parallel(), this.getParallelType(), null, "parallel", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Inverter(), this.getInverterType(), null, "inverter", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorTreeType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorTreeType_ID(), theXMLTypePackage.getString(), "iD", null, 1, 1, BehaviorTreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionTypeEClass, ConditionType.class, "ConditionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionType_ID(), theXMLTypePackage.getString(), "iD", null, 1, 1, ConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlTypeEClass, ControlType.class, "ControlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlType_BuiltInMultipleTypes(), ecorePackage.getEFeatureMapEntry(), "builtInMultipleTypes", null, 0, -1, ControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Action(), this.getActionType(), null, "action", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Condition(), this.getConditionType(), null, "condition", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Control(), this.getControlType(), null, "control", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Parallel(), this.getParallelType(), null, "parallel", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Inverter(), this.getInverterType(), null, "inverter", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControlType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, -1, ControlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlType_ID(), theXMLTypePackage.getString(), "iD", null, 1, 1, ControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decoratorTypeEClass, DecoratorType.class, "DecoratorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecoratorType_Action(), this.getActionType(), null, "action", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Condition(), this.getConditionType(), null, "condition", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Control(), this.getControlType(), null, "control", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Parallel(), this.getParallelType(), null, "parallel", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Inverter(), this.getInverterType(), null, "inverter", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecoratorType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecoratorType_ID(), theXMLTypePackage.getString(), "iD", null, 1, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecoratorType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecoratorType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DecoratorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Root(), this.getRootType(), null, "root", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fallbackStarTypeEClass, FallbackStarType.class, "FallbackStarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFallbackStarType_BuiltInMultipleTypes(), ecorePackage.getEFeatureMapEntry(), "builtInMultipleTypes", null, 0, -1, FallbackStarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Action(), this.getActionType(), null, "action", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Condition(), this.getConditionType(), null, "condition", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Control(), this.getControlType(), null, "control", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Parallel(), this.getParallelType(), null, "parallel", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Inverter(), this.getInverterType(), null, "inverter", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackStarType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, -1, FallbackStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFallbackStarType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, FallbackStarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fallbackTypeEClass, FallbackType.class, "FallbackType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFallbackType_BuiltInMultipleTypes(), ecorePackage.getEFeatureMapEntry(), "builtInMultipleTypes", null, 0, -1, FallbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Action(), this.getActionType(), null, "action", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Condition(), this.getConditionType(), null, "condition", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Control(), this.getControlType(), null, "control", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Parallel(), this.getParallelType(), null, "parallel", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Inverter(), this.getInverterType(), null, "inverter", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFallbackType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, FallbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forceFailureTypeEClass, ForceFailureType.class, "ForceFailureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForceFailureType_Action(), this.getActionType(), null, "action", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Condition(), this.getConditionType(), null, "condition", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Control(), this.getControlType(), null, "control", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Parallel(), this.getParallelType(), null, "parallel", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Inverter(), this.getInverterType(), null, "inverter", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceFailureType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForceFailureType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ForceFailureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forceSuccesTypeEClass, ForceSuccesType.class, "ForceSuccesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForceSuccesType_Action(), this.getActionType(), null, "action", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Condition(), this.getConditionType(), null, "condition", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Control(), this.getControlType(), null, "control", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Parallel(), this.getParallelType(), null, "parallel", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Inverter(), this.getInverterType(), null, "inverter", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForceSuccesType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForceSuccesType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ForceSuccesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inverterTypeEClass, InverterType.class, "InverterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInverterType_Action(), this.getActionType(), null, "action", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Condition(), this.getConditionType(), null, "condition", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Control(), this.getControlType(), null, "control", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Parallel(), this.getParallelType(), null, "parallel", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Inverter(), this.getInverterType(), null, "inverter", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInverterType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInverterType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, InverterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelTypeEClass, ParallelType.class, "ParallelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParallelType_BuiltInMultipleTypes(), ecorePackage.getEFeatureMapEntry(), "builtInMultipleTypes", null, 0, -1, ParallelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Action(), this.getActionType(), null, "action", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Condition(), this.getConditionType(), null, "condition", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Control(), this.getControlType(), null, "control", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Parallel(), this.getParallelType(), null, "parallel", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Inverter(), this.getInverterType(), null, "inverter", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParallelType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, -1, ParallelType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParallelType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ParallelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParallelType_Threshold(), theXMLTypePackage.getString(), "threshold", null, 1, 1, ParallelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repeatTypeEClass, RepeatType.class, "RepeatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeatType_Action(), this.getActionType(), null, "action", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Condition(), this.getConditionType(), null, "condition", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Control(), this.getControlType(), null, "control", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Parallel(), this.getParallelType(), null, "parallel", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Inverter(), this.getInverterType(), null, "inverter", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeatType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepeatType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepeatType_NumCycles(), theXMLTypePackage.getString(), "numCycles", null, 1, 1, RepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retryTypeEClass, RetryType.class, "RetryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRetryType_Action(), this.getActionType(), null, "action", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Condition(), this.getConditionType(), null, "condition", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Control(), this.getControlType(), null, "control", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Parallel(), this.getParallelType(), null, "parallel", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Inverter(), this.getInverterType(), null, "inverter", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetryType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetryType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetryType_NumAttempts(), theXMLTypePackage.getString(), "numAttempts", null, 1, 1, RetryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootTypeEClass, RootType.class, "RootType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRootType_BehaviorTree(), this.getBehaviorTreeType(), null, "behaviorTree", null, 1, -1, RootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRootType_TreeNodeModel(), this.getTreeNodeModelType(), null, "treeNodeModel", null, 0, 1, RootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRootType_MainTreeToExecute(), theXMLTypePackage.getString(), "mainTreeToExecute", null, 1, 1, RootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceStarTypeEClass, SequenceStarType.class, "SequenceStarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceStarType_BuiltInMultipleTypes(), ecorePackage.getEFeatureMapEntry(), "builtInMultipleTypes", null, 0, -1, SequenceStarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Action(), this.getActionType(), null, "action", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Condition(), this.getConditionType(), null, "condition", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Control(), this.getControlType(), null, "control", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Parallel(), this.getParallelType(), null, "parallel", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Inverter(), this.getInverterType(), null, "inverter", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStarType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, -1, SequenceStarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceStarType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SequenceStarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceType_BuiltInMultipleTypes(), ecorePackage.getEFeatureMapEntry(), "builtInMultipleTypes", null, 0, -1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Action(), this.getActionType(), null, "action", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Condition(), this.getConditionType(), null, "condition", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Control(), this.getControlType(), null, "control", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Parallel(), this.getParallelType(), null, "parallel", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Inverter(), this.getInverterType(), null, "inverter", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, -1, SequenceType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequenceType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subtreeTypeEClass, SubtreeType.class, "SubtreeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubtreeType_Action(), this.getActionType(), null, "action", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Condition(), this.getConditionType(), null, "condition", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Control(), this.getControlType(), null, "control", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Parallel(), this.getParallelType(), null, "parallel", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Inverter(), this.getInverterType(), null, "inverter", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubtreeType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtreeType_ID(), theXMLTypePackage.getString(), "iD", null, 1, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtreeType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtreeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SubtreeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeoutTypeEClass, TimeoutType.class, "TimeoutType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeoutType_Action(), this.getActionType(), null, "action", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Condition(), this.getConditionType(), null, "condition", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Control(), this.getControlType(), null, "control", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Decorator(), this.getDecoratorType(), null, "decorator", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Subtree(), this.getSubtreeType(), null, "subtree", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_SequenceStar(), this.getSequenceStarType(), null, "sequenceStar", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_FallbackStar(), this.getFallbackStarType(), null, "fallbackStar", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Parallel(), this.getParallelType(), null, "parallel", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Inverter(), this.getInverterType(), null, "inverter", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_RetryUntilSuccesful(), this.getRetryType(), null, "retryUntilSuccesful", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Repeat(), this.getRepeatType(), null, "repeat", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_Timeout(), this.getTimeoutType(), null, "timeout", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_ForceSucces(), this.getForceSuccesType(), null, "forceSucces", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_ForceFailure(), this.getForceFailureType(), null, "forceFailure", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_AlwaysSucces(), this.getAlwaysSuccesType(), null, "alwaysSucces", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeoutType_AlwaysFailure(), this.getAlwaysFailureType(), null, "alwaysFailure", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeoutType_Msec(), theXMLTypePackage.getString(), "msec", null, 1, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeoutType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TimeoutType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeNodeModelTypeEClass, TreeNodeModelType.class, "TreeNodeModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTreeNodeModelType_Action(), this.getActionType(), null, "action", null, 1, 1, TreeNodeModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNodeModelType_Condition(), this.getConditionType(), null, "condition", null, 1, 1, TreeNodeModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNodeModelType_Decorator(), this.getDecoratorType(), null, "decorator", null, 1, 1, TreeNodeModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNodeModelType_Control(), this.getControlType(), null, "control", null, 1, 1, TreeNodeModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (actionTypeEClass,
		   source,
		   new String[] {
			   "name", "ActionType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getActionType_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getActionType_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##any",
			   "name", ":2",
			   "processing", "strict"
		   });
		addAnnotation
		  (alwaysFailureTypeEClass,
		   source,
		   new String[] {
			   "name", "AlwaysFailureType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getAlwaysFailureType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (alwaysSuccesTypeEClass,
		   source,
		   new String[] {
			   "name", "AlwaysSuccesType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getAlwaysSuccesType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (behaviorTreeTypeEClass,
		   source,
		   new String[] {
			   "name", "BehaviorTree_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBehaviorTreeType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBehaviorTreeType_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (conditionTypeEClass,
		   source,
		   new String[] {
			   "name", "ConditionType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getConditionType_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConditionType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConditionType_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##any",
			   "name", ":2",
			   "processing", "strict"
		   });
		addAnnotation
		  (controlTypeEClass,
		   source,
		   new String[] {
			   "name", "ControlType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getControlType_BuiltInMultipleTypes(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getControlType_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getControlType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getControlType_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##any",
			   "name", ":21",
			   "processing", "strict"
		   });
		addAnnotation
		  (decoratorTypeEClass,
		   source,
		   new String[] {
			   "name", "DecoratorType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDecoratorType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDecoratorType_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##any",
			   "name", ":20",
			   "processing", "strict"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Root(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "root",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (fallbackStarTypeEClass,
		   source,
		   new String[] {
			   "name", "FallbackStarType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFallbackStarType_BuiltInMultipleTypes(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackStarType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (fallbackTypeEClass,
		   source,
		   new String[] {
			   "name", "FallbackType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFallbackType_BuiltInMultipleTypes(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getFallbackType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (forceFailureTypeEClass,
		   source,
		   new String[] {
			   "name", "ForceFailureType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getForceFailureType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceFailureType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (forceSuccesTypeEClass,
		   source,
		   new String[] {
			   "name", "ForceSuccesType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getForceSuccesType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getForceSuccesType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (inverterTypeEClass,
		   source,
		   new String[] {
			   "name", "InverterType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInverterType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInverterType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (parallelTypeEClass,
		   source,
		   new String[] {
			   "name", "ParallelType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getParallelType_BuiltInMultipleTypes(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getParallelType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getParallelType_Threshold(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "threshold",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (repeatTypeEClass,
		   source,
		   new String[] {
			   "name", "RepeatType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRepeatType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRepeatType_NumCycles(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "num_cycles",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (retryTypeEClass,
		   source,
		   new String[] {
			   "name", "RetryType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRetryType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRetryType_NumAttempts(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "num_attempts",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (rootTypeEClass,
		   source,
		   new String[] {
			   "name", "root_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRootType_BehaviorTree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BehaviorTree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRootType_TreeNodeModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TreeNodeModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRootType_MainTreeToExecute(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "main_tree_to_execute",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sequenceStarTypeEClass,
		   source,
		   new String[] {
			   "name", "SequenceStarType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSequenceStarType_BuiltInMultipleTypes(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceStarType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sequenceTypeEClass,
		   source,
		   new String[] {
			   "name", "SequenceType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSequenceType_BuiltInMultipleTypes(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace",
			   "group", "BuiltInMultipleTypes:0"
		   });
		addAnnotation
		  (getSequenceType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subtreeTypeEClass,
		   source,
		   new String[] {
			   "name", "SubtreeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubtreeType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubtreeType_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##any",
			   "name", ":20",
			   "processing", "strict"
		   });
		addAnnotation
		  (timeoutTypeEClass,
		   source,
		   new String[] {
			   "name", "TimeoutType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTimeoutType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Subtree(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subtree",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Sequence(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sequence",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_SequenceStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SequenceStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_FallbackStar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FallbackStar",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Parallel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Parallel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Inverter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Inverter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_RetryUntilSuccesful(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RetryUntilSuccesful",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Repeat(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Repeat",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Timeout(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Timeout",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_ForceSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_ForceFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ForceFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_AlwaysSucces(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysSucces",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_AlwaysFailure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AlwaysFailure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Msec(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "msec",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTimeoutType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (treeNodeModelTypeEClass,
		   source,
		   new String[] {
			   "name", "TreeNodeModel_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTreeNodeModelType_Action(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Action",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTreeNodeModelType_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTreeNodeModelType_Decorator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Decorator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTreeNodeModelType_Control(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Control",
			   "namespace", "##targetNamespace"
		   });
	}

} //BehaviortreeSchemaPackageImpl
