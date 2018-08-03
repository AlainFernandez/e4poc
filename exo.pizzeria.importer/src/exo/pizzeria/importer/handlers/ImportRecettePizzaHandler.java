 
package exo.pizzeria.importer.handlers;

import java.util.Iterator;

import javax.inject.Named;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;

import exo.pizzeria.Pizzeria;
import exo.pizzeria.PizzeriaFactory;
import exo.pizzeria.Recette;

public class ImportRecettePizzaHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION)IStructuredSelection sel) {
		System.out.println(this.getClass().getCanonicalName()+".execute() called");
		System.out.println("sel is of type "+sel.getClass().getCanonicalName());
		
		Recette r = PizzeriaFactory.eINSTANCE.createRecette();
		r.setName("4 Fromage (importée)");
		r.setCalzone(false);
		r.setTempsCuisson(14);
		
		Iterator it = sel.iterator();
		int i=0;
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println((i++)+" : "+ o.getClass().getCanonicalName());
			System.out.println("     1st elem : "+ sel.getFirstElement().getClass().getCanonicalName());
			if(o instanceof Pizzeria) {
				Pizzeria pizz = (Pizzeria)o;
				pizz.getRecettes().add(r);
			}
			
			
		}
	}
		
}