package java0320;

import java.util.Random;
import java.util.Scanner;

public class Ex3_RandomGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1부터 100 사이의 난수를 발생한후 숫자 맞추기
//		숫자 입력 시 앞에 횟수 출력
//		숫자n이 난수보다 크면 (n보다 작습니다.)
//		드디어 숫자를 맞췄을 경우 횟수와 정답을 출력 후 
//		계속 할 건지 (y or n)
		
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		
		rd.setSeed(System.currentTimeMillis());
		
		int n ,count=0;
		Exit:
		while(true) {
			n = rd.nextInt(100);
			count = 0;
			while(true) {
				int input = Integer.parseInt(sc.nextLine());
				if(n == input) {
					System.out.printf("Perfect Count: %d Continue? \n", count);
					String answer = sc.nextLine();
					if(answer.equalsIgnoreCase("y")) {
						System.out.println("restart");
						break;
					} else {
						break Exit;
					}
				} else if(n >= input) {
					System.out.println("Lower");
				} else {
					System.out.println("Upper");
				}
			}
		}
	}
}
