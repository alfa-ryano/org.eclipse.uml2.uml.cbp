/**
 */
package UML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Parameter#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see UML.UMLPackage#getParameter_Direction()
	 * @model
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link UML.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

} // Parameter
