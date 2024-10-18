/**
 */
package btcpp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retry Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.RetryNode#getNum_attempts <em>Num attempts</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getRetryNode()
 * @model
 * @generated
 */
public interface RetryNode extends DecoratorNode {
	/**
	 * Returns the value of the '<em><b>Num attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num attempts</em>' attribute.
	 * @see #setNum_attempts(String)
	 * @see btcpp.BtcppPackage#getRetryNode_Num_attempts()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNum_attempts();

	/**
	 * Sets the value of the '{@link btcpp.RetryNode#getNum_attempts <em>Num attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num attempts</em>' attribute.
	 * @see #getNum_attempts()
	 * @generated
	 */
	void setNum_attempts(String value);

} // RetryNode
