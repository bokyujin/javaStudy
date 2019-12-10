
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=a++;
		int c=++a;
//		    a=12 / b=10 / c=12
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		char ch='A';	
		System.out.println(ch++);		//=>A (출력하고 증가)
		System.out.println(++ch);		//=>C (증가하고 출력)
		
		int i=10;
		int j=i++ + i++ + ++i + ++i + i++ + i++ +i-- + --i;
		System.out.println(j);
		int result=10+11+13+14+14+15+16+14;
		System.out.println(result);
		
		int x=10;
		int y=9;
		
		////증감연산자가 수행되지 않는 경우////
//		=====================================================================================
		boolean bCheck =(x<y)&&(++y==x); 		//=>&&의 왼쪽이 false이기 때문에 오른쪽을 연산하지 않음
		System.out.println(bCheck);				//  and는 왼쪽이 false면 오른쪽 연산X
		System.out.println("x="+x);				//  or는 왼쪽이 true면 오른쪽 연산 X
		System.out.println("y="+y);
//		======================================================================================
		
//		증감연산자 =>반복문
//		! => 부정연산자 =>boolean형 => 조건문
		
	}

}
