//���������� ==>5�� => ���й� Ƚ��
import java.util.Scanner;
public class �ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * com-user 
		 * ����(0)-����(0)=0
		 * 		   ����(1)=-1
		 * 		   ��(2)=-2
		 * ����(1)-����(0)=1
		 * 		   ����(1)=0
		 * 		   ��(2)=-1
		 * ��(2)-����(0)=2
		 * 		   ����(1)=1
		 * 		   ��(2)=0
		 * ����� win=-1,2 /lose=1,-2/same=0
		 * 
		 */
		int i=1;
		int win=0, lose=0, same=0;
		
		Scanner scan=new Scanner(System.in);
		
		while(i<=5)
		{
			//���� ���� ��
			//��ǻ��=> ����������
			int com=(int)(Math.random()*3);		//0~2
			//�����=> �Է�
			System.out.print("����(0),����(1),��(2):");
			int user=scan.nextInt();
			System.out.println("��ǻ��:"+com);
			//��
			int res=com-user;
			
				
//			if(res==-1||res==2)
//				win++;
//			else if(res==1||res==-2)
//				lose++;
//			else
//				same++;
			
			switch(res)
			{
			case -1:
			case 2:
			{
				System.out.println("��!");
				win++;
				break;
			}
			case 1:
			case -2:
			{
				System.out.println("��");
				lose++;
				break;
			}
			default: 
			{
				System.out.println("��");
				same++;
			}
			
			}
			
			i++;
		}
		
		//�� �� ��
		System.out.printf("����� ����:%d�� %d�� %d��",win,same,lose);
		

	}

}
