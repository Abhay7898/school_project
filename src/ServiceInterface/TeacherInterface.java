package ServiceInterface;

import java.sql.SQLException;
import java.util.List;
import model.Teacher;

public interface TeacherInterface {
	
	public List<Teacher> readAllTeacher() throws SQLException;

	public Teacher readTeacherBYID(int id);

	public int createTeacher(Teacher teac);

	public boolean updataTeacher(Teacher teac);

	public boolean deletTeacher(int id);

	public Teacher readTeacherByIdAndName(int id, String name);

}
