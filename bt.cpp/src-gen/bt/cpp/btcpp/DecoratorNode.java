/**
 */
package bt.cpp.btcpp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.DecoratorNode#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see bt.cpp.btcpp.BtcppPackage#getDecoratorNode()
 * @model
 * @generated
 */
public interface DecoratorNode extends TreeNode {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(TreeNode)
	 * @see bt.cpp.btcpp.BtcppPackage#getDecoratorNode_Child()
	 * @model
	 * @generated
	 */
	TreeNode getChild();

	/**
	 * Sets the value of the '{@link bt.cpp.btcpp.DecoratorNode#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(TreeNode value);

} // DecoratorNode
