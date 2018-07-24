package processor;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MAddon;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

public class Processor1 {
 
	@Execute
	public void exeProcessor1(MApplication app, EModelService ms) {
		MAddon ao = ms.createModelElement(MAddon.class);
		ao.setElementId("ao.id");
		ao.setContributorURI("processor");
		ao.setContributionURI("bundleclass://processor/processor.AddonInProcessor");
		app.getAddons().add(ao);
		System.out.println("exeProcessor1 complete");
	}

}
