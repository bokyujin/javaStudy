//==>����=>charAt(0)
// String s="abcdefsdlgmas"
//			 012345...

public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="gasdAaakjaaassjkfgwei";
		System.out.println("s="+s);
		
		int i=0;
		int count=0;
		while(i<s.length())	// length()�� ������ ����, �ڹٴ� 0���� �����ϱ⶧���� i<=s.length()�� ���� �ȵ�
		{
			System.out.println((i+1)+"��° ����:"+s.charAt(i));
			char c=s.charAt(i);
			if(c=='a'||c=='A')
				count++;
			i++;
		}
		System.out.println("a�� ����:"+count);
				
		

	}

}
