/*
 * 5개의 난수 발생=>배열
 * 30 20 40 50 10
 * => 큰값부터 출력
 */
public class 배열10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ran[]=new int[5];
		
		for(int i=0;i<4;i++)
		{
			ran[i]=(int)(Math.random()*100)+1;
		}
		
		for(int i=0;i<5;i++)
		{
			
			for(int j=(i+1);j<5;j++)
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
