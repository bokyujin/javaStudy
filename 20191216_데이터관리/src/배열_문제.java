import java.util.Scanner;

/*
 * 5개 정수 입력받아서(random도 가능)
 * 받은 점수의 등수 출력
 */
public class 배열_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int num[]=new int[5];
		int rank[]=new int[5];
		
		for(int i=0;i<5;i++) 
		{
			System.out.println((i+1)+"번째 정수입력:");
			num[i]=scan.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			rank[i]=1;
			
			for(int j=0;j<5;j++)
			{
				if(num[i]<num[j])
				{
					rank[i]++;
				}
					
			}
					
		}
		for(int i:rank)
		System.out.println(i);
		
		
		

	}

}
