import java.util.Scanner;

/*
 * ���� �Է� (1~4)
 */

public class ���_���ǹ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���
		final int UP=1, DOWN=2,LEFT=3,RIGHT=4;
		
		int x=0,y=800;
		Scanner scan=new Scanner(System.in);
		System.out.println("Ű���� �Է�(��:1,�Ʒ�:2,����:3,������:4):");
		
		int input=scan.nextInt();
		
		if(input==UP)
		{
			System.out.println("�������� �ö󰩴ϴ�");
			y-=5;
		}
		if(input==DOWN)
		{
			System.out.println("�Ʒ������� �������ϴ�");
			y+=5;
		}
		if(input==LEFT)
		{
			System.out.println("�������� ������");
			x-=5;
		}
		if(input==RIGHT)
		{
			System.out.println("���������� ������");
			x+=5;
		}
		
				
		

	}

}
