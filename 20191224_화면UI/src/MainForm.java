/*
 * JFrame
 * JPanel
 * JWindow
 * JDialog
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;			// ��ưó��				 //
public class MainForm extends JFrame implements ActionListener{
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	CardLayout card=new CardLayout();
	MainForm(){
		setLayout(card);
		add("LOGIN",login);	//�α���â�� ���Ϳ�
		add("WR",wr);
//		add("LOGIN",login);	//�α���â�� ���Ϳ�
		setSize(1024,768);	//windowũ��
		setVisible(true);	//������ ���̰��ϴ� �Լ�
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
	}
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		}
		catch(Exception e) {}
		
		MainForm mf=new MainForm();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login.b1)
		{
			card.show(getContentPane(), "WR");
		}
		if(e.getSource()==login.b2)
		{
			card.show(getContentPane(), "WR");
		}
	}


}
