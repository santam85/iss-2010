/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL.impl;

import it.unibo.madz.mobile.androidL.Activity;
import it.unibo.madz.mobile.androidL.AndroidLPackage;
import it.unibo.madz.mobile.androidL.InterAction;
import it.unibo.madz.mobile.androidL.LocalAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ActivityImpl#isLaunchable <em>Launchable</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ActivityImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ActivityImpl#getInteractions <em>Interactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends ComponentImpl implements Activity
{
  /**
   * The default value of the '{@link #isLaunchable() <em>Launchable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLaunchable()
   * @generated
   * @ordered
   */
  protected static final boolean LAUNCHABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLaunchable() <em>Launchable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLaunchable()
   * @generated
   * @ordered
   */
  protected boolean launchable = LAUNCHABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<LocalAction> actions;

  /**
   * The cached value of the '{@link #getInteractions() <em>Interactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractions()
   * @generated
   * @ordered
   */
  protected EList<InterAction> interactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityImpl()
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
    return AndroidLPackage.Literals.ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLaunchable()
  {
    return launchable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLaunchable(boolean newLaunchable)
  {
    boolean oldLaunchable = launchable;
    launchable = newLaunchable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.ACTIVITY__LAUNCHABLE, oldLaunchable, launchable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LocalAction> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<LocalAction>(LocalAction.class, this, AndroidLPackage.ACTIVITY__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterAction> getInteractions()
  {
    if (interactions == null)
    {
      interactions = new EObjectContainmentEList<InterAction>(InterAction.class, this, AndroidLPackage.ACTIVITY__INTERACTIONS);
    }
    return interactions;
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
      case AndroidLPackage.ACTIVITY__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case AndroidLPackage.ACTIVITY__INTERACTIONS:
        return ((InternalEList<?>)getInteractions()).basicRemove(otherEnd, msgs);
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
      case AndroidLPackage.ACTIVITY__LAUNCHABLE:
        return isLaunchable();
      case AndroidLPackage.ACTIVITY__ACTIONS:
        return getActions();
      case AndroidLPackage.ACTIVITY__INTERACTIONS:
        return getInteractions();
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
      case AndroidLPackage.ACTIVITY__LAUNCHABLE:
        setLaunchable((Boolean)newValue);
        return;
      case AndroidLPackage.ACTIVITY__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends LocalAction>)newValue);
        return;
      case AndroidLPackage.ACTIVITY__INTERACTIONS:
        getInteractions().clear();
        getInteractions().addAll((Collection<? extends InterAction>)newValue);
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
      case AndroidLPackage.ACTIVITY__LAUNCHABLE:
        setLaunchable(LAUNCHABLE_EDEFAULT);
        return;
      case AndroidLPackage.ACTIVITY__ACTIONS:
        getActions().clear();
        return;
      case AndroidLPackage.ACTIVITY__INTERACTIONS:
        getInteractions().clear();
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
      case AndroidLPackage.ACTIVITY__LAUNCHABLE:
        return launchable != LAUNCHABLE_EDEFAULT;
      case AndroidLPackage.ACTIVITY__ACTIONS:
        return actions != null && !actions.isEmpty();
      case AndroidLPackage.ACTIVITY__INTERACTIONS:
        return interactions != null && !interactions.isEmpty();
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
    result.append(" (launchable: ");
    result.append(launchable);
    result.append(')');
    return result.toString();
  }

} //ActivityImpl
