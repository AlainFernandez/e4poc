/**
 */
package exo.pizzeria.impl;

import exo.pizzeria.Ingredient;
import exo.pizzeria.MPizzeriaPackage;
import exo.pizzeria.Recette;

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
 * An implementation of the model object '<em><b>Recette</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.impl.MRecetteImpl#getName <em>Name</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MRecetteImpl#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MRecetteImpl#isCalzone <em>Calzone</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MRecetteImpl#getTempsCuisson <em>Temps Cuisson</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRecetteImpl extends MinimalEObjectImpl.Container implements Recette {
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
	 * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<Ingredient> ingredients;

	/**
	 * The default value of the '{@link #isCalzone() <em>Calzone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalzone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALZONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCalzone() <em>Calzone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalzone()
	 * @generated
	 * @ordered
	 */
	protected boolean calzone = CALZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTempsCuisson() <em>Temps Cuisson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsCuisson()
	 * @generated
	 * @ordered
	 */
	protected static final float TEMPS_CUISSON_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTempsCuisson() <em>Temps Cuisson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsCuisson()
	 * @generated
	 * @ordered
	 */
	protected float tempsCuisson = TEMPS_CUISSON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRecetteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MPizzeriaPackage.Literals.RECETTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MPizzeriaPackage.RECETTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ingredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentEList<Ingredient>(Ingredient.class, this,
					MPizzeriaPackage.RECETTE__INGREDIENTS);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCalzone() {
		return calzone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalzone(boolean newCalzone) {
		boolean oldCalzone = calzone;
		calzone = newCalzone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MPizzeriaPackage.RECETTE__CALZONE, oldCalzone,
					calzone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTempsCuisson() {
		return tempsCuisson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempsCuisson(float newTempsCuisson) {
		float oldTempsCuisson = tempsCuisson;
		tempsCuisson = newTempsCuisson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MPizzeriaPackage.RECETTE__TEMPS_CUISSON,
					oldTempsCuisson, tempsCuisson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MPizzeriaPackage.RECETTE__INGREDIENTS:
			return ((InternalEList<?>) getIngredients()).basicRemove(otherEnd, msgs);
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
		case MPizzeriaPackage.RECETTE__NAME:
			return getName();
		case MPizzeriaPackage.RECETTE__INGREDIENTS:
			return getIngredients();
		case MPizzeriaPackage.RECETTE__CALZONE:
			return isCalzone();
		case MPizzeriaPackage.RECETTE__TEMPS_CUISSON:
			return getTempsCuisson();
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
		case MPizzeriaPackage.RECETTE__NAME:
			setName((String) newValue);
			return;
		case MPizzeriaPackage.RECETTE__INGREDIENTS:
			getIngredients().clear();
			getIngredients().addAll((Collection<? extends Ingredient>) newValue);
			return;
		case MPizzeriaPackage.RECETTE__CALZONE:
			setCalzone((Boolean) newValue);
			return;
		case MPizzeriaPackage.RECETTE__TEMPS_CUISSON:
			setTempsCuisson((Float) newValue);
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
		case MPizzeriaPackage.RECETTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MPizzeriaPackage.RECETTE__INGREDIENTS:
			getIngredients().clear();
			return;
		case MPizzeriaPackage.RECETTE__CALZONE:
			setCalzone(CALZONE_EDEFAULT);
			return;
		case MPizzeriaPackage.RECETTE__TEMPS_CUISSON:
			setTempsCuisson(TEMPS_CUISSON_EDEFAULT);
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
		case MPizzeriaPackage.RECETTE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MPizzeriaPackage.RECETTE__INGREDIENTS:
			return ingredients != null && !ingredients.isEmpty();
		case MPizzeriaPackage.RECETTE__CALZONE:
			return calzone != CALZONE_EDEFAULT;
		case MPizzeriaPackage.RECETTE__TEMPS_CUISSON:
			return tempsCuisson != TEMPS_CUISSON_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(", calzone: ");
		result.append(calzone);
		result.append(", tempsCuisson: ");
		result.append(tempsCuisson);
		result.append(')');
		return result.toString();
	}

} //MRecetteImpl
