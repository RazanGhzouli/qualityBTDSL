/**
 */
package bt.cpp.btcpp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bt.cpp.btcpp.Root#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see bt.cpp.btcpp.BtcppPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(BehaviorTree)
	 * @see bt.cpp.btcpp.BtcppPackage#getRoot_Root()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BehaviorTree getRoot();

	/**
	 * Sets the value of the '{@link bt.cpp.btcpp.Root#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(BehaviorTree value);

} // Root
