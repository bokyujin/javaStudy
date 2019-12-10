/*
 * 	컴퓨터=>1~100 사이의 임의의 수를 추출
 * 	힌트 => UP/DOWN
 */
import java.util.Scanner;
public class 업다운게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수(임의의 수)
		int com=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("1~100사이의 정수입력:");
			int user=scan.nextInt();
			//오류
			if(user<1||user>100)
			{
				System.out.println("잘못된 입력입니다!!");
				continue;			//while문의 조건식으로 이동
			}
			//처리
			if(com>user)
			{
				System.out.println("더 큰 수를 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("더 작은 수를 입력하세요");
			}
			else
			{
				System.out.println("Game Over!");
				//종료 (2가지 방법)
				break;				//while문 종료
//				System.exit(0);				
			}
				
			
		}
		
		

	}

}
