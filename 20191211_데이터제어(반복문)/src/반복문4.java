//100~999 ->7�ǹ���� ���� /4�ǹ���� �ƴ� ����
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=100;			//�������� 100~999
		int co7=0,co4=0;
		
		while(i<=999)
		{
			if(i%7==0)
				co7++;
			if(i%4!=0)
				co4++;
			i++;
		}
		
		System.out.println("100~999������ 7�ǹ�� ����:"+co7);
		System.out.println("100~999������ 4�ǹ���ƴ� ����:"+co4);			
		
	}

}
