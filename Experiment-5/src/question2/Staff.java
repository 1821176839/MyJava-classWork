package question2;

import java.util.Comparator;
import java.util.Date;

public class Staff
{
	java.util.Date dateHired = new java.util.Date();
	protected String name;
	protected String address;
	protected int age;
	protected int sex;
	protected int salary;

	public Staff( String name, String address, int age, int sex, int salary, Date dateHired)
	{
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	public String toString2()
	{
		return null;
	}
	public String toString3()
	{
		return null;
	}
	public String toString4()
	{
		return null;
	}
}
class NameComparator implements Comparator<Staff>
{
	
	public int compare(Staff getIn1, Staff getIn2)
	{
		if( getIn1.name.compareTo(getIn2.name) > 0)
		{
			return 1;
		}else if (getIn1.name.compareTo(getIn2.name) == 0)
		{
			return 0;
		}else
		{
			return -1;
		}
	}
	
}
class AgeComparator implements Comparator<Staff>
{

	public int compare(Staff getIn1, Staff getIn2)
	{
		if( getIn1.age > getIn2.age )
		{
			return 1;
		}else if (getIn1.age == getIn2.age)
		{
			return 0;
		}else
		{
			return -1;
		}
	}
	
}
class ComplexComparator implements Comparator<Staff>
{
	public int compare(Staff getIn1, Staff getIn2)
	{
		if( getIn1.age > getIn2.age )
		{
			
			return 1;
		}else if (getIn1.age == getIn2.age)
		{
			return compareSalary(getIn1,getIn2);
		}else
		{
			return -1;
		}
	}
	
	public int compareSalary(Staff getIn1, Staff getIn2)
	{
		if( getIn1.salary > getIn2.salary )
		{
			return 1;
		}else if (getIn1.salary == getIn2.salary)
		{
			return 0;
		}else
		{
			return -1;
		}
	}
}
class SalaryComparator implements Comparator<Staff>
{
	public int compare(Staff getIn1, Staff getIn2)
	{
		if( getIn1.salary < getIn2.salary )
		{
			return 1;
		}else if (getIn1.salary == getIn2.salary)
		{
			return 0;
		}else
		{
			return -1;
		}
	}
}
class DateHiredComparator implements Comparator<Staff>
{
		public int compare(Staff getIn1, Staff getIn2)
		{
			if( getIn1.dateHired.getTime() < getIn2.dateHired.getTime() )
			{
				return 1;
			}else if ( getIn1.dateHired.getTime() == getIn2.dateHired.getTime() )
			{
				return 0;
			}else
			{
				return -1;
			}
		}
}
