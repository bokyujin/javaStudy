//1,2 =>�����߻�=> Ȧ��(1),¦��(2)?
import java.util.Scanner;

public class ���׿�����_�񱳿�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random() =>0.0~0.99 *2 =>0.0~1.99 =>(int)=> 0~1 =>+1=> 1~2
		int com=(int)(Math.random()*2)+1;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("�Է�(Ȧor¦):");
		String input = scan.next();
		
		String result=com%2==0?"¦":"Ȧ";
		
//		String dap=input==result?"����":"����";
		String dap=input.equals(result)?"����":"����";
		System.out.println("com="+com+"\n"+"dap="+dap);
		
		

	}

}
