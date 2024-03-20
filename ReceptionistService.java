package ourproject.com.service;

import java.util.List;

import ourproject.com.model.Receptionist;

public interface ReceptionistService {
	Receptionist createReceptionist(Receptionist receptionist);
	List<Receptionist> getAllReceptionists();
	Receptionist getReceptionist(int receptionist_Id);
	Receptionist updateReceptionist(int receptionist_Id,Receptionist receptionist);
	String deleteReceptionist(int receptionist_Id);
	

}
