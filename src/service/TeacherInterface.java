package service;

import java.sql.SQLException;
import java.util.List;
import model.Teacher;

public interface TeacherInterface {
	
	public List<Teacher> getAllTeacher() throws SQLException;

	public Teacher getTeacherById(int id);

	public int createTeacher(Teacher teac);

	public boolean updataTeacher(Teacher teac);

	public boolean deletTeacherById(int id);

	public Teacher getTeacherByIdAndName(int id, String name);
	
	public Teacher getTeacherByStudentId(int id);
	
	//public Teacher get
	

}
