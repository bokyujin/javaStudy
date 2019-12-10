//1,2 =>난수발생=> 홀수(1),짝수(2)?
import java.util.Scanner;

public class 이항연산자_비교연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random() =>0.0~0.99 *2 =>0.0~1.99 =>(int)=> 0~1 =>+1=> 1~2
		int com=(int)(Math.random()*2)+1;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("입력(홀or짝):");
		String input = scan.next();
		
		String result=com%2==0?"짝":"홀";
		
//		String dap=input==result?"정답":"오답";
		String dap=input.equals(result)?"정답":"오답";
		System.out.println("com="+com+"\n"+"dap="+dap);
		
		

	}

}
