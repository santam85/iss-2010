/**
 * <copyright>
 * </copyright>
 *
 */
package it.unibo.madz.mobile.androidL.impl;

import it.unibo.madz.mobile.androidL.AndroidLPackage;
import it.unibo.madz.mobile.androidL.Data;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.DataImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.DataImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.DataImpl#getHost <em>Host</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.DataImpl#getPort <em>Port</em>}</li>
 *   <li>{@link it.unibo.madz.mobile.androidL.impl.DataImpl#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data
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
   * The default value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScheme()
   * @generated
   * @ordered
   */
  protected static final String SCHEME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScheme() <em>Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScheme()
   * @generated
   * @ordered
   */
  protected String scheme = SCHEME_EDEFAULT;

  /**
   * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected static final String HOST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected String host = HOST_EDEFAULT;

  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final String PORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected String port = PORT_EDEFAULT;

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
  protected DataImpl()
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
    return AndroidLPackage.Literals.DATA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.DATA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScheme()
  {
    return scheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScheme(String newScheme)
  {
    String oldScheme = scheme;
    scheme = newScheme;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.DATA__SCHEME, oldScheme, scheme));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHost()
  {
    return host;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHost(String newHost)
  {
    String oldHost = host;
    host = newHost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.DATA__HOST, oldHost, host));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(String newPort)
  {
    String oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.DATA__PORT, oldPort, port));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidLPackage.DATA__PATH, oldPath, path));
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
      case AndroidLPackage.DATA__NAME:
        return getName();
      case AndroidLPackage.DATA__SCHEME:
        return getScheme();
      case AndroidLPackage.DATA__HOST:
        return getHost();
      case AndroidLPackage.DATA__PORT:
        return getPort();
      case AndroidLPackage.DATA__PATH:
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
      case AndroidLPackage.DATA__NAME:
        setName((String)newValue);
        return;
      case AndroidLPackage.DATA__SCHEME:
        setScheme((String)newValue);
        return;
      case AndroidLPackage.DATA__HOST:
        setHost((String)newValue);
        return;
      case AndroidLPackage.DATA__PORT:
        setPort((String)newValue);
        return;
      case AndroidLPackage.DATA__PATH:
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
      case AndroidLPackage.DATA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AndroidLPackage.DATA__SCHEME:
        setScheme(SCHEME_EDEFAULT);
        return;
      case AndroidLPackage.DATA__HOST:
        setHost(HOST_EDEFAULT);
        return;
      case AndroidLPackage.DATA__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case AndroidLPackage.DATA__PATH:
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
      case AndroidLPackage.DATA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AndroidLPackage.DATA__SCHEME:
        return SCHEME_EDEFAULT == null ? scheme != null : !SCHEME_EDEFAULT.equals(scheme);
      case AndroidLPackage.DATA__HOST:
        return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
      case AndroidLPackage.DATA__PORT:
        return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
      case AndroidLPackage.DATA__PATH:
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
    result.append(", scheme: ");
    result.append(scheme);
    result.append(", host: ");
    result.append(host);
    result.append(", port: ");
    result.append(port);
    result.append(", path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} //DataImpl
