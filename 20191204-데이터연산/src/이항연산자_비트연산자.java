/*
 *  ex) 10&6
 *  	10 => 1010(2)
 *  	6  => 0110(2) 
 *  		 ========AND(&)		
 *  		  0010(2) => 2
 *  		 ========OR(|)
 *  		  1110(2) => 14
 *  		 ========XOR(^)
 *  		  1100(@) => 12
 *  #����ǥ��
 *  1�Ǻ���.2�Ǻ���
 */
public class ���׿�����_��Ʈ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=56&17;
		int b=56|17;
		int c=56^17;
		/*
		 * 56 = 111000
		 * 17 = 010001
		 * &  = 010000 = 16
		 * |  = 111001 = 57
		 * ^  = 101001 = 41 
		 */
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
