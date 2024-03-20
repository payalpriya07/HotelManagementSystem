package ourproject.com.serviceImpl;

import java.util.List;

import ourproject.com.daoimpl.RoomDaoImpl;
import ourproject.com.model.Room;
import ourproject.com.service.RoomService;

public class RoomServiceImpl implements RoomService {
	
	RoomDaoImpl rdao=new RoomDaoImpl();
    @Override
	public Room createRoom (Room room) {
    	return rdao.createRoom(room);
    }
    
	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Room getRoom(int room_Id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Room updateRoom(int room_Id, Room room) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteRoom(int room_Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
