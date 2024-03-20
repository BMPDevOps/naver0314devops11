package java0320;

public class Ex5_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr1;
		
		arr1 = new int[30];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
			
			System.out.println(i+" : "+arr1[i]);
		}
		
		for(int i : arr1) {
			System.out.println(i);
		}

	}

}
