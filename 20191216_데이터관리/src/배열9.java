import java.util.Scanner;

/*
 * 5���� ������ �޾Ƽ�   �ִ�, �ּҰ�...
 */

public class �迭9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int num[]=new int[5];
	
		
		for(int i=0;i<5;i++)
		{
			System.out.println((i+1)+"��° �����Է�:");
			num[i]=(int)(Math.random()*100)+1;
		}
		int max=num[0], min=num[0];			
		
		for(int i:num)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		
		for(int i:num)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("max:"+max);
		System.out.println("min:"+min);

				
		}

	}


