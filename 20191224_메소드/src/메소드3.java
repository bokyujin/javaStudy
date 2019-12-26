import java.util.Scanner;

/*
 * 년도 입력 받아서 윤년인지 확인
 * int 0,1=>boolean
 * 경우의 수가 많을 때 :상수형 / String
 * 
 */
public class 메소드3 {
	//입력
	static void isYear(int year)
	{
		if((year%4==0&&year%100!=0)||year%400==0)
			System.out.println(year+"년도는 윤년입니다");
		else
			System.out.println(year+"년도는 윤년이 아닙니다");		
	}
	
	static boolean isYear2(int year)
	{
		if((year%4==0&&year%100!=0)||year%400==0)
			return true;
		else
			return false;		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int year=2019;
			isYear(year);
			boolean bCheck=isYear2(year);		//=>재사용 편리
			if(bCheck)
				System.out.println("윤년입니다");
			else 
				System.out.println("윤년이 아닙니다");
	}

}
