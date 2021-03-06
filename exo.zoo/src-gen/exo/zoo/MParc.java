/**
 */
package exo.zoo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exo.zoo.MParc#getAnimal <em>Animal</em>}</li>
 * </ul>
 *
 * @see exo.zoo.MZooPackage#getParc()
 * @model
 * @generated
 */
public interface MParc extends EObject {
	/**
	 * Returns the value of the '<em><b>Animal</b></em>' containment reference list.
	 * The list contents are of type {@link exo.zoo.Animal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animal</em>' containment reference list.
	 * @see exo.zoo.MZooPackage#getParc_Animal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Animal> getAnimal();

} // MParc
