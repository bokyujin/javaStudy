/*
 * 
 */
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a--; //후치연산 => a=a+1 =>a=10+1
		a--;
		a--;
		System.out.println("a="+a);
		
		int b=10;
		--b;
		--b;
		--b;
		System.out.println("b="+b);
		
		int c=10;
		int d=c--;
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		int e=10, g=--e;
		System.out.println("e="+e);
		System.out.println("g="+g);
		
		

	}

}
