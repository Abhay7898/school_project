package controller;

import java.sql.SQLException;
import java.util.List;

import model.Teacher;
import serviceImpl.TeacherServiceImpl;

public class TeacherController {
	public static void main(String[] args) throws SQLException {
		TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl();
		//readAllTeacher(teacherServiceImpl);
		
	}

	private static void readAllTeacher(TeacherServiceImpl teacherServiceImpl) throws SQLException {
		List<Teacher> teacher = teacherServiceImpl.getAllTeacher();
		for (Teacher tea : teacher) {
			System.out.println(tea);
		}
	}

}
