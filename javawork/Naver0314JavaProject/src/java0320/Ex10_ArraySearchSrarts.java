package java0320;

import java.util.Scanner;

public class Ex10_ArraySearchSrarts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []members= {
				"Park","Kim","Son","Hong","Choi","Bang","Pbo","Fubao","Kang","Kong"
				};
		
		Scanner sc = new Scanner(System.in);
		
		int count;
		String searchName;
		boolean index;
		
		while(true) {
			searchName = sc.nextLine();
			index = true;
			count = 0;
			
			if(searchName.equalsIgnoreCase("close")){
				System.out.println("close");
				break;
			}
			
			for(int i = 0; i < members.length; i++ ) {
				if(members[i].toLowerCase().startsWith(searchName.toLowerCase())) {
					System.out.println("index: "+i+", name: "+ members[i]);
					index = false;
					count++;
					continue;
				} 
			}
			if(index) {
				System.out.println("String is not members");
			} 
			System.out.println("found: "+count);
		}
		
		
	}

}
