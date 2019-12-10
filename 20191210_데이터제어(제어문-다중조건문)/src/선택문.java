import java.util.Scanner;

/*
 * 	Switch-case
 * 
 *  ���ù� : �Ѱ��� ���� �޾Ƽ� ó��(�ѹ��� ���� =>break)
 *  	     ����,��Ʈ��ũ ...
 *  ����) switch(��) ==> ��: ����,����,���ڿ�
 *  			   1�Է½� ó�� 123 ��� ����/ 1�� ó���Ϸ��� ó��1�Ŀ� break�ɾ������
 *  	=> switch(����)
 *  	  {		 ====
 *  		case 1:
 *  			ó��1
 *  		case 2:
 *  			ó��2
 *     		case 3:
 *  			ó��3
 *  		default:
 *  			ó�� 			=> (default~ó�� =>��������)
 *  	  }
 */
//		����if<=>switch
//		=> Servlet <=> JSP =>MVC =>Ʋ(Spring)
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° ����:");
		int num1=scan.nextInt();
		System.out.print("�ι�° ����:");
		int num2=scan.nextInt();
		System.out.print("������(+,-,*,/):");
		String op=scan.next();
		
		//ó��
		switch(op)
		{
		case "+":
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			break;
		case "/":
			if (num2==0)
				System.out.println("0���� ���� �� �����ϴ�!");
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,(double)num1/num2);
			break;
		default:
		}
		

	}

}
