/*
 * 	����-����)
 * 
 * 		for(�ʱⰪ;���ǹ�;������)			=>1��
 * 		{
 * 				a
 * 			for(�ʱⰪ;���ǽ�;������)		=>2��
 * 			{
 * 				���๮��(2��for)
 * 			}
 * 			���๮��(1�� for)
 * 		}
 */
/*
 *   *******
 *     ***
 *      *
 *     ***
 *   *******
 * 
 * *	   *
 * *	   *
 * * *	 * *
 * * * * * *
 * * *	 * *
 * *	   *
 * *	   *
 * 
 *    *
 *   ***
 * *******
 *   ***
 *    *
 */
public class ���߹ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			System.out.println();
		}
		
		

	}

}
