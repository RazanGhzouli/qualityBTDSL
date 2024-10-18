/**
 */
package bt.cpp.btcpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.TreeNode#getUID <em>UID</em>}</li>
 *   <li>{@link bt.cpp.btcpp.TreeNode#getName <em>Name</em>}</li>
 *   <li>{@link bt.cpp.btcpp.TreeNode#getConfig <em>Config</em>}</li>
 *   <li>{@link bt.cpp.btcpp.TreeNode#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see bt.cpp.btcpp.BtcppPackage#getTreeNode()
 * @model abstract="true"
 * @generated
 */
public interface TreeNode extends EObject {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see bt.cpp.btcpp.BtcppPackage#getTreeNode_UID()
	 * @model
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link bt.cpp.btcpp.TreeNode#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bt.cpp.btcpp.BtcppPackage#getTreeNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bt.cpp.btcpp.TreeNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(NodeConfiguration)
	 * @see bt.cpp.btcpp.BtcppPackage#getTreeNode_Config()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeConfiguration getConfig();

	/**
	 * Sets the value of the '{@link bt.cpp.btcpp.TreeNode#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(NodeConfiguration value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link bt.cpp.btcpp.NodeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see bt.cpp.btcpp.NodeStatus
	 * @see #setStatus(NodeStatus)
	 * @see bt.cpp.btcpp.BtcppPackage#getTreeNode_Status()
	 * @model
	 * @generated
	 */
	NodeStatus getStatus();

	/**
	 * Sets the value of the '{@link bt.cpp.btcpp.TreeNode#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see bt.cpp.btcpp.NodeStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(NodeStatus value);

} // TreeNode
