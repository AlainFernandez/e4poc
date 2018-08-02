/**
 */
package exo.pizzeria;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.MTable#getId <em>Id</em>}</li>
 *   <li>{@link exo.pizzeria.MTable#getClient <em>Client</em>}</li>
 * </ul>
 *
 * @see exo.pizzeria.MPizzeriaPackage#getTable()
 * @model
 * @generated
 */
public interface MTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see exo.pizzeria.MPizzeriaPackage#getTable_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link exo.pizzeria.MTable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link exo.pizzeria.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see exo.pizzeria.MPizzeriaPackage#getTable_Client()
	 * @model upper="6"
	 * @generated
	 */
	EList<Client> getClient();

} // MTable
