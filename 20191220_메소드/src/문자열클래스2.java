// ID,PWD =>LOGIN
// equals =>return(boolean)
// ����� ���ڿ��� ������ Ȯ��
// 
import java.util.Scanner;
public class ���ڿ�Ŭ����2 {
	static boolean isLogin(String id,String pwd)
	{
		boolean bCheck=false;
		final String ID="admin";
		final String PWD="1234";
		/*
		 * equals			=>��ҹ��� ���� ��
		 * equalsIgnoreCase	=>��ҹ��� ���о��� ��
		 * 
		 * startsWith : ���۹��ڿ��� ���� ��� true
		 * endsWith : ������ ���ڿ��� ���� ��� true
		 * contains : �����ϴ� ���ڿ��� �ִ� ��� true
		 */
		
//		if(id.equalsIgnoreCase(ID)&& pwd.equals(PWD))	//��ҹ��� ���� X
		if(id.equals(ID) && pwd.equals(PWD))		//��ҹ��ڱ��� O
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
			System.out.println("ID�Է�:");
			String id=scan.next();
			System.out.println("PWD�Է�:");
			String pwd=scan.next();
			
			boolean bCheck=isLogin(id,pwd);
			if(bCheck==true)
			{
				System.out.println(id+"���� �α��� �Ǿ����ϴ�");
				break;
			}
			else
			{
				System.out.println("ID/PWD Ʋ���ϴ�\n�ٽ��Է��ϼ���");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();

	}

}
