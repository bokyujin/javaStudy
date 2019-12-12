//==>문자=>charAt(0)
// String s="abcdefsdlgmas"
//			 012345...

public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="gasdAaakjaaassjkfgwei";
		System.out.println("s="+s);
		
		int i=0;
		int count=0;
		while(i<s.length())	// length()는 문자의 개수, 자바는 0부터 시작하기때문에 i<=s.length()를 쓰면 안됨
		{
			System.out.println((i+1)+"번째 문자:"+s.charAt(i));
			char c=s.charAt(i);
			if(c=='a'||c=='A')
				count++;
			i++;
		}
		System.out.println("a의 개수:"+count);
				
		

	}

}
