/**
 */
package UML.impl;

import UML.Association;
import UML.Interface;
import UML.Property;
import UML.UMLPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.PropertyImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link UML.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link UML.impl.PropertyImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link UML.impl.PropertyImpl#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link UML.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link UML.impl.PropertyImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends AttributeImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return (Boolean)eGet(UMLPackage.Literals.PROPERTY__IS_STATIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		eSet(UMLPackage.Literals.PROPERTY__IS_STATIC, newIsStatic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		return (Association)eGet(UMLPackage.Literals.PROPERTY__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		eSet(UMLPackage.Literals.PROPERTY__ASSOCIATION, newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getQualifier() {
		return (EList<Property>)eGet(UMLPackage.Literals.PROPERTY__QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwningAssociation() {
		return (Association)eGet(UMLPackage.Literals.PROPERTY__OWNING_ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAssociation(Association newOwningAssociation) {
		eSet(UMLPackage.Literals.PROPERTY__OWNING_ASSOCIATION, newOwningAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociationEnd() {
		return (Association)eGet(UMLPackage.Literals.PROPERTY__ASSOCIATION_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Association newAssociationEnd) {
		eSet(UMLPackage.Literals.PROPERTY__ASSOCIATION_END, newAssociationEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		return (Interface)eGet(UMLPackage.Literals.PROPERTY__INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		eSet(UMLPackage.Literals.PROPERTY__INTERFACE, newInterface);
	}

} //PropertyImpl
