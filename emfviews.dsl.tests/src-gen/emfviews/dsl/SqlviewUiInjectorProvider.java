/*
* generated by Xtext
*/
package emfviews.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SqlviewUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return emfviews.dsl.ui.internal.SqlviewActivator.getInstance().getInjector("emfviews.dsl.Sqlview");
	}
	
}