/**
 */
package org.eclipse.uml2.uml.internal.operations;

import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Value Specification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#booleanValue() <em>Boolean Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#integerValue() <em>Integer Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#isComputable() <em>Is Computable</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#isNull() <em>Is Null</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#realValue() <em>Real Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#stringValue() <em>String Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#unlimitedValue() <em>Unlimited Value</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ValueSpecification#isCompatibleWith(org.eclipse.uml2.uml.ParameterableElement) <em>Is Compatible With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSpecificationOperations extends PackageableElementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query booleanValue() gives a single Boolean value when one can be computed.
	 * result = (null)
	 * <p>From package UML::Values.</p>
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean booleanValue(ValueSpecification valueSpecification) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query integerValue() gives a single Integer value when one can be computed.
	 * result = (null)
	 * <p>From package UML::Values.</p>
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static int integerValue(ValueSpecification valueSpecification) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isComputable() determines whether a value specification can be computed in a model. This operation cannot be fully defined in OCL. A conforming implementation is expected to deliver true for this operation for all ValueSpecifications that it can compute, and to compute all of those for which the operation is true. A conforming implementation is expected to be able to compute at least the value of all LiteralSpecifications.
	 * result = (false)
	 * <p>From package UML::Values.</p>
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isComputable(ValueSpecification valueSpecification) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNull() returns true when it can be computed that the value is null.
	 * result = (false)
	 * <p>From package UML::Values.</p>
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isNull(ValueSpecification valueSpecification) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query realValue() gives a single Real value when one can be computed.
	 * result = (null)
	 * <p>From package UML::Values.</p>
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static double realValue(ValueSpecification valueSpecification) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query stringValue() gives a single String value when one can be computed.
	 * result = (null)
	 * <p>From package UML::Values.</p>
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static String stringValue(ValueSpecification valueSpecification) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query unlimitedValue() gives a single UnlimitedNatural value when one can be computed.
	 * result = (null)
	 * <p>From package UML::Values.</p>
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static int unlimitedValue(ValueSpecification valueSpecification) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isCompatibleWith() determines if this ValueSpecification is compatible with the specified ParameterableElement. This ValueSpecification is compatible with ParameterableElement p if the kind of this ValueSpecification is the same as or a subtype of the kind of p. Further, if p is a TypedElement, then the type of this ValueSpecification must be conformant with the type of p.
	 * result = (self.oclIsKindOf(p.oclType()) and (p.oclIsKindOf(TypedElement) implies 
	 * self.type.conformsTo(p.oclAsType(TypedElement).type)))
	 * <p>From package UML::Values.</p>
	 * @param valueSpecification The receiving '<em><b>Value Specification</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isCompatibleWith(ValueSpecification valueSpecification, ParameterableElement p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // ValueSpecificationOperations