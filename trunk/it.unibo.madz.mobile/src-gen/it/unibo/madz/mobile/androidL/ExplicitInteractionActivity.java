/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Interaction Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.ExplicitInteractionActivity#getDest <em>Dest</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.ExplicitInteractionActivity#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getExplicitInteractionActivity()
 * @model
 * @generated
 */
public interface ExplicitInteractionActivity extends ExplicitInteraction
{
  /**
   * Returns the value of the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' reference.
   * @see #setDest(Activity)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getExplicitInteractionActivity_Dest()
   * @model
   * @generated
   */
  Activity getDest();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.ExplicitInteractionActivity#getDest <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' reference.
   * @see #getDest()
   * @generated
   */
  void setDest(Activity value);

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
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getExplicitInteractionActivity_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.ExplicitInteractionActivity#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

} // ExplicitInteractionActivity
