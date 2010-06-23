/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL.impl;

import it.unibo.madz.mobile.androidL.Action;
import it.unibo.madz.mobile.androidL.AndroidLPackage;
import it.unibo.madz.mobile.androidL.AndroidSystem;
import it.unibo.madz.mobile.androidL.Application;
import it.unibo.madz.mobile.androidL.Component;
import it.unibo.madz.mobile.androidL.Data;
import it.unibo.madz.mobile.androidL.ServiceInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Android System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl#getData <em>Data</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl#getAction <em>Action</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl#getServiceInterface <em>Service Interface</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.AndroidSystemImpl#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndroidSystemImpl extends MinimalEObjectImpl.Container implements AndroidSystem
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected EList<Data> data;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected EList<Action> action;

  /**
   * The cached value of the '{@link #getServiceInterface() <em>Service Interface</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceInterface()
   * @generated
   * @ordered
   */
  protected ServiceInterface serviceInterface;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected EList<Component> component;

  /**
   * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplication()
   * @generated
   * @ordered
   */
  protected Application application;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroidSystemImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AndroidLPackage.Literals.ANDROID_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.ANDROID_SYSTEM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Data> getData()
  {
    if (data == null)
    {
      data = new EObjectContainmentEList<Data>(Data.class, this, AndroidLPackage.ANDROID_SYSTEM__DATA);
    }
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getAction()
  {
    if (action == null)
    {
      action = new EObjectContainmentEList<Action>(Action.class, this, AndroidLPackage.ANDROID_SYSTEM__ACTION);
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceInterface getServiceInterface()
  {
    return serviceInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetServiceInterface(ServiceInterface newServiceInterface, NotificationChain msgs)
  {
    ServiceInterface oldServiceInterface = serviceInterface;
    serviceInterface = newServiceInterface;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidLPackage.ANDROID_SYSTEM__SERVICE_INTERFACE, oldServiceInterface, newServiceInterface);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceInterface(ServiceInterface newServiceInterface)
  {
    if (newServiceInterface != serviceInterface)
    {
      NotificationChain msgs = null;
      if (serviceInterface != null)
        msgs = ((InternalEObject)serviceInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidLPackage.ANDROID_SYSTEM__SERVICE_INTERFACE, null, msgs);
      if (newServiceInterface != null)
        msgs = ((InternalEObject)newServiceInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidLPackage.ANDROID_SYSTEM__SERVICE_INTERFACE, null, msgs);
      msgs = basicSetServiceInterface(newServiceInterface, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.ANDROID_SYSTEM__SERVICE_INTERFACE, newServiceInterface, newServiceInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponent()
  {
    if (component == null)
    {
      component = new EObjectContainmentEList<Component>(Component.class, this, AndroidLPackage.ANDROID_SYSTEM__COMPONENT);
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application getApplication()
  {
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs)
  {
    Application oldApplication = application;
    application = newApplication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidLPackage.ANDROID_SYSTEM__APPLICATION, oldApplication, newApplication);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplication(Application newApplication)
  {
    if (newApplication != application)
    {
      NotificationChain msgs = null;
      if (application != null)
        msgs = ((InternalEObject)application).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidLPackage.ANDROID_SYSTEM__APPLICATION, null, msgs);
      if (newApplication != null)
        msgs = ((InternalEObject)newApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidLPackage.ANDROID_SYSTEM__APPLICATION, null, msgs);
      msgs = basicSetApplication(newApplication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.ANDROID_SYSTEM__APPLICATION, newApplication, newApplication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AndroidLPackage.ANDROID_SYSTEM__DATA:
        return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
      case AndroidLPackage.ANDROID_SYSTEM__ACTION:
        return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
      case AndroidLPackage.ANDROID_SYSTEM__SERVICE_INTERFACE:
        return basicSetServiceInterface(null, msgs);
      case AndroidLPackage.ANDROID_SYSTEM__COMPONENT:
        return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
      case AndroidLPackage.ANDROID_SYSTEM__APPLICATION:
        return basicSetApplication(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AndroidLPackage.ANDROID_SYSTEM__NAME:
        return getName();
      case AndroidLPackage.ANDROID_SYSTEM__DATA:
        return getData();
      case AndroidLPackage.ANDROID_SYSTEM__ACTION:
        return getAction();
      case AndroidLPackage.ANDROID_SYSTEM__SERVICE_INTERFACE:
        return getServiceInterface();
      case AndroidLPackage.ANDROID_SYSTEM__COMPONENT:
        return getComponent();
      case AndroidLPackage.ANDROID_SYSTEM__APPLICATION:
        return getApplication();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroidLPackage.ANDROID_SYSTEM__NAME:
        setName((String)newValue);
        return;
      case AndroidLPackage.ANDROID_SYSTEM__DATA:
        getData().clear();
        getData().addAll((Collection<? extends Data>)newValue);
        return;
      case AndroidLPackage.ANDROID_SYSTEM__ACTION:
        getAction().clear();
        getAction().addAll((Collection<? extends Action>)newValue);
        return;
      case AndroidLPackage.ANDROID_SYSTEM__SERVICE_INTERFACE:
        setServiceInterface((ServiceInterface)newValue);
        return;
      case AndroidLPackage.ANDROID_SYSTEM__COMPONENT:
        getComponent().clear();
        getComponent().addAll((Collection<? extends Component>)newValue);
        return;
      case AndroidLPackage.ANDROID_SYSTEM__APPLICATION:
        setApplication((Application)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AndroidLPackage.ANDROID_SYSTEM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroidLPackage.ANDROID_SYSTEM__DATA:
        getData().clear();
        return;
      case AndroidLPackage.ANDROID_SYSTEM__ACTION:
        getAction().clear();
        return;
      case AndroidLPackage.ANDROID_SYSTEM__SERVICE_INTERFACE:
        setServiceInterface((ServiceInterface)null);
        return;
      case AndroidLPackage.ANDROID_SYSTEM__COMPONENT:
        getComponent().clear();
        return;
      case AndroidLPackage.ANDROID_SYSTEM__APPLICATION:
        setApplication((Application)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AndroidLPackage.ANDROID_SYSTEM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroidLPackage.ANDROID_SYSTEM__DATA:
        return data != null && !data.isEmpty();
      case AndroidLPackage.ANDROID_SYSTEM__ACTION:
        return action != null && !action.isEmpty();
      case AndroidLPackage.ANDROID_SYSTEM__SERVICE_INTERFACE:
        return serviceInterface != null;
      case AndroidLPackage.ANDROID_SYSTEM__COMPONENT:
        return component != null && !component.isEmpty();
      case AndroidLPackage.ANDROID_SYSTEM__APPLICATION:
        return application != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AndroidSystemImpl
