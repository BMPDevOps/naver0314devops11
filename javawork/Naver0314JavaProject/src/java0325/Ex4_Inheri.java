package java0325;


class AA{
	private static int ab;
	
	public static void setA(int a) {
		ab = a;
	}

	public int getA() {
		return ab;
	}
}

class BB extends AA {
	int a = super.getA();
}

public class Ex4_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AA.setA(20);
		
		BB b = new BB();
		
		System.out.println(b.a);
		
		
	}

}
