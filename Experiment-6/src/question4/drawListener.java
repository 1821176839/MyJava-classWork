package question4;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class drawListener implements MouseListener, MouseMotionListener,ActionListener
{
	private int x1, y1, x2, y2;
	private Graphics g;
	public void setGraphics(Graphics graphics)
	{
		g = (Graphics2D) graphics;
	}
	public void mouseDragged(MouseEvent e)
	{
		x2 = e.getX();
		y2 = e.getY();
		g.drawLine(x1, y1, x2, y2);
		x1 = x2;
		y1 = y2;
	}
	public void mouseMoved(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e)
	{
		x1 = e.getX();
		y1 = e.getY();
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void actionPerformed(ActionEvent e){}
}
