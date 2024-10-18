/**
 */
package bt.cpp.btcpp;

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
 *   <li>{@link bt.cpp.btcpp.SubTree#getRefersTo <em>Refers To</em>}</li>
 * </ul>
 *
 * @see bt.cpp.btcpp.BtcppPackage#getSubTree()
 * @model
 * @generated
 */
public interface SubTree extends TreeNode {
	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference list.
	 * The list contents are of type {@link bt.cpp.btcpp.BehaviorTree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference list.
	 * @see bt.cpp.btcpp.BtcppPackage#getSubTree_RefersTo()
	 * @model
	 * @generated
	 */
	EList<BehaviorTree> getRefersTo();

} // SubTree
