/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.ReactiveSequenceNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reactive Sequence Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReactiveSequenceNodeTest extends ControlNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReactiveSequenceNodeTest.class);
	}

	/**
	 * Constructs a new Reactive Sequence Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactiveSequenceNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Reactive Sequence Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReactiveSequenceNode getFixture() {
		return (ReactiveSequenceNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createReactiveSequenceNode());
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

} //ReactiveSequenceNodeTest
