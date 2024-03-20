package ourproject.com.serviceImpl;

import java.util.List;
import ourproject.com.daoimpl.UserDaoImpl;
import ourproject.com.model.User;
import ourproject.com.service.UserService;

    public class UserServiceImpl implements UserService {

		UserDaoImpl udao=new UserDaoImpl();
	    @Override
		public User createUser (User user) {
			return udao.createUser(user);
		}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(int userId, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
}