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
 * A representation of the model object '<em><b>Android System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.AndroidSystem#getName <em>Name</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.AndroidSystem#getData <em>Data</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.AndroidSystem#getAction <em>Action</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.AndroidSystem#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.AndroidSystem#getComponent <em>Component</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.AndroidSystem#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getAndroidSystem()
 * @model
 * @generated
 */
public interface AndroidSystem extends EObject
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
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getAndroidSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.AndroidSystem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.madz.mobile.androidL.Data}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference list.
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getAndroidSystem_Data()
   * @model containment="true"
   * @generated
   */
  EList<Data> getData();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.madz.mobile.androidL.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getAndroidSystem_Action()
   * @model containment="true"
   * @generated
   */
  EList<Action> getAction();

  /**
   * Returns the value of the '<em><b>Service Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Interface</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Interface</em>' containment reference.
   * @see #setServiceInterface(ServiceInterface)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getAndroidSystem_ServiceInterface()
   * @model containment="true"
   * @generated
   */
  ServiceInterface getServiceInterface();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.AndroidSystem#getServiceInterface <em>Service Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Interface</em>' containment reference.
   * @see #getServiceInterface()
   * @generated
   */
  void setServiceInterface(ServiceInterface value);

  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference list.
   * The list contents are of type {@link it.unibo.madz.mobile.androidL.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference list.
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getAndroidSystem_Component()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponent();

  /**
   * Returns the value of the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' containment reference.
   * @see #setApplication(Application)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getAndroidSystem_Application()
   * @model containment="true"
   * @generated
   */
  Application getApplication();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.AndroidSystem#getApplication <em>Application</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' containment reference.
   * @see #getApplication()
   * @generated
   */
  void setApplication(Application value);

} // AndroidSystem
