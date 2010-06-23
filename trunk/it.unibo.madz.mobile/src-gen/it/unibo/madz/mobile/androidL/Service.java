/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.Service#getInterface <em>Interface</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.Service#getServiceInteraction <em>Service Interaction</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Component
{
  /**
   * Returns the value of the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' reference.
   * @see #setInterface(ServiceInterface)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getService_Interface()
   * @model
   * @generated
   */
  ServiceInterface getInterface();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Service#getInterface <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(ServiceInterface value);

  /**
   * Returns the value of the '<em><b>Service Interaction</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.madz.mobile.androidL.ExplicitInteractionService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Interaction</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Interaction</em>' containment reference list.
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getService_ServiceInteraction()
   * @model containment="true"
   * @generated
   */
  EList<ExplicitInteractionService> getServiceInteraction();

} // Service
