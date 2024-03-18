package java0318;

import java.util.Scanner;

public class Ex14_ForMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int score,count=0,sum=0;
		 		
		for(int i=1;i<=5;i++) {
			score = sc.nextInt();
			
			if(score < 1 || score >100 )
				continue;
			
			System.out.println("score "+score);
			
			count++;
			sum += score;
		}
		System.out.printf("%d %d",count,sum);
		
	}

}
