package java0315;
import java.util.*;


public class Ex5_Scanner {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String msg = "";
		
		System.out.println("메세지를 입력해 주세요");
		
		msg = scan.nextLine(); //한줄을 통째로 읽는다
		
		System.out.println("입력한 메세지: " + msg);
		
		int age;
		
		System.out.println("당신의 나이는");
		
		age = Integer.parseInt(scan.nextLine());
		System.out.println("나이: "+age);
				
	}

}
