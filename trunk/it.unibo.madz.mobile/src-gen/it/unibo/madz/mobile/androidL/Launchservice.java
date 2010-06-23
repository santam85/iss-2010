/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launchservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.Launchservice#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getLaunchservice()
 * @model
 * @generated
 */
public interface Launchservice extends ExplicitInteractionService
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
   * @see #setDest(Service)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getLaunchservice_Dest()
   * @model
   * @generated
   */
  Service getDest();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Launchservice#getDest <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' reference.
   * @see #getDest()
   * @generated
   */
  void setDest(Service value);

} // Launchservice
