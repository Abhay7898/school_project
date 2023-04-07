package serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Staff;
import model.Teacher;
import service.StaffInterface;
import util.CommonUtil;
import util.SchoolConnection;

public class StaffServiceImpl implements StaffInterface {

	@Override
	public List<Staff> getAllStaff() throws SQLException {
		List<Staff> list = new ArrayList<>();
		PreparedStatement ps = CommonUtil.commonStatement("select * from staff");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Staff st = new Staff();
			extracted(rs, st);
			list.add(st);
		}
		return list;
	}

	private void extracted(ResultSet rs, Staff st) throws SQLException {
		st.setSfId(rs.getInt(1));
		st.setSfFName(rs.getString(2));
		st.setSfLastName(rs.getString(3));
		st.setSfAge(rs.getInt(4));
		st.setSfGender(rs.getString(5));
		st.setSfAddress(rs.getString(6));
		st.setSfMobile(rs.getInt(7));
		st.setSfEmailId(rs.getString(8));
		st.setSfDoj(rs.getDate(9));
		st.setSfDepartment(rs.getString(10));
		st.setSfWork(rs.getString(11));
		st.setSfSalary(rs.getString(12));
	}

	@Override
	public Staff getStaffById(int id) {
		Staff st = new Staff();
		try {
			PreparedStatement ps = CommonUtil.commonStatement("select*from staff where sfid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				extracted(rs, st);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return st;
	}

	@Override
	public int createStaff(Staff sf) {
		int result = 0;
		Staff st = new Staff();
		try {
			PreparedStatement ps = CommonUtil.commonStatement("insert into staff value(?,?,?,?,?,?,?,?,?,?,?,?)");
			extracted2(st, ps);
			result = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println();
		}
		return result;
	}

	private void extracted2(Staff st, PreparedStatement ps) throws SQLException {
		ps.setInt(1, st.getSfId());
		ps.setString(2, st.getSfFName());
		ps.setString(3, st.getSfLastName());
		ps.setInt(4, st.getSfAge());
		ps.setString(5, st.getSfGender());
		ps.setString(6, st.getSfAddress());
		ps.setInt(7, st.getSfMobile());
		ps.setString(8, st.getSfEmailId());
		ps.setDate(9, st.getSfDoj());
		ps.setString(10, st.getSfDepartment());
		ps.setString(11, st.getSfWork());
		ps.setString(12, st.getSfSalary());
	}

	@Override
	public boolean updataStaff(Staff sf) {
		boolean result = false;
		try {
			PreparedStatement ps = CommonUtil.commonStatement(
					"update staff set sffname=?,sflastname=?,sfage=?,sfgender=?,sfaddress=?,sfmono=?,sfemailid=?,sfdoj=?,sfdepartment=?,sfwork=?,sfsalary=? where sfid=?");
			Staff st = new Staff();
			ps.setString(1, st.getSfFName());
			ps.setString(2, st.getSfLastName());
			ps.setInt(3, st.getSfAge());
			ps.setString(4, st.getSfGender());
			ps.setString(5, st.getSfAddress());
			ps.setInt(6, st.getSfMobile());
			ps.setString(7, st.getSfEmailId());
			// ps.setDate(8, st.getSfDoj());
			ps.setString(9, st.getSfDepartment());
			ps.setString(10, st.getSfWork());
			ps.setString(11, st.getSfSalary());
			ps.setInt(12, st.getSfId());
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public boolean deletStaff(int id) {
		int i = 0;
		try {
			PreparedStatement ps = CommonUtil.commonStatement("delete from staff where sfid=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return CommonUtil.conditionCheaq(i);
	}

	@Override
	public Staff getStaffByIdAndName(int id, String name) {
		Staff st = new Staff();
		try {
			PreparedStatement ps = CommonUtil.commonStatement("select*from staff where sid=? and sname =?");
			ps.setInt(1, id);
			ps.setString(2, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				extracted(rs, st);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return st;
	}

	@Override
	public Staff getDepartmentByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
