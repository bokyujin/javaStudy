//알파벳 =>저장=>대문자/소문자?

public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha='1';
		//사이, 기간=>&&
		//연산자=>char는 모든 연산시 정수로 변환(자동형변환)
		if(alpha>='A'&&alpha<='Z')
			System.out.println(alpha+"는 대문자 입니다");
		if(alpha>='a'&&alpha<='z')
			System.out.println(alpha+"는 소문자 입니다");

	}

}
