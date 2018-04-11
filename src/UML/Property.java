/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Property#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link UML.Property#getAssociation <em>Association</em>}</li>
 *   <li>{@link UML.Property#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link UML.Property#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link UML.Property#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link UML.Property#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends Attribute {
	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see UML.UMLPackage#getProperty_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link UML.Property#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see UML.UMLPackage#getProperty_Association()
	 * @model
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link UML.Property#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see UML.UMLPackage#getProperty_Qualifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getQualifier();

	/**
	 * Returns the value of the '<em><b>Owning Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Association</em>' reference.
	 * @see #setOwningAssociation(Association)
	 * @see UML.UMLPackage#getProperty_OwningAssociation()
	 * @model
	 * @generated
	 */
	Association getOwningAssociation();

	/**
	 * Sets the value of the '{@link UML.Property#getOwningAssociation <em>Owning Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Association</em>' reference.
	 * @see #getOwningAssociation()
	 * @generated
	 */
	void setOwningAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End</em>' reference.
	 * @see #setAssociationEnd(Association)
	 * @see UML.UMLPackage#getProperty_AssociationEnd()
	 * @model
	 * @generated
	 */
	Association getAssociationEnd();

	/**
	 * Sets the value of the '{@link UML.Property#getAssociationEnd <em>Association End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End</em>' reference.
	 * @see #getAssociationEnd()
	 * @generated
	 */
	void setAssociationEnd(Association value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see UML.UMLPackage#getProperty_Interface()
	 * @model
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link UML.Property#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // Property
