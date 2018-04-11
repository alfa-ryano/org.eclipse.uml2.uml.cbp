/**
 */
package UML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.TypedElement#getType <em>Type</em>}</li>
 *   <li>{@link UML.TypedElement#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link UML.TypedElement#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(UML.Package)
	 * @see UML.UMLPackage#getTypedElement_Type()
	 * @model
	 * @generated
	 */
	UML.Package getType();

	/**
	 * Sets the value of the '{@link UML.TypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(UML.Package value);

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference.
	 * @see #setLowerValue(LiteralInteger)
	 * @see UML.UMLPackage#getTypedElement_LowerValue()
	 * @model containment="true"
	 * @generated
	 */
	LiteralInteger getLowerValue();

	/**
	 * Sets the value of the '{@link UML.TypedElement#getLowerValue <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Value</em>' containment reference.
	 * @see #getLowerValue()
	 * @generated
	 */
	void setLowerValue(LiteralInteger value);

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference.
	 * @see #setUpperValue(LiteralUnlimitedNatural)
	 * @see UML.UMLPackage#getTypedElement_UpperValue()
	 * @model containment="true"
	 * @generated
	 */
	LiteralUnlimitedNatural getUpperValue();

	/**
	 * Sets the value of the '{@link UML.TypedElement#getUpperValue <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Value</em>' containment reference.
	 * @see #getUpperValue()
	 * @generated
	 */
	void setUpperValue(LiteralUnlimitedNatural value);

} // TypedElement
