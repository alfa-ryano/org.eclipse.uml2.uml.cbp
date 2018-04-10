/**
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Classifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#conformsTo(org.eclipse.uml2.uml.Type) <em>Conforms To</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isTemplate() <em>Is Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateSpecializeType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateMapsToGeneralizationSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maps To Generalization Set</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateNonFinalParents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Final Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#validateNoCyclesInGeneralization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate No Cycles In Generalization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllAttributes() <em>Get All Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllOperations() <em>Get All Operations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getAllUsedInterfaces() <em>Get All Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Get Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperation(java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Get Operation</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getOperations() <em>Get Operations</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getUsedInterfaces() <em>Get Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allFeatures() <em>All Features</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allParents() <em>All Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getGenerals() <em>Get Generals</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#hasVisibilityOf(org.eclipse.uml2.uml.NamedElement) <em>Has Visibility Of</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#inheritableMembers(org.eclipse.uml2.uml.Classifier) <em>Inheritable Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#getInheritedMembers() <em>Get Inherited Members</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#maySpecializeType(org.eclipse.uml2.uml.Classifier) <em>May Specialize Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#parents() <em>Parents</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#directlyRealizedInterfaces() <em>Directly Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#directlyUsedInterfaces() <em>Directly Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allRealizedInterfaces() <em>All Realized Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allUsedInterfaces() <em>All Used Interfaces</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#isSubstitutableFor(org.eclipse.uml2.uml.Classifier) <em>Is Substitutable For</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allAttributes() <em>All Attributes</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Classifier#allSlottableFeatures() <em>All Slottable Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierOperations extends NamespaceOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a Classifier that defines a type that conforms to another. This is used, for example, in the specification of signature conformance for operations.
	 * result = (if other.oclIsKindOf(Classifier) then
	 *   let otherClassifier : Classifier = other.oclAsType(Classifier) in
	 *     self = otherClassifier or allParents()->includes(otherClassifier)
	 * else
	 *   false
	 * endif)
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean conformsTo(Classifier classifier, Type other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this Classifier is actually a template.
	 * result = (ownedTemplateSignature <> null or general->exists(g | g.isTemplate()))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isTemplate(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Classifier may only specialize Classifiers of a valid type.
	 * parents()->forAll(c | self.maySpecializeType(c))
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSpecializeType(Classifier classifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CLASSIFIER__SPECIALIZE_TYPE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateSpecializeType", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier,
												context) }),
						new Object[] { classifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general Classifier in any of the Generalization relationships defined for that GeneralizationSet. In other words, a power type may not be an instance of itself nor may its instances also be its subclasses.
	 * powertypeExtent->forAll( gs | 
	 *   gs.generalization->forAll( gen | 
	 *     not (gen.general = self) and not gen.general.allParents()->includes(self) and not (gen.specific = self) and not self.allParents()->includes(gen.specific) 
	 *   ))
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMapsToGeneralizationSet(Classifier classifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CLASSIFIER__MAPS_TO_GENERALIZATION_SET,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateMapsToGeneralizationSet", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier,
												context) }),
						new Object[] { classifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parents of a Classifier must be non-final.
	 * parents()->forAll(not isFinalSpecialization)
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNonFinalParents(Classifier classifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CLASSIFIER__NON_FINAL_PARENTS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateNonFinalParents", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier,
												context) }),
						new Object[] { classifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A Classifier can not be both a transitively general and transitively specific Classifier of the same Classifier.
	 * not allParents()->includes(self)
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateNoCyclesInGeneralization(Classifier classifier, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateNoCyclesInGeneralization", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(classifier,
												context) }),
						new Object[] { classifier }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the attributes of this classifier, including those inherited from its parents.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Property> getAllAttributes(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the operations of this classifier, including those inherited from its parents.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Operation> getAllOperations(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the interfaces on which this classifier or any of its parents has a usage dependency.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Interface> getAllUsedInterfaces(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Operation getOperation(Classifier classifier, String name, EList<String> parameterNames,
			EList<Type> parameterTypes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier, ignoring case if indicated.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * @param ignoreCase Whether to ignore case in String comparisons.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Operation getOperation(Classifier classifier, String name, EList<String> parameterNames,
			EList<Type> parameterTypes, boolean ignoreCase) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the operations of this classifier.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Operation> getOperations(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the interfaces on which this classifier has a usage dependency.
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Interface> getUsedInterfaces(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allFeatures() gives all of the Features in the namespace of the Classifier. In general, through mechanisms such as inheritance, this will be a larger set than feature.
	 * result = (member->select(oclIsKindOf(Feature))->collect(oclAsType(Feature))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Feature> allFeatures(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized Classifier.
	 * result = (parents()->union(parents()->collect(allParents())->asSet()))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Classifier> allParents(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general Classifiers are the ones referenced by the Generalization relationships.
	 * result = (parents())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Classifier> getGenerals(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query hasVisibilityOf() determines whether a NamedElement is visible in the classifier. Non-private members are visible. It is only called when the argument is something owned by a parent.
	 * allParents()->including(self)->collect(member)->includes(n)
	 * result = (n.visibility <> VisibilityKind::private)
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean hasVisibilityOf(Classifier classifier, NamedElement n) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inherit() defines how to inherit a set of elements passed as its argument.  It excludes redefined elements from the result.
	 * result = (inhs->reject(inh |
	 *   inh.oclIsKindOf(RedefinableElement) and
	 *   ownedMember->select(oclIsKindOf(RedefinableElement))->
	 *     select(redefinedElement->includes(inh.oclAsType(RedefinableElement)))
	 *        ->notEmpty()))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<NamedElement> inherit(Classifier classifier, EList<NamedElement> inhs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inheritableMembers() gives all of the members of a Classifier that may be inherited in one of its descendants, subject to whatever visibility restrictions apply.
	 * c.allParents()->includes(self)
	 * result = (member->select(m | c.hasVisibilityOf(m)))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<NamedElement> inheritableMembers(Classifier classifier, Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inheritedMember association is derived by inheriting the inheritable members of the parents.
	 * result = (inherit(parents()->collect(inheritableMembers(self))->asSet()))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<NamedElement> getInheritedMembers(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * result = (self.oclIsKindOf(c.oclType()))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean maySpecializeType(Classifier classifier, Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier.
	 * result = (generalization.general->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Classifier> parents(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces directly realized by this Classifier
	 * result = ((clientDependency->
	 *   select(oclIsKindOf(Realization) and supplier->forAll(oclIsKindOf(Interface))))->
	 *       collect(supplier.oclAsType(Interface))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Interface> directlyRealizedInterfaces(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces directly used by this Classifier
	 * result = ((supplierDependency->
	 *   select(oclIsKindOf(Usage) and client->forAll(oclIsKindOf(Interface))))->
	 *     collect(client.oclAsType(Interface))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Interface> directlyUsedInterfaces(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces realized by this Classifier and all of its generalizations
	 * result = (directlyRealizedInterfaces()->union(self.allParents()->collect(directlyRealizedInterfaces()))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Interface> allRealizedInterfaces(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces used by this Classifier and all of its generalizations
	 * result = (directlyUsedInterfaces()->union(self.allParents()->collect(directlyUsedInterfaces()))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Interface> allUsedInterfaces(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * result = (substitution.contract->includes(contract))
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isSubstitutableFor(Classifier classifier, Classifier contract) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allAttributes gives an ordered set of all owned and inherited attributes of the Classifier. All owned attributes appear before any inherited attributes, and the attributes inherited from any more specific parent Classifier appear before those of any more general parent Classifier. However, if the Classifier has multiple immediate parents, then the relative ordering of the sets of attributes from those parents is not defined.
	 * result = (attribute->asSequence()->union(parents()->asSequence().allAttributes())->select(p | member->includes(p))->asOrderedSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Property> allAttributes(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All StructuralFeatures related to the Classifier that may have Slots, including direct attributes, inherited attributes, private attributes in generalizations, and memberEnds of Associations, but excluding redefined StructuralFeatures.
	 * result = (member->select(oclIsKindOf(StructuralFeature))->
	 *   collect(oclAsType(StructuralFeature))->
	 *    union(self.inherit(self.allParents()->collect(p | p.attribute)->asSet())->
	 *      collect(oclAsType(StructuralFeature)))->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param classifier The receiving '<em><b>Classifier</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<StructuralFeature> allSlottableFeatures(Classifier classifier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ClassifierOperations