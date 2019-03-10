package question4;

public class Country 
{
	public enum country 
	{
		America("美利坚合众国"),UnitedKingdom("大不列颠及北爱尔兰联合王国"),
		China("中华人民共和国 "),France("法兰西共和国");
		
		private String name;

		private country(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
	}
}
