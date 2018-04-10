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
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ProtocolStateMachine;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.InterfaceOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getRedefinedInterfaces <em>Redefined Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.InterfaceImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends ClassifierImpl implements Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.INTERFACE;
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
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] { UMLPackage.INTERFACE__OWNED_RULE,
			UMLPackage.INTERFACE__OWNED_USE_CASE, UMLPackage.INTERFACE__NESTED_CLASSIFIER,
			UMLPackage.INTERFACE__OWNED_ATTRIBUTE, UMLPackage.INTERFACE__OWNED_RECEPTION,
			UMLPackage.INTERFACE__PROTOCOL, UMLPackage.INTERFACE__OWNED_OPERATION };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Property> getAttributes() {
		return (EList<Property>) eGet(UMLPackage.Literals.CLASSIFIER__ATTRIBUTE, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getAttributes() <em>Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ATTRIBUTE_ESUBSETS = new int[] { UMLPackage.INTERFACE__OWNED_ATTRIBUTE };

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
	protected static final int[] FEATURE_ESUBSETS = new int[] { UMLPackage.INTERFACE__ATTRIBUTE,
			UMLPackage.INTERFACE__OWNED_RECEPTION, UMLPackage.INTERFACE__OWNED_OPERATION };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Classifier> getRedefinedClassifiers() {
		return (EList<Classifier>) eGet(UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedClassifiers() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_CLASSIFIER_ESUBSETS = new int[] {
			UMLPackage.INTERFACE__REDEFINED_INTERFACE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getNestedClassifiers() {
		return (EList<Classifier>) eGet(UMLPackage.Literals.INTERFACE__NESTED_CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createNestedClassifier(String name, EClass eClass) {
		Classifier newNestedClassifier = (Classifier) create(eClass);
		getNestedClassifiers().add(newNestedClassifier);
		if (name != null)
			newNestedClassifier.setName(name);
		return newNestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getNestedClassifier(String name) {
		return getNestedClassifier(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getNestedClassifier(String name, boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		nestedClassifierLoop: for (Classifier nestedClassifier : getNestedClassifiers()) {
			if (eClass != null && !eClass.isInstance(nestedClassifier))
				continue nestedClassifierLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(nestedClassifier.getName())
					: name.equals(nestedClassifier.getName())))
				continue nestedClassifierLoop;
			return nestedClassifier;
		}
		return createOnDemand && eClass != null ? createNestedClassifier(name, eClass) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getOwnedAttributes() {
		return (EList<Property>) eGet(UMLPackage.Literals.INTERFACE__OWNED_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, EClass eClass) {
		Property newOwnedAttribute = (Property) create(eClass);
		getOwnedAttributes().add(newOwnedAttribute);
		if (name != null)
			newOwnedAttribute.setName(name);
		if (type != null)
			newOwnedAttribute.setType(type);
		return newOwnedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type) {
		return createOwnedAttribute(name, type, UMLPackage.Literals.PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, Type type) {
		return getOwnedAttribute(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOwnedAttribute(String name, Type type, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		ownedAttributeLoop: for (Property ownedAttribute : getOwnedAttributes()) {
			if (eClass != null && !eClass.isInstance(ownedAttribute))
				continue ownedAttributeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedAttribute.getName())
					: name.equals(ownedAttribute.getName())))
				continue ownedAttributeLoop;
			if (type != null && !type.equals(ownedAttribute.getType()))
				continue ownedAttributeLoop;
			return ownedAttribute;
		}
		return createOnDemand && eClass != null ? createOwnedAttribute(name, type, eClass) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reception> getOwnedReceptions() {
		return (EList<Reception>) eGet(UMLPackage.Literals.INTERFACE__OWNED_RECEPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createOwnedReception(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		Reception newOwnedReception = (Reception) create(UMLPackage.Literals.RECEPTION);
		getOwnedReceptions().add(newOwnedReception);
		if (name != null)
			newOwnedReception.setName(name);
		int ownedParameterListSize = 0;
		int ownedParameterNamesSize = ownedParameterNames == null ? 0 : ownedParameterNames.size();
		if (ownedParameterNamesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterNamesSize;
		int ownedParameterTypesSize = ownedParameterTypes == null ? 0 : ownedParameterTypes.size();
		if (ownedParameterTypesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterTypesSize;
		for (int i = 0; i < ownedParameterListSize; i++) {
			newOwnedReception.createOwnedParameter(
					i < ownedParameterNamesSize ? (String) ownedParameterNames.get(i) : null,
					i < ownedParameterTypesSize ? (Type) ownedParameterTypes.get(i) : null);
		}
		return newOwnedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getOwnedReception(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		return getOwnedReception(name, ownedParameterNames, ownedParameterTypes, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception getOwnedReception(String name, EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase, boolean createOnDemand) {
		ownedReceptionLoop: for (Reception ownedReception : getOwnedReceptions()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedReception.getName())
					: name.equals(ownedReception.getName())))
				continue ownedReceptionLoop;
			EList<Parameter> ownedParameterList = ownedReception.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null && ownedParameterNames.size() != ownedParameterListSize
					|| (ownedParameterTypes != null && ownedParameterTypes.size() != ownedParameterListSize))
				continue ownedReceptionLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);
				if (ownedParameterNames != null
						&& !(ignoreCase ? (ownedParameterNames.get(j)).equalsIgnoreCase(ownedParameter.getName())
								: ownedParameterNames.get(j).equals(ownedParameter.getName())))
					continue ownedReceptionLoop;
				if (ownedParameterTypes != null && !ownedParameterTypes.get(j).equals(ownedParameter.getType()))
					continue ownedReceptionLoop;
			}
			return ownedReception;
		}
		return createOnDemand ? createOwnedReception(name, ownedParameterNames, ownedParameterTypes) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocol() {
		return (ProtocolStateMachine) eGet(UMLPackage.Literals.INTERFACE__PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		eSet(UMLPackage.Literals.INTERFACE__PROTOCOL, newProtocol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine createProtocol(String name) {
		ProtocolStateMachine newProtocol = (ProtocolStateMachine) create(UMLPackage.Literals.PROTOCOL_STATE_MACHINE);
		setProtocol(newProtocol);
		if (name != null)
			newProtocol.setName(name);
		return newProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> getRedefinedInterfaces() {
		return (EList<Interface>) eGet(UMLPackage.Literals.INTERFACE__REDEFINED_INTERFACE, true);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getRedefinedInterfaces() <em>Redefined Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_INTERFACE_ESUPERSETS = new int[] {
			UMLPackage.INTERFACE__REDEFINED_CLASSIFIER };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRedefinedInterface(String name) {
		return getRedefinedInterface(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getRedefinedInterface(String name, boolean ignoreCase) {
		redefinedInterfaceLoop: for (Interface redefinedInterface : getRedefinedInterfaces()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedInterface.getName())
					: name.equals(redefinedInterface.getName())))
				continue redefinedInterfaceLoop;
			return redefinedInterface;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Operation> getOwnedOperations() {
		return (EList<Operation>) eGet(UMLPackage.Literals.INTERFACE__OWNED_OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		Operation newOwnedOperation = (Operation) create(UMLPackage.Literals.OPERATION);
		getOwnedOperations().add(newOwnedOperation);
		if (name != null)
			newOwnedOperation.setName(name);
		int ownedParameterListSize = 0;
		int ownedParameterNamesSize = ownedParameterNames == null ? 0 : ownedParameterNames.size();
		if (ownedParameterNamesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterNamesSize;
		int ownedParameterTypesSize = ownedParameterTypes == null ? 0 : ownedParameterTypes.size();
		if (ownedParameterTypesSize > ownedParameterListSize)
			ownedParameterListSize = ownedParameterTypesSize;
		for (int i = 0; i < ownedParameterListSize; i++) {
			newOwnedOperation.createOwnedParameter(
					i < ownedParameterNamesSize ? (String) ownedParameterNames.get(i) : null,
					i < ownedParameterTypesSize ? (Type) ownedParameterTypes.get(i) : null);
		}
		return newOwnedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name, EList<String> ownedParameterNames,
			EList<Type> ownedParameterTypes) {
		return getOwnedOperation(name, ownedParameterNames, ownedParameterTypes, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOwnedOperation(String name, EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase, boolean createOnDemand) {
		ownedOperationLoop: for (Operation ownedOperation : getOwnedOperations()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedOperation.getName())
					: name.equals(ownedOperation.getName())))
				continue ownedOperationLoop;
			EList<Parameter> ownedParameterList = ownedOperation.getOwnedParameters();
			int ownedParameterListSize = ownedParameterList.size();
			if (ownedParameterNames != null && ownedParameterNames.size() != ownedParameterListSize
					|| (ownedParameterTypes != null && ownedParameterTypes.size() != ownedParameterListSize))
				continue ownedOperationLoop;
			for (int j = 0; j < ownedParameterListSize; j++) {
				Parameter ownedParameter = ownedParameterList.get(j);
				if (ownedParameterNames != null
						&& !(ignoreCase ? (ownedParameterNames.get(j)).equalsIgnoreCase(ownedParameter.getName())
								: ownedParameterNames.get(j).equals(ownedParameter.getName())))
					continue ownedOperationLoop;
				if (ownedParameterTypes != null && !ownedParameterTypes.get(j).equals(ownedParameter.getType()))
					continue ownedOperationLoop;
			}
			return ownedOperation;
		}
		return createOnDemand ? createOwnedOperation(name, ownedParameterNames, ownedParameterTypes) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibility(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterfaceOperations.validateVisibility(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, int lower, int upper) {
		return InterfaceOperations.createOwnedAttribute(this, name, type, lower, upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes,
			Type returnType) {
		return InterfaceOperations.createOwnedOperation(this, name, parameterNames, parameterTypes, returnType);
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
		case UMLPackage.INTERFACE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.INTERFACE___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.INTERFACE___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.INTERFACE___DESTROY:
			destroy();
			return null;
		case UMLPackage.INTERFACE___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.INTERFACE___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.INTERFACE___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.INTERFACE___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.INTERFACE___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.INTERFACE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.INTERFACE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.INTERFACE___GET_MODEL:
			return getModel();
		case UMLPackage.INTERFACE___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.INTERFACE___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.INTERFACE___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.INTERFACE___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.INTERFACE___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.INTERFACE___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.INTERFACE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.INTERFACE___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.INTERFACE___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.INTERFACE___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.INTERFACE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.INTERFACE___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.INTERFACE___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.INTERFACE___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.INTERFACE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.INTERFACE___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.INTERFACE___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.INTERFACE___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.INTERFACE___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.INTERFACE___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.INTERFACE___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.INTERFACE___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.INTERFACE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.INTERFACE___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.INTERFACE___GET_LABEL:
			return getLabel();
		case UMLPackage.INTERFACE___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.INTERFACE___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.INTERFACE___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.INTERFACE___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.INTERFACE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.INTERFACE___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.INTERFACE___SEPARATOR:
			return separator();
		case UMLPackage.INTERFACE___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.INTERFACE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
			return validateMembersDistinguishable((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportOwnedMembers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND:
			return createElementImport((PackageableElement) arguments.get(0), (VisibilityKind) arguments.get(1));
		case UMLPackage.INTERFACE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND:
			return createPackageImport((org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
		case UMLPackage.INTERFACE___GET_IMPORTED_ELEMENTS:
			return getImportedElements();
		case UMLPackage.INTERFACE___GET_IMPORTED_PACKAGES:
			return getImportedPackages();
		case UMLPackage.INTERFACE___GET_OWNED_MEMBERS:
			return getOwnedMembers();
		case UMLPackage.INTERFACE___EXCLUDE_COLLISIONS__ELIST:
			return excludeCollisions((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.INTERFACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
			return getNamesOfMember((NamedElement) arguments.get(0));
		case UMLPackage.INTERFACE___IMPORT_MEMBERS__ELIST:
			return importMembers((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.INTERFACE___GET_IMPORTED_MEMBERS:
			return getImportedMembers();
		case UMLPackage.INTERFACE___MEMBERS_ARE_DISTINGUISHABLE:
			return membersAreDistinguishable();
		case UMLPackage.INTERFACE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionConsistent((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP:
			return validateNonLeafRedefinition((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionContextValid((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
			return isConsistentWith((RedefinableElement) arguments.get(0));
		case UMLPackage.INTERFACE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
			return isRedefinitionContextValid((RedefinableElement) arguments.get(0));
		case UMLPackage.INTERFACE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.INTERFACE___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.INTERFACE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
			return validateNamespaceNeedsVisibility((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT:
			return createAssociation((Boolean) arguments.get(0), (AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3), (Integer) arguments.get(4),
					(Type) arguments.get(5), (Boolean) arguments.get(6), (AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9), (Integer) arguments.get(10));
		case UMLPackage.INTERFACE___GET_ASSOCIATIONS:
			return getAssociations();
		case UMLPackage.INTERFACE___CONFORMS_TO__TYPE:
			return conformsTo((Type) arguments.get(0));
		case UMLPackage.INTERFACE___IS_TEMPLATE:
			return isTemplate();
		case UMLPackage.INTERFACE___PARAMETERABLE_ELEMENTS:
			return parameterableElements();
		case UMLPackage.INTERFACE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP:
			return validateSpecializeType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP:
			return validateMapsToGeneralizationSet((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP:
			return validateNonFinalParents((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP:
			return validateNoCyclesInGeneralization((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___GET_ALL_ATTRIBUTES:
			return getAllAttributes();
		case UMLPackage.INTERFACE___GET_ALL_OPERATIONS:
			return getAllOperations();
		case UMLPackage.INTERFACE___GET_ALL_USED_INTERFACES:
			return getAllUsedInterfaces();
		case UMLPackage.INTERFACE___GET_OPERATION__STRING_ELIST_ELIST:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
		case UMLPackage.INTERFACE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
		case UMLPackage.INTERFACE___GET_OPERATIONS:
			return getOperations();
		case UMLPackage.INTERFACE___GET_USED_INTERFACES:
			return getUsedInterfaces();
		case UMLPackage.INTERFACE___ALL_FEATURES:
			return allFeatures();
		case UMLPackage.INTERFACE___ALL_PARENTS:
			return allParents();
		case UMLPackage.INTERFACE___GET_GENERALS:
			return getGenerals();
		case UMLPackage.INTERFACE___HAS_VISIBILITY_OF__NAMEDELEMENT:
			return hasVisibilityOf((NamedElement) arguments.get(0));
		case UMLPackage.INTERFACE___INHERIT__ELIST:
			return inherit((EList<NamedElement>) arguments.get(0));
		case UMLPackage.INTERFACE___INHERITABLE_MEMBERS__CLASSIFIER:
			return inheritableMembers((Classifier) arguments.get(0));
		case UMLPackage.INTERFACE___GET_INHERITED_MEMBERS:
			return getInheritedMembers();
		case UMLPackage.INTERFACE___MAY_SPECIALIZE_TYPE__CLASSIFIER:
			return maySpecializeType((Classifier) arguments.get(0));
		case UMLPackage.INTERFACE___PARENTS:
			return parents();
		case UMLPackage.INTERFACE___DIRECTLY_REALIZED_INTERFACES:
			return directlyRealizedInterfaces();
		case UMLPackage.INTERFACE___DIRECTLY_USED_INTERFACES:
			return directlyUsedInterfaces();
		case UMLPackage.INTERFACE___ALL_REALIZED_INTERFACES:
			return allRealizedInterfaces();
		case UMLPackage.INTERFACE___ALL_USED_INTERFACES:
			return allUsedInterfaces();
		case UMLPackage.INTERFACE___IS_SUBSTITUTABLE_FOR__CLASSIFIER:
			return isSubstitutableFor((Classifier) arguments.get(0));
		case UMLPackage.INTERFACE___ALL_ATTRIBUTES:
			return allAttributes();
		case UMLPackage.INTERFACE___ALL_SLOTTABLE_FEATURES:
			return allSlottableFeatures();
		case UMLPackage.INTERFACE___VALIDATE_VISIBILITY__DIAGNOSTICCHAIN_MAP:
			return validateVisibility((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.INTERFACE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT:
			return createOwnedAttribute((String) arguments.get(0), (Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
		case UMLPackage.INTERFACE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE:
			return createOwnedOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
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
		return super.isSetOwnedMembers() || eIsSet(UMLPackage.INTERFACE__NESTED_CLASSIFIER)
				|| eIsSet(UMLPackage.INTERFACE__OWNED_ATTRIBUTE) || eIsSet(UMLPackage.INTERFACE__OWNED_RECEPTION)
				|| eIsSet(UMLPackage.INTERFACE__PROTOCOL) || eIsSet(UMLPackage.INTERFACE__OWNED_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAttributes() {
		return super.isSetAttributes() || eIsSet(UMLPackage.INTERFACE__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFeatures() {
		return super.isSetFeatures() || eIsSet(UMLPackage.INTERFACE__OWNED_RECEPTION)
				|| eIsSet(UMLPackage.INTERFACE__OWNED_OPERATION);
	}

} //InterfaceImpl
