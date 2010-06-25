
package it.unibo.madz.mobile;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AndroidLStandaloneSetup extends AndroidLStandaloneSetupGenerated{

	public static void doSetup() {
		new AndroidLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

