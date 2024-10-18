/**
 */
package btcpp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blackboard Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.BlackboardPrecondition#getReturn_on_mismatch <em>Return on mismatch</em>}</li>
 *   <li>{@link btcpp.BlackboardPrecondition#getValue_A <em>Value A</em>}</li>
 *   <li>{@link btcpp.BlackboardPrecondition#getValue_B <em>Value B</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getBlackboardPrecondition()
 * @model abstract="true"
 * @generated
 */
public interface BlackboardPrecondition extends DecoratorNode {
	/**
	 * Returns the value of the '<em><b>Return on mismatch</b></em>' attribute.
	 * The literals are from the enumeration {@link btcpp.NodeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return on mismatch</em>' attribute.
	 * @see btcpp.NodeStatus
	 * @see #setReturn_on_mismatch(NodeStatus)
	 * @see btcpp.BtcppPackage#getBlackboardPrecondition_Return_on_mismatch()
	 * @model required="true"
	 * @generated
	 */
	NodeStatus getReturn_on_mismatch();

	/**
	 * Sets the value of the '{@link btcpp.BlackboardPrecondition#getReturn_on_mismatch <em>Return on mismatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return on mismatch</em>' attribute.
	 * @see btcpp.NodeStatus
	 * @see #getReturn_on_mismatch()
	 * @generated
	 */
	void setReturn_on_mismatch(NodeStatus value);

	/**
	 * Returns the value of the '<em><b>Value A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value A</em>' attribute.
	 * @see #setValue_A(String)
	 * @see btcpp.BtcppPackage#getBlackboardPrecondition_Value_A()
	 * @model required="true"
	 * @generated
	 */
	String getValue_A();

	/**
	 * Sets the value of the '{@link btcpp.BlackboardPrecondition#getValue_A <em>Value A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value A</em>' attribute.
	 * @see #getValue_A()
	 * @generated
	 */
	void setValue_A(String value);

	/**
	 * Returns the value of the '<em><b>Value B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value B</em>' attribute.
	 * @see #setValue_B(String)
	 * @see btcpp.BtcppPackage#getBlackboardPrecondition_Value_B()
	 * @model required="true"
	 * @generated
	 */
	String getValue_B();

	/**
	 * Sets the value of the '{@link btcpp.BlackboardPrecondition#getValue_B <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value B</em>' attribute.
	 * @see #getValue_B()
	 * @generated
	 */
	void setValue_B(String value);

} // BlackboardPrecondition
