import java.util.Scanner;

//call by reference(�ּ�)=>�迭,Ŭ����		==>call by value���� �ӵ� ����
/*
 * class A
 * {
 * 		int a=10;
 * }
 * swap(A aa)
 * {
 *  	aa.a=1000;
 * }
 * A aa=new A();
 * swap(aa)
 * aa.a	=1000		.=>�ּ�����
 */
public class �޼ҵ�2 {
	static void swap(int[] arr)
	{
		System.out.println("������=>swap:arr[0]="+arr[0]+",arr[1]="+arr[1]);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("������=>swap:arr[0]="+arr[0]+",arr[1]="+arr[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�޼ҵ�2 a=new �޼ҵ�2();
		�޼ҵ�2 b=new �޼ҵ�2();
		�޼ҵ�2 c=new �޼ҵ�2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	//�޸� �ּ�
		
		int[] arr= {100,200};
		swap(arr);	//�ּ� ����(����)
		System.out.println("main:arr[0]="+arr[0]+",arr[1]="+arr[1]);
		
		for(int i=0;i<10;i++)
		{
			Scanner scan=new Scanner(System.in);
		}			//=>�޸�10������
		
		}

	}

