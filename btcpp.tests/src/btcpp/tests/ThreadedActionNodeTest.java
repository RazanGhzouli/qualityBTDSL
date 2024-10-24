/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.ThreadedActionNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Threaded Action Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreadedActionNodeTest extends ActionNodeBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThreadedActionNodeTest.class);
	}

	/**
	 * Constructs a new Threaded Action Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadedActionNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Threaded Action Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ThreadedActionNode getFixture() {
		return (ThreadedActionNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createThreadedActionNode());
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

} //ThreadedActionNodeTest
