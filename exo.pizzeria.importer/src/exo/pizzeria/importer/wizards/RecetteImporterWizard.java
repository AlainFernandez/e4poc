package exo.pizzeria.importer.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;

public class RecetteImporterWizard extends Wizard {
	private WizardPage importWizardPage1;
	private WizardPage importWizardPage2;
	
	
	public RecetteImporterWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	@Override
	public String getWindowTitle() {
		return "A definir ... ";
	}
	
	@Override
	public void addPages() {
		importWizardPage1 = new ImportWizardPage1();
		importWizardPage2 = new ImportWizardPage2();
		addPage(importWizardPage1);
		addPage(importWizardPage2);
	}
	
	@Override
	public boolean performFinish() {
		System.out.println(((ImportWizardPage1) importWizardPage1).getPathToLib());
		System.out.println(((ImportWizardPage2) importWizardPage2).getRecetteName());
		return true;
		
	}
	
	public String getRecetteName() {
		return ((ImportWizardPage2)importWizardPage2).getRecetteName();
	}
}
