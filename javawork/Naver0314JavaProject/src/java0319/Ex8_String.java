package java0319;

import java.util.StringTokenizer;

public class Ex8_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Have a Nice day";
		String str2= "apple";
		String str3= "AppLe";
			
		System.out.println(str1.charAt(7));
		System.out.println(str1.charAt(0));
		System.out.println(str1.repeat(3));
		
		
		
		String str4="a,b,c,d,e,f,g";
		
		String [] str5 = str4.split(",");
		
		System.out.println(str5.length);
		
		StringTokenizer st = new StringTokenizer(str4,",");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		String msg="   msg   ";
		System.out.println(msg.length());
		System.out.println(msg.trim().length());
		System.out.println(String.valueOf(3));
			}

}
