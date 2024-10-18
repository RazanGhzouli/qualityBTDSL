/**
 */
package btcpp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.RepeatNode#getNum_cycles <em>Num cycles</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getRepeatNode()
 * @model
 * @generated
 */
public interface RepeatNode extends DecoratorNode {
	/**
	 * Returns the value of the '<em><b>Num cycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num cycles</em>' attribute.
	 * @see #setNum_cycles(String)
	 * @see btcpp.BtcppPackage#getRepeatNode_Num_cycles()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getNum_cycles();

	/**
	 * Sets the value of the '{@link btcpp.RepeatNode#getNum_cycles <em>Num cycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num cycles</em>' attribute.
	 * @see #getNum_cycles()
	 * @generated
	 */
	void setNum_cycles(String value);

} // RepeatNode
