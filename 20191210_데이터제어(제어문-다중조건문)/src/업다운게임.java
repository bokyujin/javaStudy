/*
 * 	��ǻ��=>1~100 ������ ������ ���� ����
 * 	��Ʈ => UP/DOWN
 */
import java.util.Scanner;
public class ���ٿ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����(������ ��)
		int com=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("1~100������ �����Է�:");
			int user=scan.nextInt();
			//����
			if(user<1||user>100)
			{
				System.out.println("�߸��� �Է��Դϴ�!!");
				continue;			//while���� ���ǽ����� �̵�
			}
			//ó��
			if(com>user)
			{
				System.out.println("�� ū ���� �Է��ϼ���");
			}
			else if(com<user)
			{
				System.out.println("�� ���� ���� �Է��ϼ���");
			}
			else
			{
				System.out.println("Game Over!");
				//���� (2���� ���)
				break;				//while�� ����
//				System.exit(0);				
			}
				
			
		}
		
		

	}

}
