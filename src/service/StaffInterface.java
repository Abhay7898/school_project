package service;

import java.sql.SQLException;
import java.util.List;

import model.Staff;

public interface StaffInterface {
	
	public List<Staff> getAllStaff() throws SQLException;

	public Staff getStaffById(int id);

	public int createStaff(Staff sf);

	public boolean updataStaff(Staff sf);

	public boolean deletStaff(int id);

	public Staff getStaffByIdAndName(int id, String name);

}
