/*
 * ���� 1�� �Է¹޾Ƽ� 2�������
 * 16��Ʈ
 * 0000 0000 0000 1010
 */
import java.util.Scanner;
public class �޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		// ����
			
		System.out.print("�����Է�:");
		int input=scan.nextInt(); 		//����� �Է°��� �޴� ����
//		System.out.println(Integer.toBinaryString(input));	=>2���� �Լ�
		
		int[] binary=new int[16];		//0000000000000000
		//�迭�� ��ġ 
		int index=15;	//�迭=>�� ����=>��ġ(��(0),��(length-1))
		
		while(true)
		{
			binary[index]=input%2;
			input/=2;
			if(input==0)
				break;
			index--;			
		}
		
		//���
		for(int i=0;i<16;i++)
		{
			if(i%4==0&&i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		
		
		

	}

}
