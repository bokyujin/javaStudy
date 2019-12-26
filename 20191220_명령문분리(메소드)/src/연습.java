
public class ¿¬½À {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] com=new int[6];
		for(int i=0;i<6;i++)
		{
			com[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
					i--;
			}
		}
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		

	}

}
