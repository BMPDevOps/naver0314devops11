package java0326;

interface InterA{
	int MAX =10;
	public void disp();
	public void study();
}

class MyInter implements InterA{
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println(MAX);
	}
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("interface stduy");
	}
	
	public void play() {
		System.out.println("game play");
	}
}

public class Ex4_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterA a = new MyInter();
		
		a.disp();
		a.study();
		
		((MyInter)a).play();

	}

}
