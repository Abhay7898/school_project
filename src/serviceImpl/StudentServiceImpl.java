package serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import service.StudentInterface;
import util.CommonUtil;
import util.SchoolConnection;

public class StudentServiceImpl implements StudentInterface {

	Connection con = SchoolConnection.getConnection();

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student stu = new Student();
				stu.setsId(rs.getInt(1));
				stu.setsName(rs.getString(2));
				stu.setsFatherName(rs.getString(3));
				stu.setsMotherName(rs.getString(4));
				stu.setsLastName(rs.getString(5));
				stu.setsAge(rs.getInt(6));
				stu.setsAddress(rs.getString(7));
				stu.setsEmailId(rs.getString(8));
				stu.setsGender(rs.getString(9));
				stu.setsMobile(rs.getInt(10));
				stu.settId(rs.getInt(11));
				list.add(stu);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	@Override
	public Student getStudentById(int id) {
		Student stu = new Student();
		try {
			PreparedStatement ps = con.prepareStatement("select * from student Where sId=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				stu.setsId(rs.getInt(1));
				stu.setsName(rs.getString(2));
				stu.setsFatherName(rs.getString(3));
				stu.setsMotherName(rs.getString(4));
				stu.setsLastName(rs.getString(5));
				stu.setsAge(rs.getInt(6));
				stu.setsAddress(rs.getString(7));
				stu.setsEmailId(rs.getString(8));
				stu.setsGender(rs.getString(9));
				stu.setsMobile(rs.getInt(10));
				stu.settId(rs.getInt(11));

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return stu;
	}

	@Override
	public int createStudent(Student stu) {

		if (CommonUtil.isNotNull(con) || CommonUtil.isNotNull(stu)) {
			return 0;
		}

		int data = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, stu.getsId());
			ps.setString(2, stu.getsName());
			ps.setString(3, stu.getsFatherName());
			ps.setString(4, stu.getsMotherName());
			ps.setString(5, stu.getsLastName());
			ps.setInt(6, stu.getsAge());
			ps.setString(7, stu.getsGender());
			ps.setString(8, stu.getsAddress());
			ps.setInt(9, stu.getsMobile());
			ps.setString(10, stu.getsEmailId());
			ps.setInt(11, stu.gettId());
			data = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return data;
	}

	@Override
	public boolean updataStudent(Student stu) {
		try {
			PreparedStatement ps = con.prepareStatement("update student set sName=? Where sId=?");
			ps.setString(1, stu.getsName());
			ps.setInt(2, stu.getsId());
			int i = ps.executeUpdate();
			if (i == 0) {
				return false;
			}
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}

		return true;
	}

	@Override
	public boolean deletStudent(int id) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from student Where sId=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if (i == 0) {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	@Override
	public Student getStudentByIdAndName(int id, String name) {
		Student stu = new Student();
		try {
			PreparedStatement ps = con.prepareStatement("select * from student Where sId=? and sName=?");
			ps.setInt(1, id);
			ps.setString(2, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				stu.setsId(rs.getInt(1));
				stu.setsName(rs.getString(2));
				stu.setsFatherName(rs.getString(3));
				stu.setsMotherName(rs.getString(4));
				stu.setsLastName(rs.getString(5));
				stu.setsAge(rs.getInt(6));
				stu.setsAddress(rs.getString(7));
				stu.setsEmailId(rs.getString(8));
				stu.setsGender(rs.getString(9));
				stu.setsMobile(rs.getInt(10));
				stu.settId(rs.getInt(11));

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return stu;
	}

}
