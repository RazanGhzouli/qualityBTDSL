/**
 */
package btcpp.tests;

import btcpp.AlwaysFailureNode;
import btcpp.BtcppFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Always Failure Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlwaysFailureNodeTest extends SyncActionNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlwaysFailureNodeTest.class);
	}

	/**
	 * Constructs a new Always Failure Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlwaysFailureNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Always Failure Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AlwaysFailureNode getFixture() {
		return (AlwaysFailureNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createAlwaysFailureNode());
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

} //AlwaysFailureNodeTest
