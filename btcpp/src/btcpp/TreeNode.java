/**
 */
package btcpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.TreeNode#getID <em>ID</em>}</li>
 *   <li>{@link btcpp.TreeNode#getName <em>Name</em>}</li>
 *   <li>{@link btcpp.TreeNode#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link btcpp.TreeNode#getParameters <em>Parameters</em>}</li>
 *   <li>{@link btcpp.TreeNode#getSatisfices <em>Satisfices</em>}</li>
 *   <li>{@link btcpp.TreeNode#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getTreeNode()
 * @model abstract="true"
 * @generated
 */
public interface TreeNode extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see btcpp.BtcppPackage#getTreeNode_ID()
	 * @model unique="false"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link btcpp.TreeNode#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see btcpp.BtcppPackage#getTreeNode_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link btcpp.TreeNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see btcpp.BtcppPackage#getTreeNode_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link btcpp.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see btcpp.BtcppPackage#getTreeNode_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Satisfices</b></em>' containment reference list.
	 * The list contents are of type {@link btcpp.Quality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfices</em>' containment reference list.
	 * @see btcpp.BtcppPackage#getTreeNode_Satisfices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Quality> getSatisfices();

	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' containment reference list.
	 * The list contents are of type {@link btcpp.QualityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfies</em>' containment reference list.
	 * @see btcpp.BtcppPackage#getTreeNode_Satisfies()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualityRequirement> getSatisfies();

} // TreeNode
