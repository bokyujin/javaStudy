/*
 * 조건문 :true/false일 때 별도로 처리를 함
 * 	형식)
 * 		if(조건문)
 * 			실행문장(조건문이 true일때)
 * 		else
 * 			실행문장(조건문이 false일때)
 * 
 * 		ex) 사용자=> 두개의 정수 입력 =>처리 (나누기)
 * 			
 * 	if => error방지,원하는데이터를 받으려고 할때
 * 		  =======->실제처리   else
 */
public class 선택조건문_형식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나누기
		int a=10;
		int b=2;
		if(b==0)
			System.out.println("0으로 나눌 수 없습니다");
		else
			System.out.println(a+"/"+b+"="+(a/b));
	}

}
