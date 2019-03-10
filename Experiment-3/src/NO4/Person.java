package NO4;

import java.util.Scanner;

public class Person 
{
	static int count=0;
	private String name = "";
	private int sex = 0;
	private int age = 0;
	private int id = 0;
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
		this.id = (int)(1+Math.random()*(1000-100+1));
		Person.count++;
	}
	public Person(String name,int age,int sex)
	{
		this(name,age);
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.id = (int)(1+Math.random()*(10-1+1));
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
		return "[name=" + name + ",sex =" + sex + ",age = " + age +",id = " + id + ",count = " + count + "]";
	}
	
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter The Name-Sex(0/1)-Age: ");
		Person person = new Person(input.next(),input.nextInt(),input.nextInt());
		System.out.println(person.toString());
	}
}



