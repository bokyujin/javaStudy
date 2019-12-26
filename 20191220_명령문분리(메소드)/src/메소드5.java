
public class 메소드5 {
	static int[] random()
	{
		int[] com=new int[6];
		int su=0;
		boolean bCheck;
		for(int i=0;i<6;i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su=(int)(Math.random()*45)+1; 		//random=>0.0~0.99 *45 =>(int)=>0~44=>+1=>1~45
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
		}
		return com;
	}
	static void print(int[] com)
	{
		for(int i:com)			//저장된 데이터 한개씩 읽어온다(foe-each)
		{
			System.out.print(i+" ");
		}
	}
	
	static void process()
	{
		int[] rand=random();
		print(rand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
