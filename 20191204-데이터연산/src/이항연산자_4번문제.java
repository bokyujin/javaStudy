import java.util.*;

public class ���׿�����_4������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--�Է�--");
		System.out.print("Input name:");
		String name=scan.next();
		System.out.print("kor:");
		int kor=scan.nextInt();
		System.out.print("eng:");
		int eng=scan.nextInt();
		System.out.print("mat:");
		int mat=scan.nextInt();
		
		int total= kor+eng+mat;
		double avg=total/3.0;
		
		System.out.println("\n\n--���--");
		System.out.println("�̸�:"+name+"\n"+"�հ�����:"+total+"��");
		System.out.printf("�������:%.1f",avg);
		
		


	}

}
