/**
 */
package bt.cpp.btcpp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.ControlNode#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see bt.cpp.btcpp.BtcppPackage#getControlNode()
 * @model
 * @generated
 */
public interface ControlNode extends TreeNode {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link bt.cpp.btcpp.TreeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see bt.cpp.btcpp.BtcppPackage#getControlNode_Child()
	 * @model
	 * @generated
	 */
	EList<TreeNode> getChild();

} // ControlNode
