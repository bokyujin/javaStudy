/*
 * 
 */
import java.util.Scanner;

public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=10==11;
		System.out.println(b1);
		
		b1=10>11;
		System.out.println(b1);
		
		b1=65=='A';
		System.out.println(b1);  //char => ��� ���꿡�� ������ ����
		
//		char=>��ȣ =>ASCII�ڵ�
		System.out.println((int)'A');
		System.out.println((int)'0'); //=>'������ ���ڷ� �ν��Ͽ� ����0�̶� 48�� ����
		System.out.println('a');
		
//		�ΰ��� ������ �޾Ƽ� ū ���� ���
		Scanner scan=new Scanner(System.in);
		// new => �޸𸮿� ����, ������ => �ʱⰪ �ο�
		/*
		 *  scan.nextInt() 		=>int
		 *  scan.nextDouble()	=>double
		 *  scan.next()			=>String
		 *  scan.nextboolean()  =>boolean
		 *  ==> char(X)
		 */
		int num1, num2;
		System.out.print("ù��° ���� �Է�");
		num1=scan.nextInt();
		
		System.out.println("�ι�° ���� �Է�");
		num2=scan.nextInt();
		
		int result=num1<num2?num2:num1;
		
		System.out.println("ū����"+result+"�Դϴ�");
		

	}

}
