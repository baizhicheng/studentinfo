package it.studentinfo.util;

import it.studentinfo.dao.IClasses;
import it.studentinfo.service.ClassesService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class StudentinfoServletContextListener implements ServletContextListener {

	private IClasses classesService = null;

	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent event) {
		
		ApplicationContext applicationContext2=	(ApplicationContext) event.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		
		
		//ApplicationContext applicationContext=	WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
		classesService=(IClasses) applicationContext2.getBean("classesService");
		event.getServletContext().setAttribute("classeses",
				classesService.getClasses(""));
		

	}

}
