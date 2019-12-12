import java.util.Scanner;

/*
 * 
 * 	for : 반복문(반복횟수 지정)
 * 	===
 * 	1)일반 for
 *		형식)
 *			for(초기값;조건식;증가식)
 *				실행문장
 *			=> 초기값->조건식->실행문장->증가식->조건식->실행문장->... (조건식이 false면 종료)
 *	= 초기값==>자바=>0
 * 	= 실행문장의 범위
 * 	   ==============>한문장{}(o,x),여러문장{}(o)
 * 	= 증가식 =>1개씩
 *  = 변수,조건 한개 이상 (여러개)사용 가능
 *  	for(i=0,j=1;i<=1 && j>=1;...)
 * 	= for(i=0;...) =>지역변수 i는 for안에서만 사용가능
 * 	
 * 
 * 	2)향상된 for(JDK1.5이상) :배열,컬렉션(데이터베이스)
 * 	  ====
 * 	    메소드(일반메소드,람다식(함수포인터):JDK1.8)
 * 
 * 
 */
public class 반복문1 {

	public static void main(String[] args) {
//	=====<=>===== ==== 				 ====
//	  두개 순서변경 가능  결과값없을때			 변경가능(아무 문자나 상관없음)
		// TODO Auto-generated method stub
		int i=1;
		for(i=1;i<=10;i++)
		{
			System.out.println("i="+i);
		}
		System.out.println("i="+i);
	}

}
