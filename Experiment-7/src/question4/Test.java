package question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test
{
	public static void main(String []args)
	{
		List<Student> stuList = new ArrayList<Student>();
		stuList = Util.getRandomStudents(100);
		System.out.printf("\n--- ����stuList�ɹ�---\n");
	}
}
