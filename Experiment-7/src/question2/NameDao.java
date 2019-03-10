package question2;

import java.util.List;

public interface NameDao
{
	public List getNameFromArray(String[] names);
	public int searchName(List nameList, String name);
	public boolean removeFromList(List nameList, int id);
}
