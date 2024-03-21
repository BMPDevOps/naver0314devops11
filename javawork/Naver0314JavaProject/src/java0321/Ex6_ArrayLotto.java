package java0321;

import java.util.Scanner;

public class Ex6_ArrayLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int [] lotto=new int[6];
		int money;

		Loop:
			while(true) {
				money = Integer.parseInt(sc.nextLine());
				if(money < 1000 && money !=0) {
					System.out.println("금액이 부족합니다.");
					continue Loop;
				} else if(money == 0) {
					System.out.println("종료합니다.");
					break;
				}
				for(int i =0; i<money/1000;i++) {
					Random:
						for(int j=0; j<lotto.length ; j++) {

							int n = (int)(Math.random()*45)+1;
							lotto[j] = n;
							for(int z = 0; z<j; z++) {
								if(lotto[j] == lotto[z]) {
									j--;
									continue Random;
								}
							}
						}


					for(int j=0; j<lotto.length-1;j++) {
						for(int z = j+1;z<lotto.length;z++) {
							if(lotto[j] > lotto[z]) {
								int tmp = lotto[j];
								lotto[j] = lotto[z];
								lotto[z] = tmp;
							}
						}
					}
					System.out.print((i+1)+"회:\t");
					for(int j = 0; j<lotto.length;j++) {
						System.out.print(lotto[j]+"  ");
					}
					System.out.println();
				}
			}

	}

}
