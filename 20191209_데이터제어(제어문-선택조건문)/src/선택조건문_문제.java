
//년,월,일 입력해서 요일출력
//윤년확인
//1년1월1일=월요일
/*
 * 1월-31일/2월-28일(윤년=29일)/3월-31일/4월-30일/5월-31일/6월-30일/7월-31일/8월-31일/9월-30일/10월-31/11월-30/12월-31
 * 전년도합+전달까지합+day
 * 
 * 
 */

import java.util.Scanner;
public class 선택조건문_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도입력:");
		int year=scan.nextInt();
		System.out.print("월입력:");
		int mon=scan.nextInt();
		System.out.print("일입력:");
		int day=scan.nextInt();
		
		//전년도까지의 합
		int total=(year-1)*365+(year-1)/4+(year-1)/100+(year-1)/400;
		//전달까지의 합
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		if ((year%4==0 && year%100!=0)||(year%400==0))
			{
			lastDay[1]=29;
			}
		else
			{
			lastDay[1]=28;
			}
		for(int i=0;i<mon-1;i++)
		{
			total+=lastDay[i];
		}
		total+=day;
		int week=total%7;
			
		//결과
		char strWeek='월';
		
		if(week==0)
			strWeek='일';
		if(week==1)
			strWeek='월';
		if(week==2)
			strWeek='화';
		if(week==3)
			strWeek='수';
		if(week==4)
			strWeek='목';
		if(week==5)
			strWeek='금';
		if(week==6)
			strWeek='토';
		
		System.out.println(year+"년도"+mon+"월"+day+"일은 "+strWeek+"요일 입니다");
	}

}
