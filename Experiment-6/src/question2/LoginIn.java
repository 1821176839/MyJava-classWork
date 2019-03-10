package question2;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginIn
{
	public static final int DEFAULT_WIDTH = 500;
	public static final int DEFAULT_HEIGHT = 400;
	private static String userName1 = "TheAshenOne";
	private static String userPassword1 = "5";
	static JFrame firstFrame = new JFrame("登录界面");
	static JFrame secondFrame = new JFrame("主页面");
	static JFrame thirdFrame = new JFrame("演示页面");
	
	public static void main(String []args)
	{

		firstFrame.setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstFrame.setLocationRelativeTo(null);
		
		JPanel firstPanel = new JPanel();
		firstFrame.add(firstPanel);
		addFirstComponents(firstPanel);
		firstFrame.setVisible(true);
	}

	private static void addFirstComponents(JPanel firstPanel) 
	{
		// TODO Auto-generated method stub
		firstPanel.setLayout(null);
		
		JLabel userName = new JLabel("Account Name:");
		userName.setBounds(40, 40, 120, 30);
		firstPanel.add(userName);
		
		JTextField userText = new JTextField();
		userText.setBounds(160, 40, 140, 30);
		firstPanel.add(userText);
		
		JLabel userPassword = new JLabel("Account Password:");
		userPassword.setBounds(40,80,120,30);
		firstPanel.add(userPassword);
		
		JPasswordField userPasswordText = new JPasswordField();
		userPasswordText.setBounds(160, 80, 140, 30);
		firstPanel.add(userPasswordText);
		
		JButton login = new JButton("Login");
		login.setBounds(160, 120, 90, 30);
		firstPanel.add(login);
		login.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(userName1.equals(userText.getText()) &&
				   userPassword1.equals(userPasswordText.getText()))
				{				/*此段内容意为判断输入是否正确，正确则进入演示界面	*/
					firstFrame.dispose();
					secondFrame.setVisible(true);
					secondFrame.setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
					secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					secondFrame.setLocationRelativeTo(null);
					JPanel secondPanel = new JPanel();
					secondFrame.add(secondPanel);
					addSecondComponents(secondPanel);
				}else if(!userName1.equals(userText.getText()))/*判断错误类型，此为判断是否为用户名错误*/
				{
					JOptionPane.showMessageDialog(firstPanel, "用户名不存在",
												  "提示", JOptionPane.WARNING_MESSAGE);
				}else 			/*判断是否为密码错误*/
				{
					JOptionPane.showMessageDialog(firstPanel, "密码输入错误", 
												  "提示", JOptionPane.WARNING_MESSAGE);
				}				/*用JOptionPane来弹出错误窗口*/
			}
		});
	}
	protected static void addSecondComponents(JPanel secondPanel)
	{
		// TODO Auto-generated method stub
		secondPanel.setLayout(null);
		
		JLabel menu = new JLabel("菜单:");
		menu.setBounds(40, 40, 120, 30);
		secondPanel.add(menu);
		
		JButton demonstration  = new JButton("曲线演示");
		demonstration.setBounds(40, 80, 90, 30);
		secondPanel.add(demonstration);
		demonstration.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				DrawLineFrame drawLineFrame = new DrawLineFrame();
				drawLineFrame.setVisible(true);
				secondFrame.dispose();
			}
		});
		
		JButton openFiles = new JButton("打开文件");
		openFiles.setBounds(40, 120, 90, 30);
		secondPanel.add(openFiles);
		
		JButton exit = new JButton("离开");
		exit.setBounds(40, 160, 90, 30);
		secondPanel.add(exit);
		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				secondFrame.dispose();
			}
		});
	}
}








