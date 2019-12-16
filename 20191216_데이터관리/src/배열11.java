import java.util.Scanner;
public class 배열11 {

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
			System.out.print((i+1)+"번째 답(O,X)입력:");
			String s=scan.next();
			user[i]=s.charAt(0);		//첫자만 짤라옴
			
		}
				
		System.out.println("정답:");
		//출력
		for(char c:dap)
		{
			System.out.print(c+" ");
		}
		System.out.println("\n사용자 입력:");
		
		for(char c:user)
		{
			System.out.print(c+" ");
		}
		
		System.out.println("\n결과:");
		int count=0;
		for(int i=0;i<dap.length;i++)
		{
			if(dap[i]==user[i])
				count++;			
		}
		System.out.println("점수:"+(count*10)+"점");

		

	}

}
