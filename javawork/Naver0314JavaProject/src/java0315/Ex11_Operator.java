package java0315;

import java.util.Scanner;


public class Ex11_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상항 연산자
		// 조건?참:거짓
		// 두수를 입력하여 더 큰 수를 입력해라
		
		
		Scanner sc = new Scanner(System.in);
		int su1,su2;
		String max;
		System.out.println("숫자 입력");
		
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		
		max = (su1 > su2) ? "su1가 더 큼" : (su1 == su2) ? "su1 과 su2가 동일" : "su2가 더 큼";
		
		System.out.println(max);
	}
}
