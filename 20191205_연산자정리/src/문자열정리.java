/*
 * 		String : ���ڿ�����
 * 		======
 * 		��� : ���ڿ��и�-substring()
 * 		/����ã�� -indexOf() ,lastIndexOf()
 * 		/���ں� -equals()		//��ҹ��ڱ���
 * 			   -equalsIgnoreCase()	//��ҹ��� ���о��°��
 * 		/���鹮������-trim()  =>�¿� ���� ����(�߰� ���� ����  X)
 * 		/��ҹ��ں���-toUpperCase() , toLowerCase()
 * 		/��絥�������� ���ڿ��κ���- valueOf()
 * 		/������ ����-length()
 * 		/����-replace, replaceAll
 * 
 * 		String ==> char[]
 */
public class ���ڿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java!!";
//				  01234567891011
		System.out.println("���ڼ�:"+s.length());    //���鵵 ����
		System.out.println(s.substring(0,5));	  //5�� ����
		
		System.out.println(s.replace("l","k")); //l��k�� ����
		System.out.println(s.toUpperCase()); //�빮��
		System.out.println(s.toLowerCase()); //�ҹ���
		
//		System.out.println(s); //�����״�� ����
//		
//		System.out.println(s=s.toUpperCase());	//��������
//		System.out.println(s);
//		
		
		System.out.println(s.indexOf("l"));			// �տ������� ã��. =2
		System.out.println(s.lastIndexOf("l"));		// �ڿ������� ã��. =3
		
		String s1="Hello";
		String s2="Hello";
		
		String res=s1.equals(s2)?"����":"�ٸ���";
		System.out.println(res);
		
		
	}

}
