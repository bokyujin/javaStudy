/*	
 * 	데이터베이스 :웹 (오라클)-> 1부터시작
 * 						=======
 * 	네트워크 : 스마트폰 (코틀린)
 * =====================
 * C,C++,C#,Java => 0부터 시작 (문자열,자료구조(List,Set,Map),배열)
 * 				  	=======
 * 
 * 	do~while : 한번 이상을 수행하는 반복문 (사용빈도 적음)
 * 	형식) 
 * 		초기값 	
 * 		do{
 * 			실행문장 =>여러문장 사용가능
 * 		  	증가식 or 증감식 or 복합연산
 * 			(i++    i--    i+=2)
 * 		}while(조건문)
 * 
 * 
 * 		
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~10까지 출력
		
		int i=1;			//루프변수
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		
		System.out.println("10~1");
		
		do
		{
			i--;
			System.out.println(i);
			
		}while(i>1);
		
		
		

	}

}
