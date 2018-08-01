/**
 */
package exo.zoo;

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
 * @see exo.zoo.MZooFactory
 * @model kind="package"
 * @generated
 */
public interface MZooPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "zoo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/zoo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "zoo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MZooPackage eINSTANCE = exo.zoo.impl.MZooPackageImpl.init();

	/**
	 * The meta object id for the '{@link exo.zoo.impl.MZooImpl <em>Zoo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.impl.MZooImpl
	 * @see exo.zoo.impl.MZooPackageImpl#getZoo()
	 * @generated
	 */
	int ZOO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO__PARC = 1;

	/**
	 * The number of structural features of the '<em>Zoo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Zoo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.zoo.impl.MParcImpl <em>Parc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.impl.MParcImpl
	 * @see exo.zoo.impl.MZooPackageImpl#getParc()
	 * @generated
	 */
	int PARC = 1;

	/**
	 * The feature id for the '<em><b>Animal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC__ANIMAL = 0;

	/**
	 * The number of structural features of the '<em>Parc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.zoo.impl.MAnimalImpl <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.impl.MAnimalImpl
	 * @see exo.zoo.impl.MZooPackageImpl#getAnimal()
	 * @generated
	 */
	int ANIMAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.zoo.impl.MLionImpl <em>Lion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.impl.MLionImpl
	 * @see exo.zoo.impl.MZooPackageImpl#getLion()
	 * @generated
	 */
	int LION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LION__NAME = ANIMAL__NAME;

	/**
	 * The number of structural features of the '<em>Lion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LION_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LION_OPERATION_COUNT = ANIMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link exo.zoo.impl.MMonkeyImpl <em>Monkey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.impl.MMonkeyImpl
	 * @see exo.zoo.impl.MZooPackageImpl#getMonkey()
	 * @generated
	 */
	int MONKEY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONKEY__NAME = ANIMAL__NAME;

	/**
	 * The number of structural features of the '<em>Monkey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONKEY_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Monkey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONKEY_OPERATION_COUNT = ANIMAL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link exo.zoo.MZoo <em>Zoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zoo</em>'.
	 * @see exo.zoo.MZoo
	 * @generated
	 */
	EClass getZoo();

	/**
	 * Returns the meta object for the attribute '{@link exo.zoo.MZoo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see exo.zoo.MZoo#getName()
	 * @see #getZoo()
	 * @generated
	 */
	EAttribute getZoo_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.zoo.MZoo#getParc <em>Parc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parc</em>'.
	 * @see exo.zoo.MZoo#getParc()
	 * @see #getZoo()
	 * @generated
	 */
	EReference getZoo_Parc();

	/**
	 * Returns the meta object for class '{@link exo.zoo.MParc <em>Parc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parc</em>'.
	 * @see exo.zoo.MParc
	 * @generated
	 */
	EClass getParc();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.zoo.MParc#getAnimal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animal</em>'.
	 * @see exo.zoo.MParc#getAnimal()
	 * @see #getParc()
	 * @generated
	 */
	EReference getParc_Animal();

	/**
	 * Returns the meta object for class '{@link exo.zoo.MAnimal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see exo.zoo.MAnimal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for the attribute '{@link exo.zoo.MAnimal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see exo.zoo.MAnimal#getName()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Name();

	/**
	 * Returns the meta object for class '{@link exo.zoo.MLion <em>Lion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lion</em>'.
	 * @see exo.zoo.MLion
	 * @generated
	 */
	EClass getLion();

	/**
	 * Returns the meta object for class '{@link exo.zoo.MMonkey <em>Monkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monkey</em>'.
	 * @see exo.zoo.MMonkey
	 * @generated
	 */
	EClass getMonkey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MZooFactory getZooFactory();

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
		 * The meta object literal for the '{@link exo.zoo.impl.MZooImpl <em>Zoo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.impl.MZooImpl
		 * @see exo.zoo.impl.MZooPackageImpl#getZoo()
		 * @generated
		 */
		EClass ZOO = eINSTANCE.getZoo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOO__NAME = eINSTANCE.getZoo_Name();

		/**
		 * The meta object literal for the '<em><b>Parc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZOO__PARC = eINSTANCE.getZoo_Parc();

		/**
		 * The meta object literal for the '{@link exo.zoo.impl.MParcImpl <em>Parc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.impl.MParcImpl
		 * @see exo.zoo.impl.MZooPackageImpl#getParc()
		 * @generated
		 */
		EClass PARC = eINSTANCE.getParc();

		/**
		 * The meta object literal for the '<em><b>Animal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARC__ANIMAL = eINSTANCE.getParc_Animal();

		/**
		 * The meta object literal for the '{@link exo.zoo.impl.MAnimalImpl <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.impl.MAnimalImpl
		 * @see exo.zoo.impl.MZooPackageImpl#getAnimal()
		 * @generated
		 */
		EClass ANIMAL = eINSTANCE.getAnimal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__NAME = eINSTANCE.getAnimal_Name();

		/**
		 * The meta object literal for the '{@link exo.zoo.impl.MLionImpl <em>Lion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.impl.MLionImpl
		 * @see exo.zoo.impl.MZooPackageImpl#getLion()
		 * @generated
		 */
		EClass LION = eINSTANCE.getLion();

		/**
		 * The meta object literal for the '{@link exo.zoo.impl.MMonkeyImpl <em>Monkey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.impl.MMonkeyImpl
		 * @see exo.zoo.impl.MZooPackageImpl#getMonkey()
		 * @generated
		 */
		EClass MONKEY = eINSTANCE.getMonkey();

	}

} //MZooPackage
