/*
 * ���������(+,_,*,/,%) : �ٸ� ���������� ������� ���
 * 		1) int ���� ��������(byte,short,char)=>����ó��->int
 * 		   byte+byte => int
 */
public class ���׿�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		byte b=10;
//		byte c=20;
//		
//		int d=b+c;    //byte d=b+c;�� �ڵ��ϸ�  error��
//		byte e=(byte)(b+c);
		
//		byte a=120;
//		byte b=10;
//		byte c=(byte)(a+b);
//		System.out.println("a+b="+c);
		
		byte b=(byte)300;
		System.out.println("b="+b);
		System.out.println(Integer.toBinaryString(300));
		
		// 300�� 2����: 100101100
		// �ڿ������� 8��Ʈ ���� => 00101100 =44
		
		int a=10+20*3;
		System.out.println("a="+a);
		
		
	
	}	
}
