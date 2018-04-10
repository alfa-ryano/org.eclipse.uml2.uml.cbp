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
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Deployment;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;
import org.eclipse.uml2.uml.internal.operations.PropertyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getEnds <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDeployedElements <em>Deployed Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDeployments <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getFeaturingClassifiers <em>Featuring Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getQualifiers <em>Qualifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#isDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#isID <em>Is ID</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getRedefinedProperties <em>Redefined Property</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PropertyImpl#getSubsettedProperties <em>Subsetted Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends StructuralFeatureImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PROPERTY;
	}

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
	public TemplateParameter getTemplateParameter() {
		return (TemplateParameter) eGet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != null && !(newTemplateParameter instanceof ConnectableElementTemplateParameter)) {
			throw new IllegalArgumentException(
					"newTemplateParameter must be an instance of ConnectableElementTemplateParameter"); //$NON-NLS-1$
		}
		eSet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, newTemplateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemplateParameter() {
		return eIsSet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		return (TemplateParameter) eGet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		eSet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConnectorEnd> getEnds() {
		return (EList<ConnectorEnd>) eGet(UMLPackage.Literals.CONNECTABLE_ELEMENT__END, true);
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
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] { UMLPackage.PROPERTY__OWNED_COMMENT,
			UMLPackage.PROPERTY__NAME_EXPRESSION, UMLPackage.PROPERTY__LOWER_VALUE, UMLPackage.PROPERTY__UPPER_VALUE,
			UMLPackage.PROPERTY__DEPLOYMENT, UMLPackage.PROPERTY__QUALIFIER, UMLPackage.PROPERTY__DEFAULT_VALUE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> getDeployedElements() {
		return (EList<PackageableElement>) eGet(UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name) {
		return getDeployedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getDeployedElement(String name, boolean ignoreCase, EClass eClass) {
		deployedElementLoop: for (PackageableElement deployedElement : getDeployedElements()) {
			if (eClass != null && !eClass.isInstance(deployedElement))
				continue deployedElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(deployedElement.getName())
					: name.equals(deployedElement.getName())))
				continue deployedElementLoop;
			return deployedElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Deployment> getDeployments() {
		return (EList<Deployment>) eGet(UMLPackage.Literals.DEPLOYMENT_TARGET__DEPLOYMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment(String name) {
		Deployment newDeployment = (Deployment) create(UMLPackage.Literals.DEPLOYMENT);
		getDeployments().add(newDeployment);
		if (name != null)
			newDeployment.setName(name);
		return newDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name) {
		return getDeployment(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment(String name, boolean ignoreCase, boolean createOnDemand) {
		deploymentLoop: for (Deployment deployment : getDeployments()) {
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(deployment.getName()) : name.equals(deployment.getName())))
				continue deploymentLoop;
			return deployment;
		}
		return createOnDemand ? createDeployment(name) : null;
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
	@Override
	@SuppressWarnings("unchecked")
	public EList<Classifier> getFeaturingClassifiers() {
		return (EList<Classifier>) eGet(UMLPackage.Literals.FEATURE__FEATURING_CLASSIFIER, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFeaturingClassifiers() <em>Featuring Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturingClassifiers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FEATURING_CLASSIFIER_ESUBSETS = new int[] { UMLPackage.PROPERTY__DATATYPE,
			UMLPackage.PROPERTY__INTERFACE, UMLPackage.PROPERTY__CLASS, UMLPackage.PROPERTY__OWNING_ASSOCIATION };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<Classifier> getRedefinitionContexts() {
		return (EList<Classifier>) eGet(UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinitionContexts() <em>Redefinition Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitionContexts()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINITION_CONTEXT_ESUBSETS = new int[] { UMLPackage.PROPERTY__DATATYPE,
			UMLPackage.PROPERTY__INTERFACE, UMLPackage.PROPERTY__CLASS, UMLPackage.PROPERTY__OWNING_ASSOCIATION };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public EList<RedefinableElement> getRedefinedElements() {
		return (EList<RedefinableElement>) eGet(UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRedefinedElements() <em>Redefined Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedElements()
	 * @generated
	 * @ordered
	 */
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[] { UMLPackage.PROPERTY__REDEFINED_PROPERTY };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		return (Association) eGet(UMLPackage.Literals.PROPERTY__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		eSet(UMLPackage.Literals.PROPERTY__ASSOCIATION, newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		return (DataType) eGet(UMLPackage.Literals.PROPERTY__DATATYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		eSet(UMLPackage.Literals.PROPERTY__DATATYPE, newDatatype);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		return (Interface) eGet(UMLPackage.Literals.PROPERTY__INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		eSet(UMLPackage.Literals.PROPERTY__INTERFACE, newInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return (String) eGet(UMLPackage.Literals.PROPERTY__DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		eSet(UMLPackage.Literals.PROPERTY__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefault() {
		eUnset(UMLPackage.Literals.PROPERTY__DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefault() {
		return eIsSet(UMLPackage.Literals.PROPERTY__DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregation() {
		return (AggregationKind) eGet(UMLPackage.Literals.PROPERTY__AGGREGATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(AggregationKind newAggregation) {
		eSet(UMLPackage.Literals.PROPERTY__AGGREGATION, newAggregation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAssociationEnd() {
		return (Property) eGet(UMLPackage.Literals.PROPERTY__ASSOCIATION_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Property newAssociationEnd) {
		eSet(UMLPackage.Literals.PROPERTY__ASSOCIATION_END, newAssociationEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getQualifiers() {
		return (EList<Property>) eGet(UMLPackage.Literals.PROPERTY__QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createQualifier(String name, Type type, EClass eClass) {
		Property newQualifier = (Property) create(eClass);
		getQualifiers().add(newQualifier);
		if (name != null)
			newQualifier.setName(name);
		if (type != null)
			newQualifier.setType(type);
		return newQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createQualifier(String name, Type type) {
		return createQualifier(name, type, UMLPackage.Literals.PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getQualifier(String name, Type type) {
		return getQualifier(name, type, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getQualifier(String name, Type type, boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		qualifierLoop: for (Property qualifier : getQualifiers()) {
			if (eClass != null && !eClass.isInstance(qualifier))
				continue qualifierLoop;
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(qualifier.getName()) : name.equals(qualifier.getName())))
				continue qualifierLoop;
			if (type != null && !type.equals(qualifier.getType()))
				continue qualifierLoop;
			return qualifier;
		}
		return createOnDemand && eClass != null ? createQualifier(name, type, eClass) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getClass_() {
		return (org.eclipse.uml2.uml.Class) eGet(UMLPackage.Literals.PROPERTY__CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return (ValueSpecification) eGet(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		eSet(UMLPackage.Literals.PROPERTY__DEFAULT_VALUE, newDefaultValue);
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
	public boolean isComposite() {
		return (Boolean) eGet(UMLPackage.Literals.PROPERTY__IS_COMPOSITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		eSet(UMLPackage.Literals.PROPERTY__IS_COMPOSITE, newIsComposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return (Boolean) eGet(UMLPackage.Literals.PROPERTY__IS_DERIVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		eSet(UMLPackage.Literals.PROPERTY__IS_DERIVED, newIsDerived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerivedUnion() {
		return (Boolean) eGet(UMLPackage.Literals.PROPERTY__IS_DERIVED_UNION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerivedUnion(boolean newIsDerivedUnion) {
		eSet(UMLPackage.Literals.PROPERTY__IS_DERIVED_UNION, newIsDerivedUnion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isID() {
		return (Boolean) eGet(UMLPackage.Literals.PROPERTY__IS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsID(boolean newIsID) {
		eSet(UMLPackage.Literals.PROPERTY__IS_ID, newIsID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOpposite() {
		return (Property) eGet(UMLPackage.Literals.PROPERTY__OPPOSITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Property newOpposite) {
		eSet(UMLPackage.Literals.PROPERTY__OPPOSITE, newOpposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwningAssociation() {
		return (Association) eGet(UMLPackage.Literals.PROPERTY__OWNING_ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAssociation(Association newOwningAssociation) {
		eSet(UMLPackage.Literals.PROPERTY__OWNING_ASSOCIATION, newOwningAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getRedefinedProperties() {
		return (EList<Property>) eGet(UMLPackage.Literals.PROPERTY__REDEFINED_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getRedefinedProperty(String name, Type type) {
		return getRedefinedProperty(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getRedefinedProperty(String name, Type type, boolean ignoreCase, EClass eClass) {
		redefinedPropertyLoop: for (Property redefinedProperty : getRedefinedProperties()) {
			if (eClass != null && !eClass.isInstance(redefinedProperty))
				continue redefinedPropertyLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedProperty.getName())
					: name.equals(redefinedProperty.getName())))
				continue redefinedPropertyLoop;
			if (type != null && !type.equals(redefinedProperty.getType()))
				continue redefinedPropertyLoop;
			return redefinedProperty;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getSubsettedProperties() {
		return (EList<Property>) eGet(UMLPackage.Literals.PROPERTY__SUBSETTED_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSubsettedProperty(String name, Type type) {
		return getSubsettedProperty(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getSubsettedProperty(String name, Type type, boolean ignoreCase, EClass eClass) {
		subsettedPropertyLoop: for (Property subsettedProperty : getSubsettedProperties()) {
			if (eClass != null && !eClass.isInstance(subsettedProperty))
				continue subsettedPropertyLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(subsettedProperty.getName())
					: name.equals(subsettedProperty.getName())))
				continue subsettedPropertyLoop;
			if (type != null && !type.equals(subsettedProperty.getType()))
				continue subsettedPropertyLoop;
			return subsettedProperty;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return PropertyOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		return ParameterableElementOperations.isTemplateParameter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettingContextConforms(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateSubsettingContextConforms(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedUnionIsReadOnly(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateDerivedUnionIsReadOnly(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityOfComposite(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateMultiplicityOfComposite(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinedPropertyInherited(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateRedefinedPropertyInherited(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettingRules(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateSubsettingRules(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBindingToAttribute(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateBindingToAttribute(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedUnionIsDerived(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateDerivedUnionIsDerived(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateDeploymentTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubsettedPropertyNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateSubsettedPropertyNames(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfOppositeEnd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateTypeOfOppositeEnd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedIsAssociationEnd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PropertyOperations.validateQualifiedIsAssociationEnd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOtherEnd() {
		return PropertyOperations.getOtherEnd(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanDefaultValue(boolean value) {
		PropertyOperations.setBooleanDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerDefaultValue(int value) {
		PropertyOperations.setIntegerDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(boolean isNavigable) {
		PropertyOperations.setIsNavigable(this, isNavigable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullDefaultValue() {
		PropertyOperations.setNullDefaultValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealDefaultValue(double value) {
		PropertyOperations.setRealDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringDefaultValue(String value) {
		PropertyOperations.setStringDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnlimitedNaturalDefaultValue(int value) {
		PropertyOperations.setUnlimitedNaturalDefaultValue(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttribute() {
		return PropertyOperations.isAttribute(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigable() {
		return PropertyOperations.isNavigable(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> subsettingContext() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Type> result = (EList<Type>) cache.get(this, UMLPackage.Literals.PROPERTY___SUBSETTING_CONTEXT);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PROPERTY___SUBSETTING_CONTEXT,
						result = PropertyOperations.subsettingContext(this));
			}
			return result;
		}
		return PropertyOperations.subsettingContext(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return PropertyOperations.isConsistentWith(this, redefiningElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
				return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
			case UMLPackage.PROPERTY__TEMPLATE_PARAMETER:
				return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.PROPERTY__END:
				return UMLPackage.CONNECTABLE_ELEMENT__END;
			default:
				return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
			case UMLPackage.PROPERTY__DEPLOYED_ELEMENT:
				return UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
			case UMLPackage.PROPERTY__DEPLOYMENT:
				return UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER;
			case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
				return UMLPackage.PROPERTY__TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.CONNECTABLE_ELEMENT__END:
				return UMLPackage.PROPERTY__END;
			default:
				return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT:
				return UMLPackage.PROPERTY__DEPLOYED_ELEMENT;
			case UMLPackage.DEPLOYMENT_TARGET__DEPLOYMENT:
				return UMLPackage.PROPERTY__DEPLOYMENT;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
			case UMLPackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return UMLPackage.PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
			case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER:
				return UMLPackage.PROPERTY___IS_TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseOperationID) {
			case UMLPackage.CONNECTABLE_ELEMENT___GET_ENDS:
				return UMLPackage.PROPERTY___GET_ENDS;
			default:
				return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseOperationID) {
			case UMLPackage.DEPLOYMENT_TARGET___GET_DEPLOYED_ELEMENTS:
				return UMLPackage.PROPERTY___GET_DEPLOYED_ELEMENTS;
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
		case UMLPackage.PROPERTY___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.PROPERTY___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.PROPERTY___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.PROPERTY___DESTROY:
			destroy();
			return null;
		case UMLPackage.PROPERTY___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.PROPERTY___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.PROPERTY___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.PROPERTY___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.PROPERTY___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.PROPERTY___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.PROPERTY___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.PROPERTY___GET_MODEL:
			return getModel();
		case UMLPackage.PROPERTY___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.PROPERTY___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.PROPERTY___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.PROPERTY___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.PROPERTY___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.PROPERTY___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.PROPERTY___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.PROPERTY___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.PROPERTY___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.PROPERTY___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.PROPERTY___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.PROPERTY___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.PROPERTY___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.PROPERTY___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.PROPERTY___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.PROPERTY___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.PROPERTY___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.PROPERTY___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.PROPERTY___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.PROPERTY___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.PROPERTY___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.PROPERTY___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.PROPERTY___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.PROPERTY___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.PROPERTY___GET_LABEL:
			return getLabel();
		case UMLPackage.PROPERTY___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.PROPERTY___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.PROPERTY___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.PROPERTY___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.PROPERTY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.PROPERTY___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.PROPERTY___SEPARATOR:
			return separator();
		case UMLPackage.PROPERTY___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.PROPERTY___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionConsistent((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP:
			return validateNonLeafRedefinition((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionContextValid((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
			return isConsistentWith((RedefinableElement) arguments.get(0));
		case UMLPackage.PROPERTY___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
			return isRedefinitionContextValid((RedefinableElement) arguments.get(0));
		case UMLPackage.PROPERTY___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP:
			return validateUpperGeLower((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP:
			return validateLowerGe0((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP:
			return validateValueSpecificationNoSideEffects((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP:
			return validateValueSpecificationConstant((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP:
			return validateLowerIsInteger((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP:
			return validateUpperIsUnlimitedNatural((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___SET_LOWER__INT:
			setLower((Integer) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___SET_UPPER__INT:
			setUpper((Integer) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
			return compatibleWith((MultiplicityElement) arguments.get(0));
		case UMLPackage.PROPERTY___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
			return includesMultiplicity((MultiplicityElement) arguments.get(0));
		case UMLPackage.PROPERTY___IS__INT_INT:
			return is((Integer) arguments.get(0), (Integer) arguments.get(1));
		case UMLPackage.PROPERTY___IS_MULTIVALUED:
			return isMultivalued();
		case UMLPackage.PROPERTY___GET_LOWER:
			return getLower();
		case UMLPackage.PROPERTY___LOWER_BOUND:
			return lowerBound();
		case UMLPackage.PROPERTY___GET_UPPER:
			return getUpper();
		case UMLPackage.PROPERTY___UPPER_BOUND:
			return upperBound();
		case UMLPackage.PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.PROPERTY___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.PROPERTY___GET_ENDS:
			return getEnds();
		case UMLPackage.PROPERTY___GET_DEPLOYED_ELEMENTS:
			return getDeployedElements();
		case UMLPackage.PROPERTY___VALIDATE_SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP:
			return validateSubsettingContextConforms((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP:
			return validateDerivedUnionIsReadOnly((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP:
			return validateMultiplicityOfComposite((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP:
			return validateRedefinedPropertyInherited((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP:
			return validateSubsettingRules((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP:
			return validateBindingToAttribute((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP:
			return validateDerivedUnionIsDerived((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP:
			return validateDeploymentTarget((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP:
			return validateSubsettedPropertyNames((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_TYPE_OF_OPPOSITE_END__DIAGNOSTICCHAIN_MAP:
			return validateTypeOfOppositeEnd((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___VALIDATE_QUALIFIED_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP:
			return validateQualifiedIsAssociationEnd((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PROPERTY___GET_DEFAULT:
			return getDefault();
		case UMLPackage.PROPERTY___GET_OTHER_END:
			return getOtherEnd();
		case UMLPackage.PROPERTY___IS_SET_DEFAULT:
			return isSetDefault();
		case UMLPackage.PROPERTY___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN:
			setBooleanDefaultValue((Boolean) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___SET_DEFAULT__STRING:
			setDefault((String) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___SET_INTEGER_DEFAULT_VALUE__INT:
			setIntegerDefaultValue((Integer) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___SET_IS_COMPOSITE__BOOLEAN:
			setIsComposite((Boolean) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___SET_IS_NAVIGABLE__BOOLEAN:
			setIsNavigable((Boolean) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___SET_NULL_DEFAULT_VALUE:
			setNullDefaultValue();
			return null;
		case UMLPackage.PROPERTY___SET_OPPOSITE__PROPERTY:
			setOpposite((Property) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___SET_REAL_DEFAULT_VALUE__DOUBLE:
			setRealDefaultValue((Double) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___SET_STRING_DEFAULT_VALUE__STRING:
			setStringDefaultValue((String) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT:
			setUnlimitedNaturalDefaultValue((Integer) arguments.get(0));
			return null;
		case UMLPackage.PROPERTY___UNSET_DEFAULT:
			unsetDefault();
			return null;
		case UMLPackage.PROPERTY___IS_ATTRIBUTE:
			return isAttribute();
		case UMLPackage.PROPERTY___IS_COMPOSITE:
			return isComposite();
		case UMLPackage.PROPERTY___IS_NAVIGABLE:
			return isNavigable();
		case UMLPackage.PROPERTY___GET_OPPOSITE:
			return getOpposite();
		case UMLPackage.PROPERTY___SUBSETTING_CONTEXT:
			return subsettingContext();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER)
				|| eIsSet(UMLPackage.PROPERTY__ASSOCIATION_END);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.PROPERTY__DEPLOYMENT)
				|| eIsSet(UMLPackage.PROPERTY__QUALIFIER) || eIsSet(UMLPackage.PROPERTY__DEFAULT_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.PROPERTY__DATATYPE) || eIsSet(UMLPackage.PROPERTY__INTERFACE)
				|| eIsSet(UMLPackage.PROPERTY__CLASS) || eIsSet(UMLPackage.PROPERTY__OWNING_ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFeaturingClassifiers() {
		return super.isSetFeaturingClassifiers() || eIsSet(UMLPackage.PROPERTY__DATATYPE)
				|| eIsSet(UMLPackage.PROPERTY__INTERFACE) || eIsSet(UMLPackage.PROPERTY__CLASS)
				|| eIsSet(UMLPackage.PROPERTY__OWNING_ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinitionContexts() {
		return super.isSetRedefinitionContexts() || eIsSet(UMLPackage.PROPERTY__DATATYPE)
				|| eIsSet(UMLPackage.PROPERTY__INTERFACE) || eIsSet(UMLPackage.PROPERTY__CLASS)
				|| eIsSet(UMLPackage.PROPERTY__OWNING_ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRedefinedElements() {
		return super.isSetRedefinedElements() || eIsSet(UMLPackage.PROPERTY__REDEFINED_PROPERTY);
	}

} //PropertyImpl
