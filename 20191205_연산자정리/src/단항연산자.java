
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=a++;
		int c=++a;
//		    a=12 / b=10 / c=12
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		char ch='A';	
		System.out.println(ch++);		//=>A (����ϰ� ����)
		System.out.println(++ch);		//=>C (�����ϰ� ���)
		
		int i=10;
		int j=i++ + i++ + ++i + ++i + i++ + i++ +i-- + --i;
		System.out.println(j);
		int result=10+11+13+14+14+15+16+14;
		System.out.println(result);
		
		int x=10;
		int y=9;
		
		////���������ڰ� ������� �ʴ� ���////
//		=====================================================================================
		boolean bCheck =(x<y)&&(++y==x); 		//=>&&�� ������ false�̱� ������ �������� �������� ����
		System.out.println(bCheck);				//  and�� ������ false�� ������ ����X
		System.out.println("x="+x);				//  or�� ������ true�� ������ ���� X
		System.out.println("y="+y);
//		======================================================================================
		
//		���������� =>�ݺ���
//		! => ���������� =>boolean�� => ���ǹ�
		
	}

}
