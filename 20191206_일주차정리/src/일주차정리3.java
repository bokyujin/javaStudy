/*
 *  데이터 처리
 *  연산자
 *  	단항
 *  		*증감연산자 (++,--)
 *  		*부정연산자 (!) =>조건문(if,while,for) => true/false
 *  		*type연산자(데이터형)=>형변환
 *  		 int =>(int)10.5 =>10
 *  		 char =>(char)65 =>'A'
 *  		 =>int이하는 연산처리시 int
 *  	이항
 *  		*산술연산자(+,-,*,/,%)
 *  		 / (0으로 나눌 수 X, 정수/정수=정수)
 *  		 % (나머지=왼쪽 부호를 따라감)
 *  		*비교연산자(==,!=,<,>,<=,>=) =>true/false
 *  		*논리연산자(&&,||)=>두개의 조건을 가지고 연산처리 => 효율적인 연산-&&(||):왼쪽이 false(true)이면 오른쪽 수행X
 *  		*대입연산자 (=) , 복합대입연산자(+=,-=):for,값누적시 많이 사용
 *  	삼항연산자(?:) => (조건)?참값:거짓값   =>if~else
 *  		
 *  
 */
public class 일주차정리3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		i+=2;
		System.out.println(i);
		

	}

}
