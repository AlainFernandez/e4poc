/**
 */
package exo.pizzeria.impl;

import exo.pizzeria.Client;
import exo.pizzeria.MPizzeriaPackage;
import exo.pizzeria.Pizza;
import exo.pizzeria.Pizzeria;

import exo.pizzeria.Table;
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
 * An implementation of the model object '<em><b>Pizzeria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.impl.MPizzeriaImpl#getPizza <em>Pizza</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MPizzeriaImpl#getClient <em>Client</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MPizzeriaImpl#getTable <em>Table</em>}</li>
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
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table> table;

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
	public Client getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject) client;
			client = (Client) eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MPizzeriaPackage.PIZZERIA__CLIENT,
							oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Client newClient) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MPizzeriaPackage.PIZZERIA__CLIENT, oldClient,
					client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Table> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<Table>(Table.class, this, MPizzeriaPackage.PIZZERIA__TABLE);
		}
		return table;
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
		case MPizzeriaPackage.PIZZERIA__TABLE:
			return ((InternalEList<?>) getTable()).basicRemove(otherEnd, msgs);
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
		case MPizzeriaPackage.PIZZERIA__CLIENT:
			if (resolve)
				return getClient();
			return basicGetClient();
		case MPizzeriaPackage.PIZZERIA__TABLE:
			return getTable();
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
		case MPizzeriaPackage.PIZZERIA__CLIENT:
			setClient((Client) newValue);
			return;
		case MPizzeriaPackage.PIZZERIA__TABLE:
			getTable().clear();
			getTable().addAll((Collection<? extends Table>) newValue);
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
		case MPizzeriaPackage.PIZZERIA__CLIENT:
			setClient((Client) null);
			return;
		case MPizzeriaPackage.PIZZERIA__TABLE:
			getTable().clear();
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
		case MPizzeriaPackage.PIZZERIA__CLIENT:
			return client != null;
		case MPizzeriaPackage.PIZZERIA__TABLE:
			return table != null && !table.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MPizzeriaImpl
