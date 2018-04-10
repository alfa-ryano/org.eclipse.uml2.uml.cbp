/**
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Structured Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#createOwnedAttribute(java.lang.String, org.eclipse.uml2.uml.Type, int, int) <em>Create Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#getParts() <em>Get Parts</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StructuredClassifier#allRoles() <em>All Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredClassifierOperations extends ClassifierOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredClassifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a property with the specified name, type, lower bound, and upper bound as an owned attribute of this structured classifier.
	 * @param structuredClassifier The receiving '<em><b>Structured Classifier</b></em>' model object.
	 * @param name The name for the new attribute, or null.
	 * @param type The type for the new attribute, or null.
	 * @param lower The lower bound for the new attribute.
	 * @param upper The upper bound for the new attribute.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Property createOwnedAttribute(StructuredClassifier structuredClassifier, String name, Type type,
			int lower, int upper) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for StructuredClassifier::/part
	 * result = (ownedAttribute->select(isComposite)->asSet())
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param structuredClassifier The receiving '<em><b>Structured Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Property> getParts(StructuredClassifier structuredClassifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All features of type ConnectableElement, equivalent to all direct and inherited roles.
	 * result = (allFeatures()->select(oclIsKindOf(ConnectableElement))->collect(oclAsType(ConnectableElement))->asSet())
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param structuredClassifier The receiving '<em><b>Structured Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ConnectableElement> allRoles(StructuredClassifier structuredClassifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // StructuredClassifierOperations