 
package ep.consume1.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class EPTry1Handler {
	@Execute
	public void execute() {
		System.out.println(this.getClass().getName()+".execute() called");
		
	}
		
}