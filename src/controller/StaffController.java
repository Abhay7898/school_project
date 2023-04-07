package controller;

import java.sql.SQLException;
import java.util.List;

import model.Staff;
import serviceImpl.StaffServiceImpl;
import util.CommonUtil;

public class StaffController {
	public static void main(String[] args) throws SQLException {

		//getAllStaff();
		//getById();
		//InsertData();
		//updateData();
		//deleteData();
		//getbyIdAndName();
	}

	private static void getbyIdAndName() {
		StaffServiceImpl staffServiceImpl=new StaffServiceImpl();
		Staff st=staffServiceImpl.getStaffByIdAndName(1, "Abhay");
		CommonUtil.toString(st);
	}

	private static void deleteData() {
		StaffServiceImpl strServiceImpl = new StaffServiceImpl();
		boolean result =strServiceImpl.deletStaff(1);
		if(result) {
			System.out.println("Data deleted");
		}else {
			System.out.println("Data Not Deleted");
		}
	}

	private static void updateData() {
		StaffServiceImpl staffServiceImpl=new StaffServiceImpl();
		Staff st = new Staff();
		st.setSfId(1);
		st.setSfFName("abhi");
		st.setSfLastName("garhwal");
		st.setSfAddress("lalbag");
		st.setSfAge(45);
		st.setSfDepartment(" ");
		// st.setSfDoj();
		st.setSfEmailId("abhi98@");
		st.setSfGender("mail");
		st.setSfMobile(8758575);
		st.setSfSalary("90000");
		st.setSfWork("marketing");
		boolean result =staffServiceImpl.updataStaff(st);
		if(result) {
			System.out.println("Data updateed");
		}else {
			System.out.println("Data not updated");
		}
	}

	private static void InsertData() {
		StaffServiceImpl stf = new StaffServiceImpl();
		Staff st = new Staff();
		st.setSfId(1);
		st.setSfFName("abhi");
		st.setSfLastName("garhwal");
		st.setSfAddress("lalbag");
		st.setSfAge(45);
		st.setSfDepartment(" ");
		// st.setSfDoj();
		st.setSfEmailId("abhi98@");
		st.setSfGender("mail");
		st.setSfMobile(8758575);
		st.setSfSalary("90000");
		st.setSfWork("marketing");
		int result = stf.createStaff(st);
		if (result == 0) {
			System.out.println("record is not created");
		} else {
			System.out.println("record is created");
		}
	}

	private static void getById() {
		StaffServiceImpl stf = new StaffServiceImpl();
		Staff st = stf.getStaffById(1);
		CommonUtil.toString(st);
	}

	private static void getAllStaff() throws SQLException {
		StaffServiceImpl stf = new StaffServiceImpl();
		List<Staff> liststaff = stf.getAllStaff();

		if (!CommonUtil.isNullOrEmpty(liststaff)) {

			for (Staff staff : liststaff) {
				System.out.println(staff);
			}
		}
	}

}
