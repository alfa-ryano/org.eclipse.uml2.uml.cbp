/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.BehavioredClassifierOperations;
import org.eclipse.uml2.uml.internal.operations.ClassOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#isActive <em>Is Active</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getSuperClasses <em>Super Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassImpl#isAbstract <em>Is Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends EncapsulatedClassifierImpl implements org.eclipse.uml2.uml.Class {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CLASS;
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
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] { UMLPackage.CLASS__OWNED_COMMENT,
			UMLPackage.CLASS__NAME_EXPRESSION, UMLPackage.CLASS__ELEMENT_IMPORT, UMLPackage.CLASS__PACKAGE_IMPORT,
			UMLPackage.CLASS__OWNED_MEMBER, UMLPackage.CLASS__TEMPLATE_BINDING,
			UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE, UMLPackage.CLASS__COLLABORATION_USE,
			UMLPackage.CLASS__GENERALIZATION, UMLPackage.CLASS__SUBSTITUTION, UMLPackage.CLASS__INTERFACE_REALIZATION };

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
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] { UMLPackage.CLASS__OWNED_RULE,
			UMLPackage.CLASS__OWNED_USE_CASE, UMLPackage.CLASS__OWNED_ATTRIBUTE, UMLPackage.CLASS__OWNED_CONNECTOR,
			UMLPackage.CLASS__OWNED_BEHAVIOR, UMLPackage.CLASS__OWNED_OPERATION, UMLPackage.CLASS__NESTED_CLASSIFIER,
			UMLPackage.CLASS__OWNED_RECEPTION };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Behavior> getOwnedBehaviors() {
		return (EList<Behavior>) eGet(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedBehaviors() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_BEHAVIOR_ESUBSETS = new int[] { UMLPackage.CLASS__CLASSIFIER_BEHAVIOR };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createOwnedBehavior(String name, EClass eClass) {
		Behavior newOwnedBehavior = (Behavior) create(eClass);
		getOwnedBehaviors().add(newOwnedBehavior);
		if (name != null)
			newOwnedBehavior.setName(name);
		return newOwnedBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getOwnedBehavior(String name) {
		return getOwnedBehavior(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getOwnedBehavior(String name, boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		ownedBehaviorLoop: for (Behavior ownedBehavior : getOwnedBehaviors()) {
			if (eClass != null && !eClass.isInstance(ownedBehavior))
				continue ownedBehaviorLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedBehavior.getName())
					: name.equals(ownedBehavior.getName())))
				continue ownedBehaviorLoop;
			return ownedBehavior;
		}
		return createOnDemand && eClass != null ? createOwnedBehavior(name, eClass) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		return (Behavior) eGet(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		eSet(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, newClassifierBehavior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createClassifierBehavior(String name, EClass eClass) {
		Behavior newClassifierBehavior = (Behavior) create(eClass);
		setClassifierBehavior(newClassifierBehavior);
		if (name != null)
			newClassifierBehavior.setName(name);
		return newClassifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InterfaceRealization> getInterfaceRealizations() {
		return (EList<InterfaceRealization>) eGet(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization createInterfaceRealization(String name, Interface contract) {
		InterfaceRealization newInterfaceRealization = (InterfaceRealization) create(
				UMLPackage.Literals.INTERFACE_REALIZATION);
		getInterfaceRealizations().add(newInterfaceRealization);
		if (name != null)
			newInterfaceRealization.setName(name);
		if (contract != null)
			newInterfaceRealization.setContract(contract);
		return newInterfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getInterfaceRealization(String name, Interface contract) {
		return getInterfaceRealization(name, contract, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization getInterfaceRealization(String name, Interface contract, boolean ignoreCase,
			boolean createOnDemand) {
		interfaceRealizationLoop: for (InterfaceRealization interfaceRealization : getInterfaceRealizations()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(interfaceRealization.getName())
					: name.equals(interfaceRealization.getName())))
				continue interfaceRealizationLoop;
			if (contract != null && !contract.equals(interfaceRealization.getContract()))
				continue interfaceRealizationLoop;
			return interfaceRealization;
		}
		return createOnDemand ? createInterfaceRealization(name, contract) : null;
	}

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
	protected static final int[] FEATURE_ESUBSETS = new int[] { UMLPackage.CLASS__ATTRIBUTE,
			UMLPackage.CLASS__OWNED_CONNECTOR, UMLPackage.CLASS__OWNED_OPERATION, UMLPackage.CLASS__OWNED_RECEPTION };

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
	protected static final int[] ATTRIBUTE_ESUBSETS = new int[] { UMLPackage.CLASS__OWNED_ATTRIBUTE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Operation> getOwnedOperations() {
		return (EList<Operation>) eGet(UMLPackage.Literals.CLASS__OWNED_OPERATION, true);
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
	@SuppressWarnings("unchecked")
	public EList<Extension> getExtensions() {
		return (EList<Extension>) eGet(UMLPackage.Literals.CLASS__EXTENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(String name) {
		return getExtension(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension(String name, boolean ignoreCase) {
		extensionLoop: for (Extension extension : getExtensions()) {
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(extension.getName()) : name.equals(extension.getName())))
				continue extensionLoop;
			return extension;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return (Boolean) eGet(UMLPackage.Literals.CLASS__IS_ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		eSet(UMLPackage.Literals.CLASS__IS_ACTIVE, newIsActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getNestedClassifiers() {
		return (EList<Classifier>) eGet(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER, true);
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
	public EList<Reception> getOwnedReceptions() {
		return (EList<Reception>) eGet(UMLPackage.Literals.CLASS__OWNED_RECEPTION, true);
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
	@SuppressWarnings("unchecked")
	public EList<org.eclipse.uml2.uml.Class> getSuperClasses() {
		return (EList<org.eclipse.uml2.uml.Class>) eGet(UMLPackage.Literals.CLASS__SUPER_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getSuperClass(String name) {
		return getSuperClass(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getSuperClass(String name, boolean ignoreCase, EClass eClass) {
		superClassLoop: for (org.eclipse.uml2.uml.Class superClass : getSuperClasses()) {
			if (eClass != null && !eClass.isInstance(superClass))
				continue superClassLoop;
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(superClass.getName()) : name.equals(superClass.getName())))
				continue superClassLoop;
			return superClass;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuperClasses() {
		return eIsSet(UMLPackage.Literals.CLASS__SUPER_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Property> getOwnedAttributes() {
		return (EList<Property>) eGet(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE, true);
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
	public boolean isSetOwnedAttributes() {
		return eIsSet(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return (Boolean) eGet(UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		eSet(UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT, newIsAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAbstract() {
		return eIsSet(UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassBehavior(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return BehavioredClassifierOperations.validateClassBehavior(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getAllImplementedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
					UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES,
						result = BehavioredClassifierOperations.getAllImplementedInterfaces(this));
			}
			return result;
		}
		return BehavioredClassifierOperations.getAllImplementedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplementedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
					UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES,
						result = BehavioredClassifierOperations.getImplementedInterfaces(this));
			}
			return result;
		}
		return BehavioredClassifierOperations.getImplementedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassiveClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClassOperations.validatePassiveClass(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes,
			Type returnType) {
		return ClassOperations.createOwnedOperation(this, name, parameterNames, parameterTypes, returnType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetaclass() {
		return ClassOperations.isMetaclass(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
			case UMLPackage.CLASS__CLASSIFIER_BEHAVIOR:
				return UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
			case UMLPackage.CLASS__INTERFACE_REALIZATION:
				return UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
			case UMLPackage.CLASS__OWNED_BEHAVIOR:
				return UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
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
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
			case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR:
				return UMLPackage.CLASS__CLASSIFIER_BEHAVIOR;
			case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION:
				return UMLPackage.CLASS__INTERFACE_REALIZATION;
			case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR:
				return UMLPackage.CLASS__OWNED_BEHAVIOR;
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
		if (baseClass == BehavioredClassifier.class) {
			switch (baseOperationID) {
			case UMLPackage.BEHAVIORED_CLASSIFIER___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES:
				return UMLPackage.CLASS___GET_ALL_IMPLEMENTED_INTERFACES;
			case UMLPackage.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES:
				return UMLPackage.CLASS___GET_IMPLEMENTED_INTERFACES;
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
		case UMLPackage.CLASS___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.CLASS___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.CLASS___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.CLASS___DESTROY:
			destroy();
			return null;
		case UMLPackage.CLASS___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.CLASS___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.CLASS___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.CLASS___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.CLASS___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.CLASS___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.CLASS___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.CLASS___GET_MODEL:
			return getModel();
		case UMLPackage.CLASS___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.CLASS___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.CLASS___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.CLASS___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.CLASS___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.CLASS___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.CLASS___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.CLASS___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.CLASS___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.CLASS___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.CLASS___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.CLASS___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.CLASS___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.CLASS___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.CLASS___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.CLASS___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.CLASS___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.CLASS___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.CLASS___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.CLASS___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.CLASS___GET_LABEL:
			return getLabel();
		case UMLPackage.CLASS___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.CLASS___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.CLASS___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.CLASS___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.CLASS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.CLASS___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.CLASS___SEPARATOR:
			return separator();
		case UMLPackage.CLASS___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.CLASS___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
			return validateMembersDistinguishable((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportOwnedMembers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND:
			return createElementImport((PackageableElement) arguments.get(0), (VisibilityKind) arguments.get(1));
		case UMLPackage.CLASS___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND:
			return createPackageImport((org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
		case UMLPackage.CLASS___GET_IMPORTED_ELEMENTS:
			return getImportedElements();
		case UMLPackage.CLASS___GET_IMPORTED_PACKAGES:
			return getImportedPackages();
		case UMLPackage.CLASS___GET_OWNED_MEMBERS:
			return getOwnedMembers();
		case UMLPackage.CLASS___EXCLUDE_COLLISIONS__ELIST:
			return excludeCollisions((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.CLASS___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
			return getNamesOfMember((NamedElement) arguments.get(0));
		case UMLPackage.CLASS___IMPORT_MEMBERS__ELIST:
			return importMembers((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.CLASS___GET_IMPORTED_MEMBERS:
			return getImportedMembers();
		case UMLPackage.CLASS___MEMBERS_ARE_DISTINGUISHABLE:
			return membersAreDistinguishable();
		case UMLPackage.CLASS___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionConsistent((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP:
			return validateNonLeafRedefinition((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionContextValid((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
			return isConsistentWith((RedefinableElement) arguments.get(0));
		case UMLPackage.CLASS___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
			return isRedefinitionContextValid((RedefinableElement) arguments.get(0));
		case UMLPackage.CLASS___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.CLASS___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.CLASS___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
			return validateNamespaceNeedsVisibility((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT:
			return createAssociation((Boolean) arguments.get(0), (AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3), (Integer) arguments.get(4),
					(Type) arguments.get(5), (Boolean) arguments.get(6), (AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9), (Integer) arguments.get(10));
		case UMLPackage.CLASS___GET_ASSOCIATIONS:
			return getAssociations();
		case UMLPackage.CLASS___CONFORMS_TO__TYPE:
			return conformsTo((Type) arguments.get(0));
		case UMLPackage.CLASS___IS_TEMPLATE:
			return isTemplate();
		case UMLPackage.CLASS___PARAMETERABLE_ELEMENTS:
			return parameterableElements();
		case UMLPackage.CLASS___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP:
			return validateSpecializeType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP:
			return validateMapsToGeneralizationSet((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP:
			return validateNonFinalParents((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP:
			return validateNoCyclesInGeneralization((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___GET_ALL_ATTRIBUTES:
			return getAllAttributes();
		case UMLPackage.CLASS___GET_ALL_OPERATIONS:
			return getAllOperations();
		case UMLPackage.CLASS___GET_ALL_USED_INTERFACES:
			return getAllUsedInterfaces();
		case UMLPackage.CLASS___GET_OPERATION__STRING_ELIST_ELIST:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
		case UMLPackage.CLASS___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
		case UMLPackage.CLASS___GET_OPERATIONS:
			return getOperations();
		case UMLPackage.CLASS___GET_USED_INTERFACES:
			return getUsedInterfaces();
		case UMLPackage.CLASS___ALL_FEATURES:
			return allFeatures();
		case UMLPackage.CLASS___ALL_PARENTS:
			return allParents();
		case UMLPackage.CLASS___GET_GENERALS:
			return getGenerals();
		case UMLPackage.CLASS___HAS_VISIBILITY_OF__NAMEDELEMENT:
			return hasVisibilityOf((NamedElement) arguments.get(0));
		case UMLPackage.CLASS___INHERIT__ELIST:
			return inherit((EList<NamedElement>) arguments.get(0));
		case UMLPackage.CLASS___INHERITABLE_MEMBERS__CLASSIFIER:
			return inheritableMembers((Classifier) arguments.get(0));
		case UMLPackage.CLASS___GET_INHERITED_MEMBERS:
			return getInheritedMembers();
		case UMLPackage.CLASS___MAY_SPECIALIZE_TYPE__CLASSIFIER:
			return maySpecializeType((Classifier) arguments.get(0));
		case UMLPackage.CLASS___PARENTS:
			return parents();
		case UMLPackage.CLASS___DIRECTLY_REALIZED_INTERFACES:
			return directlyRealizedInterfaces();
		case UMLPackage.CLASS___DIRECTLY_USED_INTERFACES:
			return directlyUsedInterfaces();
		case UMLPackage.CLASS___ALL_REALIZED_INTERFACES:
			return allRealizedInterfaces();
		case UMLPackage.CLASS___ALL_USED_INTERFACES:
			return allUsedInterfaces();
		case UMLPackage.CLASS___IS_SUBSTITUTABLE_FOR__CLASSIFIER:
			return isSubstitutableFor((Classifier) arguments.get(0));
		case UMLPackage.CLASS___ALL_ATTRIBUTES:
			return allAttributes();
		case UMLPackage.CLASS___ALL_SLOTTABLE_FEATURES:
			return allSlottableFeatures();
		case UMLPackage.CLASS___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT:
			return createOwnedAttribute((String) arguments.get(0), (Type) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3));
		case UMLPackage.CLASS___GET_PARTS:
			return getParts();
		case UMLPackage.CLASS___ALL_ROLES:
			return allRoles();
		case UMLPackage.CLASS___GET_OWNED_PORTS:
			return getOwnedPorts();
		case UMLPackage.CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP:
			return validateClassBehavior((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___GET_ALL_IMPLEMENTED_INTERFACES:
			return getAllImplementedInterfaces();
		case UMLPackage.CLASS___GET_IMPLEMENTED_INTERFACES:
			return getImplementedInterfaces();
		case UMLPackage.CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP:
			return validatePassiveClass((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE:
			return createOwnedOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Type) arguments.get(3));
		case UMLPackage.CLASS___IS_METACLASS:
			return isMetaclass();
		case UMLPackage.CLASS___GET_EXTENSIONS:
			return getExtensions();
		case UMLPackage.CLASS___GET_SUPER_CLASSES:
			return getSuperClasses();
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
		return super.isSetOwnedElements() || eIsSet(UMLPackage.CLASS__INTERFACE_REALIZATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers() || isSetOwnedAttributes() || eIsSet(UMLPackage.CLASS__OWNED_BEHAVIOR)
				|| eIsSet(UMLPackage.CLASS__OWNED_OPERATION) || eIsSet(UMLPackage.CLASS__NESTED_CLASSIFIER)
				|| eIsSet(UMLPackage.CLASS__OWNED_RECEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFeatures() {
		return super.isSetFeatures() || eIsSet(UMLPackage.CLASS__OWNED_OPERATION)
				|| eIsSet(UMLPackage.CLASS__OWNED_RECEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAttributes() {
		return super.isSetAttributes() || isSetOwnedAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Classifier> getGenerals() {
		@SuppressWarnings("unchecked")
		EList<Classifier> superClass = (EList<Classifier>) ((EList<?>) getSuperClasses());
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenerals() {
		return false;
	}

} //ClassImpl
