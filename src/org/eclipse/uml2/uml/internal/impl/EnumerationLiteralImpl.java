/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.EnumerationLiteralOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl#getClassifiers <em>Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationLiteralImpl extends InstanceSpecificationImpl implements EnumerationLiteral {
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
	@Override
	public Namespace getNamespace() {
		return (Namespace) eGet(UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getEnumeration() {
		return (Enumeration) eGet(UMLPackage.Literals.ENUMERATION_LITERAL__ENUMERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeration(Enumeration newEnumeration) {
		eSet(UMLPackage.Literals.ENUMERATION_LITERAL__ENUMERATION, newEnumeration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Classifier> getClassifiers() {
		return (EList<Classifier>) eGet(UMLPackage.Literals.INSTANCE_SPECIFICATION__CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier(String name) {
		return getClassifier(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier(String name, boolean ignoreCase) {
		classifierLoop: for (Classifier classifier : getClassifiers()) {
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(classifier.getName()) : name.equals(classifier.getName())))
				continue classifierLoop;
			return classifier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassifiers() {
		return eIsSet(UMLPackage.Literals.INSTANCE_SPECIFICATION__CLASSIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getClassifier() {
		return EnumerationLiteralOperations.getClassifier(this);
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
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___DESTROY:
			destroy();
			return null;
		case UMLPackage.ENUMERATION_LITERAL___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.ENUMERATION_LITERAL___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.ENUMERATION_LITERAL___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.ENUMERATION_LITERAL___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_MODEL:
			return getModel();
		case UMLPackage.ENUMERATION_LITERAL___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.ENUMERATION_LITERAL___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.ENUMERATION_LITERAL___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.ENUMERATION_LITERAL___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.ENUMERATION_LITERAL___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.ENUMERATION_LITERAL___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.ENUMERATION_LITERAL___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.ENUMERATION_LITERAL___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.ENUMERATION_LITERAL___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_LABEL:
			return getLabel();
		case UMLPackage.ENUMERATION_LITERAL___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.ENUMERATION_LITERAL___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.ENUMERATION_LITERAL___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.ENUMERATION_LITERAL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.ENUMERATION_LITERAL___SEPARATOR:
			return separator();
		case UMLPackage.ENUMERATION_LITERAL___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.ENUMERATION_LITERAL___GET_DEPLOYED_ELEMENTS:
			return getDeployedElements();
		case UMLPackage.ENUMERATION_LITERAL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.ENUMERATION_LITERAL___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
			return validateNamespaceNeedsVisibility((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_DEPLOYMENT_ARTIFACT__DIAGNOSTICCHAIN_MAP:
			return validateDeploymentArtifact((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_STRUCTURAL_FEATURE__DIAGNOSTICCHAIN_MAP:
			return validateStructuralFeature((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_DEFINING_FEATURE__DIAGNOSTICCHAIN_MAP:
			return validateDefiningFeature((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___VALIDATE_DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP:
			return validateDeploymentTarget((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION_LITERAL___GET_CLASSIFIERS:
			return getClassifiers();
		case UMLPackage.ENUMERATION_LITERAL___GET_CLASSIFIER:
			return getClassifier();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.ENUMERATION_LITERAL__ENUMERATION);
	}

} //EnumerationLiteralImpl
