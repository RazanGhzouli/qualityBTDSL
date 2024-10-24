/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.CoroActionNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coro Action Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoroActionNodeTest extends AsynchActionNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CoroActionNodeTest.class);
	}

	/**
	 * Constructs a new Coro Action Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoroActionNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Coro Action Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CoroActionNode getFixture() {
		return (CoroActionNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createCoroActionNode());
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

} //CoroActionNodeTest
