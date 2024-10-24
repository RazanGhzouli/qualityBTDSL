/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.WhileDoElseNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>While Do Else Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileDoElseNodeTest extends ControlNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhileDoElseNodeTest.class);
	}

	/**
	 * Constructs a new While Do Else Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileDoElseNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this While Do Else Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WhileDoElseNode getFixture() {
		return (WhileDoElseNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createWhileDoElseNode());
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

} //WhileDoElseNodeTest
