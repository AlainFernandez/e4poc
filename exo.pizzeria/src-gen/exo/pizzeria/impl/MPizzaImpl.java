/**
 */
package exo.pizzeria.impl;

import exo.pizzeria.EtatPizza;
import exo.pizzeria.Ingredient;
import exo.pizzeria.MPizzeriaPackage;
import exo.pizzeria.Pizza;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pizza</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.impl.MPizzaImpl#getName <em>Name</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MPizzaImpl#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MPizzaImpl#getEtat <em>Etat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPizzaImpl extends MinimalEObjectImpl.Container implements Pizza {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIngredient() <em>Ingredient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredient()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> ingredient;

	/**
	 * The default value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected static final EtatPizza ETAT_EDEFAULT = EtatPizza.COMMANDEE;

	/**
	 * The cached value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected EtatPizza etat = ETAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPizzaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MPizzeriaPackage.Literals.PIZZA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MPizzeriaPackage.PIZZA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ingredient> getIngredient() {
		if (ingredient == null) {
			ingredient = new EObjectContainmentEList<Ingredient>(Ingredient.class, this,
					MPizzeriaPackage.PIZZA__INGREDIENT);
		}
		return ingredient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtatPizza getEtat() {
		return etat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtat(EtatPizza newEtat) {
		EtatPizza oldEtat = etat;
		etat = newEtat == null ? ETAT_EDEFAULT : newEtat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MPizzeriaPackage.PIZZA__ETAT, oldEtat, etat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int numberSale() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MPizzeriaPackage.PIZZA__INGREDIENT:
			return ((InternalEList<?>) getIngredient()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MPizzeriaPackage.PIZZA__NAME:
			return getName();
		case MPizzeriaPackage.PIZZA__INGREDIENT:
			return getIngredient();
		case MPizzeriaPackage.PIZZA__ETAT:
			return getEtat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MPizzeriaPackage.PIZZA__NAME:
			setName((String) newValue);
			return;
		case MPizzeriaPackage.PIZZA__INGREDIENT:
			getIngredient().clear();
			getIngredient().addAll((Collection<? extends Ingredient>) newValue);
			return;
		case MPizzeriaPackage.PIZZA__ETAT:
			setEtat((EtatPizza) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MPizzeriaPackage.PIZZA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MPizzeriaPackage.PIZZA__INGREDIENT:
			getIngredient().clear();
			return;
		case MPizzeriaPackage.PIZZA__ETAT:
			setEtat(ETAT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MPizzeriaPackage.PIZZA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MPizzeriaPackage.PIZZA__INGREDIENT:
			return ingredient != null && !ingredient.isEmpty();
		case MPizzeriaPackage.PIZZA__ETAT:
			return etat != ETAT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case MPizzeriaPackage.PIZZA___GET_PRICE:
			return getPrice();
		case MPizzeriaPackage.PIZZA___NUMBER_SALE:
			return numberSale();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", etat: ");
		result.append(etat);
		result.append(')');
		return result.toString();
	}

} //MPizzaImpl
