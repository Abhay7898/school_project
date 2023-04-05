package serviceImpl;

import java.sql.SQLException;
import java.util.List;

import model.Teacher;
import service.TeacherInterface;

public class TeacherServiceImpl implements TeacherInterface {

	@Override
	public List<Teacher> getAllTeacher() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher getTeacherById(int id) {
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
	public boolean deletTeacherById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Teacher getTeacherByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
