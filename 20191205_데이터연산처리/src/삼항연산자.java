/*
 * ?:
 * (����)?���϶� ��:�����϶� ��		=>������ ���� ���(React)
 * 
 */

//	����,����,���� ������ �Է¹޾Ƽ� ��� 60�̻��̸�  pass/ nopass
//	���� �Է� =>15���̻��̸� ��ȭ��������/���ϸ� ��ȭ�����Ұ�
//	�¼�=>1 2 3 4 5 =>1,2,4=>�¼����źҰ�/3,5=>���Ű���
import java.util.Scanner;
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
//		System.out.print("���� ����:");
//		int kor=scan.nextInt();
//		System.out.print("���� ����:");
//		int eng=scan.nextInt();
//		System.out.print("���� ����:");
//		int math=scan.nextInt();
//		
//		int avg=(kor+eng+math)/3;
//		
//		String result=avg>=60?"pass":"nopass";
//		
//		System.out.println("���:"+result);
		
//	=======================================================	
//		System.out.print("�����Է�:");
//		int age=scan.nextInt();
//		
//		String res=age>=15?"��ȭ��������":"��ȭ�����Ұ�";
//		System.out.println(res);
//==========================================================		
		
		System.out.print("���ϴ� �¼�(1~5):");
		int seat =scan.nextInt();
		String result = (seat==3||seat==5)?"���డ��":"����Ұ�";
		
		System.out.println(result);
		
	}

}
