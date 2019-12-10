/*
 * 	반복문
 * 	=================== 선조건 (실행 전 조건검색)
 *   = for : 반복 횟수 지정
 *   = while : 횟수 지정이 없는 경우
 *   	초기값
 *   	while(조건문)
 *   	{
 *   		실행문장
 *   		증감식
 *   	}
 *  =================== 후조건 (실행 후 조건검색) : 한번 이상은 반드시 수행
 *   = do while
 *   	초기값
 *   	do
 *   	{
 *   		실행문장
 *   		증가식
 *   	} while(조건문)
 */
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;		//1
//		int sum=0,sum3=0,sum5=0,sum7=0;	
//		while(i<=100)	//2
//		{
//			sum+=i;		//3
//			i++;		//4
//		}
//		// 1=>2=>3=>4 =>2=>3=>4 =>2=>3 ... (2=false=>종료)
//		System.out.println("1~100까지의 합:"+sum);
		
/*		while(i<=100)	
		{
			if(i%3==0)
				sum3+=i;
			if(i%5==0)
				sum5+=i;
			if(i%7==0)
				sum7+=i;
			sum+=i;		
			i++;		
		}
//		3의배수의합,5의배수의합,7의배수의합(1~100)
		System.out.println("1~100까지의 합:"+sum);
		System.out.println("1~100까지의 3의 배수의 합:"+sum3);
		System.out.println("1~100까지의 5의 배수의 합:"+sum5);
		System.out.println("1~100까지의 7의 배수의 합:"+sum7); */
		
		// A부터 Z까지 출력
		char i='A';
		while(i<='Z')
		{
			System.out.print(i+" ");
			i++;
		}
		
		
		
	}

}
