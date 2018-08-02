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
 *   <li>{@link exo.pizzeria.MPizzeria#getClients <em>Clients</em>}</li>
 *   <li>{@link exo.pizzeria.MPizzeria#getTables <em>Tables</em>}</li>
 *   <li>{@link exo.pizzeria.MPizzeria#getRecettes <em>Recettes</em>}</li>
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
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link exo.pizzeria.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see #isSetClients()
	 * @see #unsetClients()
	 * @see exo.pizzeria.MPizzeriaPackage#getPizzeria_Clients()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	EList<Client> getClients();

	/**
	 * Unsets the value of the '{@link exo.pizzeria.MPizzeria#getClients <em>Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClients()
	 * @see #getClients()
	 * @generated
	 */
	void unsetClients();

	/**
	 * Returns whether the value of the '{@link exo.pizzeria.MPizzeria#getClients <em>Clients</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clients</em>' containment reference list is set.
	 * @see #unsetClients()
	 * @see #getClients()
	 * @generated
	 */
	boolean isSetClients();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link exo.pizzeria.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see exo.pizzeria.MPizzeriaPackage#getPizzeria_Tables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Recettes</b></em>' containment reference list.
	 * The list contents are of type {@link exo.pizzeria.Recette}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recettes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recettes</em>' containment reference list.
	 * @see exo.pizzeria.MPizzeriaPackage#getPizzeria_Recettes()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Recette> getRecettes();

} // MPizzeria
