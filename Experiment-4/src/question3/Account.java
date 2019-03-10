package question3;

public class Account 
{
	protected String name;
	protected double blance;
	protected double yearRate;
	protected String openDate;
	
	public Account(String name, double blance, double yearRate, String openDate)
	{
		super();
		this.name = name;
		this.blance = blance;
		this.yearRate = yearRate;
		this.openDate = openDate;
	}

	protected double Deposit(double deposit)
	{
		return 0;
	}
	protected double Withdraw(double withdraw)
	{
		return 0;
	}
	protected String tostring()
	{
		return null;
	}
}
