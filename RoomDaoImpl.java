package ourproject.com.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import ourproject.com.model.Room;
import ourproject.com.util.HibernateUtil;



public class RoomDaoImpl {
	public Room createRoom(Room room) {
		try(Session session=HibernateUtil.getSesssion()){
			
			session.beginTransaction();
			session.save(room);
			session.getTransaction().commit();
			return room;
			
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