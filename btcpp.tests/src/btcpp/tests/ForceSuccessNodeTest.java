/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.ForceSuccessNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Force Success Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForceSuccessNodeTest extends DecoratorNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForceSuccessNodeTest.class);
	}

	/**
	 * Constructs a new Force Success Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForceSuccessNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Force Success Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ForceSuccessNode getFixture() {
		return (ForceSuccessNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createForceSuccessNode());
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

} //ForceSuccessNodeTest
