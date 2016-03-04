package com.sample;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import static javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.annotation.WebListener;

@WebListener
public class Config implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        Dynamic servlet = context.addServlet("app", org.glassfish.jersey.servlet.ServletContainer.class);
        servlet.setLoadOnStartup(1);
        ServletRegistration registration = context.getServletRegistration("app");
        registration.addMapping("/jersey/*");
    }

    public void contextDestroyed(ServletContextEvent sce){}
}
