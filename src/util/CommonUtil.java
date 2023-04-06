package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Department;
import model.Staff;
import model.Student;

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
		} else if (o instanceof Staff) {
			Staff s = (Staff) o;
			System.out.println();
		}else if(o instanceof Student) {
			Student stu=(Student) o;
			System.out.println("Student [sId=" + stu.getsId() + ", sName=" + stu.getsName() + ", sFatherName=" + stu.getsFatherName()+ ", sMotherName="
					+ stu.getsMobile() + ", sLastName=" + stu.getsLastName() + ", sAge=" + stu.getsAge() + ", sGender=" + stu.getsGender() + ", sAddress="
					+ stu.getsAddress() + ", sMobile=" + stu.getsMobile() + ", sEmailId=" + stu.getsEmailId() + ", tId=" + stu.gettId()+ "]");
			
		}
	}

	public static boolean conditionCheaq(int i) {
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
