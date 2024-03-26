package java0326;

import java.util.Date;

public class Ex14_Exception {
	
	public static void go1() throws NullPointerException, NumberFormatException{
		Date data = new Date();
		System.out.println(data.getDate());
		
		String a ="123a";
		int n = Integer.parseInt(a);
		System.out.println(n+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			go1();
		} catch(NullPointerException e) {
			System.out.println("에러: "+ e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println("애: "+ e.getMessage());
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println("종료");
	}

}
