package inheritanceType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.Hibernate.entity.HourlyEmployee;
import com.deloitte.Hibernate.entity.SalariedEmployee;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		SalariedEmployee se = new SalariedEmployee(101,"Ajay",200.0);
		HourlyEmployee he = new HourlyEmployee(102,"babu",100,2);
		
		session.save(he);
		session.save(se);
		
		trans.commit();
		session.close();
	}
}
