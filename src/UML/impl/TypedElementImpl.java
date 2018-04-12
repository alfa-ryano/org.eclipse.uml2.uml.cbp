/**
 */
package UML.impl;

import UML.LiteralInteger;
import UML.LiteralUnlimitedNatural;
import UML.TypedElement;
import UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.TypedElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link UML.impl.TypedElementImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link UML.impl.TypedElementImpl#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedElementImpl extends ElementImpl implements TypedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML.Package getType() {
		return (UML.Package)eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(UML.Package newType) {
		eSet(UMLPackage.Literals.TYPED_ELEMENT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralInteger getLowerValue() {
		return (LiteralInteger)eGet(UMLPackage.Literals.TYPED_ELEMENT__LOWER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(LiteralInteger newLowerValue) {
		eSet(UMLPackage.Literals.TYPED_ELEMENT__LOWER_VALUE, newLowerValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNatural getUpperValue() {
		return (LiteralUnlimitedNatural)eGet(UMLPackage.Literals.TYPED_ELEMENT__UPPER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(LiteralUnlimitedNatural newUpperValue) {
		eSet(UMLPackage.Literals.TYPED_ELEMENT__UPPER_VALUE, newUpperValue);
	}

} //TypedElementImpl
