package it.studentinfo.service;



import it.studentinfo.dao.IStudent;
import it.studentinfo.model.Student;
import it.studentinfo.util.HibernateSessionFactory;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
public class StudentService implements IStudent {
	
private HibernateTemplate hibernateTemplate=null;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

	public void saveStudent(Student student) {
		//Session session = HibernateSessionFactory.getSession();
		//session.getTransaction().begin();
	
		hibernateTemplate.save(student);
		//session.getTransaction().commit();
		//HibernateSessionFactory.closeSession(session);
	}

	public void deleteStudent(int stuid) {
		
		/*Goods goods =new Goods();
		goods.setSgid(sgid);
		
		Session session = HibernateSessionFactory.getSession();
		session.getTransaction().begin();
	//	session.delete(goods);		
		session.createQuery("DELETE FROM Goods WHERE sgid=:sgid")
		.setInteger("sgid", sgid)
		.executeUpdate();
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession(session);*/
		Student student=hibernateTemplate.get(Student.class, stuid);
		hibernateTemplate.delete(student);
		
	}

	public Student getStudent(int stuid) {
		/*Session session = HibernateSessionFactory.getSession();
		session.getTransaction().begin();
		Goods goods = (Goods) session.get(Goods.class, sgid);
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession(session);
		return goods;*/
		
		return hibernateTemplate.get(Student.class, stuid);
	}

	public void updateStudent(Student student) {
		/*Session session = HibernateSessionFactory.getSession();
		session.getTransaction().begin();
		session.update(goods);
		session.getTransaction().commit();
		HibernateSessionFactory.closeSession(session);*/
		hibernateTemplate.update(student);
	}

    public List<Student> getStudent(String stuname){
    	/*Session session = HibernateSessionFactory.getSession();
    	List<Goods> goodsList=session.createQuery(" from Goods g where g.sgname like:sgname")
    	.setString("sgname", "%"+sgname+"%").setFirstResult(1).setMaxResults(2).list();
    	return goodsList;*/
    	
    	List<Student> studentList=null;
    	studentList=	hibernateTemplate.findByNamedParam(" from Student s where s.stuname like:stuname", "stuname", "%"+stuname+"%");
    	
    	return studentList;
    }
    
    public List<Object> getStudent(final String stuname, final int currentPage) throws HibernateException, ParseException
			{
    	//SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
		//Session session = HibernateSessionFactory.getSession();
		/*
		 List<Goods> goodsList = session
				.createQuery("FROM Goods g WHERE g.sgname LIKE :sgname  and g.sgdate between:start and :end")
				.setString("sgname", "%" + sgname + "%")
				.setDate("start", simpleDate.parse("2014-08-06"))
				.setDate("end", simpleDate.parse("2014-08-08"))				
				.setFirstResult((currentPage - 1) * SIZE) 
				.setMaxResults(SIZE) 
				.list();
		 List<Goods> goodsList = session
					.createQuery("FROM Goods g WHERE g.sgname LIKE :sgname  and g.sgprice in (:sgprice)" )
					.setString("sgname", "%" + sgname + "%")
					.setParameterList("sgprice", new Double[] { 45.67,  29.0, 30d })	
					.setFirstResult((currentPage - 1) * SIZE) 
					.setMaxResults(SIZE) 
					.list();
					*/
		/*List<Object> goodsList = session
				.createQuery("FROM Goods g left JOIN g.scategory WHERE sgname LIKE :sgname")
				.setString("sgname", "%" + sgname + "%")
				.setFirstResult((currentPage - 1) * SIZE)
				.setMaxResults(SIZE)
				.list();		
		HibernateSessionFactory.closeSession(session);
		return goodsList;*/

    	
    return	 (List<Object>) hibernateTemplate.execute(new HibernateCallback<List<Object>>(){

			@Override
			public List<Object> doInHibernate(Session session)
					throws HibernateException, SQLException {
				List<Object> studentList=session
						.createQuery("FROM Student s left JOIN s.classes WHERE stuname LIKE :stuname")
						.setString("stuname", "%" + stuname + "%")
						.setFirstResult((currentPage - 1) * SIZE)
						.setMaxResults(SIZE)
						.list();		
				
				
				return studentList;
			}
    		
    	});
    	
    	
	}
    
    public int getCountPage(String stuname) {
		Session session = HibernateSessionFactory.getSession();
		/*String count = session.createQuery("select count(*) from Goods where sgname like:sgname" )
		.setString("sgname", "%" + sgname + "%")
		.uniqueResult()
		.toString();*/
		int count = Integer.parseInt(session.getNamedQuery("getCountPage")
				.setString("stuname", "%" + stuname + "%")
				.uniqueResult()
				.toString());
		HibernateSessionFactory.closeSession(session);
		return count % SIZE == 0 ? count / SIZE : count / SIZE + 1;
	}


}
