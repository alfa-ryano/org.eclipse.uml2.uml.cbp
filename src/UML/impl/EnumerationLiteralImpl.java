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
 * An implementation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.EnumerationLiteralImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link UML.impl.EnumerationLiteralImpl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationLiteralImpl extends PackageImpl implements EnumerationLiteral {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ENUMERATION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Enumeration> getClassifier() {
		return (EList<Enumeration>)eGet(UMLPackage.Literals.ENUMERATION_LITERAL__CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getEnumeration() {
		return (Enumeration)eGet(UMLPackage.Literals.ENUMERATION_LITERAL__ENUMERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(Enumeration newEnumeration) {
		eSet(UMLPackage.Literals.ENUMERATION_LITERAL__ENUMERATION, newEnumeration);
	}

} //EnumerationLiteralImpl
