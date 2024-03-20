package ourproject.com.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import ourproject.com.model.User;
import ourproject.com.util.HibernateUtil;

public class UserDaoImpl {
	public User createUser(User user) {
		try(Session session=HibernateUtil.getSesssion()){
			
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			return user;
			
		}
		catch (HibernateException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return null;
		
		
	}

//	@Override
//	public List<User> getAllUsers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User getUser(int userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User updateUser(int userId, User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String deleteUser(int userId) {
//		// TODO Auto-generated method stub
//		return null;

}
