/**
 */
package BehaviortreeSchema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link BehaviortreeSchema.RootType#getBehaviorTree <em>Behavior Tree</em>}</li>
 *   <li>{@link BehaviortreeSchema.RootType#getTreeNodeModel <em>Tree Node Model</em>}</li>
 *   <li>{@link BehaviortreeSchema.RootType#getMainTreeToExecute <em>Main Tree To Execute</em>}</li>
 * </ul>
 *
 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getRootType()
 * @model extendedMetaData="name='root_._type' kind='elementOnly'"
 * @generated
 */
public interface RootType extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior Tree</b></em>' containment reference list.
	 * The list contents are of type {@link BehaviortreeSchema.BehaviorTreeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Tree</em>' containment reference list.
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getRootType_BehaviorTree()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BehaviorTree' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BehaviorTreeType> getBehaviorTree();

	/**
	 * Returns the value of the '<em><b>Tree Node Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Node Model</em>' containment reference.
	 * @see #setTreeNodeModel(TreeNodeModelType)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getRootType_TreeNodeModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TreeNodeModel' namespace='##targetNamespace'"
	 * @generated
	 */
	TreeNodeModelType getTreeNodeModel();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.RootType#getTreeNodeModel <em>Tree Node Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Node Model</em>' containment reference.
	 * @see #getTreeNodeModel()
	 * @generated
	 */
	void setTreeNodeModel(TreeNodeModelType value);

	/**
	 * Returns the value of the '<em><b>Main Tree To Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Tree To Execute</em>' attribute.
	 * @see #setMainTreeToExecute(String)
	 * @see BehaviortreeSchema.BehaviortreeSchemaPackage#getRootType_MainTreeToExecute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='main_tree_to_execute' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMainTreeToExecute();

	/**
	 * Sets the value of the '{@link BehaviortreeSchema.RootType#getMainTreeToExecute <em>Main Tree To Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Tree To Execute</em>' attribute.
	 * @see #getMainTreeToExecute()
	 * @generated
	 */
	void setMainTreeToExecute(String value);

} // RootType
