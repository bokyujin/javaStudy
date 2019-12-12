//100~999 ->7의배수의 개수 /4의배수가 아닌 개수
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=100;			//루프변수 100~999
		int co7=0,co4=0;
		
		while(i<=999)
		{
			if(i%7==0)
				co7++;
			if(i%4!=0)
				co4++;
			i++;
		}
		
		System.out.println("100~999사이의 7의배수 개수:"+co7);
		System.out.println("100~999사이의 4의배수아닌 개수:"+co4);			
		
	}

}
