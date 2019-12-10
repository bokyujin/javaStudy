package 데이터저장;
// 변수 => 한개의 데이터를 저장하는 메모리 이름
public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10; //10진법
		int b=010; //8진법
		int c=0xA; //16진법
		int d=0b1010; //2진법 
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		float f=10.5f;
		System.out.println("f="+f);
		
		double d2=10.5;
		System.out.println("d2="+d2);
		
		//	문자열 결합
		//	ex)7+""+7 =>77
		//	77+""+77+""+7+1 => 777771
		//  77+""+77+""+(7+1) => 77778
		boolean bcheck=true;
		System.out.println("bcheck="+bcheck);
		
		char ch='K';
		System.out.println("ch="+c);
		
		String name = "홍길동";
		System.out.println("name="+name);
		
		byte bb=Byte.MAX_VALUE;
		short ss=Short.MAX_VALUE;
		int ii=Integer.MAX_VALUE;
		long ll=Long.MAX_VALUE;
		System.out.println("bb="+bb);
		System.out.println("ss="+ss);
		System.out.println("ii="+ii);
		System.out.println("ll="+ll);
	}

}
