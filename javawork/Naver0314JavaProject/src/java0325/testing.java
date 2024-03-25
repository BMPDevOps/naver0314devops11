package java0325;

class Animal2{
	
	private String name;
	
	public Animal2() {
		
	}
	
	public Animal2(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println(this.name);
	}
}

class Dog2 extends Animal2{
	
	public Dog2(String name) {
		super(name);
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}
}

class Cat2 extends Animal2{
	
	public Cat2(String name) {
		super(name);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}
}

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal2 ani = new Dog2("Dog");
		
		ani.show();
		
		ani = new Cat2("Cat");
		
		ani.show();
		
		ani = new Animal2();
		
		System.out.println(ani.getClass());
		

	}

}