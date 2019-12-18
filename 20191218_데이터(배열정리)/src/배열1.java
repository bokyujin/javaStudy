/*
 * 1.��� ���
 * 	 �迭 => Ŭ���� => ��Ű�� => ���̺귯��(jar)
 *  ===
 *  
 *  ���α׷�
 *  	������+��ɹ� (�޼ҵ�)	=>Ŭ����
 *  	Ŭ���� ������ => ���� => ���α׷� /(�ڹ�CBD)
 *		
 * 2.�ڹ�=>����Ŭ=> html(CSS,JavaScript)=>JSP =>MVC=>Spring=>  Kotlin(�����)
 * 	 			=========================   ============	============>����
 * 						front  				    back			
 * 	*�迭���� : ����� �޸� ũ�� ������ (������)	/=> ������(ArrayList)
 *   		 ���� ���������� ��Ƽ� ����ؾ���
 *  	����� => �޸� ũ�⸦ ����
 *  	===================
 *  	1)����
 *  	   int[] arr;
 *  	   ===	 ===
 *  	  ��������      �迭��(���� ����� �������� �ּ�)
 *  	 		 	  ======heap����
 *  	2)�ʱ�ȭ 	
 *  	  arr={1,2,3,4,5}
 *  	  arr=new int[5]	=>�޸� ���� �Ҵ� (���߿� ������ ����)
 *  	3)���� �б�, ���� => �ε���
 *  	  int arr={10,20,30,40,50};
 *  	  			  
 *  	  arr		  arr[0] arr[1] arr[2] ....������=>for��
 *  	========	   ==============================
 *  	  100			10	   20	 30	   40	 50
 *   	========	  |==============================
 * 					 100(�ּ�)  
 * 		**arr[0] - �Ϲݺ����� ����
 * 					ex) arr[0]=10
 */		
//�޷� 
/*
 * 1) �⵵, �� �Է� �ޱ�
 * 2) 1���� ���� �������� Ȯ��
 * 3) ��������¥ Ȯ��
 * 4) ���
 * 
 */
import java.util.*;
import java.text.*;
public class �迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�⵵, �� �Է�
		Scanner scan= new Scanner(System.in);
		System.out.print("�⵵ �Է�:");
		int year=scan.nextInt();
		System.out.print("�� �Է�:");
		int month=scan.nextInt();
		
		System.out.println("\n"+year+"�� "+month+"��");
		System.out.println("\n");
		char[] strweek= {'��','��','ȭ','��','��','��','��'};
		for(int i=0;i<7;i++)
		{
			System.out.print(strweek[i]+"\t");
		}
		System.out.println();
		
		//1������ ���� Ȯ��
		//���⵵ 12��31�ϱ����� ���ձ��ϱ�
		int total=(year-1)*365
				+(year-1)/4 -(year-1)/100 +(year-1)/400;
		//���ޱ����� �� ���ϱ�
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0)&&(year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
	
		// +1	=>%7	=>���ϱ��ϱ�
		total++;		//�� ���� 1����
		
		int week=total%7;
				
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
					System.out.print("\t");
			}
			System.out.printf("%d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		
		
		
		
		

	}

}
