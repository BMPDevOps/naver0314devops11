package java0318;

import java.util.Scanner;

public class Ex12_Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 구구단 
		 * 11입력시 잘못된 숫자입니다. 출력
		 * 5단 
		 * 5x9
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		
		n1 = sc.nextInt();
		
		if(n1<1 || n1>9) {
			System.out.println("잘못된 숫자입니다.");
			
			return;
		}
		
		for(int i = n1; i<=9; i++) {
			for(int j = 1; j<= 9; j++) {
				System.out.println(i+" 단");
				System.out.printf("%d X %d = %d\n", i,j,i*j);
			}
			System.out.println();
		}
	}
}
