package java0321;

import java.util.Scanner;

public class Book199_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stnum=0,list,bun,close,max = 0,sum=0;
		int score[] = new int[3];
		String choice;
		Loop:
		while(true) {
			System.out.printf("선택> ");
			choice = sc.nextLine();
			switch(choice) {
			case "1":
				System.out.printf("stnum>  ");
				stnum = Integer.parseInt(sc.nextLine());
				score = new int[stnum];
				break;
			case "2":
				for(int i=0; i<score.length;i++) {
					System.out.printf("stnum "+(i+1)+">");
					score[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case "3":
				for(int i =0; i<score.length;i++) {
					System.out.println(score[i]);
				}
				break;
			case "4":
				for(int i =0; i<score.length;i++) {
					sum += score[i];
					System.out.println(sum);
					for(int j = i; j<score.length;j++) {
						max = Math.max(score[j], score[i]);
					}
				}
				double avg = (double) sum / (double) score.length;
				System.out.printf("Max: %d, Avg: %f \n",max,avg);
				break;
			case "5":
				break Loop;
			}
		}
	}
}
