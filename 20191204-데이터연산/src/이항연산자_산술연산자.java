/*
 * 산술연산자(+,_,*,/,%) : 다른 데이터형을 사용했을 경우
 * 		1) int 이하 데이터형(byte,short,char)=>연산처리->int
 * 		   byte+byte => int
 */
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		byte b=10;
//		byte c=20;
//		
//		int d=b+c;    //byte d=b+c;로 코딩하면  error남
//		byte e=(byte)(b+c);
		
//		byte a=120;
//		byte b=10;
//		byte c=(byte)(a+b);
//		System.out.println("a+b="+c);
		
		byte b=(byte)300;
		System.out.println("b="+b);
		System.out.println(Integer.toBinaryString(300));
		
		// 300의 2진법: 100101100
		// 뒤에서부터 8비트 저장 => 00101100 =44
		
		int a=10+20*3;
		System.out.println("a="+a);
		
		
	
	}	
}
