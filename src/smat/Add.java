package smat;

/*
 * É¾³ý
 */
//Ìí¼Ó
public class Add {
	
	private String StaffID;
	private String StaffName;
	private String StaffSex;
	
	public Add(String staffID, String staffName, String staffSex) {
		super();
		StaffID = staffID;
		StaffName = staffName;
		StaffSex = staffSex;
	}
	
	public String getStaffID() {
		return StaffID;
	}
	public void setStaffID(String staffID) {
		StaffID = staffID;
	}
	public String getStaffName() {
		return StaffName;
	}
	public void setStaffName(String staffName) {
		StaffName = staffName;
	}
	public String getStaffSex() {
		return StaffSex;
	}
	public void setStaffSex(String staffSex) {
		StaffSex = staffSex;
	}
	

}
