/*
 * �ڹٿ��� �����ϴ� Ư������
 * 1. \n =>newLine=>System.out.println()
 * 2. \t =>tab =>��������
 * 3. \" =>" =>����ǥ ���(�ο��ȣ)
 * 
 * �������
 * ȫ�浿
 * ��û��
 * System.out.println("ȫ�浿")
 * System.out.println("��û��")
 * 
 * ȫ�浿 ��û��
 * System.out.print("ȫ�浿\t");
 * System.out.print("��û��");
 * 
 * ������ �ִ� ��� =>JDK 1.5���� ����
 * 1) %d	=>������� 
 * 	  System.out.printf("%d%d%d",100,90,60); =>1009060
 *    System.out.printf("%5d%5d%5d",100,90,60); =>--100---90---60 (-:����) 
 *    											  =====5
 *    System.out.printf("%-5d%-5d%-5d",100,90,60); =>100--90---60--- (-:����)
 *    **���:����������/ ����:��������
 *    
 *    System.out.printf("%-10.2f%-10.2f%-10.2f",99.9999,80.88,60.6666);
 *    **10�ڸ��� �Ҽ����Ʒ��� 2�ڸ��� ���
 *    
 * 2) %f	=>�Ǽ����
 * 3) %c	=>�������
 * 4) %s	=>���ڿ����
 * 
 * System.out.printf();
 * �̸�      ����  ����   ����   ����
 * ȫ�浿   90  90  90 270
 */
public class __����������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.printf("%5d%5d%5d",100,90,60);
	   System.out.println();
	   System.out.printf("%-5d%-5d%-5d\n",100,90,60);
	   
	   System.out.printf("%-10.2f%-10.2f%-10.2f\n",99.9999,80.88,60.6666);
	   
	   System.out.printf("%2c%2c%2c\n",'A','B','C');
	   System.out.printf("%6s%6s%6s\n","Hello","Java","!!");
	   
	   System.out.printf("%7s%5d%5d%5d%7.2f%c\n","ȫ�浿",90,80,60,80.000,'B');

	}

}
