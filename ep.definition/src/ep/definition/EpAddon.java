package ep.definition;

import javax.annotation.PostConstruct;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;

public class EpAddon {
	private static final String EPTRY1_ID = "ep.definition.eptry1";
	
	@PostConstruct
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
