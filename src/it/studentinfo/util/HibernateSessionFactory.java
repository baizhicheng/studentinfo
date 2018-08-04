package it.studentinfo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * 读取XML配置文件, 拿到SessionFactory
 * 
 * 通过sessionFactory得到session(connection)
 * */
public class HibernateSessionFactory {

	private static SessionFactory sessionFactory = null;

	private HibernateSessionFactory() {

	}
//保证sessionFactory只有�?�?
	static {
		// 加载了Hibernate配置文件
		Configuration cfg = new Configuration().configure();
		sessionFactory = cfg.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Session getSession() {
		return sessionFactory.openSession();
	}

	public static void closeSession(Session session) {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
}
