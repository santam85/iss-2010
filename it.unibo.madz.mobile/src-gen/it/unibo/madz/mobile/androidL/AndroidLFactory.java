/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage
 * @generated
 */
public interface AndroidLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AndroidLFactory eINSTANCE = it.unibo.madz.mobile.androidL.impl.AndroidLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Android System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Android System</em>'.
   * @generated
   */
  AndroidSystem createAndroidSystem();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Service Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Interface</em>'.
   * @generated
   */
  ServiceInterface createServiceInterface();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity</em>'.
   * @generated
   */
  Activity createActivity();

  /**
   * Returns a new object of class '<em>Local Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Action</em>'.
   * @generated
   */
  LocalAction createLocalAction();

  /**
   * Returns a new object of class '<em>Inter Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inter Action</em>'.
   * @generated
   */
  InterAction createInterAction();

  /**
   * Returns a new object of class '<em>Explicit Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explicit Interaction</em>'.
   * @generated
   */
  ExplicitInteraction createExplicitInteraction();

  /**
   * Returns a new object of class '<em>Explicit Interaction Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explicit Interaction Activity</em>'.
   * @generated
   */
  ExplicitInteractionActivity createExplicitInteractionActivity();

  /**
   * Returns a new object of class '<em>Action Only Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Only Interaction</em>'.
   * @generated
   */
  ActionOnlyInteraction createActionOnlyInteraction();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data</em>'.
   * @generated
   */
  Data createData();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AndroidLPackage getAndroidLPackage();

} //AndroidLFactory
