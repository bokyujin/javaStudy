/*
 * 메소드의 목적
 * ========
 *   재사용(한개의 기능),반복(호출)
 */
public class 메소드5 {
	static void star()
	{
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			star();
		}

	}

}
