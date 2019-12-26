import java.util.regex.Pattern;

public class 메소드5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기";
		//           0 1234567891111111
//								0123456
		//문자 개수	=> 공백포함
		System.out.println("문자의 개수:"+data.length());
		//substring(0)매개변수1개=0부터 문장끝까지, substring(2,3)매개변수2개
		
//		String fData=data.substring(0,16);
		String fData=data.substring(0,data.indexOf("!"));		//indexOf()==찾는 문자 위치
		System.out.println(fData);
		
//		String fData=data.substring(18);
		String lData=data.substring(data.indexOf("!")+1);		//인스턴스 메소드(변수명으로 접근) data.substring()
		System.out.println(lData.trim());
									
//		================================================================
//		문자열 결합
		int a=10;
		int b=20;
		double d=10.5;
		//102010.5	==>번호만들때==201912231,201912232,...
		String sss=a+""+b+""+""+d;
		System.out.println(sss);
		sss=String.valueOf(a)+String.valueOf(b)+String.valueOf(d);	//모든 데이터형을 문자형으로 변환 :valueOf()
		//static메소드(클래스명으로 접근)==String.valueOf()
		System.out.println(sss);
		
		
	}

}
