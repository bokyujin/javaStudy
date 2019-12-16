/*
 *   // break : 반복 중단할 때
 *   	for(int i=1;i<=10;i++)
 *   	{
 *   		if(i==5)
 *   			break;
 *   		System.out.println(i);					=>1~4까지 출력
 *   	}
 *  
 *   // continue : 특정 부분을 제외할 때
 *		for(int i=1;i<=10;i++)
 *   	{
 *   		if(i==5)
 *   			continue;	=>여기서 증가한 다음에 다시 시작
 *   		System.out.println(i);					=>5를 제외하고 나머지 1~10까지 출력
 *   	}
 *   
 */
public class 이중반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=10;i++)
		 {
		  	if(i==5)
			break;
			System.out.println(i);
		 }
		System.out.println("=======continue=======");

		for(int i=1;i<=10;i++)
		 {
		  	if(i%2!=0)				//짝수만 출력
			continue;
			System.out.println(i);
		 }
		
	}

}
