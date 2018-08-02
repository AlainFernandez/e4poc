 
package exo.pizzeria.importer.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class ExportRecetteHandler {
	@Execute
	public void execute() {
		System.out.println(this.getClass().getCanonicalName()+".execute() called");
	}
		
}