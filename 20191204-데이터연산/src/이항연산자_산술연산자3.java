//% =>������ ������ 
/*
 * ������=>����ȯ 
 * 		 ��� : / , %
 * 			  / => 0���� ������ ����
 * 				    ����/����=����
 * 			  % => �������� ��ȣ�� ����
 * 				   ���%���(����)=���, ����%���(����)=����
 * 
 */
public class ���׿�����_���������3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=30;
		double b=4.0;
		double c=a/b; //int ������ error
		System.out.println("c="+c);
		
		//���������
		int d1=5%2;
		int d2=-5%2;
		int d3=-5%-2;
		int d4=5%-2;
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		System.out.println("d4="+d4);
		
		int e=369;
		int h100=e/100;
		int h10=(e%100)/10;
		int h1=e%10;
		
		System.out.println("100�ڸ�:"+h100);
		System.out.println("10�ڸ�:"+h10);
		System.out.println("1�ڸ�:"+h1);
		
		
		String s=100+10.5+""+'A'+10f+100L;
		// 		  110.5+""=>"110.5"+'A'=>"110.5A"+10f=>110.5A10+100L=>110.5A10.0100
		System.out.println(s);

		
	}

}
