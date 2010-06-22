/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL.util;

import it.unibo.madz.mobile.androidL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.unibo.madz.mobile.androidL.AndroidLPackage
 * @generated
 */
public class AndroidLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AndroidLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AndroidLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroidLSwitch<Adapter> modelSwitch =
    new AndroidLSwitch<Adapter>()
    {
      @Override
      public Adapter caseAndroidSystem(AndroidSystem object)
      {
        return createAndroidSystemAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseServiceInterface(ServiceInterface object)
      {
        return createServiceInterfaceAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseActivity(Activity object)
      {
        return createActivityAdapter();
      }
      @Override
      public Adapter caseLocalAction(LocalAction object)
      {
        return createLocalActionAdapter();
      }
      @Override
      public Adapter caseInterAction(InterAction object)
      {
        return createInterActionAdapter();
      }
      @Override
      public Adapter caseExplicitInteraction(ExplicitInteraction object)
      {
        return createExplicitInteractionAdapter();
      }
      @Override
      public Adapter caseExplicitInteractionActivity(ExplicitInteractionActivity object)
      {
        return createExplicitInteractionActivityAdapter();
      }
      @Override
      public Adapter caseActionOnlyInteraction(ActionOnlyInteraction object)
      {
        return createActionOnlyInteractionAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseData(Data object)
      {
        return createDataAdapter();
      }
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.AndroidSystem <em>Android System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.AndroidSystem
   * @generated
   */
  public Adapter createAndroidSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.ServiceInterface <em>Service Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.ServiceInterface
   * @generated
   */
  public Adapter createServiceInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.Activity
   * @generated
   */
  public Adapter createActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.LocalAction <em>Local Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.LocalAction
   * @generated
   */
  public Adapter createLocalActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.InterAction <em>Inter Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.InterAction
   * @generated
   */
  public Adapter createInterActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.ExplicitInteraction <em>Explicit Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.ExplicitInteraction
   * @generated
   */
  public Adapter createExplicitInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.ExplicitInteractionActivity <em>Explicit Interaction Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.ExplicitInteractionActivity
   * @generated
   */
  public Adapter createExplicitInteractionActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.ActionOnlyInteraction <em>Action Only Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.ActionOnlyInteraction
   * @generated
   */
  public Adapter createActionOnlyInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.Data
   * @generated
   */
  public Adapter createDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.unibo.madz.mobile.androidL.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.unibo.madz.mobile.androidL.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AndroidLAdapterFactory
