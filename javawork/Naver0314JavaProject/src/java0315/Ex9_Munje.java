package java0315;

import java.util.*;

public class Ex9_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		
		System.out.printf("만원 짜리: %d장 \n", money/10000);
		System.out.printf("천원 짜리: %d장 \n", money%10000/1000);
		System.out.printf("백원 짜리: %d장 \n", money%10000%1000/100);
		System.out.printf("십원 짜리: %d장 \n", money%10000%1000%100/10);
		System.out.printf("일원 짜리: %d장 \n", money%10000%1000%100%10/1);
		
		
	}
}
