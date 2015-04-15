package com.cdcc;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.binding.HibernateTypeDescriptor;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {

    public static final void main(String[] args) {
    	/**
        	 * Fetch data from DB
        	 */
        	// Hibernate instance
        	Configuration cfg = new Configuration().configure();
        	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
        	applySettings(cfg.getProperties());
        	SessionFactory factory = cfg.buildSessionFactory(builder.build());
        	Session session = factory.openSession();
        	
        	// Load Mario's diary
//        	Transaction tx1 = session.beginTransaction();
//        	String hql1 = "FROM Person";
//        	Query query1 = session.createQuery(hql1);
//        	List<Person> persons = query1.list();
//        	tx1.commit();
        	
        	session.close();
        	factory.close();
           
        try {
        	
            // load up the knowledge base
//	        KieServices ks = KieServices.Factory.get();
//    	    KieContainer kContainer = ks.getKieClasspathContainer();
//        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}