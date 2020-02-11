package beans;

public class Building {
	
	int Building_no;
	String Building_name;
	String Location;
	int Floor_count;
	boolean Building_status;
	public int getBuilding_no() {
		return Building_no;
	}
	public void setBuilding_no(int building_no) {
		Building_no = building_no;
	}
	public String getBuilding_name() {
		return Building_name;
	}
	public void setBuilding_name(String building_name) {
		Building_name = building_name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getFloor_count() {
		return Floor_count;
	}
	public void setFloor_count(int floor_count) {
		Floor_count = floor_count;
	}
	public boolean isActive() {
		return Building_status;
	}
	public void setBuilding_status(boolean building_status) {
		Building_status = building_status;
	}
	
	

}
