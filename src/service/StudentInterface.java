package service;

import java.sql.SQLException;

import java.util.List;

import model.Student;

public interface StudentInterface {

	public List<Student> getAllStudent() throws SQLException;

	public Student getStudentById(int id);

	public int createStudent(Student stu);

	public boolean updataStudent(Student stu);

	public boolean deletStudent(int id);

	public Student getStudentByIdAndName(int id, String name);
	
	public Student getteacherById(int id);

}
