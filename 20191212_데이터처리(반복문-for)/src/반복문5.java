import java.util.Scanner;

/*
 * 	알파벳 대문자 입력받아서 
 * 	DDD를 입력하면===>AAA가 출력 되게 만들기
 * 	ZZZ		  ===>WWW (-3)
 */
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("대문자 입력:");
		String data=scan.next();
		
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			System.out.println((char)(c-3));
		}
		
		

	}

}
