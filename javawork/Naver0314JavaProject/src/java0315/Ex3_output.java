package java0315;

public class Ex3_output {

	public static void main(String[] args) {
		int year = 2024;
		int month = 3;
		int day = 15;
		
		String msg = "Have a Nice Day!";
		char blood = '8';
		double avg = 97.4567;
		
		System.out.println("**블력 1**");
		System.out.println(year+month+day);
		System.out.print(blood + " "); //개행 안함
		System.out.print(avg);
		
		System.out.printf("\n%.2f",avg); 
		// printf는 jdk 5에서 생김
	}
}
