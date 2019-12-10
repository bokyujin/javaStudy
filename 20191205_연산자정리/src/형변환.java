/*
 * 	자동 형변환 =>int+double=>double
 * 			 ====
 * 			 double로 변환
 * 			=>char+int=int 		(char c='A';
 * 			  ====				 c>='A' && c<='Z')
 * 			  int로 변환			 	===65     ===90  =>char는 연산시 int로 변경
 * 			=>byte+byte=int (byte,short,char 연산시 int)
 * 	강제 형변환 : cast연산자
 *  ======= down (int=>char / double=>int)
 *  			  int a=65 => char b=(char)a;
 */
public class 형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c=65;
		System.out.println(c);

	}

}
