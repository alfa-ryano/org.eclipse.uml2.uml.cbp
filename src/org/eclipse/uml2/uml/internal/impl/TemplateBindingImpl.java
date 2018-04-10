/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.TemplateBindingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getSources <em>Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getParameterSubstitutions <em>Parameter Substitution</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.TemplateBindingImpl#getBoundElement <em>Bound Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateBindingImpl extends DirectedRelationshipImpl implements TemplateBinding {
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
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] { UMLPackage.TEMPLATE_BINDING__OWNED_COMMENT,
			UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Element> getTargets() {
		return (EList<Element>) eGet(UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] { UMLPackage.TEMPLATE_BINDING__SIGNATURE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Element> getSources() {
		return (EList<Element>) eGet(UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[] { UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT };

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
	@SuppressWarnings("unchecked")
	public EList<TemplateParameterSubstitution> getParameterSubstitutions() {
		return (EList<TemplateParameterSubstitution>) eGet(UMLPackage.Literals.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitution createParameterSubstitution() {
		TemplateParameterSubstitution newParameterSubstitution = (TemplateParameterSubstitution) create(
				UMLPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION);
		getParameterSubstitutions().add(newParameterSubstitution);
		return newParameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getSignature() {
		return (TemplateSignature) eGet(UMLPackage.Literals.TEMPLATE_BINDING__SIGNATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(TemplateSignature newSignature) {
		eSet(UMLPackage.Literals.TEMPLATE_BINDING__SIGNATURE, newSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getBoundElement() {
		return (TemplateableElement) eGet(UMLPackage.Literals.TEMPLATE_BINDING__BOUND_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundElement(TemplateableElement newBoundElement) {
		eSet(UMLPackage.Literals.TEMPLATE_BINDING__BOUND_ELEMENT, newBoundElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterSubstitutionFormal(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TemplateBindingOperations.validateParameterSubstitutionFormal(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneParameterSubstitution(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TemplateBindingOperations.validateOneParameterSubstitution(this, diagnostics, context);
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
		case UMLPackage.TEMPLATE_BINDING___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.TEMPLATE_BINDING___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.TEMPLATE_BINDING___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___DESTROY:
			destroy();
			return null;
		case UMLPackage.TEMPLATE_BINDING___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.TEMPLATE_BINDING___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.TEMPLATE_BINDING___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.TEMPLATE_BINDING___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.TEMPLATE_BINDING___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___GET_MODEL:
			return getModel();
		case UMLPackage.TEMPLATE_BINDING___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.TEMPLATE_BINDING___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.TEMPLATE_BINDING___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.TEMPLATE_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.TEMPLATE_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.TEMPLATE_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.TEMPLATE_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.TEMPLATE_BINDING___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.TEMPLATE_BINDING___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.TEMPLATE_BINDING___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.TEMPLATE_BINDING___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.TEMPLATE_BINDING___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.TEMPLATE_BINDING___VALIDATE_PARAMETER_SUBSTITUTION_FORMAL__DIAGNOSTICCHAIN_MAP:
			return validateParameterSubstitutionFormal((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.TEMPLATE_BINDING___VALIDATE_ONE_PARAMETER_SUBSTITUTION__DIAGNOSTICCHAIN_MAP:
			return validateOneParameterSubstitution((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		return super.isSetOwnedElements() || eIsSet(UMLPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTargets() {
		return super.isSetTargets() || eIsSet(UMLPackage.TEMPLATE_BINDING__SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSources() {
		return super.isSetSources() || eIsSet(UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
	}

} //TemplateBindingImpl
