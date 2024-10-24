/**
 */
package btcpp.tests;

import btcpp.BtcppFactory;
import btcpp.SequenceWithMemoryNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequence With Memory Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceWithMemoryNodeTest extends ControlNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequenceWithMemoryNodeTest.class);
	}

	/**
	 * Constructs a new Sequence With Memory Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceWithMemoryNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequence With Memory Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SequenceWithMemoryNode getFixture() {
		return (SequenceWithMemoryNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BtcppFactory.eINSTANCE.createSequenceWithMemoryNode());
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

} //SequenceWithMemoryNodeTest
