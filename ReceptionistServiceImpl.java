package ourproject.com.serviceImpl;

import java.util.List;

import ourproject.com.daoimpl.ReceptionistDaoImpl;
import ourproject.com.model.Receptionist;
import ourproject.com.service.ReceptionistService;

public class ReceptionistServiceImpl implements ReceptionistService{
	ReceptionistDaoImpl vdao = new ReceptionistDaoImpl();
    @Override
	public Receptionist createReceptionist (Receptionist receptionist) {
    	return vdao.createReceptionist(receptionist);
    }
    
	@Override
	public List<Receptionist> getAllReceptionists() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Receptionist getReceptionist(int receptionist_Id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Receptionist updateReceptionist(int receptionist_Id, Receptionist receptionist) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteReceptionist(int receptionist_Id) {
		// TODO Auto-generated method stub
		return null;
	}


}
