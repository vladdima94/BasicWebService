package listeners;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

import servlets.HelloServlet;

public class GuiceServiceServletConfig extends GuiceServletContextListener {

	  @Override
	  protected Injector getInjector() {
	    return Guice.createInjector(new ServletModule() {

			@Override
			protected void configureServlets() {
				serve("/hello").with(HelloServlet.class);
			}
	    	
	    });
	  }
	}
