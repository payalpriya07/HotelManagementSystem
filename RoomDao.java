package ourproject.com.dao;

import java.util.List;
import ourproject.com.model.*;

public interface RoomDao{
	Room createroom(Room room);
	List<Room> getAllRoom();
	Room getRoom(int room_Id);
	Room updateRoom(int room_Id,Room room);
	String deleteRoom(int room_Id);
}