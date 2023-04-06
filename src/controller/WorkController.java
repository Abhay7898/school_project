package controller;

import java.sql.SQLException;
import java.util.List;

import model.Department;
import model.Work;
import serviceImpl.DepartmentServiceImpl;
import serviceImpl.WorkServiceImpl;

public class WorkController {

	public static void main(String[] args) {

		getAllWork();

		getById();

		create();
		update();
		delete();
		getByIdAndName();
	}

	private static void getByIdAndName() {
		WorkServiceImpl w = new WorkServiceImpl();
		Work work = w.getWorkByIdAndName(1, "vaishanvi");
		System.out.println(work);
	}

	private static void delete() {
		WorkServiceImpl w = new WorkServiceImpl();
		boolean bol = w.deletWork(1);
		if (bol) {
			System.out.println("record is deleted");
		} else {
			System.out.println("record is mot deleted");
		}
	}

	private static void update() {
		WorkServiceImpl w = new WorkServiceImpl();
		Work work = new Work();
		work.setwId(1);
		work.setwName("hanu");
		boolean b = w.updataWork(work);
		if (b) {
			System.out.println("recored is updataed");
		} else {
			System.out.println("record is not updataed");
		}
	}

	private static void create() {
		WorkServiceImpl w = new WorkServiceImpl();
		Work work = new Work();
		work.setwId(1);
		work.setwName("shiv");
		work.setwLocation("d-block");
		int data = w.createWork(work);
		if (data == 0) {
			System.out.println("record is not created");
		} else {
			System.out.println("record is created");
		}
	}

	private static void getById() {
		WorkServiceImpl w = new WorkServiceImpl();
		Work work = w.getWorkById(1);
		System.out.println(work);
	}

	private static void getAllWork() {
		WorkServiceImpl w = new WorkServiceImpl();
		List<Work> listwork = w.getAllWork();
		for (Work work : listwork) {
			System.out.println(work);
		}
	}

}
