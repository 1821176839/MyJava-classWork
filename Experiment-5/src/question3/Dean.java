package question3;

import java.util.Date;

public class Dean extends Teacher
{
	java.util.Date date = new java.util.Date();
	protected int adminAward;

	public Dean(String name, String address, int age, int sex,  int salary, Date dateHired,
			String department, String speciality, int postAllowance, int adminAward) {
		super(name, address, age, sex,  salary, dateHired,department, speciality, postAllowance);
		this.adminAward = adminAward;
		this.salary += this.postAllowance + this.adminAward;
	}
	public String toString()
	{
		return ("[Dean : " + name + "---" + this.salary +"/month]\n");
	}
	public String toString2()
	{
		return ("[Dean : " + name + "\n Address : " + address + "\n Age : " + age + "\n "
				+ "Sex : " + sex + "\n Salary : " + salary +  "\n DateHired : " + dateHired.getYear() + "/"
				+ "" + dateHired.getMonth() + "/" + dateHired.getDate() + "\n Department : " + department + "\n "
				+ "Speciality : " + speciality + "\n Postallowance : " + postAllowance + "\n "
				+ "AdminAward : " + adminAward + "]");
	}
	public String toString3()
	{
		return ("[Dean : " + name + "---" + this.age +"]");
	}
	public String toString4()
	{
		return ("[Dean : " + name + "---" + dateHired.getYear() + "/" + dateHired.getMonth() + "/" + dateHired.getDate() +"]");
	}
}
