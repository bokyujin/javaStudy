import java.util.regex.Pattern;

public class �޼ҵ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="�������� ���� ���� ���� ���! �����̹���������ͱ��� �����";
		//           0 1234567891111111
//								0123456
		//���� ����	=> ��������
		System.out.println("������ ����:"+data.length());
		//substring(0)�Ű�����1��=0���� ���峡����, substring(2,3)�Ű�����2��
		
//		String fData=data.substring(0,16);
		String fData=data.substring(0,data.indexOf("!"));		//indexOf()==ã�� ���� ��ġ
		System.out.println(fData);
		
//		String fData=data.substring(18);
		String lData=data.substring(data.indexOf("!")+1);		//�ν��Ͻ� �޼ҵ�(���������� ����) data.substring()
		System.out.println(lData.trim());
									
//		================================================================
//		���ڿ� ����
		int a=10;
		int b=20;
		double d=10.5;
		//102010.5	==>��ȣ���鶧==201912231,201912232,...
		String sss=a+""+b+""+""+d;
		System.out.println(sss);
		sss=String.valueOf(a)+String.valueOf(b)+String.valueOf(d);	//��� ���������� ���������� ��ȯ :valueOf()
		//static�޼ҵ�(Ŭ���������� ����)==String.valueOf()
		System.out.println(sss);
		
		
	}

}
