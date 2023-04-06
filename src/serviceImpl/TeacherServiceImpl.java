package serviceImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;
import service.TeacherInterface;
import util.SchoolConnection;

public class TeacherServiceImpl implements TeacherInterface {
	Connection con =SchoolConnection.getConnection();
	@Override
	public List<Teacher> getAllTeacher() throws SQLException {
		List<Teacher> list = new ArrayList<>();
		PreparedStatement ps =con.prepareStatement("select*from teacher");
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			Teacher teacher = new Teacher();
			teacher.settId(rs.getInt(1));
			teacher.settName(rs.getString(2));
			teacher.settLastName(rs.getString(3));
			teacher.settAge(rs.getInt(4));
			teacher.settGender(rs.getString(5));
			teacher.settAddress(rs.getString(6));
			teacher.settMobile(rs.getInt(7));
			teacher.settEmailId(rs.getString(8));
			teacher.settDoj(rs.getDate(9));
			list.add(teacher);
		}
		return list;
	}

	@Override
	public Teacher getTeacherById(int id) {
		Teacher teacher=new Teacher();
		try {
			PreparedStatement ps=con.prepareStatement("select*from teacher where tid=?");
			ps.setInt(1, id);
			ResultSet rs =ps.executeQuery();
			while(rs.next()) {
				teacher.settId(rs.getInt(1));
				teacher.settName(rs.getString(2));
				teacher.settLastName(rs.getString(3));
				teacher.settAge(rs.getInt(4));
				teacher.settGender(rs.getString(5));
				teacher.settAddress(rs.getString(6));
				teacher.settMobile(rs.getInt(7));
				teacher.settEmailId(rs.getString(8));
				teacher.settDoj(rs.getDate(9));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return teacher;
	}

	@Override
	public int createTeacher(Teacher teacher) {
		int result=0;
		try {
		PreparedStatement ps =con.prepareStatement("insert into teacher values(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1,teacher.gettId());
		ps.setString(2, teacher.gettName());
		ps.setString(3,teacher.gettLastName());
		ps.setInt(4, teacher.gettAge());
		ps.setString(5, teacher.gettGender());
		ps.setString(6, teacher.gettAddress());
		ps.setInt(7, teacher.gettMobile());
		ps.setString(8, teacher.gettEmailId());
		ps.setDate(9 , teacher.gettDoj());
		ps.setInt(10, 0);
		ps.setString(11, teacher.gettSubject());
		result=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	@Override
	public boolean updataTeacher(Teacher teac) {
		boolean result =false;
		try {
		PreparedStatement ps =con.prepareStatement("update student set tname=?,tlastname=?,tage=?,tgender=?,taddress=?,tmono=?,temailid=?,tdoj=? where tid=?");
		Teacher teacher = new Teacher();
		ps.setString(1, teacher.gettName());
		ps.setString(2,teacher.gettLastName());
		ps.setInt(3, teacher.gettAge());
		ps.setString(4, teacher.gettGender());
		ps.setString(5, teacher.gettAddress());
		ps.setInt(6, teacher.gettMobile());
		ps.setString(7, teacher.gettEmailId());
		ps.setDate(8, teacher.gettDoj());
		ps.setInt(9,teacher.gettId());
		int i=ps.executeUpdate();
		if(i>0) {
			return true;
		}
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public boolean deletTeacherById(int id) {
		boolean result = false;
		try {
			PreparedStatement ps =con.prepareStatement("delete from teacher where tid =?");
			Teacher teacher = new Teacher();
			ps.setInt(1, id);
			int i=ps.executeUpdate();
			if (i>0) {
				return true;
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public Teacher getTeacherByIdAndName(int id, String name) {
		Teacher teacher = new Teacher();
		try {
			PreparedStatement ps =con.prepareStatement("select*from teacher where tid=? and tname=?");
			ps.setInt(1, id);
			ps.setString(2, name);
			ResultSet rs =ps.executeQuery();
			while (rs.next()) {
				teacher.settId(rs.getInt(1));
				teacher.settName(rs.getString(2));
				teacher.settLastName(rs.getString(3));
				teacher.settAge(rs.getInt(4));
				teacher.settGender(rs.getString(5));
				teacher.settAddress(rs.getString(6));
				teacher.settMobile(rs.getInt(7));
				teacher.settEmailId(rs.getString(8));
				teacher.settDoj(rs.getDate(9));
				teacher.settSubject(rs.getString(10));
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		return teacher;
	}

	@Override
	public Teacher getTeacherByStudentId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher getTeacherBySubject(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
