package java0318;

public class Ex2_AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char는 내부적으로 int 타입으로 인식
		char a='A';
		char b='a'; // 아스키 코드로 65는 문 'A'이
		System.out.println((int) (b-a));
		
		char c='7';
		System.out.println(c);
		
		int n1 = c-'0';
		
		System.out.println(n1+2);
	}

}
