package beans;

public class Floor {
	int Floor_number;
	int Room_count;
	boolean Floor_status;
	public int getFloor_number() {
		return Floor_number;
	}
	public void setFloor_number(int floor_number) {
		Floor_number = floor_number;
	}
	public int getRoom_count() {
		return Room_count;
	}
	public void setRoom_count(int room_count) {
		Room_count = room_count;
	}
	public boolean isActive() {
		return Floor_status;
	}
	public void setFloor_status(boolean floor_status) {
		Floor_status = floor_status;
	}
	
	
}
