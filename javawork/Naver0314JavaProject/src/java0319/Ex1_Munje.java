package java0319;

public class Ex1_Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		Loop:
		for(int i = 2; i<=100; i++) {
			for(int j = 2; j < i; j++) {
				if((i%j) == 0) {
					continue Loop;
				}
			}
			System.out.println(i);
			count++;
		}
		System.out.println(count);
	}
}
