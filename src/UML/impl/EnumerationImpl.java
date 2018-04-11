/**
 */
package UML.impl;

import UML.Enumeration;
import UML.EnumerationLiteral;
import UML.UMLPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.EnumerationImpl#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends PackageImpl implements Enumeration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EnumerationLiteral> getOwnedLiteral() {
		return (EList<EnumerationLiteral>)eGet(UMLPackage.Literals.ENUMERATION__OWNED_LITERAL, true);
	}

} //EnumerationImpl
