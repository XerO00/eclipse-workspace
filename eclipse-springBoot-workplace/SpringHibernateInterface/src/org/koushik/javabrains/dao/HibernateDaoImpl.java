package org.koushik.javabrains.dao;

import javax.persistence.Access;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl {
  
	private SessionFactory sessionFactory;
	
	public long getCirleCount() {
	    
		System.out.println("HibernateDaoImpl class method getCircle");
	    String hql ="SELECT COUNT(*) FROM Circle";
	    
	    //jdbcTemplate.setDataSource(getDataSource());
        // int count = jdbcTemplate.queryForObject(sql, new Object[] {  }, Integer.class);   
	    
	   Query query=getsessionFactory().openSession().createQuery(hql);
	    return (long)query.uniqueResult();   
	}
    
	@Autowired
	public SessionFactory getsessionFactory() {
		return sessionFactory;
	}
	@Autowired
	public void setsessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}