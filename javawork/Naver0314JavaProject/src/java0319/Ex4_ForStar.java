package java0319;

public class Ex4_ForStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=30; i+=2) {
			for(int j = 29; j>i; j-=2) {
				if(j<=i) break;
				System.out.print(" ");
			}
			for(int z = 1; z<=i;z++) {
				System.out.printf("*");
			}
			System.out.println();
		}


	}

}
