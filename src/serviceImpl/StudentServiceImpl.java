package serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Student;
import service.StudentInterface;
import util.SchoolConnection;

public class StudentServiceImpl implements StudentInterface {

	Connection con = SchoolConnection.getConnection();

	@Override
	public List<Student> readAllStudent() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student readStudentBYID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createStudent(Student stu) {
		int data = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into Customer values (?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, stu.getsId());
			ps.setString(2, stu.getSname());
			ps.setString(3, stu.getsFatherName());
			ps.setString(4, stu.getSmothername());
			ps.setString(5, stu.getSlastname());
			ps.setInt(6, stu.getSage());
			ps.setString(7, stu.getSgender());
			ps.setString(8, stu.getSaddress());
			ps.setInt(9, stu.getSmono());
			ps.setString(10, stu.getSemailid());
			ps.setInt(11, stu.gettId());
			data = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		return 0;
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
	public Student readStudentByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
