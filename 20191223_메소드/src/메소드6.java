import java.util.Scanner;
public class �޼ҵ�6 {
	//�ߺ����� ���� �߻�
	static int[] getRand(int no)
	{
		int[] com=new int[no];
		
		for(int i=0;i<no;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}			
		}
		
		
		return com;
	}
	//����� �Է�
	 static int[] userInput()
	 {
		 int[] user=new int[3];
		 Scanner scan=new Scanner(System.in);
		 while(true)
		 {
			 System.out.print("3�ڸ� ���� �Է�:");
			 int input=scan.nextInt();
			 if(input<100||input>999)
			 {
				 System.out.println("�߸��� �Է��Դϴ�.�ٽ� �Է��ϼ���");
				 continue;
			 }
			 user[0]=input/100;
			 user[1]=(input%100)/10;
			 user[2]=input%10;
			 
			 if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			 {
				 System.out.println("�ߺ��� ���� ����� �� �����ϴ�.");
				 continue;
			 }
			 if(user[0]==0||user[1]==0||user[2]==0)
				{
				 System.out.println("0�� ����� �� �����ϴ�.");
				 continue;
				}
			 break;
			 	
		 }
		 return user;
	 }

	 //��
	 static void compare(int[] com,int[] user)
	 {
		 int s=0,b=0;
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 if(com[i]==user[j])
				 {
					 if(i==j)
						 s++;
					 else
						 b++;
				 }
			 }
		 }
		 hint(user,s,b);
		 if(isEnd(s))
		 {
			 System.out.println("Game Over");
			 System.exit(0);
			 
		 }
	 }
	 //��Ʈ
	 static void hint(int[] user,int s,int b)
	 {
		 System.out.printf("Input Number:%d%d%d,Result:%dS-%dB\n",user[0],user[1],user[2],s,b);
	 }
	 static boolean isEnd(int s)
	 {
		 boolean bCheck=false;
		 if(s==3)
			 bCheck=true;
		 
		 return bCheck;
	 }
	 //����
	 static void process() {
		 int[] com=getRand(3);
		 int[] user=userInput();
		
		 compare(com,user);
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
	
		

	}

}
