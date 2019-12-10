
public class 이항연산자_1번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money=65430;
		
		int h10000=money/10000;
		int h1000=(money%10000)/1000;
		int h100=(money%1000)/100;
		int h10=(money%100)/10;
		
		System.out.println("만원="+h10000);
		System.out.println("천원="+h1000);
		System.out.println("백원="+h100);
		System.out.println("십원="+h10);

	}

}
