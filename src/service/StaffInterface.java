package service;

import java.sql.SQLException;
import java.util.List;

import model.Staff;

public interface StaffInterface {
	
	public List<Staff> readAllStaff() throws SQLException;

	public Staff readStaffBYID(int id);

	public int createStaff(Staff sf);

	public boolean updataStaff(Staff sf);

	public boolean deletStaff(int id);

	public Staff readStaffByIdAndName(int id, String name);

}
