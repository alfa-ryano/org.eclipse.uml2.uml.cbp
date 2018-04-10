/**
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Type;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Operation#validateAtMostOneReturn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate At Most One Return</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#validateOnlyBodyForQuery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Only Body For Query</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getReturnResult() <em>Get Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setIsOrdered(boolean) <em>Set Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setIsUnique(boolean) <em>Set Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setLower(int) <em>Set Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setType(org.eclipse.uml2.uml.Type) <em>Set Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#setUpper(int) <em>Set Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isOrdered() <em>Is Ordered</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isUnique() <em>Is Unique</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getLower() <em>Get Lower</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#returnResult() <em>Return Result</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getType() <em>Get Type</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#getUpper() <em>Get Upper</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Operation#isConsistentWith(org.eclipse.uml2.uml.RedefinableElement) <em>Is Consistent With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationOperations extends BehavioralFeatureOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Operation can have at most one return parameter; i.e., an owned parameter with the direction set to 'return.'
	 * self.ownedParameter->select(direction = ParameterDirectionKind::return)->size() <= 1
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAtMostOneReturn(Operation operation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.OPERATION__AT_MOST_ONE_RETURN,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateAtMostOneReturn", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(operation,
												context) }),
						new Object[] { operation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A bodyCondition can only be specified for a query Operation.
	 * bodyCondition <> null implies isQuery
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOnlyBodyForQuery(Operation operation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.OPERATION__ONLY_BODY_FOR_QUERY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", //$NON-NLS-1$
								new Object[] { "validateOnlyBodyForQuery", //$NON-NLS-1$
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(operation,
												context) }),
						new Object[] { operation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the (only) return result parameter for this operation.
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Parameter getReturnResult(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void setIsOrdered(Operation operation, boolean newIsOrdered) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void setIsUnique(Operation operation, boolean newIsUnique) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void setLower(Operation operation, int newLower) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void setType(Operation operation, Type newType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void setUpper(Operation operation, int newUpper) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, isOrdered equals the value of isOrdered for that parameter. Otherwise isOrdered is false.
	 * result = (if returnResult()->notEmpty() then returnResult()-> exists(isOrdered) else false endif)
	 * <p>From package UML::Classification.</p>
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isOrdered(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, isUnique equals the value of isUnique for that parameter. Otherwise isUnique is true.
	 * result = (if returnResult()->notEmpty() then returnResult()->exists(isUnique) else true endif)
	 * <p>From package UML::Classification.</p>
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isUnique(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, lower equals the value of lower for that parameter. Otherwise lower has no value.
	 * result = (if returnResult()->notEmpty() then returnResult()->any(true).lower else null endif)
	 * <p>From package UML::Classification.</p>
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static int getLower(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query returnResult() returns the set containing the return parameter of the Operation if one exists, otherwise, it returns an empty set
	 * result = (ownedParameter->select (direction = ParameterDirectionKind::return)->asSet())
	 * <p>From package UML::Classification.</p>
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<Parameter> returnResult(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, type equals the value of type for that parameter. Otherwise type has no value.
	 * result = (if returnResult()->notEmpty() then returnResult()->any(true).type else null endif)
	 * <p>From package UML::Classification.</p>
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static Type getType(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this operation has a return parameter, upper equals the value of upper for that parameter. Otherwise upper has no value.
	 * result = (if returnResult()->notEmpty() then returnResult()->any(true).upper else null endif)
	 * <p>From package UML::Classification.</p>
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static int getUpper(Operation operation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isConsistentWith() specifies, for any two Operations in a context in which redefinition is possible, whether redefinition would be consistent. A redefining operation is consistent with a redefined operation if
	 * it has the same number of owned parameters, and for each parameter the following holds:
	 * 
	 * - Direction, ordering and uniqueness are the same.
	 * - The corresponding types are covariant, contravariant or invariant.
	 * - The multiplicities are compatible, depending on the parameter direction.
	 * redefiningElement.isRedefinitionContextValid(self)
	 * result = (redefiningElement.oclIsKindOf(Operation) and
	 * let op : Operation = redefiningElement.oclAsType(Operation) in
	 * 	self.ownedParameter->size() = op.ownedParameter->size() and
	 * 	Sequence{1..self.ownedParameter->size()}->
	 * 		forAll(i |  
	 * 		  let redefiningParam : Parameter = op.ownedParameter->at(i),
	 *                redefinedParam : Parameter = self.ownedParameter->at(i) in
	 *                  (redefiningParam.isUnique = redefinedParam.isUnique) and
	 *                  (redefiningParam.isOrdered = redefinedParam. isOrdered) and
	 *                  (redefiningParam.direction = redefinedParam.direction) and
	 *                  (redefiningParam.type.conformsTo(redefinedParam.type) or
	 *                      redefinedParam.type.conformsTo(redefiningParam.type)) and
	 *                  (redefiningParam.direction = ParameterDirectionKind::inout implies
	 *                          (redefinedParam.compatibleWith(redefiningParam) and
	 *                          redefiningParam.compatibleWith(redefinedParam))) and
	 *                  (redefiningParam.direction = ParameterDirectionKind::_'in' implies
	 *                          redefinedParam.compatibleWith(redefiningParam)) and
	 *                  ((redefiningParam.direction = ParameterDirectionKind::out or
	 *                       redefiningParam.direction = ParameterDirectionKind::return) implies
	 *                          redefiningParam.compatibleWith(redefinedParam))
	 * 		))
	 * <p>From package UML::Classification.</p>
	 * @param operation The receiving '<em><b>Operation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean isConsistentWith(Operation operation, RedefinableElement redefiningElement) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // OperationOperations