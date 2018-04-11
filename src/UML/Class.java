/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link UML.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link UML.Class#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link UML.Class#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link UML.Class#getNestedClassifier <em>Nested Classifier</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends UML.Package {
	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see UML.UMLPackage#getClass_OwnedAttribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see UML.UMLPackage#getClass_OwnedOperation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see UML.UMLPackage#getClass_Generalization()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' containment reference list.
	 * The list contents are of type {@link UML.TemplateBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Binding</em>' containment reference list.
	 * @see UML.UMLPackage#getClass_TemplateBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateBinding> getTemplateBinding();

	/**
	 * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Classifier</em>' containment reference list.
	 * @see UML.UMLPackage#getClass_NestedClassifier()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Class> getNestedClassifier();

} // Class
