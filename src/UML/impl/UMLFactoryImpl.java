/**
 */
package UML.impl;

import UML.Association;
import UML.Attribute;
import UML.Enumeration;
import UML.EnumerationLiteral;
import UML.Generalization;
import UML.Interface;
import UML.LiteralInteger;
import UML.LiteralUnlimitedNatural;
import UML.Model;
import UML.Operation;
import UML.Parameter;
import UML.PrimitiveType;
import UML.Property;
import UML.TemplateBinding;
import UML.TemplateParameterSubstitution;
import UML.TypedElement;
import UML.UMLFactory;
import UML.UMLPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLFactoryImpl extends EFactoryImpl implements UMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLFactory init() {
		try {
			UMLFactory theUMLFactory = (UMLFactory)EPackage.Registry.INSTANCE.getEFactory(UMLPackage.eNS_URI);
			if (theUMLFactory != null) {
				return theUMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UMLPackage.PACKAGE: return (EObject)createPackage();
			case UMLPackage.MODEL: return (EObject)createModel();
			case UMLPackage.TYPED_ELEMENT: return (EObject)createTypedElement();
			case UMLPackage.PRIMITIVE_TYPE: return (EObject)createPrimitiveType();
			case UMLPackage.LITERAL_INTEGER: return (EObject)createLiteralInteger();
			case UMLPackage.LITERAL_UNLIMITED_NATURAL: return (EObject)createLiteralUnlimitedNatural();
			case UMLPackage.ATTRIBUTE: return (EObject)createAttribute();
			case UMLPackage.PROPERTY: return (EObject)createProperty();
			case UMLPackage.PARAMETER: return (EObject)createParameter();
			case UMLPackage.OPERATION: return (EObject)createOperation();
			case UMLPackage.CLASS: return (EObject)createClass();
			case UMLPackage.INTERFACE: return (EObject)createInterface();
			case UMLPackage.ENUMERATION_LITERAL: return (EObject)createEnumerationLiteral();
			case UMLPackage.ENUMERATION: return (EObject)createEnumeration();
			case UMLPackage.GENERALIZATION: return (EObject)createGeneralization();
			case UMLPackage.ASSOCIATION: return (EObject)createAssociation();
			case UMLPackage.TEMPLATE_PARAMETER_SUBSTITUTION: return (EObject)createTemplateParameterSubstitution();
			case UMLPackage.TEMPLATE_BINDING: return (EObject)createTemplateBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralInteger createLiteralInteger() {
		LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
		return literalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralUnlimitedNatural createLiteralUnlimitedNatural() {
		LiteralUnlimitedNaturalImpl literalUnlimitedNatural = new LiteralUnlimitedNaturalImpl();
		return literalUnlimitedNatural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameterSubstitution createTemplateParameterSubstitution() {
		TemplateParameterSubstitutionImpl templateParameterSubstitution = new TemplateParameterSubstitutionImpl();
		return templateParameterSubstitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding createTemplateBinding() {
		TemplateBindingImpl templateBinding = new TemplateBindingImpl();
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLPackage getUMLPackage() {
		return (UMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLPackage getPackage() {
		return UMLPackage.eINSTANCE;
	}

} //UMLFactoryImpl
