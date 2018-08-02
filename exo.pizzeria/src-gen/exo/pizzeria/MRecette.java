/**
 */
package exo.pizzeria;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link exo.pizzeria.MRecette#getName <em>Name</em>}</li>
 *   <li>{@link exo.pizzeria.MRecette#getIngredients <em>Ingredients</em>}</li>
 *   <li>{@link exo.pizzeria.MRecette#isCalzone <em>Calzone</em>}</li>
 *   <li>{@link exo.pizzeria.MRecette#getTempsCuisson <em>Temps Cuisson</em>}</li>
 * </ul>
 *
 * @see exo.pizzeria.MPizzeriaPackage#getRecette()
 * @model
 * @generated
 */
public interface MRecette extends EObject {
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
	 * @see exo.pizzeria.MPizzeriaPackage#getRecette_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link exo.pizzeria.MRecette#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ingredients</b></em>' containment reference list.
	 * The list contents are of type {@link exo.pizzeria.Ingredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredients</em>' containment reference list.
	 * @see exo.pizzeria.MPizzeriaPackage#getRecette_Ingredients()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Ingredient> getIngredients();

	/**
	 * Returns the value of the '<em><b>Calzone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calzone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calzone</em>' attribute.
	 * @see #setCalzone(boolean)
	 * @see exo.pizzeria.MPizzeriaPackage#getRecette_Calzone()
	 * @model
	 * @generated
	 */
	boolean isCalzone();

	/**
	 * Sets the value of the '{@link exo.pizzeria.MRecette#isCalzone <em>Calzone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calzone</em>' attribute.
	 * @see #isCalzone()
	 * @generated
	 */
	void setCalzone(boolean value);

	/**
	 * Returns the value of the '<em><b>Temps Cuisson</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps Cuisson</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Cuisson</em>' attribute.
	 * @see #setTempsCuisson(float)
	 * @see exo.pizzeria.MPizzeriaPackage#getRecette_TempsCuisson()
	 * @model
	 * @generated
	 */
	float getTempsCuisson();

	/**
	 * Sets the value of the '{@link exo.pizzeria.MRecette#getTempsCuisson <em>Temps Cuisson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Cuisson</em>' attribute.
	 * @see #getTempsCuisson()
	 * @generated
	 */
	void setTempsCuisson(float value);

} // MRecette
