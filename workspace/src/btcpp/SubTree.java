/**
 */
package btcpp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.SubTree#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getSubTree()
 * @model
 * @generated
 */
public interface SubTree extends TreeNode {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link btcpp.TreeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see btcpp.BtcppPackage#getSubTree_Child()
	 * @model containment="true"
	 * @generated
	 */
	EList<TreeNode> getChild();

} // SubTree
