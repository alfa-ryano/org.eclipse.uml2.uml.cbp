/**
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Connectable Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ConnectableElement#getEnds() <em>Get Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectableElementOperations extends NamedElementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for ConnectableElement::/end : ConnectorEnd
	 * result = (ConnectorEnd.allInstances()->select(role = self))
	 * <p>From package UML::StructuredClassifiers.</p>
	 * @param connectableElement The receiving '<em><b>Connectable Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ConnectorEnd> getEnds(ConnectableElement connectableElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ConnectableElementOperations