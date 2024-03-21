package java0321;

public class Ex1_RandomJungbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand[] = new int[10];
		
		Loop:
		for(int i = 0; i<rand.length; i++)
		{
			int n = (int)(Math.random()*30)+1;
			rand[i] = n;
			
			for(int j = 0; j<i; j++) {
				if(rand[i] == rand[j]) {
					i--;
					continue Loop;
				}
			}
		}
	
		System.out.println("1~30 사이의 중복되지 않는 난수 구하기");
		for(int i =0; i<rand.length; i++) {
			System.out.printf("%4d",rand[i]);
		}
	}

}
