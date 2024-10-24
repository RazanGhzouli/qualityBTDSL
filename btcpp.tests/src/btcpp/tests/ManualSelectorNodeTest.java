/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.ManualSelectorNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manual Selector Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManualSelectorNodeTest extends ControlNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManualSelectorNodeTest.class);
	}

	/**
	 * Constructs a new Manual Selector Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualSelectorNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Manual Selector Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ManualSelectorNode getFixture() {
		return (ManualSelectorNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createManualSelectorNode());
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

} //ManualSelectorNodeTest
