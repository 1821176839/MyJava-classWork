package question4;

public class CurrencyUnit
{
	public enum currencyUnit
	{
		dollor("美元"),pound("英镑"),euro("欧元"),rmb("人民币"),yen("日元");
		
		private final String name;

		private currencyUnit(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
	}
}
