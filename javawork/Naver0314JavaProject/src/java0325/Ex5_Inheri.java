package java0325;

class Parent1{
	
	public void method() {
		System.out.println("public");
	}
	
	void method1() {
		System.out.println("default");
	}
	
	protected void method2() {
		System.out.println("protected");
	}
	
	private void method3() {
		System.out.println("private");
	}
}

class Sub1 extends Parent1{
	
	public void show() {
		this.method();
		this.method1();
		this.method2();
		//this.method3();
	}
}

public class Ex5_Inheri {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sub1 sub = new Sub1();
		
		sub.show();

	}

}
