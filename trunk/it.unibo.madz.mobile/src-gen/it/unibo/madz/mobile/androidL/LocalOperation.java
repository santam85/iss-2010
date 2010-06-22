/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.LocalOperation#getName <em>Name</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.LocalOperation#getReturn <em>Return</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.LocalOperation#getInputType <em>Input Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getLocalOperation()
 * @model
 * @generated
 */
public interface LocalOperation extends EObject
{
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
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getLocalOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.LocalOperation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' attribute.
   * @see #setReturn(String)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getLocalOperation_Return()
   * @model
   * @generated
   */
  String getReturn();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.LocalOperation#getReturn <em>Return</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' attribute.
   * @see #getReturn()
   * @generated
   */
  void setReturn(String value);

  /**
   * Returns the value of the '<em><b>Input Type</b></em>' attribute list.
   * The list contents are of type {@link it.unibo.madz.mobile.androidL.InputType}.
   * The literals are from the enumeration {@link it.unibo.madz.mobile.androidL.InputType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Type</em>' attribute list.
   * @see it.unibo.madz.mobile.androidL.InputType
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getLocalOperation_InputType()
   * @model unique="false"
   * @generated
   */
  EList<InputType> getInputType();

} // LocalOperation
