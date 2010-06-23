/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.Application#getName <em>Name</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.Application#getAvd <em>Avd</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.Application#getWorkDir <em>Work Dir</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.Application#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.Application#getMainActivity <em>Main Activity</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.Application#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.Application#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
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
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getApplication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Application#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Avd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Avd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Avd</em>' attribute.
   * @see #setAvd(int)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getApplication_Avd()
   * @model
   * @generated
   */
  int getAvd();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Application#getAvd <em>Avd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Avd</em>' attribute.
   * @see #getAvd()
   * @generated
   */
  void setAvd(int value);

  /**
   * Returns the value of the '<em><b>Work Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Dir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Dir</em>' attribute.
   * @see #setWorkDir(String)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getApplication_WorkDir()
   * @model
   * @generated
   */
  String getWorkDir();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Application#getWorkDir <em>Work Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Work Dir</em>' attribute.
   * @see #getWorkDir()
   * @generated
   */
  void setWorkDir(String value);

  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getApplication_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Application#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Main Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main Activity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main Activity</em>' reference.
   * @see #setMainActivity(Activity)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getApplication_MainActivity()
   * @model
   * @generated
   */
  Activity getMainActivity();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Application#getMainActivity <em>Main Activity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main Activity</em>' reference.
   * @see #getMainActivity()
   * @generated
   */
  void setMainActivity(Activity value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(int)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getApplication_Target()
   * @model
   * @generated
   */
  int getTarget();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Application#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(int value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see it.unibo.madz.mobile.androidL.AndroidLPackage#getApplication_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link it.unibo.madz.mobile.androidL.Application#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // Application
