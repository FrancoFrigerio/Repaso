package ar.com.educacionit.dao.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private HibernateUtils() {
		
	}
	
	
	private static SessionFactory buildSessionFactory() {
		try {
					//Create the ServiceRegistry from hibernate.cfg.xml
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				
			
			
				//Create a metadata source using the specified service registry.
				Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
					
				return metadata.getSessionFactoryBuilder().build();
				} catch (Throwable ex) {
					System.err.println("Initial SessionFactory creation failed" + ex);
					throw new ExceptionInInitializerError(ex);
					
			// TODO: handle exception
		}
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
		}

		public static void shutdown() {
			//close caches and connection pools
			getSessionFactory().close();
		}
}
