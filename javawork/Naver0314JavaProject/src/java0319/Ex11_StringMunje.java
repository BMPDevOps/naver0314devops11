package java0319;

import java.util.Scanner;

public class Ex11_StringMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String msg = sc.nextLine();
		int upper=0,lower=0,num=0;
		
		for(int i = 0; i<msg.length();i++) {
			
			char tmp = msg.charAt(i);
			if(tmp >= 'a' && tmp <= 'z') {
				lower++;
			}else if(tmp >='A' && tmp <='Z') {
				upper++;
			}else if(tmp >= '0' && tmp <='9') {
				num++;
			}
				
			
		}
		
		System.out.printf("Upper: %d, Lower: %d, Num: %d",upper,lower,num);
		
		
	}

}

