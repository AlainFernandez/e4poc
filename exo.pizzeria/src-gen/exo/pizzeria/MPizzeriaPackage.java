/**
 */
package exo.pizzeria;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	 * The feature id for the '<em><b>Etat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA__ETAT = 2;

	/**
	 * The number of structural features of the '<em>Pizza</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA___GET_PRICE = 0;

	/**
	 * The operation id for the '<em>Number Sale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA___NUMBER_SALE = 1;

	/**
	 * The number of operations of the '<em>Pizza</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZA_OPERATION_COUNT = 2;

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
	 * The meta object id for the '{@link exo.pizzeria.impl.MPizzeriaImpl <em>Pizzeria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MPizzeriaImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getPizzeria()
	 * @generated
	 */
	int PIZZERIA = 5;

	/**
	 * The feature id for the '<em><b>Pizza</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__PIZZA = 0;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__CLIENTS = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__TABLES = 2;

	/**
	 * The feature id for the '<em><b>Recettes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA__RECETTES = 3;

	/**
	 * The number of structural features of the '<em>Pizzeria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pizzeria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIZZERIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.pizzeria.impl.MTableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MTableImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CLIENTS = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.pizzeria.impl.MClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MClientImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Like</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__LIKE = 1;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.pizzeria.impl.MRecetteImpl <em>Recette</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MRecetteImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getRecette()
	 * @generated
	 */
	int RECETTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ingredients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__INGREDIENTS = 1;

	/**
	 * The feature id for the '<em><b>Calzone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__CALZONE = 2;

	/**
	 * The feature id for the '<em><b>Temps Cuisson</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE__TEMPS_CUISSON = 3;

	/**
	 * The number of structural features of the '<em>Recette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Recette</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECETTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.pizzeria.impl.MOeufImpl <em>Oeuf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.impl.MOeufImpl
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getOeuf()
	 * @generated
	 */
	int OEUF = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OEUF__NAME = INGREDIENT__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OEUF__PRICE = INGREDIENT__PRICE;

	/**
	 * The number of structural features of the '<em>Oeuf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OEUF_FEATURE_COUNT = INGREDIENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Oeuf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OEUF_OPERATION_COUNT = INGREDIENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exo.pizzeria.EtatPizza <em>Etat Pizza</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.pizzeria.EtatPizza
	 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getEtatPizza()
	 * @generated
	 */
	int ETAT_PIZZA = 10;

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
	 * Returns the meta object for the attribute '{@link exo.pizzeria.MPizza#getEtat <em>Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etat</em>'.
	 * @see exo.pizzeria.MPizza#getEtat()
	 * @see #getPizza()
	 * @generated
	 */
	EAttribute getPizza_Etat();

	/**
	 * Returns the meta object for the '{@link exo.pizzeria.MPizza#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see exo.pizzeria.MPizza#getPrice()
	 * @generated
	 */
	EOperation getPizza__GetPrice();

	/**
	 * Returns the meta object for the '{@link exo.pizzeria.MPizza#numberSale() <em>Number Sale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Number Sale</em>' operation.
	 * @see exo.pizzeria.MPizza#numberSale()
	 * @generated
	 */
	EOperation getPizza__NumberSale();

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
	 * Returns the meta object for class '{@link exo.pizzeria.MPizzeria <em>Pizzeria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pizzeria</em>'.
	 * @see exo.pizzeria.MPizzeria
	 * @generated
	 */
	EClass getPizzeria();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.pizzeria.MPizzeria#getPizza <em>Pizza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pizza</em>'.
	 * @see exo.pizzeria.MPizzeria#getPizza()
	 * @see #getPizzeria()
	 * @generated
	 */
	EReference getPizzeria_Pizza();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.pizzeria.MPizzeria#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see exo.pizzeria.MPizzeria#getClients()
	 * @see #getPizzeria()
	 * @generated
	 */
	EReference getPizzeria_Clients();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.pizzeria.MPizzeria#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see exo.pizzeria.MPizzeria#getTables()
	 * @see #getPizzeria()
	 * @generated
	 */
	EReference getPizzeria_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.pizzeria.MPizzeria#getRecettes <em>Recettes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recettes</em>'.
	 * @see exo.pizzeria.MPizzeria#getRecettes()
	 * @see #getPizzeria()
	 * @generated
	 */
	EReference getPizzeria_Recettes();

	/**
	 * Returns the meta object for class '{@link exo.pizzeria.MTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see exo.pizzeria.MTable
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link exo.pizzeria.MTable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see exo.pizzeria.MTable#getId()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Id();

	/**
	 * Returns the meta object for the reference list '{@link exo.pizzeria.MTable#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clients</em>'.
	 * @see exo.pizzeria.MTable#getClients()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Clients();

	/**
	 * Returns the meta object for class '{@link exo.pizzeria.MClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see exo.pizzeria.MClient
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link exo.pizzeria.MClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see exo.pizzeria.MClient#getName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Name();

	/**
	 * Returns the meta object for the reference list '{@link exo.pizzeria.MClient#getLike <em>Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Like</em>'.
	 * @see exo.pizzeria.MClient#getLike()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Like();

	/**
	 * Returns the meta object for class '{@link exo.pizzeria.MRecette <em>Recette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recette</em>'.
	 * @see exo.pizzeria.MRecette
	 * @generated
	 */
	EClass getRecette();

	/**
	 * Returns the meta object for the attribute '{@link exo.pizzeria.MRecette#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see exo.pizzeria.MRecette#getName()
	 * @see #getRecette()
	 * @generated
	 */
	EAttribute getRecette_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.pizzeria.MRecette#getIngredients <em>Ingredients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredients</em>'.
	 * @see exo.pizzeria.MRecette#getIngredients()
	 * @see #getRecette()
	 * @generated
	 */
	EReference getRecette_Ingredients();

	/**
	 * Returns the meta object for the attribute '{@link exo.pizzeria.MRecette#isCalzone <em>Calzone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calzone</em>'.
	 * @see exo.pizzeria.MRecette#isCalzone()
	 * @see #getRecette()
	 * @generated
	 */
	EAttribute getRecette_Calzone();

	/**
	 * Returns the meta object for the attribute '{@link exo.pizzeria.MRecette#getTempsCuisson <em>Temps Cuisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps Cuisson</em>'.
	 * @see exo.pizzeria.MRecette#getTempsCuisson()
	 * @see #getRecette()
	 * @generated
	 */
	EAttribute getRecette_TempsCuisson();

	/**
	 * Returns the meta object for class '{@link exo.pizzeria.MOeuf <em>Oeuf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oeuf</em>'.
	 * @see exo.pizzeria.MOeuf
	 * @generated
	 */
	EClass getOeuf();

	/**
	 * Returns the meta object for enum '{@link exo.pizzeria.EtatPizza <em>Etat Pizza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Etat Pizza</em>'.
	 * @see exo.pizzeria.EtatPizza
	 * @generated
	 */
	EEnum getEtatPizza();

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
		 * The meta object literal for the '<em><b>Etat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIZZA__ETAT = eINSTANCE.getPizza_Etat();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIZZA___GET_PRICE = eINSTANCE.getPizza__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Number Sale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PIZZA___NUMBER_SALE = eINSTANCE.getPizza__NumberSale();

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

		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MPizzeriaImpl <em>Pizzeria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MPizzeriaImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getPizzeria()
		 * @generated
		 */
		EClass PIZZERIA = eINSTANCE.getPizzeria();

		/**
		 * The meta object literal for the '<em><b>Pizza</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZERIA__PIZZA = eINSTANCE.getPizzeria_Pizza();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZERIA__CLIENTS = eINSTANCE.getPizzeria_Clients();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZERIA__TABLES = eINSTANCE.getPizzeria_Tables();

		/**
		 * The meta object literal for the '<em><b>Recettes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIZZERIA__RECETTES = eINSTANCE.getPizzeria_Recettes();

		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MTableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MTableImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ID = eINSTANCE.getTable_Id();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CLIENTS = eINSTANCE.getTable_Clients();

		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MClientImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAME = eINSTANCE.getClient_Name();

		/**
		 * The meta object literal for the '<em><b>Like</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__LIKE = eINSTANCE.getClient_Like();

		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MRecetteImpl <em>Recette</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MRecetteImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getRecette()
		 * @generated
		 */
		EClass RECETTE = eINSTANCE.getRecette();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECETTE__NAME = eINSTANCE.getRecette_Name();

		/**
		 * The meta object literal for the '<em><b>Ingredients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECETTE__INGREDIENTS = eINSTANCE.getRecette_Ingredients();

		/**
		 * The meta object literal for the '<em><b>Calzone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECETTE__CALZONE = eINSTANCE.getRecette_Calzone();

		/**
		 * The meta object literal for the '<em><b>Temps Cuisson</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECETTE__TEMPS_CUISSON = eINSTANCE.getRecette_TempsCuisson();

		/**
		 * The meta object literal for the '{@link exo.pizzeria.impl.MOeufImpl <em>Oeuf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.impl.MOeufImpl
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getOeuf()
		 * @generated
		 */
		EClass OEUF = eINSTANCE.getOeuf();

		/**
		 * The meta object literal for the '{@link exo.pizzeria.EtatPizza <em>Etat Pizza</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.pizzeria.EtatPizza
		 * @see exo.pizzeria.impl.MPizzeriaPackageImpl#getEtatPizza()
		 * @generated
		 */
		EEnum ETAT_PIZZA = eINSTANCE.getEtatPizza();

	}

} //MPizzeriaPackage
