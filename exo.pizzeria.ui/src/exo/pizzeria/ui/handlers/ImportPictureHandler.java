 
package exo.pizzeria.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class ImportPictureHandler {
	@Execute
	public void execute() {
		System.out.println(this.getClass().getName()+" execute() was called");
	}
		
}