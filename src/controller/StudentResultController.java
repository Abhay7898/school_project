package controller;

import java.sql.SQLException;
import java.util.List;

import model.StudentResult;
import serviceImpl.StudentResultServiceImpl;
import util.CommonUtil;

public class StudentResultController {
	public static void main(String[] args) throws SQLException {
		//readAllResult();
		//creatData();
		//readById();
		//deleteData();
		//updateData();
	}

	private static void updateData() {
		StudentResultServiceImpl studentResultServiceImpl = new StudentResultServiceImpl();
		StudentResult student = new StudentResult();
		student.setrId(2);
		student.setsId(1);
		student.settId(1);
		student.setMaths(54);
		student.setPhysics(07);
		student.setChemistry(33);
		student.setHindi(80);
		student.setEnglish(60);
		student.setTotalmarks(200);
		student.setPass_fail(true);
		boolean result=studentResultServiceImpl.updataStudentResult(student);
		if(result) {
			System.out.println("Data updeted");
		}else {
			System.out.println("Data Not Updated");
		}
	}

	private static void deleteData() {
		StudentResultServiceImpl studentResultServiceImp=new StudentResultServiceImpl();
		boolean result =studentResultServiceImp.deletStudentResult(1);
		if(result) {
			System.out.println("Data Deleted");
		}else {
			System.out.println("Data Not Deleted");
		}
	}

	private static void readById() {
		StudentResultServiceImpl studentResultServiceImpl = new StudentResultServiceImpl();
		StudentResult studentResult=studentResultServiceImpl.getStudentResultById(1);
		CommonUtil.toString(studentResult);
	}

	private static void creatData() {
		StudentResultServiceImpl studentResultServiceImpl = new StudentResultServiceImpl();
		StudentResult student = new StudentResult();
		student.setrId(5);
		student.setsId(1);
		student.settId(1);
		student.setMaths(45);
		student.setPhysics(70);
		student.setChemistry(33);
		student.setHindi(80);
		student.setEnglish(60);
		student.setTotalmarks(200);
		student.setPass_fail(true);
		int i=studentResultServiceImpl.createStudentResult(student);
		if(i>0) {
			System.out.println("Data Inserted");
		}else {
			System.out.println("Data Not Inserted'");
		}
	}

	private static void readAllResult() throws SQLException {
		StudentResultServiceImpl studentResultServiceImpl = new StudentResultServiceImpl();
		List<StudentResult> list = studentResultServiceImpl.getAllStudentResult();
		for (StudentResult studentResult : list) {
			CommonUtil.toString(studentResult);
		}
	}
}
