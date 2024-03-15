package java0315;

public class Ex2_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a= 127;
		System.out.println(a);
		
		byte b= (byte) 200; // (형)cast 연산자: 장제로 형변환, 값 손실 발생
		System.out.println(b);// 값손실이 발생하는 경우 이상한 값이 출력되는데 (내부적으로는 2의 보수값)

		// 실수 타입
		float f1 = 123.567891234f; //f를 붙여야 4바이트 float 으로 인식
		double f2 = 123.567891234;
		
		System.out.println(f1); //정밀도가 보통 8자리까지 정확히 나온다.
		System.out.println(f2); //정밀도가 보통 15자리까지 정확히 나온다.
		
		//1글자 재저은 char, 문자열은 String(객체 타입)
		char ch1='A';
		char ch2='자'; //2바이트라 한글 한글자도 가능
		System.out.println(ch1);
		System.out.println(ch2);
		
		//문자열 지정하는 방법
		String str1 = new String("happy"); //방법1
		String str2 = "hello"; //방법2
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "나는 오늘도 자바를 공부한다.. 오늘은 즐거운 할일이 없다..";
		String str4 = "나는 오늘도 자바를 공부한다.. \n"
				+ "오늘은 즐거운 할일이 없다..";
		
		System.out.println(str3);
		System.out.println(str4);
		
		// JDK 15부터 가능 , 텍스트 블
		String str5="""
				나는 오늘도 자바를 공부한다.
				오늘은 즐거운 금요일인데 할게없다.
				""";
		System.out.println(str5);
		
	}

}
