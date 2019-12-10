/* if 수행문장의 범위
 * 
 * 	if(조건문)
 * 		실행문장1 =>if 소속문장
 * 		실행문장2 =>if와 관련 없는 문장 =>true/false와 관련없이 무조건 수행하는 문장
 * 	=> 자바에서 모든 제어문은 ({}이 없는 경우에)한 문장만 수행한다.
 * 
 *  => 가독성, 최적화(리펙토링) ,마이그레이션(Spring =>SpringBoot)
 *  	
 * 
 */
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		// 여러개의 문장을 동시에 제어할때 사용하는 조건문
		if(num%2!=0)
		{
			int b=100;									// b=>지역변수 (블록안에서만 사용하는 변수)
			System.out.println("b는"+b+"입니다");
			System.out.println(num+"는 짝수입니다");
			System.out.println("프로그램 종료");
			b++;
		}
	
		
	}

}