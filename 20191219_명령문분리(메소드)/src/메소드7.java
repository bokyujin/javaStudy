
public class �޼ҵ�7 {
	static void getData2(int a)
	{
		a=100;
	}
	static void getData3(String s)
	{
		s="";
	}
	static void getData(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];		//new= ���0������ �߻�
		for(int i:arr)
		{
			System.out.println(i);
		}
		getData(arr);						//�ּ� �Ѱ���(�迭,Ŭ����)
		for(int i:arr)						//
		{
			System.out.println(i);			//getData �޼ҵ忡 ���� �� ����
		}
		
		int a=500;							//
		getData2(a);						//���� �Ѱ���
		System.out.println(a);				//500��� 
		
		String s="Java";					//(����)String�� �Ϲݺ��� �����. ���� �Ѱ���
		getData3(s);
		
	}

}
