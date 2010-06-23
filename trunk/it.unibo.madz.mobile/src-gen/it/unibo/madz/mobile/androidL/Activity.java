/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.Activity#isLaunchable <em>Launchable</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.Activity#getActions <em>Actions</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.Activity#getInteractions <em>Interactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Component
{
  /**
   * Returns the value of the '<em><b>Launchable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Launchable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Launchable</em>' attribute.
   * @see #setLaunchable(boolean)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getActivity_Launchable()
   * @model
   * @generated
   */
  boolean isLaunchable();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Activity#isLaunchable <em>Launchable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Launchable</em>' attribute.
   * @see #isLaunchable()
   * @generated
   */
  void setLaunchable(boolean value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.madz.mobile.androidL.LocalAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getActivity_Actions()
   * @model containment="true"
   * @generated
   */
  EList<LocalAction> getActions();

  /**
   * Returns the value of the '<em><b>Interactions</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.madz.mobile.androidL.InterAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactions</em>' containment reference list.
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getActivity_Interactions()
   * @model containment="true"
   * @generated
   */
  EList<InterAction> getInteractions();

} // Activity
