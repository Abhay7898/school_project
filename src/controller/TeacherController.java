package controller;

import java.sql.SQLException;
import java.util.List;

import model.Teacher;
import serviceImpl.TeacherServiceImpl;

public class TeacherController {
	public static void main(String[] args) throws SQLException {
		//readAllTeacher();
		//readStudentById();
	
	}

	private static void readStudentById() {
		TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl();
		Teacher tea=teacherServiceImpl.getTeacherById(1);
		tea.toString();
	}

	private static void readAllTeacher() throws SQLException {
		TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl();
		List<Teacher> teacher = teacherServiceImpl.getAllTeacher();
		for (Teacher tea : teacher) {
			System.out.println(tea);
		}
	}

}
