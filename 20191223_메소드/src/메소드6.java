import java.util.Scanner;
public class 메소드6 {
	//중복없는 난수 발생
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
	//사용자 입력
	 static int[] userInput()
	 {
		 int[] user=new int[3];
		 Scanner scan=new Scanner(System.in);
		 while(true)
		 {
			 System.out.print("3자리 정수 입력:");
			 int input=scan.nextInt();
			 if(input<100||input>999)
			 {
				 System.out.println("잘못된 입력입니다.다시 입력하세요");
				 continue;
			 }
			 user[0]=input/100;
			 user[1]=(input%100)/10;
			 user[2]=input%10;
			 
			 if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			 {
				 System.out.println("중복된 수는 사용할 수 없습니다.");
				 continue;
			 }
			 if(user[0]==0||user[1]==0||user[2]==0)
				{
				 System.out.println("0은 사용할 수 없습니다.");
				 continue;
				}
			 break;
			 	
		 }
		 return user;
	 }

	 //비교
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
	 //힌트
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
	 //조립
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
