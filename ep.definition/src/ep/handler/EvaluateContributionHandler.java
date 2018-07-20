package ep.handler;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.di.annotations.Execute;

import ep.definition.IGreeter;

public class EvaluateContributionHandler {
	private static final String EPTRY1_ID = "eptry1";
	
	@Execute
	public void execute(IExtensionRegistry registry) {
		IConfigurationElement[] config = registry.getConfigurationElementsFor(EPTRY1_ID);
		try {
			for(IConfigurationElement e : config) {
				System.out.println("Evaluating extension");
				final Object o = e.createExecutableExtension("class");
				if(o instanceof IGreeter) {
					executeExtension(o);
				}
			}
		}
		catch(CoreException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private void executeExtension(Object o) {
		ISafeRunnable runnable = new ISafeRunnable() {
			
			@Override
			public void handleException(Throwable e) {
				System.out.println("Exception in client");
			}
			
			@Override
			public void run() throws Exception {
				((IGreeter) o).greet();
				
			}
			
		};
		SafeRunner.run(runnable);
		
	}
}
