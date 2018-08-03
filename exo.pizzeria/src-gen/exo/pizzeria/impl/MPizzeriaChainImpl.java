/**
 */
package exo.pizzeria.impl;

import exo.pizzeria.MPizzeriaPackage;
import exo.pizzeria.Pizzeria;
import exo.pizzeria.PizzeriaChain;

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
 * An implementation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.impl.MPizzeriaChainImpl#getName <em>Name</em>}</li>
 *   <li>{@link exo.pizzeria.impl.MPizzeriaChainImpl#getMagasins <em>Magasins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPizzeriaChainImpl extends MinimalEObjectImpl.Container implements PizzeriaChain {
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
	 * The cached value of the '{@link #getMagasins() <em>Magasins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagasins()
	 * @generated
	 * @ordered
	 */
	protected EList<Pizzeria> magasins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPizzeriaChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MPizzeriaPackage.Literals.PIZZERIA_CHAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MPizzeriaPackage.PIZZERIA_CHAIN__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pizzeria> getMagasins() {
		if (magasins == null) {
			magasins = new EObjectContainmentEList<Pizzeria>(Pizzeria.class, this,
					MPizzeriaPackage.PIZZERIA_CHAIN__MAGASINS);
		}
		return magasins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MPizzeriaPackage.PIZZERIA_CHAIN__MAGASINS:
			return ((InternalEList<?>) getMagasins()).basicRemove(otherEnd, msgs);
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
		case MPizzeriaPackage.PIZZERIA_CHAIN__NAME:
			return getName();
		case MPizzeriaPackage.PIZZERIA_CHAIN__MAGASINS:
			return getMagasins();
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
		case MPizzeriaPackage.PIZZERIA_CHAIN__NAME:
			setName((String) newValue);
			return;
		case MPizzeriaPackage.PIZZERIA_CHAIN__MAGASINS:
			getMagasins().clear();
			getMagasins().addAll((Collection<? extends Pizzeria>) newValue);
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
		case MPizzeriaPackage.PIZZERIA_CHAIN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MPizzeriaPackage.PIZZERIA_CHAIN__MAGASINS:
			getMagasins().clear();
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
		case MPizzeriaPackage.PIZZERIA_CHAIN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MPizzeriaPackage.PIZZERIA_CHAIN__MAGASINS:
			return magasins != null && !magasins.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //MPizzeriaChainImpl
