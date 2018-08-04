package it.studentinfo.action;

import it.studentinfo.dao.IStudent;
import it.studentinfo.model.Student;
import it.studentinfo.service.StudentService;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

// ActionSupport:灏卞彲浠ュ畬鏁碨truts鐨勬湇鍔″櫒绔獙璇�?
public class StudentAction extends ActionSupport {

	private static final long serialVersionUID = 8887540086216459075L;

	private Student student;

	private int currentPage;
	
	private IStudent studentService=null;
	public void setStudentService(IStudent studentService) {
		this.studentService = studentService;
	}


	
	private HttpServletRequest request = ServletActionContext.getRequest();
	private HttpSession session = request.getSession();


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String saveStudent() throws FileNotFoundException, IOException {
		
		System.out.println("in studentAction saveStudent");
	
		studentService.saveStudent(student);
		return "saveStudent" ;

	}
	
	public String updateStudent() throws FileNotFoundException, IOException {
		studentService.updateStudent(student);
		return "queryStudent";
	}
	
	public String queryStudent() throws Exception {

		
		System.out.println("studentService="+studentService);
		List<Object> object = studentService.getStudent(student.getStuname(), 1);
		// 瀛樺偍鍒嗛�?�鐨勪俊鎭�
		session.setAttribute("stuname", student.getStuname());
		session.setAttribute("countPage", studentService.getCountPage(student
				.getStuname()));
		session.setAttribute("currentPage", 1);
		// 瀛樺偍鏌ヨ缁撴�?
		request.setAttribute("object", object);
		return "queryStudent";
	}
	public String querySplitStudent() throws Exception {
		System.out.println("===>" + currentPage);
		String stuname = (String) session.getAttribute("stuname");
		// 鏇存柊鍒嗛�?�鐨勯�?�鏁�?
		session.setAttribute("currentPage", currentPage);
		// 瀛樺偍鏌ヨ缁撴�?
		List<Object> object = studentService.getStudent(stuname, currentPage);
		request.setAttribute("object", object);
		return "queryStudent";
	}
	public String queryStudentByStuid() {
		request.setAttribute("student", studentService.getStudent(student.getStuid()));
		return "updateStudent2";
	}
	
	public String deleteStudentByStuid() {
		studentService.deleteStudent(student.getStuid());
		return "queryStudent";
	}
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
}
