package controller;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import model.Staff;
import serviceImpl.StaffServiceImpl;
import util.CommonUtil;

public class StaffController {
	public static void main(String[] args) throws SQLException {

		//getAllStaff();
		//getById();
		// creatData();
		 //updateData();
		 //deleteData();
		//getbyIdAndName();
	}

	private static void getbyIdAndName() {
		StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
		Staff st = staffServiceImpl.getStaffByIdAndName(3, "abhi");
		CommonUtil.toString(st);
	}

	private static void deleteData() {
		StaffServiceImpl strServiceImpl = new StaffServiceImpl();
		boolean result = strServiceImpl.deletStaff(2);
		if (result) {
			System.out.println("Data deleted");
		} else {
			System.out.println("Data Not Deleted");
		}
	}

	private static void updateData() {
		StaffServiceImpl staffServiceImpl = new StaffServiceImpl();
		Staff st = new Staff();
		st.setSfId(2);
		st.setSfFName("Abhi");
		st.setSfLastName("garhwal");
		st.setSfAddress("lalbag");
		st.setSfAge(45);
		st.setSfDepartment(" MCA");
		st.setSfDoj(new Date(System.currentTimeMillis()));
		st.setSfEmailId("abhi98@gmail.com");
		st.setSfGender("mail");
		st.setSfMobile(8758575);
		st.setSfSalary("90000");
		st.setSfWork("marketing");
		boolean result = staffServiceImpl.updataStaff(st);
		if (result) {
			System.out.println("Data updated");
		} else {
			System.out.println("Data not updated");
		}
	}

	private static void creatData() {
		StaffServiceImpl stf = new StaffServiceImpl();
		Staff st = new Staff();
		st.setSfId(4);
		st.setSfFName("abhi");
		st.setSfLastName("garhwal");
		st.setSfAddress("lalbag");
		st.setSfAge(45);
		st.setSfDepartment(" ");
		st.setSfDoj(new Date(System.currentTimeMillis()));
		st.setSfEmailId("abhi98@gmail.com");
		st.setSfGender("Male");
		st.setSfMobile(8758575);
		st.setSfSalary("90000");
		st.setSfWork("marketing");
		int result = stf.createStaff(st);
		if (result > 0) {
			System.out.println("Record Is  Created");
		} else {
			System.out.println("Record Is Not Created");
		}
	}

	private static void getById() {
		StaffServiceImpl stf = new StaffServiceImpl();
		Staff st = stf.getStaffById(2);
		CommonUtil.toString(st);
	}

	private static void getAllStaff() throws SQLException {
		StaffServiceImpl stf = new StaffServiceImpl();
		List<Staff> list = stf.getAllStaff();
		for (Staff staff : list) {
			CommonUtil.toString(staff);
		}
	}
}
