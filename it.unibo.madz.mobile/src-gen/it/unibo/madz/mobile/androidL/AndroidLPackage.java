/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.unibo.madz.mobile.androidL.AndroidLFactory
 * @model kind="package"
 * @generated
 */
public interface AndroidLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "androidL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.unibo.it/madz/mobile/AndroidL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "androidL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AndroidLPackage eINSTANCE = it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl.init();

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl <em>Android System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getAndroidSystem()
   * @generated
   */
  int ANDROID_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_SYSTEM__DATA = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_SYSTEM__ACTION = 1;

  /**
   * The feature id for the '<em><b>Service Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_SYSTEM__SERVICE_INTERFACE = 2;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_SYSTEM__COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_SYSTEM__APPLICATION = 4;

  /**
   * The number of structural features of the '<em>Android System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_SYSTEM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.ComponentImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.ServiceInterfaceImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getServiceInterface()
   * @generated
   */
  int SERVICE_INTERFACE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_INTERFACE__NAME = 0;

  /**
   * The number of structural features of the '<em>Service Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_INTERFACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.ServiceImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getService()
   * @generated
   */
  int SERVICE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__INTERFACE = COMPONENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.ActivityImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = COMPONENT__NAME;

  /**
   * The feature id for the '<em><b>Launchable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__LAUNCHABLE = COMPONENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ACTIONS = COMPONENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__INTERACTIONS = COMPONENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.LocalActionImpl <em>Local Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.LocalActionImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getLocalAction()
   * @generated
   */
  int LOCAL_ACTION = 5;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ACTION__ACTION = 0;

  /**
   * The feature id for the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ACTION__BUTTON = 1;

  /**
   * The number of structural features of the '<em>Local Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_ACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.InterActionImpl <em>Inter Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.InterActionImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getInterAction()
   * @generated
   */
  int INTER_ACTION = 6;

  /**
   * The feature id for the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_ACTION__BUTTON = 0;

  /**
   * The number of structural features of the '<em>Inter Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTER_ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.ExplicitInteractionImpl <em>Explicit Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.ExplicitInteractionImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getExplicitInteraction()
   * @generated
   */
  int EXPLICIT_INTERACTION = 7;

  /**
   * The feature id for the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_INTERACTION__BUTTON = INTER_ACTION__BUTTON;

  /**
   * The number of structural features of the '<em>Explicit Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_INTERACTION_FEATURE_COUNT = INTER_ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.ExplicitInteractionActivityImpl <em>Explicit Interaction Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.ExplicitInteractionActivityImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getExplicitInteractionActivity()
   * @generated
   */
  int EXPLICIT_INTERACTION_ACTIVITY = 8;

  /**
   * The feature id for the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_INTERACTION_ACTIVITY__BUTTON = EXPLICIT_INTERACTION__BUTTON;

  /**
   * The feature id for the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_INTERACTION_ACTIVITY__DEST = EXPLICIT_INTERACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_INTERACTION_ACTIVITY__ACTION = EXPLICIT_INTERACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Explicit Interaction Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLICIT_INTERACTION_ACTIVITY_FEATURE_COUNT = EXPLICIT_INTERACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.ActionOnlyInteractionImpl <em>Action Only Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.ActionOnlyInteractionImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getActionOnlyInteraction()
   * @generated
   */
  int ACTION_ONLY_INTERACTION = 9;

  /**
   * The feature id for the '<em><b>Button</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ONLY_INTERACTION__BUTTON = INTER_ACTION__BUTTON;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ONLY_INTERACTION__ACTION = INTER_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Only Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_ONLY_INTERACTION_FEATURE_COUNT = INTER_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.ActionImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__DATA = 1;

  /**
   * The feature id for the '<em><b>Category</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__CATEGORY = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.DataImpl <em>Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.DataImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getData()
   * @generated
   */
  int DATA = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__NAME = 0;

  /**
   * The feature id for the '<em><b>Scheme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__SCHEME = 1;

  /**
   * The feature id for the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__HOST = 2;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__PORT = 3;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__PATH = 4;

  /**
   * The number of structural features of the '<em>Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.unibo.madz.mobile.androidL.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.unibo.madz.mobile.androidL.impl.ApplicationImpl
   * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Avd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__AVD = 1;

  /**
   * The feature id for the '<em><b>Work Dir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__WORK_DIR = 2;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__PACKAGE_NAME = 3;

  /**
   * The feature id for the '<em><b>Main Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__MAIN_ACTIVITY = 4;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__TARGET = 5;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__PATH = 6;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 7;


  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.AndroidSystem <em>Android System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Android System</em>'.
   * @see it.unibo.madz.mobile.androidL.AndroidSystem
   * @generated
   */
  EClass getAndroidSystem();

  /**
   * Returns the meta object for the containment reference list '{@link it.unibo.madz.mobile.androidL.AndroidSystem#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data</em>'.
   * @see it.unibo.madz.mobile.androidL.AndroidSystem#getData()
   * @see #getAndroidSystem()
   * @generated
   */
  EReference getAndroidSystem_Data();

  /**
   * Returns the meta object for the containment reference list '{@link it.unibo.madz.mobile.androidL.AndroidSystem#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action</em>'.
   * @see it.unibo.madz.mobile.androidL.AndroidSystem#getAction()
   * @see #getAndroidSystem()
   * @generated
   */
  EReference getAndroidSystem_Action();

  /**
   * Returns the meta object for the containment reference '{@link it.unibo.madz.mobile.androidL.AndroidSystem#getServiceInterface <em>Service Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Service Interface</em>'.
   * @see it.unibo.madz.mobile.androidL.AndroidSystem#getServiceInterface()
   * @see #getAndroidSystem()
   * @generated
   */
  EReference getAndroidSystem_ServiceInterface();

  /**
   * Returns the meta object for the containment reference list '{@link it.unibo.madz.mobile.androidL.AndroidSystem#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Component</em>'.
   * @see it.unibo.madz.mobile.androidL.AndroidSystem#getComponent()
   * @see #getAndroidSystem()
   * @generated
   */
  EReference getAndroidSystem_Component();

  /**
   * Returns the meta object for the containment reference '{@link it.unibo.madz.mobile.androidL.AndroidSystem#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application</em>'.
   * @see it.unibo.madz.mobile.androidL.AndroidSystem#getApplication()
   * @see #getAndroidSystem()
   * @generated
   */
  EReference getAndroidSystem_Application();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see it.unibo.madz.mobile.androidL.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.unibo.madz.mobile.androidL.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.ServiceInterface <em>Service Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Interface</em>'.
   * @see it.unibo.madz.mobile.androidL.ServiceInterface
   * @generated
   */
  EClass getServiceInterface();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.ServiceInterface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.unibo.madz.mobile.androidL.ServiceInterface#getName()
   * @see #getServiceInterface()
   * @generated
   */
  EAttribute getServiceInterface_Name();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see it.unibo.madz.mobile.androidL.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the reference '{@link it.unibo.madz.mobile.androidL.Service#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface</em>'.
   * @see it.unibo.madz.mobile.androidL.Service#getInterface()
   * @see #getService()
   * @generated
   */
  EReference getService_Interface();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see it.unibo.madz.mobile.androidL.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Activity#isLaunchable <em>Launchable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Launchable</em>'.
   * @see it.unibo.madz.mobile.androidL.Activity#isLaunchable()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Launchable();

  /**
   * Returns the meta object for the containment reference list '{@link it.unibo.madz.mobile.androidL.Activity#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see it.unibo.madz.mobile.androidL.Activity#getActions()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Actions();

  /**
   * Returns the meta object for the containment reference list '{@link it.unibo.madz.mobile.androidL.Activity#getInteractions <em>Interactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interactions</em>'.
   * @see it.unibo.madz.mobile.androidL.Activity#getInteractions()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Interactions();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.LocalAction <em>Local Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Action</em>'.
   * @see it.unibo.madz.mobile.androidL.LocalAction
   * @generated
   */
  EClass getLocalAction();

  /**
   * Returns the meta object for the reference '{@link it.unibo.madz.mobile.androidL.LocalAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see it.unibo.madz.mobile.androidL.LocalAction#getAction()
   * @see #getLocalAction()
   * @generated
   */
  EReference getLocalAction_Action();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.LocalAction#isButton <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Button</em>'.
   * @see it.unibo.madz.mobile.androidL.LocalAction#isButton()
   * @see #getLocalAction()
   * @generated
   */
  EAttribute getLocalAction_Button();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.InterAction <em>Inter Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inter Action</em>'.
   * @see it.unibo.madz.mobile.androidL.InterAction
   * @generated
   */
  EClass getInterAction();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.InterAction#isButton <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Button</em>'.
   * @see it.unibo.madz.mobile.androidL.InterAction#isButton()
   * @see #getInterAction()
   * @generated
   */
  EAttribute getInterAction_Button();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.ExplicitInteraction <em>Explicit Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit Interaction</em>'.
   * @see it.unibo.madz.mobile.androidL.ExplicitInteraction
   * @generated
   */
  EClass getExplicitInteraction();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.ExplicitInteractionActivity <em>Explicit Interaction Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explicit Interaction Activity</em>'.
   * @see it.unibo.madz.mobile.androidL.ExplicitInteractionActivity
   * @generated
   */
  EClass getExplicitInteractionActivity();

  /**
   * Returns the meta object for the reference '{@link it.unibo.madz.mobile.androidL.ExplicitInteractionActivity#getDest <em>Dest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dest</em>'.
   * @see it.unibo.madz.mobile.androidL.ExplicitInteractionActivity#getDest()
   * @see #getExplicitInteractionActivity()
   * @generated
   */
  EReference getExplicitInteractionActivity_Dest();

  /**
   * Returns the meta object for the reference '{@link it.unibo.madz.mobile.androidL.ExplicitInteractionActivity#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see it.unibo.madz.mobile.androidL.ExplicitInteractionActivity#getAction()
   * @see #getExplicitInteractionActivity()
   * @generated
   */
  EReference getExplicitInteractionActivity_Action();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.ActionOnlyInteraction <em>Action Only Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Only Interaction</em>'.
   * @see it.unibo.madz.mobile.androidL.ActionOnlyInteraction
   * @generated
   */
  EClass getActionOnlyInteraction();

  /**
   * Returns the meta object for the reference '{@link it.unibo.madz.mobile.androidL.ActionOnlyInteraction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see it.unibo.madz.mobile.androidL.ActionOnlyInteraction#getAction()
   * @see #getActionOnlyInteraction()
   * @generated
   */
  EReference getActionOnlyInteraction_Action();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see it.unibo.madz.mobile.androidL.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.unibo.madz.mobile.androidL.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the reference '{@link it.unibo.madz.mobile.androidL.Action#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data</em>'.
   * @see it.unibo.madz.mobile.androidL.Action#getData()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Data();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Action#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category</em>'.
   * @see it.unibo.madz.mobile.androidL.Action#getCategory()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Category();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data</em>'.
   * @see it.unibo.madz.mobile.androidL.Data
   * @generated
   */
  EClass getData();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Data#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.unibo.madz.mobile.androidL.Data#getName()
   * @see #getData()
   * @generated
   */
  EAttribute getData_Name();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Data#getScheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scheme</em>'.
   * @see it.unibo.madz.mobile.androidL.Data#getScheme()
   * @see #getData()
   * @generated
   */
  EAttribute getData_Scheme();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Data#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host</em>'.
   * @see it.unibo.madz.mobile.androidL.Data#getHost()
   * @see #getData()
   * @generated
   */
  EAttribute getData_Host();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Data#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see it.unibo.madz.mobile.androidL.Data#getPort()
   * @see #getData()
   * @generated
   */
  EAttribute getData_Port();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Data#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see it.unibo.madz.mobile.androidL.Data#getPath()
   * @see #getData()
   * @generated
   */
  EAttribute getData_Path();

  /**
   * Returns the meta object for class '{@link it.unibo.madz.mobile.androidL.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see it.unibo.madz.mobile.androidL.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.unibo.madz.mobile.androidL.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Application#getAvd <em>Avd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Avd</em>'.
   * @see it.unibo.madz.mobile.androidL.Application#getAvd()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Avd();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Application#getWorkDir <em>Work Dir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Work Dir</em>'.
   * @see it.unibo.madz.mobile.androidL.Application#getWorkDir()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_WorkDir();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Application#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see it.unibo.madz.mobile.androidL.Application#getPackageName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_PackageName();

  /**
   * Returns the meta object for the reference '{@link it.unibo.madz.mobile.androidL.Application#getMainActivity <em>Main Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Main Activity</em>'.
   * @see it.unibo.madz.mobile.androidL.Application#getMainActivity()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_MainActivity();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Application#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see it.unibo.madz.mobile.androidL.Application#getTarget()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Target();

  /**
   * Returns the meta object for the attribute '{@link it.unibo.madz.mobile.androidL.Application#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see it.unibo.madz.mobile.androidL.Application#getPath()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Path();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AndroidLFactory getAndroidLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl <em>Android System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getAndroidSystem()
     * @generated
     */
    EClass ANDROID_SYSTEM = eINSTANCE.getAndroidSystem();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDROID_SYSTEM__DATA = eINSTANCE.getAndroidSystem_Data();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDROID_SYSTEM__ACTION = eINSTANCE.getAndroidSystem_Action();

    /**
     * The meta object literal for the '<em><b>Service Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDROID_SYSTEM__SERVICE_INTERFACE = eINSTANCE.getAndroidSystem_ServiceInterface();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDROID_SYSTEM__COMPONENT = eINSTANCE.getAndroidSystem_Component();

    /**
     * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDROID_SYSTEM__APPLICATION = eINSTANCE.getAndroidSystem_Application();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.ComponentImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.ServiceInterfaceImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getServiceInterface()
     * @generated
     */
    EClass SERVICE_INTERFACE = eINSTANCE.getServiceInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_INTERFACE__NAME = eINSTANCE.getServiceInterface_Name();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.ServiceImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__INTERFACE = eINSTANCE.getService_Interface();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.ActivityImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Launchable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__LAUNCHABLE = eINSTANCE.getActivity_Launchable();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__ACTIONS = eINSTANCE.getActivity_Actions();

    /**
     * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__INTERACTIONS = eINSTANCE.getActivity_Interactions();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.LocalActionImpl <em>Local Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.LocalActionImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getLocalAction()
     * @generated
     */
    EClass LOCAL_ACTION = eINSTANCE.getLocalAction();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_ACTION__ACTION = eINSTANCE.getLocalAction_Action();

    /**
     * The meta object literal for the '<em><b>Button</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_ACTION__BUTTON = eINSTANCE.getLocalAction_Button();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.InterActionImpl <em>Inter Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.InterActionImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getInterAction()
     * @generated
     */
    EClass INTER_ACTION = eINSTANCE.getInterAction();

    /**
     * The meta object literal for the '<em><b>Button</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTER_ACTION__BUTTON = eINSTANCE.getInterAction_Button();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.ExplicitInteractionImpl <em>Explicit Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.ExplicitInteractionImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getExplicitInteraction()
     * @generated
     */
    EClass EXPLICIT_INTERACTION = eINSTANCE.getExplicitInteraction();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.ExplicitInteractionActivityImpl <em>Explicit Interaction Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.ExplicitInteractionActivityImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getExplicitInteractionActivity()
     * @generated
     */
    EClass EXPLICIT_INTERACTION_ACTIVITY = eINSTANCE.getExplicitInteractionActivity();

    /**
     * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_INTERACTION_ACTIVITY__DEST = eINSTANCE.getExplicitInteractionActivity_Dest();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLICIT_INTERACTION_ACTIVITY__ACTION = eINSTANCE.getExplicitInteractionActivity_Action();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.ActionOnlyInteractionImpl <em>Action Only Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.ActionOnlyInteractionImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getActionOnlyInteraction()
     * @generated
     */
    EClass ACTION_ONLY_INTERACTION = eINSTANCE.getActionOnlyInteraction();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_ONLY_INTERACTION__ACTION = eINSTANCE.getActionOnlyInteraction_Action();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.ActionImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__DATA = eINSTANCE.getAction_Data();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__CATEGORY = eINSTANCE.getAction_Category();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.DataImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getData()
     * @generated
     */
    EClass DATA = eINSTANCE.getData();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA__NAME = eINSTANCE.getData_Name();

    /**
     * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA__SCHEME = eINSTANCE.getData_Scheme();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA__HOST = eINSTANCE.getData_Host();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA__PORT = eINSTANCE.getData_Port();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA__PATH = eINSTANCE.getData_Path();

    /**
     * The meta object literal for the '{@link it.unibo.madz.mobile.androidL.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.unibo.madz.mobile.androidL.impl.ApplicationImpl
     * @see it.unibo.madz.mobile.androidL.impl.AndroidLPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Avd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__AVD = eINSTANCE.getApplication_Avd();

    /**
     * The meta object literal for the '<em><b>Work Dir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__WORK_DIR = eINSTANCE.getApplication_WorkDir();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__PACKAGE_NAME = eINSTANCE.getApplication_PackageName();

    /**
     * The meta object literal for the '<em><b>Main Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__MAIN_ACTIVITY = eINSTANCE.getApplication_MainActivity();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__TARGET = eINSTANCE.getApplication_Target();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__PATH = eINSTANCE.getApplication_Path();

  }

} //AndroidLPackage
