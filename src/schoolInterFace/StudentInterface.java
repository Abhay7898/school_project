package schoolInterFace;

import java.sql.SQLException;
import java.util.List;
import model.Student;

public interface StudentInterface {
	public List<Student> readAllStudent() throws SQLException;

	public Student readStudentById(int sid) throws SQLException;

	public int deleteStudent(int sid);

	public int creatStudent(Student stu);

	public int updataStudent(Student st);
}
