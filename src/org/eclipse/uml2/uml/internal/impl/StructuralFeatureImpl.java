/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.internal.operations.MultiplicityElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.StructuralFeatureImpl#isReadOnly <em>Is Read Only</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StructuralFeatureImpl extends FeatureImpl implements StructuralFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.STRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return (Type) eGet(UMLPackage.Literals.TYPED_ELEMENT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		eSet(UMLPackage.Literals.TYPED_ELEMENT__TYPE, newType);
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
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] { UMLPackage.STRUCTURAL_FEATURE__OWNED_COMMENT,
			UMLPackage.STRUCTURAL_FEATURE__NAME_EXPRESSION, UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE,
			UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return (Boolean) eGet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		eSet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_ORDERED, newIsOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return (Boolean) eGet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		eSet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__IS_UNIQUE, newIsUnique);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		return (Integer) eGet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		eSet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER, newLower);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return (ValueSpecification) eGet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		eSet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__LOWER_VALUE, newLowerValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createLowerValue(String name, Type type, EClass eClass) {
		ValueSpecification newLowerValue = (ValueSpecification) create(eClass);
		setLowerValue(newLowerValue);
		if (name != null)
			newLowerValue.setName(name);
		if (type != null)
			newLowerValue.setType(type);
		return newLowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		return (Integer) eGet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		eSet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER, newUpper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return (ValueSpecification) eGet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		eSet(UMLPackage.Literals.MULTIPLICITY_ELEMENT__UPPER_VALUE, newUpperValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createUpperValue(String name, Type type, EClass eClass) {
		ValueSpecification newUpperValue = (ValueSpecification) create(eClass);
		setUpperValue(newUpperValue);
		if (name != null)
			newUpperValue.setName(name);
		if (type != null)
			newUpperValue.setType(type);
		return newUpperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return (Boolean) eGet(UMLPackage.Literals.STRUCTURAL_FEATURE__IS_READ_ONLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		eSet(UMLPackage.Literals.STRUCTURAL_FEATURE__IS_READ_ONLY, newIsReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperGeLower(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations.validateUpperGeLower(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerGe0(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations.validateLowerGe0(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationNoSideEffects(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations.validateValueSpecificationNoSideEffects(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecificationConstant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations.validateValueSpecificationConstant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerIsInteger(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations.validateLowerIsInteger(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperIsUnlimitedNatural(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MultiplicityElementOperations.validateUpperIsUnlimitedNatural(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean compatibleWith(MultiplicityElement other) {
		return MultiplicityElementOperations.compatibleWith(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement M) {
		return MultiplicityElementOperations.includesMultiplicity(this, M);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is(int lowerbound, int upperbound) {
		return MultiplicityElementOperations.is(this, lowerbound, upperbound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return MultiplicityElementOperations.isMultivalued(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		return MultiplicityElementOperations.lowerBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		return MultiplicityElementOperations.upperBound(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.STRUCTURAL_FEATURE__TYPE:
				return UMLPackage.TYPED_ELEMENT__TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED:
				return UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE:
				return UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER:
				return UMLPackage.MULTIPLICITY_ELEMENT__LOWER;
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE:
				return UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER:
				return UMLPackage.MULTIPLICITY_ELEMENT__UPPER;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE:
				return UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.TYPED_ELEMENT__TYPE:
				return UMLPackage.STRUCTURAL_FEATURE__TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED:
				return UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED;
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER:
				return UMLPackage.STRUCTURAL_FEATURE__LOWER;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE:
				return UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER:
				return UMLPackage.STRUCTURAL_FEATURE__UPPER;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE:
				return UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.STRUCTURAL_FEATURE___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___SET_LOWER__INT:
				return UMLPackage.STRUCTURAL_FEATURE___SET_LOWER__INT;
			case UMLPackage.MULTIPLICITY_ELEMENT___SET_UPPER__INT:
				return UMLPackage.STRUCTURAL_FEATURE___SET_UPPER__INT;
			case UMLPackage.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
				return UMLPackage.STRUCTURAL_FEATURE___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
			case UMLPackage.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
				return UMLPackage.STRUCTURAL_FEATURE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
			case UMLPackage.MULTIPLICITY_ELEMENT___IS__INT_INT:
				return UMLPackage.STRUCTURAL_FEATURE___IS__INT_INT;
			case UMLPackage.MULTIPLICITY_ELEMENT___IS_MULTIVALUED:
				return UMLPackage.STRUCTURAL_FEATURE___IS_MULTIVALUED;
			case UMLPackage.MULTIPLICITY_ELEMENT___GET_LOWER:
				return UMLPackage.STRUCTURAL_FEATURE___GET_LOWER;
			case UMLPackage.MULTIPLICITY_ELEMENT___LOWER_BOUND:
				return UMLPackage.STRUCTURAL_FEATURE___LOWER_BOUND;
			case UMLPackage.MULTIPLICITY_ELEMENT___GET_UPPER:
				return UMLPackage.STRUCTURAL_FEATURE___GET_UPPER;
			case UMLPackage.MULTIPLICITY_ELEMENT___UPPER_BOUND:
				return UMLPackage.STRUCTURAL_FEATURE___UPPER_BOUND;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___DESTROY:
			destroy();
			return null;
		case UMLPackage.STRUCTURAL_FEATURE___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.STRUCTURAL_FEATURE___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.STRUCTURAL_FEATURE___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.STRUCTURAL_FEATURE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_MODEL:
			return getModel();
		case UMLPackage.STRUCTURAL_FEATURE___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.STRUCTURAL_FEATURE___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.STRUCTURAL_FEATURE___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.STRUCTURAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.STRUCTURAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.STRUCTURAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.STRUCTURAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.STRUCTURAL_FEATURE___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.STRUCTURAL_FEATURE___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_LABEL:
			return getLabel();
		case UMLPackage.STRUCTURAL_FEATURE___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.STRUCTURAL_FEATURE___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.STRUCTURAL_FEATURE___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.STRUCTURAL_FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.STRUCTURAL_FEATURE___SEPARATOR:
			return separator();
		case UMLPackage.STRUCTURAL_FEATURE___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionConsistent((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP:
			return validateNonLeafRedefinition((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionContextValid((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
			return isConsistentWith((RedefinableElement) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
			return isRedefinitionContextValid((RedefinableElement) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP:
			return validateUpperGeLower((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP:
			return validateLowerGe0((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP:
			return validateValueSpecificationNoSideEffects((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP:
			return validateValueSpecificationConstant((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP:
			return validateLowerIsInteger((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP:
			return validateUpperIsUnlimitedNatural((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___SET_LOWER__INT:
			setLower((Integer) arguments.get(0));
			return null;
		case UMLPackage.STRUCTURAL_FEATURE___SET_UPPER__INT:
			setUpper((Integer) arguments.get(0));
			return null;
		case UMLPackage.STRUCTURAL_FEATURE___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
			return compatibleWith((MultiplicityElement) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
			return includesMultiplicity((MultiplicityElement) arguments.get(0));
		case UMLPackage.STRUCTURAL_FEATURE___IS__INT_INT:
			return is((Integer) arguments.get(0), (Integer) arguments.get(1));
		case UMLPackage.STRUCTURAL_FEATURE___IS_MULTIVALUED:
			return isMultivalued();
		case UMLPackage.STRUCTURAL_FEATURE___GET_LOWER:
			return getLower();
		case UMLPackage.STRUCTURAL_FEATURE___LOWER_BOUND:
			return lowerBound();
		case UMLPackage.STRUCTURAL_FEATURE___GET_UPPER:
			return getUpper();
		case UMLPackage.STRUCTURAL_FEATURE___UPPER_BOUND:
			return upperBound();
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
		return super.isSetOwnedElements() || eIsSet(UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE)
				|| eIsSet(UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE);
	}

} //StructuralFeatureImpl
