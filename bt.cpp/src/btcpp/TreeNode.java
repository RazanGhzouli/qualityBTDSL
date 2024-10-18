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
 *   <li>{@link btcpp.TreeNode#getUID <em>UID</em>}</li>
 *   <li>{@link btcpp.TreeNode#getName <em>Name</em>}</li>
 *   <li>{@link btcpp.TreeNode#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link btcpp.TreeNode#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link btcpp.TreeNode#getNodeStatus <em>Node Status</em>}</li>
 *   <li>{@link btcpp.TreeNode#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getTreeNode()
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
	 * @see btcpp.BtcppPackage#getTreeNode_UID()
	 * @model id="true" transient="true" derived="true"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link btcpp.TreeNode#getUID <em>UID</em>}' attribute.
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
	 * @see btcpp.BtcppPackage#getTreeNode_Name()
	 * @model
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
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * The literals are from the enumeration {@link btcpp.NodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see btcpp.NodeType
	 * @see #setNodeType(NodeType)
	 * @see btcpp.BtcppPackage#getTreeNode_NodeType()
	 * @model
	 * @generated
	 */
	NodeType getNodeType();

	/**
	 * Sets the value of the '{@link btcpp.TreeNode#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see btcpp.NodeType
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(NodeType value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see btcpp.BtcppPackage#getTreeNode_AnyAttribute()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

	/**
	 * Returns the value of the '<em><b>Node Status</b></em>' attribute.
	 * The literals are from the enumeration {@link btcpp.NodeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Status</em>' attribute.
	 * @see btcpp.NodeStatus
	 * @see #setNodeStatus(NodeStatus)
	 * @see btcpp.BtcppPackage#getTreeNode_NodeStatus()
	 * @model
	 * @generated
	 */
	NodeStatus getNodeStatus();

	/**
	 * Sets the value of the '{@link btcpp.TreeNode#getNodeStatus <em>Node Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Status</em>' attribute.
	 * @see btcpp.NodeStatus
	 * @see #getNodeStatus()
	 * @generated
	 */
	void setNodeStatus(NodeStatus value);

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

} // TreeNode
