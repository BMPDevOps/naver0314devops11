package java0326;

import java.util.Scanner;

abstract class Command{
	public abstract void process(); 
}

class List extends Command{
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("데이타 목록을 출력합니다.");
	}
}

class Delete extends Command{
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("data delete");
	}
}

class Insert extends Command{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.err.println("data insert");
	}
}

class Update extends Command{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("data update");
	}
}

public class Ex3_Abstract {
	
	public static void process(Command com) {
		com.process();
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Loop:
		while(true) {
			System.out.println("Input Number");
			
			int num = Integer.parseInt(sc.nextLine());
			
			System.out.println();
			switch(num) {
			case 1:
				process(new Insert());
				break;
			case 2:
				process(new Delete());
				break;
			case 3:
				process(new Update());
				break;
			case 4:
				process(new List());
				break;
			default:
				System.out.println("Close");
				break Loop;
			}
		}

	}

}
