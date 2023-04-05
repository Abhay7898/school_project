package serviceImpl;

import java.sql.SQLException;
import java.util.List;

import model.Work;
import service.WorkInterface;

public class WorkServiceImpl implements WorkInterface {

	@Override
	public List<Work> readAllWork() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Work getWorkById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createWork(Work w) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updataWork(Work w) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletWork(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Work getWorkByIdAndName(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
