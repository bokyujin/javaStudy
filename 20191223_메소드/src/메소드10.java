import java.util.Scanner;

//국어 영어 수학 점수를 받아서
// 총점,평균,학점 출력하는 메소드
/*
 * 1.입력 static int[] input()
 * 2.총점 static int total(int[])
 * 3.평균 static double[] avg(int total)
 * 4.학점 static char score(double a)
 * 5.출력 static void print(int[],int tatal,double a,char score)
 */
public class 메소드10 {
	//입력
	static int[] input() {
		Scanner scan=new Scanner(System.in);
		int[] score=new int[3];
		String[] msg= {"국어","영어","수학"};
		
		for(int i=0;i<3;i++)
		{
			System.out.print(msg[i]+"점수:");
			score[i]=scan.nextInt();
		}
		return score;
	}
	//총점
	static int total(int[] score)
	{
		return score[0]+score[1]+score[2];
	}
	//평균
	static double avg(int total)
	{
		return total/3.0;
	}
	//학점
	static char hakjum(double avg)
	{
		char c='A';
		switch((int)(avg/10)) {
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
		
		return c;
	}
	//출력
	static void print(int[] score,int total,double avg,char c)
	{
		System.out.printf("%d %d %d %d %.2f %c\n",score[0],score[1],score[2],total,avg,c);		
		
	}
	//조립
	static void process() {
		int[]  score=input();
		int total=total(score);
		double avg=avg(total);
		char c=hakjum(avg);
		print(score,total,avg,c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
