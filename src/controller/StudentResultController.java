package controller;

import java.sql.SQLException;
import java.util.List;

import model.StudentResult;
import serviceImpl.StudentResultServiceImpl;
import util.CommonUtil;

public class StudentResultController {
	public static void main(String[] args) throws SQLException {
		//readAllResult();
		insertData();
		
	}

	private static void insertData() {
		StudentResultServiceImpl studentResultServiceImpl = new StudentResultServiceImpl();
		StudentResult student = new StudentResult();
		student.setrId(1);
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
			CommonUtil.toString(list);
		}
	}
}
