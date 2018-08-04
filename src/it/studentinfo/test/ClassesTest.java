package it.studentinfo.test;

import it.studentinfo.dao.IClasses;
import it.studentinfo.model.Classes;
import it.studentinfo.service.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassesTest {
	
private static IClasses  classesService=null;
private static ApplicationContext applicationContext=null;
	public static void setUpBeforeClass() throws Exception {
		applicationContext=(ApplicationContext)new ClassPathXmlApplicationContext("applicationContext.xml");
		classesService=(IClasses)applicationContext.getBean("classesService");
	}


	public void testGetClassesInt() {
	Classes classes=	classesService.getClasses(1);
	System.out.println(classes.getStclass());
	//	fail("Not yet implemented");
	}

	public void testGetClassesString() {
//		fail("Not yet implemented");
	}

}
