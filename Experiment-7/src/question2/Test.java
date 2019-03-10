package question2;

import java.util.ArrayList;
import java.util.List;

public class Test 
{
	public static void printName(List<String> nameList)
	{
		System.out.printf("-----------\n");
		for( int i = 0 ; i < nameList.size() ; i++ )
		{
			System.out.printf("%s\n", nameList.get(i) );
		}
		System.out.printf("-----------\n");
	}
	public static void main(String[] args)
	{
		String[] names = {"Tom","Bell","Smith","GuoJie","Wonder","ShengHao"};
		NameDaoImpl nameDaoImpl = new NameDaoImpl();
		List<String> nameList = new ArrayList<String>();
		nameList = nameDaoImpl.getNameFromArray(names);
		printName(nameList);
		
		int search = nameDaoImpl.searchName(nameList,"Bell");
		if( search != -1) System.out.printf("The Number %d is what you want to search\n",search);
		else              System.out.printf("No Found\n");
		
		search = nameDaoImpl.searchName(nameList,"wwww");
		if( search != -1) System.out.printf("The Number %d is what you want to search\n",search);
		else              System.out.printf("No Found\n");
		
		boolean remove = nameDaoImpl.removeFromList(nameList, 3);
		if(remove == true)
		{
			System.out.printf("Remove succeed\n");
		}
		printName(nameList);
		remove = nameDaoImpl.removeFromList(nameList, 99);
	}
}
