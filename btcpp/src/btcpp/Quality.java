/**
 */
package btcpp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link btcpp.Quality#getID <em>ID</em>}</li>
 *   <li>{@link btcpp.Quality#getQualityreq <em>Qualityreq</em>}</li>
 * </ul>
 *
 * @see btcpp.BtcppPackage#getQuality()
 * @model
 * @generated
 */
public interface Quality extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see btcpp.BtcppPackage#getQuality_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link btcpp.Quality#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Qualityreq</b></em>' containment reference list.
	 * The list contents are of type {@link btcpp.QualityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualityreq</em>' containment reference list.
	 * @see btcpp.BtcppPackage#getQuality_Qualityreq()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualityRequirement> getQualityreq();

} // Quality
