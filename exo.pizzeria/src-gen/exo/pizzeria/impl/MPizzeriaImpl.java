/**
 */
package exo.pizzeria.impl;

import exo.pizzeria.Client;
import exo.pizzeria.MPizzeriaPackage;
import exo.pizzeria.Pizza;
import exo.pizzeria.Pizzeria;

import exo.pizzeria.Table;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pizzeria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.impl.MPizzeriaImpl#getPizza <em>Pizza</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MPizzeriaImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MPizzeriaImpl#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPizzeriaImpl extends MinimalEObjectImpl.Container implements Pizzeria {
	/**
	 * The cached value of the '{@link #getPizza() <em>Pizza</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPizza()
	 * @generated
	 * @ordered
	 */
	protected EList<Pizza> pizza;

	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> clients;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> tables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPizzeriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MPizzeriaPackage.Literals.PIZZERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pizza> getPizza() {
		if (pizza == null) {
			pizza = new EObjectContainmentEList<Pizza>(Pizza.class, this, MPizzeriaPackage.PIZZERIA__PIZZA);
		}
		return pizza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClients() {
		if (clients == null) {
			clients = new EObjectContainmentEList.Unsettable<Client>(Client.class, this,
					MPizzeriaPackage.PIZZERIA__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClients() {
		if (clients != null)
			((InternalEList.Unsettable<?>) clients).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClients() {
		return clients != null && ((InternalEList.Unsettable<?>) clients).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<Table>(Table.class, this, MPizzeriaPackage.PIZZERIA__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MPizzeriaPackage.PIZZERIA__PIZZA:
			return ((InternalEList<?>) getPizza()).basicRemove(otherEnd, msgs);
		case MPizzeriaPackage.PIZZERIA__CLIENTS:
			return ((InternalEList<?>) getClients()).basicRemove(otherEnd, msgs);
		case MPizzeriaPackage.PIZZERIA__TABLES:
			return ((InternalEList<?>) getTables()).basicRemove(otherEnd, msgs);
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
		case MPizzeriaPackage.PIZZERIA__PIZZA:
			return getPizza();
		case MPizzeriaPackage.PIZZERIA__CLIENTS:
			return getClients();
		case MPizzeriaPackage.PIZZERIA__TABLES:
			return getTables();
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
		case MPizzeriaPackage.PIZZERIA__PIZZA:
			getPizza().clear();
			getPizza().addAll((Collection<? extends Pizza>) newValue);
			return;
		case MPizzeriaPackage.PIZZERIA__CLIENTS:
			getClients().clear();
			getClients().addAll((Collection<? extends Client>) newValue);
			return;
		case MPizzeriaPackage.PIZZERIA__TABLES:
			getTables().clear();
			getTables().addAll((Collection<? extends Table>) newValue);
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
		case MPizzeriaPackage.PIZZERIA__PIZZA:
			getPizza().clear();
			return;
		case MPizzeriaPackage.PIZZERIA__CLIENTS:
			unsetClients();
			return;
		case MPizzeriaPackage.PIZZERIA__TABLES:
			getTables().clear();
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
		case MPizzeriaPackage.PIZZERIA__PIZZA:
			return pizza != null && !pizza.isEmpty();
		case MPizzeriaPackage.PIZZERIA__CLIENTS:
			return isSetClients();
		case MPizzeriaPackage.PIZZERIA__TABLES:
			return tables != null && !tables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MPizzeriaImpl
