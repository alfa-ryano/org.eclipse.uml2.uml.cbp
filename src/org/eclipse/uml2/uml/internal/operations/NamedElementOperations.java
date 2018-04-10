/**
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Usage;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Named Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateVisibilityNeedsOwnership(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visibility Needs Ownership</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateHasQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#validateHasNoQualifiedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has No Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#createDependency(org.eclipse.uml2.uml.NamedElement) <em>Create Dependency</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#createUsage(org.eclipse.uml2.uml.NamedElement) <em>Create Usage</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getLabel() <em>Get Label</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getLabel(boolean) <em>Get Label</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Get Namespace</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#allNamespaces() <em>All Namespaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#allOwningPackages() <em>All Owning Packages</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#isDistinguishableFrom(org.eclipse.uml2.uml.NamedElement, org.eclipse.uml2.uml.Namespace) <em>Is Distinguishable From</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getQualifiedName() <em>Get Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#separator() <em>Separator</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.NamedElement#getClientDependencies() <em>Get Client Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedElementOperations extends ElementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a NamedElement is owned by something other than a Namespace, it does not have a visibility. One that is not owned by anything (and hence must be a Package, as this is the only kind of NamedElement that overrides mustBeOwned()) may have a visibility.
	 * (namespace = null and owner <> null) implies visibility = null
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVisibilityNeedsOwnership(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateVisibilityNeedsOwnership", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(namedElement,
												context) }),
						new Object[] { namedElement }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing Namespaces have a name, the qualifiedName is constructed from the name of the NamedElement and the names of the containing Namespaces.
	 * (name <> null and allNamespaces()->select(ns | ns.name = null)->isEmpty()) implies
	 *   qualifiedName = allNamespaces()->iterate( ns : Namespace; agg: String = name | ns.name.concat(self.separator()).concat(agg))
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasQualifiedName(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.NAMED_ELEMENT__HAS_QUALIFIED_NAME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateHasQualifiedName", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(namedElement,
												context) }),
						new Object[] { namedElement }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If there is no name, or one of the containing Namespaces has no name, there is no qualifiedName.
	 * name=null or allNamespaces()->select( ns | ns.name=null )->notEmpty() implies qualifiedName = null
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasNoQualifiedName(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateHasNoQualifiedName", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(namedElement,
												context) }),
						new Object[] { namedElement }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a dependency between this named element and the specified supplier, owned by this named element's nearest package.
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param supplier The supplier for the new dependency.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Dependency createDependency(NamedElement namedElement, NamedElement supplier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a usage between this named element and the specified supplier, owned by this named element's nearest package.
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param supplier The supplier for the new usage.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Usage createUsage(NamedElement namedElement, NamedElement supplier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves a localized label for this named element.
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static String getLabel(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves a label for this named element, localized if indicated.
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * @param localize Whether to localize the label.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static String getLabel(NamedElement namedElement, boolean localize) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Namespace getNamespace(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allNamespaces() gives the sequence of Namespaces in which the NamedElement is nested, working outwards.
	 * result = (
	 * if owner = null
	 *   then OrderedSet{}
	 * else
	 *   let enclosingNamespace : Namespace =
	 *     if owner.oclIsKindOf(TemplateParameter) and owner.oclAsType(TemplateParameter).signature.template.oclIsKindOf(Namespace)
	 *       then owner.oclAsType(TemplateParameter).signature.template.oclAsType(Namespace)
	 *     else
	 *       namespace
	 *     endif
	 *   in enclosingNamespace.allNamespaces()->prepend(enclosingNamespace)
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Namespace> allNamespaces(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwningPackages() returns the set of all the enclosing Namespaces of this NamedElement, working outwards, that are Packages, up to but not including the first such Namespace that is not a Package.
	 * result = (if namespace.oclIsKindOf(Package)
	 * then
	 *   let owningPackage : Package = namespace.oclAsType(Package) in
	 *     owningPackage->union(owningPackage.allOwningPackages())
	 * else
	 *   null
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<org.eclipse.uml2.uml.Package> allOwningPackages(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() determines whether two NamedElements may logically co-exist within a Namespace. By default, two named elements are distinguishable if (a) they have types neither of which is a kind of the other or (b) they have different names.
	 * result = ((self.oclIsKindOf(n.oclType()) or n.oclIsKindOf(self.oclType())) implies
	 *     ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()
	 * )
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isDistinguishableFrom(NamedElement namedElement, NamedElement n, Namespace ns) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a NamedElement has a name, and all of its containing Namespaces have a name, the qualifiedName is constructed from the name of the NamedElement and the names of the containing Namespaces.
	 * result = (if self.name <> null and self.allNamespaces()->select( ns | ns.name=null )->isEmpty()
	 * then 
	 *     self.allNamespaces()->iterate( ns : Namespace; agg: String = self.name | ns.name.concat(self.separator()).concat(agg))
	 * else
	 *    null
	 * endif)
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static String getQualifiedName(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query separator() gives the string that is used to separate names when constructing a qualifiedName.
	 * result = ('::')
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static String separator(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = (Dependency.allInstances()->select(d | d.client->includes(self)))
	 * <p>From package UML::CommonStructure.</p>
	 * @param namedElement The receiving '<em><b>Named Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Dependency> getClientDependencies(NamedElement namedElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // NamedElementOperations