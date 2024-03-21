package java0321;

import java.util.Scanner;

public class Ex4_ArrayAlphaCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str;
		int []alpha=new int[26];
		int count = 0;
		
		str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			char cA=str.toUpperCase().charAt(i);
			if(cA>='A' && cA<='Z') {
				alpha[cA-'A']++;
			}
		}
		
		for(int i:alpha) {
			if(count+1%5==0) {
				System.out.println();
			}
			System.out.printf((char) (count+'A')+"\t"+i+"\t");
			count++;
		}
	}

}
