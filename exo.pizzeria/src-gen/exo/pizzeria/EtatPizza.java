/**
 */
package exo.pizzeria;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Etat Pizza</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see exo.pizzeria.MPizzeriaPackage#getEtatPizza()
 * @model
 * @generated
 */
public enum EtatPizza implements Enumerator {
	/**
	 * The '<em><b>Commandee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMANDEE_VALUE
	 * @generated
	 * @ordered
	 */
	COMMANDEE(0, "commandee", "commandee"),

	/**
	 * The '<em><b>En Preparation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EN_PREPARATION_VALUE
	 * @generated
	 * @ordered
	 */
	EN_PREPARATION(1, "enPreparation", "enPreparation"),

	/**
	 * The '<em><b>Livree</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIVREE_VALUE
	 * @generated
	 * @ordered
	 */
	LIVREE(2, "livree", "livree"),

	/**
	 * The '<em><b>Payee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYEE_VALUE
	 * @generated
	 * @ordered
	 */
	PAYEE(3, "payee", "payee");

	/**
	 * The '<em><b>Commandee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Commandee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMANDEE
	 * @model name="commandee"
	 * @generated
	 * @ordered
	 */
	public static final int COMMANDEE_VALUE = 0;

	/**
	 * The '<em><b>En Preparation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>En Preparation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EN_PREPARATION
	 * @model name="enPreparation"
	 * @generated
	 * @ordered
	 */
	public static final int EN_PREPARATION_VALUE = 1;

	/**
	 * The '<em><b>Livree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Livree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIVREE
	 * @model name="livree"
	 * @generated
	 * @ordered
	 */
	public static final int LIVREE_VALUE = 2;

	/**
	 * The '<em><b>Payee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payee</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYEE
	 * @model name="payee"
	 * @generated
	 * @ordered
	 */
	public static final int PAYEE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Etat Pizza</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EtatPizza[] VALUES_ARRAY = new EtatPizza[] { COMMANDEE, EN_PREPARATION, LIVREE, PAYEE, };

	/**
	 * A public read-only list of all the '<em><b>Etat Pizza</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EtatPizza> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Etat Pizza</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EtatPizza get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EtatPizza result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Etat Pizza</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EtatPizza getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EtatPizza result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Etat Pizza</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EtatPizza get(int value) {
		switch (value) {
		case COMMANDEE_VALUE:
			return COMMANDEE;
		case EN_PREPARATION_VALUE:
			return EN_PREPARATION;
		case LIVREE_VALUE:
			return LIVREE;
		case PAYEE_VALUE:
			return PAYEE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EtatPizza(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EtatPizza
