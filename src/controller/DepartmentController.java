package controller;

import java.util.List;

import model.Department;
import serviceImpl.DepartmentServiceImpl;
import util.CommonUtil;

public class DepartmentController {
	public static void main(String[] args) {
		getAllDepartment();
		updata();
		readById();
		create();
		delete();
		getDepartmentByIdAndName();

	}

	private static void getDepartmentByIdAndName() {
		DepartmentServiceImpl d = new DepartmentServiceImpl();
		Department dept = d.getDepartmentByIdAndName(1, "nandini");
		CommonUtil.toString(dept);
	}

	private static void delete() {
		DepartmentServiceImpl d = new DepartmentServiceImpl();
		boolean bol = d.deletDepartment(1);
		if (bol) {
			System.out.println("record is deleted");
		} else {
			System.out.println("record is mot deleted");
		}
	}

	private static void create() {
		DepartmentServiceImpl d = new DepartmentServiceImpl();
		Department dept = new Department();
		dept.setDeptId(1);
		dept.setDeptName("abhay");
		dept.setDeptLocation("f-block");
		int data = d.createDepartment(dept);
		if (data == 0) {
			System.out.println("record is not created");
		} else {
			System.out.println("record is created");
		}
	}

	private static void readById() {
		DepartmentServiceImpl d = new DepartmentServiceImpl();
		Department dept = d.getDepartmentById(1);
		System.out.println(d);
	}

	private static void updata() {
		DepartmentServiceImpl d = new DepartmentServiceImpl();
		Department dept = new Department();
		dept.setDeptId(1);
		dept.setDeptName("aarti");
		boolean bol = d.updataDepartment(dept);
		if (bol) {
			System.out.println("recored is updataed");
		} else {
			System.out.println("record is not updataed");
		}
	}

	private static void getAllDepartment() {
		DepartmentServiceImpl d = new DepartmentServiceImpl();
		List<Department> listdepartment = d.getAllDepartment();
		for (Department department : listdepartment) {
			System.out.println(department);

		}
	}

}
