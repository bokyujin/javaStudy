import java.util.Scanner;

/*
 * 	�迭 => �ϰ�ó�� ������ ��
 * 	�⵵ ���� �Է¹޾Ƽ� ���� ������ ��¥ ���
 * 
 *  31 28(29) 31 30 31 30 31 31 30 31 30 31 
 *  
 */
public class �迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan= new Scanner(System.in);
		 
		 System.out.println("�⵵ �Է�:");
		 int year=scan.nextInt();
		 System.out.println("�� �Է�:");
		 int month=scan.nextInt();
//		 
//		 int lastDay=0;
//		 if(month==4||month==6||month==9||month==11)
//			 lastDay=30;
//		 else if(month==2)
//		 {
//			 if((year%4==0&&year%100!=0)||(year%400==0))
//				 lastDay=29;
//			 else
//				 lastDay=28;
//		 }
//		 else
//			 
//			 lastDay=31;
//		 
//		 System.out.println("������ ��¥:"+lastDay);
//		 ==========================================================
//		 Swith case
		 
//		int lastDay=0;
//		 switch(month)
//		 {
//		 case 4: 
//		 case 6: 
//		 case 9:
//		 case 11:
//		 {
//			 lastDay=30;
//			 break;
//		 }		
//		 case 2:
//		 {
//			 if((year%4==0&&year%100!=0)||(year%400==0))
//				 lastDay=29;
//			 else
//				 lastDay=28;
//			 break;
//		 }
//		  default:
//			  lastDay=31;
//		 }
//			  
//		System.out.println("������ ��¥:"+lastDay);
//			 
			 
//		 �迭 ���
		 
		 int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		 
		 if((year%4==0&&year%100!=0)||(year%400==0))
			 {
			 lastDay[1]=29;}
		 else
			 lastDay[1]=28;
			 System.out.println(month+"���� ������ ��¥:"+lastDay[month-1]);
		 
		 
		 
			 
		
		
		

	}

}