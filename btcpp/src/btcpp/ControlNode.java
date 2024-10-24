/**
 */
package btcpp;

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
 *   <li>{@link btcpp.ControlNode#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getControlNode()
 * @model abstract="true"
 * @generated
 */
public interface ControlNode extends TreeNode {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link btcpp.TreeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see btcpp.BtcppPackage#getControlNode_Child()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TreeNode> getChild();

} // ControlNode
