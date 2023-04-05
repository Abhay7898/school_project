package service;

import java.sql.SQLException;
import java.util.List;

import model.StudentResult;

public interface StudentResultInterface {

	public List<StudentResult> readAllStudentResult() throws SQLException;

	public StudentResult readById(int id);

	public int createStudentResult(StudentResult sr);

	public boolean updataStudentResult(StudentResult sr);

	public boolean deletStudentResult(int id);

	public StudentResult readByIdAndName(int id, String name);
}
