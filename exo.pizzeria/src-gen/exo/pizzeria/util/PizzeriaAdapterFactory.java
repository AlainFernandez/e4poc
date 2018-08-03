/**
 */
package exo.pizzeria.util;

import exo.pizzeria.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see exo.pizzeria.MPizzeriaPackage
 * @generated
 */
public class PizzeriaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MPizzeriaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PizzeriaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MPizzeriaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PizzeriaSwitch<Adapter> modelSwitch = new PizzeriaSwitch<Adapter>() {
		@Override
		public Adapter caseRecette(Recette object) {
			return createRecetteAdapter();
		}

		@Override
		public Adapter caseIngredient(Ingredient object) {
			return createIngredientAdapter();
		}

		@Override
		public Adapter caseTomate(Tomate object) {
			return createTomateAdapter();
		}

		@Override
		public Adapter caseJambon(Jambon object) {
			return createJambonAdapter();
		}

		@Override
		public Adapter caseFromage(Fromage object) {
			return createFromageAdapter();
		}

		@Override
		public Adapter caseAnchoix(Anchoix object) {
			return createAnchoixAdapter();
		}

		@Override
		public Adapter caseOeuf(Oeuf object) {
			return createOeufAdapter();
		}

		@Override
		public Adapter casePizza(Pizza object) {
			return createPizzaAdapter();
		}

		@Override
		public Adapter casePizzeria(Pizzeria object) {
			return createPizzeriaAdapter();
		}

		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseClient(Client object) {
			return createClientAdapter();
		}

		@Override
		public Adapter casePizzeriaChain(PizzeriaChain object) {
			return createPizzeriaChainAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MPizza <em>Pizza</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MPizza
	 * @generated
	 */
	public Adapter createPizzaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MIngredient <em>Ingredient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MIngredient
	 * @generated
	 */
	public Adapter createIngredientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MTomate <em>Tomate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MTomate
	 * @generated
	 */
	public Adapter createTomateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MJambon <em>Jambon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MJambon
	 * @generated
	 */
	public Adapter createJambonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MFromage <em>Fromage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MFromage
	 * @generated
	 */
	public Adapter createFromageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MPizzeria <em>Pizzeria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MPizzeria
	 * @generated
	 */
	public Adapter createPizzeriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MTable
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MClient
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MRecette <em>Recette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MRecette
	 * @generated
	 */
	public Adapter createRecetteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MOeuf <em>Oeuf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MOeuf
	 * @generated
	 */
	public Adapter createOeufAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MPizzeriaChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MPizzeriaChain
	 * @generated
	 */
	public Adapter createPizzeriaChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link exo.pizzeria.MAnchoix <em>Anchoix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see exo.pizzeria.MAnchoix
	 * @generated
	 */
	public Adapter createAnchoixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PizzeriaAdapterFactory
