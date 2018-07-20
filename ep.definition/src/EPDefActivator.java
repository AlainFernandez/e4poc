import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class EPDefActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start of ep.definition");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
