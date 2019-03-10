package question3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Util
{
	
	/**
	 * 
	 * @param 
	 * @return 返回分布在[0,upLimit]的随机整数
	 */
	public static int getRandomNumber(int upLimit)
	{
		return new Random().nextInt(upLimit+1);
	}
	
	/**
	 * 
	 * @param min
	 * @param max
	 * @return 返回分布在[min,max]的随机整数
	 */
	public static int getRandomNumber(int min,int max)
	{
		if(min > max){
			throw new IllegalArgumentException("min ="+min+">"+ "max="+max);
		}
		return min + new Random().nextInt(max+1-min);
	}
	
	/**
	 * 
	 * @param min
	 * @param max
	 * @return 返回长度在min到max之间随机名字
	 */
	public static String getRandomName(int min, int max)
	{
		StringBuilder sb = new StringBuilder();
		
		int n = getRandomNumber(min, max);
		
		while (n>0)
		{
			sb.append((char)getRandomNumber('a','z'));
			n--;
		}
		return sb.toString();
	}
	
	
	public static List getRandomStudents(int n)
	{
		List<Student> stuList = new ArrayList<Student>();
		
		for( int i = 0 ; i < n ; i++ )
		{
			Student student = new Student(getRandomName(1,5),getRandomNumber(1,5));
			stuList.add(student);
		}
		
		return stuList;
	}
	public static Map makeStudentMap(List<Student> namelist)
	{
		Map stuMap = new HashMap();

		for(Student student : namelist)
		{
			stuMap.put(student.getName(), student);
		}
		
		return stuMap;
	}
	public static Student searchStudent(Map stuMap, String name)
	{
		return (Student)stuMap.get(name);
	}
	
	public static List generateNameList(int n)
	{
		List<String> stuList = new ArrayList<String>();
		for( int i = 0 ; i < n ; i++ )
		{
			stuList.add(getRandomName(1,5));
		}
		
		return stuList;
	}
	public static Map generateStudentMap(int n)
	{
		List<Student> stuList = getRandomStudents(n);
		Map stuMap = makeStudentMap(stuList);
		
		return stuMap;
	}
	public static int searchName(List<String> nameList,String name)
	{
		return Collections.binarySearch(nameList, name);
	}
}
