/*
 * 		String : 문자열저장
 * 		======
 * 		기능 : 문자열분리-substring()
 * 		/문자찾기 -indexOf() ,lastIndexOf()
 * 		/문자비교 -equals()		//대소문자구분
 * 			   -equalsIgnoreCase()	//대소문자 구분없는경우
 * 		/공백문자제거-trim()  =>좌우 공백 제거(중간 공백 제거  X)
 * 		/대소문자변경-toUpperCase() , toLowerCase()
 * 		/모든데이터형을 문자열로변경- valueOf()
 * 		/문자의 갯수-length()
 * 		/변경-replace, replaceAll
 * 
 * 		String ==> char[]
 */
public class 문자열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java!!";
//				  01234567891011
		System.out.println("글자수:"+s.length());    //공백도 문자
		System.out.println(s.substring(0,5));	  //5는 제외
		
		System.out.println(s.replace("l","k")); //l을k로 변경
		System.out.println(s.toUpperCase()); //대문자
		System.out.println(s.toLowerCase()); //소문자
		
//		System.out.println(s); //원본그대로 유지
//		
//		System.out.println(s=s.toUpperCase());	//원본변경
//		System.out.println(s);
//		
		
		System.out.println(s.indexOf("l"));			// 앞에서부터 찾음. =2
		System.out.println(s.lastIndexOf("l"));		// 뒤에서부터 찾음. =3
		
		String s1="Hello";
		String s2="Hello";
		
		String res=s1.equals(s2)?"같다":"다르다";
		System.out.println(res);
		
		
	}

}
