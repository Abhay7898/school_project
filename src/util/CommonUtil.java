package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Department;
import model.Staff;
import model.Student;
import model.StudentResult;
import model.Teacher;
import model.Work;

public class CommonUtil {
	private static final Student Student = null;
	static Connection con = SchoolConnection.getConnection();

	public static boolean isNullOrEmpty(String s) {
		if (s != null && !s.isEmpty()) {
			return true;
		}
		return false;
	}

	public static boolean isNullOrEmpty(List<?> s) {
		if (s != null && !s.isEmpty()) {
			return true;
		}
		return false;
	}

	public static boolean isNotNull(Object o) {
		if (o != null) {
			return true;
		}
		return false;
	}

	public static void toString(Object o) {
		if (o instanceof Department) {
			Department d = (Department) o;
			System.out.println("Department [deptId=" + d.getDeptId() + ", deptName=" + d.getDeptName()
					+ ", deptLocation=" + d.getDeptLocation() + "]");
		 		}else if(o instanceof Student) {
			Student stu=(Student) o;
			System.out.println("Student [sId=" + stu.getsId() + ", sName=" + stu.getsName() + ", sFatherName=" + stu.getsFatherName()+ ", sMotherName="
					+ stu.getsMobile() + ", sLastName=" + stu.getsLastName() + ", sAge=" + stu.getsAge() + ", sGender=" + stu.getsGender() + ", sAddress="
					+ stu.getsAddress() + ", sMobile=" + stu.getsMobile() + ", sEmailId=" + stu.getsEmailId() + ", tId=" + stu.gettId()+ "]");	
		}
		else if (o instanceof Staff) {
			Staff st = (Staff) o;
			System.out.println("Staff[sid =" +st.getSfId()+",sName="+st.getSfFName()+",sfLastName="+st.getSfLastName()+",sfAge="+st.getSfAge()+"sfGender="+st.getSfGender()+"sfAdress="+st.getSfAddress()+"sfMoblie="+st.getSfMobile()+"sfEmailId="+st.getSfEmailId()+"sfDoj="+st.getSfDoj()+"sfDepartment="+st.getSfDepartment()+"sfWork="+st.getSfWork()+"sfSalary"+st.getSfSalary()+"]");
		}else if(o instanceof Teacher) {
			Teacher t = (Teacher) o;
			System.out.println("Teacher[tId=" +t.gettId()+"tName"+t.gettName()+"tLastName="+t.gettLastName()+"tAge="+t.gettAge()+"tGender="+t.gettGender()+"tAdress="+t.gettAddress()+"tMoblie="+t.gettMobile()+"tEmailId="+t.gettEmailId()+"tDoj="+t.gettDoj()+"]");
		}
		else if (o instanceof Work) {
			Work w = (Work) o;
			System.out.println("Work [wId=" + w.getwId()+ ", wName=" +w.getwName() + ", wLocation=" +w.getwLocation()+ "]");
		}
		else if (o instanceof StudentResult) {
			StudentResult sr= (StudentResult) o;
			System.out.println("StudentResult [rId=" + sr.getrId()+ ", sId=" + sr.getsId()+ ", tId=" + sr.gettId()+ ", maths=" +sr.getMaths() + ", physics="
					+sr.getPhysics() + ", chemistry=" +sr.getChemistry() + ", hindi=" + sr.getHindi() + ", english=" +sr.getEnglish() + ", totalmarks="
					+ sr.getTotalmarks() + ", pass_fail=" + sr.isPass_fail() + "]");
		}
	}

	public static boolean conditionCheck(int i) {
		if (i > 0) {
			return true;
		}
		return false;
	}

	public static PreparedStatement commonStatement(String sql) {
		try {
			return con.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return null;

	} 

}
