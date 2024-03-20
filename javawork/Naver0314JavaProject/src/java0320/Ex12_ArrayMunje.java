package java0320;

import java.util.Scanner;

public class Ex12_ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inwon");
		int inwon = Integer.parseInt(sc.nextLine());
		String[] name = new String[inwon];
		int[] korea = new int[inwon];
		int[] english = new int[inwon];
		int[] sum = new int[inwon];
		int[] rank = new int[inwon];
		
		for(int i = 0; i < inwon; i++) {
			System.out.println("name");
			name[i] = sc.nextLine();
			System.out.println("korea");
			korea[i] = Integer.parseInt(sc.nextLine());
			System.out.println("english");
			english[i] = Integer.parseInt(sc.nextLine());	
			sum[i] = korea[i] + english[i];
			
		}
		
		
		for(int i = 0; i < inwon; i++) {
			rank[i] += 1;
			for(int z = 0; z < inwon; z++) {
				if(sum[i] < sum[z]) {
					rank[i]++;
				}
			}
		}
		System.out.println("-".repeat(50));
		System.out.println("num\tname\tkorea\tenglish\ttotal\trank");
		for(int i =0; i < inwon; i++) {
			System.out.println((i+1)+"\t"+name[i]+"\t"+korea[i]+"\t"+english[i]+"\t"+sum[i]+"\t"+rank[i]+"\t");
		}

	}

}
