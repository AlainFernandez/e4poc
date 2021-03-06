/**
 */
package exo.pizzeria.impl;

import exo.pizzeria.Anchoix;
import exo.pizzeria.Client;
import exo.pizzeria.EtatPizza;
import exo.pizzeria.Fromage;
import exo.pizzeria.Ingredient;
import exo.pizzeria.Jambon;
import exo.pizzeria.MPizzeriaFactory;
import exo.pizzeria.MPizzeriaPackage;
import exo.pizzeria.Oeuf;
import exo.pizzeria.Pizza;
import exo.pizzeria.Pizzeria;
import exo.pizzeria.PizzeriaChain;
import exo.pizzeria.Recette;
import exo.pizzeria.Table;
import exo.pizzeria.Tomate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MPizzeriaPackageImpl extends EPackageImpl implements MPizzeriaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pizzaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ingredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tomateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jambonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pizzeriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recetteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oeufEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pizzeriaChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchoixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum etatPizzaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see exo.pizzeria.MPizzeriaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MPizzeriaPackageImpl() {
		super(eNS_URI, MPizzeriaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MPizzeriaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MPizzeriaPackage init() {
		if (isInited)
			return (MPizzeriaPackage) EPackage.Registry.INSTANCE.getEPackage(MPizzeriaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPizzeriaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MPizzeriaPackageImpl thePizzeriaPackage = registeredPizzeriaPackage instanceof MPizzeriaPackageImpl
				? (MPizzeriaPackageImpl) registeredPizzeriaPackage
				: new MPizzeriaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePizzeriaPackage.createPackageContents();

		// Initialize created meta-data
		thePizzeriaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePizzeriaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MPizzeriaPackage.eNS_URI, thePizzeriaPackage);
		return thePizzeriaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPizza() {
		return pizzaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPizza_Name() {
		return (EAttribute) pizzaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPizza_Ingredient() {
		return (EReference) pizzaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPizza_Etat() {
		return (EAttribute) pizzaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPizza__GetPrice() {
		return pizzaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPizza__NumberSale() {
		return pizzaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIngredient() {
		return ingredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Name() {
		return (EAttribute) ingredientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIngredient_Price() {
		return (EAttribute) ingredientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTomate() {
		return tomateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJambon() {
		return jambonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFromage() {
		return fromageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPizzeria() {
		return pizzeriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPizzeria_Pizza() {
		return (EReference) pizzeriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPizzeria_Clients() {
		return (EReference) pizzeriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPizzeria_Tables() {
		return (EReference) pizzeriaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPizzeria_Recettes() {
		return (EReference) pizzeriaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTable_Id() {
		return (EAttribute) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Clients() {
		return (EReference) tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Name() {
		return (EAttribute) clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Like() {
		return (EReference) clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecette() {
		return recetteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecette_Name() {
		return (EAttribute) recetteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecette_Ingredients() {
		return (EReference) recetteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecette_Calzone() {
		return (EAttribute) recetteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecette_TempsCuisson() {
		return (EAttribute) recetteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOeuf() {
		return oeufEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPizzeriaChain() {
		return pizzeriaChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPizzeriaChain_Name() {
		return (EAttribute) pizzeriaChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPizzeriaChain_Magasins() {
		return (EReference) pizzeriaChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchoix() {
		return anchoixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEtatPizza() {
		return etatPizzaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPizzeriaFactory getPizzeriaFactory() {
		return (MPizzeriaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		recetteEClass = createEClass(RECETTE);
		createEAttribute(recetteEClass, RECETTE__NAME);
		createEReference(recetteEClass, RECETTE__INGREDIENTS);
		createEAttribute(recetteEClass, RECETTE__CALZONE);
		createEAttribute(recetteEClass, RECETTE__TEMPS_CUISSON);

		ingredientEClass = createEClass(INGREDIENT);
		createEAttribute(ingredientEClass, INGREDIENT__NAME);
		createEAttribute(ingredientEClass, INGREDIENT__PRICE);

		tomateEClass = createEClass(TOMATE);

		jambonEClass = createEClass(JAMBON);

		fromageEClass = createEClass(FROMAGE);

		anchoixEClass = createEClass(ANCHOIX);

		oeufEClass = createEClass(OEUF);

		pizzaEClass = createEClass(PIZZA);
		createEAttribute(pizzaEClass, PIZZA__NAME);
		createEReference(pizzaEClass, PIZZA__INGREDIENT);
		createEAttribute(pizzaEClass, PIZZA__ETAT);
		createEOperation(pizzaEClass, PIZZA___GET_PRICE);
		createEOperation(pizzaEClass, PIZZA___NUMBER_SALE);

		pizzeriaEClass = createEClass(PIZZERIA);
		createEReference(pizzeriaEClass, PIZZERIA__PIZZA);
		createEReference(pizzeriaEClass, PIZZERIA__CLIENTS);
		createEReference(pizzeriaEClass, PIZZERIA__TABLES);
		createEReference(pizzeriaEClass, PIZZERIA__RECETTES);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__ID);
		createEReference(tableEClass, TABLE__CLIENTS);

		clientEClass = createEClass(CLIENT);
		createEAttribute(clientEClass, CLIENT__NAME);
		createEReference(clientEClass, CLIENT__LIKE);

		pizzeriaChainEClass = createEClass(PIZZERIA_CHAIN);
		createEAttribute(pizzeriaChainEClass, PIZZERIA_CHAIN__NAME);
		createEReference(pizzeriaChainEClass, PIZZERIA_CHAIN__MAGASINS);

		// Create enums
		etatPizzaEEnum = createEEnum(ETAT_PIZZA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tomateEClass.getESuperTypes().add(this.getIngredient());
		jambonEClass.getESuperTypes().add(this.getIngredient());
		fromageEClass.getESuperTypes().add(this.getIngredient());
		anchoixEClass.getESuperTypes().add(this.getIngredient());
		oeufEClass.getESuperTypes().add(this.getIngredient());

		// Initialize classes, features, and operations; add parameters
		initEClass(recetteEClass, Recette.class, "Recette", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecette_Name(), ecorePackage.getEString(), "name", null, 0, 1, Recette.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecette_Ingredients(), this.getIngredient(), null, "ingredients", null, 1, -1, Recette.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecette_Calzone(), ecorePackage.getEBoolean(), "calzone", null, 0, 1, Recette.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecette_TempsCuisson(), ecorePackage.getEFloat(), "tempsCuisson", null, 0, 1, Recette.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ingredientEClass, Ingredient.class, "Ingredient", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIngredient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Ingredient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIngredient_Price(), ecorePackage.getEDouble(), "price", null, 0, 1, Ingredient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tomateEClass, Tomate.class, "Tomate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jambonEClass, Jambon.class, "Jambon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fromageEClass, Fromage.class, "Fromage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anchoixEClass, Anchoix.class, "Anchoix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oeufEClass, Oeuf.class, "Oeuf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pizzaEClass, Pizza.class, "Pizza", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPizza_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pizza.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPizza_Ingredient(), this.getIngredient(), null, "ingredient", null, 0, -1, Pizza.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPizza_Etat(), this.getEtatPizza(), "etat", null, 0, 1, Pizza.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPizza__GetPrice(), ecorePackage.getEFloat(), "getPrice", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPizza__NumberSale(), ecorePackage.getEInt(), "numberSale", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pizzeriaEClass, Pizzeria.class, "Pizzeria", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPizzeria_Pizza(), this.getPizza(), null, "pizza", null, 0, -1, Pizzeria.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPizzeria_Clients(), this.getClient(), null, "clients", null, 0, -1, Pizzeria.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPizzeria_Tables(), this.getTable(), null, "tables", null, 1, -1, Pizzeria.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPizzeria_Recettes(), this.getRecette(), null, "recettes", null, 2, -1, Pizzeria.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Clients(), this.getClient(), null, "clients", null, 0, 6, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Client.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Like(), this.getPizza(), null, "like", null, 0, -1, Client.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pizzeriaChainEClass, PizzeriaChain.class, "PizzeriaChain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPizzeriaChain_Name(), ecorePackage.getEString(), "name", null, 0, 1, PizzeriaChain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPizzeriaChain_Magasins(), this.getPizzeria(), null, "magasins", null, 0, -1,
				PizzeriaChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(etatPizzaEEnum, EtatPizza.class, "EtatPizza");
		addEEnumLiteral(etatPizzaEEnum, EtatPizza.COMMANDEE);
		addEEnumLiteral(etatPizzaEEnum, EtatPizza.EN_PREPARATION);
		addEEnumLiteral(etatPizzaEEnum, EtatPizza.LIVREE);
		addEEnumLiteral(etatPizzaEEnum, EtatPizza.PAYEE);

		// Create resource
		createResource(eNS_URI);
	}

} //MPizzeriaPackageImpl
