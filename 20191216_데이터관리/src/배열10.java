/*
 * 5���� ���� �߻�=>�迭
 * 30 20 40 50 10
 * => ū������ ���
 */
public class �迭10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ran[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			ran[i]=(int)(Math.random()*100)+1;
		}
		
		for(int i=0;i<4;i++)
//					=== ran.length-1
		{
			
			for(int j=(i+1);j<5;j++)
//					  =====   =ran.length
			{
				if(ran[i]<ran[j])
				{
					int temp=ran[i];
					ran[i]=ran[j];
					ran[j]=temp;
				}
			}
		}
		for(int i:ran)
		{
			System.out.println(i);
		}
		
		

	}

}
