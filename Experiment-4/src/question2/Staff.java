package question2;
import java.util.Date;

public class Staff 
{
	java.util.Date dateHired = new java.util.Date();
	protected String name;
	protected String address;
	protected int age;
	protected int sex;
	protected int salary;

	public Staff( String name, String address, int age, int sex, int salary, Date dateHired) {
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
}
