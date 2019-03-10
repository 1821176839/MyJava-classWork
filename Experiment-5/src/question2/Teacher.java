package question2;
import java.util.Date;

public class Teacher extends Staff
{
	protected String department;
	protected String speciality;
	protected int postAllowance;
	
	public Teacher(String name, String address, int age, int sex,int salary, Date dateHired, 
			String department, String speciality, int postAllowance) {
		super(name, address, age, sex, salary,dateHired);
		this.department = department;
		this.speciality = speciality;
		this.postAllowance = postAllowance;
		this.salary += this.postAllowance;
	}
	public String toString()
	{
		return ("[Teacher : " + name + "---" + this.salary +"/month]\n");
	}
	public String toString2()
	{
		return ("[Teacher : " + name + "\n Address : " + address + "\n Age : " + age + "\n "
				+ "Sex : " + sex + "\n DateHired : " + dateHired.getYear() + "/"
				+ "" + dateHired.getMonth() + "/" + dateHired.getDate() +"\n "
				+ "Salary : " + salary +  "\n Department : " + department + "\n "
				+ "Speciality : " + speciality + "\n Postallowance : " + postAllowance + "]");
	}
	public String toString3()
	{
		return ("[Teacher : " + name + "---" + this.age +"]");
	}
	public String toString4()
	{
		return ("[Teacher : " + name + "---" + dateHired.getYear() + "/" + dateHired.getMonth() + "/" + dateHired.getDate() +"]");
	}
}
