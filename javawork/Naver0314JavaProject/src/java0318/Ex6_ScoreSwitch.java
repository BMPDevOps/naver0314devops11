package java0318;

import java.util.Scanner;

public class Ex6_ScoreSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;  
		String grade;
		System.out.println("Score");	
		score = sc.nextInt();
//
//		switch(score/10) {
//		case 10:
//		case 9:
//			grade="A"; break;
//		case 8:
//			grade="B"; break;
//		case 7:
//			grade="C"; break;
//		case 6:
//			grade="D"; break;
//		default:
//			grade="F";
//		}
		
		if(score>=90) grade="A";
		else if(score>=80) grade="B";
		else if(score>=70) grade="C";
		else if(score>=60) grade="D";
		else grade="F";
		System.out.println(score+" "+grade);
	}
}
