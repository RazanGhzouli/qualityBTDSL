/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.IfThenElseNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>If Then Else Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IfThenElseNodeTest extends ControlNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IfThenElseNodeTest.class);
	}

	/**
	 * Constructs a new If Then Else Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenElseNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this If Then Else Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IfThenElseNode getFixture() {
		return (IfThenElseNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createIfThenElseNode());
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

} //IfThenElseNodeTest
