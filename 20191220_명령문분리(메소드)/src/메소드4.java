//1~45 => 중복없는 난수 6개 발생
/*
 * 배열 =>6개
 * for(6회)
 * {
 * 		while(중복)
 * 		{
 * 			난수발생
 * 			배열저장된 데이터와 난수 (같다)	
 * 		}
 * 		배열저장
 * }
 */
public class 메소드4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수 저장 공간
		int[] com=new int[6];
		int su=0;
		boolean bCheck=false;
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
		
		//출력
		for(int i:com)			//저장된 데이터 한개씩 읽어온다(foe-each)
		{
			System.out.print(i+" ");
		}
	}

}
