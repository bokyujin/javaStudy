import java.util.Scanner;

/*
 * while문 => 무한루프 : while(true)		=>더 많이 씀
 * for문	  => 무한루프 : for(;;)
 * 
 * 반복문을 제어하는 문장
 * ========
 * => continue : 특정내용을 제외
 * => break	: 반복문을 종료
 * 
 */
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while => 1~사용자 입력값 까지의 짝수의 합, 홀수의 합, 총 합을 구해서 출력
		Scanner scan= new Scanner(System.in);
		int i =1;
		int total=0,sum1=0,sum2=0;
		
		System.out.print("정수 입력:");
		int user=scan.nextInt();
		
		while(i<=user)
		{
			total+=i;
			if(i%2==0)
				sum1+=i;
			if(i%2!=0)
				sum2+=i;
			i++;
		}
		
		System.out.printf("1~%d까지의 짝수의 합=%d\n",user,sum1);
		System.out.printf("1~%d까지의 홀수의 합=%d\n",user,sum2);
		System.out.printf("1~%d까지의 총 합=%d",user,total);

	}

}
