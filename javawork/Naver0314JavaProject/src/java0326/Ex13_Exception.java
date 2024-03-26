package java0326;

import java.util.Scanner;

public class Ex13_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("두 수를 입력하세요");
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();

			if(str1.equalsIgnoreCase("x") || str2.equalsIgnoreCase("x")) {
				break;
			}

			int n1 = 0;
			int n2 = 0;

			try {
				n1 = Integer.parseInt(str1);
				n2 = Integer.parseInt(str2);
				throw new IllegalArgumentException("입력 불가");
			} catch(Exception e) {
				System.out.println("에러: "+e.getMessage());
			}
			int sum = n1+n2;
			System.out.printf("%d + %d = %d\n\n",n1,n2,sum);
			
		}
	}

}
