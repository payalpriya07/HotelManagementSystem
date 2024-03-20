package ourproject.com.service;

import java.util.List;

import ourproject.com.model.*;


public interface RoomService {
	Room createRoom(Room room);
	List<Room> getAllRooms();
	Room getRoom(int room_Id);
	Room updateRoom(int room_Id,Room room);
	String deleteRoom(int room_Id);
	

}
