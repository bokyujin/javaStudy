/*
 * 1~100������ ��
 * ¦��/Ȧ���� ��
 * 
 */
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sum1=0,sum2=0;
		
		
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			if(i%2==0)
				sum1+=i;
			else
				sum2+=i;
				
		}
		System.out.println("1~100������ ��:"+sum);
		System.out.println("1~100������ ��:"+sum1);
		System.out.println("1~100������ ��:"+sum2);
	}

}
