package serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Department;
import model.Work;
import service.WorkInterface;
import util.SchoolConnection;

public class WorkServiceImpl implements WorkInterface {

	Connection con = SchoolConnection.getConnection();

	@Override
	public List<Work> getAllWork() {
		List<Work> list = new ArrayList<>();
		try {

			PreparedStatement ps = con.prepareStatement("select * from work");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Work work = new Work();
				work.setwId(rs.getInt(1));
				work.setwName(rs.getString(2));
				work.setwLocation(rs.getString(3));
				list.add(work);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return list;
	}

	@Override
	public Work getWorkById(int id) {

		Work work = new Work();
		try {
			PreparedStatement ps = con.prepareStatement("select * from work Where wId=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				work.setwId(rs.getInt(1));
				work.setwName(rs.getString(2));
				work.setwLocation(rs.getString(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return work;
	}

	@Override
	public int createWork(Work w) {
		Work work = new Work();
		int data = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into work values (?,?,?)");
			ps.setInt(1, work.getwId());
			ps.setString(2, work.getwName());
			ps.setString(3, work.getwLocation());
			data = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return data;
	}

	@Override
	public boolean updataWork(Work w) {
		try {
			PreparedStatement ps = con.prepareStatement("update work set wName=? Where wId=?");
			ps.setString(1, w.getwName());
			ps.setInt(2, w.getwId());
			int i = ps.executeUpdate();
			if (i == 0) {
				return false;
			}
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	@Override
	public boolean deletWork(int id) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from work Where wId=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if (i == 0) {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	@Override
	public Work getWorkByIdAndName(int id, String name) {
		Work work = new Work();
		try {
			PreparedStatement ps = con.prepareStatement("insert into work values (?,?,?)");
			ps.setInt(1, work.getwId());
			ps.setString(2, work.getwName());
			ps.setString(3, work.getwLocation());
			ResultSet rs = ps.executeQuery();

		} catch (Exception e) {
			System.out.println(e);
		}

		return work;
	}

}
