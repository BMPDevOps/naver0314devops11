package java0326;

abstract class Animal{
//	public void sound() {
//		System.out.println("딱히 하는일이 없음");
//	}
	
	public abstract void sound();
}

class Dog extends Animal{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
}

class Chick extends Animal{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("삐약삐약!");
	}
}

public class Ex1_Abstract {
	
	public static void hello(Animal ani) {
		ani.sound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hello(new Dog());
		hello(new Chick());
		//hello(new Animal());

	}

}
