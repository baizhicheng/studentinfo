package it.studentinfo.test;

//import static org.junit.Assert.*;
import it.studentinfo.dao.IClasses;
import it.studentinfo.dao.IStudent;
import it.studentinfo.model.Student;

//import org.junit.BeforeClass;
//import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentServiceTest {
	private static IStudent  studentService=null;
	private static ApplicationContext applicationContext=null;

	//@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext=(ApplicationContext)new ClassPathXmlApplicationContext("applicationContext.xml");
		studentService=(IStudent)applicationContext.getBean("studentService");
	}

//	@Test
	public void testSaveStudent() {
		Student student=new Student();
		student.setStuname("sun");
		student.setStusex("WOMAN");
		
		studentService.saveStudent(student);
		
//		fail("Not yet implemented");
	}

}
