package java0319;

public class Ex3_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		for(int i = 1; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				if(((i*10)+j)+((j*10)+i)==121) {
					System.out.printf("%d + %d = 121 \n",(i*10+j),(j*10+i));
				}
			}
		}
	}

}
