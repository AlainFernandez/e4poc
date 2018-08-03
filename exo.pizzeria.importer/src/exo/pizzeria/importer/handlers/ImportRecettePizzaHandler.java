 
package exo.pizzeria.importer.handlers;

import java.util.Iterator;

import javax.inject.Named;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import exo.pizzeria.Pizzeria;
import exo.pizzeria.PizzeriaFactory;
import exo.pizzeria.Recette;
import exo.pizzeria.importer.wizards.RecetteImporterWizard;

public class ImportRecettePizzaHandler {
	
	// execute typé e3
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL)Shell sh,
			@Named(IServiceConstants.ACTIVE_SELECTION)IStructuredSelection sel) {
		System.out.println(this.getClass().getCanonicalName()+".execute() called");
		System.out.println("sel is of type "+sel.getClass().getCanonicalName());
		
		Iterator it = sel.iterator();
		int i=0;
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println((i++)+" : "+ o.getClass().getCanonicalName());
			System.out.println("     1st elem : "+ sel.getFirstElement().getClass().getCanonicalName());
			if(o instanceof Pizzeria) {
				Pizzeria pizz = (Pizzeria)o;
				execute(sh,pizz);

			}
			
			
		}
	}

	// execute typé e4 pure
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL)Shell sh,
			@Named(IServiceConstants.ACTIVE_SELECTION)Pizzeria pizz) {
		RecetteImporterWizard riw = new RecetteImporterWizard();
		WizardDialog wz = new WizardDialog(sh,riw);
		if(wz.open() == Window.OK) {
			String recetteName = riw.getRecetteName();
			Recette r = PizzeriaFactory.eINSTANCE.createRecette();
			r.setName(recetteName);
			r.setCalzone(false);
			r.setTempsCuisson(14);
			pizz.getRecettes().add(r);
			System.out.println("OK pressed");
		}
		else {
			System.out.println("Cancel pressed");
		}
	}
	
	// execute typé e4 pure selection multiple
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL)Shell sh,
			@Named(IServiceConstants.ACTIVE_SELECTION)Object[] sel) {
		for(Object o: sel) {
			if(o instanceof Pizzeria) {
				execute(sh,(Pizzeria)o);
			}
		}
	}
	
}