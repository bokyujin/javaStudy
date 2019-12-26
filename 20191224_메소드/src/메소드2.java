import java.util.Scanner;

//call by reference(주소)=>배열,클래스		==>call by value보다 속도 빠름
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
 * aa.a	=1000		.=>주소접근
 */
public class 메소드2 {
	static void swap(int[] arr)
	{
		System.out.println("변경전=>swap:arr[0]="+arr[0]+",arr[1]="+arr[1]);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("변경후=>swap:arr[0]="+arr[0]+",arr[1]="+arr[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드2 a=new 메소드2();
		메소드2 b=new 메소드2();
		메소드2 c=new 메소드2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	//메모리 주소
		
		int[] arr= {100,200};
		swap(arr);	//주소 전송(원본)
		System.out.println("main:arr[0]="+arr[0]+",arr[1]="+arr[1]);
		
		for(int i=0;i<10;i++)
		{
			Scanner scan=new Scanner(System.in);
		}			//=>메모리10개생성
		
		}

	}

