/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.UseService#getDest <em>Dest</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.UseService#getOperation <em>Operation</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.UseService#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getUseService()
 * @model
 * @generated
 */
public interface UseService extends ExplicitInteractionService
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
   * @see #setDest(ServiceInterface)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getUseService_Dest()
   * @model
   * @generated
   */
  ServiceInterface getDest();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.UseService#getDest <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' reference.
   * @see #getDest()
   * @generated
   */
  void setDest(ServiceInterface value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' reference.
   * @see #setOperation(LocalOperation)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getUseService_Operation()
   * @model
   * @generated
   */
  LocalOperation getOperation();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.UseService#getOperation <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(LocalOperation value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' attribute list.
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getUseService_Arg()
   * @model unique="false"
   * @generated
   */
  EList<String> getArg();

} // UseService
