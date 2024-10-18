/**
 */
package btcpp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see btcpp.BtcppPackage#getNodeType()
 * @model
 * @generated
 */
public enum NodeType implements Enumerator {
	/**
	 * The '<em><b>UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "UNDEFINED", "UNDEFINED"),

	/**
	 * The '<em><b>ACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION(1, "ACTION", "ACTION"),

	/**
	 * The '<em><b>CONDITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION(2, "CONDITION", "CONDITION"),

	/**
	 * The '<em><b>CONTROL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL(3, "CONTROL", "CONTROL"),

	/**
	 * The '<em><b>DECORATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECORATOR_VALUE
	 * @generated
	 * @ordered
	 */
	DECORATOR(4, "DECORATOR", "DECORATOR"),

	/**
	 * The '<em><b>SUBTREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTREE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTREE(5, "SUBTREE", "SUBTREE");

	/**
	 * The '<em><b>UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>ACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_VALUE = 1;

	/**
	 * The '<em><b>CONDITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_VALUE = 2;

	/**
	 * The '<em><b>CONTROL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_VALUE = 3;

	/**
	 * The '<em><b>DECORATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECORATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECORATOR_VALUE = 4;

	/**
	 * The '<em><b>SUBTREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBTREE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Node Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeType[] VALUES_ARRAY =
		new NodeType[] {
			UNDEFINED,
			ACTION,
			CONDITION,
			CONTROL,
			DECORATOR,
			SUBTREE,
		};

	/**
	 * A public read-only list of all the '<em><b>Node Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NodeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeType get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case ACTION_VALUE: return ACTION;
			case CONDITION_VALUE: return CONDITION;
			case CONTROL_VALUE: return CONTROL;
			case DECORATOR_VALUE: return DECORATOR;
			case SUBTREE_VALUE: return SUBTREE;
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
	private NodeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //NodeType
