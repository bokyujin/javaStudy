import java.util.Scanner;

/*
 * 	두개의 정수를 입력받아서 (do~while)
 * 	최대값,최소값
 */
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int i=1;
		int x=0,y=0;
	
		
		do
		{
			if(i==1)
			{
			System.out.print("첫번째 정수입력:");
			x=scan.nextInt();
			}	
			else
			{
				System.out.print("두번째 정수입력:");
				y=scan.nextInt();
				}
			i++;
		}while(i<=2);
		
//		if(x<y)
//		{
//		System.out.printf("최대값:%d, 최소값:%d",y,x);
//		}
//		else
//		{
//		System.out.printf("최대값:%d, 최소값:%d",x,y);
//		}																			//if~else사용
		
//		System.out.println("최대값:"+(x>y?x:y)+"최소값:"+(x>y?y:x));					//삼항연산자 사용
		System.out.println("최대값:"+(Math.max(x, y))+", "+"최소값:"+(Math.min(x, y)));		//라이브러리 사용
			

	}

}
