/**
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateHasOwner(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Has Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#validateNotOwnSelf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Not Own Self</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#addKeyword(java.lang.String) <em>Add Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#applyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Apply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#createEAnnotation(java.lang.String) <em>Create EAnnotation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#destroy() <em>Destroy</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getKeywords() <em>Get Keywords</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotype(java.lang.String) <em>Get Applicable Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getApplicableStereotypes() <em>Get Applicable Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotype(java.lang.String) <em>Get Applied Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedStereotypes() <em>Get Applied Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotype(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Applied Substereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(org.eclipse.uml2.uml.Stereotype) <em>Get Applied Substereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getModel() <em>Get Model</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getNearestPackage() <em>Get Nearest Package</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRelationships() <em>Get Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRelationships(org.eclipse.emf.ecore.EClass) <em>Get Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotype(java.lang.String) <em>Get Required Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getRequiredStereotypes() <em>Get Required Stereotypes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getSourceDirectedRelationships() <em>Get Source Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getSourceDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Source Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplication(org.eclipse.uml2.uml.Stereotype) <em>Get Stereotype Application</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getStereotypeApplications() <em>Get Stereotype Applications</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getTargetDirectedRelationships() <em>Get Target Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getTargetDirectedRelationships(org.eclipse.emf.ecore.EClass) <em>Get Target Directed Relationships</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#getValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Get Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasKeyword(java.lang.String) <em>Has Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#hasValue(org.eclipse.uml2.uml.Stereotype, java.lang.String) <em>Has Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplicable(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applicable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeApplied(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Applied</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#isStereotypeRequired(org.eclipse.uml2.uml.Stereotype) <em>Is Stereotype Required</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#removeKeyword(java.lang.String) <em>Remove Keyword</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#setValue(org.eclipse.uml2.uml.Stereotype, java.lang.String, java.lang.Object) <em>Set Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#unapplyStereotype(org.eclipse.uml2.uml.Stereotype) <em>Unapply Stereotype</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#allOwnedElements() <em>All Owned Elements</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Element#mustBeOwned() <em>Must Be Owned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements that must be owned must have an owner.
	 * mustBeOwned() implies owner->notEmpty()
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHasOwner(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ELEMENT__HAS_OWNER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateHasOwner", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(element, context) }),
						new Object[] { element }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element may not directly or indirectly own itself.
	 * not allOwnedElements()->includes(self)
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNotOwnSelf(Element element, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.ELEMENT__NOT_OWN_SELF,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateNotOwnSelf", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(element, context) }),
						new Object[] { element }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds the specified keyword to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param keyword The keyword to add.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean addKeyword(Element element, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the specified stereotype to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype to apply.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EObject applyStereotype(Element element, Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an annotation with the specified source and this element as its model element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param source The source for the new annotation.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EAnnotation createEAnnotation(Element element, String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Destroys this element by removing all cross references to/from it and removing it from its containing resource or object.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static void destroy(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the keywords for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<String> getKeywords(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype with the specified qualified name that is applicable to this element, or null if no such stereotype is applicable.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param qualifiedName The qualified name of the applicable stereotype to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Stereotype getApplicableStereotype(Element element, String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotypes that are applicable to this element, including those that are required and/or may already be applied.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Stereotype> getApplicableStereotypes(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype with the specified qualified name that is applied to this element, or null if no such stereotype is  applied.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param qualifiedName The qualified name of the applied stereotype to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Stereotype getAppliedStereotype(Element element, String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotypes that are applied to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Stereotype> getAppliedStereotypes(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the substereotype of the specified stereotype with the specified qualified name that is applied to this element, or null if no such stereotype is applied.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The superstereotype of the applied substereotype to retrieve.
	 * @param qualifiedName The qualified name of the applied substereotype to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Stereotype getAppliedSubstereotype(Element element, Stereotype stereotype, String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the substereotypes of the specified stereotype that are applied to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The superstereotype of the applied substereotypes to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Stereotype> getAppliedSubstereotypes(Element element, Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the model that owns (either directly or indirectly) this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Model getModel(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the nearest package that owns (either directly or indirectly) this element, or the element itself (if it is a package).
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static org.eclipse.uml2.uml.Package getNearestPackage(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the relationships in which this element is involved.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Relationship> getRelationships(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the relationships of the specified type in which this element is involved.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param eClass The (meta)type of the relationships to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Relationship> getRelationships(Element element, EClass eClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype with the specified qualified name that is required for this element, or null if no such stereotype is required.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param qualifiedName The qualified name of the required stereotype to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Stereotype getRequiredStereotype(Element element, String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotypes that are required for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Stereotype> getRequiredStereotypes(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the directed relationships for which this element is a source.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<DirectedRelationship> getSourceDirectedRelationships(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the directed relationships of the specified type for which this element is a source.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param eClass The (meta)type of the directed relationships to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<DirectedRelationship> getSourceDirectedRelationships(Element element, EClass eClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the application of the specified stereotype for this element, or null if no such stereotype application exists.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype for which to retrieve an application.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EObject getStereotypeApplication(Element element, Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the stereotype applications for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<EObject> getStereotypeApplications(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the directed relationships for which this element is a target.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<DirectedRelationship> getTargetDirectedRelationships(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the directed relationships of the specified type for which this element is a target.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param eClass The (meta)type of the directed relationships to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<DirectedRelationship> getTargetDirectedRelationships(Element element, EClass eClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the value of the property with the specified name in the specified stereotype for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype for which to retrieve the value.
	 * @param propertyName The name of the property whose value to retrieve.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Object getValue(Element element, Stereotype stereotype, String propertyName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this element has the specified keyword.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param keyword The keyword in question.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasKeyword(Element element, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether this element has a (non-default) value for the property with the specified name in the specified stereotype.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype for which to test the property.
	 * @param propertyName The name of the property in question.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasValue(Element element, Stereotype stereotype, String propertyName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified stereotype is applicable to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype in question.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isStereotypeApplicable(Element element, Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified stereotype is applied to this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype in question.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isStereotypeApplied(Element element, Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether the specified stereotype is required for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype in question.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isStereotypeRequired(Element element, Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes the specified keyword from this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param keyword The keyword to remove.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean removeKeyword(Element element, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the value of the property with the specified name in the specified stereotype for this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype for which to set the value.
	 * @param propertyName The name of the property whose value to set.
	 * @param newValue The new value for the property.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static void setValue(Element element, Stereotype stereotype, String propertyName, Object newValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unapplies the specified stereotype from this element.
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * @param stereotype The stereotype to unapply.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EObject unapplyStereotype(Element element, Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwnedElements() gives all of the direct and indirect ownedElements of an Element.
	 * result = (ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))->asSet())
	 * <p>From package UML::CommonStructure.</p>
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Element> allOwnedElements(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether Elements of this type must have an owner. Subclasses of Element that do not require an owner must override this operation.
	 * result = (true)
	 * <p>From package UML::CommonStructure.</p>
	 * @param element The receiving '<em><b>Element</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean mustBeOwned(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ElementOperations