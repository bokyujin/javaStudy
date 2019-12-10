/*
 * 자바에서 제공하는 특수문자
 * 1. \n =>newLine=>System.out.println()
 * 2. \t =>tab =>일정간격
 * 3. \" =>" =>따음표 출력(인용부호)
 * 
 * 출력형식
 * 홍길동
 * 심청이
 * System.out.println("홍길동")
 * System.out.println("심청이")
 * 
 * 홍길동 심청이
 * System.out.print("홍길동\t");
 * System.out.print("심청이");
 * 
 * 서식이 있는 출력 =>JDK 1.5버전 이후
 * 1) %d	=>정수출력 
 * 	  System.out.printf("%d%d%d",100,90,60); =>1009060
 *    System.out.printf("%5d%5d%5d",100,90,60); =>--100---90---60 (-:공백) 
 *    											  =====5
 *    System.out.printf("%-5d%-5d%-5d",100,90,60); =>100--90---60--- (-:공백)
 *    **양수:오른쪽정렬/ 음수:왼쪽정렬
 *    
 *    System.out.printf("%-10.2f%-10.2f%-10.2f",99.9999,80.88,60.6666);
 *    **10자리중 소수점아래는 2자리만 출력
 *    
 * 2) %f	=>실수출력
 * 3) %c	=>문자출력
 * 4) %s	=>문자열출력
 * 
 * System.out.printf();
 * 이름      국어  영어   수학   총점
 * 홍길동   90  90  90 270
 */
public class __일주차정리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.printf("%5d%5d%5d",100,90,60);
	   System.out.println();
	   System.out.printf("%-5d%-5d%-5d\n",100,90,60);
	   
	   System.out.printf("%-10.2f%-10.2f%-10.2f\n",99.9999,80.88,60.6666);
	   
	   System.out.printf("%2c%2c%2c\n",'A','B','C');
	   System.out.printf("%6s%6s%6s\n","Hello","Java","!!");
	   
	   System.out.printf("%7s%5d%5d%5d%7.2f%c\n","홍길동",90,80,60,80.000,'B');

	}

}
