import java.util.*;

public class ���׿�����_5������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year=scan.nextInt();
		
		boolean yoon=(year%4==0)&&(year%100!=0||year%400==0);
		
		String dap=(yoon==true? "����":"���");
		
		System.out.println(dap);
		

		
		
		
		

	}

}
