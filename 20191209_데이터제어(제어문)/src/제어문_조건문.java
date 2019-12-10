/*
 *  조건문
 *  = 단일 조건문
 *  	1)형식 : if(조건문)
 *  			  실행문장
 *  
 *  		   if(조건문) => 한개이상의 실행문장이 있는경우 {}
 *  			{ 
 *  			    실행문장1
 *  			    실행문장2 
 *  			}
 *  
 *  		   if(조건문)
 *  			실행문장1 => if소속문장 (실행O)
 *  			실행문장2 => if와 관계 X(실행X)
 *  	2)조건문 처리 방법
 *  	  ====true/false =>부정,비교,논리 연산자
 *  	3)실행=>조건이true=>문장수행
 *  	 	      조건이 false=>문장수행X
 *  	
 *  = 선택 조건문
 *  = 다중 조건문
 *  
 */
// 정수를 입력 받아서 =>홀수/짝수
/*
 *  1)자바에서 생략이 가능한 부분
 *  	1.import (라이브러리 클래스 블러오는 것) =>java.lang(System,String,Math...)
 *  	2.return => 모든 메소드는 return을 가지고있다
 *  	3.상속 => 모든 클래스(사용자정의)는 Object상속
 *  	4.예외처리 =>모든 클래스는 예외처리를 가지고 있다
 *  	  =====
 *  	     비정상 종료를 방지하고 정상상태를 유지(미리 에러를 방지하는 프로그램)
 */
import java.util.Scanner;		
//두개 이상 불러올 때 :util.*	//import=>이미만들어진 클래스 불러올때 사용
//CBD => 컴포넌트 베이스
//조립식 프로그램 
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		if(num%2==0)
			System.out.println(num+"는(은) 짝수입니다");
		if(num%2!=0)
			System.out.println(num+"는(은) 홀수입니다");
		
	}

}
