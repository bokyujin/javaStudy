import java.util.Calendar;
import java.util.Scanner;

//�⵵,���Է�
//

public class �޷� {
	//���� ��¥ ���
	static void today() {
		char[] strWeek= {'��','��','ȭ','��','��','��','��'};
		  Calendar cal=Calendar.getInstance();
		  int y=cal.get(cal.YEAR);
		  int m=cal.get(cal.MONTH)+1;
		  int d=cal.get(cal.DATE);
		  int w=cal.get(cal.DAY_OF_WEEK);
		  System.out.println("======"+y+"�� "+m+"�� "+d+"�� "+strWeek[w-1]+"����======");	 
	}
	//�⵵or�� �Է�
	static int input(String msg) {
		Scanner scan= new Scanner(System.in);
		System.out.print(msg);
		int year=scan.nextInt();
		return year;		
	}
	// ����
	static int getWeek(int year,int month) {
		int total=(year-1)*365
				+(year-1)/4 -(year-1)/100 +(year-1)/400;
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0)&&(year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		total++;		
		
		int week=total%7;
		
		return week;
	}
	
	//���
	static void datePrint(int month, int week) {
		char[] strWeek= {'��','��','ȭ','��','��','��','��'};
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		
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
	
	//����
	static void process() {
		today();
		int year=input("�⵵ �Է�:");
		int month=input("�� �Է�:");
		System.out.println(year+"��"+month+"��");
		System.out.println();
		
		int week=getWeek(year,month);
		datePrint(month,week);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();

	}

}
