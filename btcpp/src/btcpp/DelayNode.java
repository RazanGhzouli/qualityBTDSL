/**
 */
package btcpp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.DelayNode#getDelay_msec <em>Delay msec</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getDelayNode()
 * @model
 * @generated
 */
public interface DelayNode extends DecoratorNode {
	/**
	 * Returns the value of the '<em><b>Delay msec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay msec</em>' attribute.
	 * @see #setDelay_msec(String)
	 * @see btcpp.BtcppPackage#getDelayNode_Delay_msec()
	 * @model
	 * @generated
	 */
	String getDelay_msec();

	/**
	 * Sets the value of the '{@link btcpp.DelayNode#getDelay_msec <em>Delay msec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay msec</em>' attribute.
	 * @see #getDelay_msec()
	 * @generated
	 */
	void setDelay_msec(String value);

} // DelayNode
