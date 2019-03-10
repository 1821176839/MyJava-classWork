package question3;

import java.util.ArrayList;

public class Test
{
	
	private ArrayList<Account> listAccount = new ArrayList<Account>();
	
	public void add(Account account)
	{
		listAccount.add(account);
	}
	public void printAll()
	{
		for(Account account : listAccount)
		{
			System.out.printf("%s",account.toString());
		}
	}
	public static void main(String []args)
	{
		Test test = new Test();
		test.add(new CheckingAccount("Tom",5600,0.025,"1999-9-25",2000));
		test.add(new SavingAccount("Jerry",10000,0.05,"1986-5-16"));
		test.printAll();
		if(test.listAccount.get(0).Withdraw(3000) == 0) {			//step1
			System.out.printf("Opertion ERROR!!!\nThe withdraw more than the account have\n\n");
		}else
		{
			System.out.printf("Opertion Succeed\n");
			System.out.printf("Now the account have $%.2f$\n\n",test.listAccount.get(0).Withdraw(3000));
		}
		
		if(test.listAccount.get(0).Withdraw(3000) == 0) {			//step2
			System.out.printf("Opertion ERROR!!!\nThe withdraw more than the account have\n\n");
		}else
		{
			System.out.printf("Opertion Succeed\n");
			System.out.printf("Now the account have $%.2f$\n\n",test.listAccount.get(0).Withdraw(3000));
		}
		
		if(test.listAccount.get(0).Withdraw(3000) == 0) {			//step2
			System.out.printf("Opertion ERROR!!!\nThe withdraw more than the account have\n\n");
		}else
		{
			System.out.printf("Opertion Succeed\n");
			System.out.printf("Now the account have $%.2f$\n\n",test.listAccount.get(0).Withdraw(3000));
		}
		
		System.out.printf("Deposit Succeed\nNow you have %.2f in the account\n",test.listAccount.get(0).Deposit(20000));
		
		if(test.listAccount.get(0).Withdraw(60000) == 0) {			//step4
			System.out.printf("Opertion ERROR!!!\nThe withdraw more than the account have\n\n");
		}else
		{
			System.out.printf("Opertion Succeed\n");
			System.out.printf("Now the account have $%.2f$\n\n",test.listAccount.get(0).Withdraw(3000));
		}
		
		if(test.listAccount.get(1).Withdraw(3000) == 0) {			//step5
			System.out.printf("Opertion ERROR!!!\nThe withdraw more than the account have\n\n");
		}else
		{
			System.out.printf("Opertion Succeed\n");
			System.out.printf("Now the account have $%.2f$\n\n",test.listAccount.get(0).Withdraw(3000));
		}
		
		System.out.printf("Deposit Succeed\nNow you have %.2f in the account\n",test.listAccount.get(1).Deposit(20000));
		
		if(test.listAccount.get(0).Withdraw(3000) == 0) {			//step6
			System.out.printf("Opertion ERROR!!!\nThe withdraw more than the account have\n\n");
		}else
		{
			System.out.printf("Opertion Succeed\n");
			System.out.printf("Now the account have $%.2f$\n\n",test.listAccount.get(0).Withdraw(3000));
		}
	}
}
