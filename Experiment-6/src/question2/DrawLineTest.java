package question2;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;


class DrawLineFrame extends JFrame {

	public DrawLineFrame() {
		// get screen dimensions
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		// set frame width, height and let platform pick screen location
		setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);
		
		//初始化构成直线的点集
		List<Point2D> points = new ArrayList<Point2D>();
		
		points.add(new Point2D.Double(0,0));
		points.add(new Point2D.Double(50,50));
		points.add(new Point2D.Double(100,0));
		points.add(new Point2D.Double(150,50));
		
		add(new DrawLineComponent(points));

	}
}

class DrawLineComponent extends JComponent {
	private List<Line2D> lines = null;

	public DrawLineComponent(List<Point2D> points) {
		lines = makeLineFromPoints(points);
	}

	@Override
	protected void paintComponent(Graphics g) 
	{
		// TODO Auto-generated method stub
		Graphics2D g2 = (Graphics2D) g;
		GeneralPath gp = new GeneralPath();
		gp.moveTo(0,0);
		drawSinX(gp, g2);  
	}
 
	private void drawSinX(GeneralPath gp, Graphics2D g2) 
	{
		// TODO Auto-generated method stub
		for(double i = 0.001 ; i < 100*Math.PI ; i += 0.001*Math.PI)
		{
			gp.lineTo(20*i,100*Math.sin(i)+Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2);
		}
		g2.draw(gp);
	}

	private List<Line2D> makeLineFromPoints(List<Point2D> points){
		if (points.size()<2) {
			throw new IllegalArgumentException("点的数小于2，size="+points.size());
		}
		List<Line2D> lines = new ArrayList<Line2D>();
		Line2D tempLine = null;
		for (int i = 0; i < points.size()-1; i++) {
			Point2D p1 = points.get(i);
			Point2D p2 = points.get(i+1);
			tempLine = new Line2D.Double(p1, p2);
			lines.add(tempLine);
		}
		return lines;
		
	}
	
	
}