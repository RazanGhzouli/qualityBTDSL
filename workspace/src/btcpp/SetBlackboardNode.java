/**
 */
package btcpp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Blackboard Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.SetBlackboardNode#getValue <em>Value</em>}</li>
 *   <li>{@link btcpp.SetBlackboardNode#getOutput_key <em>Output key</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getSetBlackboardNode()
 * @model
 * @generated
 */
public interface SetBlackboardNode extends ActionNodeBase {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see btcpp.BtcppPackage#getSetBlackboardNode_Value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link btcpp.SetBlackboardNode#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Output key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output key</em>' attribute.
	 * @see #setOutput_key(String)
	 * @see btcpp.BtcppPackage#getSetBlackboardNode_Output_key()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getOutput_key();

	/**
	 * Sets the value of the '{@link btcpp.SetBlackboardNode#getOutput_key <em>Output key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output key</em>' attribute.
	 * @see #getOutput_key()
	 * @generated
	 */
	void setOutput_key(String value);

} // SetBlackboardNode
