/**
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encapsulated Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.EncapsulatedClassifier#getOwnedPorts() <em>Get Owned Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncapsulatedClassifierOperations extends StructuredClassifierOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedClassifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for EncapsulatedClassifier::/ownedPort : Port
	 * result = (ownedAttribute->select(oclIsKindOf(Port))->collect(oclAsType(Port))->asOrderedSet())
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param encapsulatedClassifier The receiving '<em><b>Encapsulated Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Port> getOwnedPorts(EncapsulatedClassifier encapsulatedClassifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // EncapsulatedClassifierOperations