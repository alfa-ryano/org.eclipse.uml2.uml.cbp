/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.PackageMerge;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.internal.operations.PackageOperations;
import org.eclipse.uml2.uml.internal.operations.PackageableElementOperations;
import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;
import org.eclipse.uml2.uml.internal.operations.TemplateableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getPackagedElements <em>Packaged Element</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getURI <em>URI</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getNestedPackages <em>Nested Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedStereotypes <em>Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getOwnedTypes <em>Owned Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getPackageMerges <em>Package Merge</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.PackageImpl#getProfileApplications <em>Profile Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements org.eclipse.uml2.uml.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.PACKAGE;
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
		eSet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, newTemplateParameter);
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
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] { UMLPackage.PACKAGE__OWNED_COMMENT,
			UMLPackage.PACKAGE__NAME_EXPRESSION, UMLPackage.PACKAGE__ELEMENT_IMPORT, UMLPackage.PACKAGE__PACKAGE_IMPORT,
			UMLPackage.PACKAGE__OWNED_MEMBER, UMLPackage.PACKAGE__TEMPLATE_BINDING,
			UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE, UMLPackage.PACKAGE__PACKAGE_MERGE,
			UMLPackage.PACKAGE__PROFILE_APPLICATION };

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
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] { UMLPackage.PACKAGE__OWNED_RULE,
			UMLPackage.PACKAGE__PACKAGED_ELEMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> getPackagedElements() {
		return (EList<PackageableElement>) eGet(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement createPackagedElement(String name, EClass eClass) {
		PackageableElement newPackagedElement = (PackageableElement) create(eClass);
		getPackagedElements().add(newPackagedElement);
		if (name != null)
			newPackagedElement.setName(name);
		return newPackagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getPackagedElement(String name) {
		return getPackagedElement(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getPackagedElement(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		packagedElementLoop: for (PackageableElement packagedElement : getPackagedElements()) {
			if (eClass != null && !eClass.isInstance(packagedElement))
				continue packagedElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(packagedElement.getName())
					: name.equals(packagedElement.getName())))
				continue packagedElementLoop;
			return packagedElement;
		}
		return createOnDemand && eClass != null ? createPackagedElement(name, eClass) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getURI() {
		return (String) eGet(UMLPackage.Literals.PACKAGE__URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURI(String newURI) {
		eSet(UMLPackage.Literals.PACKAGE__URI, newURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.eclipse.uml2.uml.Package> getNestedPackages() {
		return (EList<org.eclipse.uml2.uml.Package>) eGet(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE, true);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getNestedPackages() <em>Nested Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackages()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NESTED_PACKAGE_ESUPERSETS = new int[] { UMLPackage.PACKAGE__PACKAGED_ELEMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package createNestedPackage(String name, EClass eClass) {
		org.eclipse.uml2.uml.Package newNestedPackage = (org.eclipse.uml2.uml.Package) create(eClass);
		getNestedPackages().add(newNestedPackage);
		if (name != null)
			newNestedPackage.setName(name);
		return newNestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package createNestedPackage(String name) {
		return createNestedPackage(name, UMLPackage.Literals.PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getNestedPackage(String name) {
		return getNestedPackage(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getNestedPackage(String name, boolean ignoreCase, EClass eClass,
			boolean createOnDemand) {
		nestedPackageLoop: for (org.eclipse.uml2.uml.Package nestedPackage : getNestedPackages()) {
			if (eClass != null && !eClass.isInstance(nestedPackage))
				continue nestedPackageLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(nestedPackage.getName())
					: name.equals(nestedPackage.getName())))
				continue nestedPackageLoop;
			return nestedPackage;
		}
		return createOnDemand && eClass != null ? createNestedPackage(name, eClass) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getNestingPackage() {
		return (org.eclipse.uml2.uml.Package) eGet(UMLPackage.Literals.PACKAGE__NESTING_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(org.eclipse.uml2.uml.Package newNestingPackage) {
		eSet(UMLPackage.Literals.PACKAGE__NESTING_PACKAGE, newNestingPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Stereotype> getOwnedStereotypes() {
		return (EList<Stereotype>) eGet(UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE, true);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedStereotypes() <em>Owned Stereotype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStereotypes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_STEREOTYPE_ESUPERSETS = new int[] { UMLPackage.PACKAGE__PACKAGED_ELEMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getOwnedStereotype(String name) {
		return getOwnedStereotype(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getOwnedStereotype(String name, boolean ignoreCase) {
		ownedStereotypeLoop: for (Stereotype ownedStereotype : getOwnedStereotypes()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedStereotype.getName())
					: name.equals(ownedStereotype.getName())))
				continue ownedStereotypeLoop;
			return ownedStereotype;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> getOwnedTypes() {
		return (EList<Type>) eGet(UMLPackage.Literals.PACKAGE__OWNED_TYPE, true);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedTypes() <em>Owned Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_TYPE_ESUPERSETS = new int[] { UMLPackage.PACKAGE__PACKAGED_ELEMENT };

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createOwnedType(String name, EClass eClass) {
		Type newOwnedType = (Type) create(eClass);
		getOwnedTypes().add(newOwnedType);
		if (name != null)
			newOwnedType.setName(name);
		return newOwnedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOwnedType(String name) {
		return getOwnedType(name, false, null, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getOwnedType(String name, boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		ownedTypeLoop: for (Type ownedType : getOwnedTypes()) {
			if (eClass != null && !eClass.isInstance(ownedType))
				continue ownedTypeLoop;
			if (name != null
					&& !(ignoreCase ? name.equalsIgnoreCase(ownedType.getName()) : name.equals(ownedType.getName())))
				continue ownedTypeLoop;
			return ownedType;
		}
		return createOnDemand && eClass != null ? createOwnedType(name, eClass) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageMerge> getPackageMerges() {
		return (EList<PackageMerge>) eGet(UMLPackage.Literals.PACKAGE__PACKAGE_MERGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge createPackageMerge(org.eclipse.uml2.uml.Package mergedPackage) {
		PackageMerge newPackageMerge = (PackageMerge) create(UMLPackage.Literals.PACKAGE_MERGE);
		getPackageMerges().add(newPackageMerge);
		if (mergedPackage != null)
			newPackageMerge.setMergedPackage(mergedPackage);
		return newPackageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge getPackageMerge(org.eclipse.uml2.uml.Package mergedPackage) {
		return getPackageMerge(mergedPackage, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageMerge getPackageMerge(org.eclipse.uml2.uml.Package mergedPackage, boolean createOnDemand) {
		packageMergeLoop: for (PackageMerge packageMerge : getPackageMerges()) {
			if (mergedPackage != null && !mergedPackage.equals(packageMerge.getMergedPackage()))
				continue packageMergeLoop;
			return packageMerge;
		}
		return createOnDemand ? createPackageMerge(mergedPackage) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ProfileApplication> getProfileApplications() {
		return (EList<ProfileApplication>) eGet(UMLPackage.Literals.PACKAGE__PROFILE_APPLICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication createProfileApplication() {
		ProfileApplication newProfileApplication = (ProfileApplication) create(UMLPackage.Literals.PROFILE_APPLICATION);
		getProfileApplications().add(newProfileApplication);
		return newProfileApplication;
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
	public boolean isTemplate() {
		return TemplateableElementOperations.isTemplate(this);
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
	public boolean validateElementsPublicOrPrivate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PackageOperations.validateElementsPublicOrPrivate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> applyProfile(Profile profile) {
		return PackageOperations.applyProfile(this, profile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class createOwnedClass(String name, boolean isAbstract) {
		return PackageOperations.createOwnedClass(this, name, isAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createOwnedEnumeration(String name) {
		return PackageOperations.createOwnedEnumeration(this, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createOwnedInterface(String name) {
		return PackageOperations.createOwnedInterface(this, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createOwnedPrimitiveType(String name) {
		return PackageOperations.createOwnedPrimitiveType(this, name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype createOwnedStereotype(String name, boolean isAbstract) {
		return PackageOperations.createOwnedStereotype(this, name, isAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getAllAppliedProfiles() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Profile> result = (EList<Profile>) cache.get(this,
					UMLPackage.Literals.PACKAGE___GET_ALL_APPLIED_PROFILES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE___GET_ALL_APPLIED_PROFILES,
						result = PackageOperations.getAllAppliedProfiles(this));
			}
			return result;
		}
		return PackageOperations.getAllAppliedProfiles(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfileApplication> getAllProfileApplications() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<ProfileApplication> result = (EList<ProfileApplication>) cache.get(this,
					UMLPackage.Literals.PACKAGE___GET_ALL_PROFILE_APPLICATIONS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE___GET_ALL_PROFILE_APPLICATIONS,
						result = PackageOperations.getAllProfileApplications(this));
			}
			return result;
		}
		return PackageOperations.getAllProfileApplications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getAppliedProfile(String qualifiedName) {
		return PackageOperations.getAppliedProfile(this, qualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getAppliedProfile(String qualifiedName, boolean recurse) {
		return PackageOperations.getAppliedProfile(this, qualifiedName, recurse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Profile> getAppliedProfiles() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Profile> result = (EList<Profile>) cache.get(this,
					UMLPackage.Literals.PACKAGE___GET_APPLIED_PROFILES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE___GET_APPLIED_PROFILES,
						result = PackageOperations.getAppliedProfiles(this));
			}
			return result;
		}
		return PackageOperations.getAppliedProfiles(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication getProfileApplication(Profile profile) {
		return PackageOperations.getProfileApplication(this, profile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileApplication getProfileApplication(Profile profile, boolean recurse) {
		return PackageOperations.getProfileApplication(this, profile, recurse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModelLibrary() {
		return PackageOperations.isModelLibrary(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProfileApplied(Profile profile) {
		return PackageOperations.isProfileApplied(this, profile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> unapplyProfile(Profile profile) {
		return PackageOperations.unapplyProfile(this, profile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> applyProfiles(EList<Profile> profiles) {
		return PackageOperations.applyProfiles(this, profiles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> allApplicableStereotypes() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<Stereotype> result = (EList<Stereotype>) cache.get(this,
					UMLPackage.Literals.PACKAGE___ALL_APPLICABLE_STEREOTYPES);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE___ALL_APPLICABLE_STEREOTYPES,
						result = PackageOperations.allApplicableStereotypes(this));
			}
			return result;
		}
		return PackageOperations.allApplicableStereotypes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile containingProfile() {
		return PackageOperations.containingProfile(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makesVisible(NamedElement el) {
		return PackageOperations.makesVisible(this, el);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> visibleMembers() {
		CacheAdapter cache = getCacheAdapter();
		if (cache != null) {
			@SuppressWarnings("unchecked")
			EList<PackageableElement> result = (EList<PackageableElement>) cache.get(this,
					UMLPackage.Literals.PACKAGE___VISIBLE_MEMBERS);
			if (result == null) {
				cache.put(this, UMLPackage.Literals.PACKAGE___VISIBLE_MEMBERS,
						result = PackageOperations.visibleMembers(this));
			}
			return result;
		}
		return PackageOperations.visibleMembers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean mustBeOwned() {
		return PackageOperations.mustBeOwned(this);
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
			case UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
			case UMLPackage.PACKAGE__TEMPLATE_PARAMETER:
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
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.PACKAGE__TEMPLATE_BINDING:
				return UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
			case UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
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
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER;
			case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
				return UMLPackage.PACKAGE__TEMPLATE_PARAMETER;
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
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING:
				return UMLPackage.PACKAGE__TEMPLATE_BINDING;
			case UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE:
				return UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE;
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
				return UMLPackage.PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
			case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER:
				return UMLPackage.PACKAGE___IS_TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
			case UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
				return UMLPackage.PACKAGE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;
			default:
				return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
			case UMLPackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE:
				return UMLPackage.PACKAGE___IS_TEMPLATE;
			case UMLPackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS:
				return UMLPackage.PACKAGE___PARAMETERABLE_ELEMENTS;
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
		case UMLPackage.PACKAGE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.PACKAGE___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.PACKAGE___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.PACKAGE___DESTROY:
			destroy();
			return null;
		case UMLPackage.PACKAGE___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.PACKAGE___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.PACKAGE___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.PACKAGE___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.PACKAGE___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.PACKAGE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.PACKAGE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.PACKAGE___GET_MODEL:
			return getModel();
		case UMLPackage.PACKAGE___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.PACKAGE___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.PACKAGE___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.PACKAGE___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.PACKAGE___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.PACKAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.PACKAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.PACKAGE___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.PACKAGE___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.PACKAGE___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.PACKAGE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.PACKAGE___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.PACKAGE___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.PACKAGE___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.PACKAGE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.PACKAGE___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.PACKAGE___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.PACKAGE___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.PACKAGE___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.PACKAGE___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.PACKAGE___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.PACKAGE___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.PACKAGE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.PACKAGE___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.PACKAGE___GET_LABEL:
			return getLabel();
		case UMLPackage.PACKAGE___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.PACKAGE___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.PACKAGE___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.PACKAGE___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.PACKAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.PACKAGE___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.PACKAGE___SEPARATOR:
			return separator();
		case UMLPackage.PACKAGE___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.PACKAGE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
			return validateMembersDistinguishable((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP:
			return validateCannotImportOwnedMembers((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND:
			return createElementImport((PackageableElement) arguments.get(0), (VisibilityKind) arguments.get(1));
		case UMLPackage.PACKAGE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND:
			return createPackageImport((org.eclipse.uml2.uml.Package) arguments.get(0),
					(VisibilityKind) arguments.get(1));
		case UMLPackage.PACKAGE___GET_IMPORTED_ELEMENTS:
			return getImportedElements();
		case UMLPackage.PACKAGE___GET_IMPORTED_PACKAGES:
			return getImportedPackages();
		case UMLPackage.PACKAGE___GET_OWNED_MEMBERS:
			return getOwnedMembers();
		case UMLPackage.PACKAGE___EXCLUDE_COLLISIONS__ELIST:
			return excludeCollisions((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.PACKAGE___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
			return getNamesOfMember((NamedElement) arguments.get(0));
		case UMLPackage.PACKAGE___IMPORT_MEMBERS__ELIST:
			return importMembers((EList<PackageableElement>) arguments.get(0));
		case UMLPackage.PACKAGE___GET_IMPORTED_MEMBERS:
			return getImportedMembers();
		case UMLPackage.PACKAGE___MEMBERS_ARE_DISTINGUISHABLE:
			return membersAreDistinguishable();
		case UMLPackage.PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.PACKAGE___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.PACKAGE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
			return validateNamespaceNeedsVisibility((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___IS_TEMPLATE:
			return isTemplate();
		case UMLPackage.PACKAGE___PARAMETERABLE_ELEMENTS:
			return parameterableElements();
		case UMLPackage.PACKAGE___VALIDATE_ELEMENTS_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP:
			return validateElementsPublicOrPrivate((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.PACKAGE___APPLY_PROFILE__PROFILE:
			return applyProfile((Profile) arguments.get(0));
		case UMLPackage.PACKAGE___CREATE_OWNED_CLASS__STRING_BOOLEAN:
			return createOwnedClass((String) arguments.get(0), (Boolean) arguments.get(1));
		case UMLPackage.PACKAGE___CREATE_OWNED_ENUMERATION__STRING:
			return createOwnedEnumeration((String) arguments.get(0));
		case UMLPackage.PACKAGE___CREATE_OWNED_INTERFACE__STRING:
			return createOwnedInterface((String) arguments.get(0));
		case UMLPackage.PACKAGE___CREATE_OWNED_PRIMITIVE_TYPE__STRING:
			return createOwnedPrimitiveType((String) arguments.get(0));
		case UMLPackage.PACKAGE___CREATE_OWNED_STEREOTYPE__STRING_BOOLEAN:
			return createOwnedStereotype((String) arguments.get(0), (Boolean) arguments.get(1));
		case UMLPackage.PACKAGE___GET_ALL_APPLIED_PROFILES:
			return getAllAppliedProfiles();
		case UMLPackage.PACKAGE___GET_ALL_PROFILE_APPLICATIONS:
			return getAllProfileApplications();
		case UMLPackage.PACKAGE___GET_APPLIED_PROFILE__STRING:
			return getAppliedProfile((String) arguments.get(0));
		case UMLPackage.PACKAGE___GET_APPLIED_PROFILE__STRING_BOOLEAN:
			return getAppliedProfile((String) arguments.get(0), (Boolean) arguments.get(1));
		case UMLPackage.PACKAGE___GET_APPLIED_PROFILES:
			return getAppliedProfiles();
		case UMLPackage.PACKAGE___GET_PROFILE_APPLICATION__PROFILE:
			return getProfileApplication((Profile) arguments.get(0));
		case UMLPackage.PACKAGE___GET_PROFILE_APPLICATION__PROFILE_BOOLEAN:
			return getProfileApplication((Profile) arguments.get(0), (Boolean) arguments.get(1));
		case UMLPackage.PACKAGE___IS_MODEL_LIBRARY:
			return isModelLibrary();
		case UMLPackage.PACKAGE___IS_PROFILE_APPLIED__PROFILE:
			return isProfileApplied((Profile) arguments.get(0));
		case UMLPackage.PACKAGE___UNAPPLY_PROFILE__PROFILE:
			return unapplyProfile((Profile) arguments.get(0));
		case UMLPackage.PACKAGE___APPLY_PROFILES__ELIST:
			return applyProfiles((EList<Profile>) arguments.get(0));
		case UMLPackage.PACKAGE___ALL_APPLICABLE_STEREOTYPES:
			return allApplicableStereotypes();
		case UMLPackage.PACKAGE___CONTAINING_PROFILE:
			return containingProfile();
		case UMLPackage.PACKAGE___MAKES_VISIBLE__NAMEDELEMENT:
			return makesVisible((NamedElement) arguments.get(0));
		case UMLPackage.PACKAGE___GET_NESTED_PACKAGES:
			return getNestedPackages();
		case UMLPackage.PACKAGE___GET_OWNED_STEREOTYPES:
			return getOwnedStereotypes();
		case UMLPackage.PACKAGE___GET_OWNED_TYPES:
			return getOwnedTypes();
		case UMLPackage.PACKAGE___VISIBLE_MEMBERS:
			return visibleMembers();
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
		return super.isSetOwner() || eIsSet(UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElements() {
		return super.isSetOwnedElements() || eIsSet(UMLPackage.PACKAGE__TEMPLATE_BINDING)
				|| eIsSet(UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE) || eIsSet(UMLPackage.PACKAGE__PACKAGE_MERGE)
				|| eIsSet(UMLPackage.PACKAGE__PROFILE_APPLICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace() || eIsSet(UMLPackage.PACKAGE__NESTING_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers() || eIsSet(UMLPackage.PACKAGE__PACKAGED_ELEMENT);
	}

} //PackageImpl
