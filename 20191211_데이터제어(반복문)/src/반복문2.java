// A~Z => 5개씩
//첫줄 대문자/두번째줄 소문자
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		char c='A';
		
		while(i<=26)
		{
			System.out.print(c++ +"\t");
			if(i%5==0)
				System.out.println();
			i++;			
		}
		
		System.out.println("\n짝수줄 소문자로 변경");
		i=1;
		c='A';
		boolean bCheck=true;
		
		while(i<=26)
		{
			if(bCheck==true)
				System.out.print(c+"\t");
			else
				System.out.print((char)(c+32)+"\t");
			if(i%5==0)
			{
				System.out.println();
				bCheck=!bCheck;
			}
				i++;
				c++;
			
		}
		
		

	}

}
