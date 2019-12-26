import java.awt.Graphics;
import javax.swing.*;


import java.awt.*;	///window와 관련된 클래스
	  //class영역에서는 선언만 가능 ,구현은 {},메소드 안에서 가능
public class Login extends JPanel{
	Image back;
	JLabel la1,la2;		//입력창 옆 Text(ID)
	JTextField tf;		//입력창 출력
	JPasswordField pf;	//비밀번호 입력시 *로 출력
	JButton b1,b2;
	Login(){
		setLayout(null);	//원하는 위치에 설정
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\loginBack.jpg");
//		la1=new JLabel("ID",JLabel.RIGHT);
//		la1.setForeground(Color.white);		//글씨체변경(색-흰색)
//		la2=new JLabel("Password",JLabel.RIGHT);
//		la2.setForeground(Color.white);
		
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("LOGIN");
		b2=new JButton("MAIN");
		
		
		//배치 
//						위치		크기
//					   x   y   x  y
//		la1.setBounds(390,330,80,30);
		tf.setBounds(370,358,280,30);
			
//		la2.setBounds(390,365,80,30);
		pf.setBounds(370,450,280,30);		//setBounds
		
//		JPanel p=new JPanel();
//		p.add(b1);
//		p.add(b2);
//		p.setBounds(380,520,200,35);
//		p.setOpaque(false);				//false==투명,true==불투명
		
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

	@Override		//스킨 paintComponent/게임=paint
	protected void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);  	//getWidth(), getHeight()=>window실제크기/this=>panel자신
		
	}	
	
}
