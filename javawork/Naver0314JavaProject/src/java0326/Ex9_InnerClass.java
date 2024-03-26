package java0326;

class OuterClass{
	int a =10;
	static int b = 20;
	
	class InnerClass{
		int c =30;
		
		static int d = 40;
		
		public void show() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
	}
	
	static class InnerClass2{
		int e =50;
		static int f =60;
		public void show2() {
			System.out.println(b);
			System.out.println(InnerClass.d);
			System.out.println(e);
			System.out.println(f);
		}
	}
	
	public void disp() {
		InnerClass ic = new InnerClass();
		InnerClass2 ic2 = new InnerClass2();
		
		ic.show();
		ic2.show2();
		
	}
}

public class Ex9_InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(OuterClass.InnerClass.d);
		
		OuterClass oc = new OuterClass();
		
		oc.disp();

	}

}
