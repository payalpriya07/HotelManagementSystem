package ourproject.com.dao;

import java.util.List;

import ourproject.com.model.User;

public interface UserDao{
	User createUser(User user);
	List<User> getAllUsers();
	User getUser(int userId);
	User updateUser(int userId,User user);
	String deleteUser(int userId);
	
	
	
          /* User createUser(User user);
           List<User> getAllUser();
           User getUser(int id);
           User updateUser(int id,User user);
           String deleteUser(int id);*/		   

}