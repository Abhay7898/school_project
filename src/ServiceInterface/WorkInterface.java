package ServiceInterface;

import java.sql.SQLException;
import java.util.List;

import model.Work;

public interface WorkInterface {
	
	public List<Work> readAllWork() throws SQLException;

	public Work readWorkBYID(int id);

	public int createWork(Work w);

	public boolean updataWork(Work w);

	public boolean deletWork(int id);

	public Work readWorkByIdAndName(int id, String name);

}
