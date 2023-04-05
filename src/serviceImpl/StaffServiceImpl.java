package serviceImpl;

import java.sql.SQLException;
import java.util.List;

import model.Staff;
import service.StaffInterface;

public class StaffServiceImpl implements StaffInterface {

	@Override
	public List<Staff> getAllStaff() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff getStaffById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createStaff(Staff sf) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updataStaff(Staff sf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletStaff(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Staff getStaffByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
