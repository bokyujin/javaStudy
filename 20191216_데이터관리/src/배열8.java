import java.util.Scanner;

/*
 * 3���� �л� => ����, ����, ���� ������ �Է¹޾Ƽ� => ���
 * ========================================
 * 80 80 80 240 B 80.0
 * 90 90 90 270 A 90.0
 * 70 70 70 210 C 70.0
 */
public class �迭8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		
		char[] score=new char[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"��° �л��� ���� ���� �Է�:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"��° �л��� ���� ���� �Է�:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"��° �л��� ���� ���� �Է�:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;	
			
			switch((int)avg[i]/10)
			{
			case 10:
			case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';				
			
			}
					
		}
		
		
		for(int i=0;i<3;i++)
		{
			System.out.printf((i+1)+"��° �л��� ����=����:%d��,����:%d��,����:%d��,����:%d��,����:%c��,����:%.2f\n"
							   ,kor[i],eng[i],math[i],total[i],score[i],avg[i]);
		}
			
		
		

	}

}
