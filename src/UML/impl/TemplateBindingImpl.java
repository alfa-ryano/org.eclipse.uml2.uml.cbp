/**
 */
package UML.impl;

import UML.TemplateBinding;
import UML.TemplateParameterSubstitution;
import UML.UMLPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.TemplateBindingImpl#getParameterSubstitution <em>Parameter Substitution</em>}</li>
 *   <li>{@link UML.impl.TemplateBindingImpl#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateBindingImpl extends ElementImpl implements TemplateBinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TEMPLATE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TemplateParameterSubstitution> getParameterSubstitution() {
		return (EList<TemplateParameterSubstitution>)eGet(UMLPackage.Literals.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML.Package getBoundElement() {
		return (UML.Package)eGet(UMLPackage.Literals.TEMPLATE_BINDING__BOUND_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundElement(UML.Package newBoundElement) {
		eSet(UMLPackage.Literals.TEMPLATE_BINDING__BOUND_ELEMENT, newBoundElement);
	}

} //TemplateBindingImpl
