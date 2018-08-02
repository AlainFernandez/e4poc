/**
 */
package exo.pizzeria.impl;

import exo.pizzeria.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class MPizzeriaFactoryImpl extends EFactoryImpl implements MPizzeriaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MPizzeriaFactory init() {
		try {
			MPizzeriaFactory thePizzeriaFactory = (MPizzeriaFactory) EPackage.Registry.INSTANCE
					.getEFactory(MPizzeriaPackage.eNS_URI);
			if (thePizzeriaFactory != null) {
				return thePizzeriaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MPizzeriaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPizzeriaFactoryImpl() {
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
		case MPizzeriaPackage.PIZZA:
			return createPizza();
		case MPizzeriaPackage.TOMATE:
			return createTomate();
		case MPizzeriaPackage.JAMBON:
			return createJambon();
		case MPizzeriaPackage.FROMAGE:
			return createFromage();
		case MPizzeriaPackage.PIZZERIA:
			return createPizzeria();
		case MPizzeriaPackage.TABLE:
			return createTable();
		case MPizzeriaPackage.CLIENT:
			return createClient();
		case MPizzeriaPackage.RECETTE:
			return createRecette();
		case MPizzeriaPackage.OEUF:
			return createOeuf();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MPizzeriaPackage.ETAT_PIZZA:
			return createEtatPizzaFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MPizzeriaPackage.ETAT_PIZZA:
			return convertEtatPizzaToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pizza createPizza() {
		PizzaImpl pizza = new PizzaImpl();
		return pizza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tomate createTomate() {
		TomateImpl tomate = new TomateImpl();
		return tomate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jambon createJambon() {
		JambonImpl jambon = new JambonImpl();
		return jambon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fromage createFromage() {
		FromageImpl fromage = new FromageImpl();
		return fromage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pizzeria createPizzeria() {
		PizzeriaImpl pizzeria = new PizzeriaImpl();
		return pizzeria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recette createRecette() {
		RecetteImpl recette = new RecetteImpl();
		return recette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oeuf createOeuf() {
		OeufImpl oeuf = new OeufImpl();
		return oeuf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtatPizza createEtatPizzaFromString(EDataType eDataType, String initialValue) {
		EtatPizza result = EtatPizza.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEtatPizzaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPizzeriaPackage getPizzeriaPackage() {
		return (MPizzeriaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MPizzeriaPackage getPackage() {
		return MPizzeriaPackage.eINSTANCE;
	}

} //MPizzeriaFactoryImpl
