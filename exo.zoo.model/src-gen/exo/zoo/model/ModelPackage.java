/**
 */
package exo.zoo.model;

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
 * @see exo.zoo.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = exo.zoo.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link exo.zoo.model.impl.ZooImpl <em>Zoo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.model.impl.ZooImpl
	 * @see exo.zoo.model.impl.ModelPackageImpl#getZoo()
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
	 * The meta object id for the '{@link exo.zoo.model.impl.ParcImpl <em>Parc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.model.impl.ParcImpl
	 * @see exo.zoo.model.impl.ModelPackageImpl#getParc()
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
	 * The meta object id for the '{@link exo.zoo.model.impl.AnimalImpl <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.model.impl.AnimalImpl
	 * @see exo.zoo.model.impl.ModelPackageImpl#getAnimal()
	 * @generated
	 */
	int ANIMAL = 2;

	/**
	 * The number of structural features of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link exo.zoo.model.impl.LionImpl <em>Lion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.model.impl.LionImpl
	 * @see exo.zoo.model.impl.ModelPackageImpl#getLion()
	 * @generated
	 */
	int LION = 3;

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
	 * The meta object id for the '{@link exo.zoo.model.impl.MonkeyImpl <em>Monkey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see exo.zoo.model.impl.MonkeyImpl
	 * @see exo.zoo.model.impl.ModelPackageImpl#getMonkey()
	 * @generated
	 */
	int MONKEY = 4;

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
	 * Returns the meta object for class '{@link exo.zoo.model.Zoo <em>Zoo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zoo</em>'.
	 * @see exo.zoo.model.Zoo
	 * @generated
	 */
	EClass getZoo();

	/**
	 * Returns the meta object for the attribute '{@link exo.zoo.model.Zoo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see exo.zoo.model.Zoo#getName()
	 * @see #getZoo()
	 * @generated
	 */
	EAttribute getZoo_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.zoo.model.Zoo#getParc <em>Parc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parc</em>'.
	 * @see exo.zoo.model.Zoo#getParc()
	 * @see #getZoo()
	 * @generated
	 */
	EReference getZoo_Parc();

	/**
	 * Returns the meta object for class '{@link exo.zoo.model.Parc <em>Parc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parc</em>'.
	 * @see exo.zoo.model.Parc
	 * @generated
	 */
	EClass getParc();

	/**
	 * Returns the meta object for the containment reference list '{@link exo.zoo.model.Parc#getAnimal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animal</em>'.
	 * @see exo.zoo.model.Parc#getAnimal()
	 * @see #getParc()
	 * @generated
	 */
	EReference getParc_Animal();

	/**
	 * Returns the meta object for class '{@link exo.zoo.model.Animal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see exo.zoo.model.Animal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for class '{@link exo.zoo.model.Lion <em>Lion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lion</em>'.
	 * @see exo.zoo.model.Lion
	 * @generated
	 */
	EClass getLion();

	/**
	 * Returns the meta object for class '{@link exo.zoo.model.Monkey <em>Monkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monkey</em>'.
	 * @see exo.zoo.model.Monkey
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
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link exo.zoo.model.impl.ZooImpl <em>Zoo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.model.impl.ZooImpl
		 * @see exo.zoo.model.impl.ModelPackageImpl#getZoo()
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
		 * The meta object literal for the '{@link exo.zoo.model.impl.ParcImpl <em>Parc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.model.impl.ParcImpl
		 * @see exo.zoo.model.impl.ModelPackageImpl#getParc()
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
		 * The meta object literal for the '{@link exo.zoo.model.impl.AnimalImpl <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.model.impl.AnimalImpl
		 * @see exo.zoo.model.impl.ModelPackageImpl#getAnimal()
		 * @generated
		 */
		EClass ANIMAL = eINSTANCE.getAnimal();

		/**
		 * The meta object literal for the '{@link exo.zoo.model.impl.LionImpl <em>Lion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.model.impl.LionImpl
		 * @see exo.zoo.model.impl.ModelPackageImpl#getLion()
		 * @generated
		 */
		EClass LION = eINSTANCE.getLion();

		/**
		 * The meta object literal for the '{@link exo.zoo.model.impl.MonkeyImpl <em>Monkey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see exo.zoo.model.impl.MonkeyImpl
		 * @see exo.zoo.model.impl.ModelPackageImpl#getMonkey()
		 * @generated
		 */
		EClass MONKEY = eINSTANCE.getMonkey();

	}

} //ModelPackage
