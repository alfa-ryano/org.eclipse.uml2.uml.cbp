/**
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Package</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Package#validateElementsPublicOrPrivate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Elements Public Or Private</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#applyProfile(org.eclipse.uml2.uml.Profile) <em>Apply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedClass(java.lang.String, boolean) <em>Create Owned Class</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedEnumeration(java.lang.String) <em>Create Owned Enumeration</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedInterface(java.lang.String) <em>Create Owned Interface</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedPrimitiveType(java.lang.String) <em>Create Owned Primitive Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#createOwnedStereotype(java.lang.String, boolean) <em>Create Owned Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllAppliedProfiles() <em>Get All Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAllProfileApplications() <em>Get All Profile Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfile(java.lang.String, boolean) <em>Get Applied Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getAppliedProfiles() <em>Get Applied Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getProfileApplication(org.eclipse.uml2.uml.Profile, boolean) <em>Get Profile Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isModelLibrary() <em>Is Model Library</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#isProfileApplied(org.eclipse.uml2.uml.Profile) <em>Is Profile Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#unapplyProfile(org.eclipse.uml2.uml.Profile) <em>Unapply Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#applyProfiles(org.eclipse.emf.common.util.EList) <em>Apply Profiles</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#allApplicableStereotypes() <em>All Applicable Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#containingProfile() <em>Containing Profile</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#makesVisible(org.eclipse.uml2.uml.NamedElement) <em>Makes Visible</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getNestedPackages() <em>Get Nested Packages</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getOwnedStereotypes() <em>Get Owned Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#getOwnedTypes() <em>Get Owned Types</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#visibleMembers() <em>Visible Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Package#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageOperations extends NamespaceOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an element that is owned by a package has visibility, it is public or private.
	 * packagedElement->forAll(e | e.visibility<> null implies e.visibility = VisibilityKind::public or e.visibility = VisibilityKind::private)
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateElementsPublicOrPrivate(org.eclipse.uml2.uml.Package package_,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateElementsPublicOrPrivate", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(package_,
												context) }),
						new Object[] { package_ }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the current definition of the specified profile to this package and automatically applies required stereotypes in the profile to elements within this package's namespace hieararchy. If a different definition is already applied, automatically migrates any associated stereotype values on a "best effort" basis (matching classifiers and structural features by name).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile to apply.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<EObject> applyProfile(org.eclipse.uml2.uml.Package package_, Profile profile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) class with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new class, or null.
	 * @param isAbstract Whether the new class should be abstract.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static org.eclipse.uml2.uml.Class createOwnedClass(org.eclipse.uml2.uml.Package package_, String name,
			boolean isAbstract) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a enumeration with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new enumeration, or null.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Enumeration createOwnedEnumeration(org.eclipse.uml2.uml.Package package_, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an interface with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new interface, or null.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Interface createOwnedInterface(org.eclipse.uml2.uml.Package package_, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a primitive type with the specified name as an owned type of this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new primitive type, or null.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static PrimitiveType createOwnedPrimitiveType(org.eclipse.uml2.uml.Package package_, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a(n) (abstract) stereotype with the specified name as an owned stereotype of this profile.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param name The name for the new stereotype, or null.
	 * @param isAbstract Whether the new stereotype should be abstract.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Stereotype createOwnedStereotype(org.eclipse.uml2.uml.Package package_, String name,
			boolean isAbstract) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profiles that are applied to this package, including profiles applied to its nesting package(s).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Profile> getAllAppliedProfiles(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the profile applications for this package, including profile applications for its nesting package(s).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<ProfileApplication> getAllProfileApplications(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package, or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Profile getAppliedProfile(org.eclipse.uml2.uml.Package package_, String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profile with the specified qualified name that is applied to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param qualifiedName The qualified name of the applied profile to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Profile getAppliedProfile(org.eclipse.uml2.uml.Package package_, String qualifiedName,
			boolean recurse) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the profiles that are applied to this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Profile> getAppliedProfiles(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package, or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile whose application to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProfileApplication getProfileApplication(org.eclipse.uml2.uml.Package package_, Profile profile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified profile to this package or any of its nesting packages (if indicated), or null if no such profile is applied.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile whose application to retrieve.
	 * @param recurse Whether to look in nesting packages.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProfileApplication getProfileApplication(org.eclipse.uml2.uml.Package package_, Profile profile,
			boolean recurse) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this package is a model library.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isModelLibrary(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified profile is applied to this package.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile in question.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isProfileApplied(org.eclipse.uml2.uml.Package package_, Profile profile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unapplies the specified profile from this package and automatically unapplies stereotypes in the profile from elements within this package's namespace hieararchy.
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profile The profile to unapply.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<EObject> unapplyProfile(org.eclipse.uml2.uml.Package package_, Profile profile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the current definitions of the specified profiles to this package and automatically applies required stereotypes in the profiles to elements within this package's namespace hieararchy. If different definitions are already applied, automatically migrates any associated stereotype values on a "best effort" basis (matching classifiers and structural features by name).
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * @param profiles The profiles to apply.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<EObject> applyProfiles(org.eclipse.uml2.uml.Package package_, EList<Profile> profiles) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allApplicableStereotypes() returns all the directly or indirectly owned stereotypes, including stereotypes contained in sub-profiles.
	 * result = (let ownedPackages : Bag(Package) = ownedMember->select(oclIsKindOf(Package))->collect(oclAsType(Package)) in
	 *  ownedStereotype->union(ownedPackages.allApplicableStereotypes())->flatten()->asSet()
	 * )
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Stereotype> allApplicableStereotypes(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile() returns the closest profile directly or indirectly containing this package (or this package itself, if it is a profile).
	 * result = (if self.oclIsKindOf(Profile) then 
	 * 	self.oclAsType(Profile)
	 * else
	 * 	self.namespace.oclAsType(Package).containingProfile()
	 * endif)
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Profile containingProfile(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query makesVisible() defines whether a Package makes an element visible outside itself. Elements with no visibility and elements with public visibility are made visible.
	 * member->includes(el)
	 * result = (ownedMember->includes(el) or
	 * (elementImport->select(ei|ei.importedElement = VisibilityKind::public)->collect(importedElement.oclAsType(NamedElement))->includes(el)) or
	 * (packageImport->select(visibility = VisibilityKind::public)->collect(importedPackage.member->includes(el))->notEmpty()))
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean makesVisible(org.eclipse.uml2.uml.Package package_, NamedElement el) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Package::/nestedPackage
	 * result = (packagedElement->select(oclIsKindOf(Package))->collect(oclAsType(Package))->asSet())
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<org.eclipse.uml2.uml.Package> getNestedPackages(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Package::/ownedStereotype
	 * result = (packagedElement->select(oclIsKindOf(Stereotype))->collect(oclAsType(Stereotype))->asSet())
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Stereotype> getOwnedStereotypes(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derivation for Package::/ownedType
	 * result = (packagedElement->select(oclIsKindOf(Type))->collect(oclAsType(Type))->asSet())
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Type> getOwnedTypes(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query visibleMembers() defines which members of a Package can be accessed outside it.
	 * result = (member->select( m | m.oclIsKindOf(PackageableElement) and self.makesVisible(m))->collect(oclAsType(PackageableElement))->asSet())
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<PackageableElement> visibleMembers(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether elements of this type must have an owner.
	 * result = (false)
	 * <p>From package UML::Packages.</p>
	 * @param package_ The receiving '<em><b>Package</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean mustBeOwned(org.eclipse.uml2.uml.Package package_) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // PackageOperations