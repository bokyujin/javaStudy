import java.util.Scanner;

/*
 * while�� => ���ѷ��� : while(true)		=>�� ���� ��
 * for��	  => ���ѷ��� : for(;;)
 * 
 * �ݺ����� �����ϴ� ����
 * ========
 * => continue : Ư�������� ����
 * => break	: �ݺ����� ����
 * 
 */
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while => 1~����� �Է°� ������ ¦���� ��, Ȧ���� ��, �� ���� ���ؼ� ���
		Scanner scan= new Scanner(System.in);
		int i =1;
		int total=0,sum1=0,sum2=0;
		
		System.out.print("���� �Է�:");
		int user=scan.nextInt();
		
		while(i<=user)
		{
			total+=i;
			if(i%2==0)
				sum1+=i;
			if(i%2!=0)
				sum2+=i;
			i++;
		}
		
		System.out.printf("1~%d������ ¦���� ��=%d\n",user,sum1);
		System.out.printf("1~%d������ Ȧ���� ��=%d\n",user,sum2);
		System.out.printf("1~%d������ �� ��=%d",user,total);

	}

}
