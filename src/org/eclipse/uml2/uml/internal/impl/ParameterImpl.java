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
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.ParameterEffectKind;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.internal.operations.MultiplicityElementOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isException <em>Is Exception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#isStream <em>Is Stream</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ParameterImpl#getParameterSets <em>Parameter Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends ConnectableElementImpl implements Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PARAMETER;
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
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] { UMLPackage.PARAMETER__OWNED_COMMENT,
			UMLPackage.PARAMETER__NAME_EXPRESSION, UMLPackage.PARAMETER__LOWER_VALUE, UMLPackage.PARAMETER__UPPER_VALUE,
			UMLPackage.PARAMETER__DEFAULT_VALUE };

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
	@Override
	public Namespace getNamespace() {
		return (Namespace) eGet(UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return (String) eGet(UMLPackage.Literals.PARAMETER__DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		eSet(UMLPackage.Literals.PARAMETER__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefault() {
		eUnset(UMLPackage.Literals.PARAMETER__DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefault() {
		return eIsSet(UMLPackage.Literals.PARAMETER__DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return (ValueSpecification) eGet(UMLPackage.Literals.PARAMETER__DEFAULT_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		eSet(UMLPackage.Literals.PARAMETER__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification createDefaultValue(String name, Type type, EClass eClass) {
		ValueSpecification newDefaultValue = (ValueSpecification) create(eClass);
		setDefaultValue(newDefaultValue);
		if (name != null)
			newDefaultValue.setName(name);
		if (type != null)
			newDefaultValue.setType(type);
		return newDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getDirection() {
		return (ParameterDirectionKind) eGet(UMLPackage.Literals.PARAMETER__DIRECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection) {
		eSet(UMLPackage.Literals.PARAMETER__DIRECTION, newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind getEffect() {
		return (ParameterEffectKind) eGet(UMLPackage.Literals.PARAMETER__EFFECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(ParameterEffectKind newEffect) {
		eSet(UMLPackage.Literals.PARAMETER__EFFECT, newEffect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffect() {
		eUnset(UMLPackage.Literals.PARAMETER__EFFECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffect() {
		return eIsSet(UMLPackage.Literals.PARAMETER__EFFECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isException() {
		return (Boolean) eGet(UMLPackage.Literals.PARAMETER__IS_EXCEPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsException(boolean newIsException) {
		eSet(UMLPackage.Literals.PARAMETER__IS_EXCEPTION, newIsException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStream() {
		return (Boolean) eGet(UMLPackage.Literals.PARAMETER__IS_STREAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStream(boolean newIsStream) {
		eSet(UMLPackage.Literals.PARAMETER__IS_STREAM, newIsStream);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		return (Operation) eGet(UMLPackage.Literals.PARAMETER__OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParameterSet> getParameterSets() {
		return (EList<ParameterSet>) eGet(UMLPackage.Literals.PARAMETER__PARAMETER_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getParameterSet(String name) {
		return getParameterSet(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getParameterSet(String name, boolean ignoreCase) {
		parameterSetLoop: for (ParameterSet parameterSet : getParameterSets()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(parameterSet.getName())
					: name.equals(parameterSet.getName())))
				continue parameterSetLoop;
			return parameterSet;
		}
		return null;
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
	public boolean validateInAndOut(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ParameterOperations.validateInAndOut(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotException(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ParameterOperations.validateNotException(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorEnd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ParameterOperations.validateConnectorEnd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReentrantBehaviors(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ParameterOperations.validateReentrantBehaviors(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreamAndException(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ParameterOperations.validateStreamAndException(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectEffect(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ParameterOperations.validateObjectEffect(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanDefaultValue(boolean value) {
		ParameterOperations.setBooleanDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerDefaultValue(int value) {
		ParameterOperations.setIntegerDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullDefaultValue() {
		ParameterOperations.setNullDefaultValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealDefaultValue(double value) {
		ParameterOperations.setRealDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringDefaultValue(String value) {
		ParameterOperations.setStringDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlimitedNaturalDefaultValue(int value) {
		ParameterOperations.setUnlimitedNaturalDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.PARAMETER__IS_ORDERED:
				return UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
			case UMLPackage.PARAMETER__IS_UNIQUE:
				return UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
			case UMLPackage.PARAMETER__LOWER:
				return UMLPackage.MULTIPLICITY_ELEMENT__LOWER;
			case UMLPackage.PARAMETER__LOWER_VALUE:
				return UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
			case UMLPackage.PARAMETER__UPPER:
				return UMLPackage.MULTIPLICITY_ELEMENT__UPPER;
			case UMLPackage.PARAMETER__UPPER_VALUE:
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
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_ORDERED:
				return UMLPackage.PARAMETER__IS_ORDERED;
			case UMLPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE:
				return UMLPackage.PARAMETER__IS_UNIQUE;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER:
				return UMLPackage.PARAMETER__LOWER;
			case UMLPackage.MULTIPLICITY_ELEMENT__LOWER_VALUE:
				return UMLPackage.PARAMETER__LOWER_VALUE;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER:
				return UMLPackage.PARAMETER__UPPER;
			case UMLPackage.MULTIPLICITY_ELEMENT__UPPER_VALUE:
				return UMLPackage.PARAMETER__UPPER_VALUE;
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
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.MULTIPLICITY_ELEMENT___SET_LOWER__INT:
				return UMLPackage.PARAMETER___SET_LOWER__INT;
			case UMLPackage.MULTIPLICITY_ELEMENT___SET_UPPER__INT:
				return UMLPackage.PARAMETER___SET_UPPER__INT;
			case UMLPackage.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
				return UMLPackage.PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
			case UMLPackage.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
				return UMLPackage.PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
			case UMLPackage.MULTIPLICITY_ELEMENT___IS__INT_INT:
				return UMLPackage.PARAMETER___IS__INT_INT;
			case UMLPackage.MULTIPLICITY_ELEMENT___IS_MULTIVALUED:
				return UMLPackage.PARAMETER___IS_MULTIVALUED;
			case UMLPackage.MULTIPLICITY_ELEMENT___GET_LOWER:
				return UMLPackage.PARAMETER___GET_LOWER;
			case UMLPackage.MULTIPLICITY_ELEMENT___LOWER_BOUND:
				return UMLPackage.PARAMETER___LOWER_BOUND;
			case UMLPackage.MULTIPLICITY_ELEMENT___GET_UPPER:
				return UMLPackage.PARAMETER___GET_UPPER;
			case UMLPackage.MULTIPLICITY_ELEMENT___UPPER_BOUND:
				return UMLPackage.PARAMETER___UPPER_BOUND;
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
		case UMLPackage.PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.PARAMETER___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.PARAMETER___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.PARAMETER___DESTROY:
			destroy();
			return null;
		case UMLPackage.PARAMETER___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.PARAMETER___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.PARAMETER___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.PARAMETER___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.PARAMETER___GET_MODEL:
			return getModel();
		case UMLPackage.PARAMETER___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.PARAMETER___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.PARAMETER___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.PARAMETER___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.PARAMETER___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.PARAMETER___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.PARAMETER___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.PARAMETER___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.PARAMETER___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.PARAMETER___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.PARAMETER___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.PARAMETER___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.PARAMETER___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.PARAMETER___GET_LABEL:
			return getLabel();
		case UMLPackage.PARAMETER___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.PARAMETER___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.PARAMETER___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.PARAMETER___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.PARAMETER___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.PARAMETER___SEPARATOR:
			return separator();
		case UMLPackage.PARAMETER___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.PARAMETER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.PARAMETER___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.PARAMETER___GET_ENDS:
			return getEnds();
		case UMLPackage.PARAMETER___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP:
			return validateUpperGeLower((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP:
			return validateLowerGe0((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP:
			return validateValueSpecificationNoSideEffects((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP:
			return validateValueSpecificationConstant((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP:
			return validateLowerIsInteger((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP:
			return validateUpperIsUnlimitedNatural((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___SET_LOWER__INT:
			setLower((Integer) arguments.get(0));
			return null;
		case UMLPackage.PARAMETER___SET_UPPER__INT:
			setUpper((Integer) arguments.get(0));
			return null;
		case UMLPackage.PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
			return compatibleWith((MultiplicityElement) arguments.get(0));
		case UMLPackage.PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
			return includesMultiplicity((MultiplicityElement) arguments.get(0));
		case UMLPackage.PARAMETER___IS__INT_INT:
			return is((Integer) arguments.get(0), (Integer) arguments.get(1));
		case UMLPackage.PARAMETER___IS_MULTIVALUED:
			return isMultivalued();
		case UMLPackage.PARAMETER___GET_LOWER:
			return getLower();
		case UMLPackage.PARAMETER___LOWER_BOUND:
			return lowerBound();
		case UMLPackage.PARAMETER___GET_UPPER:
			return getUpper();
		case UMLPackage.PARAMETER___UPPER_BOUND:
			return upperBound();
		case UMLPackage.PARAMETER___VALIDATE_IN_AND_OUT__DIAGNOSTICCHAIN_MAP:
			return validateInAndOut((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP:
			return validateNotException((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_CONNECTOR_END__DIAGNOSTICCHAIN_MAP:
			return validateConnectorEnd((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP:
			return validateReentrantBehaviors((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP:
			return validateStreamAndException((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___VALIDATE_OBJECT_EFFECT__DIAGNOSTICCHAIN_MAP:
			return validateObjectEffect((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PARAMETER___IS_SET_DEFAULT:
			return isSetDefault();
		case UMLPackage.PARAMETER___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN:
			setBooleanDefaultValue((Boolean) arguments.get(0));
			return null;
		case UMLPackage.PARAMETER___SET_DEFAULT__STRING:
			setDefault((String) arguments.get(0));
			return null;
		case UMLPackage.PARAMETER___SET_INTEGER_DEFAULT_VALUE__INT:
			setIntegerDefaultValue((Integer) arguments.get(0));
			return null;
		case UMLPackage.PARAMETER___SET_NULL_DEFAULT_VALUE:
			setNullDefaultValue();
			return null;
		case UMLPackage.PARAMETER___SET_REAL_DEFAULT_VALUE__DOUBLE:
			setRealDefaultValue((Double) arguments.get(0));
			return null;
		case UMLPackage.PARAMETER___SET_STRING_DEFAULT_VALUE__STRING:
			setStringDefaultValue((String) arguments.get(0));
			return null;
		case UMLPackage.PARAMETER___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT:
			setUnlimitedNaturalDefaultValue((Integer) arguments.get(0));
			return null;
		case UMLPackage.PARAMETER___UNSET_DEFAULT:
			unsetDefault();
			return null;
		case UMLPackage.PARAMETER___GET_DEFAULT:
			return getDefault();
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
		return super.isSetOwnedElements() || eIsSet(UMLPackage.PARAMETER__LOWER_VALUE)
				|| eIsSet(UMLPackage.PARAMETER__UPPER_VALUE) || eIsSet(UMLPackage.PARAMETER__DEFAULT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.PARAMETER__OPERATION);
	}

} //ParameterImpl
