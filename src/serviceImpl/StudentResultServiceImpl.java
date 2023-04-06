package serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.StudentResult;
import service.StudentResultInterface;
import util.SchoolConnection;

public class StudentResultServiceImpl implements StudentResultInterface  {
	Connection con = SchoolConnection.getConnection();
	@Override
	public List<StudentResult> getAllStudentResult() throws SQLException {
		List<Student> list = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from studentresult");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentResult res = new StudentResult();
				res.setrId(rs.getInt(1));
				res.setsId(rs.getInt(2));
				res.settId(rs.getInt(3));
				res.setMaths(rs.getInt(4));
				res.setPhysics(rs.getInt(5));
				res.setChemistry(rs.getInt(6));
				res.setHindi(rs.getInt(7));
				res.setEnglish(rs.getInt(8));
				res.setTotalmarks(rs.getInt(9));
				res.setPass_fail(rs.getBoolean(10));
				
				
				
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
		
	}

	@Override
	public StudentResult getStudentResultById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createStudentResult(StudentResult sr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updataStudentResult(StudentResult sr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletStudentResult(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public StudentResult getByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
