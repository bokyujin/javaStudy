import java.util.Scanner;

/*
 * 1. if~else
 * 	   정수를 한개 입력받아서 짝수/홀수
 * 2. 알파벳을 입력해서 대문자/소문자(if~else)
 * 3. 정수 세개를 입력받아서 평균 => 90점이상='A' ,80점이상='B',70점이상='C',60점이상=>'D',나머지F
 */
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=scan.nextInt();
		if(num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		
		char c='a';
		if (c>='a'&&c<='z')
			System.out.println("소문자");
		else
			System.out.println("대문자");
		
		
		System.out.println("3개의 점수입력:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();	
		int avg=(num1+num2+num3)/3;
		int res=avg/10;
		
		if(res==10||res==9)
			System.out.println("A");
		if(res==8)
			System.out.println("B");
		if(res==7)
			System.out.println("C");
		if(res==6)
			System.out.println("D");
		if(res<6)
			System.out.println("D");

	}

}
