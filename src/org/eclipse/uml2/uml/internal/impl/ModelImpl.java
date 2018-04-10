/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ModelOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ModelImpl#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends PackageImpl implements Model {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewpoint() {
		return (String) eGet(UMLPackage.Literals.MODEL__VIEWPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewpoint(String newViewpoint) {
		eSet(UMLPackage.Literals.MODEL__VIEWPOINT, newViewpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetViewpoint() {
		eUnset(UMLPackage.Literals.MODEL__VIEWPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewpoint() {
		return eIsSet(UMLPackage.Literals.MODEL__VIEWPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetamodel() {
		return ModelOperations.isMetamodel(this);
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
		case UMLPackage.MODEL___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.MODEL___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.MODEL___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.MODEL___DESTROY:
			destroy();
			return null;
		case UMLPackage.MODEL___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.MODEL___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.MODEL___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.MODEL___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.MODEL___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.MODEL___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.MODEL___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.MODEL___GET_MODEL:
			return getModel();
		case UMLPackage.MODEL___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.MODEL___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.MODEL___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.MODEL___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.MODEL___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.MODEL___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.MODEL___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.MODEL___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.MODEL___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.MODEL___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.MODEL___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.MODEL___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.MODEL___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.MODEL___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.MODEL___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.MODEL___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.MODEL___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.MODEL___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.MODEL___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.MODEL___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.MODEL___GET_LABEL:
			return getLabel();
		case UMLPackage.MODEL___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.MODEL___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.MODEL___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.MODEL___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.MODEL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.MODEL___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.MODEL___SEPARATOR:
			return separator();
		case UMLPackage.MODEL___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.MODEL___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
			return validateMembersDistinguishable((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportOwnedMembers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND:
			return createElementImport((PackageableElement) arguments.get(0), (VisibilityKind) arguments.get(1));
		case UMLPackage.MODEL___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND:
			return createPackageImport((org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
		case UMLPackage.MODEL___GET_IMPORTED_ELEMENTS:
			return getImportedElements();
		case UMLPackage.MODEL___GET_IMPORTED_PACKAGES:
			return getImportedPackages();
		case UMLPackage.MODEL___GET_OWNED_MEMBERS:
			return getOwnedMembers();
		case UMLPackage.MODEL___EXCLUDE_COLLISIONS__ELIST:
			return excludeCollisions((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.MODEL___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
			return getNamesOfMember((NamedElement) arguments.get(0));
		case UMLPackage.MODEL___IMPORT_MEMBERS__ELIST:
			return importMembers((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.MODEL___GET_IMPORTED_MEMBERS:
			return getImportedMembers();
		case UMLPackage.MODEL___MEMBERS_ARE_DISTINGUISHABLE:
			return membersAreDistinguishable();
		case UMLPackage.MODEL___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.MODEL___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.MODEL___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
			return validateNamespaceNeedsVisibility((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___IS_TEMPLATE:
			return isTemplate();
		case UMLPackage.MODEL___PARAMETERABLE_ELEMENTS:
			return parameterableElements();
		case UMLPackage.MODEL___VALIDATE_ELEMENTS_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP:
			return validateElementsPublicOrPrivate((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.MODEL___APPLY_PROFILE__PROFILE:
			return applyProfile((Profile) arguments.get(0));
		case UMLPackage.MODEL___CREATE_OWNED_CLASS__STRING_BOOLEAN:
			return createOwnedClass((String) arguments.get(0), (Boolean) arguments.get(1));
		case UMLPackage.MODEL___CREATE_OWNED_ENUMERATION__STRING:
			return createOwnedEnumeration((String) arguments.get(0));
		case UMLPackage.MODEL___CREATE_OWNED_INTERFACE__STRING:
			return createOwnedInterface((String) arguments.get(0));
		case UMLPackage.MODEL___CREATE_OWNED_PRIMITIVE_TYPE__STRING:
			return createOwnedPrimitiveType((String) arguments.get(0));
		case UMLPackage.MODEL___CREATE_OWNED_STEREOTYPE__STRING_BOOLEAN:
			return createOwnedStereotype((String) arguments.get(0), (Boolean) arguments.get(1));
		case UMLPackage.MODEL___GET_ALL_APPLIED_PROFILES:
			return getAllAppliedProfiles();
		case UMLPackage.MODEL___GET_ALL_PROFILE_APPLICATIONS:
			return getAllProfileApplications();
		case UMLPackage.MODEL___GET_APPLIED_PROFILE__STRING:
			return getAppliedProfile((String) arguments.get(0));
		case UMLPackage.MODEL___GET_APPLIED_PROFILE__STRING_BOOLEAN:
			return getAppliedProfile((String) arguments.get(0), (Boolean) arguments.get(1));
		case UMLPackage.MODEL___GET_APPLIED_PROFILES:
			return getAppliedProfiles();
		case UMLPackage.MODEL___GET_PROFILE_APPLICATION__PROFILE:
			return getProfileApplication((Profile) arguments.get(0));
		case UMLPackage.MODEL___GET_PROFILE_APPLICATION__PROFILE_BOOLEAN:
			return getProfileApplication((Profile) arguments.get(0), (Boolean) arguments.get(1));
		case UMLPackage.MODEL___IS_MODEL_LIBRARY:
			return isModelLibrary();
		case UMLPackage.MODEL___IS_PROFILE_APPLIED__PROFILE:
			return isProfileApplied((Profile) arguments.get(0));
		case UMLPackage.MODEL___UNAPPLY_PROFILE__PROFILE:
			return unapplyProfile((Profile) arguments.get(0));
		case UMLPackage.MODEL___APPLY_PROFILES__ELIST:
			return applyProfiles((EList<Profile>) arguments.get(0));
		case UMLPackage.MODEL___ALL_APPLICABLE_STEREOTYPES:
			return allApplicableStereotypes();
		case UMLPackage.MODEL___CONTAINING_PROFILE:
			return containingProfile();
		case UMLPackage.MODEL___MAKES_VISIBLE__NAMEDELEMENT:
			return makesVisible((NamedElement) arguments.get(0));
		case UMLPackage.MODEL___GET_NESTED_PACKAGES:
			return getNestedPackages();
		case UMLPackage.MODEL___GET_OWNED_STEREOTYPES:
			return getOwnedStereotypes();
		case UMLPackage.MODEL___GET_OWNED_TYPES:
			return getOwnedTypes();
		case UMLPackage.MODEL___VISIBLE_MEMBERS:
			return visibleMembers();
		case UMLPackage.MODEL___IS_METAMODEL:
			return isMetamodel();
		}
		return eDynamicInvoke(operationID, arguments);
	}

} //ModelImpl
