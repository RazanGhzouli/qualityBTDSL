/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.DelayNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delay Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelayNodeTest extends DecoratorNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelayNodeTest.class);
	}

	/**
	 * Constructs a new Delay Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delay Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DelayNode getFixture() {
		return (DelayNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createDelayNode());
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

} //DelayNodeTest
