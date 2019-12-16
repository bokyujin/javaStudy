/*
 * 	형식-순서)
 * 
 * 		for(초기값;조건문;증가식)			=>1차
 * 		{
 * 				a
 * 			for(초기값;조건식;증가식)		=>2차
 * 			{
 * 				실행문장(2차for)
 * 			}
 * 			실행문장(1차 for)
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
public class 이중반복문 {

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
