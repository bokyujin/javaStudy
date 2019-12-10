import java.util.*;

public class 이항연산자_4번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--입력--");
		System.out.print("Input name:");
		String name=scan.next();
		System.out.print("kor:");
		int kor=scan.nextInt();
		System.out.print("eng:");
		int eng=scan.nextInt();
		System.out.print("mat:");
		int mat=scan.nextInt();
		
		int total= kor+eng+mat;
		double avg=total/3.0;
		
		System.out.println("\n\n--출력--");
		System.out.println("이름:"+name+"\n"+"합계점수:"+total+"점");
		System.out.printf("평균점수:%.1f",avg);
		
		


	}

}
