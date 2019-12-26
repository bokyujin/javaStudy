
public class ¿¬½À {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[3];
		
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=1;j<i;j++)
			{
				if(com[j]==com[i])
				{
					i--;
					break;
				}
			}			
		}
		
		for(int s:com)
			System.out.println(s);
	}

}
