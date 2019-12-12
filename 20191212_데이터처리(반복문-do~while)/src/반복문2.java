import java.util.Scanner;

/*
 * 	1) 3명의 학생 국어/수학/영어 점수 => 평균/총점/학점 출력
 * 
 */

public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int kor,eng,math,total,avg;
		String result="";
		int i=1;
		Scanner scan=new Scanner(System.in);
		
		do
		{
			System.out.printf("학생%d 국어점수 입력:",i);
			kor=scan.nextInt();
			System.out.printf("학생%d 영어점수 입력:",i);
			eng=scan.nextInt();
			System.out.printf("학생%d 수학점수 입력:",i);
			math=scan.nextInt();
			
			total=kor+eng+math;
			avg=total/3;
			
			char c='A';
			switch(avg/10)
			{
				case 10:
				case 9:
					c='A';
					break;
				case 8:
					c='B';
					break;
				case 7:
					c='C';
					break;
				case 6:
					c='D';
					break;
				default:
					c='F';				
			}
			result+=kor+" "+eng+" "+math+" "+total+" "+avg+" "+c+"\n";
			i++;
			
			
		}while(i<=3);
		
		System.out.println("국어 영어 수학 총점 평균 학점");
		System.out.println(result);

	}

}
