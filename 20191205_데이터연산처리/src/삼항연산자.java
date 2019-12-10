/*
 * ?:
 * (조건)?참일때 값:거짓일때 값		=>웹에서 많이 사용(React)
 * 
 */

//	국어,영어,수학 점수를 입력받아서 평균 60이상이면  pass/ nopass
//	나이 입력 =>15세이상이면 영화관람가능/이하면 영화관람불가
//	좌석=>1 2 3 4 5 =>1,2,4=>좌석예매불가/3,5=>예매가능
import java.util.Scanner;
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
//		System.out.print("국어 점수:");
//		int kor=scan.nextInt();
//		System.out.print("영어 점수:");
//		int eng=scan.nextInt();
//		System.out.print("수학 점수:");
//		int math=scan.nextInt();
//		
//		int avg=(kor+eng+math)/3;
//		
//		String result=avg>=60?"pass":"nopass";
//		
//		System.out.println("결과:"+result);
		
//	=======================================================	
//		System.out.print("나이입력:");
//		int age=scan.nextInt();
//		
//		String res=age>=15?"영화관람가능":"영화관람불가";
//		System.out.println(res);
//==========================================================		
		
		System.out.print("원하는 좌석(1~5):");
		int seat =scan.nextInt();
		String result = (seat==3||seat==5)?"예약가능":"예약불가";
		
		System.out.println(result);
		
	}

}
