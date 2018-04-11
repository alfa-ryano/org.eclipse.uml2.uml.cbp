/**
 */
package UML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link UML.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends Element {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(UML.Class)
	 * @see UML.UMLPackage#getGeneralization_General()
	 * @model
	 * @generated
	 */
	UML.Class getGeneral();

	/**
	 * Sets the value of the '{@link UML.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(UML.Class value);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' reference.
	 * @see #setSpecific(UML.Class)
	 * @see UML.UMLPackage#getGeneralization_Specific()
	 * @model
	 * @generated
	 */
	UML.Class getSpecific();

	/**
	 * Sets the value of the '{@link UML.Generalization#getSpecific <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(UML.Class value);

} // Generalization
