package controller;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import model.Teacher;
import serviceImpl.TeacherServiceImpl;

public class TeacherController {
	public static void main(String[] args) throws SQLException {
		//readAllTeacher();
		//readStudentById();
		//creatTeacher();
		updata();
		//deletTeacher();
		
		
	}

	private static void deletTeacher() {
		TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl();
		boolean result =teacherServiceImpl.deletTeacherById(1);
		if (result) {
			System.out.println("Data inserted");
		}else {
			System.out.println("'Data not Inserted");
		}
	}

	private static void updata() {
		TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl();
		Teacher teacher= new Teacher();
		teacher.settId(1);
		teacher.settName("Abhay");
		teacher.settLastName("Garhewal");
		teacher.settAge(21);
		teacher.settGender("Male");
		teacher.settAddress("Lalbage");
		teacher.settMobile(789884592);
		teacher.settEmailId("abhaygarhwal@95");
		teacher.settSubject("maths");
		teacher.settDoj(new Date(System.currentTimeMillis()));
		boolean result =teacherServiceImpl.updataTeacher(teacher);
		if(result) {
			System.out.println("R");
		}
	}

	private static void creatTeacher() {
		TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl();
		Teacher teacher = new Teacher();
		teacher.settId(5);
		teacher.settName("vaishanvi");
		teacher.settLastName("bhute");
		teacher.settAge(22);
		
		teacher.settGender("female");
		teacher.settAddress("burhanpur");
		teacher.settMobile(8564533);
		teacher.settEmailId("vaishanvi@95");
		teacher.settDoj(new Date(System.currentTimeMillis()));
		teacher.settSubject("english");
		int result =teacherServiceImpl.createTeacher(teacher);
		if (result>0) {
			System.out.println("Data Insered");
		}else {
			System.out.println("Data noyt Insered");
		}
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
