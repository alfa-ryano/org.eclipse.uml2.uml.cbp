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
import org.eclipse.uml2.uml.ClassifierTemplateParameter;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.ClassifierOperations;
import org.eclipse.uml2.uml.internal.operations.PackageableElementOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;
import org.eclipse.uml2.uml.internal.operations.RedefinableElementOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateableElementOperations;
import org.eclipse.uml2.uml.internal.operations.TypeOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinedElements <em>Redefined Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinitionContexts <em>Redefinition Context</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getCollaborationUses <em>Collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getGenerals <em>General</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#isFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getUseCases <em>Use Case</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ClassifierImpl#getSubstitutions <em>Substitution</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	protected static final int[] REDEFINED_ELEMENT_ESUBSETS = new int[] { UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name) {
		return getRedefinedElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement getRedefinedElement(String name, boolean ignoreCase, EClass eClass) {
		redefinedElementLoop: for (RedefinableElement redefinedElement : getRedefinedElements()) {
			if (eClass != null && !eClass.isInstance(redefinedElement))
				continue redefinedElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedElement.getName())
					: name.equals(redefinedElement.getName())))
				continue redefinedElementLoop;
			return redefinedElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getRedefinitionContexts() {
		return (EList<Classifier>) eGet(UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name) {
		return getRedefinitionContext(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinitionContext(String name, boolean ignoreCase, EClass eClass) {
		redefinitionContextLoop: for (Classifier redefinitionContext : getRedefinitionContexts()) {
			if (eClass != null && !eClass.isInstance(redefinitionContext))
				continue redefinitionContextLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinitionContext.getName())
					: name.equals(redefinitionContext.getName())))
				continue redefinitionContextLoop;
			return redefinitionContext;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLeaf() {
		return (Boolean) eGet(UMLPackage.Literals.REDEFINABLE_ELEMENT__IS_LEAF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		eSet(UMLPackage.Literals.REDEFINABLE_ELEMENT__IS_LEAF, newIsLeaf);
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
		if (newTemplateParameter != null && !(newTemplateParameter instanceof ClassifierTemplateParameter)) {
			throw new IllegalArgumentException(
					"newTemplateParameter must be an instance of ClassifierTemplateParameter"); //$NON-NLS-1$
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
	@Override
	public VisibilityKind getVisibility() {
		return (VisibilityKind) eGet(UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(VisibilityKind newVisibility) {
		eSet(UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVisibility() {
		eUnset(UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVisibility() {
		return eIsSet(UMLPackage.Literals.NAMED_ELEMENT__VISIBILITY);
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
	public org.eclipse.uml2.uml.Package getPackage() {
		return (org.eclipse.uml2.uml.Package) eGet(UMLPackage.Literals.TYPE__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.eclipse.uml2.uml.Package newPackage) {
		eSet(UMLPackage.Literals.TYPE__PACKAGE, newPackage);
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
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] { UMLPackage.CLASSIFIER__OWNED_COMMENT,
			UMLPackage.CLASSIFIER__NAME_EXPRESSION, UMLPackage.CLASSIFIER__ELEMENT_IMPORT,
			UMLPackage.CLASSIFIER__PACKAGE_IMPORT, UMLPackage.CLASSIFIER__OWNED_MEMBER,
			UMLPackage.CLASSIFIER__TEMPLATE_BINDING, UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE,
			UMLPackage.CLASSIFIER__COLLABORATION_USE, UMLPackage.CLASSIFIER__GENERALIZATION,
			UMLPackage.CLASSIFIER__SUBSTITUTION };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TemplateBinding> getTemplateBindings() {
		return (EList<TemplateBinding>) eGet(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding(TemplateSignature signature) {
		TemplateBinding newTemplateBinding = (TemplateBinding) create(UMLPackage.Literals.TEMPLATE_BINDING);
		getTemplateBindings().add(newTemplateBinding);
		if (signature != null)
			newTemplateBinding.setSignature(signature);
		return newTemplateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature) {
		return getTemplateBinding(signature, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding(TemplateSignature signature, boolean createOnDemand) {
		templateBindingLoop: for (TemplateBinding templateBinding : getTemplateBindings()) {
			if (signature != null && !signature.equals(templateBinding.getSignature()))
				continue templateBindingLoop;
			return templateBinding;
		}
		return createOnDemand ? createTemplateBinding(signature) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return (TemplateSignature) eGet(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != null && !(newOwnedTemplateSignature instanceof RedefinableTemplateSignature)) {
			throw new IllegalArgumentException(
					"newOwnedTemplateSignature must be an instance of RedefinableTemplateSignature"); //$NON-NLS-1$
		}
		eSet(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature(EClass eClass) {
		TemplateSignature newOwnedTemplateSignature = (TemplateSignature) create(eClass);
		setOwnedTemplateSignature(newOwnedTemplateSignature);
		return newOwnedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature createOwnedTemplateSignature() {
		return createOwnedTemplateSignature(UMLPackage.Literals.TEMPLATE_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedTemplateSignature() {
		return eIsSet(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	protected static final int[] FEATURE_ESUBSETS = new int[] { UMLPackage.CLASSIFIER__ATTRIBUTE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature(String name) {
		return getFeature(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature(String name, boolean ignoreCase, EClass eClass) {
		featureLoop: for (Feature feature : getFeatures()) {
			if (eClass != null && !eClass.isInstance(feature))
				continue featureLoop;
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(feature.getName()) : name.equals(feature.getName())))
				continue featureLoop;
			return feature;
		}
		return null;
	}

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
	protected static final int[] MEMBER_ESUBSETS = new int[] { UMLPackage.CLASSIFIER__OWNED_MEMBER,
			UMLPackage.CLASSIFIER__IMPORTED_MEMBER, UMLPackage.CLASSIFIER__FEATURE,
			UMLPackage.CLASSIFIER__INHERITED_MEMBER };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getAttributes() {
		return (EList<Property>) eGet(UMLPackage.Literals.CLASSIFIER__ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAttribute(String name, Type type) {
		return getAttribute(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAttribute(String name, Type type, boolean ignoreCase, EClass eClass) {
		attributeLoop: for (Property attribute : getAttributes()) {
			if (eClass != null && !eClass.isInstance(attribute))
				continue attributeLoop;
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(attribute.getName()) : name.equals(attribute.getName())))
				continue attributeLoop;
			if (type != null && !type.equals(attribute.getType()))
				continue attributeLoop;
			return attribute;
		}
		return null;
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
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] { UMLPackage.CLASSIFIER__OWNED_RULE,
			UMLPackage.CLASSIFIER__OWNED_USE_CASE };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CollaborationUse> getCollaborationUses() {
		return (EList<CollaborationUse>) eGet(UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE, true);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getCollaborationUses() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUses()
	 * @generated
	 * @ordered
	 */
	protected static final int[] COLLABORATION_USE_ESUBSETS = new int[] { UMLPackage.CLASSIFIER__REPRESENTATION };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createCollaborationUse(String name) {
		CollaborationUse newCollaborationUse = (CollaborationUse) create(UMLPackage.Literals.COLLABORATION_USE);
		getCollaborationUses().add(newCollaborationUse);
		if (name != null)
			newCollaborationUse.setName(name);
		return newCollaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getCollaborationUse(String name) {
		return getCollaborationUse(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getCollaborationUse(String name, boolean ignoreCase, boolean createOnDemand) {
		collaborationUseLoop: for (CollaborationUse collaborationUse : getCollaborationUses()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(collaborationUse.getName())
					: name.equals(collaborationUse.getName())))
				continue collaborationUseLoop;
			return collaborationUse;
		}
		return createOnDemand ? createCollaborationUse(name) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getGenerals() {
		return (EList<Classifier>) eGet(UMLPackage.Literals.CLASSIFIER__GENERAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral(String name) {
		return getGeneral(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getGeneral(String name, boolean ignoreCase, EClass eClass) {
		generalLoop: for (Classifier general : getGenerals()) {
			if (eClass != null && !eClass.isInstance(general))
				continue generalLoop;
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(general.getName()) : name.equals(general.getName())))
				continue generalLoop;
			return general;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generalization> getGeneralizations() {
		return (EList<Generalization>) eGet(UMLPackage.Literals.CLASSIFIER__GENERALIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization(Classifier general) {
		Generalization newGeneralization = (Generalization) create(UMLPackage.Literals.GENERALIZATION);
		getGeneralizations().add(newGeneralization);
		if (general != null)
			newGeneralization.setGeneral(general);
		return newGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getGeneralization(Classifier general) {
		return getGeneralization(general, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getGeneralization(Classifier general, boolean createOnDemand) {
		generalizationLoop: for (Generalization generalization : getGeneralizations()) {
			if (general != null && !general.equals(generalization.getGeneral()))
				continue generalizationLoop;
			return generalization;
		}
		return createOnDemand ? createGeneralization(general) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GeneralizationSet> getPowertypeExtents() {
		return (EList<GeneralizationSet>) eGet(UMLPackage.Literals.CLASSIFIER__POWERTYPE_EXTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getPowertypeExtent(String name) {
		return getPowertypeExtent(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet getPowertypeExtent(String name, boolean ignoreCase) {
		powertypeExtentLoop: for (GeneralizationSet powertypeExtent : getPowertypeExtents()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(powertypeExtent.getName())
					: name.equals(powertypeExtent.getName())))
				continue powertypeExtentLoop;
			return powertypeExtent;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedElement> getInheritedMembers() {
		return (EList<NamedElement>) eGet(UMLPackage.Literals.CLASSIFIER__INHERITED_MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInheritedMember(String name) {
		return getInheritedMember(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getInheritedMember(String name, boolean ignoreCase, EClass eClass) {
		inheritedMemberLoop: for (NamedElement inheritedMember : getInheritedMembers()) {
			if (eClass != null && !eClass.isInstance(inheritedMember))
				continue inheritedMemberLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(inheritedMember.getName())
					: name.equals(inheritedMember.getName())))
				continue inheritedMemberLoop;
			return inheritedMember;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (Boolean) eGet(UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		eSet(UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT, newIsAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinalSpecialization() {
		return (Boolean) eGet(UMLPackage.Literals.CLASSIFIER__IS_FINAL_SPECIALIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinalSpecialization(boolean newIsFinalSpecialization) {
		eSet(UMLPackage.Literals.CLASSIFIER__IS_FINAL_SPECIALIZATION, newIsFinalSpecialization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UseCase> getOwnedUseCases() {
		return (EList<UseCase>) eGet(UMLPackage.Literals.CLASSIFIER__OWNED_USE_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createOwnedUseCase(String name) {
		UseCase newOwnedUseCase = (UseCase) create(UMLPackage.Literals.USE_CASE);
		getOwnedUseCases().add(newOwnedUseCase);
		if (name != null)
			newOwnedUseCase.setName(name);
		return newOwnedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getOwnedUseCase(String name) {
		return getOwnedUseCase(name, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getOwnedUseCase(String name, boolean ignoreCase, boolean createOnDemand) {
		ownedUseCaseLoop: for (UseCase ownedUseCase : getOwnedUseCases()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedUseCase.getName())
					: name.equals(ownedUseCase.getName())))
				continue ownedUseCaseLoop;
			return ownedUseCase;
		}
		return createOnDemand ? createOwnedUseCase(name) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UseCase> getUseCases() {
		return (EList<UseCase>) eGet(UMLPackage.Literals.CLASSIFIER__USE_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase(String name) {
		return getUseCase(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase(String name, boolean ignoreCase) {
		useCaseLoop: for (UseCase useCase : getUseCases()) {
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(useCase.getName()) : name.equals(useCase.getName())))
				continue useCaseLoop;
			return useCase;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getRedefinedClassifiers() {
		return (EList<Classifier>) eGet(UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinedClassifier(String name) {
		return getRedefinedClassifier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getRedefinedClassifier(String name, boolean ignoreCase, EClass eClass) {
		redefinedClassifierLoop: for (Classifier redefinedClassifier : getRedefinedClassifiers()) {
			if (eClass != null && !eClass.isInstance(redefinedClassifier))
				continue redefinedClassifierLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(redefinedClassifier.getName())
					: name.equals(redefinedClassifier.getName())))
				continue redefinedClassifierLoop;
			return redefinedClassifier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		return (CollaborationUse) eGet(UMLPackage.Literals.CLASSIFIER__REPRESENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		eSet(UMLPackage.Literals.CLASSIFIER__REPRESENTATION, newRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse createRepresentation(String name) {
		CollaborationUse newRepresentation = (CollaborationUse) create(UMLPackage.Literals.COLLABORATION_USE);
		setRepresentation(newRepresentation);
		if (name != null)
			newRepresentation.setName(name);
		return newRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Substitution> getSubstitutions() {
		return (EList<Substitution>) eGet(UMLPackage.Literals.CLASSIFIER__SUBSTITUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution(String name, Classifier contract) {
		Substitution newSubstitution = (Substitution) create(UMLPackage.Literals.SUBSTITUTION);
		getSubstitutions().add(newSubstitution);
		if (name != null)
			newSubstitution.setName(name);
		if (contract != null)
			newSubstitution.setContract(contract);
		return newSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution getSubstitution(String name, Classifier contract) {
		return getSubstitution(name, contract, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution getSubstitution(String name, Classifier contract, boolean ignoreCase, boolean createOnDemand) {
		substitutionLoop: for (Substitution substitution : getSubstitutions()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(substitution.getName())
					: name.equals(substitution.getName())))
				continue substitutionLoop;
			if (contract != null && !contract.equals(substitution.getContract()))
				continue substitutionLoop;
			return substitution;
		}
		return createOnDemand ? createSubstitution(name, contract) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionConsistent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RedefinableElementOperations.validateRedefinitionConsistent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonLeafRedefinition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RedefinableElementOperations.validateNonLeafRedefinition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinitionContextValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RedefinableElementOperations.validateRedefinitionContextValid(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		return RedefinableElementOperations.isConsistentWith(this, redefiningElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefinedElement) {
		return RedefinableElementOperations.isRedefinitionContextValid(this, redefinedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return ParameterableElementOperations.isCompatibleWith(this, p);
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
	public boolean validateNamespaceNeedsVisibility(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PackageableElementOperations.validateNamespaceNeedsVisibility(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation(boolean end1IsNavigable, AggregationKind end1Aggregation, String end1Name,
			int end1Lower, int end1Upper, Type end1Type, boolean end2IsNavigable, AggregationKind end2Aggregation,
			String end2Name, int end2Lower, int end2Upper) {
		return TypeOperations.createAssociation(this, end1IsNavigable, end1Aggregation, end1Name, end1Lower, end1Upper,
				end1Type, end2IsNavigable, end2Aggregation, end2Name, end2Lower, end2Upper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Association> result = (EList<Association>) cache.get(this,
					UMLPackage.Literals.TYPE___GET_ASSOCIATIONS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.TYPE___GET_ASSOCIATIONS,
						result = TypeOperations.getAssociations(this));
			}
			return result;
		}
		return TypeOperations.getAssociations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Type other) {
		return ClassifierOperations.conformsTo(this, other);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		return ClassifierOperations.isTemplate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> parameterableElements() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<ParameterableElement> result = (EList<ParameterableElement>) cache.get(this,
					UMLPackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS,
						result = TemplateableElementOperations.parameterableElements(this));
			}
			return result;
		}
		return TemplateableElementOperations.parameterableElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializeType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClassifierOperations.validateSpecializeType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClassifierOperations.validateMapsToGeneralizationSet(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonFinalParents(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClassifierOperations.validateNonFinalParents(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoCyclesInGeneralization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClassifierOperations.validateNoCyclesInGeneralization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAllAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Property> result = (EList<Property>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___GET_ALL_ATTRIBUTES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___GET_ALL_ATTRIBUTES,
						result = ClassifierOperations.getAllAttributes(this));
			}
			return result;
		}
		return ClassifierOperations.getAllAttributes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getAllOperations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Operation> result = (EList<Operation>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___GET_ALL_OPERATIONS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___GET_ALL_OPERATIONS,
						result = ClassifierOperations.getAllOperations(this));
			}
			return result;
		}
		return ClassifierOperations.getAllOperations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getAllUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___GET_ALL_USED_INTERFACES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___GET_ALL_USED_INTERFACES,
						result = ClassifierOperations.getAllUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.getAllUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes) {
		return ClassifierOperations.getOperation(this, name, parameterNames, parameterTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes,
			boolean ignoreCase) {
		return ClassifierOperations.getOperation(this, name, parameterNames, parameterTypes, ignoreCase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Operation> result = (EList<Operation>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___GET_OPERATIONS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___GET_OPERATIONS,
						result = ClassifierOperations.getOperations(this));
			}
			return result;
		}
		return ClassifierOperations.getOperations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___GET_USED_INTERFACES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___GET_USED_INTERFACES,
						result = ClassifierOperations.getUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.getUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> allFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Feature> result = (EList<Feature>) cache.get(this, UMLPackage.Literals.CLASSIFIER___ALL_FEATURES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___ALL_FEATURES,
						result = ClassifierOperations.allFeatures(this));
			}
			return result;
		}
		return ClassifierOperations.allFeatures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> allParents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Classifier> result = (EList<Classifier>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___ALL_PARENTS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___ALL_PARENTS,
						result = ClassifierOperations.allParents(this));
			}
			return result;
		}
		return ClassifierOperations.allParents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasVisibilityOf(NamedElement n) {
		return ClassifierOperations.hasVisibilityOf(this, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inherit(EList<NamedElement> inhs) {
		return ClassifierOperations.inherit(this, inhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inheritableMembers(Classifier c) {
		return ClassifierOperations.inheritableMembers(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maySpecializeType(Classifier c) {
		return ClassifierOperations.maySpecializeType(this, c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> parents() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Classifier> result = (EList<Classifier>) cache.get(this, UMLPackage.Literals.CLASSIFIER___PARENTS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___PARENTS, result = ClassifierOperations.parents(this));
			}
			return result;
		}
		return ClassifierOperations.parents(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> directlyRealizedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES,
						result = ClassifierOperations.directlyRealizedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.directlyRealizedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> directlyUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___DIRECTLY_USED_INTERFACES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___DIRECTLY_USED_INTERFACES,
						result = ClassifierOperations.directlyUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.directlyUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> allRealizedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___ALL_REALIZED_INTERFACES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___ALL_REALIZED_INTERFACES,
						result = ClassifierOperations.allRealizedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.allRealizedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> allUsedInterfaces() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Interface> result = (EList<Interface>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___ALL_USED_INTERFACES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___ALL_USED_INTERFACES,
						result = ClassifierOperations.allUsedInterfaces(this));
			}
			return result;
		}
		return ClassifierOperations.allUsedInterfaces(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstitutableFor(Classifier contract) {
		return ClassifierOperations.isSubstitutableFor(this, contract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> allAttributes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Property> result = (EList<Property>) cache.get(this, UMLPackage.Literals.CLASSIFIER___ALL_ATTRIBUTES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___ALL_ATTRIBUTES,
						result = ClassifierOperations.allAttributes(this));
			}
			return result;
		}
		return ClassifierOperations.allAttributes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> allSlottableFeatures() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<StructuralFeature> result = (EList<StructuralFeature>) cache.get(this,
					UMLPackage.Literals.CLASSIFIER___ALL_SLOTTABLE_FEATURES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.CLASSIFIER___ALL_SLOTTABLE_FEATURES,
						result = ClassifierOperations.allSlottableFeatures(this));
			}
			return result;
		}
		return ClassifierOperations.allSlottableFeatures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.CLASSIFIER__IS_LEAF:
				return UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF;
			case UMLPackage.CLASSIFIER__REDEFINED_ELEMENT:
				return UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
			case UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				return UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
			default:
				return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
			case UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
			case UMLPackage.CLASSIFIER__PACKAGE:
				return UMLPackage.TYPE__PACKAGE;
			default:
				return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.CLASSIFIER__TEMPLATE_BINDING:
				return UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
			case UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.REDEFINABLE_ELEMENT__IS_LEAF:
				return UMLPackage.CLASSIFIER__IS_LEAF;
			case UMLPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT:
				return UMLPackage.CLASSIFIER__REDEFINED_ELEMENT;
			case UMLPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT:
				return UMLPackage.CLASSIFIER__REDEFINITION_CONTEXT;
			default:
				return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER;
			case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
				return UMLPackage.CLASSIFIER__TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
			case UMLPackage.TYPE__PACKAGE:
				return UMLPackage.CLASSIFIER__PACKAGE;
			default:
				return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				return UMLPackage.CLASSIFIER__TEMPLATE_BINDING;
			case UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return UMLPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseOperationID) {
			case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.CLASSIFIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.REDEFINABLE_ELEMENT___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;
			case UMLPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
				return UMLPackage.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
			case UMLPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
				return UMLPackage.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
			default:
				return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
			case UMLPackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return UMLPackage.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
			case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER:
				return UMLPackage.CLASSIFIER___IS_TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
			case UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.CLASSIFIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;
			default:
				return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseOperationID) {
			case UMLPackage.TYPE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT:
				return UMLPackage.CLASSIFIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;
			case UMLPackage.TYPE___GET_ASSOCIATIONS:
				return UMLPackage.CLASSIFIER___GET_ASSOCIATIONS;
			case UMLPackage.TYPE___CONFORMS_TO__TYPE:
				return UMLPackage.CLASSIFIER___CONFORMS_TO__TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
			case UMLPackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE:
				return UMLPackage.CLASSIFIER___IS_TEMPLATE;
			case UMLPackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS:
				return UMLPackage.CLASSIFIER___PARAMETERABLE_ELEMENTS;
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
		case UMLPackage.CLASSIFIER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.CLASSIFIER___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.CLASSIFIER___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.CLASSIFIER___DESTROY:
			destroy();
			return null;
		case UMLPackage.CLASSIFIER___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.CLASSIFIER___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.CLASSIFIER___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.CLASSIFIER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.CLASSIFIER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_MODEL:
			return getModel();
		case UMLPackage.CLASSIFIER___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.CLASSIFIER___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.CLASSIFIER___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.CLASSIFIER___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.CLASSIFIER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.CLASSIFIER___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.CLASSIFIER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.CLASSIFIER___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.CLASSIFIER___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.CLASSIFIER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.CLASSIFIER___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.CLASSIFIER___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.CLASSIFIER___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.CLASSIFIER___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.CLASSIFIER___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.CLASSIFIER___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.CLASSIFIER___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.CLASSIFIER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.CLASSIFIER___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_LABEL:
			return getLabel();
		case UMLPackage.CLASSIFIER___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.CLASSIFIER___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.CLASSIFIER___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.CLASSIFIER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.CLASSIFIER___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.CLASSIFIER___SEPARATOR:
			return separator();
		case UMLPackage.CLASSIFIER___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.CLASSIFIER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
			return validateMembersDistinguishable((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportOwnedMembers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND:
			return createElementImport((PackageableElement) arguments.get(0), (VisibilityKind) arguments.get(1));
		case UMLPackage.CLASSIFIER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND:
			return createPackageImport((org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
		case UMLPackage.CLASSIFIER___GET_IMPORTED_ELEMENTS:
			return getImportedElements();
		case UMLPackage.CLASSIFIER___GET_IMPORTED_PACKAGES:
			return getImportedPackages();
		case UMLPackage.CLASSIFIER___GET_OWNED_MEMBERS:
			return getOwnedMembers();
		case UMLPackage.CLASSIFIER___EXCLUDE_COLLISIONS__ELIST:
			return excludeCollisions((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
			return getNamesOfMember((NamedElement) arguments.get(0));
		case UMLPackage.CLASSIFIER___IMPORT_MEMBERS__ELIST:
			return importMembers((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_IMPORTED_MEMBERS:
			return getImportedMembers();
		case UMLPackage.CLASSIFIER___MEMBERS_ARE_DISTINGUISHABLE:
			return membersAreDistinguishable();
		case UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionConsistent((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP:
			return validateNonLeafRedefinition((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
			return validateRedefinitionContextValid((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
			return isConsistentWith((RedefinableElement) arguments.get(0));
		case UMLPackage.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
			return isRedefinitionContextValid((RedefinableElement) arguments.get(0));
		case UMLPackage.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.CLASSIFIER___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.CLASSIFIER___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
			return validateNamespaceNeedsVisibility((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT:
			return createAssociation((Boolean) arguments.get(0), (AggregationKind) arguments.get(1),
					(String) arguments.get(2), (Integer) arguments.get(3), (Integer) arguments.get(4),
					(Type) arguments.get(5), (Boolean) arguments.get(6), (AggregationKind) arguments.get(7),
					(String) arguments.get(8), (Integer) arguments.get(9), (Integer) arguments.get(10));
		case UMLPackage.CLASSIFIER___GET_ASSOCIATIONS:
			return getAssociations();
		case UMLPackage.CLASSIFIER___CONFORMS_TO__TYPE:
			return conformsTo((Type) arguments.get(0));
		case UMLPackage.CLASSIFIER___IS_TEMPLATE:
			return isTemplate();
		case UMLPackage.CLASSIFIER___PARAMETERABLE_ELEMENTS:
			return parameterableElements();
		case UMLPackage.CLASSIFIER___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP:
			return validateSpecializeType((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP:
			return validateMapsToGeneralizationSet((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP:
			return validateNonFinalParents((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP:
			return validateNoCyclesInGeneralization((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CLASSIFIER___GET_ALL_ATTRIBUTES:
			return getAllAttributes();
		case UMLPackage.CLASSIFIER___GET_ALL_OPERATIONS:
			return getAllOperations();
		case UMLPackage.CLASSIFIER___GET_ALL_USED_INTERFACES:
			return getAllUsedInterfaces();
		case UMLPackage.CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2));
		case UMLPackage.CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN:
			return getOperation((String) arguments.get(0), (EList<String>) arguments.get(1),
					(EList<Type>) arguments.get(2), (Boolean) arguments.get(3));
		case UMLPackage.CLASSIFIER___GET_OPERATIONS:
			return getOperations();
		case UMLPackage.CLASSIFIER___GET_USED_INTERFACES:
			return getUsedInterfaces();
		case UMLPackage.CLASSIFIER___ALL_FEATURES:
			return allFeatures();
		case UMLPackage.CLASSIFIER___ALL_PARENTS:
			return allParents();
		case UMLPackage.CLASSIFIER___GET_GENERALS:
			return getGenerals();
		case UMLPackage.CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT:
			return hasVisibilityOf((NamedElement) arguments.get(0));
		case UMLPackage.CLASSIFIER___INHERIT__ELIST:
			return inherit((EList<NamedElement>) arguments.get(0));
		case UMLPackage.CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER:
			return inheritableMembers((Classifier) arguments.get(0));
		case UMLPackage.CLASSIFIER___GET_INHERITED_MEMBERS:
			return getInheritedMembers();
		case UMLPackage.CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER:
			return maySpecializeType((Classifier) arguments.get(0));
		case UMLPackage.CLASSIFIER___PARENTS:
			return parents();
		case UMLPackage.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES:
			return directlyRealizedInterfaces();
		case UMLPackage.CLASSIFIER___DIRECTLY_USED_INTERFACES:
			return directlyUsedInterfaces();
		case UMLPackage.CLASSIFIER___ALL_REALIZED_INTERFACES:
			return allRealizedInterfaces();
		case UMLPackage.CLASSIFIER___ALL_USED_INTERFACES:
			return allUsedInterfaces();
		case UMLPackage.CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER:
			return isSubstitutableFor((Classifier) arguments.get(0));
		case UMLPackage.CLASSIFIER___ALL_ATTRIBUTES:
			return allAttributes();
		case UMLPackage.CLASSIFIER___ALL_SLOTTABLE_FEATURES:
			return allSlottableFeatures();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinedElements() {
		return eIsSet(UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedefinitionContexts() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.CLASSIFIER__PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.CLASSIFIER__TEMPLATE_BINDING)
				|| isSetOwnedTemplateSignature() || eIsSet(UMLPackage.CLASSIFIER__COLLABORATION_USE)
				|| eIsSet(UMLPackage.CLASSIFIER__GENERALIZATION) || eIsSet(UMLPackage.CLASSIFIER__SUBSTITUTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatures() {
		return isSetAttributes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMembers() {
		return super.isSetMembers() || isSetFeatures() || eIsSet(UMLPackage.CLASSIFIER__INHERITED_MEMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributes() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers() || eIsSet(UMLPackage.CLASSIFIER__OWNED_USE_CASE);
	}

} //ClassifierImpl
