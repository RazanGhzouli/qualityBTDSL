/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.ReactiveFallbackNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reactive Fallback Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactiveFallbackNodeTest extends ControlNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReactiveFallbackNodeTest.class);
	}

	/**
	 * Constructs a new Reactive Fallback Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveFallbackNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reactive Fallback Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReactiveFallbackNode getFixture() {
		return (ReactiveFallbackNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createReactiveFallbackNode());
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

} //ReactiveFallbackNodeTest
