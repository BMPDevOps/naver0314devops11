package java0315;

import java.util.*;

public class EX9_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수 2개 입력");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		
		System.out.printf("더하기: %d\n",su1+su2);
		System.out.printf("빼기: %d\n",su1 - su2);
		System.out.printf("곱하기: %d\n",su1 * su2);
		System.out.printf("나누기: %.1f\n",su1 / (double) su2);
		System.out.printf("나머지: %d",su1 % su2);
	}

}
