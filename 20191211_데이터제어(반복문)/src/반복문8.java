import java.util.Scanner;

import javax.swing.JOptionPane;

//	구구단=> 단입력받아서 출력
/*
 * 	프로그램
 * 	=====
 * 		사용자정의+java라이브러리+외부 오픈소스(mvnrepository.com)
 * 		===============================================
 * 						 	조	립
 * 
 */
public class 반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력:");
		int dan=scan.nextInt();
		int i=1;		//루프변수
//		String s=JOptionPane.showInputDialog("정수입력");
		
		while(i<=9)
		{
			System.out.printf("%2d * %2d= %2d\n",dan,i,dan*i);
			
			i++;
			
		}

	}

}
