/**
 */
package btcpp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.DecoratorNode#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getDecoratorNode()
 * @model abstract="true"
 * @generated
 */
public interface DecoratorNode extends TreeNode {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(TreeNode)
	 * @see btcpp.BtcppPackage#getDecoratorNode_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TreeNode getChild();

	/**
	 * Sets the value of the '{@link btcpp.DecoratorNode#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(TreeNode value);

} // DecoratorNode
