package first-app;

import wicket.Component;
import wicket.markup.html.basic.Label;
import wicket.model.Model;
import net.databinder.components.DataPage;

public class MyDataPage extends DataPage {
	
	@Override
	protected String getName() {
		return "application";
	}
	
	public MyDataPage() {
		super();
		
		add(new Label("pageTitleHeader", new Model() {
			@Override
			public Object getObject(Component component) {
				return getName();
			}
		}));	
	}
}
