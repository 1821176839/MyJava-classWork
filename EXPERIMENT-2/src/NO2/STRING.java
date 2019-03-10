package NO2;

public class STRING {
	public static void main(String []args)
	{
		String id = "350102199902131018";
		String result = getBirthDate(id);
		
		System.out.println(result);
	}
	public static String getBirthDate(String id) 
	{
		id = id.substring(6,14);
		String year  = id.substring(0,4);
		String month = id.substring(4,6);
		String day   = id.substring(6,8);
		return (year+"-"+month+"-"+day);
	}
}
