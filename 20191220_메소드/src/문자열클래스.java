// String : 문자열을 제어 
/*
 *  java.lang =>import 생략가능
 *  문자열을 저장하는 방법
 *  	1) String 변수명="Hello Java";
 *  	2) String 변수명=new String("Hello Java");	//같은 문자열을 별도로 저장
 *  				   === 새로운 메모리에 저장
 *  String에서 제공하는 기능
 *  	1) equals : 저장된 문자열 같은지 여부확인 (true/false)
 *  		ID,PWD =>로그인(대소문자 구분)
 *  		문자열은==을 사용하면 안됨
 *  		String s="Hello";
 *  		String s1="Hello";
 *  		String s2=new String("Hello");
 *  		if(s==s1) =>true
 *  		if(s==s2) =>false
 *  		if(s.equals(s2)) =>true
 *  	   =>원형
 *  		boolean equals(String data)  		
 *  	2) substring : 문자열을 자를때
 *  		String s="0123456789";
 *  		substring(3);	=>"3456789" (3번째글자부터 마지막글자까지)
 *  		String s="112분, 15세 이상 관람가"
 *  		substring(0,3)	=>"112"	(0번째 글자부터 2번째 글자까지)
 *  					==end-1 			   ===
 *  		//substring(int start)
 *  		//substring(int start,int end)  		
 *  	3) length : 문자열 개수
 *  		String s="Hello 홍길동"; =>9
 *  	4) trim : 좌우의 공백문자 제거
 *  		String s="Hello Java";
 *  			=>s.trim().length ==>10
 *  	5) startsWith,endsWith
 *  		startsWith("자바")=>자바로 시작하는 데이터 찾기
 *  		endsWith("자바") =>자바로 끝나는 데이터 찾기
 *  	6) indexOf,lastIndexOf
 *  		문자의 위치(indexOf:앞에서/lastIndexOf:뒤에서)
 *  		String s="Hello Java";
 *  				  0123456789
 *  		s.indexOf('a')		==>7
 *  		s.lastIndexOf('a')	==>9	//확장자가져올 때=lastIndexOf(.jpg)
 *  	7) split
 *  		String s="이병헌, 하정우, 마동석, 전혜진, 수지";
 *  		String[] names=s.split(",")
 *  		
 *  		//정규식
 *  		(ip) 211.238.142.181
 *  			 211.238.1.1
 *  			 211.238.142.0
 *  			 211.238.142.18
 *  		=>[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *  		[0-9]{1,3} 	====> [0-9]숫자 전체, {1,3}=>1자리부터 3자리가 있음
 *  
 *  	8) toUpperCase, toLowerCase
 *  		대문자 변환             소문자 변환
 *  		String s="Hello";
 *  		s.toUpperCase() 	=>HELLO
 *  		s.toLowerCase()		=>hello
 *  	9) replace, replaceAll==>정규식
 *  	   =======
 *  		변경=>string s="Hello Java"
 *  			s.replace('a','b')	=>"Hello Jbvb" =>a를 b로 바꿈
 *  		**replaceAll**
 *  		=	String s="113분"
 *  			s.replaceAll("[^0-9]","")==> 113 (0부터 9까지의 숫자를 제외한(괄호안의^)문자를 공백("")으로 바꿈)
 *  			s.replaceAll("^[0-9]","")==> 숫자로 시작하는 문자를 공백으로 바꿈 (13분)
 *  			s.replaceAll("[0-9]$","")==> 숫자로 끝나는 문자를 공백으로 바꿈 
 *  			s.replaceAll("[^가-힣]","") 
 *  			s.replaceAll("[^A-Za-z]","")
 *  	10)contains() : 포함된 문자를 찾는 경우
 */
import java.util.Scanner;
public class 문자열클래스 {
	static String[] autoComplate(String data)
	{
		String[] ss= {
				"자바와 JSP","자바 프로그래밍","스프링 5","Ajax와 JSP","리덕스와 리액트",
				"자바 오라클","MVC구조","코틀린과 안드로이드","코틀린 프로그램","스프링 데이터",
				"혼자 배우는 자바","지능형웹 프로그램","웹프로그래밍","자바 웹프로그램","오라클 자바"
				};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
//			if(ss[i].startsWith(data))		//=>자바로 시작하는 문자 찾기
			if(ss[i].contains(data))		//=>자바가 들어가는 문자 찾기
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String data=scan.next();
		String[] fd=autoComplate(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
				System.out.println(fd[i]);
		}
		

	}

}
