/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.EnumerationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.EnumerationImpl#getOwnedLiterals <em>Owned Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends DataTypeImpl implements Enumeration {
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
	@Override
	@SuppressWarnings("unchecked")
	public EList<NamedElement> getOwnedMembers() {
		return (EList<NamedElement>) eGet(UMLPackage.Literals.NAMESPACE__OWNED_MEMBER, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] { UMLPackage.ENUMERATION__OWNED_RULE,
			UMLPackage.ENUMERATION__OWNED_USE_CASE, UMLPackage.ENUMERATION__OWNED_ATTRIBUTE,
			UMLPackage.ENUMERATION__OWNED_OPERATION, UMLPackage.ENUMERATION__OWNED_LITERAL };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EnumerationLiteral> getOwnedLiterals() {
		return (EList<EnumerationLiteral>) eGet(UMLPackage.Literals.ENUMERATION__OWNED_LITERAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createOwnedLiteral(String name) {
		EnumerationLiteral newOwnedLiteral = (EnumerationLiteral) create(UMLPackage.Literals.ENUMERATION_LITERAL);
		getOwnedLiterals().add(newOwnedLiteral);
		if (name != null)
			newOwnedLiteral.setName(name);
		return newOwnedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getOwnedLiteral(String name) {
		return getOwnedLiteral(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getOwnedLiteral(String name, boolean ignoreCase, boolean createOnDemand) {
		ownedLiteralLoop: for (EnumerationLiteral ownedLiteral : getOwnedLiterals()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedLiteral.getName())
					: name.equals(ownedLiteral.getName())))
				continue ownedLiteralLoop;
			return ownedLiteral;
		}
		return createOnDemand ? createOwnedLiteral(name) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmutable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EnumerationOperations.validateImmutable(this, diagnostics, context);
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
		case UMLPackage.ENUMERATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.ENUMERATION___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.ENUMERATION___DESTROY:
			destroy();
			return null;
		case UMLPackage.ENUMERATION___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.ENUMERATION___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.ENUMERATION___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.ENUMERATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.ENUMERATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_MODEL:
			return getModel();
		case UMLPackage.ENUMERATION___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.ENUMERATION___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.ENUMERATION___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.ENUMERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.ENUMERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.ENUMERATION___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.ENUMERATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.ENUMERATION___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.ENUMERATION___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.ENUMERATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.ENUMERATION___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.ENUMERATION___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.ENUMERATION___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.ENUMERATION___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.ENUMERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.ENUMERATION___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_LABEL:
			return getLabel();
		case UMLPackage.ENUMERATION___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.ENUMERATION___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.ENUMERATION___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.ENUMERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.ENUMERATION___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.ENUMERATION___SEPARATOR:
			return separator();
		case UMLPackage.ENUMERATION___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.ENUMERATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
			return validateMembersDistinguishable((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportOwnedMembers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND:
			return createElementImport((PackageableElement) arguments.get(0), (VisibilityKind) arguments.get(1));
		case UMLPackage.ENUMERATION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND:
			return createPackageImport((org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
		case UMLPackage.ENUMERATION___GET_IMPORTED_ELEMENTS:
			return getImportedElements();
		case UMLPackage.ENUMERATION___GET_IMPORTED_PACKAGES:
			return getImportedPackages();
		case UMLPackage.ENUMERATION___GET_OWNED_MEMBERS:
			return getOwnedMembers();
		case UMLPackage.ENUMERATION___EXCLUDE_COLLISIONS__ELIST:
			return excludeCollisions((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
			return getNamesOfMember((NamedElement) arguments.get(0));
		case UMLPackage.ENUMERATION___IMPORT_MEMBERS__ELIST:
			return importMembers((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_IMPORTED_MEMBERS:
			return getImportedMembers();
		case UMLPackage.ENUMERATION___MEMBERS_ARE_DISTINGUISHABLE:
			return membersAreDistinguishable();
		case UMLPackage.ENUMERATION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionConsistent((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP:
			return validateNonLeafRedefinition((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionContextValid((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
			return isConsistentWith((RedefinableElement) arguments.get(0));
		case UMLPackage.ENUMERATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
			return isRedefinitionContextValid((RedefinableElement) arguments.get(0));
		case UMLPackage.ENUMERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.ENUMERATION___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.ENUMERATION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
			return validateNamespaceNeedsVisibility((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT:
			return createAssociation((Boolean) arguments.get(0), (AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3), (Integer) arguments.get(4),
					(Type) arguments.get(5), (Boolean) arguments.get(6), (AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9), (Integer) arguments.get(10));
		case UMLPackage.ENUMERATION___GET_ASSOCIATIONS:
			return getAssociations();
		case UMLPackage.ENUMERATION___CONFORMS_TO__TYPE:
			return conformsTo((Type) arguments.get(0));
		case UMLPackage.ENUMERATION___IS_TEMPLATE:
			return isTemplate();
		case UMLPackage.ENUMERATION___PARAMETERABLE_ELEMENTS:
			return parameterableElements();
		case UMLPackage.ENUMERATION___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP:
			return validateSpecializeType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP:
			return validateMapsToGeneralizationSet((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP:
			return validateNonFinalParents((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP:
			return validateNoCyclesInGeneralization((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ENUMERATION___GET_ALL_ATTRIBUTES:
			return getAllAttributes();
		case UMLPackage.ENUMERATION___GET_ALL_OPERATIONS:
			return getAllOperations();
		case UMLPackage.ENUMERATION___GET_ALL_USED_INTERFACES:
			return getAllUsedInterfaces();
		case UMLPackage.ENUMERATION___GET_OPERATION__STRING_ELIST_ELIST:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
		case UMLPackage.ENUMERATION___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
		case UMLPackage.ENUMERATION___GET_OPERATIONS:
			return getOperations();
		case UMLPackage.ENUMERATION___GET_USED_INTERFACES:
			return getUsedInterfaces();
		case UMLPackage.ENUMERATION___ALL_FEATURES:
			return allFeatures();
		case UMLPackage.ENUMERATION___ALL_PARENTS:
			return allParents();
		case UMLPackage.ENUMERATION___GET_GENERALS:
			return getGenerals();
		case UMLPackage.ENUMERATION___HAS_VISIBILITY_OF__NAMEDELEMENT:
			return hasVisibilityOf((NamedElement) arguments.get(0));
		case UMLPackage.ENUMERATION___INHERIT__ELIST:
			return inherit((EList<NamedElement>) arguments.get(0));
		case UMLPackage.ENUMERATION___INHERITABLE_MEMBERS__CLASSIFIER:
			return inheritableMembers((Classifier) arguments.get(0));
		case UMLPackage.ENUMERATION___GET_INHERITED_MEMBERS:
			return getInheritedMembers();
		case UMLPackage.ENUMERATION___MAY_SPECIALIZE_TYPE__CLASSIFIER:
			return maySpecializeType((Classifier) arguments.get(0));
		case UMLPackage.ENUMERATION___PARENTS:
			return parents();
		case UMLPackage.ENUMERATION___DIRECTLY_REALIZED_INTERFACES:
			return directlyRealizedInterfaces();
		case UMLPackage.ENUMERATION___DIRECTLY_USED_INTERFACES:
			return directlyUsedInterfaces();
		case UMLPackage.ENUMERATION___ALL_REALIZED_INTERFACES:
			return allRealizedInterfaces();
		case UMLPackage.ENUMERATION___ALL_USED_INTERFACES:
			return allUsedInterfaces();
		case UMLPackage.ENUMERATION___IS_SUBSTITUTABLE_FOR__CLASSIFIER:
			return isSubstitutableFor((Classifier) arguments.get(0));
		case UMLPackage.ENUMERATION___ALL_ATTRIBUTES:
			return allAttributes();
		case UMLPackage.ENUMERATION___ALL_SLOTTABLE_FEATURES:
			return allSlottableFeatures();
		case UMLPackage.ENUMERATION___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT:
			return createOwnedAttribute((String) arguments.get(0), (Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
		case UMLPackage.ENUMERATION___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE:
			return createOwnedOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
		case UMLPackage.ENUMERATION___VALIDATE_IMMUTABLE__DIAGNOSTICCHAIN_MAP:
			return validateImmutable((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers() || eIsSet(UMLPackage.ENUMERATION__OWNED_LITERAL);
	}

} //EnumerationImpl
