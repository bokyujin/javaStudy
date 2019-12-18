/*
 * 1.묶어서 사용
 * 	 배열 => 클래스 => 패키지 => 라이브러리(jar)
 *  ===
 *  
 *  프로그램
 *  	데이터+명령문 (메소드)	=>클래스
 *  	클래스 여러개 => 조립 => 프로그램 /(자바CBD)
 *		
 * 2.자바=>오라클=> html(CSS,JavaScript)=>JSP =>MVC=>Spring=>  Kotlin(모바일)
 * 	 			=========================   ============	============>웹앱
 * 						front  				    back			
 * 	*배열단점 : 선언시 메모리 크기 결정됨 (고정적)	/=> 가변형(ArrayList)
 *   		 같은 데이터형만 모아서 사용해야함
 *  	선언시 => 메모리 크기를 결정
 *  	===================
 *  	1)선언
 *  	   int[] arr;
 *  	   ===	 ===
 *  	  데이터형      배열명(실제 저장된 데이터의 주소)
 *  	 		 	  ======heap영역
 *  	2)초기화 	
 *  	  arr={1,2,3,4,5}
 *  	  arr=new int[5]	=>메모리 공간 할당 (나중에 데이터 대입)
 *  	3)값을 읽기, 쓰기 => 인덱스
 *  	  int arr={10,20,30,40,50};
 *  	  			  
 *  	  arr		  arr[0] arr[1] arr[2] ....연속적=>for문
 *  	========	   ==============================
 *  	  100			10	   20	 30	   40	 50
 *   	========	  |==============================
 * 					 100(주소)  
 * 		**arr[0] - 일반변수와 같음
 * 					ex) arr[0]=10
 */		
//달력 
/*
 * 1) 년도, 월 입력 받기
 * 2) 1일이 무슨 요일인지 확인
 * 3) 마지막날짜 확인
 * 4) 출력
 * 
 */
import java.util.*;
import java.text.*;
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//년도, 월 입력
		Scanner scan= new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		System.out.println("\n"+year+"년 "+month+"월");
		System.out.println("\n");
		char[] strweek= {'일','월','화','수','목','금','토'};
		for(int i=0;i<7;i++)
		{
			System.out.print(strweek[i]+"\t");
		}
		System.out.println();
		
		//1일자의 요일 확인
		//전년도 12월31일까지의 총합구하기
		int total=(year-1)*365
				+(year-1)/4 -(year-1)/100 +(year-1)/400;
		//전달까지의 합 구하기
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0)&&(year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
	
		// +1	=>%7	=>요일구하기
		total++;		//각 달의 1일자
		
		int week=total%7;
				
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
					System.out.print("\t");
			}
			System.out.printf("%d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		
		
		
		
		

	}

}
