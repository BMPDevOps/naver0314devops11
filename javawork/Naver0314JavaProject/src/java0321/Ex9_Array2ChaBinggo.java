package java0321;

import java.util.Scanner;

public class Ex9_Array2ChaBinggo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		int binggo = 0;
		int binggo1 = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			binggo = 0;
			sum = 0;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j <arr.length;j++) {
					arr[i][j] = (int)(Math.random()*45)+1;
				}
			}
			for(int i = 0; i<arr.length;i++) {
				for(int j = 0; j<arr.length-1;j++) {
					if(arr[i][j] == arr[i][j+1]) {
						binggo++;
					}
				}
				sum += binggo/(arr.length-1);
				binggo=0;
				for(int j = 0; j<arr.length-1;j++) {
					if(arr[j][i] == arr[j+1][i]) {
						binggo++;
					}
				}
				sum += binggo/(arr.length-1);
				binggo=0;
			}

			for(int i = 0; i<arr.length-1;i++) {
				if(arr[i][i] == arr[i+1][i+1]) {
					binggo++;
				}
				if(arr[arr.length-1-i][i] == arr[arr.length-1-i-1][i+1]) {
					binggo1++;
				}
			}
			sum += binggo/(arr.length-1);
			sum += binggo1/(arr.length-1);
			binggo=0;
			binggo1=0;


			if(sum > 0) {
				System.out.println(sum);
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j <arr.length;j++) {
						System.out.printf("%4d",arr[i][j]);
					}
					System.out.println();
				}
				String str = sc.nextLine();
				if(str.equalsIgnoreCase("x")) {
					break;
				};
			}else {
				System.out.println("꽝");
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j <arr.length;j++) {
						System.out.printf("%4d",arr[i][j]);
					}
					System.out.println();
				}
			}
		}
	}

}
