/**
 */
package exo.zoo.impl;

import exo.zoo.Animal;
import exo.zoo.ZooPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AnimalImpl extends MinimalEObjectImpl.Container implements Animal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZooPackage.Literals.ANIMAL;
	}

} //AnimalImpl
