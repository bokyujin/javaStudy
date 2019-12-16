/*
 * 	배열(Array)
 * 	1) 같은 데이터를 여러개 모아서 한개의 변수명으로 제어
 *  2) 배열 선언시에 자동으로 연속적인 메모리를 생성
 *  				  =========
 *  				  => 시작과 끝이 일관적으로 정해져있음 
 *  				  => 0~ 배열개수-1(반복문 조절 가능)
 *  3) 단점: 고정적
 *  4) 사용처=> 관련된 데이터가 3개 이상이면 =>배열
 *  5) 사용
 *     1. 선언
 *     	   데이터형[] 배열명;		//자바 권장사항
 *     	   데이터형 배열명[];		//오류는 안나지만 주로 C언어,C++일 때
 *     	     예)
 *     		  정수
 *     		 int[] arr;		=>int arr[];
 *     		  실수
 *     		 double[] arr;	=>double arr[];
 *     		  문자
 *     		 char[] arr;	=>char arr[];
 *     		  문자열
 *     		 String[] arr;	=>String arr[];
 *     2. 초기값 설정
 *     	  변수 : int a; => a+=10;	=>Error!
 *       배열 : 
 *       	int[] arr={10,20,30,40,50}	=>자동으로 배열 개수 5개로 인식
 *       	arr(100) => ====================================
 *       				   10     20     30     40     50
 *       		   	    |======|======|======|======|=======
 *       		  	   100    104    108    112    116
 *       	
 *       	char[] arr ={'A','B','C','D','E'}
 *       	arr(100) => ====================================
 *       				   A       B      C      D      E
 *       		   	    |======|======|======|======|=======
 *       		  	   100    102    104    106    108
 *       		    	  arr[0] arr[1] arr[2] arr[3] arr[4]
 *       				  ======
 *       				     일반 변수와 동일하게 사용이 가능
 *       				    값을 변경 => arr [0]=100
 *       						   === ===
 *       						     배열명 첨자(인덱스)
 *       
 *			====> 주소를 참조해서 데이터를 관리 => 참조변수 (배열,클래스)	       
 *       
 *       	int[] arr= new int[5];
 *        	======================
 *        		new		int[5]
 *        		===		====== 정수 5개를 저장할 수 있는 공간을만들어라        
 *        		메모리 할당			(연속적인 메모리 구조를 만든다)
 *        	***new => 초기값변경됨 => 전체 0
 *        	ex) double[] arr= new double[3];	=>0.0
 *          ex) String[] arr= new double[3];	=>null(실제 존재하지 않는 값)
 *       	ex) char[] arr= new double[3];		=> '\0'
 *          ex) boolean[] arr= new double[3];	=>false
 *       
 *       
 *     3. 활용
 *     	  => 값을 변경
 *     		 첨자를 이용 => arr[1]=100, arr[4]=200...
 *     				   ====== 
 *     				   저장된 메모리의 위치 값
 *     	  => 출력 ==> 배열의 모든 첨자는 0부터 시작
 *     
 *     4. 초과하거나 줄일 수 없다 => 에러발생
 *      에러 : ArrayIndexOfBoundsException =>배열의 범위가 초과됐을 때의 에러명
 *     
 *     5. 배열의 개수 => 배열명.length
 *     	
 *  
 */
// 정수를 3개 입력받아서 입력받은 데이터를 출력
import java.util.Scanner;
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		// 변수를 처리(연산,출력)하기 전에 값 설정
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		a=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		b=scan.nextInt();
		System.out.print("세번째 정수 입력:");
		c=scan.nextInt();
		
		// 제어 => a,b,c중에 가장 큰 수 출력
		/*
		 * a=10 , b=5, c=20
		 */
		int max=0;
		if(a>max)
			max=a;	//max=10
		if(b>max)
			max=b;
		if(c>max)
			max=c;	//max=20
		
		System.out.println("가장 큰 값은:"+max);

	}

}
