/**
 */
package exo.pizzeria;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.MPizzeriaChain#getName <em>Name</em>}</li>
 *   <li>{@link exo.pizzeria.MPizzeriaChain#getMagasins <em>Magasins</em>}</li>
 * </ul>
 *
 * @see exo.pizzeria.MPizzeriaPackage#getPizzeriaChain()
 * @model
 * @generated
 */
public interface MPizzeriaChain extends EObject {
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
	 * @see exo.pizzeria.MPizzeriaPackage#getPizzeriaChain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link exo.pizzeria.MPizzeriaChain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Magasins</b></em>' containment reference list.
	 * The list contents are of type {@link exo.pizzeria.Pizzeria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magasins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magasins</em>' containment reference list.
	 * @see exo.pizzeria.MPizzeriaPackage#getPizzeriaChain_Magasins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pizzeria> getMagasins();

} // MPizzeriaChain
