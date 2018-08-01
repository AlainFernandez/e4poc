/**
 */
package exo.zoo.impl;

import exo.zoo.*;

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
public class MZooFactoryImpl extends EFactoryImpl implements MZooFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MZooFactory init() {
		try {
			MZooFactory theZooFactory = (MZooFactory) EPackage.Registry.INSTANCE.getEFactory(MZooPackage.eNS_URI);
			if (theZooFactory != null) {
				return theZooFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MZooFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MZooFactoryImpl() {
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
		case MZooPackage.ZOO:
			return createZoo();
		case MZooPackage.PARC:
			return createParc();
		case MZooPackage.ANIMAL:
			return createAnimal();
		case MZooPackage.LION:
			return createLion();
		case MZooPackage.MONKEY:
			return createMonkey();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zoo createZoo() {
		ZooImpl zoo = new ZooImpl();
		return zoo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parc createParc() {
		ParcImpl parc = new ParcImpl();
		return parc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animal createAnimal() {
		AnimalImpl animal = new AnimalImpl();
		return animal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lion createLion() {
		LionImpl lion = new LionImpl();
		return lion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monkey createMonkey() {
		MonkeyImpl monkey = new MonkeyImpl();
		return monkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MZooPackage getZooPackage() {
		return (MZooPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MZooPackage getPackage() {
		return MZooPackage.eINSTANCE;
	}

} //MZooFactoryImpl
