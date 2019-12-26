// String : ¹®ÀÚ¿­À» Á¦¾î 
/*
 *  java.lang =>import »ı·«°¡´É
 *  ¹®ÀÚ¿­À» ÀúÀåÇÏ´Â ¹æ¹ı
 *  	1) String º¯¼ö¸í="Hello Java";
 *  	2) String º¯¼ö¸í=new String("Hello Java");	//°°Àº ¹®ÀÚ¿­À» º°µµ·Î ÀúÀå
 *  				   === »õ·Î¿î ¸Ş¸ğ¸®¿¡ ÀúÀå
 *  String¿¡¼­ Á¦°øÇÏ´Â ±â´É
 *  	1) equals : ÀúÀåµÈ ¹®ÀÚ¿­ °°ÀºÁö ¿©ºÎÈ®ÀÎ (true/false)
 *  		ID,PWD =>·Î±×ÀÎ(´ë¼Ò¹®ÀÚ ±¸ºĞ)
 *  		¹®ÀÚ¿­Àº==À» »ç¿ëÇÏ¸é ¾ÈµÊ
 *  		String s="Hello";
 *  		String s1="Hello";
 *  		String s2=new String("Hello");
 *  		if(s==s1) =>true
 *  		if(s==s2) =>false
 *  		if(s.equals(s2)) =>true
 *  	   =>¿øÇü
 *  		boolean equals(String data)  		
 *  	2) substring : ¹®ÀÚ¿­À» ÀÚ¸¦¶§
 *  		String s="0123456789";
 *  		substring(3);	=>"3456789" (3¹øÂ°±ÛÀÚºÎÅÍ ¸¶Áö¸·±ÛÀÚ±îÁö)
 *  		String s="112ºĞ, 15¼¼ ÀÌ»ó °ü¶÷°¡"
 *  		substring(0,3)	=>"112"	(0¹øÂ° ±ÛÀÚºÎÅÍ 2¹øÂ° ±ÛÀÚ±îÁö)
 *  					==end-1 			   ===
 *  		//substring(int start)
 *  		//substring(int start,int end)  		
 *  	3) length : ¹®ÀÚ¿­ °³¼ö
 *  		String s="Hello È«±æµ¿"; =>9
 *  	4) trim : ÁÂ¿ìÀÇ °ø¹é¹®ÀÚ Á¦°Å
 *  		String s="Hello Java";
 *  			=>s.trim().length ==>10
 *  	5) startsWith,endsWith
 *  		startsWith("ÀÚ¹Ù")=>ÀÚ¹Ù·Î ½ÃÀÛÇÏ´Â µ¥ÀÌÅÍ Ã£±â
 *  		endsWith("ÀÚ¹Ù") =>ÀÚ¹Ù·Î ³¡³ª´Â µ¥ÀÌÅÍ Ã£±â
 *  	6) indexOf,lastIndexOf
 *  		¹®ÀÚÀÇ À§Ä¡(indexOf:¾Õ¿¡¼­/lastIndexOf:µÚ¿¡¼­)
 *  		String s="Hello Java";
 *  				  0123456789
 *  		s.indexOf('a')		==>7
 *  		s.lastIndexOf('a')	==>9	//È®ÀåÀÚ°¡Á®¿Ã ¶§=lastIndexOf(.jpg)
 *  	7) split
 *  		String s="ÀÌº´Çå, ÇÏÁ¤¿ì, ¸¶µ¿¼®, ÀüÇıÁø, ¼öÁö";
 *  		String[] names=s.split(",")
 *  		
 *  		//Á¤±Ô½Ä
 *  		(ip) 211.238.142.181
 *  			 211.238.1.1
 *  			 211.238.142.0
 *  			 211.238.142.18
 *  		=>[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *  		[0-9]{1,3} 	====> [0-9]¼ıÀÚ ÀüÃ¼, {1,3}=>1ÀÚ¸®ºÎÅÍ 3ÀÚ¸®°¡ ÀÖÀ½
 *  
 *  	8) toUpperCase, toLowerCase
 *  		´ë¹®ÀÚ º¯È¯             ¼Ò¹®ÀÚ º¯È¯
 *  		String s="Hello";
 *  		s.toUpperCase() 	=>HELLO
 *  		s.toLowerCase()		=>hello
 *  	9) replace, replaceAll==>Á¤±Ô½Ä
 *  	   =======
 *  		º¯°æ=>string s="Hello Java"
 *  			s.replace('a','b')	=>"Hello Jbvb" =>a¸¦ b·Î ¹Ù²Ş
 *  		**replaceAll**
 *  		=	String s="113ºĞ"
 *  			s.replaceAll("[^0-9]","")==> 113 (0ºÎÅÍ 9±îÁöÀÇ ¼ıÀÚ¸¦ Á¦¿ÜÇÑ(°ıÈ£¾ÈÀÇ^)¹®ÀÚ¸¦ °ø¹é("")À¸·Î ¹Ù²Ş)
 *  			s.replaceAll("^[0-9]","")==> ¼ıÀÚ·Î ½ÃÀÛÇÏ´Â ¹®ÀÚ¸¦ °ø¹éÀ¸·Î ¹Ù²Ş (13ºĞ)
 *  			s.replaceAll("[0-9]$","")==> ¼ıÀÚ·Î ³¡³ª´Â ¹®ÀÚ¸¦ °ø¹éÀ¸·Î ¹Ù²Ş 
 *  			s.replaceAll("[^°¡-ÆR]","") 
 *  			s.replaceAll("[^A-Za-z]","")
 *  	10)contains() : Æ÷ÇÔµÈ ¹®ÀÚ¸¦ Ã£´Â °æ¿ì
 */
import java.util.Scanner;
public class ¹®ÀÚ¿­Å¬·¡½º {
	static String[] autoComplate(String data)
	{
		String[] ss= {
				"ÀÚ¹Ù¿Í JSP","ÀÚ¹Ù ÇÁ·Î±×·¡¹Ö","½ºÇÁ¸µ 5","Ajax¿Í JSP","¸®´ö½º¿Í ¸®¾×Æ®",
				"ÀÚ¹Ù ¿À¶óÅ¬","MVC±¸Á¶","ÄÚÆ²¸°°ú ¾Èµå·ÎÀÌµå","ÄÚÆ²¸° ÇÁ·Î±×·¥","½ºÇÁ¸µ µ¥ÀÌÅÍ",
				"È¥ÀÚ ¹è¿ì´Â ÀÚ¹Ù","Áö´ÉÇüÀ¥ ÇÁ·Î±×·¥","À¥ÇÁ·Î±×·¡¹Ö","ÀÚ¹Ù À¥ÇÁ·Î±×·¥","¿À¶óÅ¬ ÀÚ¹Ù"
				};
		String[] findData=new String[10];
		int j=0;
		for(int i=0;i<ss.length;i++)
		{
//			if(ss[i].startsWith(data))		//=>ÀÚ¹Ù·Î ½ÃÀÛÇÏ´Â ¹®ÀÚ Ã£±â
			if(ss[i].contains(data))		//=>ÀÚ¹Ù°¡ µé¾î°¡´Â ¹®ÀÚ Ã£±â
			{
				findData[j]=ss[i];
				j++;
			}
		}
		return findData;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("°Ë»ö¾î ÀÔ·Â:");
		String data=scan.next();
		String[] fd=autoComplate(data);
		for(int i=0;i<fd.length;i++)
		{
			if(fd[i]!=null)
				System.out.println(fd[i]);
		}
		

	}

}
