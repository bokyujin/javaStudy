/*
 * 	�ڵ� ����ȯ =>int+double=>double
 * 			 ====
 * 			 double�� ��ȯ
 * 			=>char+int=int 		(char c='A';
 * 			  ====				 c>='A' && c<='Z')
 * 			  int�� ��ȯ			 	===65     ===90  =>char�� ����� int�� ����
 * 			=>byte+byte=int (byte,short,char ����� int)
 * 	���� ����ȯ : cast������
 *  ======= down (int=>char / double=>int)
 *  			  int a=65 => char b=(char)a;
 */
public class ����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c=65;
		System.out.println(c);

	}

}
