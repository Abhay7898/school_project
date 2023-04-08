package controller;

import java.util.List;

import model.Student;
import model.Teacher;
import serviceImpl.StudentServiceImpl;
import serviceImpl.TeacherServiceImpl;

public class StudentController {
	public static void main(String[] args) {

		 create();

		// getById();

//		updata();

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
		stu.setsName("sakshi");
		stu.setsId(9);
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
		stu.setsId(10);
		stu.setsName("prachi");
		stu.setsFatherName("krishna");
		stu.setsMotherName("sunita");
		stu.setsLastName("hinge");
		stu.setsAge(19);
		stu.setsGender("femail");
		stu.setsAddress("Indore");
		stu.setsMobile(3789098);
		stu.setsEmailId("prachi54@gmail.com");
		stu.setsSubjec("hindi");
		TeacherServiceImpl ti = new TeacherServiceImpl();
		Teacher t = ti.getTeacherBySubject("hindi");
		stu.settId(t.gettId());

		int data = s.createStudent(stu);
		if (data > 0) {
			System.out.println("record is  created...!");
		} else {
			System.out.println("record is not created...!");
		}
	}

}
