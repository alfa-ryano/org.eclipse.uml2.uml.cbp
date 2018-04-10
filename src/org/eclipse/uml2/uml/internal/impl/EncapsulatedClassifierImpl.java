/**
 */
package org.eclipse.uml2.uml.internal.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EncapsulatedClassifierImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EncapsulatedClassifierImpl#getOwnedPorts <em>Owned Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EncapsulatedClassifierImpl extends StructuredClassifierImpl implements EncapsulatedClassifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncapsulatedClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ENCAPSULATED_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Property> getOwnedAttributes() {
		return (EList<Property>) eGet(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Port> getOwnedPorts() {
		return (EList<Port>) eGet(UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT, true);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedPorts() <em>Owned Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPorts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_PORT_ESUPERSETS = new int[] {
			UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_ATTRIBUTE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOwnedPort(String name, Type type) {
		return getOwnedPort(name, type, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOwnedPort(String name, Type type, boolean ignoreCase) {
		ownedPortLoop: for (Port ownedPort : getOwnedPorts()) {
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(ownedPort.getName()) : name.equals(ownedPort.getName())))
				continue ownedPortLoop;
			if (type != null && !type.equals(ownedPort.getType()))
				continue ownedPortLoop;
			return ownedPort;
		}
		return null;
	}

} //EncapsulatedClassifierImpl
