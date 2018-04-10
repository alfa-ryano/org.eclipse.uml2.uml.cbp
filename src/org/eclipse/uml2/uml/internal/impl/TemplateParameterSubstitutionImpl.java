/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.TemplateParameterSubstitutionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getOwnedActual <em>Owned Actual</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateParameterSubstitutionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl extends ElementImpl implements TemplateParameterSubstitution {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Element> getOwnedElements() {
		return (EList<Element>) eGet(UMLPackage.Literals.ELEMENT__OWNED_ELEMENT, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElements() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {
			UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_COMMENT,
			UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		return (Element) eGet(UMLPackage.Literals.ELEMENT__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getActual() {
		return (ParameterableElement) eGet(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActual(ParameterableElement newActual) {
		eSet(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, newActual);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getFormal() {
		return (TemplateParameter) eGet(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormal(TemplateParameter newFormal) {
		eSet(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, newFormal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement getOwnedActual() {
		return (ParameterableElement) eGet(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedActual(ParameterableElement newOwnedActual) {
		eSet(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL, newOwnedActual);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterableElement createOwnedActual(EClass eClass) {
		ParameterableElement newOwnedActual = (ParameterableElement) create(eClass);
		setOwnedActual(newOwnedActual);
		return newOwnedActual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding() {
		return (TemplateBinding) eGet(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateBinding(TemplateBinding newTemplateBinding) {
		eSet(UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, newTemplateBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustBeCompatible(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TemplateParameterSubstitutionOperations.validateMustBeCompatible(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___DESTROY:
			destroy();
			return null;
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_MODEL:
			return getModel();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION___VALIDATE_MUST_BE_COMPATIBLE__DIAGNOSTICCHAIN_MAP:
			return validateMustBeCompatible((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
	}

} //TemplateParameterSubstitutionImpl
