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

public class ImportWizardPage1 extends WizardPage {


	private Text pathToLibText;
	private Composite container;
	private static String title = "Import Recette : Etape 1";
	
	protected ImportWizardPage1() {
		super(title);
		setTitle(title);
		setDescription("Select the library location");
	}
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent,SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		Label labelLibPath = new Label(container,SWT.NONE);
		labelLibPath.setText("Enter path to library");
		pathToLibText = new Text(container,SWT.BORDER|SWT.SINGLE);
		pathToLibText.setText("");
		pathToLibText.addKeyListener(new KeyListener()  {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(!pathToLibText.getText().isEmpty()) {
					setPageComplete(true);
				}
			}
		});
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		pathToLibText.setLayoutData(gd);
		// required to avoid an error in the system
		setControl(container);
		setPageComplete(false);
	}
	public String getPathToLib() {
		return pathToLibText.getText();
	}
}
