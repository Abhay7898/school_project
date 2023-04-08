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
import util.CommonUtil;
import util.SchoolConnection;

public class StudentResultServiceImpl implements StudentResultInterface {
	Connection con = SchoolConnection.getConnection();

	@Override
	public List<StudentResult> getAllStudentResult() throws SQLException {
		List<StudentResult> list = new ArrayList<>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from student_result");
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
				list.add(res);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;

	}

	@Override
	public StudentResult getStudentResultById(int id) {
		StudentResult sr = new StudentResult();
		try {
			PreparedStatement ps = con.prepareStatement("select * from student_result where rid = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				sr.setrId(rs.getInt(1));
				sr.setsId(rs.getInt(2));
				sr.settId(rs.getInt(3));
				sr.setMaths(rs.getInt(4));
				sr.setPhysics(rs.getInt(5));
				sr.setChemistry(rs.getInt(6));
				sr.setHindi(rs.getInt(7));
				sr.setEnglish(rs.getInt(8));
				sr.setTotalmarks(rs.getInt(id));
				sr.setPass_fail(rs.getBoolean(9));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return sr;
	}

	@Override
	public int createStudentResult(StudentResult student) {
		int result = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into student_result value(?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, student.getrId());
			ps.setInt(2, student.getsId());
			ps.setInt(3, student.gettId());
			ps.setInt(4, student.getMaths());
			ps.setInt(5, student.getPhysics());
			ps.setInt(6, student.getChemistry());
			ps.setInt(7, student.getHindi());
			ps.setInt(8, student.getEnglish());
			ps.setInt(9, student.getTotalmarks());
			ps.setBoolean(10, student.isPass_fail());
			result = ps.executeUpdate();
			if (result > 0) {
				return result;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public boolean updataStudentResult(StudentResult student) {
		try {
			PreparedStatement ps = con.prepareStatement(
					"update student_result set sid=?,tid=?,maths=?,physics=?,chemistry=?,hindi=?,english=?,totalmarks=?,pass_fail=? where rid=? ");
			ps.setInt(1, student.getsId());
			ps.setInt(2, student.gettId());
			ps.setInt(3, student.getMaths());
			ps.setInt(4, student.getPhysics());
			ps.setInt(5, student.getChemistry());
			ps.setInt(6, student.getHindi());
			ps.setInt(7, student.getEnglish());
			ps.setInt(8, student.getTotalmarks());
			ps.setBoolean(9, student.isPass_fail());
			ps.setInt(10, student.getrId());
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
	public boolean deletStudentResult(int id) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from student_result where rid =?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
