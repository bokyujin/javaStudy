import java.awt.Graphics;
import javax.swing.*;


import java.awt.*;	///window�� ���õ� Ŭ����
	  //class���������� ���� ���� ,������ {},�޼ҵ� �ȿ��� ����
public class Login extends JPanel{
	Image back;
	JLabel la1,la2;		//�Է�â �� Text(ID)
	JTextField tf;		//�Է�â ���
	JPasswordField pf;	//��й�ȣ �Է½� *�� ���
	JButton b1,b2;
	Login(){
		setLayout(null);	//���ϴ� ��ġ�� ����
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\loginBack.jpg");
//		la1=new JLabel("ID",JLabel.RIGHT);
//		la1.setForeground(Color.white);		//�۾�ü����(��-���)
//		la2=new JLabel("Password",JLabel.RIGHT);
//		la2.setForeground(Color.white);
		
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("LOGIN");
		b2=new JButton("MAIN");
		
		
		//��ġ 
//						��ġ		ũ��
//					   x   y   x  y
//		la1.setBounds(390,330,80,30);
		tf.setBounds(370,358,280,30);
			
//		la2.setBounds(390,365,80,30);
		pf.setBounds(370,450,280,30);		//setBounds
		
//		JPanel p=new JPanel();
//		p.add(b1);
//		p.add(b2);
//		p.setBounds(380,520,200,35);
//		p.setOpaque(false);				//false==����,true==������
		
		b1.setBounds(390,520,100,30);
		b2.setBounds(525,520,100,30);
		b1.setBackground(new Color(227,243,27));
		b2.setBackground(new Color(227,243,27));
//		add(la1);
		add(tf);
//		add(la2);
		add(pf);
//		add(p);
		add(b1);
		add(b2);
		
		
	}

	@Override		//��Ų paintComponent/����=paint
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);  	//getWidth(), getHeight()=>window����ũ��/this=>panel�ڽ�
		
	}	
	
}
