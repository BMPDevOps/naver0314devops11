package java0325;

abstract class Animal{
	private String aniName;
	
	public abstract void voice();
}

class Dog extends Animal {

	@Override
	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("Dog");
	}
	
}

class Cat extends Animal {
	@Override
	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("Cat");
	}
}

public class Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dg = new Dog();
		
		dg.voice();
		
		Cat ct = new Cat();
		
		ct.voice();
		
	}

}
