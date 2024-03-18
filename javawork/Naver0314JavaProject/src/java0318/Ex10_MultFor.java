package java0318;

import java.util.Scanner;

public class Ex10_MultFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=5;i++) {
			System.out.println("Hello");
			
			for(int j=1; j<=5; j++) {
				System.out.printf("\tKitty");
			}
			System.out.println();
		}
		
		System.out.println( );
		
//		for(int i=1;i<=5;i++) {
//			for (int j = 1; j<=5; j++) {
//				System.out.printf("%d ",i);
//				System.out.println(j);
//				
//				if(j == 2) break;
//			}
//			System.out.println();
//		}
		
		Exit:
		for(int i=1;i<=5;i++) {
			for (int j = 1; j<=5; j++) {
				System.out.printf("%d ",i);
				System.out.println(j);
				
				if(j == 2) break Exit;
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		int tot = 0;
		x = sc.nextInt();
		y = sc.nextInt();
		
		for (int i = x; i<=y; i++) {
			tot += i;
		}
		System.out.println(tot);
	}

}
