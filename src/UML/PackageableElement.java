/**
 */
package UML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UML.PackageableElement#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 *
 * @see UML.UMLPackage#getPackageableElement()
 * @model
 * @generated
 */
public interface PackageableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link UML.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see UML.UMLPackage#getPackageableElement_PackagedElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UML.Package> getPackagedElement();

} // PackageableElement
