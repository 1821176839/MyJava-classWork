package question3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class DraggableJFrame extends JFrame {
	public DraggableJFrame() {
		setTitle("—› æΩÁ√Ê");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(new DraggableLineTest());
		setVisible(true);
	}
}
