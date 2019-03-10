package question4;

import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Brush extends JFrame
{
	public static void main(String []args)
	{
		Brush brush = new Brush();
		brush.initialGraphics();
	}

	private void initialGraphics()
	{
		// TODO Auto-generated method stub
		setTitle("»­±Ê");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Graphics graphics = getGraphics();
		drawListener first = new drawListener();
		addMouseListener(first);
		addMouseMotionListener(first);
		first.setGraphics(graphics);
		
	}
}
