package java0320;

import java.util.Scanner;

public class Ex9_ArraySearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String []members= {"Park","Kim","Son","Hong","Choi"};
		int count;
		String searchName;
		
		while(true) {
			count = -1;
			searchName = sc.nextLine();
			
			if(searchName.equalsIgnoreCase("q")) {
				System.out.println("Close");
				break;
			}
			
			for(int i = 0; i<members.length;i++) {
				if(members[i].equalsIgnoreCase(searchName)) {
					count = i+1;
					break;
				}
			}
			if(count == -1) {
				System.out.println("값이 없습니다.");
			} else {
				System.out.println("순서: "+count);
			}
		}
	}

}
