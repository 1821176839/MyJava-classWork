package question2;
import java.util.Date;

public class SecurityGuard extends Staff
{
	java.util.Date date = new java.util.Date();
	protected String skills;
	protected int dangerousAllowance;

	public SecurityGuard(String name, String address, int age, int sex, int salary, Date dateHired,
			String skills, int dangerousAllowance) {
		super(name, address, age, sex, salary,dateHired);
		this.date = date;
		this.skills = skills;
		this.dangerousAllowance = dangerousAllowance;
	}
	public String toString()
	{
		return ("[SecurityGuard : " + name + "---" + (salary+dangerousAllowance) +"/month]\n");
	}
	public String toString2()
	{
		return ("[SecurityGuard : " + name + "\n Address : " + address + "\n Age : " + age + "\n "
				+ "Sex : " + sex + "\n Salary : " + salary + "\n DateHired : " + dateHired.getYear() + "/" + dateHired.getMonth() + "/" + dateHired.getDate() + "\n Skills : " + skills + "\n "
				+ "DangerousAllowance : " + dangerousAllowance +"]");
	}
}
