/*
 * �޼ҵ�
 * 1)����
 * 	������ �޼ҵ��(�Ű�����...) =>�����
 *  ====
 * 	{
 * 		��� ����
 * 		return �����
 * 			   ====		=>�������� ���ƾ���(������=�����)
 * 	}
 * 	=> �������� ���� ���: return�� ������ �� ���� (������:void)
 * 	=> ��� �޼ҵ�� �����ϱ� ���ؼ� �ݵ�� ��������  return�� ����Ѵ�/ return�� ������ ����X (����: ���ǹ��� ����ؼ�  return�� ����� �� �ִ�)
 * 	ex)
 * 	{
 * 		System.out.println(a);
 * 		return;
 * 		System.out.println(a+1);		=>error
 * 	}
 *  ���� ex)
 * 	{
 * 		System.out.println(a);
 * 		if(a==10)
 * 			return;
 * 		System.out.println(a+1);		
 * 	}
 * 
 * 2)������:�⺻��,Ŭ����,�迭
 * 	int method()	�⺻��
 * 	Movie method()	Ŭ����
 * 	int[] method()	�迭
 * 	void method()	�����X
 * 
 * 3)�Ű�����:����� ��û�� (3���̻��̸� ��� ��û=>Ŭ����or�迭=>ex)ȸ������,�Խ��� �۾���(Ŭ����))
 * 4)�Ű����� ���۹�
 * 	=> call by value : �⺻��,String
 * 	   =============�޸� ���� ����(����(��))
 * 	=> call by reference : �迭,Ŭ����
 * 	   =================���� �޸� �ּҸ� �̿��ؼ� �� ����
 * 5)ȣ��
 * 	�޼ҵ��()
 * 	�޼ҵ��(10,20)
 * ==============return�� ���� ���
 *  �������� ����=�޼ҵ�()
 *  �������� ����=�޼ҵ�(10,20)
 *  **��� �޼ҵ�� ������ ������ ���� �ٽ� ȣ���� ��ġ�� ���ƿ´�
 *  **�޼ҵ� ������ ȣ�� �� �Ѱ��� �޼ҵ尡 ������ �����ؾ� ���� �޼ҵ带 ȣ���Ѵ� =>����ȭ ��� 	
 * 
 */
public class �޼ҵ�1 {
	static void swap(int a,int b)
	{
		System.out.println("swap:a="+a+",b="+b);
		//����
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap:a="+a+",b="+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		swap(a,b);
		System.out.println("main:a="+a+",b="+b);		//==>����X(call by value)-�⺻��,String
		
		

	}

}
