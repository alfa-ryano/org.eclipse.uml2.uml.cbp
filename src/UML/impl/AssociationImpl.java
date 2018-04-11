/**
 */
package UML.impl;

import UML.Association;
import UML.Property;
import UML.UMLPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link UML.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends PackageImpl implements Association {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getMemberEnd() {
		return (EList<Property>)eGet(UMLPackage.Literals.ASSOCIATION__MEMBER_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getOwnedEnd() {
		return (EList<Property>)eGet(UMLPackage.Literals.ASSOCIATION__OWNED_END, true);
	}

} //AssociationImpl
