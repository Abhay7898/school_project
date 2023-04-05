package service;

import java.sql.SQLException;

import java.util.List;

import model.Student;

public interface StudentInterface {

	public List<Student> readAllStudent() throws SQLException;

	public Student readStudentBYID(int id);

	public int createStudent(Student stu);

	public boolean updataStudent(Student stu);

	public boolean deletStudent(int id);

	public Student readStudentByIdAndName(int id, String name);

}
