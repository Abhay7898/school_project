package serviceImpl;

import java.sql.SQLException;
import java.util.List;

import ServiceInterface.TeacherInterface;
import model.Teacher;

public class TeacherServiceImpl implements TeacherInterface {

	@Override
	public List<Teacher> readAllTeacher() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher readTeacherBYID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createTeacher(Teacher teac) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updataTeacher(Teacher teac) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletTeacher(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Teacher readTeacherByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
