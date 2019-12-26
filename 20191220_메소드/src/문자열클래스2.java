// ID,PWD =>LOGIN
// equals =>return(boolean)
// 저장된 문자열이 같은지 확인
// 
import java.util.Scanner;
public class 문자열클래스2 {
	static boolean isLogin(String id,String pwd)
	{
		boolean bCheck=false;
		final String ID="admin";
		final String PWD="1234";
		/*
		 * equals			=>대소문자 구분 비교
		 * equalsIgnoreCase	=>대소문자 구분없이 비교
		 * 
		 * startsWith : 시작문자열이 같은 경우 true
		 * endsWith : 끝나는 문자열이 같은 경우 true
		 * contains : 포함하는 문자열이 있는 경우 true
		 */
		
//		if(id.equalsIgnoreCase(ID)&& pwd.equals(PWD))	//대소문자 구분 X
		if(id.equals(ID) && pwd.equals(PWD))		//대소문자구분 O
		{
			bCheck=true;
		}
		
		return bCheck;		
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("ID입력:");
			String id=scan.next();
			System.out.println("PWD입력:");
			String pwd=scan.next();
			
			boolean bCheck=isLogin(id,pwd);
			if(bCheck==true)
			{
				System.out.println(id+"님이 로그인 되었습니다");
				break;
			}
			else
			{
				System.out.println("ID/PWD 틀립니다\n다시입력하세요");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();

	}

}
