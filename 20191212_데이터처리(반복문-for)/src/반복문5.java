import java.util.Scanner;

/*
 * 	���ĺ� �빮�� �Է¹޾Ƽ� 
 * 	DDD�� �Է��ϸ�===>AAA�� ��� �ǰ� �����
 * 	ZZZ		  ===>WWW (-3)
 */
public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�빮�� �Է�:");
		String data=scan.next();
		
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			System.out.println((char)(c-3));
		}
		
		

	}

}
