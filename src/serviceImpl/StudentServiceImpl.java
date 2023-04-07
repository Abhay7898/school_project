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
			PreparedStatement ps = CommonUtil.commonStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student stu = new Student();
				setDataInStudent(stu, rs);
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
			PreparedStatement ps = CommonUtil.commonStatement("select * from student Where sId=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				setDataInStudent(stu, rs);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return stu;
	}

	private void setDataInStudent(Student stu, ResultSet rs) throws SQLException {
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

	@Override
	public int createStudent(Student student) {

	//	if (CommonUtil.isNotNull(con) || CommonUtil.isNotNull(stu)) {
			//return 0;
		//}

		int data = 0;
		try {
			PreparedStatement ps = CommonUtil.commonStatement("insert into student values (?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, student.getsId());
			ps.setString(2, student.getsName());
			ps.setString(3, student.getsFatherName());
			ps.setString(4, student.getsMotherName());
			ps.setString(5, student.getsLastName());
			ps.setInt(6, student.getsAge());
			ps.setString(7, student.getsGender());
			ps.setString(8, student.getsAddress());
			ps.setInt(9, student.getsMobile());
			ps.setString(10, student.getsEmailId());
			ps.setInt(11, student.gettId());
			ps.setString(12, student.getsSubjec());
			data = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return data;
	}

	@Override
	public boolean updataStudent(Student stu) {
		try {
			PreparedStatement ps = CommonUtil.commonStatement("update student set sId=? Where sName=?");
			ps.setInt(1, stu.getsId());
			ps.setString(2, stu.getsName());
			int i = ps.executeUpdate();
			return CommonUtil.conditionCheaq(i);
		} catch (Exception e) {
			System.out.println(e);
		}

		return true;
	}

	@Override
	public boolean deletStudent(int id) {
		try {
			PreparedStatement ps = CommonUtil.commonStatement("delete from student Where sId=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			return CommonUtil.conditionCheaq(i);
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	@Override
	public Student getStudentByIdAndName(int id, String name) {
		Student stu = new Student();
		try {
			PreparedStatement ps = CommonUtil.commonStatement("select * from student Where sId=? and sName=?");
			ps.setInt(1, id);
			ps.setString(2, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				setDataInStudent(stu, rs);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return stu;
	}

	@Override
	public Student getteacherById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
