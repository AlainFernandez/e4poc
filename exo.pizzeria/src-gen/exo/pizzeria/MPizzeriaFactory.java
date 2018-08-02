/**
 */
package exo.pizzeria;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see exo.pizzeria.MPizzeriaPackage
 * @generated
 */
public interface MPizzeriaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MPizzeriaFactory eINSTANCE = exo.pizzeria.impl.MPizzeriaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pizza</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pizza</em>'.
	 * @generated
	 */
	Pizza createPizza();

	/**
	 * Returns a new object of class '<em>Ingredient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ingredient</em>'.
	 * @generated
	 */
	Ingredient createIngredient();

	/**
	 * Returns a new object of class '<em>Tomate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tomate</em>'.
	 * @generated
	 */
	Tomate createTomate();

	/**
	 * Returns a new object of class '<em>Jambon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jambon</em>'.
	 * @generated
	 */
	Jambon createJambon();

	/**
	 * Returns a new object of class '<em>Fromage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fromage</em>'.
	 * @generated
	 */
	Fromage createFromage();

	/**
	 * Returns a new object of class '<em>Pizzeria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pizzeria</em>'.
	 * @generated
	 */
	Pizzeria createPizzeria();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
	Client createClient();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MPizzeriaPackage getPizzeriaPackage();

} //MPizzeriaFactory
