package service;

import java.sql.SQLException;
import java.util.List;

import model.Department;

public interface DepartmentInterface {

	public List<Department> readAllDepartment() throws SQLException;

	public Department readDepartmentBYID(int id);

	public int createDepartment(Department dept);

	public boolean updataDepartment(Department dept);

	public boolean deletDepartment(int id);

	public Department readDepartmentByIdAndName(int id, String name);

}
