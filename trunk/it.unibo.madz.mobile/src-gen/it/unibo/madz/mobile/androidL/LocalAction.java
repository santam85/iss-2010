/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.LocalAction#getAction <em>Action</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.LocalAction#isButton <em>Button</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getLocalAction()
 * @model
 * @generated
 */
public interface LocalAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getLocalAction_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.LocalAction#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Button</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Button</em>' attribute.
   * @see #setButton(boolean)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getLocalAction_Button()
   * @model
   * @generated
   */
  boolean isButton();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.LocalAction#isButton <em>Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Button</em>' attribute.
   * @see #isButton()
   * @generated
   */
  void setButton(boolean value);

} // LocalAction
