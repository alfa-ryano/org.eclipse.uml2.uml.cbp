/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.EnumerationLiteral#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link UML.EnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends UML.Package {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see UML.UMLPackage#getEnumerationLiteral_Classifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Enumeration> getClassifier();

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' reference.
	 * @see #setEnumeration(Enumeration)
	 * @see UML.UMLPackage#getEnumerationLiteral_Enumeration()
	 * @model
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link UML.EnumerationLiteral#getEnumeration <em>Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

} // EnumerationLiteral
