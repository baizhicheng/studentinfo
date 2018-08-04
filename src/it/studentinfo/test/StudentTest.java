package it.studentinfo.test;

//import static org.junit.Assert.*;

//import org.junit.BeforeClass;
//import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	static StudentServiceImpl studentServiceImpl=null;

//	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//goodsServiceImpl=new GoodsServiceImpl();
	}

//	@Test
	public void save() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		studentServiceImpl=(StudentServiceImpl) context.getBean("IStudentService");
		//System.out.println(goodsServiceImpl);
		
		
	/*	ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
	System.out.println((GoodsServiceImpl) context2.getBean("IGoodsService"));*/
		studentServiceImpl.save();
		
		
		String s =new String("afddf");
	System.out.println(s.length());
		
	}

}
