/*
 *  ���ǹ�
 *  = ���� ���ǹ�
 *  	1)���� : if(���ǹ�)
 *  			  ���๮��
 *  
 *  		   if(���ǹ�) => �Ѱ��̻��� ���๮���� �ִ°�� {}
 *  			{ 
 *  			    ���๮��1
 *  			    ���๮��2 
 *  			}
 *  
 *  		   if(���ǹ�)
 *  			���๮��1 => if�Ҽӹ��� (����O)
 *  			���๮��2 => if�� ���� X(����X)
 *  	2)���ǹ� ó�� ���
 *  	  ====true/false =>����,��,�� ������
 *  	3)����=>������true=>�������
 *  	 	      ������ false=>�������X
 *  	
 *  = ���� ���ǹ�
 *  = ���� ���ǹ�
 *  
 */
// ������ �Է� �޾Ƽ� =>Ȧ��/¦��
/*
 *  1)�ڹٿ��� ������ ������ �κ�
 *  	1.import (���̺귯�� Ŭ���� ������ ��) =>java.lang(System,String,Math...)
 *  	2.return => ��� �޼ҵ�� return�� �������ִ�
 *  	3.��� => ��� Ŭ����(���������)�� Object���
 *  	4.����ó�� =>��� Ŭ������ ����ó���� ������ �ִ�
 *  	  =====
 *  	     ������ ���Ḧ �����ϰ� ������¸� ����(�̸� ������ �����ϴ� ���α׷�)
 */
import java.util.Scanner;		
//�ΰ� �̻� �ҷ��� �� :util.*	//import=>�̸̹������ Ŭ���� �ҷ��ö� ���
//CBD => ������Ʈ ���̽�
//������ ���α׷� 
public class ���_���ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		
		if(num%2==0)
			System.out.println(num+"��(��) ¦���Դϴ�");
		if(num%2!=0)
			System.out.println(num+"��(��) Ȧ���Դϴ�");
		
	}

}
