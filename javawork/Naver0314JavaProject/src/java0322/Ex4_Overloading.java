package java0322;


class Oper{
	static public int sum(int a, int b) {
		return a+b;
	}
	static public String sum(String a, String b) {
		return a+b;
	}
	static public double sum(double a, double b) {
		return a+b;
	}
	
	static public int hap(int ...n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		
		return sum;
	}
}

public class Ex4_Overloading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Oper.sum("apple","banaan"));
		System.out.println(Oper.sum(1,2));
		System.out.println(Oper.sum(1.2,3.3));
		
		System.out.println(Oper.hap());
	}

}
