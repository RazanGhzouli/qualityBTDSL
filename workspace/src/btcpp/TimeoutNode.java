/**
 */
package btcpp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timeout Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.TimeoutNode#getMsec <em>Msec</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getTimeoutNode()
 * @model
 * @generated
 */
public interface TimeoutNode extends DecoratorNode {
	/**
	 * Returns the value of the '<em><b>Msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msec</em>' attribute.
	 * @see #setMsec(String)
	 * @see btcpp.BtcppPackage#getTimeoutNode_Msec()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getMsec();

	/**
	 * Sets the value of the '{@link btcpp.TimeoutNode#getMsec <em>Msec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msec</em>' attribute.
	 * @see #getMsec()
	 * @generated
	 */
	void setMsec(String value);

} // TimeoutNode
