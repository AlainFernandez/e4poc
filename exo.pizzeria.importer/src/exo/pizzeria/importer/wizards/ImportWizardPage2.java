package exo.pizzeria.importer.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ImportWizardPage2 extends WizardPage {


	private String recetteName;
	private Text recetteNameText;
	private Composite container;
	private static String title = "Import Recette : Etape 2";
	
	protected ImportWizardPage2() {
		super(title);
		setTitle(title);
		setDescription("Entrez le nom de la recette à importer svp");
	}
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent,SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		Label labelLibPath = new Label(container,SWT.NONE);
		labelLibPath.setText("Nom de la recette :");
		recetteNameText = new Text(container,SWT.BORDER|SWT.SINGLE);
		recetteNameText.setText("");
		recetteNameText.addKeyListener(new KeyListener()  {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(!recetteNameText.getText().isEmpty()) {
					setPageComplete(true);
					recetteName = recetteNameText.getText();
				}
			}
		});
		recetteNameText.setFocus();
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		recetteNameText.setLayoutData(gd);
		// required to avoid an error in the system
		setControl(container);
		setPageComplete(false);
	}
	
	
	public String getRecetteName() {
		return recetteName;
	}

}

