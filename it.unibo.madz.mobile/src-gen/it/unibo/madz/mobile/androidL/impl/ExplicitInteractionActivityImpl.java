/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL.impl;

import it.unibo.madz.mobile.androidL.Action;
import it.unibo.madz.mobile.androidL.Activity;
import it.unibo.madz.mobile.androidL.AndroidLPackage;
import it.unibo.madz.mobile.androidL.ExplicitInteractionActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Interaction Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ExplicitInteractionActivityImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ExplicitInteractionActivityImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExplicitInteractionActivityImpl extends ExplicitInteractionImpl implements ExplicitInteractionActivity
{
  /**
   * The cached value of the '{@link #getDest() <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDest()
   * @generated
   * @ordered
   */
  protected Activity dest;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExplicitInteractionActivityImpl()
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
    return AndroidLPackage.Literals.EXPLICIT_INTERACTION_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity getDest()
  {
    if (dest != null && dest.eIsProxy())
    {
      InternalEObject oldDest = (InternalEObject)dest;
      dest = (Activity)eResolveProxy(oldDest);
      if (dest != oldDest)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__DEST, oldDest, dest));
      }
    }
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity basicGetDest()
  {
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDest(Activity newDest)
  {
    Activity oldDest = dest;
    dest = newDest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__DEST, oldDest, dest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (Action)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__ACTION, oldAction, action));
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
      case AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__DEST:
        if (resolve) return getDest();
        return basicGetDest();
      case AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__DEST:
        setDest((Activity)newValue);
        return;
      case AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__ACTION:
        setAction((Action)newValue);
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
      case AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__DEST:
        setDest((Activity)null);
        return;
      case AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__ACTION:
        setAction((Action)null);
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
      case AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__DEST:
        return dest != null;
      case AndroidLPackage.EXPLICIT_INTERACTION_ACTIVITY__ACTION:
        return action != null;
    }
    return super.eIsSet(featureID);
  }

} //ExplicitInteractionActivityImpl
