package question3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test
{
	public static void main(String []args)
	{
		List<String> nameList = new ArrayList<String>();
		nameList = Util.generateNameList(10000000);
		System.out.printf("\n--- ����nameList�ɹ�---\n");
		
		List<Student> stuList = new ArrayList<Student>();
		stuList = Util.getRandomStudents(10000000);
		System.out.printf("\n--- ����stuList�ɹ�---\n");
		
		Map stuMap = new HashMap();
		stuMap = Util.makeStudentMap(stuList);
		System.out.printf("\n--- ����stuMap�ɹ�---\n\n");
		
		long startTime1 = System.nanoTime();
		Util.searchName(nameList, "Huang");
		long endTime1 = System.nanoTime();
		System.out.println("searchName����ʱ�䣺 "+(endTime1-startTime1)+"ms");
		
		double startTime2 = System.nanoTime();
		Util.searchStudent(stuMap, "Huang");
		double endTime2=System.nanoTime();
		System.out.println("searchStudent����ʱ�䣺 "+(endTime2-startTime2)+"ms");
		
		Test test = new Test();
		test.printTen(stuMap);
	}

	private void printTen(Map stuMap)
	{
		// TODO Auto-generated method stub
		Iterator<Map.Entry> iterator = stuMap.entrySet().iterator();
		for( int i = 0 ; i < 10 ; i++)
		{
			Map.Entry entry = iterator.next();
			System.out.println("key = "+ entry.getKey() + 
					"\nvalue = "+ entry.getValue() + 
					"\nentry = "+ entry+"\n");
		}
	}
}
