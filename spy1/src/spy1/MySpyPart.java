 
package spy1;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class MySpyPart {
	@Inject
	public MySpyPart() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		Label l = new Label(parent,SWT.NONE);
		l.setText("try my part for Spy1 blablabla");
	}
	
	
	
	
}