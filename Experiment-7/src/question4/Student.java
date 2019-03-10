package question4;

public class Student
{
	private String name ;
	private int grade;
	public Student(String name, int age)
	{
		super();
		this.name = name;
		this.grade = age;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getGrade()
	{
		return grade;
	}
	public void setGrade(int age)
	{
		this.grade = age;
	}
	
	
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
