package question2;

import java.util.*;
import java.text.SimpleDateFormat;

public class Text
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
	
	public void printWage()
	{
		for(Staff staff : listStaff)
		{
			System.out.printf("%s",staff.toString());
		}
	}
	public void printAll()
	{
		for(Staff staff : listStaff)
		{
			System.out.printf("%s\n",staff.toString2());
		}
	}
	public static void main(String []args)
	{
		Text text = new Text();
		text.setdateHired();
		
		text.add(new Teacher("SimonOne","0100-1000",42,1,6000,text.dateHiredone,"Math","Math",700));
		text.add(new Teacher("SimonTwo","0110-1100",26,4500,100, text.dateHiredtwo,"Math","Math",500));
		text.add(new SecurityGuard("SimonThree","0110-1100",29,1,3000,text.dateHiredthree,"BOOM",600));
		text.add(new Dean("SimonFour","0100-1000",58,1,6000,text.dateHiredfour,"Math","Math",1000,3000));
		text.printWage();
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
