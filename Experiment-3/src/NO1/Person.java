package NO1;

import java.util.Scanner;

public class Person 
{
	private String name = "";
	private int sex = 0;
	private int age = 0;
	
	Person(String name,int sex,int age)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public String getName() 
	{
		return name;
	}
	public int getSex() 
	{
		return sex;
	}
	public int getAge() 
	{
		return age;
	}

	public String toString()
	{
		return "[name=" + name + ",sex =" + sex + ",age = " + age +"]";
	}
	
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter The Name-Sex(0/1)-Age: ");
		Person person = new Person(input.next(),input.nextInt(),input.nextInt());
		System.out.println(person.toString());
	}
}



