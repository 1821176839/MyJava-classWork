package question3;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class DraggableLineTest extends JComponent
{
	boolean pressed = false;
	private List<Line2D> lines = null;
	Point2D firstPoint2d = null, newPoint = null;
	double firstX = 0, firstY = 0, lastX1 = -360, lastX2 = 360, upY = 0, downY = 0;
	List<Point2D> points = null;

	@Override
	public void paintComponent(Graphics g)
	{

		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		for (Line2D e : lines)
		{
			g2.draw(e);
		}
	}

	private List<Line2D> makeLineFromPoints(List<Point2D> points)
	{
		if (points.size() < 2) {
			throw new IllegalArgumentException("点的数小于2，size=" + points.size());
		}
		Line2D tempLine = null;
		for (int i = 0; i < points.size() - 1; i++) {
			Point2D p1 = points.get(i);
			Point2D p2 = points.get(i + 1);
			tempLine = new Line2D.Double(p1, p2);
			lines.add(tempLine);
		}
		return null;
	}

	public DraggableLineTest()
	{
		points = new ArrayList<Point2D>();
		lines = new ArrayList<Line2D>();
		MouseHandler mouseHandler = new MouseHandler();
		for (double x = 0; x <= 360; x += 1)
		{
			double y =  Math.sin((Math.PI*x/40))*20+220;
			points.add(new Point2D.Double(x, y));
		}
		makeLineFromPoints(points);
		addMouseMotionListener(mouseHandler);
		addMouseListener(mouseHandler);
	}

	public Point2D find(Point2D p)
	{
		for (Point2D r : points)
		{
			if ((Math.abs(r.getX() - p.getX()) < 3) && (Math.abs(r.getY() - p.getY())) < 3)
				return r;
		}
		return null;
	}
	class MouseHandler implements MouseMotionListener, MouseListener
	{
		public void mouseDragged(MouseEvent event)
		{
			// TODO Auto-generated method stub
			Point newPoint = event.getPoint();
			for (int i = 0; i <= 360; i++) 
			{
				points.get(i).setLocation(newPoint.getX() - firstPoint2d.getX() + points.get(i).getX(), 
										  newPoint.getY() - firstPoint2d.getY() + points.get(i).getY());
			}
			firstX = points.get(0).getX();	firstY = points.get(0).getY();
			firstPoint2d = newPoint;
			repaint();
			lines.clear();
			makeLineFromPoints(points);
		}
		public void mouseMoved(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e)
		{
			newPoint = find(e.getPoint());
			firstPoint2d = e.getPoint();
			if (newPoint == null)	setCursor(Cursor.getDefaultCursor());
			else	setCursor(new Cursor(Cursor.HAND_CURSOR));
		}

		@Override
		public void mouseReleased(MouseEvent e)
		{
			// TODO Auto-generated method stub
			pressed = false;
		}

	}
	
}
