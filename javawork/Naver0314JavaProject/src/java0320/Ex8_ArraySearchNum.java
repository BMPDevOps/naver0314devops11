package java0320;

import java.util.Scanner;

public class Ex8_ArraySearchNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int []data = {15,23,12,53,123,77,88,66,77,57,36,356,895};
		
		int num,count = -1;
		
		
		while(true) {
			num = sc.nextInt();
			count = -1;
			
			if(num == 0) {
				break;
			}
			
			for(int i = 0 ; i < data.length;i++) {
				if(data[i]
						== num) {
					count = i;
					break;
				}
			}
			
			if(count == -1) {
				System.out.println("num is not data");
			}else {
				System.out.println(count);
			}

		}

	}

}
