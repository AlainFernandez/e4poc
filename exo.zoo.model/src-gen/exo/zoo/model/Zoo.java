/**
 */
package exo.zoo.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zoo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exo.zoo.model.Zoo#getName <em>Name</em>}</li>
 *   <li>{@link exo.zoo.model.Zoo#getParc <em>Parc</em>}</li>
 * </ul>
 *
 * @see exo.zoo.model.ModelPackage#getZoo()
 * @model
 * @generated
 */
public interface Zoo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see exo.zoo.model.ModelPackage#getZoo_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link exo.zoo.model.Zoo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parc</b></em>' containment reference list.
	 * The list contents are of type {@link exo.zoo.model.Parc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parc</em>' containment reference list.
	 * @see exo.zoo.model.ModelPackage#getZoo_Parc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parc> getParc();

} // Zoo
