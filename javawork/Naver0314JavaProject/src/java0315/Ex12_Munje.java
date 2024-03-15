package java0315;

import java.util.Scanner;

public class Ex12_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 점수가 90이상이면 "참 잘했어요"
		 * 		  80이상이면 "수고했어"
		 * 		  70이상이면 "좀 더 노력하세요"
		 * 		  나머지는 "재시험입니다."
		 */
		
		int score;
		String msg;
		System.out.println("점수 입력");
		score = sc.nextInt();
		
		msg =(score>=90) ? "참 잘했어요": 
				(score>=80) ? "수고했어요": 
					(score>=70) ? "좀 더 노력하세요" : "재시험입니다.";
		
		System.out.println(msg);
		

	}

}
