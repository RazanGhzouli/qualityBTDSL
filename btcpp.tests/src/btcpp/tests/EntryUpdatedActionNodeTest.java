/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.EntryUpdatedActionNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entry Updated Action Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryUpdatedActionNodeTest extends SyncActionNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntryUpdatedActionNodeTest.class);
	}

	/**
	 * Constructs a new Entry Updated Action Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryUpdatedActionNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entry Updated Action Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntryUpdatedActionNode getFixture() {
		return (EntryUpdatedActionNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createEntryUpdatedActionNode());
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

} //EntryUpdatedActionNodeTest
