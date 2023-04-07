package controller;


import java.util.List;

import model.Student;
import serviceImpl.StudentServiceImpl;

public class StudentController {
	public static void main(String[] args) {

		// create();

		// getById();

		// updata();

		// delete();

		// getByIdAndName();

		// getAllStudent();

	}

	private static void getAllStudent() {
		StudentServiceImpl s = new StudentServiceImpl();
		List<Student> listStudent = s.getAllStudent();
		for (Student stu : listStudent) {
			System.out.println(stu);
		}
	}

	private static void getByIdAndName() {
		StudentServiceImpl s = new StudentServiceImpl();
		Student stu = s.getStudentByIdAndName(1, "nandini");
		System.out.println(stu);
	}

	private static void delete() {
		StudentServiceImpl s = new StudentServiceImpl();
		boolean bl = s.deletStudent(1);
		if (bl) {
			System.out.println("record is deleted....!");
		} else {
			System.out.println("record is not deleted...!");
		}
	}

	private static void updata() {
		StudentServiceImpl s = new StudentServiceImpl();
		Student stu = new Student();
		stu.setsId(1);
		stu.setsName("vaishu"); // yaha par do hoi value kyu set ki he :-Abhay
		boolean b = s.updataStudent(stu);
		if (b) {
			System.out.println("record is updated...!");
		} else {
			System.out.println("record is not updated...!");

		}
	}

	private static void getById() {
		StudentServiceImpl s = new StudentServiceImpl();
		Student stu = s.getStudentById(1);
		System.out.println(s);
	}

	private static void create() {
		StudentServiceImpl s = new StudentServiceImpl();
		Student stu = new Student();
		stu.setsId(1);
		stu.setsName("nandini");
		stu.setsFatherName("vinod");
		stu.setsMotherName("sarika");
		stu.setsLastName("gadhwal");
		stu.setsAge(20);
		stu.setsGender("femail");
		stu.setsAddress("burhanpur");
		stu.setsMobile(98474737);
		stu.setsEmailId("nandini24@gmail.com");
		stu.settId(1);
		int data = s.createStudent(stu);
		if (data == 0) {
			System.out.println("record is not created...!");
		} else {
			System.out.println("record is created...!");
		}
	}

}
