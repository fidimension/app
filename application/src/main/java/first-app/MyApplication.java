package first-app;

import net.databinder.DataApplication;

import org.hibernate.cfg.AnnotationConfiguration;

public class MyApplication extends DataApplication {

	@Override
	public Class getHomePage() {
		return MyDataPage.class;
	}
	
	@Override
	protected void configureHibernate(AnnotationConfiguration config) {
		super.configureHibernate(config);
		//config.addAnnotatedClass(MyItem.class);
	}

}
