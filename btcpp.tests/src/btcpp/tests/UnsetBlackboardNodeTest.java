/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.UnsetBlackboardNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unset Blackboard Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnsetBlackboardNodeTest extends SyncActionNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnsetBlackboardNodeTest.class);
	}

	/**
	 * Constructs a new Unset Blackboard Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsetBlackboardNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unset Blackboard Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnsetBlackboardNode getFixture() {
		return (UnsetBlackboardNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createUnsetBlackboardNode());
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

} //UnsetBlackboardNodeTest
