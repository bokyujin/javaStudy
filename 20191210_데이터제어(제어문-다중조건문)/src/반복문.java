/*
 * 	�ݺ���
 * 	=================== ������ (���� �� ���ǰ˻�)
 *   = for : �ݺ� Ƚ�� ����
 *   = while : Ƚ�� ������ ���� ���
 *   	�ʱⰪ
 *   	while(���ǹ�)
 *   	{
 *   		���๮��
 *   		������
 *   	}
 *  =================== ������ (���� �� ���ǰ˻�) : �ѹ� �̻��� �ݵ�� ����
 *   = do while
 *   	�ʱⰪ
 *   	do
 *   	{
 *   		���๮��
 *   		������
 *   	} while(���ǹ�)
 */
public class �ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;		//1
//		int sum=0,sum3=0,sum5=0,sum7=0;	
//		while(i<=100)	//2
//		{
//			sum+=i;		//3
//			i++;		//4
//		}
//		// 1=>2=>3=>4 =>2=>3=>4 =>2=>3 ... (2=false=>����)
//		System.out.println("1~100������ ��:"+sum);
		
/*		while(i<=100)	
		{
			if(i%3==0)
				sum3+=i;
			if(i%5==0)
				sum5+=i;
			if(i%7==0)
				sum7+=i;
			sum+=i;		
			i++;		
		}
//		3�ǹ������,5�ǹ������,7�ǹ������(1~100)
		System.out.println("1~100������ ��:"+sum);
		System.out.println("1~100������ 3�� ����� ��:"+sum3);
		System.out.println("1~100������ 5�� ����� ��:"+sum5);
		System.out.println("1~100������ 7�� ����� ��:"+sum7); */
		
		// A���� Z���� ���
		char i='A';
		while(i<='Z')
		{
			System.out.print(i+" ");
			i++;
		}
		
		
		
	}

}
