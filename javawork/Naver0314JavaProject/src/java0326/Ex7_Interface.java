package java0326;

interface StudyInter{
	public void javaStudy();
	public void springBody();
}

interface PlayInter{
	public void run();
	public void game();
}

class MyStudy implements StudyInter{

	@Override
	public void javaStudy() {
		// TODO Auto-generated method stub
		System.out.println("Java studing");
	}

	@Override
	public void springBody() {
		// TODO Auto-generated method stub
		System.out.println("Spring studing");
	}
	
}

class MyPlay implements PlayInter{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("play run");
	}

	@Override
	public void game() {
		// TODO Auto-generated method stub
		System.out.println("play game");
		
	}
	
}

public class Ex7_Interface {
	
	public static void study(StudyInter s) {
		s.javaStudy();
		s.springBody();
	}
	
	public static void play(PlayInter p) {
		p.game();
		p.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		study(new MyStudy());
		play(new MyPlay());
	}

}
