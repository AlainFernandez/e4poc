/**
 */
package exo.pizzeria;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pizza</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.MPizza#getName <em>Name</em>}</li>
 *   <li>{@link exo.pizzeria.MPizza#getIngredient <em>Ingredient</em>}</li>
 *   <li>{@link exo.pizzeria.MPizza#getEtat <em>Etat</em>}</li>
 * </ul>
 *
 * @see exo.pizzeria.MPizzeriaPackage#getPizza()
 * @model
 * @generated
 */
public interface MPizza extends EObject {
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
	 * @see exo.pizzeria.MPizzeriaPackage#getPizza_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link exo.pizzeria.MPizza#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ingredient</b></em>' containment reference list.
	 * The list contents are of type {@link exo.pizzeria.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient</em>' containment reference list.
	 * @see exo.pizzeria.MPizzeriaPackage#getPizza_Ingredient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ingredient> getIngredient();

	/**
	 * Returns the value of the '<em><b>Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link exo.pizzeria.EtatPizza}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat</em>' attribute.
	 * @see exo.pizzeria.EtatPizza
	 * @see #setEtat(EtatPizza)
	 * @see exo.pizzeria.MPizzeriaPackage#getPizza_Etat()
	 * @model
	 * @generated
	 */
	EtatPizza getEtat();

	/**
	 * Sets the value of the '{@link exo.pizzeria.MPizza#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see exo.pizzeria.EtatPizza
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(EtatPizza value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	float getPrice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int numberSale();

} // MPizza
