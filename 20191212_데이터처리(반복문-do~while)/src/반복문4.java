import java.util.Scanner;

/*
 * 	�ΰ��� ������ �Է¹޾Ƽ� (do~while)
 * 	�ִ밪,�ּҰ�
 */
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int i=1;
		int x=0,y=0;
	
		
		do
		{
			if(i==1)
			{
			System.out.print("ù��° �����Է�:");
			x=scan.nextInt();
			}	
			else
			{
				System.out.print("�ι�° �����Է�:");
				y=scan.nextInt();
				}
			i++;
		}while(i<=2);
		
//		if(x<y)
//		{
//		System.out.printf("�ִ밪:%d, �ּҰ�:%d",y,x);
//		}
//		else
//		{
//		System.out.printf("�ִ밪:%d, �ּҰ�:%d",x,y);
//		}																			//if~else���
		
//		System.out.println("�ִ밪:"+(x>y?x:y)+"�ּҰ�:"+(x>y?y:x));					//���׿����� ���
		System.out.println("�ִ밪:"+(Math.max(x, y))+", "+"�ּҰ�:"+(Math.min(x, y)));		//���̺귯�� ���
			

	}

}
