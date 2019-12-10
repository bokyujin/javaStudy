/*
 * 	&& => 직렬처리
 * 	|| 병렬
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		char c='a';
		
		//알파벳 저장 후 대/소문자 구분
//		String result=(c>='A'&&c<='Z')?"대문자":"소문자";
//		System.out.println(c+"는"+result);
		
		//대문자=>소문자 / 소문자=>대문자 변경
		
		char result=(c>='A'&& c<='Z')?(char)(c+32):(char)(c-32);
		System.out.println(c+"는"+"\t"+result);
		
		

	}

}
