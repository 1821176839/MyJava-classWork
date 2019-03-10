package question3;

import java.util.*;
import java.text.SimpleDateFormat;

public class Test
{
	private ArrayList<Staff> listStaff = new ArrayList<Staff>();
	
	java.util.Date dateHiredone = new java.util.Date();
	java.util.Date dateHiredtwo = new java.util.Date();
	java.util.Date dateHiredthree = new java.util.Date();
	java.util.Date dateHiredfour = new java.util.Date();
	
	public void add(Staff staff)
	{
		listStaff.add(staff);
	}
	public void printAll()
	{
		for(Staff staff : listStaff)
		{
			System.out.printf("%s\n",staff.toString2());
		}
	}
	
	public void printDateHired()
	{
		for(Staff staff : listStaff)
		{
			System.out.printf("%s\n",staff.toString4());
		}
	}
	
	private void printSalary()
	{
		Collections.sort(listStaff,(getIn1,getIn2) -> 
		{
					if(getIn1.salary > getIn2.salary)return 1;
					else if (getIn1.salary == getIn2.salary)return 0;
					else return -1;
		});
		for(Staff staff : listStaff)
		{
			System.out.printf("%s",staff.toString());
		}
	}
	public void printAge()
	{
		Collections.sort(listStaff,(getIn1,getIn2) -> 
		{
					if(getIn1.age > getIn2.age)return 1;
					else if (getIn1.age == getIn2.age)return 0;
					else return -1;
		});
		for(Staff staff : listStaff)
		{
			System.out.printf("%s\n",staff.toString3());
		}
	}
	private void ComplexComparator()
	{
		Collections.sort(listStaff,(getIn1,getIn2) -> 
		{
					if(getIn1.salary > getIn2.salary)return 1;
					else if (getIn1.salary == getIn2.salary)
					{
						if(getIn1.age > getIn2.age) return 1;
						else return -1;
					}
					else return -1;
		});
		for(Staff staff : listStaff)
		{
			System.out.printf("%s\n",staff.toString());
		}
	}
	public static void main(String []args)
	{
		Test test = new Test();
		test.setdateHired();
		
		test.add(new Teacher("SimonOne","0100-1000",42,1,6000,test.dateHiredone,"Math","Math",700));
		test.add(new Teacher("SimonTwo","0110-1100",26,4500,5000, test.dateHiredtwo,"Math","Math",500));
		test.add(new SecurityGuard("TomOne","0110-1100",29,1,3000,test.dateHiredthree,"BOOM",600));
		test.add(new Dean("SimonThree","0100-1000",58,1,6000,test.dateHiredfour,"Math","Math",1000,3000));
		
		System.out.printf("\n--------------Sort By Salary---------------\n\n");
		test.printSalary();
		
		System.out.printf("\n--------------Sort By Age---------------\n\n");
		test.printAge();
		
		System.out.printf("\n--------------Sort By DateHired---------------\n\n");
		DateHiredComparator datehired = new DateHiredComparator();
		java.util.Collections.sort(test.listStaff,datehired);
		test.printDateHired();
		
	}
	public void setdateHired() {
		dateHiredone.setYear(1972);
		dateHiredone.setMinutes(2);
		dateHiredone.setDate(14);
		
		dateHiredtwo.setYear(1992);
		dateHiredtwo.setMinutes(8);
		dateHiredtwo.setDate(5);
		
		dateHiredthree.setYear(1989);
		dateHiredthree.setMinutes(9);
		dateHiredthree.setDate(16);
		
		dateHiredfour.setYear(1960);
		dateHiredfour.setMinutes(7);
		dateHiredfour.setDate(29);
	}
}

