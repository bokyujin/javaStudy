import java.util.*;

public class 이항연산자_5번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		boolean yoon=(year%4==0)&&(year%100!=0||year%400==0);
		
		String dap=(yoon==true? "윤년":"평년");
		
		System.out.println(dap);
		

		
		
		
		

	}

}
