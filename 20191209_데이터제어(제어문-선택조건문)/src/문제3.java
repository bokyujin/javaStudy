import java.util.Scanner;

/*
 * 1. if~else
 * 	   ������ �Ѱ� �Է¹޾Ƽ� ¦��/Ȧ��
 * 2. ���ĺ��� �Է��ؼ� �빮��/�ҹ���(if~else)
 * 3. ���� ������ �Է¹޾Ƽ� ��� => 90���̻�='A' ,80���̻�='B',70���̻�='C',60���̻�=>'D',������F
 */
public class ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�����Է�:");
		int num=scan.nextInt();
		if(num%2==0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		
		
		char c='a';
		if (c>='a'&&c<='z')
			System.out.println("�ҹ���");
		else
			System.out.println("�빮��");
		
		
		System.out.println("3���� �����Է�:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();	
		int avg=(num1+num2+num3)/3;
		int res=avg/10;
		
		if(res==10||res==9)
			System.out.println("A");
		if(res==8)
			System.out.println("B");
		if(res==7)
			System.out.println("C");
		if(res==6)
			System.out.println("D");
		if(res<6)
			System.out.println("D");

	}

}
