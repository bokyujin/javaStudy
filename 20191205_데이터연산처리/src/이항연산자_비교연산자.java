/*
 * 
 */
import java.util.Scanner;

public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=10==11;
		System.out.println(b1);
		
		b1=10>11;
		System.out.println(b1);
		
		b1=65=='A';
		System.out.println(b1);  //char => 모든 연산에서 정수로 변경
		
//		char=>번호 =>ASCII코드
		System.out.println((int)'A');
		System.out.println((int)'0'); //=>'때문에 문자로 인식하여 문자0이라 48로 나옴
		System.out.println('a');
		
//		두개의 정수를 받아서 큰 값을 출력
		Scanner scan=new Scanner(System.in);
		// new => 메모리에 저장, 생성자 => 초기값 부여
		/*
		 *  scan.nextInt() 		=>int
		 *  scan.nextDouble()	=>double
		 *  scan.next()			=>String
		 *  scan.nextboolean()  =>boolean
		 *  ==> char(X)
		 */
		int num1, num2;
		System.out.print("첫번째 정수 입력");
		num1=scan.nextInt();
		
		System.out.println("두번째 정수 입력");
		num2=scan.nextInt();
		
		int result=num1<num2?num2:num1;
		
		System.out.println("큰값은"+result+"입니다");
		

	}

}
