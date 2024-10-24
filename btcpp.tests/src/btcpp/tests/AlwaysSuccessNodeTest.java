/**
 */
package btcpp.tests;

import btcpp.AlwaysSuccessNode;
import btcpp.BtcppFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Always Success Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlwaysSuccessNodeTest extends SyncActionNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlwaysSuccessNodeTest.class);
	}

	/**
	 * Constructs a new Always Success Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlwaysSuccessNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Always Success Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AlwaysSuccessNode getFixture() {
		return (AlwaysSuccessNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createAlwaysSuccessNode());
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

} //AlwaysSuccessNodeTest
