package util;

import java.util.List;

public class CommonUtil {
	
	
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
	

}
