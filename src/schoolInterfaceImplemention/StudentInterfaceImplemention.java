package schoolInterfaceImplemention;

import java.sql.SQLException;
import java.util.List;

import model.Student;
import schoolInterFace.StudentInterface;

public class StudentInterfaceImplemention implements StudentInterface{

	@Override
	public List<Student> readAllStudent() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student readStudentById(int sid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteStudent(int sid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int creatStudent(Student stu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updataStudent(Student st) {
		// TODO Auto-generated method stub
		return 0;
	}

}
