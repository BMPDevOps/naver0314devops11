package java0318;

import java.util.Scanner;

public class Ex4_SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String color;
		
		color = sc.nextLine();
		
		switch(color) {
		case "red":
			System.out.println("빨간색");
			break;
		case "green":
			System.out.println("초록색");
			break;
		case "pink":
			System.out.println("분홍");
			break;
		default:
			System.out.println("이외 색");
		}

	}

}
