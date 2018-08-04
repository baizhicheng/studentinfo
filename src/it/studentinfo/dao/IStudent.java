package it.studentinfo.dao;


import java.text.ParseException;
import java.util.List;

import org.hibernate.HibernateException;

import it.studentinfo.model.Student;

public interface IStudent {
   int SIZE=3;
	public void saveStudent(Student student);
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int stuid);
	
	public Student getStudent(int stuid);
	
	public List<Student> getStudent(String stuname);
	
	public List<Object> getStudent(String stuname,int currentPage) throws HibernateException, ParseException;
	
	public int getCountPage(String stuname);
}
