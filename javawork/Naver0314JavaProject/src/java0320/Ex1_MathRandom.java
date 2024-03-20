package java0320;

import java.util.Random;

public class Ex1_MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i<=100; i++) {
			System.out.println((char) (Math.random()*25+65));
			
		}
		
		Random rd = new Random(1);
		
		rd.setSeed(System.currentTimeMillis());
		
		for(int i = 1; i<=100;i++) {
			System.out.println((char) (rd.nextInt(25)+97));
		}
		
	}

}
