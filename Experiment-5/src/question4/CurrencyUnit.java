package question4;

public class CurrencyUnit
{
	public enum currencyUnit
	{
		dollor("��Ԫ"),pound("Ӣ��"),euro("ŷԪ"),rmb("�����"),yen("��Ԫ");
		
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
