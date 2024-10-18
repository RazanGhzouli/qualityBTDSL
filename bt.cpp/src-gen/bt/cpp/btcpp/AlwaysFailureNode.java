/**
 */
package bt.cpp.btcpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Always Failure Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.AlwaysFailureNode#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see bt.cpp.btcpp.BtcppPackage#getAlwaysFailureNode()
 * @model
 * @generated
 */
public interface AlwaysFailureNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference.
	 * @see #setActions(SyncActionNode)
	 * @see bt.cpp.btcpp.BtcppPackage#getAlwaysFailureNode_Actions()
	 * @model
	 * @generated
	 */
	SyncActionNode getActions();

	/**
	 * Sets the value of the '{@link bt.cpp.btcpp.AlwaysFailureNode#getActions <em>Actions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(SyncActionNode value);

} // AlwaysFailureNode
