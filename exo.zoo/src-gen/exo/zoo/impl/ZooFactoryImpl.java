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
public class ZooFactoryImpl extends EFactoryImpl implements ZooFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZooFactory init() {
		try {
			ZooFactory theZooFactory = (ZooFactory) EPackage.Registry.INSTANCE.getEFactory(ZooPackage.eNS_URI);
			if (theZooFactory != null) {
				return theZooFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZooFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZooFactoryImpl() {
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
		case ZooPackage.ZOO:
			return createZoo();
		case ZooPackage.PARC:
			return createParc();
		case ZooPackage.ANIMAL:
			return createAnimal();
		case ZooPackage.LION:
			return createLion();
		case ZooPackage.MONKEY:
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
	public ZooPackage getZooPackage() {
		return (ZooPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ZooPackage getPackage() {
		return ZooPackage.eINSTANCE;
	}

} //ZooFactoryImpl
