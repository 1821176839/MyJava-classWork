package question3;

public class CheckingAccount extends Account
{
	private double overdraft;

	public CheckingAccount(String name, double blance, double yearRate, String openDate,double overdraft) 
	{
		super(name, blance, yearRate, openDate);
		this.overdraft = overdraft;
	}
	protected double Deposit(double deposit)
	{
		this.blance += deposit;
		return this.blance;
	}
	protected double Withdraw(double withdraw)
	{
		if(withdraw - this.blance > this.overdraft)
		{
			return 0;
		}else 
		{
			this.blance -= withdraw;
			return this.blance;
		}
	}
	public String toString()
	{
		return "[Name : " + name + "\n Blance : " + blance + "\n yearRate : " + yearRate + "\n openDate : " + openDate + ""
				+ "\n overdraft : " + overdraft +"]\n";
	}
}
