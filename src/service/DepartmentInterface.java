package service;

import java.sql.SQLException;
import java.util.List;

import model.Department;

public interface DepartmentInterface {

	public List<Department> getAllDepartment() ;

	public Department getDepartmentById(int id);

	public int createDepartment(Department dept);

	public boolean updataDepartment(Department dept);

	public boolean deletDepartment(int id);

	public Department getDepartmentByIdAndName(int id, String name);

}
