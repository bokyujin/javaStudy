import java.util.Scanner;

//���� ���� ���� ������ �޾Ƽ�
// ����,���,���� ����ϴ� �޼ҵ�
/*
 * 1.�Է� static int[] input()
 * 2.���� static int total(int[])
 * 3.��� static double[] avg(int total)
 * 4.���� static char score(double a)
 * 5.��� static void print(int[],int tatal,double a,char score)
 */
public class �޼ҵ�10 {
	//�Է�
	static int[] input() {
		Scanner scan=new Scanner(System.in);
		int[] score=new int[3];
		String[] msg= {"����","����","����"};
		
		for(int i=0;i<3;i++)
		{
			System.out.print(msg[i]+"����:");
			score[i]=scan.nextInt();
		}
		return score;
	}
	//����
	static int total(int[] score)
	{
		return score[0]+score[1]+score[2];
	}
	//���
	static double avg(int total)
	{
		return total/3.0;
	}
	//����
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
	//���
	static void print(int[] score,int total,double avg,char c)
	{
		System.out.printf("%d %d %d %d %.2f %c\n",score[0],score[1],score[2],total,avg,c);		
		
	}
	//����
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
