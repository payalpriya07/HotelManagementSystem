package ourproject.com.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import ourproject.com.model.Receptionist;
import ourproject.com.util.HibernateUtil;

public class ReceptionistDaoImpl {
	public Receptionist createReceptionist(Receptionist receptionist) {
		try(Session session=HibernateUtil.getSesssion()){
			
			session.beginTransaction();
			session.save(receptionist);
			session.getTransaction().commit();
			return receptionist;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;

}

}
