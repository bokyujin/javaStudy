//1+(1+2)+(1+2+3)....(1+2+3+...x)��
//sum(1)+sum(1+2).....
/*
 * �Է�
 * ó��
 * ���
 * 
 */
public class �޼ҵ�1 {
	static int sum(int a)
	{
		int hap=0;
		for(int i=1;i<=a;i++)
		{
			hap+=i;
		}
		return hap;
	}
	static void process(int x)
	{
		int res=0;
		for(int i=1;i<=x;i++)
		{
			res+=sum(i);
		}
		System.out.println("res="+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(20);
	}

}
