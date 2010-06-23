/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL.impl;

import it.unibo.madz.mobile.androidL.Activity;
import it.unibo.madz.mobile.androidL.AndroidLPackage;
import it.unibo.madz.mobile.androidL.Application;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ApplicationImpl#getAvd <em>Avd</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ApplicationImpl#getWorkDir <em>Work Dir</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ApplicationImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ApplicationImpl#getMainActivity <em>Main Activity</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ApplicationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.ApplicationImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application
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
   * The default value of the '{@link #getAvd() <em>Avd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvd()
   * @generated
   * @ordered
   */
  protected static final int AVD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAvd() <em>Avd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvd()
   * @generated
   * @ordered
   */
  protected int avd = AVD_EDEFAULT;

  /**
   * The default value of the '{@link #getWorkDir() <em>Work Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkDir()
   * @generated
   * @ordered
   */
  protected static final String WORK_DIR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWorkDir() <em>Work Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkDir()
   * @generated
   * @ordered
   */
  protected String workDir = WORK_DIR_EDEFAULT;

  /**
   * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected String packageName = PACKAGE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMainActivity() <em>Main Activity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainActivity()
   * @generated
   * @ordered
   */
  protected Activity mainActivity;

  /**
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final int TARGET_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected int target = TARGET_EDEFAULT;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl()
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
    return AndroidLPackage.Literals.APPLICATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.APPLICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAvd()
  {
    return avd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAvd(int newAvd)
  {
    int oldAvd = avd;
    avd = newAvd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.APPLICATION__AVD, oldAvd, avd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWorkDir()
  {
    return workDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkDir(String newWorkDir)
  {
    String oldWorkDir = workDir;
    workDir = newWorkDir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.APPLICATION__WORK_DIR, oldWorkDir, workDir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(String newPackageName)
  {
    String oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.APPLICATION__PACKAGE_NAME, oldPackageName, packageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity getMainActivity()
  {
    if (mainActivity != null && mainActivity.eIsProxy())
    {
      InternalEObject oldMainActivity = (InternalEObject)mainActivity;
      mainActivity = (Activity)eResolveProxy(oldMainActivity);
      if (mainActivity != oldMainActivity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidLPackage.APPLICATION__MAIN_ACTIVITY, oldMainActivity, mainActivity));
      }
    }
    return mainActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity basicGetMainActivity()
  {
    return mainActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainActivity(Activity newMainActivity)
  {
    Activity oldMainActivity = mainActivity;
    mainActivity = newMainActivity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.APPLICATION__MAIN_ACTIVITY, oldMainActivity, mainActivity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(int newTarget)
  {
    int oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.APPLICATION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.APPLICATION__PATH, oldPath, path));
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
      case AndroidLPackage.APPLICATION__NAME:
        return getName();
      case AndroidLPackage.APPLICATION__AVD:
        return getAvd();
      case AndroidLPackage.APPLICATION__WORK_DIR:
        return getWorkDir();
      case AndroidLPackage.APPLICATION__PACKAGE_NAME:
        return getPackageName();
      case AndroidLPackage.APPLICATION__MAIN_ACTIVITY:
        if (resolve) return getMainActivity();
        return basicGetMainActivity();
      case AndroidLPackage.APPLICATION__TARGET:
        return getTarget();
      case AndroidLPackage.APPLICATION__PATH:
        return getPath();
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
      case AndroidLPackage.APPLICATION__NAME:
        setName((String)newValue);
        return;
      case AndroidLPackage.APPLICATION__AVD:
        setAvd((Integer)newValue);
        return;
      case AndroidLPackage.APPLICATION__WORK_DIR:
        setWorkDir((String)newValue);
        return;
      case AndroidLPackage.APPLICATION__PACKAGE_NAME:
        setPackageName((String)newValue);
        return;
      case AndroidLPackage.APPLICATION__MAIN_ACTIVITY:
        setMainActivity((Activity)newValue);
        return;
      case AndroidLPackage.APPLICATION__TARGET:
        setTarget((Integer)newValue);
        return;
      case AndroidLPackage.APPLICATION__PATH:
        setPath((String)newValue);
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
      case AndroidLPackage.APPLICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroidLPackage.APPLICATION__AVD:
        setAvd(AVD_EDEFAULT);
        return;
      case AndroidLPackage.APPLICATION__WORK_DIR:
        setWorkDir(WORK_DIR_EDEFAULT);
        return;
      case AndroidLPackage.APPLICATION__PACKAGE_NAME:
        setPackageName(PACKAGE_NAME_EDEFAULT);
        return;
      case AndroidLPackage.APPLICATION__MAIN_ACTIVITY:
        setMainActivity((Activity)null);
        return;
      case AndroidLPackage.APPLICATION__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case AndroidLPackage.APPLICATION__PATH:
        setPath(PATH_EDEFAULT);
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
      case AndroidLPackage.APPLICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroidLPackage.APPLICATION__AVD:
        return avd != AVD_EDEFAULT;
      case AndroidLPackage.APPLICATION__WORK_DIR:
        return WORK_DIR_EDEFAULT == null ? workDir != null : !WORK_DIR_EDEFAULT.equals(workDir);
      case AndroidLPackage.APPLICATION__PACKAGE_NAME:
        return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
      case AndroidLPackage.APPLICATION__MAIN_ACTIVITY:
        return mainActivity != null;
      case AndroidLPackage.APPLICATION__TARGET:
        return target != TARGET_EDEFAULT;
      case AndroidLPackage.APPLICATION__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
    result.append(", avd: ");
    result.append(avd);
    result.append(", workDir: ");
    result.append(workDir);
    result.append(", packageName: ");
    result.append(packageName);
    result.append(", target: ");
    result.append(target);
    result.append(", path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
