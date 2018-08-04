package it.studentinfo.service;

import java.util.List;

import it.studentinfo.dao.IClasses;
import it.studentinfo.model.Classes;
import it.studentinfo.util.HibernateSessionFactory;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class ClassesService implements IClasses {
	private HibernateTemplate hibernateTemplate=null;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Classes getClasses(int stid) {
	//	Session session = HibernateSessionFactory.getSession();
		Classes classes = (Classes) hibernateTemplate.get(Classes.class, stid);
	//	HibernateSessionFactory.closeSession(session);
		return classes;
	}

	@SuppressWarnings("unchecked")
	public List<Classes> getClasses(String stclass) {
		
	return	hibernateTemplate.findByNamedParam("FROM Classes c WHERE c.stclass LIKE :stclass", "stclass", "%" + stclass + "%");
		
		//return classeses;
	}

}
