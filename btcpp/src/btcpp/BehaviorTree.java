/**
 */
package btcpp;

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
 *   <li>{@link btcpp.BehaviorTree#getNode <em>Node</em>}</li>
 *   <li>{@link btcpp.BehaviorTree#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getBehaviorTree()
 * @model
 * @generated
 */
public interface BehaviorTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(TreeNode)
	 * @see btcpp.BtcppPackage#getBehaviorTree_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TreeNode getNode();

	/**
	 * Sets the value of the '{@link btcpp.BehaviorTree#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(TreeNode value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see btcpp.BtcppPackage#getBehaviorTree_ID()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link btcpp.BehaviorTree#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // BehaviorTree
