package java0315;
import java.util.*;

public class Ex6_Scanner {

	String name (String push) {
		return push;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int kor,eng;
		String name;
		
		System.out.printf("kor: ");
		
		kor = Integer.parseInt(sc.nextLine());
				
		System.out.printf("\neng: ");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.printf("\nname: ");
		name = sc.nextLine();
		
		String answer = "이름: "+ name +"\n kor: "+ kor + ", eng: " + eng
				+ ", sum: "+ (kor+eng) + ", avg: " + ((kor+eng) / 2.0) ;
		
		System.out.println(answer);
		

	}

}
