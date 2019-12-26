
public class 메소드7 {
	static void getData2(int a)
	{
		a=100;
	}
	static void getData3(String s)
	{
		s="";
	}
	static void getData(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];		//new= 모두0값으로 발생
		for(int i:arr)
		{
			System.out.println(i);
		}
		getData(arr);						//주소 넘겨줌(배열,클래스)
		for(int i:arr)						//
		{
			System.out.println(i);			//getData 메소드에 의해 값 변함
		}
		
		int a=500;							//
		getData2(a);						//값만 넘겨줌
		System.out.println(a);				//500출력 
		
		String s="Java";					//(예외)String은 일반변수 취급함. 값만 넘겨줌
		getData3(s);
		
	}

}
