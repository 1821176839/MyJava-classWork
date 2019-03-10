package question4;

import question4.Country.country;
import question4.CurrencyUnit.currencyUnit;

public class Test {
	public static void main(String[] args)
	{
		for(country real : country.values())
		{
			String string1 = real.name();
			String string2 = real.getName();
			System.out.println("ShortName : " + string1
							 + "--Full Name : " + string2);
		}
		for(currencyUnit currencyunit : currencyUnit.values())
		{
			String string3 = currencyunit.name();
			String string4 = currencyunit.getName();
			System.out.println("MoneyName : " + string3 
							 + "--Chinese Name : " + string4);
		}
	}
}
