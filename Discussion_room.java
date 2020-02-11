package beans;

public class Discussion_room {
	int Room_number;
	int Floor_number;
	int Building_number;
	int Asset_id;
	boolean Room_status;
	public int getRoom_number() {
		return Room_number;
	}
	public void setRoom_number(int room_number) {
		Room_number = room_number;
	}
	public boolean isActive() {
		return Room_status;
	}
	public void setRoom_status(boolean room_status) {
		Room_status = room_status;
	}
	
	

}
