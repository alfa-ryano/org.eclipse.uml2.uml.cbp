/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.Package#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Element {
	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' reference list.
	 * The list contents are of type {@link UML.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Element</em>' reference list.
	 * @see UML.UMLPackage#getPackage_PackagedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Package> getPackagedElement();

} // Package
