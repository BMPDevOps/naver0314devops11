package java0318;

import java.util.Scanner;

public class Ex1_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		점수(score)을 입력 후 점수가
//		90 이상이면 A
//		80 이상이면 B
//		70 이상이면 C
//		60 이상이면 D
//		나머지는 F 출력
		Scanner sc = new Scanner(System.in);
		
		int score;  
		String grade;
		System.out.println("Score");	
		score = sc.nextInt();
		if ((score >= 1) & (score <= 100)) {
			grade = (score >= 90) ? "A" : (score>=80) ? "B" :
				(score>=70) ? "C" : (score>=60) ? "D" :"F";
			
			System.out.println(grade);
		} else {
			System.out.println("잘못된 점수입니다.");
			return;
		}
	}
}
