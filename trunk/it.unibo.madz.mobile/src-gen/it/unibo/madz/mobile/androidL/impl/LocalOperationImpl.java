/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL.impl;

import it.unibo.madz.mobile.androidL.AndroidLPackage;
import it.unibo.madz.mobile.androidL.InputType;
import it.unibo.madz.mobile.androidL.LocalOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.LocalOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.LocalOperationImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.LocalOperationImpl#getInputType <em>Input Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalOperationImpl extends MinimalEObjectImpl.Container implements LocalOperation
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
   * The default value of the '{@link #getReturn() <em>Return</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected static final String RETURN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected String return_ = RETURN_EDEFAULT;

  /**
   * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputType()
   * @generated
   * @ordered
   */
  protected EList<InputType> inputType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalOperationImpl()
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
    return AndroidLPackage.Literals.LOCAL_OPERATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.LOCAL_OPERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(String newReturn)
  {
    String oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.LOCAL_OPERATION__RETURN, oldReturn, return_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InputType> getInputType()
  {
    if (inputType == null)
    {
      inputType = new EDataTypeEList<InputType>(InputType.class, this, AndroidLPackage.LOCAL_OPERATION__INPUT_TYPE);
    }
    return inputType;
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
      case AndroidLPackage.LOCAL_OPERATION__NAME:
        return getName();
      case AndroidLPackage.LOCAL_OPERATION__RETURN:
        return getReturn();
      case AndroidLPackage.LOCAL_OPERATION__INPUT_TYPE:
        return getInputType();
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
      case AndroidLPackage.LOCAL_OPERATION__NAME:
        setName((String)newValue);
        return;
      case AndroidLPackage.LOCAL_OPERATION__RETURN:
        setReturn((String)newValue);
        return;
      case AndroidLPackage.LOCAL_OPERATION__INPUT_TYPE:
        getInputType().clear();
        getInputType().addAll((Collection<? extends InputType>)newValue);
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
      case AndroidLPackage.LOCAL_OPERATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroidLPackage.LOCAL_OPERATION__RETURN:
        setReturn(RETURN_EDEFAULT);
        return;
      case AndroidLPackage.LOCAL_OPERATION__INPUT_TYPE:
        getInputType().clear();
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
      case AndroidLPackage.LOCAL_OPERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroidLPackage.LOCAL_OPERATION__RETURN:
        return RETURN_EDEFAULT == null ? return_ != null : !RETURN_EDEFAULT.equals(return_);
      case AndroidLPackage.LOCAL_OPERATION__INPUT_TYPE:
        return inputType != null && !inputType.isEmpty();
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
    result.append(", return: ");
    result.append(return_);
    result.append(", inputType: ");
    result.append(inputType);
    result.append(')');
    return result.toString();
  }

} //LocalOperationImpl
