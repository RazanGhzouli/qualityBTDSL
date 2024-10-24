/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.PopFromQueueNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pop From Queue Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PopFromQueueNodeTest extends SyncActionNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PopFromQueueNodeTest.class);
	}

	/**
	 * Constructs a new Pop From Queue Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopFromQueueNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pop From Queue Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PopFromQueueNode getFixture() {
		return (PopFromQueueNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createPopFromQueueNode());
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

} //PopFromQueueNodeTest
