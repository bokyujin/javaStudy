import java.util.Scanner;

/*
 * 	Switch-case
 * 
 *  선택문 : 한개의 값을 받아서 처리(한번만 수행 =>break)
 *  	     게임,네트워크 ...
 *  형식) switch(값) ==> 값: 정수,문자,문자열
 *  			   1입력시 처리 123 모두 수행/ 1만 처리하려면 처리1후에 break걸어줘야함
 *  	=> switch(정수)
 *  	  {		 ====
 *  		case 1:
 *  			처리1
 *  		case 2:
 *  			처리2
 *     		case 3:
 *  			처리3
 *  		default:
 *  			처리 			=> (default~처리 =>생략가능)
 *  	  }
 */
//		다중if<=>switch
//		=> Servlet <=> JSP =>MVC =>틀(Spring)
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수:");
		int num2=scan.nextInt();
		System.out.print("연산자(+,-,*,/):");
		String op=scan.next();
		
		//처리
		switch(op)
		{
		case "+":
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			break;
		case "/":
			if (num2==0)
				System.out.println("0으로 나눌 수 없습니다!");
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,(double)num1/num2);
			break;
		default:
		}
		

	}

}
