package question4;

public class Country 
{
	public enum country 
	{
		America("��������ڹ�"),UnitedKingdom("���е߼�����������������"),
		China("�л����񹲺͹� "),France("���������͹�");
		
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
