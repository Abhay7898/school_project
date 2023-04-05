package service;

import java.sql.SQLException;
import java.util.List;

import model.Work;

public interface WorkInterface {
	
	public List<Work> getAllWork() throws SQLException;

	public Work getWorkById(int id);

	public int createWork(Work w);

	public boolean updataWork(Work w);

	public boolean deletWork(int id);

	public Work getWorkByIdAndName(int id, String name);

}
