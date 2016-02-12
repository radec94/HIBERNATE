package hb;

import org.hibernate.Session;
import org.hibernate.Transaction; 
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class PrincipalClass {
	private static SessionFactory factory; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	         factory = new Configuration().configure().buildSessionFactory();
	         System.out.println("OOOK");
	      }catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	}

	public void CreateO2M(){
		
		
	}
}
