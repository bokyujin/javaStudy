import java.util.Scanner;

// 5���� ������ �Է¹޾Ƽ� => 5�� ���� ��� => ��,���
public class �迭7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		// 5���� ���� �����ϴ� ���� �����
		int[] num=new int[5];
		//���� �����ϴ� ����
		int total=0;
		//��� ����
		double avg=0.0;
		
		//���� 5�� �Է�
		for(int i=0;i<num.length;i++)
		{
			System.out.print((i+1)+"��° ���� �Է�:");
			num[i]=scan.nextInt();
		}
		//���
		for(int score:num)
		{
			total+=score;
		}
		avg=total/(double)num.length;
		
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg);
		
		

	}

}
