/*
 * 	�޼ҵ�
 * 	====
 * 	  �ڹ�(��ü����=>Ŭ����) :Ŭ���� �������(����,�޼ҵ�)
 * 									 =====
 * 									  ������+���
 *  ����)
 *  	������(ó�������) �޼ҵ��(�Ű�����)	=>�����
 *  	{===========  ====
 *  		�⺻��	    ��ӻ���: ��� �޼ҵ�� �ҹ��ڷ� �Ѵ�.(��Ÿ����-�ܾ�ΰ� ����� �ι�° �ܾ� ù���ڴ� �빮�ڷ� ����)
 *  	============
 *  		�迭��
 *  		Ŭ������
 *  	===========������� ������
 *  		=>������
 *  		����ó��
 *  		���
 *  
 *  		return �����	=> void(��������) =>JVM�� �ڵ����� return�߰�
 *  	}
 *  
 *  	** return���� 1���� ������ ����
 *  	      �������� ��� => ��� �����ش�
 *  	** ��� �޼ҵ�� return�� ������ ���� �Ѵ�  
 *  
 *  	** ����ڰ� ��û�� ��
 *  	       ó�������
 *  	** ȣ��(��� �ñ�)
 * 
 */
import java.util.Scanner;
public class �޼ҵ�1 {
	// +
	static int plus(int a,int b)			//static(�ڵ�����)=>static������ static�� ȣ�Ⱑ��
	{
		return a+b;
	}
	// -
	static int minus(int a, int b)
	{
		return a-b;
	}
	// *
	static int gop(int a,int b)
	{
		return a*b;
	}
	// /
	static double div(int a, int b)
	{
		return a/(double)b;
	}
	// ����
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ����:");
		int a=scan.nextInt();
		System.out.print("�ι�° ����:");
		int b=scan.nextInt();
		
		System.out.println("������(+,-,*,/) �Է�:");
		String op=scan.next();
		
		switch(op)
		{
		case "+":
			{
				int res=plus(a,b);
				System.out.printf("%d%s%d=%d",a,op,b,res);
			}
			break;
		case "-":
			{
				int res=minus(a,b);
				System.out.printf("%d%s%d=%d",a,op,b,res);
			}
			break;
		case "*":
			{
				int res=gop(a,b);
				System.out.printf("%d%s%d=%d",a,op,b,res);
			}
			break;
		case "/":
			{
				double res=div(a,b);
				System.out.printf("%d%s%d=%f",a,op,b,res);
			}		
			break;
		}
	}
	public static void main(String[] args) {
//				  ====return��X
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			process();
			System.out.println("y|n �Է�:");
			String ex=scan.next();
			switch(ex)
			{
			case "y":
				System.exit(0);
				break;
			case "n":
				break;
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
