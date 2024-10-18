/**
 */
package bt.cpp.btcpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.NodeConfiguration#getBlackboard <em>Blackboard</em>}</li>
 * </ul>
 *
 * @see bt.cpp.btcpp.BtcppPackage#getNodeConfiguration()
 * @model
 * @generated
 */
public interface NodeConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Blackboard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blackboard</em>' containment reference.
	 * @see #setBlackboard(BlackBoard)
	 * @see bt.cpp.btcpp.BtcppPackage#getNodeConfiguration_Blackboard()
	 * @model containment="true"
	 * @generated
	 */
	BlackBoard getBlackboard();

	/**
	 * Sets the value of the '{@link bt.cpp.btcpp.NodeConfiguration#getBlackboard <em>Blackboard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blackboard</em>' containment reference.
	 * @see #getBlackboard()
	 * @generated
	 */
	void setBlackboard(BlackBoard value);

} // NodeConfiguration
