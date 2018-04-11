/**
 */
package UML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UML.UMLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UML'"
 * @generated
 */
public interface UMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/uml2/5.0.0/UML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLPackage eINSTANCE = UML.impl.UMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link UML.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.ElementImpl
	 * @see UML.impl.UMLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VISIBILITY = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link UML.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.PackageImpl
	 * @see UML.impl.UMLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VISIBILITY = ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGED_ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link UML.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.ModelImpl
	 * @see UML.impl.UMLPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UML.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.TypedElementImpl
	 * @see UML.impl.UMLPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__VISIBILITY = ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__LOWER_VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__UPPER_VALUE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link UML.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.PrimitiveTypeImpl
	 * @see UML.impl.UMLPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UML.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.LiteralIntegerImpl
	 * @see UML.impl.UMLPackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UML.impl.LiteralUnlimitedNaturalImpl <em>Literal Unlimited Natural</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.LiteralUnlimitedNaturalImpl
	 * @see UML.impl.UMLPackageImpl#getLiteralUnlimitedNatural()
	 * @generated
	 */
	int LITERAL_UNLIMITED_NATURAL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL__VALUE = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Unlimited Natural</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_UNLIMITED_NATURAL_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link UML.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.AttributeImpl
	 * @see UML.impl.UMLPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = TYPED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LOWER_VALUE = TYPED_ELEMENT__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UPPER_VALUE = TYPED_ELEMENT__UPPER_VALUE;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UML.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.PropertyImpl
	 * @see UML.impl.UMLPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = ATTRIBUTE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_VALUE = ATTRIBUTE__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_VALUE = ATTRIBUTE__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_STATIC = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATION = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__QUALIFIER = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNING_ASSOCIATION = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATION_END = ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INTERFACE = ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link UML.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.ParameterImpl
	 * @see UML.impl.UMLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VISIBILITY = TYPED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOWER_VALUE = TYPED_ELEMENT__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UPPER_VALUE = TYPED_ELEMENT__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIRECTION = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link UML.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.OperationImpl
	 * @see UML.impl.UMLPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMETER = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CLASS = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INTERFACE = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link UML.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.ClassImpl
	 * @see UML.impl.UMLPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ATTRIBUTE = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_OPERATION = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERALIZATION = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TEMPLATE_BINDING = PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NESTED_CLASSIFIER = PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link UML.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.InterfaceImpl
	 * @see UML.impl.UMLPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__VISIBILITY = CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PACKAGED_ELEMENT = CLASS__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_ATTRIBUTE = CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OWNED_OPERATION = CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__GENERALIZATION = CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__TEMPLATE_BINDING = CLASS__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NESTED_CLASSIFIER = CLASS__NESTED_CLASSIFIER;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link UML.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.EnumerationLiteralImpl
	 * @see UML.impl.UMLPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__CLASSIFIER = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__ENUMERATION = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link UML.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.EnumerationImpl
	 * @see UML.impl.UMLPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OWNED_LITERAL = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link UML.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.GeneralizationImpl
	 * @see UML.impl.UMLPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__VISIBILITY = ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link UML.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.AssociationImpl
	 * @see UML.impl.UMLPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__VISIBILITY = PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__PACKAGED_ELEMENT = PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBER_END = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_END = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link UML.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.TemplateParameterSubstitutionImpl
	 * @see UML.impl.UMLPackageImpl#getTemplateParameterSubstitution()
	 * @generated
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__VISIBILITY = ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Parameter Substitution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_SUBSTITUTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link UML.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UML.impl.TemplateBindingImpl
	 * @see UML.impl.UMLPackageImpl#getTemplateBinding()
	 * @generated
	 */
	int TEMPLATE_BINDING = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__VISIBILITY = ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameter Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__PARAMETER_SUBSTITUTION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING__BOUND_ELEMENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_BINDING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link UML.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see UML.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link UML.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UML.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link UML.Element#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see UML.Element#getVisibility()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Visibility();

	/**
	 * Returns the meta object for class '{@link UML.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see UML.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference list '{@link UML.Package#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Packaged Element</em>'.
	 * @see UML.Package#getPackagedElement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackagedElement();

	/**
	 * Returns the meta object for class '{@link UML.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see UML.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link UML.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see UML.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link UML.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see UML.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for the containment reference '{@link UML.TypedElement#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Value</em>'.
	 * @see UML.TypedElement#getLowerValue()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_LowerValue();

	/**
	 * Returns the meta object for the containment reference '{@link UML.TypedElement#getUpperValue <em>Upper Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Value</em>'.
	 * @see UML.TypedElement#getUpperValue()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_UpperValue();

	/**
	 * Returns the meta object for class '{@link UML.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see UML.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link UML.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see UML.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for class '{@link UML.LiteralUnlimitedNatural <em>Literal Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Unlimited Natural</em>'.
	 * @see UML.LiteralUnlimitedNatural
	 * @generated
	 */
	EClass getLiteralUnlimitedNatural();

	/**
	 * Returns the meta object for the attribute '{@link UML.LiteralUnlimitedNatural#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see UML.LiteralUnlimitedNatural#getValue()
	 * @see #getLiteralUnlimitedNatural()
	 * @generated
	 */
	EAttribute getLiteralUnlimitedNatural_Value();

	/**
	 * Returns the meta object for class '{@link UML.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see UML.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link UML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see UML.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link UML.Property#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see UML.Property#isIsStatic()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsStatic();

	/**
	 * Returns the meta object for the reference '{@link UML.Property#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see UML.Property#getAssociation()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Association();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.Property#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see UML.Property#getQualifier()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link UML.Property#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Association</em>'.
	 * @see UML.Property#getOwningAssociation()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OwningAssociation();

	/**
	 * Returns the meta object for the reference '{@link UML.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association End</em>'.
	 * @see UML.Property#getAssociationEnd()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_AssociationEnd();

	/**
	 * Returns the meta object for the reference '{@link UML.Property#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see UML.Property#getInterface()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Interface();

	/**
	 * Returns the meta object for class '{@link UML.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see UML.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link UML.Parameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see UML.Parameter#getDirection()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Direction();

	/**
	 * Returns the meta object for class '{@link UML.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see UML.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.Operation#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see UML.Operation#getOwnedParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OwnedParameter();

	/**
	 * Returns the meta object for the reference '{@link UML.Operation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see UML.Operation#getClass_()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Class();

	/**
	 * Returns the meta object for the reference '{@link UML.Operation#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see UML.Operation#getInterface()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Interface();

	/**
	 * Returns the meta object for class '{@link UML.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see UML.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.Class#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see UML.Class#getOwnedAttribute()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.Class#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see UML.Class#getOwnedOperation()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.Class#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalization</em>'.
	 * @see UML.Class#getGeneralization()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Generalization();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.Class#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Binding</em>'.
	 * @see UML.Class#getTemplateBinding()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_TemplateBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.Class#getNestedClassifier <em>Nested Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Classifier</em>'.
	 * @see UML.Class#getNestedClassifier()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_NestedClassifier();

	/**
	 * Returns the meta object for class '{@link UML.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see UML.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link UML.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see UML.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.EnumerationLiteral#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifier</em>'.
	 * @see UML.EnumerationLiteral#getClassifier()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EReference getEnumerationLiteral_Classifier();

	/**
	 * Returns the meta object for the reference '{@link UML.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration</em>'.
	 * @see UML.EnumerationLiteral#getEnumeration()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EReference getEnumerationLiteral_Enumeration();

	/**
	 * Returns the meta object for class '{@link UML.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see UML.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.Enumeration#getOwnedLiteral <em>Owned Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Literal</em>'.
	 * @see UML.Enumeration#getOwnedLiteral()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_OwnedLiteral();

	/**
	 * Returns the meta object for class '{@link UML.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see UML.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link UML.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see UML.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the reference '{@link UML.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specific</em>'.
	 * @see UML.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for class '{@link UML.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see UML.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list '{@link UML.Association#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member End</em>'.
	 * @see UML.Association#getMemberEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_MemberEnd();

	/**
	 * Returns the meta object for the reference list '{@link UML.Association#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned End</em>'.
	 * @see UML.Association#getOwnedEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_OwnedEnd();

	/**
	 * Returns the meta object for class '{@link UML.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter Substitution</em>'.
	 * @see UML.TemplateParameterSubstitution
	 * @generated
	 */
	EClass getTemplateParameterSubstitution();

	/**
	 * Returns the meta object for the containment reference '{@link UML.TemplateParameterSubstitution#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actual</em>'.
	 * @see UML.TemplateParameterSubstitution#getActual()
	 * @see #getTemplateParameterSubstitution()
	 * @generated
	 */
	EReference getTemplateParameterSubstitution_Actual();

	/**
	 * Returns the meta object for the reference '{@link UML.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template Binding</em>'.
	 * @see UML.TemplateParameterSubstitution#getTemplateBinding()
	 * @see #getTemplateParameterSubstitution()
	 * @generated
	 */
	EReference getTemplateParameterSubstitution_TemplateBinding();

	/**
	 * Returns the meta object for class '{@link UML.TemplateBinding <em>Template Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Binding</em>'.
	 * @see UML.TemplateBinding
	 * @generated
	 */
	EClass getTemplateBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link UML.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Substitution</em>'.
	 * @see UML.TemplateBinding#getParameterSubstitution()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_ParameterSubstitution();

	/**
	 * Returns the meta object for the reference '{@link UML.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bound Element</em>'.
	 * @see UML.TemplateBinding#getBoundElement()
	 * @see #getTemplateBinding()
	 * @generated
	 */
	EReference getTemplateBinding_BoundElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLFactory getUMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UML.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.ElementImpl
		 * @see UML.impl.UMLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VISIBILITY = eINSTANCE.getElement_Visibility();

		/**
		 * The meta object literal for the '{@link UML.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.PackageImpl
		 * @see UML.impl.UMLPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGED_ELEMENT = eINSTANCE.getPackage_PackagedElement();

		/**
		 * The meta object literal for the '{@link UML.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.ModelImpl
		 * @see UML.impl.UMLPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link UML.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.TypedElementImpl
		 * @see UML.impl.UMLPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '<em><b>Lower Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__LOWER_VALUE = eINSTANCE.getTypedElement_LowerValue();

		/**
		 * The meta object literal for the '<em><b>Upper Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__UPPER_VALUE = eINSTANCE.getTypedElement_UpperValue();

		/**
		 * The meta object literal for the '{@link UML.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.PrimitiveTypeImpl
		 * @see UML.impl.UMLPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link UML.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.LiteralIntegerImpl
		 * @see UML.impl.UMLPackageImpl#getLiteralInteger()
		 * @generated
		 */
		EClass LITERAL_INTEGER = eINSTANCE.getLiteralInteger();

		/**
		 * The meta object literal for the '{@link UML.impl.LiteralUnlimitedNaturalImpl <em>Literal Unlimited Natural</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.LiteralUnlimitedNaturalImpl
		 * @see UML.impl.UMLPackageImpl#getLiteralUnlimitedNatural()
		 * @generated
		 */
		EClass LITERAL_UNLIMITED_NATURAL = eINSTANCE.getLiteralUnlimitedNatural();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_UNLIMITED_NATURAL__VALUE = eINSTANCE.getLiteralUnlimitedNatural_Value();

		/**
		 * The meta object literal for the '{@link UML.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.AttributeImpl
		 * @see UML.impl.UMLPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link UML.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.PropertyImpl
		 * @see UML.impl.UMLPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_STATIC = eINSTANCE.getProperty_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ASSOCIATION = eINSTANCE.getProperty_Association();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__QUALIFIER = eINSTANCE.getProperty_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Owning Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OWNING_ASSOCIATION = eINSTANCE.getProperty_OwningAssociation();

		/**
		 * The meta object literal for the '<em><b>Association End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ASSOCIATION_END = eINSTANCE.getProperty_AssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__INTERFACE = eINSTANCE.getProperty_Interface();

		/**
		 * The meta object literal for the '{@link UML.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.ParameterImpl
		 * @see UML.impl.UMLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DIRECTION = eINSTANCE.getParameter_Direction();

		/**
		 * The meta object literal for the '{@link UML.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.OperationImpl
		 * @see UML.impl.UMLPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OWNED_PARAMETER = eINSTANCE.getOperation_OwnedParameter();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CLASS = eINSTANCE.getOperation_Class();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INTERFACE = eINSTANCE.getOperation_Interface();

		/**
		 * The meta object literal for the '{@link UML.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.ClassImpl
		 * @see UML.impl.UMLPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_ATTRIBUTE = eINSTANCE.getClass_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_OPERATION = eINSTANCE.getClass_OwnedOperation();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__GENERALIZATION = eINSTANCE.getClass_Generalization();

		/**
		 * The meta object literal for the '<em><b>Template Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__TEMPLATE_BINDING = eINSTANCE.getClass_TemplateBinding();

		/**
		 * The meta object literal for the '<em><b>Nested Classifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__NESTED_CLASSIFIER = eINSTANCE.getClass_NestedClassifier();

		/**
		 * The meta object literal for the '{@link UML.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.InterfaceImpl
		 * @see UML.impl.UMLPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link UML.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.EnumerationLiteralImpl
		 * @see UML.impl.UMLPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL__CLASSIFIER = eINSTANCE.getEnumerationLiteral_Classifier();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_LITERAL__ENUMERATION = eINSTANCE.getEnumerationLiteral_Enumeration();

		/**
		 * The meta object literal for the '{@link UML.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.EnumerationImpl
		 * @see UML.impl.UMLPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Owned Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__OWNED_LITERAL = eINSTANCE.getEnumeration_OwnedLiteral();

		/**
		 * The meta object literal for the '{@link UML.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.GeneralizationImpl
		 * @see UML.impl.UMLPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '{@link UML.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.AssociationImpl
		 * @see UML.impl.UMLPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Member End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__MEMBER_END = eINSTANCE.getAssociation_MemberEnd();

		/**
		 * The meta object literal for the '<em><b>Owned End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__OWNED_END = eINSTANCE.getAssociation_OwnedEnd();

		/**
		 * The meta object literal for the '{@link UML.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.TemplateParameterSubstitutionImpl
		 * @see UML.impl.UMLPackageImpl#getTemplateParameterSubstitution()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateParameterSubstitution();

		/**
		 * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL = eINSTANCE.getTemplateParameterSubstitution_Actual();

		/**
		 * The meta object literal for the '<em><b>Template Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING = eINSTANCE.getTemplateParameterSubstitution_TemplateBinding();

		/**
		 * The meta object literal for the '{@link UML.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UML.impl.TemplateBindingImpl
		 * @see UML.impl.UMLPackageImpl#getTemplateBinding()
		 * @generated
		 */
		EClass TEMPLATE_BINDING = eINSTANCE.getTemplateBinding();

		/**
		 * The meta object literal for the '<em><b>Parameter Substitution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateBinding_ParameterSubstitution();

		/**
		 * The meta object literal for the '<em><b>Bound Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_BINDING__BOUND_ELEMENT = eINSTANCE.getTemplateBinding_BoundElement();

	}

} //UMLPackage
