import java.util.Scanner;
public class �迭11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] dap=new char[10];
		char[] user=new char[10];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<dap.length;i++)
		{
			int k=(int)(Math.random()*2);	//0,1
			if(k==0)
				dap[i]='O';
			else
				dap[i]='X';
		}
		
		for(int i=0;i<user.length;i++)
		{
			System.out.print((i+1)+"��° ��(O,X)�Է�:");
			String s=scan.next();
			user[i]=s.charAt(0);		//ù�ڸ� ©���
			
		}
				
		System.out.println("����:");
		//���
		for(char c:dap)
		{
			System.out.print(c+" ");
		}
		System.out.println("\n����� �Է�:");
		
		for(char c:user)
		{
			System.out.print(c+" ");
		}
		
		System.out.println("\n���:");
		int count=0;
		for(int i=0;i<dap.length;i++)
		{
			if(dap[i]==user[i])
				count++;			
		}
		System.out.println("����:"+(count*10)+"��");

		

	}

}
