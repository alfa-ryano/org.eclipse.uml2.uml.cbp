/**
 */
package UML.impl;

import UML.Attribute;
import UML.Generalization;
import UML.Operation;
import UML.TemplateBinding;
import UML.UMLPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UML.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link UML.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link UML.impl.ClassImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link UML.impl.ClassImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link UML.impl.ClassImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends PackageImpl implements UML.Class {
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
	@SuppressWarnings("unchecked")
	public EList<Attribute> getOwnedAttribute() {
		return (EList<Attribute>)eGet(UMLPackage.Literals.CLASS__OWNED_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Operation> getOwnedOperation() {
		return (EList<Operation>)eGet(UMLPackage.Literals.CLASS__OWNED_OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generalization> getGeneralization() {
		return (EList<Generalization>)eGet(UMLPackage.Literals.CLASS__GENERALIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TemplateBinding> getTemplateBinding() {
		return (EList<TemplateBinding>)eGet(UMLPackage.Literals.CLASS__TEMPLATE_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UML.Class> getNestedClassifier() {
		return (EList<UML.Class>)eGet(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER, true);
	}

} //ClassImpl
