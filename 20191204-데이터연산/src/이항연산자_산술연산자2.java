import java.util.*;   //Scanner =>scanf
/*
 *  자바=>클래스
 *  C언어=>함수단위
 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 변수의 값 설정 
		 * 1)선언 후 값 저장 
		 * 	  int a;
		 * 	  a=10;
		 * 2)선언 동시에 값 저장
		 * 	  int a= 10;
		 * 3)입력한 값을 받아서 저장
		 * 4) 랜덤(난수) =>임의의 수 저장
		 */
//	int a=(int)(Math.random()*100)+1;
//	//Math.random() =>0.0 ~ 0.99 =>*100 =>0.0 ~ 99.0 =>(int)=>정수형0~99=>+1=>1~100
//	System.out.println("a="+a);
//	
//	Scanner scan=new Scanner(System.in);
//	// System.in =>키보드입력값을 받음
//	System.out.print("정수입력:");
//	int b=scan.nextInt();
//	System.out.println("b="+b);
		
		// 산술연산자 => +,/
		// 국어,영어,수학점수를 받아서 총점, 평균 => 소수점 2자리 출력
		
		int kor,eng,math,total;
		double avg;
		
		//입력기능의 클래스를 가지고 온다
		Scanner scan=new Scanner(System.in);
		
		System.out.print("국어점수:");
		kor=scan.nextInt();
		System.out.print("영어점수:");
		eng=scan.nextInt();
		System.out.print("수학점수:");
		math=scan.nextInt();
		
		//총점
		total=kor+eng+math;
		//평균
		avg=total/3.0;
		
		// 결과출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f",avg);
		
	


	}

}
