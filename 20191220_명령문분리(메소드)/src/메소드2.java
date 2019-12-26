/*
 * 정수 1개 입력받아서 2진법출력
 * 16비트
 * 0000 0000 0000 1010
 */
import java.util.Scanner;
public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		// 변수
			
		System.out.print("정수입력:");
		int input=scan.nextInt(); 		//사용자 입력값을 받는 변수
//		System.out.println(Integer.toBinaryString(input));	=>2진법 함수
		
		int[] binary=new int[16];		//0000000000000000
		//배열의 위치 
		int index=15;	//배열=>값 변경=>위치(앞(0),뒤(length-1))
		
		while(true)
		{
			binary[index]=input%2;
			input/=2;
			if(input==0)
				break;
			index--;			
		}
		
		//출력
		for(int i=0;i<16;i++)
		{
			if(i%4==0&&i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		
		
		

	}

}
