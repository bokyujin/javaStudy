import java.util.Scanner;

import javax.swing.JOptionPane;

//	������=> ���Է¹޾Ƽ� ���
/*
 * 	���α׷�
 * 	=====
 * 		���������+java���̺귯��+�ܺ� ���¼ҽ�(mvnrepository.com)
 * 		===============================================
 * 						 	��	��
 * 
 */
public class �ݺ���8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�� �Է�:");
		int dan=scan.nextInt();
		int i=1;		//��������
//		String s=JOptionPane.showInputDialog("�����Է�");
		
		while(i<=9)
		{
			System.out.printf("%2d * %2d= %2d\n",dan,i,dan*i);
			
			i++;
			
		}

	}

}
