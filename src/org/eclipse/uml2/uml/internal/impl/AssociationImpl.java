/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.AssociationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationImpl#getRelatedElements <em>Related Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationImpl#getMemberEnds <em>Member End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationImpl#getOwnedEnds <em>Owned End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationImpl#getEndTypes <em>End Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.AssociationImpl#getNavigableOwnedEnds <em>Navigable Owned End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends ClassifierImpl implements Association {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> getRelatedElements() {
		return (EList<Element>) eGet(UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElements() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] { UMLPackage.ASSOCIATION__END_TYPE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<NamedElement> getMembers() {
		return (EList<NamedElement>) eGet(UMLPackage.Literals.NAMESPACE__MEMBER, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[] { UMLPackage.ASSOCIATION__OWNED_MEMBER,
			UMLPackage.ASSOCIATION__IMPORTED_MEMBER, UMLPackage.ASSOCIATION__FEATURE,
			UMLPackage.ASSOCIATION__INHERITED_MEMBER, UMLPackage.ASSOCIATION__MEMBER_END };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Feature> getFeatures() {
		return (EList<Feature>) eGet(UMLPackage.Literals.CLASSIFIER__FEATURE, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeatures() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURE_ESUBSETS = new int[] { UMLPackage.ASSOCIATION__ATTRIBUTE,
			UMLPackage.ASSOCIATION__OWNED_END };

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
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] { UMLPackage.ASSOCIATION__OWNED_RULE,
			UMLPackage.ASSOCIATION__OWNED_USE_CASE, UMLPackage.ASSOCIATION__OWNED_END };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getMemberEnds() {
		return (EList<Property>) eGet(UMLPackage.Literals.ASSOCIATION__MEMBER_END, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMemberEnds() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_END_ESUBSETS = new int[] { UMLPackage.ASSOCIATION__OWNED_END };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getMemberEnd(String name, Type type) {
		return getMemberEnd(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getMemberEnd(String name, Type type, boolean ignoreCase, EClass eClass) {
		memberEndLoop: for (Property memberEnd : getMemberEnds()) {
			if (eClass != null && !eClass.isInstance(memberEnd))
				continue memberEndLoop;
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(memberEnd.getName()) : name.equals(memberEnd.getName())))
				continue memberEndLoop;
			if (type != null && !type.equals(memberEnd.getType()))
				continue memberEndLoop;
			return memberEnd;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getOwnedEnds() {
		return (EList<Property>) eGet(UMLPackage.Literals.ASSOCIATION__OWNED_END, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedEnds() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_END_ESUBSETS = new int[] { UMLPackage.ASSOCIATION__NAVIGABLE_OWNED_END };

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedEnds() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_END_ESUPERSETS = new int[] { UMLPackage.ASSOCIATION__MEMBER_END };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedEnd(String name, Type type, EClass eClass) {
		Property newOwnedEnd = (Property) create(eClass);
		getOwnedEnds().add(newOwnedEnd);
		if (name != null)
			newOwnedEnd.setName(name);
		if (type != null)
			newOwnedEnd.setType(type);
		return newOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedEnd(String name, Type type) {
		return createOwnedEnd(name, type, UMLPackage.Literals.PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name, Type type) {
		return getOwnedEnd(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedEnd(String name, Type type, boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		ownedEndLoop: for (Property ownedEnd : getOwnedEnds()) {
			if (eClass != null && !eClass.isInstance(ownedEnd))
				continue ownedEndLoop;
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(ownedEnd.getName()) : name.equals(ownedEnd.getName())))
				continue ownedEndLoop;
			if (type != null && !type.equals(ownedEnd.getType()))
				continue ownedEndLoop;
			return ownedEnd;
		}
		return createOnDemand && eClass != null ? createOwnedEnd(name, type, eClass) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getEndTypes() {
		return (EList<Type>) eGet(UMLPackage.Literals.ASSOCIATION__END_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEndType(String name) {
		return getEndType(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getEndType(String name, boolean ignoreCase, EClass eClass) {
		endTypeLoop: for (Type endType : getEndTypes()) {
			if (eClass != null && !eClass.isInstance(endType))
				continue endTypeLoop;
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(endType.getName()) : name.equals(endType.getName())))
				continue endTypeLoop;
			return endType;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return (Boolean) eGet(UMLPackage.Literals.ASSOCIATION__IS_DERIVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		eSet(UMLPackage.Literals.ASSOCIATION__IS_DERIVED, newIsDerived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getNavigableOwnedEnds() {
		return (EList<Property>) eGet(UMLPackage.Literals.ASSOCIATION__NAVIGABLE_OWNED_END, true);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getNavigableOwnedEnds() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnds()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NAVIGABLE_OWNED_END_ESUPERSETS = new int[] { UMLPackage.ASSOCIATION__OWNED_END };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createNavigableOwnedEnd(String name, Type type, EClass eClass) {
		Property newNavigableOwnedEnd = (Property) create(eClass);
		getNavigableOwnedEnds().add(newNavigableOwnedEnd);
		if (name != null)
			newNavigableOwnedEnd.setName(name);
		if (type != null)
			newNavigableOwnedEnd.setType(type);
		return newNavigableOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createNavigableOwnedEnd(String name, Type type) {
		return createNavigableOwnedEnd(name, type, UMLPackage.Literals.PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getNavigableOwnedEnd(String name, Type type) {
		return getNavigableOwnedEnd(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getNavigableOwnedEnd(String name, Type type, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		navigableOwnedEndLoop: for (Property navigableOwnedEnd : getNavigableOwnedEnds()) {
			if (eClass != null && !eClass.isInstance(navigableOwnedEnd))
				continue navigableOwnedEndLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(navigableOwnedEnd.getName())
					: name.equals(navigableOwnedEnd.getName())))
				continue navigableOwnedEndLoop;
			if (type != null && !type.equals(navigableOwnedEnd.getType()))
				continue navigableOwnedEndLoop;
			return navigableOwnedEnd;
		}
		return createOnDemand && eClass != null ? createNavigableOwnedEnd(name, type, eClass) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializedEndNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssociationOperations.validateSpecializedEndNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializedEndTypes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssociationOperations.validateSpecializedEndTypes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryAssociations(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssociationOperations.validateBinaryAssociations(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationEnds(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssociationOperations.validateAssociationEnds(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndsMustBeTyped(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssociationOperations.validateEndsMustBeTyped(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBinary() {
		return AssociationOperations.isBinary(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
			case UMLPackage.ASSOCIATION__RELATED_ELEMENT:
				return UMLPackage.RELATIONSHIP__RELATED_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
			case UMLPackage.RELATIONSHIP__RELATED_ELEMENT:
				return UMLPackage.ASSOCIATION__RELATED_ELEMENT;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		case UMLPackage.ASSOCIATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.ASSOCIATION___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.ASSOCIATION___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.ASSOCIATION___DESTROY:
			destroy();
			return null;
		case UMLPackage.ASSOCIATION___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.ASSOCIATION___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.ASSOCIATION___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.ASSOCIATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.ASSOCIATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_MODEL:
			return getModel();
		case UMLPackage.ASSOCIATION___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.ASSOCIATION___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.ASSOCIATION___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.ASSOCIATION___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.ASSOCIATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.ASSOCIATION___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.ASSOCIATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.ASSOCIATION___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.ASSOCIATION___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.ASSOCIATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.ASSOCIATION___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.ASSOCIATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.ASSOCIATION___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.ASSOCIATION___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.ASSOCIATION___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.ASSOCIATION___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.ASSOCIATION___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.ASSOCIATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.ASSOCIATION___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_LABEL:
			return getLabel();
		case UMLPackage.ASSOCIATION___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.ASSOCIATION___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.ASSOCIATION___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.ASSOCIATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.ASSOCIATION___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.ASSOCIATION___SEPARATOR:
			return separator();
		case UMLPackage.ASSOCIATION___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.ASSOCIATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
			return validateMembersDistinguishable((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportOwnedMembers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND:
			return createElementImport((PackageableElement) arguments.get(0), (VisibilityKind) arguments.get(1));
		case UMLPackage.ASSOCIATION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND:
			return createPackageImport((org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
		case UMLPackage.ASSOCIATION___GET_IMPORTED_ELEMENTS:
			return getImportedElements();
		case UMLPackage.ASSOCIATION___GET_IMPORTED_PACKAGES:
			return getImportedPackages();
		case UMLPackage.ASSOCIATION___GET_OWNED_MEMBERS:
			return getOwnedMembers();
		case UMLPackage.ASSOCIATION___EXCLUDE_COLLISIONS__ELIST:
			return excludeCollisions((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
			return getNamesOfMember((NamedElement) arguments.get(0));
		case UMLPackage.ASSOCIATION___IMPORT_MEMBERS__ELIST:
			return importMembers((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_IMPORTED_MEMBERS:
			return getImportedMembers();
		case UMLPackage.ASSOCIATION___MEMBERS_ARE_DISTINGUISHABLE:
			return membersAreDistinguishable();
		case UMLPackage.ASSOCIATION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionConsistent((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP:
			return validateNonLeafRedefinition((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionContextValid((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
			return isConsistentWith((RedefinableElement) arguments.get(0));
		case UMLPackage.ASSOCIATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
			return isRedefinitionContextValid((RedefinableElement) arguments.get(0));
		case UMLPackage.ASSOCIATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.ASSOCIATION___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.ASSOCIATION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
			return validateNamespaceNeedsVisibility((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT:
			return createAssociation((Boolean) arguments.get(0), (AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3), (Integer) arguments.get(4),
					(Type) arguments.get(5), (Boolean) arguments.get(6), (AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9), (Integer) arguments.get(10));
		case UMLPackage.ASSOCIATION___GET_ASSOCIATIONS:
			return getAssociations();
		case UMLPackage.ASSOCIATION___CONFORMS_TO__TYPE:
			return conformsTo((Type) arguments.get(0));
		case UMLPackage.ASSOCIATION___IS_TEMPLATE:
			return isTemplate();
		case UMLPackage.ASSOCIATION___PARAMETERABLE_ELEMENTS:
			return parameterableElements();
		case UMLPackage.ASSOCIATION___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP:
			return validateSpecializeType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP:
			return validateMapsToGeneralizationSet((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP:
			return validateNonFinalParents((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP:
			return validateNoCyclesInGeneralization((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___GET_ALL_ATTRIBUTES:
			return getAllAttributes();
		case UMLPackage.ASSOCIATION___GET_ALL_OPERATIONS:
			return getAllOperations();
		case UMLPackage.ASSOCIATION___GET_ALL_USED_INTERFACES:
			return getAllUsedInterfaces();
		case UMLPackage.ASSOCIATION___GET_OPERATION__STRING_ELIST_ELIST:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
		case UMLPackage.ASSOCIATION___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
		case UMLPackage.ASSOCIATION___GET_OPERATIONS:
			return getOperations();
		case UMLPackage.ASSOCIATION___GET_USED_INTERFACES:
			return getUsedInterfaces();
		case UMLPackage.ASSOCIATION___ALL_FEATURES:
			return allFeatures();
		case UMLPackage.ASSOCIATION___ALL_PARENTS:
			return allParents();
		case UMLPackage.ASSOCIATION___GET_GENERALS:
			return getGenerals();
		case UMLPackage.ASSOCIATION___HAS_VISIBILITY_OF__NAMEDELEMENT:
			return hasVisibilityOf((NamedElement) arguments.get(0));
		case UMLPackage.ASSOCIATION___INHERIT__ELIST:
			return inherit((EList<NamedElement>) arguments.get(0));
		case UMLPackage.ASSOCIATION___INHERITABLE_MEMBERS__CLASSIFIER:
			return inheritableMembers((Classifier) arguments.get(0));
		case UMLPackage.ASSOCIATION___GET_INHERITED_MEMBERS:
			return getInheritedMembers();
		case UMLPackage.ASSOCIATION___MAY_SPECIALIZE_TYPE__CLASSIFIER:
			return maySpecializeType((Classifier) arguments.get(0));
		case UMLPackage.ASSOCIATION___PARENTS:
			return parents();
		case UMLPackage.ASSOCIATION___DIRECTLY_REALIZED_INTERFACES:
			return directlyRealizedInterfaces();
		case UMLPackage.ASSOCIATION___DIRECTLY_USED_INTERFACES:
			return directlyUsedInterfaces();
		case UMLPackage.ASSOCIATION___ALL_REALIZED_INTERFACES:
			return allRealizedInterfaces();
		case UMLPackage.ASSOCIATION___ALL_USED_INTERFACES:
			return allUsedInterfaces();
		case UMLPackage.ASSOCIATION___IS_SUBSTITUTABLE_FOR__CLASSIFIER:
			return isSubstitutableFor((Classifier) arguments.get(0));
		case UMLPackage.ASSOCIATION___ALL_ATTRIBUTES:
			return allAttributes();
		case UMLPackage.ASSOCIATION___ALL_SLOTTABLE_FEATURES:
			return allSlottableFeatures();
		case UMLPackage.ASSOCIATION___VALIDATE_SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP:
			return validateSpecializedEndNumber((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP:
			return validateSpecializedEndTypes((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP:
			return validateBinaryAssociations((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP:
			return validateAssociationEnds((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___VALIDATE_ENDS_MUST_BE_TYPED__DIAGNOSTICCHAIN_MAP:
			return validateEndsMustBeTyped((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.ASSOCIATION___IS_BINARY:
			return isBinary();
		case UMLPackage.ASSOCIATION___GET_END_TYPES:
			return getEndTypes();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElements() {
		return eIsSet(UMLPackage.ASSOCIATION__END_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMembers() {
		return super.isSetMembers() || eIsSet(UMLPackage.ASSOCIATION__MEMBER_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFeatures() {
		return super.isSetFeatures() || eIsSet(UMLPackage.ASSOCIATION__OWNED_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers() || eIsSet(UMLPackage.ASSOCIATION__OWNED_END);
	}

} //AssociationImpl
