/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.SetBlackboardNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Set Blackboard Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetBlackboardNodeTest extends SyncActionNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SetBlackboardNodeTest.class);
	}

	/**
	 * Constructs a new Set Blackboard Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetBlackboardNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Set Blackboard Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SetBlackboardNode getFixture() {
		return (SetBlackboardNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createSetBlackboardNode());
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

} //SetBlackboardNodeTest
