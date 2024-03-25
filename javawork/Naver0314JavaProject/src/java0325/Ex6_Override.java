package java0325;

class Parent2{
	public void job() {
		System.out.println("Parents job");
	}
}

class Sub2 extends Parent2{
	@Override
	public void job() {
		// TODO Auto-generated method stub
		super.job();
		System.out.println("Sub Job");
	}
}

public class Ex6_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 s = new Sub2();
		
		s.job();
		
		

	}

}
