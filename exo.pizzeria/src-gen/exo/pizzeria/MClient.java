/**
 */
package exo.pizzeria;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.MClient#getName <em>Name</em>}</li>
 *   <li>{@link exo.pizzeria.MClient#getLike <em>Like</em>}</li>
 * </ul>
 *
 * @see exo.pizzeria.MPizzeriaPackage#getClient()
 * @model
 * @generated
 */
public interface MClient extends EObject {
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
	 * @see exo.pizzeria.MPizzeriaPackage#getClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link exo.pizzeria.MClient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Like</b></em>' reference list.
	 * The list contents are of type {@link exo.pizzeria.Pizza}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Like</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Like</em>' reference list.
	 * @see exo.pizzeria.MPizzeriaPackage#getClient_Like()
	 * @model
	 * @generated
	 */
	EList<Pizza> getLike();

} // MClient
