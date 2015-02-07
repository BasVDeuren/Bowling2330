package main.java.be.bowling.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MvcConfig implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {
      AnnotationConfigWebApplicationContext rootContext =
          new AnnotationConfigWebApplicationContext();
      rootContext.register(AppConfig.class);

      AnnotationConfigWebApplicationContext dispatcherContext =
          new AnnotationConfigWebApplicationContext();
      dispatcherContext.register(DispatcherConfig.class);

      ServletRegistration.Dynamic dispatcher =
          container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
      dispatcher.setLoadOnStartup(1);
      dispatcher.addMapping("/");
    }
}
