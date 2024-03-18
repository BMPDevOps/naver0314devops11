package java0318;

import java.util.Scanner;

public class Ex13_ForMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int x,y,sum=1;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(int i=1; i<=y;i++) {
			
			sum *= x;
		}
		
		System.out.printf("x의 y승은 %d이다.",sum);
	}

}
