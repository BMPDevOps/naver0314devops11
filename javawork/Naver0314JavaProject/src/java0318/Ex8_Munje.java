package java0318;

import java.util.Scanner;

public class Ex8_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상품명(sang)과 수량(su), 단가(dan) 입력받은 후
		 * 총금액(total) 을 구하고 만약 수량이 5개 이상이면
		 * 10프로 할인입니다. 와 함께 할인된 금액 (dctotal) 을 출력하시오
		 * 
		 * 삼풍명
		 * 수량
		 * 단가
		 * 총금액
		 * 10프로 할인된 금액
		 */

		Scanner sc = new Scanner(System.in);
		
		String sang;
		int su,dan,total,dctotal;
		
		System.out.println("상품명, 수량, 단가 순으로 입력하시오.");
		
		sang = sc.nextLine();
		su = sc.nextInt();
		dan = sc.nextInt();
		
		total = su * dan;
		
		if(su >= 5) {
			//dctotal = total - (total*10/100);
			dctotal = (int) (total * 0.9);
			System.out.println("10% discount");
			System.out.println(dctotal);
		} else {
			System.out.println(total);
		}
		
	}

}
