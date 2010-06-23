/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL.impl;

import it.unibo.madz.mobile.androidL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidLFactoryImpl extends EFactoryImpl implements AndroidLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AndroidLFactory init()
  {
    try
    {
      AndroidLFactory theAndroidLFactory = (AndroidLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.unibo.it/madz/mobile/AndroidL"); 
      if (theAndroidLFactory != null)
      {
        return theAndroidLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AndroidLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AndroidLPackage.ANDROID_SYSTEM: return createAndroidSystem();
      case AndroidLPackage.COMPONENT: return createComponent();
      case AndroidLPackage.SERVICE_INTERFACE: return createServiceInterface();
      case AndroidLPackage.LOCAL_OPERATION: return createLocalOperation();
      case AndroidLPackage.SERVICE: return createService();
      case AndroidLPackage.ACTIVITY: return createActivity();
      case AndroidLPackage.LOCAL_ACTION: return createLocalAction();
      case AndroidLPackage.INTER_ACTION: return createInterAction();
      case AndroidLPackage.EXPLICIT_INTERACTION: return createExplicitInteraction();
      case AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY: return createExplicitInteractionActivity();
      case AndroidLPackage.EXPLICIT_INTERACTION_SERVICE: return createExplicitInteractionService();
      case AndroidLPackage.USE_SERVICE: return createUseService();
      case AndroidLPackage.LAUNCHSERVICE: return createLaunchservice();
      case AndroidLPackage.ACTION_ONLY_INTERACTION: return createActionOnlyInteraction();
      case AndroidLPackage.ACTION: return createAction();
      case AndroidLPackage.DATA: return createData();
      case AndroidLPackage.APPLICATION: return createApplication();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AndroidLPackage.INPUT_TYPE:
        return createInputTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AndroidLPackage.INPUT_TYPE:
        return convertInputTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidSystem createAndroidSystem()
  {
    AndroidSystemImpl androidSystem = new AndroidSystemImpl();
    return androidSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceInterface createServiceInterface()
  {
    ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
    return serviceInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalOperation createLocalOperation()
  {
    LocalOperationImpl localOperation = new LocalOperationImpl();
    return localOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity createActivity()
  {
    ActivityImpl activity = new ActivityImpl();
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalAction createLocalAction()
  {
    LocalActionImpl localAction = new LocalActionImpl();
    return localAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterAction createInterAction()
  {
    InterActionImpl interAction = new InterActionImpl();
    return interAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitInteraction createExplicitInteraction()
  {
    ExplicitInteractionImpl explicitInteraction = new ExplicitInteractionImpl();
    return explicitInteraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitInteractionActivity createExplicitInteractionActivity()
  {
    ExplicitInteractionActivityImpl explicitInteractionActivity = new ExplicitInteractionActivityImpl();
    return explicitInteractionActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitInteractionService createExplicitInteractionService()
  {
    ExplicitInteractionServiceImpl explicitInteractionService = new ExplicitInteractionServiceImpl();
    return explicitInteractionService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseService createUseService()
  {
    UseServiceImpl useService = new UseServiceImpl();
    return useService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Launchservice createLaunchservice()
  {
    LaunchserviceImpl launchservice = new LaunchserviceImpl();
    return launchservice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionOnlyInteraction createActionOnlyInteraction()
  {
    ActionOnlyInteractionImpl actionOnlyInteraction = new ActionOnlyInteractionImpl();
    return actionOnlyInteraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data createData()
  {
    DataImpl data = new DataImpl();
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputType createInputTypeFromString(EDataType eDataType, String initialValue)
  {
    InputType result = InputType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInputTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidLPackage getAndroidLPackage()
  {
    return (AndroidLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AndroidLPackage getPackage()
  {
    return AndroidLPackage.eINSTANCE;
  }

} //AndroidLFactoryImpl
