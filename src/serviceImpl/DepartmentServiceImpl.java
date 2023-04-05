package serviceImpl;

import java.sql.SQLException;
import java.util.List;

import ServiceInterface.DepartmentInterface;
import model.Department;

public class DepartmentServiceImpl implements DepartmentInterface {

	@Override
	public List<Department> readAllDepartment() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department readDepartmentBYID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createDepartment(Department dept) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updataDepartment(Department dept) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletDepartment(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Department readDepartmentByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
