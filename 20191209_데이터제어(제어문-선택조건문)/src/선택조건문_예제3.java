
public class 선택조건문_예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		
		//a와b를 비교해서 큰값,작은값 출력
		
		System.out.println("a:"+a+",b:"+b);
		
		if (a>b)
		{
			System.out.println("큰값은 "+a+"입니다");
			System.out.println("작은값은 "+b+"입니다");
		}
		if (a<b)
		{
			System.out.println("큰값은 "+b+"입니다");
			System.out.println("작은값은 "+a+"입니다");
		}
		if(a==b)
		{
			System.out.println("같다");
		}
				

	}

}
