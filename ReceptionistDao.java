package ourproject.com.dao;

import java.util.List;

import ourproject.com.model.Receptionist;

public interface ReceptionistDao {
	List<Receptionist> getAllReceptionist();
	Receptionist getReceptionist(int receptionist_Id);
	Receptionist updateReceptionist(int receptionist_Id,Receptionist receptionist);
	String deleteReceptionist(int receptionist_Id);

}
