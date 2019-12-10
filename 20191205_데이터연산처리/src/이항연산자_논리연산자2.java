/*
 * 형변환 (boolean제외)
 * up c>='A'    => c>=65		=>char 를 연산처리시 int로 바뀜 , char/short/byte=>연산=>int
 * down(강제 형변환)  int=>char
 * 				  double=>int 
 */
public class 이항연산자_논리연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 결과값=>boolean
		
		boolean b1=(6<7)&&(7==7);
		System.out.println("b1="+b1);
		
		boolean b2 = (6>7)&&(7==7);
		System.out.println(b2);
		
		

	}

}
