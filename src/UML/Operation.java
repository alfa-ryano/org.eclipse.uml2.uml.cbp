/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Operation#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link UML.Operation#getClass_ <em>Class</em>}</li>
 *   <li>{@link UML.Operation#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends UML.Package {
	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see UML.UMLPackage#getOperation_OwnedParameter()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(UML.Class)
	 * @see UML.UMLPackage#getOperation_Class()
	 * @model
	 * @generated
	 */
	UML.Class getClass_();

	/**
	 * Sets the value of the '{@link UML.Operation#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(UML.Class value);

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
	 * @see UML.UMLPackage#getOperation_Interface()
	 * @model
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link UML.Operation#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // Operation
