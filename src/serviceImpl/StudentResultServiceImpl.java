package serviceImpl;

import java.sql.SQLException;
import java.util.List;

import model.StudentResult;
import service.StudentResultInterface;

public class StudentResultServiceImpl implements StudentResultInterface  {

	@Override
	public List<StudentResult> getAllStudentResult() throws SQLException {
		// TODO Auto-generated method stub
		return null;
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
