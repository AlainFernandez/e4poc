/**
 */
package exo.pizzeria;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see exo.pizzeria.MPizzeriaFactory
 * @model kind="package"
 * @generated
 */
public interface MPizzeriaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pizzeria";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pizzeria";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pizzeria";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MPizzeriaPackage eINSTANCE = exo.pizzeria.impl.MPizzeriaPackageImpl.init();

	/**
	 * The meta object id for the '{@link exo.pizzeria.impl.MPizzaImpl <em>Pizza</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MPizzaImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getPizza()
	 * @generated
	 */
	int PIZZA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ingredient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA__INGREDIENT = 1;

	/**
	 * The number of structural features of the '<em>Pizza</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pizza</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.pizzeria.impl.MIngredientImpl <em>Ingredient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MIngredientImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getIngredient()
	 * @generated
	 */
	int INGREDIENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ingredient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGREDIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.pizzeria.impl.MTomateImpl <em>Tomate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MTomateImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getTomate()
	 * @generated
	 */
	int TOMATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMATE__NAME = INGREDIENT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMATE__PRICE = INGREDIENT__PRICE;

	/**
	 * The number of structural features of the '<em>Tomate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMATE_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tomate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOMATE_OPERATION_COUNT = INGREDIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exo.pizzeria.impl.MJambonImpl <em>Jambon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MJambonImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getJambon()
	 * @generated
	 */
	int JAMBON = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAMBON__NAME = INGREDIENT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAMBON__PRICE = INGREDIENT__PRICE;

	/**
	 * The number of structural features of the '<em>Jambon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAMBON_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jambon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAMBON_OPERATION_COUNT = INGREDIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exo.pizzeria.impl.MFromageImpl <em>Fromage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MFromageImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getFromage()
	 * @generated
	 */
	int FROMAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROMAGE__NAME = INGREDIENT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROMAGE__PRICE = INGREDIENT__PRICE;

	/**
	 * The number of structural features of the '<em>Fromage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROMAGE_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fromage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROMAGE_OPERATION_COUNT = INGREDIENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link exo.pizzeria.MPizza <em>Pizza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pizza</em>'.
	 * @see exo.pizzeria.MPizza
	 * @generated
	 */
	EClass getPizza();

	/**
	 * Returns the meta object for the attribute '{@link exo.pizzeria.MPizza#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see exo.pizzeria.MPizza#getName()
	 * @see #getPizza()
	 * @generated
	 */
	EAttribute getPizza_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.pizzeria.MPizza#getIngredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredient</em>'.
	 * @see exo.pizzeria.MPizza#getIngredient()
	 * @see #getPizza()
	 * @generated
	 */
	EReference getPizza_Ingredient();

	/**
	 * Returns the meta object for class '{@link exo.pizzeria.MIngredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingredient</em>'.
	 * @see exo.pizzeria.MIngredient
	 * @generated
	 */
	EClass getIngredient();

	/**
	 * Returns the meta object for the attribute '{@link exo.pizzeria.MIngredient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see exo.pizzeria.MIngredient#getName()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Name();

	/**
	 * Returns the meta object for the attribute '{@link exo.pizzeria.MIngredient#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see exo.pizzeria.MIngredient#getPrice()
	 * @see #getIngredient()
	 * @generated
	 */
	EAttribute getIngredient_Price();

	/**
	 * Returns the meta object for class '{@link exo.pizzeria.MTomate <em>Tomate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tomate</em>'.
	 * @see exo.pizzeria.MTomate
	 * @generated
	 */
	EClass getTomate();

	/**
	 * Returns the meta object for class '{@link exo.pizzeria.MJambon <em>Jambon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jambon</em>'.
	 * @see exo.pizzeria.MJambon
	 * @generated
	 */
	EClass getJambon();

	/**
	 * Returns the meta object for class '{@link exo.pizzeria.MFromage <em>Fromage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fromage</em>'.
	 * @see exo.pizzeria.MFromage
	 * @generated
	 */
	EClass getFromage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MPizzeriaFactory getPizzeriaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MPizzaImpl <em>Pizza</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MPizzaImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getPizza()
		 * @generated
		 */
		EClass PIZZA = eINSTANCE.getPizza();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIZZA__NAME = eINSTANCE.getPizza_Name();

		/**
		 * The meta object literal for the '<em><b>Ingredient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZA__INGREDIENT = eINSTANCE.getPizza_Ingredient();

		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MIngredientImpl <em>Ingredient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MIngredientImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getIngredient()
		 * @generated
		 */
		EClass INGREDIENT = eINSTANCE.getIngredient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__NAME = eINSTANCE.getIngredient_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGREDIENT__PRICE = eINSTANCE.getIngredient_Price();

		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MTomateImpl <em>Tomate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MTomateImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getTomate()
		 * @generated
		 */
		EClass TOMATE = eINSTANCE.getTomate();

		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MJambonImpl <em>Jambon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MJambonImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getJambon()
		 * @generated
		 */
		EClass JAMBON = eINSTANCE.getJambon();

		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MFromageImpl <em>Fromage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MFromageImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getFromage()
		 * @generated
		 */
		EClass FROMAGE = eINSTANCE.getFromage();

	}

} //MPizzeriaPackage