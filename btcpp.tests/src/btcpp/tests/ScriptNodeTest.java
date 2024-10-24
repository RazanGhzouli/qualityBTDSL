/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.ScriptNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Script Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptNodeTest extends SyncActionNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScriptNodeTest.class);
	}

	/**
	 * Constructs a new Script Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Script Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScriptNode getFixture() {
		return (ScriptNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createScriptNode());
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

} //ScriptNodeTest
