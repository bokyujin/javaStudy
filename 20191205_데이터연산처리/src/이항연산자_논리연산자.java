/*
 * 	&& => ����ó��
 * 	|| ����
 */
public class ���׿�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		char c='a';
		
		//���ĺ� ���� �� ��/�ҹ��� ����
//		String result=(c>='A'&&c<='Z')?"�빮��":"�ҹ���";
//		System.out.println(c+"��"+result);
		
		//�빮��=>�ҹ��� / �ҹ���=>�빮�� ����
		
		char result=(c>='A'&& c<='Z')?(char)(c+32):(char)(c-32);
		System.out.println(c+"��"+"\t"+result);
		
		

	}

}
