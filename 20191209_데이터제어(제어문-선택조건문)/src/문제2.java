import java.util.Scanner;

/*
 * ���� �ΰ��� �����ڸ� �޾Ƽ� ��Ģ����
 * ù��° �����Է� : 10
 * �ι�° ���� �Է� : 20
 * ������ �Է� : +  =>����)String op=scan.next()
 * 				  	 char c=op.charAt(0)
 * �����
 * =>10+20=30
 * 
 */
public class ����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		int fir= scan.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		int sec= scan.nextInt();
		System.out.print("������(+,-,*,/)�Է�:");
		String op=scan.next();
		char c=op.charAt(0);
				
		if(c=='+')
		{
			System.out.println("�����");
			System.out.println("=>"+fir+"+"+sec+"="+(fir+sec));
		}
		if(c=='-')
		{
			System.out.println("�����");
			System.out.println("=>"+fir+"-"+sec+"="+(fir-sec));
		}
		if(c=='*')
		{
			System.out.println("�����");
			System.out.println("=>"+fir+"*"+sec+"="+(fir*sec));
		}
		if(c=='/')
		{
			if(sec==0)
				System.out.println("0���� ���� �� �����ϴ�");
			else
			{
				System.out.println("�����");
				System.out.println("=>"+fir+"/"+sec+"="+((double)fir/sec));
			}
			
		}

	}

}
