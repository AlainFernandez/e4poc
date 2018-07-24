package processor;

import javax.inject.Inject;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;

public class AddonInProcessor {
	@Inject @Optional
	public void consumeEventTry(@UIEventTopic("eventgenerator/*") Integer de) {
		System.out.println("Received from addon in processor de = "+de.intValue());
	}
}
