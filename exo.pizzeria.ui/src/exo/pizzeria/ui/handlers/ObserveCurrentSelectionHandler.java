 
package exo.pizzeria.ui.handlers;

import java.util.Iterator;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;

import exo.pizzeria.Pizza;

public class ObserveCurrentSelectionHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION)IStructuredSelection s) {
		System.out.println("Observing current selection ...");
		if(s instanceof Pizza) {
			System.out.println("the current selection is a Pizza");
		}
		else if (s instanceof TreeSelection) {
			Iterator it = s.iterator();
			int i=0;
			while(it.hasNext()) {
				Object o = it.next();
				System.out.println("it("+(i++)+" : o is "+o.getClass().getCanonicalName());;
			}
		}
		else {
			System.out.println("s is of type "+s.getClass().getCanonicalName());
		}
	}
		
}