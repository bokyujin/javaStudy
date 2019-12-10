package 데이터저장;
/*
 * 이름, 성별,  나이,주소,전화,이메일 =>존재(true),비존재(false)
 * 	   (남/여)
 */

public class 변수문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String 이름="유진",주소="부천시 원미구",전화="010-3038-5573";
		char 성별='여';
		int 나이=26;
		Boolean 이메일=true;
		
		System.out.println(이름+"\n"+성별+"\n"+나이);
		System.out.println(주소);
		System.out.println(전화);
		System.out.println(이메일);
		
	}

}
