/**
 */
package UML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.TemplateParameterSubstitution#getActual <em>Actual</em>}</li>
 *   <li>{@link UML.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getTemplateParameterSubstitution()
 * @model
 * @generated
 */
public interface TemplateParameterSubstitution extends Element {
	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference.
	 * @see #setActual(UML.Package)
	 * @see UML.UMLPackage#getTemplateParameterSubstitution_Actual()
	 * @model containment="true"
	 * @generated
	 */
	UML.Package getActual();

	/**
	 * Sets the value of the '{@link UML.TemplateParameterSubstitution#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(UML.Package value);

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Binding</em>' reference.
	 * @see #setTemplateBinding(TemplateBinding)
	 * @see UML.UMLPackage#getTemplateParameterSubstitution_TemplateBinding()
	 * @model
	 * @generated
	 */
	TemplateBinding getTemplateBinding();

	/**
	 * Sets the value of the '{@link UML.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Binding</em>' reference.
	 * @see #getTemplateBinding()
	 * @generated
	 */
	void setTemplateBinding(TemplateBinding value);

} // TemplateParameterSubstitution
