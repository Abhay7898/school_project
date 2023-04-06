package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Department;
import model.Staff;

public class CommonUtil {
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
		}
	}

	public static boolean isSuccess(int i) {
		if (i > 0) {
			return true;
		}
		return false;
	}

	public static PreparedStatement getPrS(String sql) {
		try {
			return con.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return null;

	}

}
