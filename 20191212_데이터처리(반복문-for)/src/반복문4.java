/*
 * 1~100까지의 합
 * 짝수/홀수의 합
 * 
 */
public class 반복문4 {

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
		System.out.println("1~100까지의 합:"+sum);
		System.out.println("1~100까지의 합:"+sum1);
		System.out.println("1~100까지의 합:"+sum2);
	}

}
