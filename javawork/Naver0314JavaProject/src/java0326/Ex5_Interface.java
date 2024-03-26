package java0326;

interface Apple{
	public void one();
}

interface Banana extends Apple{
	public void two();
}

class Orange implements Banana{
	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("one");
	}
	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("two");
	}
	
	public void three() {
		System.out.println("three");
	}
}

public class Ex5_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banana b = new Orange();
		
		b.one();
		b.two();
		((Orange)b).three();
	}

}
