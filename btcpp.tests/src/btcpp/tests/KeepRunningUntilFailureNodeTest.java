/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.KeepRunningUntilFailureNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Keep Running Until Failure Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KeepRunningUntilFailureNodeTest extends DecoratorNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KeepRunningUntilFailureNodeTest.class);
	}

	/**
	 * Constructs a new Keep Running Until Failure Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepRunningUntilFailureNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Keep Running Until Failure Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KeepRunningUntilFailureNode getFixture() {
		return (KeepRunningUntilFailureNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createKeepRunningUntilFailureNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //KeepRunningUntilFailureNodeTest
