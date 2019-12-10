/*
 * 정수 입력받아서 년도가 윤년인지
 * 4년마다
 * 100년마다 제외
 * 400년마다
 */
import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = scan.nextInt();
		
		if((year%4==0)&&(year%100!=100)||(year%400==0))		//윤년조건
			System.out.println(year+"년은 윤년입니다");
		if(!(year%4==0)&&(year%100!=100)||(year%400==0))
			System.out.println(year+"년은 윤년이 아닙니다.");

	}

}
