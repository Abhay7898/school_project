package serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Student;
import service.StudentInterface;
import util.CommonUtil;
import util.SchoolConnection;

public class StudentServiceImpl implements StudentInterface {

	Connection con = SchoolConnection.getConnection();

	@Override
	public List<Student> getAllStudent() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createStudent(Student stu) {
		
		if(CommonUtil.isNotNull(con) || CommonUtil.isNotNull(stu)) {
			return 0;
		}
		
		int data = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into Customer values (?,?,?,?,?,?,?,?,?,?,?)");
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudentByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
