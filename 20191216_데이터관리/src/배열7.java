import java.util.Scanner;

// 5개의 정수를 입력받아서 => 5개 정수 출력 => 합,평균
public class 배열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		// 5개의 정수 저장하는 공간 만들기
		int[] num=new int[5];
		//총점 저장하는 변수
		int total=0;
		//평균 저장
		double avg=0.0;
		
		//정수 5개 입력
		for(int i=0;i<num.length;i++)
		{
			System.out.print((i+1)+"번째 정수 입력:");
			num[i]=scan.nextInt();
		}
		//출력
		for(int score:num)
		{
			total+=score;
		}
		avg=total/(double)num.length;
		
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		
		

	}

}
