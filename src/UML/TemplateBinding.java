/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link UML.TemplateBinding#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends Element {
	/**
	 * Returns the value of the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link UML.TemplateParameterSubstitution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Substitution</em>' containment reference list.
	 * @see UML.UMLPackage#getTemplateBinding_ParameterSubstitution()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateParameterSubstitution> getParameterSubstitution();

	/**
	 * Returns the value of the '<em><b>Bound Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Element</em>' reference.
	 * @see #setBoundElement(UML.Package)
	 * @see UML.UMLPackage#getTemplateBinding_BoundElement()
	 * @model
	 * @generated
	 */
	UML.Package getBoundElement();

	/**
	 * Sets the value of the '{@link UML.TemplateBinding#getBoundElement <em>Bound Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Element</em>' reference.
	 * @see #getBoundElement()
	 * @generated
	 */
	void setBoundElement(UML.Package value);

} // TemplateBinding
