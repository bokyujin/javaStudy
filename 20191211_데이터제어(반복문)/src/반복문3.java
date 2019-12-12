//가위바위보 ==>5번 => 승패무 횟수
import java.util.Scanner;
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * com-user 
		 * 가위(0)-가위(0)=0
		 * 		   바위(1)=-1
		 * 		   보(2)=-2
		 * 바위(1)-가위(0)=1
		 * 		   바위(1)=0
		 * 		   보(2)=-1
		 * 보(2)-가위(0)=2
		 * 		   바위(1)=1
		 * 		   보(2)=0
		 * 사용자 win=-1,2 /lose=1,-2/same=0
		 * 
		 */
		int i=1;
		int win=0, lose=0, same=0;
		
		Scanner scan=new Scanner(System.in);
		
		while(i<=5)
		{
			//가위 바위 보
			//컴퓨터=> 가위바위보
			int com=(int)(Math.random()*3);		//0~2
			//사용자=> 입력
			System.out.print("가위(0),바위(1),보(2):");
			int user=scan.nextInt();
			System.out.println("컴퓨터:"+com);
			//비교
			int res=com-user;
			
				
//			if(res==-1||res==2)
//				win++;
//			else if(res==1||res==-2)
//				lose++;
//			else
//				same++;
			
			switch(res)
			{
			case -1:
			case 2:
			{
				System.out.println("승!");
				win++;
				break;
			}
			case 1:
			case -2:
			{
				System.out.println("패");
				lose++;
				break;
			}
			default: 
			{
				System.out.println("무");
				same++;
			}
			
			}
			
			i++;
		}
		
		//승 무 패
		System.out.printf("사용자 전적:%d승 %d무 %d패",win,same,lose);
		

	}

}
