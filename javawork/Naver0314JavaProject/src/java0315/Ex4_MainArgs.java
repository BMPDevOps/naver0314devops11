package java0315;

public class Ex4_MainArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		System.out.println(args[2]+args[3]);
		
		//문자열 -> 숫자로 변환 후 계
		//Wrapper 클래스 중 Integer 를 이용하여 변
		int s1 = Integer.parseInt(args[2]);
		int s2 = Integer.parseInt(args[3]);
		
		System.out.println(s1+s2);
	}

}
