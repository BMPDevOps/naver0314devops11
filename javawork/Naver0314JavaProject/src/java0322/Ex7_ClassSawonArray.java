package java0322;

import java.util.Scanner;


public class Ex7_ClassSawonArray {
	
	
	public static void inputSawonArray(Sawon [] sw) {
		Scanner sc = new Scanner(System.in);
		String name;
		int gibon,sudang;
		for(int i =0; i<sw.length;i++) {
			sw[i] = new Sawon();
			name = sc.nextLine();
			gibon = Integer.parseInt(sc.nextLine());
			sudang = Integer.parseInt(sc.nextLine());
			sw[i].setSawon(name, gibon, sudang);
		}
	}
	
	public static void outputSawonArray(Sawon [] sw) {
		for(int i = 0; i<sw.length; i++) {
			System.out.println(sw[i].getName());
			System.out.println(sw[i].getGibon());
			System.out.println(sw[i].getSudang());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon [] sawon=null;
		int inwon;
		Scanner sc = new Scanner(System.in);
		
		inwon = Integer.parseInt(sc.nextLine());
		
		sawon = new Sawon[inwon];
		
		
		inputSawonArray(sawon);
		
		outputSawonArray(sawon);

	}

}
