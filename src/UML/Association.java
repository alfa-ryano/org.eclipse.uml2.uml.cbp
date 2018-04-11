/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Association#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link UML.Association#getOwnedEnd <em>Owned End</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends UML.Package {
	/**
	 * Returns the value of the '<em><b>Member End</b></em>' reference list.
	 * The list contents are of type {@link UML.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member End</em>' reference list.
	 * @see UML.UMLPackage#getAssociation_MemberEnd()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getMemberEnd();

	/**
	 * Returns the value of the '<em><b>Owned End</b></em>' reference list.
	 * The list contents are of type {@link UML.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned End</em>' reference list.
	 * @see UML.UMLPackage#getAssociation_OwnedEnd()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Property> getOwnedEnd();

} // Association
