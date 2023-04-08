package serviceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;

import model.Department;
import model.Student;
import service.DepartmentInterface;
import util.CommonUtil;
import util.SchoolConnection;

public class DepartmentServiceImpl implements DepartmentInterface {
	Connection con = SchoolConnection.getConnection();

	@Override
	public List<Department> getAllDepartment() {
		List<Department> list = new ArrayList<>();
		try {

			PreparedStatement ps = CommonUtil.commonStatement("select * from department");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Department departement = new Department();
				departement.setDeptId(rs.getInt(1));
				departement.setDeptName(rs.getString(2));
				departement.setDeptLocation(rs.getString(3));
				list.add(departement);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}

	@Override
	public Department getDepartmentById(int id) {

		Department dept = new Department();
		try {
			PreparedStatement ps = CommonUtil.commonStatement("select * from department Where deptId=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dept.setDeptId(rs.getInt(1));
				dept.setDeptName(rs.getString(2));
				dept.setDeptLocation(rs.getString(3));

			}
		} catch (Exception e) {
			System.out.println(dept);
		}

		return dept;
	}

	@Override
	public int createDepartment(Department dept) {
		int data = 0;
		try {
			PreparedStatement ps = CommonUtil.commonStatement("insert into department values (?,?,?)");
			ps.setInt(1, dept.getDeptId());
			ps.setString(2, dept.getDeptName());
			ps.setString(3, dept.getDeptLocation());
			data = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return data;
	}

	@Override
	public boolean updataDepartment(Department dept) {
		try {
			PreparedStatement ps = CommonUtil.commonStatement("update department set deptName=? Where deptId=?");
			ps.setString(1, dept.getDeptName());
			ps.setInt(2, dept.getDeptId());
			int i = ps.executeUpdate();
			return CommonUtil.conditionCheck(i);
		} catch (Exception e) {
			System.out.println(e);
		}

		return false;

	}

	@Override
	public boolean deletDepartment(int id) {
		try {
			PreparedStatement ps = CommonUtil.commonStatement("delete from department Where deptId=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			return CommonUtil.conditionCheck(i);
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	@Override
	public Department getDepartmentByIdAndName(int id, String name) {
		Department dept = new Department();
		try {
			PreparedStatement ps = CommonUtil.commonStatement("select * from department Where deptId=? and deptName=?");
			ps.setInt(1, id);
			ps.setString(2, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dept.setDeptId(rs.getInt(1));
				dept.setDeptName(rs.getString(2));
				dept.setDeptLocation(rs.getString(3));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return dept;
	}

}
