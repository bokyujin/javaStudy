/*
 *   // break : �ݺ� �ߴ��� ��
 *   	for(int i=1;i<=10;i++)
 *   	{
 *   		if(i==5)
 *   			break;
 *   		System.out.println(i);					=>1~4���� ���
 *   	}
 *  
 *   // continue : Ư�� �κ��� ������ ��
 *		for(int i=1;i<=10;i++)
 *   	{
 *   		if(i==5)
 *   			continue;	=>���⼭ ������ ������ �ٽ� ����
 *   		System.out.println(i);					=>5�� �����ϰ� ������ 1~10���� ���
 *   	}
 *   
 */
public class ���߹ݺ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=10;i++)
		 {
		  	if(i==5)
			break;
			System.out.println(i);
		 }
		System.out.println("=======continue=======");

		for(int i=1;i<=10;i++)
		 {
		  	if(i%2!=0)				//¦���� ���
			continue;
			System.out.println(i);
		 }
		
	}

}
