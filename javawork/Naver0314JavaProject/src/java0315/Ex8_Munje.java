package java0315;
import java.util.*;

public class Ex8_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이름(name), 해드폰(hp), 태어난 년도(birthYear)
		 * 이름, 핸드폰, 태어난년도,나이(age, 2024-태어난년도)를 출력하는 프로그램을 작성하시오
		 * 선언-입력-계산-출력
		 */
		Scanner sc = new Scanner(System.in);
		
		String name, hp;
		int birthYear;
		
		System.out.println("이름: ");
		name = sc.nextLine();
		
		System.out.println("핸드폰: ");
		hp = sc.nextLine();
		
		System.out.println("태어난 년도: ");
		birthYear = Integer.parseInt(sc.nextLine());
		
		int age = 2024 - birthYear;
		
		System.out.printf("이름: %s, 핸드폰: %s, 태어난 년도: %d, 나이: %d",name,hp,birthYear,age);
		
		
	}

}
