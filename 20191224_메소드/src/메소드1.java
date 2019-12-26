/*
 * 메소드
 * 1)형식
 * 	리턴형 메소드명(매개변수...) =>선언부
 *  ====
 * 	{
 * 		기능 구현
 * 		return 결과값
 * 			   ====		=>데이터형 같아야함(리턴형=결과값)
 * 	}
 * 	=> 리턴형이 없는 경우: return을 생략할 수 있음 (리턴형:void)
 * 	=> 모든 메소드는 종료하기 위해서 반드시 마지막에  return을 사용한다/ return밑 문장은 수행X (예외: 조건문을 사용해서  return을 사용할 수 있다)
 * 	ex)
 * 	{
 * 		System.out.println(a);
 * 		return;
 * 		System.out.println(a+1);		=>error
 * 	}
 *  예외 ex)
 * 	{
 * 		System.out.println(a);
 * 		if(a==10)
 * 			return;
 * 		System.out.println(a+1);		
 * 	}
 * 
 * 2)리턴형:기본형,클래스,배열
 * 	int method()	기본형
 * 	Movie method()	클래스
 * 	int[] method()	배열
 * 	void method()	결과값X
 * 
 * 3)매개변수:사용자 요청값 (3개이상이면 묶어서 요청=>클래스or배열=>ex)회원가입,게시판 글쓰기(클래스))
 * 4)매개변수 전송법
 * 	=> call by value : 기본형,String
 * 	   =============메모리 따로 생성(복제(값))
 * 	=> call by reference : 배열,클래스
 * 	   =================같은 메모리 주소를 이용해서 값 변경
 * 5)호출
 * 	메소드명()
 * 	메소드명(10,20)
 * ==============return이 없는 경우
 *  데이터형 변수=메소드()
 *  데이터형 변수=메소드(10,20)
 *  **모든 메소드는 수행이 종료한 다음 다시 호출한 위치로 돌아온다
 *  **메소드 여러개 호출 시 한개의 메소드가 수행을 종료해야 다음 메소드를 호출한다 =>동기화 방식 	
 * 
 */
public class 메소드1 {
	static void swap(int a,int b)
	{
		System.out.println("swap:a="+a+",b="+b);
		//변경
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap:a="+a+",b="+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		swap(a,b);
		System.out.println("main:a="+a+",b="+b);		//==>변경X(call by value)-기본형,String
		
		

	}

}
