package java0326;

public class Ex12_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arg = {3,5,7,10};
		int count = 0;
		
		try {
			for (int i =0;i <= arg.length;i++) System.out.println(arg[i] + " : "+count++);
		} catch (Exception e) {
			System.out.println("testing");
		}
		
		
		

	}

}
