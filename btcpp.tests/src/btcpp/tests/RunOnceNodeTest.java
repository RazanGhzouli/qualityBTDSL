/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.RunOnceNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Run Once Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RunOnceNodeTest extends DecoratorNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RunOnceNodeTest.class);
	}

	/**
	 * Constructs a new Run Once Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunOnceNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Run Once Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RunOnceNode getFixture() {
		return (RunOnceNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createRunOnceNode());
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

} //RunOnceNodeTest
