/**
 */
package bt.cpp.btcpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.BehaviorTree#getNode <em>Node</em>}</li>
 *   <li>{@link bt.cpp.btcpp.BehaviorTree#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see bt.cpp.btcpp.BtcppPackage#getBehaviorTree()
 * @model
 * @generated
 */
public interface BehaviorTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link bt.cpp.btcpp.TreeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see bt.cpp.btcpp.BtcppPackage#getBehaviorTree_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TreeNode> getNode();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bt.cpp.btcpp.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bt.cpp.btcpp.NodeType
	 * @see #setType(NodeType)
	 * @see bt.cpp.btcpp.BtcppPackage#getBehaviorTree_Type()
	 * @model
	 * @generated
	 */
	NodeType getType();

	/**
	 * Sets the value of the '{@link bt.cpp.btcpp.BehaviorTree#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bt.cpp.btcpp.NodeType
	 * @see #getType()
	 * @generated
	 */
	void setType(NodeType value);

} // BehaviorTree
