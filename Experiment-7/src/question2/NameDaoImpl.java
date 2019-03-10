package question2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NameDaoImpl implements NameDao
{
	public List<String> getNameFromArray(String[] names)
	{
		List<String> nameList = new ArrayList<String>();
		ListIterator<String> newIterator = nameList.listIterator();
		for( String string : names)
		{
			newIterator.add(string);
		}
		return nameList;
	}
	public int searchName(List nameList, String name)
	{
		for(int i = 0 ; i < nameList.size() ; i++ )
		{
			if( name.equals(nameList.get(i)))
			{
				return i;
			}
		}
		return -1;
	}
	public boolean removeFromList(List nameList, int id)
	{
		if( id > nameList.size() || id < 0)
		{
			if( id > nameList.size())
			{
				System.out.printf("Error! The input number biggiger than size\n");
			}
			if( id < 0 )
			{
				System.out.printf("Error! The input number smaller than zero\n");
			}
			throw new IllegalArgumentException();
		}
		else
		{
			nameList.remove(id);
			return true;
		}
	}
}
