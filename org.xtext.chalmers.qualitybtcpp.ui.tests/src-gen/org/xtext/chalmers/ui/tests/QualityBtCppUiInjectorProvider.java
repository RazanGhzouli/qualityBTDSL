/*
 * generated by Xtext 2.36.0
 */
package org.xtext.chalmers.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.chalmers.qualitybtcpp.ui.internal.QualitybtcppActivator;

public class QualityBtCppUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return QualitybtcppActivator.getInstance().getInjector("org.xtext.chalmers.QualityBtCpp");
	}

}