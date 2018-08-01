/**
 */
package exo.zoo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see exo.zoo.MZooPackage
 * @generated
 */
public interface MZooFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MZooFactory eINSTANCE = exo.zoo.impl.MZooFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Zoo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zoo</em>'.
	 * @generated
	 */
	Zoo createZoo();

	/**
	 * Returns a new object of class '<em>Parc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parc</em>'.
	 * @generated
	 */
	Parc createParc();

	/**
	 * Returns a new object of class '<em>Animal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animal</em>'.
	 * @generated
	 */
	Animal createAnimal();

	/**
	 * Returns a new object of class '<em>Lion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lion</em>'.
	 * @generated
	 */
	Lion createLion();

	/**
	 * Returns a new object of class '<em>Monkey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monkey</em>'.
	 * @generated
	 */
	Monkey createMonkey();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MZooPackage getZooPackage();

} //MZooFactory
