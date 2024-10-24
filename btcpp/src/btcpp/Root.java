/**
 */
package btcpp;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link btcpp.Root#getBehaviortrees <em>Behaviortrees</em>}</li>
 *   <li>{@link btcpp.Root#getMain_tree_to_execute <em>Main tree to execute</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Behaviortrees</b></em>' containment reference list.
	 * The list contents are of type {@link btcpp.BehaviorTree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviortrees</em>' containment reference list.
	 * @see btcpp.BtcppPackage#getRoot_Behaviortrees()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BehaviorTree> getBehaviortrees();

	/**
	 * Returns the value of the '<em><b>Main tree to execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main tree to execute</em>' attribute.
	 * @see #setMain_tree_to_execute(String)
	 * @see btcpp.BtcppPackage#getRoot_Main_tree_to_execute()
	 * @model required="true"
	 * @generated
	 */
	String getMain_tree_to_execute();

	/**
	 * Sets the value of the '{@link btcpp.Root#getMain_tree_to_execute <em>Main tree to execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main tree to execute</em>' attribute.
	 * @see #getMain_tree_to_execute()
	 * @generated
	 */
	void setMain_tree_to_execute(String value);

} // Root
