package beans;

import java.sql.Date;
import java.sql.Time;


public class Booking {
	int Booking_id;
	Date date;
	Time In_time;
	Time Out_time;
	boolean Booking_status;
	public int getBooking_id() {
		return Booking_id;
	}
	public void setBooking_id(int booking_id) {
		Booking_id = booking_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getIn_time() {
		return In_time;
	}
	public void setIn_time(Time in_time) {
		In_time = in_time;
	}
	public Time getOut_time() {
		return Out_time;
	}
	public void setOut_time(Time out_time) {
		Out_time = out_time;
	}
	public boolean isCancel() {
		return Booking_status;
	}
	public void setBooking_status(boolean booking_status) {
		Booking_status = booking_status;
	}
	
	
}
