package ourproject.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Room {
    @Id
    @Column(name="room_id", length=50)
    private int roomId;

    @Column(name="room_name", length=50)
    private String roomName;

    
    public Room(int roomId, String roomName) {
        super();
        this.roomId = roomId;
        this.roomName = roomName;
        
    }

    public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

 
}
