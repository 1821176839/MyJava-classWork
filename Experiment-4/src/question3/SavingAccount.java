package question3;

public class SavingAccount extends Account
{

	public SavingAccount(String name, double blance, double yearRate, String openDate) 
	{
		super(name, blance, yearRate, openDate);
	}
	protected double Deposit(double deposit)
	{
		this.blance += deposit;
		return this.blance;
	}
	protected double Withdraw(double withdraw)
	{
		if(withdraw - this.blance > 0)
		{
			return 0;
		}else {
			this.blance -= withdraw;	
			return this.blance;
		}
	}
	public String toString()
	{
		return "[Name : " + name + "\n Blance : " + blance + "\n yearRate : " + yearRate + "\n openDate : " + openDate + "]\n";
	}
}
