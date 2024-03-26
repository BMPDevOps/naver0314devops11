package java0326;

abstract class Hello{
	public abstract void study();
}

class Fruit {
	Hello h = new Hello() {
		
		@Override
		public void study() {
			// TODO Auto-generated method stub
			System.out.println("Anonymouns");
		}
	};
	
	Happy hp = new Happy() {
		
		@Override
		public void insert() {
			// TODO Auto-generated method stub
			System.out.println("insert");
		}
		
		@Override
		public void delete() {
			// TODO Auto-generated method stub
			System.out.println("delete");
		}
	};
}

interface Happy{
	public void insert();
	public void delete();
}

class Test extends Hello implements Happy{

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("insert");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("delete");
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Anonymouns");
	}
	
}

public class Ex10_AnonyInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();
		
		f.h.study();
		
		f.hp.insert();
		f.hp.delete();
		
		Happy hpc = new Test();
		
		hpc.delete();
		hpc.insert();
		((Test)hpc).study();
	}

}
