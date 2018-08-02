/**
 */
package exo.pizzeria;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pizzeria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.MPizzeria#getPizza <em>Pizza</em>}</li>
 *   <li>{@link exo.pizzeria.MPizzeria#getClient <em>Client</em>}</li>
 *   <li>{@link exo.pizzeria.MPizzeria#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see exo.pizzeria.MPizzeriaPackage#getPizzeria()
 * @model
 * @generated
 */
public interface MPizzeria extends EObject {
	/**
	 * Returns the value of the '<em><b>Pizza</b></em>' containment reference list.
	 * The list contents are of type {@link exo.pizzeria.Pizza}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pizza</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pizza</em>' containment reference list.
	 * @see exo.pizzeria.MPizzeriaPackage#getPizzeria_Pizza()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pizza> getPizza();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Client)
	 * @see exo.pizzeria.MPizzeriaPackage#getPizzeria_Client()
	 * @model
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link exo.pizzeria.MPizzeria#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link exo.pizzeria.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see exo.pizzeria.MPizzeriaPackage#getPizzeria_Table()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTable();

} // MPizzeria
