package question3;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class DraggableTest {

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				DraggableJFrame firstFrame = new DraggableJFrame();
			}
		});
	}

}
